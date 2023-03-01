package myVisitor.driver;
import myVisitor.util.MyArrayList;
import myVisitor.util.wProcessor;
import myVisitor.util.strategy1;
import myVisitor.util.strategy2;
import myVisitor.util.strategiesI;
import myVisitor.util.visitor;
import myVisitor.util.MostFrequent;
import myVisitor.util.SpellCheck;
import myVisitor.util.spellV;
import myVisitor.util.TopKV;
import myVisitor.util.element;
import myVisitor.util.fileprocessorI;
import java.util.ArrayList;


public class Driver{

public static void main(String[] args){
		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */

	    if (args.length != 6 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")
				|| args[3].equals("${arg3}") || args[4].equals("${arg4}")|| args[5].equals("${arg5}")) {

			System.err.println("Program terminated due to incorrect number of arguments. Program accepts 6 arguments.");
			System.exit(0);
		}
String sentences=null, words=null;
sentences=args[0];
words=args[1];
String kmost=args[3];
String spell=args[4];
int debug=Integer.parseInt(args[5]);
int k=Integer.parseInt(args[2]);

/*
 * code snippet for boundary condition for k
 */
if(k<=0){
System.err.println("invalid input for k given, program terminated...");
System.exit(0);

}

fileprocessorI obj = new MyArrayList();
fileprocessorI sp = new wProcessor();
ArrayList<String> sen=obj.sentenceProcessor(sentences);
ArrayList<String> wor=sp.wordProcessor(words);


		/*
		 * Elements are created here
		 */

element obj1 = new MostFrequent();
element obj2 = new SpellCheck();

		/*
		 * Visitors are created here
		 */

visitor vis = new TopKV();
visitor vis1 = new spellV(new strategy1(),new strategy2());


obj1.accept(vis,sen,wor,k,sentences,words,kmost,spell);
obj2.accept(vis1,sen,wor,k,sentences,words,kmost,spell);

}
public String toString(){

return null;
}





}
