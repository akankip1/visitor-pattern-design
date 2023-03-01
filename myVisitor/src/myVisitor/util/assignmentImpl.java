package myVisitor.util;
import java.util.ArrayList;
public class assignmentImpl implements visitor{


public void visit( MostFrequent mostfrequent){
mostfrequent.topKFrequent();
System.out.println("most frequent visited");


}


public void visit(SpellCheck spellcheck){

System.out.println("spellcheck visited");
}

public void visit(MyArrayList arr,String s,String s1){

arr.sentenceProcessor(s);

arr.wordProcessor(s1);

System.out.println("MyArrayList visited");
}
}
