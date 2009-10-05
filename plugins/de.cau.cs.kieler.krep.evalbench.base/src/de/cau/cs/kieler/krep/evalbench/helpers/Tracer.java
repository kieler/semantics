/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.helpers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.PushbackReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

import kiel.util.kit.lexer.Lexer;
import kiel.util.kit.lexer.LexerException;
import kiel.util.kit.node.Start;
import kiel.util.kit.parser.Parser;
import kiel.util.kit.parser.ParserException;

public class Tracer {

    /**
     * @param args
     * @throws IOException
     * @throws LexerException
     * @throws ParserException
     */
  /*  public static void main(String[] args) throws IOException, ParserException,
	    LexerException {
	if (args.length < 2) {
	    System.out.println("Tracer <kitfile> <kasmfile>");
	    System.exit(1);
	}
	Map<Integer, Collection<Integer>> line2line = trace(args[0], args[1]);
	Vector<Integer> ints = new Vector<Integer>(line2line.keySet());
	Collections.sort(ints);
	PrintWriter pw = new PrintWriter(new FileWriter(args[1] + ".map"), true);
	for (int i : ints) {
	    pw.print("KASM line " + i + " maps to kit lines: ");
	    for (int j : line2line.get(i)) {
		pw.print(j + ", ");
	    }
	    pw.println();
	}
    }*/

