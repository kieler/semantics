///******************************************************************************
// * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
// *
// * http://www.informatik.uni-kiel.de/rtsys/kieler/
// * 
// * Copyright 2009 by
// * + Christian-Albrechts-University of Kiel
// *   + Department of Computer Science
// *     + Real-Time and Embedded Systems Group
// * 
// * This code is provided under the terms of the Eclipse Public License (EPL).
// * See the file epl-v10.html for the license text.
// ******************************************************************************/
//// $ANTLR 3.1.1 krep.g 2008-10-13 11:53:38
//
//package de.cau.cs.kieler.krep.evalbench.program.krep.parser;
//
//import java.util.LinkedList;
//
//import org.antlr.runtime.*;
//
//import de.cau.cs.kieler.krep.evalbench.program.krep.*;
//import de.cau.cs.kieler.krep.evalbench.program.krep.Process;
//
//import java.util.Stack;
//import java.util.List;
//import java.util.ArrayList;
//
//@SuppressWarnings("all")
//public class krepParser extends Parser {
//	public static final String[] tokenNames = new String[] { "<invalid>",
//			"<EOR>", "<DOWN>", "<UP>", "NUMBER", "Letter", "Digit", "ID",
//			"WHITESPACE", "COMMENT" };
//	public static final int NUMBER = 4;
//	public static final int WHITESPACE = 8;
//	public static final int COMMENT = 9;
//	public static final int Digit = 6;
//	public static final int ID = 7;
//	public static final int EOF = -1;
//	public static final int Letter = 5;
//
//	// delegates
//	// delegators
//
//	public krepParser(TokenStream input) {
//		this(input, new RecognizerSharedState());
//	}
//
//	public krepParser(TokenStream input, RecognizerSharedState state) {
//		super(input, state);
//
//	}
//
//	public String[] getTokenNames() {
//		return krepParser.tokenNames;
//	}
//
//	public String getGrammarFileName() {
//		return "krep.g";
//	}
//
//	// $ANTLR start "prog"
//	// krep.g:19:1: prog returns [LinkedList<Process> res] : ;
//	public final LinkedList<Process> prog() throws RecognitionException {
//		LinkedList<Process> res = null;
//
//		try {
//			// krep.g:20:3: ()
//			// krep.g:20:4:
//			{
//			}
//
//		} finally {
//		}
//		return res;
//	}
//
//	// $ANTLR end "prog"
//
//	// $ANTLR start "num"
//	// krep.g:22:2: num returns [Integer v] : n= NUMBER ;
//	public final Integer num() throws RecognitionException {
//		Integer v = null;
//
//		Token n = null;
//
//		try {
//			// krep.g:23:7: (n= NUMBER )
//			// krep.g:23:9: n= NUMBER
//			{
//				n = (Token) match(input, NUMBER, FOLLOW_NUMBER_in_num59);
//				v = Integer.parseInt((n != null ? n.getText() : null));
//
//			}
//
//		} catch (RecognitionException re) {
//			reportError(re);
//			recover(input, re);
//		} finally {
//		}
//		return v;
//	}
//
//	// $ANTLR end "num"
//
//	// Delegated rules
//
//	public static final BitSet FOLLOW_NUMBER_in_num59 = new BitSet(
//			new long[] { 0x0000000000000002L });
//
//}