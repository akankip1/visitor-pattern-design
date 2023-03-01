package myVisitor.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class MyArrayList implements element,fileprocessorI{
ArrayList<String> MyElement = new ArrayList<String>();
/*
 * This method reads the input from file and stores all the sentences in an internal arraylist and returns the arraylist
 */ 
  public ArrayList<String> sentenceProcessor(String sentences){
    int linecount=0;
		 
		try{
		//System.out.println("try block entered");
		File files = new File(sentences);
        	FileReader fr = new FileReader(files);
        	BufferedReader read;		
		read = new BufferedReader(fr);
		String line = read.readLine();	
		
		while(line!=null)
		{//System.out.println("while entered");
		linecount++;

      
		    
        	    MyElement.add(line); //building the arraylist


      
      line = read.readLine(); 
    		}//while ends
    		read.close();
    		fr.close();
    		//System.out.println("reading line complete");
    		}//try ends
    		
    		catch (FileNotFoundException e) {
				System.out.println(" FILE Exception ocurred in function sentences, program terminated");   
				//e.printStackTrace();     
				System.exit(0);
			} //catch ends	
			 catch (Exception e) {
				System.out.println(" IO Exception ocurred in function sentences, program terminated");        
				System.exit(0);}
		
	  finally{
	//  System.out.println("Sentences processed");
	  }
	
    return MyElement;
  }
  
 /*
  * This method returns an iterator for the arraylist
  */  
  public Object getIterator(ArrayList<String> s){
  Iterator iter = s.iterator();
  Object o=null;
  while(iter.hasNext())
  {
  
  o= iter.next();
  //System.out.println(o);
  }
  return o;
  }
  
  public void accept(visitor vis,ArrayList<String> s,ArrayList<String>s1,int k,String sentences,String words ,String kmost,String spell){

	vis.visit(this,s,s1);
}
  
/*
* This method is purely for implementing the interface
*/ 
public ArrayList<String> wordProcessor(String words){
return null;
}

/*
* This method is for toString
*/ 
public String toString(){
	return null;
	
	}	




}
