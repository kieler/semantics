package de.cau.cs.kieler.sim.esi.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalEsiLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T10=10;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_COMMENT=9;
    public static final int T15=15;
    public static final int RULE_WS=8;
    public static final int Tokens=18;
    public static final int T16=16;
    public static final int EOF=-1;
    public static final int RULE_DIGIT=7;
    public static final int T17=17;
    public static final int RULE_LETTER=6;
    public static final int RULE_NUM=5;
    public InternalEsiLexer() {;} 
    public InternalEsiLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g"; }

    // $ANTLR start T10
    public final void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:10:5: ( '!' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:10:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:11:5: ( 'reset' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:11:7: 'reset'
            {
            match("reset"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:12:5: ( ';' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:12:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:13:5: ( '%' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:13:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:14:5: ( 'Output' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:14:7: 'Output'
            {
            match("Output"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:15:5: ( ':' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:15:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:16:5: ( ')' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:16:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:17:5: ( '(' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:17:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:749:9: ( ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT | '_' )* )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:749:11: ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:749:29: ( RULE_LETTER | RULE_DIGIT | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_NUM
    public final void mRULE_NUM() throws RecognitionException {
        try {
            int _type = RULE_NUM;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:751:10: ( ( '+' | '-' )? ( RULE_DIGIT )+ )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:751:12: ( '+' | '-' )? ( RULE_DIGIT )+
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:751:12: ( '+' | '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:751:23: ( RULE_DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:751:23: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_NUM

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:753:9: ( ( '\\t' | ' ' | '\\r' | '\\n' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:753:11: ( '\\t' | ' ' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_COMMENT
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:755:14: ( '%' ( 'A' .. 'N' | 'P' .. 'Z' ) ( options {greedy=false; } : . )* '\\n' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:755:16: '%' ( 'A' .. 'N' | 'P' .. 'Z' ) ( options {greedy=false; } : . )* '\\n'
            {
            match('%'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='N')||(input.LA(1)>='P' && input.LA(1)<='Z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:755:40: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\n') ) {
                    alt4=2;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:755:68: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\n'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_COMMENT

    // $ANTLR start RULE_DIGIT
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:757:12: ( '0' .. '9' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:757:14: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_DIGIT

    // $ANTLR start RULE_LETTER
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:759:13: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:759:15: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_LETTER

    public void mTokens() throws RecognitionException {
        // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:8: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | RULE_ID | RULE_NUM | RULE_WS | RULE_COMMENT | RULE_DIGIT | RULE_LETTER )
        int alt5=14;
        switch ( input.LA(1) ) {
        case '!':
            {
            alt5=1;
            }
            break;
        case 'r':
            {
            int LA5_2 = input.LA(2);

            if ( (LA5_2=='e') ) {
                int LA5_14 = input.LA(3);

                if ( (LA5_14=='s') ) {
                    int LA5_18 = input.LA(4);

                    if ( (LA5_18=='e') ) {
                        int LA5_20 = input.LA(5);

                        if ( (LA5_20=='t') ) {
                            int LA5_22 = input.LA(6);

                            if ( ((LA5_22>='0' && LA5_22<='9')||(LA5_22>='A' && LA5_22<='Z')||LA5_22=='_'||(LA5_22>='a' && LA5_22<='z')) ) {
                                alt5=9;
                            }
                            else {
                                alt5=2;}
                        }
                        else {
                            alt5=9;}
                    }
                    else {
                        alt5=9;}
                }
                else {
                    alt5=9;}
            }
            else {
                alt5=9;}
            }
            break;
        case ';':
            {
            alt5=3;
            }
            break;
        case '%':
            {
            int LA5_4 = input.LA(2);

            if ( ((LA5_4>='A' && LA5_4<='N')||(LA5_4>='P' && LA5_4<='Z')) ) {
                alt5=12;
            }
            else {
                alt5=4;}
            }
            break;
        case 'O':
            {
            int LA5_5 = input.LA(2);

            if ( (LA5_5=='u') ) {
                int LA5_17 = input.LA(3);

                if ( (LA5_17=='t') ) {
                    int LA5_19 = input.LA(4);

                    if ( (LA5_19=='p') ) {
                        int LA5_21 = input.LA(5);

                        if ( (LA5_21=='u') ) {
                            int LA5_23 = input.LA(6);

                            if ( (LA5_23=='t') ) {
                                int LA5_25 = input.LA(7);

                                if ( ((LA5_25>='0' && LA5_25<='9')||(LA5_25>='A' && LA5_25<='Z')||LA5_25=='_'||(LA5_25>='a' && LA5_25<='z')) ) {
                                    alt5=9;
                                }
                                else {
                                    alt5=5;}
                            }
                            else {
                                alt5=9;}
                        }
                        else {
                            alt5=9;}
                    }
                    else {
                        alt5=9;}
                }
                else {
                    alt5=9;}
            }
            else {
                alt5=9;}
            }
            break;
        case ':':
            {
            alt5=6;
            }
            break;
        case ')':
            {
            alt5=7;
            }
            break;
        case '(':
            {
            alt5=8;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=9;
            }
            break;
        case '+':
        case '-':
            {
            alt5=10;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt5=10;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt5=11;
            }
            break;
        case '_':
            {
            alt5=9;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | RULE_ID | RULE_NUM | RULE_WS | RULE_COMMENT | RULE_DIGIT | RULE_LETTER );", 5, 0, input);

            throw nvae;
        }

        switch (alt5) {
            case 1 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:42: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:50: RULE_NUM
                {
                mRULE_NUM(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:59: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:67: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:80: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/contentassist/antlr/internal/InternalEsi.g:1:91: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;

        }

    }


 

}