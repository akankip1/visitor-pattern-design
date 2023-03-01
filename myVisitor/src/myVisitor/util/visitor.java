package myVisitor.util;
import java.util.ArrayList;
public interface visitor{
public void visit(MyArrayList arr,ArrayList<String> s,ArrayList<String> s1);
public void visit(MostFrequent mostfrequent,ArrayList<String> s,ArrayList<String> s1,int k, String kmost);
public void visit(SpellCheck spellcheck,ArrayList<String> s,ArrayList<String> s1,String sentences,String words,String spell);

}
