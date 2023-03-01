package myVisitor.util;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;
public class strategy2 implements strategiesI{
fileoutput obj = new fileoutput();
/*
 * This method is used to implement strategy2 
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
 sen=sen.replaceAll("(?i)"+st.nextToken(),"@");		//not case sensitive
// System.out.println(sen);
 while(st.hasMoreTokens())
 
 { sen=sen.replaceAll("[@]",st.nextToken());		//final output sent to file
 	 //System.out.println(sen);
 	// System.out.println(st.nextToken());
 break;
     }  

}
System.out.println("changed sentences with strategy 2 are sent to file");
obj.printstrategy2(spell,sen);
}//try ends
catch (FileNotFoundException e) {
				System.out.println(" FILE Exception ocurred in function strategy2, program terminated");   
				//e.printStackTrace();     
				System.exit(0);
			} //catch ends	
			
			
			 catch (Exception e) {
				System.out.println(" IO Exception ocurred in function strategy2, program terminated");        
				System.exit(0);
				}
		
	  finally{}
}
public String toString(){
return null;
}
}
