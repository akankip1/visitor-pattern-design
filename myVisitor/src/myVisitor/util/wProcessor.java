package myVisitor.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
public class wProcessor implements fileprocessorI{
ArrayList<String> word = new ArrayList<String>();
/*
 * This method reads the input from file and stores all the words in an internal arraylist and returns the arraylist
 */ 
public ArrayList<String> wordProcessor(String words){
  int linecount=0;
		 
		try{
		//System.out.println("try block entered");
		File files = new File(words);
        	FileReader fr = new FileReader(files);
        	BufferedReader read;		
		read = new BufferedReader(fr);
		String line = read.readLine();	
		
		while(line!=null)
		{//System.out.println("while entered");
		linecount++;		    
        	    word.add(line); //building the arraylist      
      		line = read.readLine(); 
    		}//while ends
    		read.close();
    		fr.close();
    		//System.out.println("reading line complete");
    		}//try ends
    		
    		catch (FileNotFoundException e) {
				System.out.println(" FILE Exception ocurred in function words, program terminated");   
				//e.printStackTrace();     
				System.exit(0);
			} //catch ends	
			 catch (Exception e) {
				System.out.println(" IO Exception ocurred in function words, program terminated");        
				System.exit(0);}
		
	  finally{}
	
    return word;  
  
  }
  /*
   * This method is purely for implementing the interface
   */ 
  public ArrayList<String> sentenceProcessor(String sentences){
  return null;
  }
  
/*
* This method is for toString
*/ 
public String toString(){
	return null;}
   }//class ends
