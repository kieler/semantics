///******************************************************************************
// * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
// *
// * http://www.informatik.uni-kiel.de/rtsys/kieler/
// * 
// * Copyright ${year} by
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
//import org.antlr.runtime.*;
//import java.util.Stack;
//import java.util.List;
//import java.util.ArrayList;
//
//@SuppressWarnings("all")
//public class krepLexer extends Lexer {
//	public static final int NUMBER = 4;
//	public static final int WHITESPACE = 8;
//	public static final int ID = 7;
//	public static final int COMMENT = 9;
//	public static final int Digit = 6;
//	public static final int EOF = -1;
//	public static final int Letter = 5;
//
//	// delegates
//	// delegators
//
//	public krepLexer() {
//		;
//	}
//
//	public krepLexer(CharStream input) {
//		this(input, new RecognizerSharedState());
//	}
//
//	public krepLexer(CharStream input, RecognizerSharedState state) {
//		super(input, state);
//
//	}
//
//	public String getGrammarFileName() {
//		return "krep.g";
//	}
//
//	// $ANTLR start "ID"
//	public final void mID() throws RecognitionException {
//		try {
//			int _type = ID;
//			int _channel = DEFAULT_TOKEN_CHANNEL;
//			// krep.g:31:4: ( ( Letter | '_' ) ( Letter | Digit | '_' )* )
//			// krep.g:31:6: ( Letter | '_' ) ( Letter | Digit | '_' )*
//			{
//				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
//						|| input.LA(1) == '_'
//						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
//					input.consume();
//
//				} else {
//					MismatchedSetException mse = new MismatchedSetException(
//							null, input);
//					recover(mse);
//					throw mse;
//				}
//
//				// krep.g:31:21: ( Letter | Digit | '_' )*
//				loop1: do {
//					int alt1 = 2;
//					int LA1_0 = input.LA(1);
//
//					if (((LA1_0 >= '0' && LA1_0 <= '9')
//							|| (LA1_0 >= 'A' && LA1_0 <= 'Z') || LA1_0 == '_' || (LA1_0 >= 'a' && LA1_0 <= 'z'))) {
//						alt1 = 1;
//					}
//
//					switch (alt1) {
//					case 1:
//						// krep.g:
//					{
//						if ((input.LA(1) >= '0' && input.LA(1) <= '9')
//								|| (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
//								|| input.LA(1) == '_'
//								|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
//							input.consume();
//
//						} else {
//							MismatchedSetException mse = new MismatchedSetException(
//									null, input);
//							recover(mse);
//							throw mse;
//						}
//
//					}
//						break;
//
//					default:
//						break loop1;
//					}
//				} while (true);
//
//			}
//
//			state.type = _type;
//			state.channel = _channel;
//		} finally {
//		}
//	}
//
//	// $ANTLR end "ID"
//
//	// $ANTLR start "NUMBER"
//	public final void mNUMBER() throws RecognitionException {
//		try {
//			int _type = NUMBER;
//			int _channel = DEFAULT_TOKEN_CHANNEL;
//			// krep.g:33:8: ( ( '+' | '-' )? ( Digit )+ )
//			// krep.g:33:10: ( '+' | '-' )? ( Digit )+
//			{
//				// krep.g:33:10: ( '+' | '-' )?
//				int alt2 = 2;
//				int LA2_0 = input.LA(1);
//
//				if ((LA2_0 == '+' || LA2_0 == '-')) {
//					alt2 = 1;
//				}
//				switch (alt2) {
//				case 1:
//					// krep.g:
//				{
//					if (input.LA(1) == '+' || input.LA(1) == '-') {
//						input.consume();
//
//					} else {
//						MismatchedSetException mse = new MismatchedSetException(
//								null, input);
//						recover(mse);
//						throw mse;
//					}
//
//				}
//					break;
//
//				}
//
//				// krep.g:33:20: ( Digit )+
//				int cnt3 = 0;
//				loop3: do {
//					int alt3 = 2;
//					int LA3_0 = input.LA(1);
//
//					if (((LA3_0 >= '0' && LA3_0 <= '9'))) {
//						alt3 = 1;
//					}
//
//					switch (alt3) {
//					case 1:
//						// krep.g:33:21: Digit
//					{
//						mDigit();
//
//					}
//						break;
//
//					default:
//						if (cnt3 >= 1)
//							break loop3;
//						EarlyExitException eee = new EarlyExitException(3,
//								input);
//						throw eee;
//					}
//					cnt3++;
//				} while (true);
//
//			}
//
//			state.type = _type;
//			state.channel = _channel;
//		} finally {
//		}
//	}
//
//	// $ANTLR end "NUMBER"
//
//	// $ANTLR start "WHITESPACE"
//	public final void mWHITESPACE() throws RecognitionException {
//		try {
//			int _type = WHITESPACE;
//			int _channel = DEFAULT_TOKEN_CHANNEL;
//			// krep.g:35:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\ ' )+ )
//			// krep.g:35:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\ ' )+
//			{
//				// krep.g:35:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\ ' )+
//				int cnt4 = 0;
//				loop4: do {
//					int alt4 = 2;
//					int LA4_0 = input.LA(1);
//
//					if (((LA4_0 >= '\t' && LA4_0 <= '\n')
//							|| (LA4_0 >= '\f' && LA4_0 <= '\r') || LA4_0 == ' ')) {
//						alt4 = 1;
//					}
//
//					switch (alt4) {
//					case 1:
//						// krep.g:
//					{
//						if ((input.LA(1) >= '\t' && input.LA(1) <= '\n')
//								|| (input.LA(1) >= '\f' && input.LA(1) <= '\r')
//								|| input.LA(1) == ' ') {
//							input.consume();
//
//						} else {
//							MismatchedSetException mse = new MismatchedSetException(
//									null, input);
//							recover(mse);
//							throw mse;
//						}
//
//					}
//						break;
//
//					default:
//						if (cnt4 >= 1)
//							break loop4;
//						EarlyExitException eee = new EarlyExitException(4,
//								input);
//						throw eee;
//					}
//					cnt4++;
//				} while (true);
//
//				_channel = HIDDEN;
//
//			}
//
//			state.type = _type;
//			state.channel = _channel;
//		} finally {
//		}
//	}
//
//	// $ANTLR end "WHITESPACE"
//
//	// $ANTLR start "COMMENT"
//	public final void mCOMMENT() throws RecognitionException {
//		try {
//			int _type = COMMENT;
//			int _channel = DEFAULT_TOKEN_CHANNEL;
//			// krep.g:37:9: ( '#' ( options {greedy=false; } : . )* '\\n' )
//			// krep.g:37:11: '#' ( options {greedy=false; } : . )* '\\n'
//			{
//				match('#');
//				// krep.g:37:15: ( options {greedy=false; } : . )*
//				loop5: do {
//					int alt5 = 2;
//					int LA5_0 = input.LA(1);
//
//					if ((LA5_0 == '\n')) {
//						alt5 = 2;
//					} else if (((LA5_0 >= '\u0000' && LA5_0 <= '\t') || (LA5_0 >= '\u000B' && LA5_0 <= '\uFFFF'))) {
//						alt5 = 1;
//					}
//
//					switch (alt5) {
//					case 1:
//						// krep.g:37:41: .
//					{
//						matchAny();
//
//					}
//						break;
//
//					default:
//						break loop5;
//					}
//				} while (true);
//
//				match('\n');
//				_channel = HIDDEN;
//
//			}
//
//			state.type = _type;
//			state.channel = _channel;
//		} finally {
//		}
//	}
//
//	// $ANTLR end "COMMENT"
//
//	// $ANTLR start "Digit"
//	public final void mDigit() throws RecognitionException {
//		try {
//			// krep.g:39:16: ( '0' .. '9' )
//			// krep.g:39:18: '0' .. '9'
//			{
//				matchRange('0', '9');
//
//			}
//
//		} finally {
//		}
//	}
//
//	// $ANTLR end "Digit"
//
//	// $ANTLR start "Letter"
//	public final void mLetter() throws RecognitionException {
//		try {
//			// krep.g:42:2: ( 'a' .. 'z' | 'A' .. 'Z' )
//			// krep.g:
//			{
//				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
//						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
//					input.consume();
//
//				} else {
//					MismatchedSetException mse = new MismatchedSetException(
//							null, input);
//					recover(mse);
//					throw mse;
//				}
//
//			}
//
//		} finally {
//		}
//	}
//
//	// $ANTLR end "Letter"
//
//	public void mTokens() throws RecognitionException {
//		// krep.g:1:8: ( ID | NUMBER | WHITESPACE | COMMENT )
//		int alt6 = 4;
//		switch (input.LA(1)) {
//		case 'A':
//		case 'B':
//		case 'C':
//		case 'D':
//		case 'E':
//		case 'F':
//		case 'G':
//		case 'H':
//		case 'I':
//		case 'J':
//		case 'K':
//		case 'L':
//		case 'M':
//		case 'N':
//		case 'O':
//		case 'P':
//		case 'Q':
//		case 'R':
//		case 'S':
//		case 'T':
//		case 'U':
//		case 'V':
//		case 'W':
//		case 'X':
//		case 'Y':
//		case 'Z':
//		case '_':
//		case 'a':
//		case 'b':
//		case 'c':
//		case 'd':
//		case 'e':
//		case 'f':
//		case 'g':
//		case 'h':
//		case 'i':
//		case 'j':
//		case 'k':
//		case 'l':
//		case 'm':
//		case 'n':
//		case 'o':
//		case 'p':
//		case 'q':
//		case 'r':
//		case 's':
//		case 't':
//		case 'u':
//		case 'v':
//		case 'w':
//		case 'x':
//		case 'y':
//		case 'z': {
//			alt6 = 1;
//		}
//			break;
//		case '+':
//		case '-':
//		case '0':
//		case '1':
//		case '2':
//		case '3':
//		case '4':
//		case '5':
//		case '6':
//		case '7':
//		case '8':
//		case '9': {
//			alt6 = 2;
//		}
//			break;
//		case '\t':
//		case '\n':
//		case '\f':
//		case '\r':
//		case ' ': {
//			alt6 = 3;
//		}
//			break;
//		case '#': {
//			alt6 = 4;
//		}
//			break;
//		default:
//			NoViableAltException nvae = new NoViableAltException("", 6, 0,
//					input);
//
//			throw nvae;
//		}
//
//		switch (alt6) {
//		case 1:
//			// krep.g:1:10: ID
//		{
//			mID();
//
//		}
//			break;
//		case 2:
//			// krep.g:1:13: NUMBER
//		{
//			mNUMBER();
//
//		}
//			break;
//		case 3:
//			// krep.g:1:20: WHITESPACE
//		{
//			mWHITESPACE();
//
//		}
//			break;
//		case 4:
//			// krep.g:1:31: COMMENT
//		{
//			mCOMMENT();
//
//		}
//			break;
//
//		}
//
//	}
//
//}