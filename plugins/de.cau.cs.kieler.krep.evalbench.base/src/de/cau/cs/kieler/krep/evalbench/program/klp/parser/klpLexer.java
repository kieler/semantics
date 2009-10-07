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
// $ANTLR 3.1.1 klp.g 2009-08-19 09:11:45

package de.cau.cs.kieler.krep.evalbench.program.klp.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class klpLexer extends Lexer {
	public static final int T__29 = 29;
	public static final int T__28 = 28;
	public static final int T__27 = 27;
	public static final int T__26 = 26;
	public static final int T__25 = 25;
	public static final int T__24 = 24;
	public static final int T__23 = 23;
	public static final int T__22 = 22;
	public static final int T__21 = 21;
	public static final int T__20 = 20;
	public static final int ID = 4;
	public static final int EOF = -1;
	public static final int T__55 = 55;
	public static final int T__19 = 19;
	public static final int T__56 = 56;
	public static final int T__57 = 57;
	public static final int T__58 = 58;
	public static final int T__51 = 51;
	public static final int T__16 = 16;
	public static final int T__52 = 52;
	public static final int T__15 = 15;
	public static final int T__53 = 53;
	public static final int T__18 = 18;
	public static final int T__54 = 54;
	public static final int T__17 = 17;
	public static final int T__12 = 12;
	public static final int T__11 = 11;
	public static final int T__14 = 14;
	public static final int T__13 = 13;
	public static final int T__59 = 59;
	public static final int T__10 = 10;
	public static final int COMMENT = 9;
	public static final int T__50 = 50;
	public static final int T__42 = 42;
	public static final int T__43 = 43;
	public static final int T__40 = 40;
	public static final int T__41 = 41;
	public static final int T__46 = 46;
	public static final int T__47 = 47;
	public static final int T__44 = 44;
	public static final int T__45 = 45;
	public static final int T__48 = 48;
	public static final int T__49 = 49;
	public static final int NUMBER = 5;
	public static final int WHITESPACE = 8;
	public static final int Digit = 7;
	public static final int T__30 = 30;
	public static final int T__31 = 31;
	public static final int T__32 = 32;
	public static final int T__33 = 33;
	public static final int T__34 = 34;
	public static final int T__35 = 35;
	public static final int T__36 = 36;
	public static final int T__37 = 37;
	public static final int T__38 = 38;
	public static final int T__39 = 39;
	public static final int Letter = 6;

	// delegates
	// delegators

	public klpLexer() {
		;
	}

	public klpLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public klpLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);

	}

	public String getGrammarFileName() {
		return "klp.g";
	}

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:7:7: ( ':' )
			// klp.g:7:9: ':'
			{
				match(':');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:8:7: ( 'SETCLK' )
			// klp.g:8:9: 'SETCLK'
			{
				match("SETCLK");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:9:7: ( 'SETPC' )
			// klp.g:9:9: 'SETPC'
			{
				match("SETPC");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:10:7: ( 'PRIO' )
			// klp.g:10:9: 'PRIO'
			{
				match("PRIO");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:11:7: ( 'DONE' )
			// klp.g:11:9: 'DONE'
			{
				match("DONE");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:12:7: ( 'JMP' )
			// klp.g:12:9: 'JMP'
			{
				match("JMP");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:13:7: ( 'INPUT' )
			// klp.g:13:9: 'INPUT'
			{
				match("INPUT");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:14:7: ( 'OUTPUT' )
			// klp.g:14:9: 'OUTPUT'
			{
				match("OUTPUT");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:15:7: ( 'LOCAL' )
			// klp.g:15:9: 'LOCAL'
			{
				match("LOCAL");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:16:7: ( 'INITV' )
			// klp.g:16:9: 'INITV'
			{
				match("INITV");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:17:7: ( 'INITC' )
			// klp.g:17:9: 'INITC'
			{
				match("INITC");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:18:7: ( 'ADD' )
			// klp.g:18:9: 'ADD'
			{
				match("ADD");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:19:7: ( 'SUB' )
			// klp.g:19:9: 'SUB'
			{
				match("SUB");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:20:7: ( 'MUL' )
			// klp.g:20:9: 'MUL'
			{
				match("MUL");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:21:7: ( 'DIV' )
			// klp.g:21:9: 'DIV'
			{
				match("DIV");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:22:7: ( 'AND' )
			// klp.g:22:9: 'AND'
			{
				match("AND");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:23:7: ( 'OR' )
			// klp.g:23:9: 'OR'
			{
				match("OR");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:24:7: ( 'XOR' )
			// klp.g:24:9: 'XOR'
			{
				match("XOR");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:25:7: ( 'LT' )
			// klp.g:25:9: 'LT'
			{
				match("LT");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:26:7: ( 'LE' )
			// klp.g:26:9: 'LE'
			{
				match("LE");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:27:7: ( 'EQ' )
			// klp.g:27:9: 'EQ'
			{
				match("EQ");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:28:7: ( 'GE' )
			// klp.g:28:9: 'GE'
			{
				match("GE");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:29:7: ( 'GT' )
			// klp.g:29:9: 'GT'
			{
				match("GT");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:30:7: ( 'NEQ' )
			// klp.g:30:9: 'NEQ'
			{
				match("NEQ");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:31:7: ( 'IADD' )
			// klp.g:31:9: 'IADD'
			{
				match("IADD");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:32:7: ( 'ISUB' )
			// klp.g:32:9: 'ISUB'
			{
				match("ISUB");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:33:7: ( 'IMUL' )
			// klp.g:33:9: 'IMUL'
			{
				match("IMUL");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:34:7: ( 'IDIV' )
			// klp.g:34:9: 'IDIV'
			{
				match("IDIV");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:35:7: ( 'IAND' )
			// klp.g:35:9: 'IAND'
			{
				match("IAND");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:36:7: ( 'IOR' )
			// klp.g:36:9: 'IOR'
			{
				match("IOR");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:37:7: ( 'IXOR' )
			// klp.g:37:9: 'IXOR'
			{
				match("IXOR");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:38:7: ( 'ILT' )
			// klp.g:38:9: 'ILT'
			{
				match("ILT");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:39:7: ( 'ILE' )
			// klp.g:39:9: 'ILE'
			{
				match("ILE");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:40:7: ( 'IEQ' )
			// klp.g:40:9: 'IEQ'
			{
				match("IEQ");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:41:7: ( 'IGE' )
			// klp.g:41:9: 'IGE'
			{
				match("IGE");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:42:7: ( 'IGT' )
			// klp.g:42:9: 'IGT'
			{
				match("IGT");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:43:7: ( 'INEQ' )
			// klp.g:43:9: 'INEQ'
			{
				match("INEQ");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:44:7: ( 'JT' )
			// klp.g:44:9: 'JT'
			{
				match("JT");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:45:7: ( 'JF' )
			// klp.g:45:9: 'JF'
			{
				match("JF");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:46:7: ( 'JZ' )
			// klp.g:46:9: 'JZ'
			{
				match("JZ");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:47:7: ( 'JNZ' )
			// klp.g:47:9: 'JNZ'
			{
				match("JNZ");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:48:7: ( 'CVMOV' )
			// klp.g:48:9: 'CVMOV'
			{
				match("CVMOV");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:49:7: ( 'VCMOV' )
			// klp.g:49:9: 'VCMOV'
			{
				match("VCMOV");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:50:7: ( 'VVMOV' )
			// klp.g:50:9: 'VVMOV'
			{
				match("VVMOV");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:51:7: ( 'CCMOV' )
			// klp.g:51:9: 'CCMOV'
			{
				match("CCMOV");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:52:7: ( 'IVMOV' )
			// klp.g:52:9: 'IVMOV'
			{
				match("IVMOV");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:53:7: ( 'ICMOV' )
			// klp.g:53:9: 'ICMOV'
			{
				match("ICMOV");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:54:7: ( 'pre' )
			// klp.g:54:9: 'pre'
			{
				match("pre");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:55:7: ( '(' )
			// klp.g:55:9: '('
			{
				match('(');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:56:7: ( ')' )
			// klp.g:56:9: ')'
			{
				match(')');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__59"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:147:4: ( ( Letter | '_' ) ( Letter | Digit | '_' )* )
			// klp.g:147:6: ( Letter | '_' ) ( Letter | Digit | '_' )*
			{
				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
						|| input.LA(1) == '_'
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

				// klp.g:147:21: ( Letter | Digit | '_' )*
				loop1: do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if (((LA1_0 >= '0' && LA1_0 <= '9')
							|| (LA1_0 >= 'A' && LA1_0 <= 'Z') || LA1_0 == '_' || (LA1_0 >= 'a' && LA1_0 <= 'z'))) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
						// klp.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')
								|| (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
								|| input.LA(1) == '_'
								|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						break loop1;
					}
				} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "ID"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:149:8: ( ( '+' | '-' )? ( Digit )+ )
			// klp.g:149:10: ( '+' | '-' )? ( Digit )+
			{
				// klp.g:149:10: ( '+' | '-' )?
				int alt2 = 2;
				int LA2_0 = input.LA(1);

				if ((LA2_0 == '+' || LA2_0 == '-')) {
					alt2 = 1;
				}
				switch (alt2) {
				case 1:
					// klp.g:
				{
					if (input.LA(1) == '+' || input.LA(1) == '-') {
						input.consume();

					} else {
						MismatchedSetException mse = new MismatchedSetException(
								null, input);
						recover(mse);
						throw mse;
					}

				}
					break;

				}

				// klp.g:149:20: ( Digit )+
				int cnt3 = 0;
				loop3: do {
					int alt3 = 2;
					int LA3_0 = input.LA(1);

					if (((LA3_0 >= '0' && LA3_0 <= '9'))) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
						// klp.g:149:21: Digit
					{
						mDigit();

					}
						break;

					default:
						if (cnt3 >= 1)
							break loop3;
						EarlyExitException eee = new EarlyExitException(3,
								input);
						throw eee;
					}
					cnt3++;
				} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "NUMBER"

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:151:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\ ' )+ )
			// klp.g:151:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\ ' )+
			{
				// klp.g:151:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\ ' )+
				int cnt4 = 0;
				loop4: do {
					int alt4 = 2;
					int LA4_0 = input.LA(1);

					if (((LA4_0 >= '\t' && LA4_0 <= '\n')
							|| (LA4_0 >= '\f' && LA4_0 <= '\r') || LA4_0 == ' ')) {
						alt4 = 1;
					}

					switch (alt4) {
					case 1:
						// klp.g:
					{
						if ((input.LA(1) >= '\t' && input.LA(1) <= '\n')
								|| (input.LA(1) >= '\f' && input.LA(1) <= '\r')
								|| input.LA(1) == ' ') {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						if (cnt4 >= 1)
							break loop4;
						EarlyExitException eee = new EarlyExitException(4,
								input);
						throw eee;
					}
					cnt4++;
				} while (true);

				_channel = HIDDEN;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "WHITESPACE"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// klp.g:153:9: ( '#' ( options {greedy=false; } : . )* '\\n' )
			// klp.g:153:11: '#' ( options {greedy=false; } : . )* '\\n'
			{
				match('#');
				// klp.g:153:15: ( options {greedy=false; } : . )*
				loop5: do {
					int alt5 = 2;
					int LA5_0 = input.LA(1);

					if ((LA5_0 == '\n')) {
						alt5 = 2;
					} else if (((LA5_0 >= '\u0000' && LA5_0 <= '\t') || (LA5_0 >= '\u000B' && LA5_0 <= '\uFFFF'))) {
						alt5 = 1;
					}

					switch (alt5) {
					case 1:
						// klp.g:153:41: .
					{
						matchAny();

					}
						break;

					default:
						break loop5;
					}
				} while (true);

				match('\n');
				_channel = HIDDEN;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "COMMENT"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// klp.g:155:16: ( '0' .. '9' )
			// klp.g:155:18: '0' .. '9'
			{
				matchRange('0', '9');

			}

		} finally {
		}
	}

	// $ANTLR end "Digit"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// klp.g:158:2: ( 'a' .. 'z' | 'A' .. 'Z' )
			// klp.g:
			{
				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "Letter"

	public void mTokens() throws RecognitionException {
		// klp.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 |
		// T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25
		// | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 |
		// T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42
		// | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 |
		// T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59
		// | ID | NUMBER | WHITESPACE | COMMENT )
		int alt6 = 54;
		alt6 = dfa6.predict(input);
		switch (alt6) {
		case 1:
			// klp.g:1:10: T__10
		{
			mT__10();

		}
			break;
		case 2:
			// klp.g:1:16: T__11
		{
			mT__11();

		}
			break;
		case 3:
			// klp.g:1:22: T__12
		{
			mT__12();

		}
			break;
		case 4:
			// klp.g:1:28: T__13
		{
			mT__13();

		}
			break;
		case 5:
			// klp.g:1:34: T__14
		{
			mT__14();

		}
			break;
		case 6:
			// klp.g:1:40: T__15
		{
			mT__15();

		}
			break;
		case 7:
			// klp.g:1:46: T__16
		{
			mT__16();

		}
			break;
		case 8:
			// klp.g:1:52: T__17
		{
			mT__17();

		}
			break;
		case 9:
			// klp.g:1:58: T__18
		{
			mT__18();

		}
			break;
		case 10:
			// klp.g:1:64: T__19
		{
			mT__19();

		}
			break;
		case 11:
			// klp.g:1:70: T__20
		{
			mT__20();

		}
			break;
		case 12:
			// klp.g:1:76: T__21
		{
			mT__21();

		}
			break;
		case 13:
			// klp.g:1:82: T__22
		{
			mT__22();

		}
			break;
		case 14:
			// klp.g:1:88: T__23
		{
			mT__23();

		}
			break;
		case 15:
			// klp.g:1:94: T__24
		{
			mT__24();

		}
			break;
		case 16:
			// klp.g:1:100: T__25
		{
			mT__25();

		}
			break;
		case 17:
			// klp.g:1:106: T__26
		{
			mT__26();

		}
			break;
		case 18:
			// klp.g:1:112: T__27
		{
			mT__27();

		}
			break;
		case 19:
			// klp.g:1:118: T__28
		{
			mT__28();

		}
			break;
		case 20:
			// klp.g:1:124: T__29
		{
			mT__29();

		}
			break;
		case 21:
			// klp.g:1:130: T__30
		{
			mT__30();

		}
			break;
		case 22:
			// klp.g:1:136: T__31
		{
			mT__31();

		}
			break;
		case 23:
			// klp.g:1:142: T__32
		{
			mT__32();

		}
			break;
		case 24:
			// klp.g:1:148: T__33
		{
			mT__33();

		}
			break;
		case 25:
			// klp.g:1:154: T__34
		{
			mT__34();

		}
			break;
		case 26:
			// klp.g:1:160: T__35
		{
			mT__35();

		}
			break;
		case 27:
			// klp.g:1:166: T__36
		{
			mT__36();

		}
			break;
		case 28:
			// klp.g:1:172: T__37
		{
			mT__37();

		}
			break;
		case 29:
			// klp.g:1:178: T__38
		{
			mT__38();

		}
			break;
		case 30:
			// klp.g:1:184: T__39
		{
			mT__39();

		}
			break;
		case 31:
			// klp.g:1:190: T__40
		{
			mT__40();

		}
			break;
		case 32:
			// klp.g:1:196: T__41
		{
			mT__41();

		}
			break;
		case 33:
			// klp.g:1:202: T__42
		{
			mT__42();

		}
			break;
		case 34:
			// klp.g:1:208: T__43
		{
			mT__43();

		}
			break;
		case 35:
			// klp.g:1:214: T__44
		{
			mT__44();

		}
			break;
		case 36:
			// klp.g:1:220: T__45
		{
			mT__45();

		}
			break;
		case 37:
			// klp.g:1:226: T__46
		{
			mT__46();

		}
			break;
		case 38:
			// klp.g:1:232: T__47
		{
			mT__47();

		}
			break;
		case 39:
			// klp.g:1:238: T__48
		{
			mT__48();

		}
			break;
		case 40:
			// klp.g:1:244: T__49
		{
			mT__49();

		}
			break;
		case 41:
			// klp.g:1:250: T__50
		{
			mT__50();

		}
			break;
		case 42:
			// klp.g:1:256: T__51
		{
			mT__51();

		}
			break;
		case 43:
			// klp.g:1:262: T__52
		{
			mT__52();

		}
			break;
		case 44:
			// klp.g:1:268: T__53
		{
			mT__53();

		}
			break;
		case 45:
			// klp.g:1:274: T__54
		{
			mT__54();

		}
			break;
		case 46:
			// klp.g:1:280: T__55
		{
			mT__55();

		}
			break;
		case 47:
			// klp.g:1:286: T__56
		{
			mT__56();

		}
			break;
		case 48:
			// klp.g:1:292: T__57
		{
			mT__57();

		}
			break;
		case 49:
			// klp.g:1:298: T__58
		{
			mT__58();

		}
			break;
		case 50:
			// klp.g:1:304: T__59
		{
			mT__59();

		}
			break;
		case 51:
			// klp.g:1:310: ID
		{
			mID();

		}
			break;
		case 52:
			// klp.g:1:313: NUMBER
		{
			mNUMBER();

		}
			break;
		case 53:
			// klp.g:1:320: WHITESPACE
		{
			mWHITESPACE();

		}
			break;
		case 54:
			// klp.g:1:331: COMMENT
		{
			mCOMMENT();

		}
			break;

		}

	}

	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS = "\2\uffff\20\24\6\uffff\6\24\1\106\1\107\1\110\16\24\1\134\1\24\1"
			+ "\136\1\137\4\24\1\144\1\145\1\146\7\24\1\157\2\24\1\162\1\163\3"
			+ "\uffff\1\164\10\24\1\175\1\24\1\177\1\u0080\1\u0081\1\u0082\1\u0083"
			+ "\3\24\1\uffff\1\24\2\uffff\1\u0088\1\u0089\1\u008a\1\u008b\3\uffff"
			+ "\1\u008c\4\24\1\u0091\2\24\1\uffff\1\u0094\1\u0095\3\uffff\2\24"
			+ "\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\uffff\1\u009f"
			+ "\5\uffff\4\24\5\uffff\4\24\1\uffff\1\24\1\u00a9\2\uffff\1\u00aa"
			+ "\1\u00ab\1\u00ac\7\uffff\1\u00ad\1\u00ae\1\24\1\u00b0\1\u00b1\1"
			+ "\u00b2\1\u00b3\1\u00b4\1\u00b5\6\uffff\1\u00b6\7\uffff";
	static final String DFA6_eofS = "\u00b7\uffff";
	static final String DFA6_minS = "\1\11\1\uffff\1\105\1\122\1\111\1\106\1\101\1\122\1\105\1\104\1"
			+ "\125\1\117\1\121\2\105\2\103\1\162\6\uffff\1\124\1\102\1\111\1\116"
			+ "\1\126\1\120\3\60\1\132\1\105\1\104\2\125\1\111\1\122\1\117\1\105"
			+ "\1\121\1\105\2\115\1\124\1\60\1\103\2\60\2\104\1\114\1\122\3\60"
			+ "\1\121\4\115\1\145\1\103\1\60\1\117\1\105\2\60\3\uffff\1\60\1\125"
			+ "\1\124\1\121\2\104\1\102\1\114\1\126\1\60\1\122\5\60\2\117\1\120"
			+ "\1\uffff\1\101\2\uffff\4\60\3\uffff\1\60\4\117\1\60\1\114\1\103"
			+ "\1\uffff\2\60\3\uffff\1\124\1\103\6\60\1\uffff\1\60\5\uffff\2\126"
			+ "\1\125\1\114\5\uffff\4\126\1\uffff\1\113\1\60\2\uffff\3\60\7\uffff"
			+ "\2\60\1\124\6\60\6\uffff\1\60\7\uffff";
	static final String DFA6_maxS = "\1\172\1\uffff\1\125\1\122\1\117\1\132\1\130\1\125\1\124\1\116\1"
			+ "\125\1\117\1\121\1\124\1\105\2\126\1\162\6\uffff\1\124\1\102\1\111"
			+ "\1\116\1\126\1\120\3\172\1\132\1\120\1\116\2\125\1\111\1\122\1\117"
			+ "\1\124\1\121\1\124\2\115\1\124\1\172\1\103\2\172\2\104\1\114\1\122"
			+ "\3\172\1\121\4\115\1\145\1\120\1\172\1\117\1\105\2\172\3\uffff\1"
			+ "\172\1\125\1\124\1\121\2\104\1\102\1\114\1\126\1\172\1\122\5\172"
			+ "\2\117\1\120\1\uffff\1\101\2\uffff\4\172\3\uffff\1\172\4\117\1\172"
			+ "\1\114\1\103\1\uffff\2\172\3\uffff\1\124\1\126\6\172\1\uffff\1\172"
			+ "\5\uffff\2\126\1\125\1\114\5\uffff\4\126\1\uffff\1\113\1\172\2\uffff"
			+ "\3\172\7\uffff\2\172\1\124\6\172\6\uffff\1\172\7\uffff";
	static final String DFA6_acceptS = "\1\uffff\1\1\20\uffff\1\61\1\62\1\63\1\64\1\65\1\66\56\uffff\1\46"
			+ "\1\47\1\50\23\uffff\1\21\1\uffff\1\23\1\24\4\uffff\1\25\1\26\1\27"
			+ "\10\uffff\1\15\2\uffff\1\17\1\6\1\51\10\uffff\1\36\1\uffff\1\40"
			+ "\1\41\1\42\1\43\1\44\4\uffff\1\14\1\20\1\16\1\22\1\30\4\uffff\1"
			+ "\60\2\uffff\1\4\1\5\3\uffff\1\45\1\31\1\35\1\32\1\33\1\34\1\37\11"
			+ "\uffff\1\3\1\7\1\12\1\13\1\56\1\57\1\uffff\1\11\1\52\1\55\1\53\1"
			+ "\54\1\2\1\10";
	static final String DFA6_specialS = "\u00b7\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\26\1\uffff\2\26\22\uffff\1\26\2\uffff\1\27\4\uffff\1\22\1"
					+ "\23\1\uffff\1\25\1\uffff\1\25\2\uffff\12\25\1\1\6\uffff\1\11"
					+ "\1\24\1\17\1\4\1\14\1\24\1\15\1\24\1\6\1\5\1\24\1\10\1\12\1"
					+ "\16\1\7\1\3\2\24\1\2\2\24\1\20\1\24\1\13\2\24\4\uffff\1\24\1"
					+ "\uffff\17\24\1\21\12\24",
			"",
			"\1\30\17\uffff\1\31",
			"\1\32",
			"\1\34\5\uffff\1\33",
			"\1\37\6\uffff\1\35\1\41\5\uffff\1\36\5\uffff\1\40",
			"\1\43\1\uffff\1\55\1\46\1\52\1\uffff\1\53\4\uffff\1\51\1\45"
					+ "\1\42\1\47\3\uffff\1\44\2\uffff\1\54\1\uffff\1\50",
			"\1\57\2\uffff\1\56", "\1\62\11\uffff\1\60\4\uffff\1\61",
			"\1\63\11\uffff\1\64", "\1\65", "\1\66", "\1\67",
			"\1\70\16\uffff\1\71", "\1\72", "\1\74\22\uffff\1\73",
			"\1\75\22\uffff\1\76", "\1\77", "", "", "", "", "", "", "\1\100",
			"\1\101", "\1\102", "\1\103", "\1\104", "\1\105",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "\1\111",
			"\1\114\3\uffff\1\113\6\uffff\1\112", "\1\115\11\uffff\1\116",
			"\1\117", "\1\120", "\1\121", "\1\122", "\1\123",
			"\1\125\16\uffff\1\124", "\1\126", "\1\127\16\uffff\1\130",
			"\1\131", "\1\132", "\1\133",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "\1\135",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "\1\140",
			"\1\141", "\1\142", "\1\143",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "\1\147",
			"\1\150", "\1\151", "\1\152", "\1\153", "\1\154",
			"\1\155\14\uffff\1\156",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "\1\160",
			"\1\161", "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "", "", "",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "\1\165",
			"\1\166", "\1\167", "\1\170", "\1\171", "\1\172", "\1\173",
			"\1\174", "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\1\176", "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "\1\u0084",
			"\1\u0085", "\1\u0086", "", "\1\u0087", "", "",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "", "", "",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "\1\u008d",
			"\1\u008e", "\1\u008f", "\1\u0090",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "\1\u0092",
			"\1\u0093", "", "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "", "", "",
			"\1\u0096", "\1\u0098\22\uffff\1\u0097",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "", "", "", "",
			"", "\1\u00a0", "\1\u00a1", "\1\u00a2", "\1\u00a3", "", "", "", "",
			"", "\1\u00a4", "\1\u00a5", "\1\u00a6", "\1\u00a7", "", "\1\u00a8",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "", "",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "", "", "", "",
			"", "", "", "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "\1\u00af",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "", "", "", "",
			"", "", "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24", "", "",
			"", "", "", "", "" };

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}

		public String getDescription() {
			return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | ID | NUMBER | WHITESPACE | COMMENT );";
		}
	}

}