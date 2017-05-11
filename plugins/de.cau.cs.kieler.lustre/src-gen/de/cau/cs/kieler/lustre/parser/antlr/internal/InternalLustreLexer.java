package de.cau.cs.kieler.lustre.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLustreLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_STRING_CONST=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_LUSTRE_ML_COMMENT=9;
    public static final int RULE_LUSTRE_SL_COMMENT=10;
    public static final int RULE_LUSTRE_COMMENT=11;
    public static final int RULE_IDENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_BOOL=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=6;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalLustreLexer() {;} 
    public InternalLustreLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLustreLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLustre.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:11:7: ( 'end' )
            // InternalLustre.g:11:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:12:7: ( 'package' )
            // InternalLustre.g:12:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:13:7: ( 'uses' )
            // InternalLustre.g:13:9: 'uses'
            {
            match("uses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:14:7: ( 'provides' )
            // InternalLustre.g:14:9: 'provides'
            {
            match("provides"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:15:7: ( 'node' )
            // InternalLustre.g:15:9: 'node'
            {
            match("node"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:16:7: ( '(' )
            // InternalLustre.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:17:7: ( ')' )
            // InternalLustre.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:18:7: ( 'returns' )
            // InternalLustre.g:18:9: 'returns'
            {
            match("returns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:19:7: ( ';' )
            // InternalLustre.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:20:7: ( 'body' )
            // InternalLustre.g:20:9: 'body'
            {
            match("body"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:21:7: ( '::' )
            // InternalLustre.g:21:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:22:7: ( ',' )
            // InternalLustre.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:23:7: ( ':' )
            // InternalLustre.g:23:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:24:7: ( 'when' )
            // InternalLustre.g:24:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:25:7: ( 'let' )
            // InternalLustre.g:25:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:26:7: ( 'tel' )
            // InternalLustre.g:26:9: 'tel'
            {
            match("tel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:27:7: ( 'var' )
            // InternalLustre.g:27:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:28:7: ( '=' )
            // InternalLustre.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:29:7: ( '.' )
            // InternalLustre.g:29:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:30:7: ( '[' )
            // InternalLustre.g:30:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:31:7: ( ']' )
            // InternalLustre.g:31:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:32:7: ( '..' )
            // InternalLustre.g:32:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:33:7: ( 'assert' )
            // InternalLustre.g:33:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:34:7: ( 'if' )
            // InternalLustre.g:34:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:35:7: ( 'then' )
            // InternalLustre.g:35:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:36:7: ( 'else' )
            // InternalLustre.g:36:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:37:7: ( 'fby' )
            // InternalLustre.g:37:9: 'fby'
            {
            match("fby"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:38:7: ( '->' )
            // InternalLustre.g:38:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:39:7: ( 'or' )
            // InternalLustre.g:39:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:40:7: ( 'and' )
            // InternalLustre.g:40:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:41:7: ( '<>' )
            // InternalLustre.g:41:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:42:7: ( '>=' )
            // InternalLustre.g:42:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:43:7: ( '<=' )
            // InternalLustre.g:43:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:44:7: ( '>' )
            // InternalLustre.g:44:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:45:7: ( '<' )
            // InternalLustre.g:45:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:46:7: ( '+' )
            // InternalLustre.g:46:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:47:7: ( '-' )
            // InternalLustre.g:47:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:48:7: ( '*' )
            // InternalLustre.g:48:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:49:7: ( '/' )
            // InternalLustre.g:49:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:50:7: ( 'not' )
            // InternalLustre.g:50:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:51:7: ( 'pre' )
            // InternalLustre.g:51:9: 'pre'
            {
            match("pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:52:7: ( 'current' )
            // InternalLustre.g:52:9: 'current'
            {
            match("current"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:2590:11: ( ( 'true' | 'false' ) )
            // InternalLustre.g:2590:13: ( 'true' | 'false' )
            {
            // InternalLustre.g:2590:13: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalLustre.g:2590:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalLustre.g:2590:21: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:2592:12: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLustre.g:2592:14: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalLustre.g:2592:14: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLustre.g:2592:14: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLustre.g:2592:43: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLustre.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:2594:10: ( ( '0' .. '9' )+ )
            // InternalLustre.g:2594:12: ( '0' .. '9' )+
            {
            // InternalLustre.g:2594:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLustre.g:2594:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:2596:12: ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ ) )
            // InternalLustre.g:2596:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            {
            // InternalLustre.g:2596:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='.') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLustre.g:2596:15: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // InternalLustre.g:2596:15: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalLustre.g:2596:16: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    match('.'); 
                    // InternalLustre.g:2596:31: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalLustre.g:2596:32: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalLustre.g:2596:43: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalLustre.g:2596:47: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalLustre.g:2596:48: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_STRING_CONST"
    public final void mRULE_STRING_CONST() throws RecognitionException {
        try {
            int _type = RULE_STRING_CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:2598:19: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLustre.g:2598:21: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLustre.g:2598:21: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalLustre.g:2598:22: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLustre.g:2598:26: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalLustre.g:2598:27: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLustre.g:2598:72: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalLustre.g:2598:92: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLustre.g:2598:97: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalLustre.g:2598:98: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLustre.g:2598:143: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_CONST"

    // $ANTLR start "RULE_LUSTRE_COMMENT"
    public final void mRULE_LUSTRE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_LUSTRE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:2600:21: ( ( RULE_LUSTRE_ML_COMMENT | RULE_LUSTRE_SL_COMMENT ) )
            // InternalLustre.g:2600:23: ( RULE_LUSTRE_ML_COMMENT | RULE_LUSTRE_SL_COMMENT )
            {
            // InternalLustre.g:2600:23: ( RULE_LUSTRE_ML_COMMENT | RULE_LUSTRE_SL_COMMENT )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='(') ) {
                alt12=1;
            }
            else if ( (LA12_0=='-') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLustre.g:2600:24: RULE_LUSTRE_ML_COMMENT
                    {
                    mRULE_LUSTRE_ML_COMMENT(); 

                    }
                    break;
                case 2 :
                    // InternalLustre.g:2600:47: RULE_LUSTRE_SL_COMMENT
                    {
                    mRULE_LUSTRE_SL_COMMENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LUSTRE_COMMENT"

    // $ANTLR start "RULE_LUSTRE_ML_COMMENT"
    public final void mRULE_LUSTRE_ML_COMMENT() throws RecognitionException {
        try {
            // InternalLustre.g:2602:33: ( '(*' ( options {greedy=false; } : . )* '*)' )
            // InternalLustre.g:2602:35: '(*' ( options {greedy=false; } : . )* '*)'
            {
            match("(*"); 

            // InternalLustre.g:2602:40: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==')') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='(')||(LA13_1>='*' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLustre.g:2602:68: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*)"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LUSTRE_ML_COMMENT"

    // $ANTLR start "RULE_LUSTRE_SL_COMMENT"
    public final void mRULE_LUSTRE_SL_COMMENT() throws RecognitionException {
        try {
            // InternalLustre.g:2604:33: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLustre.g:2604:35: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalLustre.g:2604:40: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLustre.g:2604:40: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalLustre.g:2604:56: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLustre.g:2604:57: ( '\\r' )? '\\n'
                    {
                    // InternalLustre.g:2604:57: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalLustre.g:2604:57: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LUSTRE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLustre.g:2606:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLustre.g:2606:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLustre.g:2606:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLustre.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalLustre.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_BOOL | RULE_IDENT | RULE_INT | RULE_FLOAT | RULE_STRING_CONST | RULE_LUSTRE_COMMENT | RULE_WS )
        int alt18=49;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalLustre.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalLustre.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalLustre.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalLustre.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalLustre.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalLustre.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalLustre.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalLustre.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalLustre.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalLustre.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalLustre.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalLustre.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalLustre.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalLustre.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalLustre.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalLustre.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalLustre.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalLustre.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalLustre.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalLustre.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalLustre.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalLustre.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalLustre.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalLustre.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalLustre.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalLustre.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalLustre.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalLustre.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalLustre.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalLustre.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalLustre.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalLustre.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalLustre.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalLustre.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalLustre.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalLustre.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalLustre.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalLustre.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalLustre.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalLustre.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // InternalLustre.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // InternalLustre.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // InternalLustre.g:1:262: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 44 :
                // InternalLustre.g:1:272: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 45 :
                // InternalLustre.g:1:283: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 46 :
                // InternalLustre.g:1:292: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 47 :
                // InternalLustre.g:1:303: RULE_STRING_CONST
                {
                mRULE_STRING_CONST(); 

                }
                break;
            case 48 :
                // InternalLustre.g:1:321: RULE_LUSTRE_COMMENT
                {
                mRULE_LUSTRE_COMMENT(); 

                }
                break;
            case 49 :
                // InternalLustre.g:1:341: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\4\37\1\52\1\uffff\1\37\1\uffff\1\37\1\56\1\uffff\4\37\1\uffff\1\66\2\uffff\3\37\1\76\1\37\1\102\1\104\3\uffff\1\37\1\uffff\1\106\2\uffff\6\37\2\uffff\2\37\2\uffff\6\37\3\uffff\2\37\1\131\2\37\2\uffff\1\134\5\uffff\1\37\1\uffff\1\136\3\37\1\142\2\37\1\145\3\37\1\151\1\152\2\37\1\155\1\37\1\157\1\uffff\1\160\1\37\1\uffff\1\37\1\uffff\1\163\2\37\1\uffff\1\166\1\167\1\uffff\1\37\1\171\1\172\2\uffff\1\173\1\174\1\uffff\1\37\2\uffff\2\37\1\uffff\2\37\2\uffff\1\37\4\uffff\1\37\1\174\4\37\1\u0088\1\37\1\u008a\1\37\1\u008c\1\uffff\1\u008d\1\uffff\1\u008e\3\uffff";
    static final String DFA18_eofS =
        "\u008f\uffff";
    static final String DFA18_minS =
        "\1\11\1\154\1\141\1\163\1\157\1\52\1\uffff\1\145\1\uffff\1\157\1\72\1\uffff\1\150\2\145\1\141\1\uffff\1\56\2\uffff\1\156\1\146\1\141\1\55\1\162\2\75\3\uffff\1\165\1\uffff\1\56\2\uffff\1\144\1\163\1\143\2\145\1\144\2\uffff\1\164\1\144\2\uffff\1\145\1\164\1\154\1\145\1\165\1\162\3\uffff\1\163\1\144\1\60\1\171\1\154\2\uffff\1\60\5\uffff\1\162\1\uffff\1\60\1\145\1\153\1\166\1\60\1\163\1\145\1\60\1\165\1\171\1\156\2\60\1\156\1\145\1\60\1\145\1\60\1\uffff\1\60\1\163\1\uffff\1\162\1\uffff\1\60\1\141\1\151\1\uffff\2\60\1\uffff\1\162\2\60\2\uffff\2\60\1\uffff\1\162\2\uffff\2\145\1\uffff\1\147\1\144\2\uffff\1\156\4\uffff\1\164\1\60\1\156\2\145\1\163\1\60\1\164\1\60\1\163\1\60\1\uffff\1\60\1\uffff\1\60\3\uffff";
    static final String DFA18_maxS =
        "\1\172\1\156\1\162\1\163\1\157\1\52\1\uffff\1\145\1\uffff\1\157\1\72\1\uffff\1\150\1\145\1\162\1\141\1\uffff\1\71\2\uffff\1\163\1\146\1\142\1\76\1\162\1\76\1\75\3\uffff\1\165\1\uffff\1\71\2\uffff\1\144\1\163\1\143\1\157\1\145\1\164\2\uffff\1\164\1\144\2\uffff\1\145\1\164\1\154\1\145\1\165\1\162\3\uffff\1\163\1\144\1\172\1\171\1\154\2\uffff\1\172\5\uffff\1\162\1\uffff\1\172\1\145\1\153\1\166\1\172\1\163\1\145\1\172\1\165\1\171\1\156\2\172\1\156\1\145\1\172\1\145\1\172\1\uffff\1\172\1\163\1\uffff\1\162\1\uffff\1\172\1\141\1\151\1\uffff\2\172\1\uffff\1\162\2\172\2\uffff\2\172\1\uffff\1\162\2\uffff\2\145\1\uffff\1\147\1\144\2\uffff\1\156\4\uffff\1\164\1\172\1\156\2\145\1\163\1\172\1\164\1\172\1\163\1\172\1\uffff\1\172\1\uffff\1\172\3\uffff";
    static final String DFA18_acceptS =
        "\6\uffff\1\7\1\uffff\1\11\2\uffff\1\14\4\uffff\1\22\1\uffff\1\24\1\25\7\uffff\1\44\1\46\1\47\1\uffff\1\54\1\uffff\1\57\1\61\6\uffff\1\60\1\6\2\uffff\1\13\1\15\6\uffff\1\26\1\23\1\56\5\uffff\1\34\1\45\1\uffff\1\37\1\41\1\43\1\40\1\42\1\uffff\1\55\22\uffff\1\30\2\uffff\1\35\1\uffff\1\1\3\uffff\1\51\2\uffff\1\50\3\uffff\1\17\1\20\2\uffff\1\21\1\uffff\1\36\1\33\2\uffff\1\32\2\uffff\1\3\1\5\1\uffff\1\12\1\16\1\31\1\53\13\uffff\1\27\1\uffff\1\2\1\uffff\1\10\1\52\1\4";
    static final String DFA18_specialS =
        "\u008f\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\1\uffff\1\41\4\uffff\1\41\1\5\1\6\1\34\1\33\1\13\1\27\1\21\1\35\12\40\1\12\1\10\1\31\1\20\1\32\2\uffff\32\37\1\22\1\uffff\1\23\2\37\1\uffff\1\24\1\11\1\36\1\37\1\1\1\26\2\37\1\25\2\37\1\15\1\37\1\4\1\30\1\2\1\37\1\7\1\37\1\16\1\3\1\17\1\14\3\37",
            "\1\44\1\uffff\1\43",
            "\1\45\20\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "\1\53",
            "",
            "\1\54",
            "\1\55",
            "",
            "\1\57",
            "\1\60",
            "\1\61\2\uffff\1\62\11\uffff\1\63",
            "\1\64",
            "",
            "\1\65\1\uffff\12\67",
            "",
            "",
            "\1\71\4\uffff\1\70",
            "\1\72",
            "\1\74\1\73",
            "\1\51\20\uffff\1\75",
            "\1\77",
            "\1\101\1\100",
            "\1\103",
            "",
            "",
            "",
            "\1\105",
            "",
            "\1\67\1\uffff\12\40",
            "",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\113\11\uffff\1\112",
            "\1\114",
            "\1\115\17\uffff\1\116",
            "",
            "",
            "\1\117",
            "\1\120",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\132",
            "\1\133",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "",
            "\1\135",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\143",
            "\1\144",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\153",
            "\1\154",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\156",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\161",
            "",
            "\1\162",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\164",
            "\1\165",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\170",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\175",
            "",
            "",
            "\1\176",
            "\1\177",
            "",
            "\1\u0080",
            "\1\u0081",
            "",
            "",
            "\1\u0082",
            "",
            "",
            "",
            "",
            "\1\u0083",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0089",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u008b",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_BOOL | RULE_IDENT | RULE_INT | RULE_FLOAT | RULE_STRING_CONST | RULE_LUSTRE_COMMENT | RULE_WS );";
        }
    }
 

}