    public static Map<Integer, Integer> trace(String kitfile,
	    String kasmfile) throws IOException, ParserException,
	    LexerException {
	//HashMap<Integer, Integer> line2line = new HashMap<Integer, Collection<Integer>>();
	HashMap<Integer, Integer> sem2line = new HashMap<Integer, Integer>();
	BufferedReader br = new BufferedReader(new FileReader(kasmfile));
	String read = "";
	int lineNumber = 0;
	int instrNumber =0;

	String nextState = "";
	String nextTrans ="";

	HashMap<String, Integer> states = new HashMap<String, Integer>();
	//HashMap<String, Integer> trans = new HashMap<String, Integer>();
	
	//Stack<String> previous = new Stack<String>();
	//Vector<Integer> lines = new Vector<Integer>();
	PrintWriter pw = new PrintWriter(new FileWriter(kasmfile + ".trc"),
		true);
	String[] startState = {"BEGINSTARTUP", "BEGINSIMPLESTATEC", "BEGINAWAITSTATE", "SUBSTATESEND"};
	String[] execState = {"AWAIT", "GOTO", "HALT", "JOIN" };
	String[] execTrans = {"GOTO BEGINSTARTUP"};
	String[] instr = {"AWAIT", "ABORT", 
			  "EMIT", 
			  "GOTO",  
			  "HALT", 
			  "JOIN", 
			  "LOAD", 
			  "PAUSE", "PAR", "PRIO", "PRESENT", 
			  "SIGNAL",
			  "SUSPEND",
			  "WABORT"};  
	while ((read = br.readLine()) != null) {
	    read = read.toUpperCase().trim();
	    // System.out.println("line " + linenumber + ": " + read);
	    pw.println("line " + lineNumber + ": " + read);
	    if (!read.equals("")) {
		//String key = "";
	
		for (int i = 0;  i< startState.length; i++){
		    if(read.startsWith(startState[i])){
			nextState = read.substring(startState[i].length(), read.length()-1);
			nextTrans = nextState;
			break;
		    }
		}
		//if(nextState.length()>0){
		for(int i = 0; i< execState.length; i++){
		    if(read.startsWith(execState[i])){
			if(nextState.length()>0){states.put(nextState, instrNumber);}
			nextState = "";
			break;
		    }
		}
		//}
		
		for(int i = 0; i< execTrans.length; i++){
		    if(read.startsWith(execTrans[i])){
			states.put(nextTrans+ "->" + read.substring(execTrans[i].length(), read.length()), instrNumber);
			//nextState = "";
			break;
		    }
		}

		for(int i = 0; i< instr.length; i++){
		    if(read.startsWith(instr[i])){
			instrNumber++;
			break;
		    }
		}
		
		//if (read.startsWith("INPUT")) {
		//    // key = "declaration:" + read.substring(6);
		//    key = null;
		//} else if (read.startsWith("OUTPUT")) {
		    // key = "declaration:" + read.substring(7);
		//    key = null;
		//} else if (read.startsWith("SIGNAL")) {
		    // key = "declaration:" + read.substring(7);
		//    key = null;
		//} else if (read.startsWith("EMIT")) {
		    // key = "";
		//    key = null;
		//} else if (read.startsWith("BEGINSTARTUP")) {
		//    key = "state:" + read.substring(12, read.length() - 1);
		//    previous.push(key); // now in a state
		//    key = null;
		//} else if (read.startsWith("LOAD _COUNT")) {
		    // key = "";
		//    key = null;
		//} else if (read.startsWith("ABORT")
		//	|| read.startsWith("WABORT")) {
		    // key = previous.peek();
		//    key = null;
		//} else if (read.startsWith("SUSPEND")) {
		    // key = "suspension:" +
		    // read.substring(read.indexOf(',')+12);
		//    key = null;
		//} else if (read.startsWith("ENDSTARTUP")) {
		    // key = previous.peek();
		//    key = null;
		//} else if (read.startsWith("BEGINSHUTDOWN")) {
		    // key = previous.peek();
		//    key = null;
		//} else if (read.startsWith("ENDSUSPEND")) {
		    // key = previous.peek();
		//    key = null;
		//} else if (read.startsWith("ENDABORT")) {
		//    key = "transition:"
		//	    + previous.peek().substring(
		//		    previous.peek().indexOf(':') + 1)
		//	    + "-"
		//	    + read.substring(read.indexOf("_P") + 2, read
		//		    .indexOf(':')) + "->";
		 ///  previous.push(key); // now in a transition
		    // key = "";
		  //  key = null;
		//} else if (read.startsWith("PRIO")) {
		    // key = "";
		//    key = null;
		//} else if (read.startsWith("GOTO BEGINSTARTUP")) {
		    //if (previous.peek().startsWith("transition:")) {
//			key = previous.pop() + read.substring(17); // now
								   // leaving a
								   // transition
		    //} else {
			//key = "normaltermination:"
			//	+ previous.peek().substring(
			//		previous.peek().indexOf(':') + 1);
		    //}
		//} else if (read.startsWith("ENDSHUTDOWN")) {
		//    key = previous.pop(); // now exiting a state
		//    key = null;
		//} else if (read.startsWith("BEGINAWAITSTATE")) {
		//    key = "state:" + read.substring(12, read.length() - 1);
		//    // key = previous.peek();
		//    key = null;
		//} else if (read.startsWith("AWAIT")) {
		//    key = previous.peek();
		//    previous.push("transition:"
		//	    + key.substring(key.indexOf(":") + 1) + "-0->");
		//    key = null;
		//} else if (read.startsWith("ENDAWAITSTATE")) {
		    // key = previous.peek();
		//    key = null;
		//} else if (read.startsWith("BEGINCONDITIONALPSEUDOSTATE")) {
		    // key = "state:" + read.substring(27,read.length());
		  //  key = null;
		//} else if (read.startsWith("PRESENT")) {
		 //   key = "transition:"
		//	    + read.substring(read.lastIndexOf('_') + 1) + "->";
		    //previous.push(key); // now in a transition
		//    key = null;
		//} else if (read.startsWith("ENDSIGNALTEST")) {
		    // key = previous.pop();
		//    key = null;
		//} else if (read.startsWith("ENDCONDITIONALPSEUDOSTATE")) {
		    //key = previous.pop();
		//    key = null;
		//} else if (read.startsWith("HALT")) {
		    //key = previous.peek();
		//    states.put(nextState, lineNumber);
		//} else if (read.startsWith("BEGINCOMPLEXSTATE")) {
		    // key = previous.peek();
		 //   key = null;
		//} else if (read.startsWith("PAR ")) {
		    //key = "transition:"
			//    + previous.peek().substring(
			//	    previous.peek().indexOf(":") + 1)
			  ///  + "-0->"
			  //  + read.substring(read.indexOf(',') + 1,
			//	    read.lastIndexOf(",")).trim().substring(12);
		//} else if (read.startsWith("PARE")) {
		    // key = previous.peek();
		//    key = null;
		//} else if (read.startsWith("SUBSTATESEND")) {
		    // key = previous.peek();
		 //   key = null;
		//} else if (read.startsWith("JOIN")) {
		   // key = previous.peek();
		//} else if (read.startsWith("ENDCOMPLEXSTATE")) {
		    // key = previous.peek();
		 //   key = null;
		//} else if (read.startsWith("BEGINSIMPLESTATE")) {
		//    nextState = read.substring(16, read.length() - 1);
		    // key = "state:" + read.substring(16, read.length()-1);
		//    key = null;
		//} else if (read.startsWith("PAUSE")) {
		//    key = previous.peek();
		    // previous.push(key);
		//} else if (read.startsWith("GOTO SUBSTATESEND")) {
		 //   key = previous.peek();
		//} else if (read.startsWith("ENDSIMPLESTATE")) {
		    // key = previous.peek();
		//    key = null;
		//} else {
		 //   key = null;
		//    System.out.println("unrecognized item: " + read);
		//}

		/*line2line.put(lineNumber, new Vector<Integer>());
		if (key != null) {
		    lines.add(lineNumber);
		    if (!key.equals("")) {
			//if (!sem2line.containsKey(key)) {
			//    sem2line.put(key, new Vector<Integer>());
			//}
			//sem2line.get(key).addAll(lines);
			lines.clear();
			key = "";
		    }
		} else {
		    key = "";
		}*/
		//if (key != null) {
		  //  lineNumber++;
		//}
	    }

	}
	br.close();
	pw.flush();
	pw.close();

	// test
	/*
	 * System.out.println(); for (String s : sem2line.keySet()){
	 * System.out.print(s + " in lines: "); for (int i : sem2line.get(s)){
	 * System.out.print(i + ", "); } System.out.println(); }
	 * System.out.println();
	 */

	Lexer lexer = new Lexer(new PushbackReader(new FileReader(kitfile)));
	Parser parser = new Parser(lexer);
	Start ast = parser.parse();
	LineScanner ls = new LineScanner(states, sem2line);
	ast.apply(ls);
	// System.out.println();
	// System.out.println("The end.");

	return sem2line;
    }

}
