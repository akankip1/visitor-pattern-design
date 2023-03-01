package myVisitor.util;
import java.util.HashMap;
import myVisitor.util.MyArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class MostFrequent implements element{
/*
 * This method is used to calculate the top most k frequent words
 */
 
 /*
  * Top K most frequent words implementation(lines 31-36) has been referred from the source:https://github.com/cherryljr/LeetCode/blob/master/Top%20K%20Frequent%20Words.java
  * 
  */
public ArrayList<String> topKFrequent(ArrayList<String> words,int k,String kmost) {
 	ArrayList<String> topk = new ArrayList<String>();
 	String sentences = new String();
	for(int i=0;i<words.size();i++){
	sentences+=" " + words.get(i);
	} 
	sentences=sentences.replaceAll("[.]","");
	String[] senarr = sentences.split(" ", -2);        
        if (senarr == null || senarr.length == 0) {
            return topk;
        }

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : senarr) {
            map.put(s, map.getOrDefault(s, 0) + 1);}	
        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(k,(a, b) -> a.getValue() != b.getValue() ? b.getValue() - a.getValue(): a.getKey().compareTo(b.getKey()));
        for (Map.Entry<String, Integer> set : map.entrySet()) {
            maxHeap.add(set);}
	
        for(int i=k;i>0;i--) {
        
        if(maxHeap.poll().getKey()=="\n"){
        i--;
        }
            topk.add(maxHeap.poll().getKey());            
        }
       	
        
        return topk;
    }

public void accept(visitor vis,ArrayList<String> s,ArrayList<String>s1,int k,String sentences,String words,String kmost,String spell){

vis.visit(this,s,s1,k,kmost);
}
}
