package myVisitor.util;
import java.util.ArrayList;
import myVisitor.util.strategiesI;
public class spellV implements visitor{

private strategiesI st1;
private strategiesI st2;

public spellV(strategiesI st1I,strategiesI st2I){
st1=st1I;
st2=st2I;
}
/*
 * This method is used to call the spell check class for string replacement and returns void 
 */
public void visit(SpellCheck spellcheck,ArrayList<String> s,ArrayList<String> s1,String sentences, String words,String spell){
spellcheck.doStrategy(s,s1,sentences,words,st1,st2,spell);
}
public void visit(MostFrequent mostfrequent,ArrayList<String> s,ArrayList<String> s1,int k,String kmost){}

public void visit(MyArrayList arr,ArrayList<String> s,ArrayList<String> s1){}

public String toString(){
return null;
}
}
