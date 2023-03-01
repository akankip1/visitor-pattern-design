package myVisitor.util;
import java.util.ArrayList;
public class TopKV implements visitor{
fileoutput obj = new fileoutput();

/*
 * This method is used to visit top most k frequent words
 */ 
public void visit(MostFrequent mostfrequent,ArrayList<String> s,ArrayList<String> s1,int k,String kmost){
	ArrayList<String> m=mostfrequent.topKFrequent(s,k,kmost); //function call for calculation of top most k frequent words
	String[] top= new String[k];
	System.out.println("the top k frequent words in the input sent to output file");
	for (int i =0; i< m.size();i++){
	top[i]=m.get(i);
	}
	obj.printtopk(top,kmost);
}
public void visit(SpellCheck spellcheck,ArrayList<String> s,ArrayList<String> s1,String sentences,String words,String spell){}
public void visit(MyArrayList arr,ArrayList<String> s,ArrayList<String> s1){}
}
