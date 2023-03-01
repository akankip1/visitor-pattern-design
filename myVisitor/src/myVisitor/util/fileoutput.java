package myVisitor.util;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class fileoutput{
/*
 * This method is used to write the top k-most frequent words to file 
 */
public void printtopk(String[] top,String kmost){
String f="";
f="most-freq-word: " +top[0]+"\n";
for(int i=1;i<top.length;i++){
f+=String.valueOf(i+1)+"th most-freq-word: "+top[i]+"\n";

}
try{
	
	
	File errfile = new File(kmost);
	
	FileWriter res = new FileWriter(kmost, true);
	BufferedWriter br = new BufferedWriter(res);	
	//br.write("Processed errors are as follows:\n");
	br.write(f);
	
	
	br.close();
	res.close();	
	
	
	
	}//try ends
	
	catch (Exception e) {
	String a=" IO Exception ocurred in function printtopk, program terminated";
				System.out.println(a); 
				System.exit(0);
			} //catch ends
			finally{}	
}
/*
 * This method is used to write output of strategy1 to file and returns void
 */
public void printstrategy1(String spell, String sen){
try{
	
	String ss="";
	File errfile = new File(spell);
	
	FileWriter res = new FileWriter(spell, true);
	BufferedWriter br = new BufferedWriter(res);
	sen=sen.replace(" .",".");
	//System.out.println(ss);
	//System.out.println(sen);
	br.write("British to USA conversion for Strategy 1:\n");
	br.write(sen+"\n");
	
	
	br.close();
	res.close();	
	
	
	
	}//try ends
	
	catch (Exception e) {
	String a=" IO Exception ocurred in function printStrategy1, program terminated";
				System.out.println(a); 
				System.exit(0);
			} //catch ends
			finally{}

} 
/*
 * This method is used to write output of strategy2 to file and returns void
 */
public void printstrategy2(String spell, String sen){
try{
	
	String ss="";
	File errfile = new File(spell);
	
	FileWriter res = new FileWriter(spell, true);
	BufferedWriter br = new BufferedWriter(res);
	sen=sen.replace(" .",".");
	//System.out.println(ss);
	//System.out.println(sen);
	br.write("British to USA conversion for Strategy 2:\n");
	br.write(sen+"\n");
	
	
	br.close();
	res.close();	
	
	
	
	}//try ends
	
	catch (Exception e) {
	String a=" IO Exception ocurred in function printStrategy1, program terminated";
				System.out.println(a); 
				System.exit(0);
			} //catch ends
			finally{}

} 
public String toString(){
return null;
}

}
