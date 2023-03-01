package myVisitor.util;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;
public class SpellCheck implements element{

/*
 * This method is used to call the strategies for string replacement and returns void 
 */
public void doStrategy(ArrayList<String>s,ArrayList<String>s1,String sentences,String words, strategiesI st1,strategiesI st2,String spell){

st1.strategyImpl(s,s1,sentences,words,spell);
st2.strategyImpl(s,s1,sentences,words,spell);
}

public void accept(visitor vis,ArrayList<String> s,ArrayList<String>s1,int k,String sentences,String words,String kmost,String spell ){
vis.visit(this,s,s1,sentences,words,spell);
}
public String toString(){
return null;
}
}
