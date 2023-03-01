package myVisitor.util;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;
public class strategy1 implements strategiesI{
fileoutput obj = new fileoutput();
/*
 * This method is used to implement the strategy for string replacement and returns void 
 */
public void strategyImpl(ArrayList<String>s,ArrayList<String>s1,String sentences,String words,String spell){

 	String sen = new String();
	for(int i=0;i<s.size();i++){
	sen+=" " + s.get(i);
	} 
	sen=sen.replaceAll("[.]"," .");
try{
BufferedReader br = new BufferedReader(new FileReader(words));
 String strLine = "";
 StringTokenizer st = null;
  while( (strLine = br.readLine()) != null){
  st = new StringTokenizer(strLine, ":");
 sen=sen.replaceAll(st.nextToken(),"@");

 while(st.hasMoreTokens())
 
 { sen=sen.replaceAll("[@]",st.nextToken());		//final output sent to file
 	 break;
     }  

}
System.out.println("changed sentences with strategy 1 are sent to file");
obj.printstrategy1(spell,sen);
}//try ends
catch (FileNotFoundException e) {
				System.out.println(" FILE Exception ocurred in function strategy1, program terminated");				  
				System.exit(0);
			} //catch ends	
			
			
			 catch (Exception e) {
				System.out.println(" IO Exception ocurred in function strategy1, program terminated");        
				System.exit(0);
				}
		
	  finally{}
}

public String toString(){
return null;
}
}
