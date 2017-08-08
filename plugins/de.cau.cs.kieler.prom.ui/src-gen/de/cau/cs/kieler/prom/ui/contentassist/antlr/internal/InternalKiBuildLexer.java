package de.cau.cs.kieler.prom.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKiBuildLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=5;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_SL_COMMENT_ANNOTATION=12;
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
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NUMBER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalKiBuildLexer() {;} 
    public InternalKiBuildLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKiBuildLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKiBuild.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiBuild.g:11:7: ( 'pre' )
            // InternalKiBuild.g:11:9: 'pre'
            {
            match("pre"); 


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
            // InternalKiBuild.g:12:7: ( '|' )
            // InternalKiBuild.g:12:9: '|'
            {
            match('|'); 

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
            // InternalKiBuild.g:13:7: ( '&' )
            // InternalKiBuild.g:13:9: '&'
            {
            match('&'); 

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
            // InternalKiBuild.g:14:7: ( '!' )
            // InternalKiBuild.g:14:9: '!'
            {
            match('!'); 

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
            // InternalKiBuild.g:15:7: ( '+' )
            // InternalKiBuild.g:15:9: '+'
            {
            match('+'); 

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
            // InternalKiBuild.g:16:7: ( '-' )
            // InternalKiBuild.g:16:9: '-'
            {
            match('-'); 

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
            // InternalKiBuild.g:17:7: ( '*' )
            // InternalKiBuild.g:17:9: '*'
            {
            match('*'); 

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
            // InternalKiBuild.g:18:7: ( '%' )
            // InternalKiBuild.g:18:9: '%'
            {
            match('%'); 

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
            // InternalKiBuild.g:19:7: ( '/' )
            // InternalKiBuild.g:19:9: '/'
            {
            match('/'); 

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
            // InternalKiBuild.g:20:7: ( 'val' )
            // InternalKiBuild.g:20:9: 'val'
            {
            match("val"); 


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
            // InternalKiBuild.g:21:7: ( '||' )
            // InternalKiBuild.g:21:9: '||'
            {
            match("||"); 


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
            // InternalKiBuild.g:22:7: ( '&&' )
            // InternalKiBuild.g:22:9: '&&'
            {
            match("&&"); 


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
            // InternalKiBuild.g:23:7: ( '()' )
            // InternalKiBuild.g:23:9: '()'
            {
            match("()"); 


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
            // InternalKiBuild.g:24:7: ( '.' )
            // InternalKiBuild.g:24:9: '.'
            {
            match('.'); 

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
            // InternalKiBuild.g:25:7: ( '==' )
            // InternalKiBuild.g:25:9: '=='
            {
            match("=="); 


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
            // InternalKiBuild.g:26:7: ( '<' )
            // InternalKiBuild.g:26:9: '<'
            {
            match('<'); 

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
            // InternalKiBuild.g:27:7: ( '<=' )
            // InternalKiBuild.g:27:9: '<='
            {
            match("<="); 


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
            // InternalKiBuild.g:28:7: ( '>' )
            // InternalKiBuild.g:28:9: '>'
            {
            match('>'); 

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
            // InternalKiBuild.g:29:7: ( '>=' )
            // InternalKiBuild.g:29:9: '>='
            {
            match(">="); 


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
            // InternalKiBuild.g:30:7: ( '!=' )
            // InternalKiBuild.g:30:9: '!='
            {
            match("!="); 


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
            // InternalKiBuild.g:31:7: ( 'model' )
            // InternalKiBuild.g:31:9: 'model'
            {
            match("model"); 


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
            // InternalKiBuild.g:32:7: ( 'compiler' )
            // InternalKiBuild.g:32:9: 'compiler'
            {
            match("compiler"); 


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
            // InternalKiBuild.g:33:7: ( '{' )
            // InternalKiBuild.g:33:9: '{'
            {
            match('{'); 

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
            // InternalKiBuild.g:34:7: ( '}' )
            // InternalKiBuild.g:34:9: '}'
            {
            match('}'); 

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
            // InternalKiBuild.g:35:7: ( 'simulation' )
            // InternalKiBuild.g:35:9: 'simulation'
            {
            match("simulation"); 


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
            // InternalKiBuild.g:36:7: ( 'process' )
            // InternalKiBuild.g:36:9: 'process'
            {
            match("process"); 


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
            // InternalKiBuild.g:37:7: ( 'template' )
            // InternalKiBuild.g:37:9: 'template'
            {
            match("template"); 


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
            // InternalKiBuild.g:38:7: ( 'wrapper' )
            // InternalKiBuild.g:38:9: 'wrapper'
            {
            match("wrapper"); 


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
            // InternalKiBuild.g:39:7: ( ':' )
            // InternalKiBuild.g:39:9: ':'
            {
            match(':'); 

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
            // InternalKiBuild.g:40:7: ( ',' )
            // InternalKiBuild.g:40:9: ','
            {
            match(','); 

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
            // InternalKiBuild.g:41:7: ( 'schedule' )
            // InternalKiBuild.g:41:9: 'schedule'
            {
            match("schedule"); 


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
            // InternalKiBuild.g:42:7: ( '(' )
            // InternalKiBuild.g:42:9: '('
            {
            match('('); 

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
            // InternalKiBuild.g:43:7: ( ')' )
            // InternalKiBuild.g:43:9: ')'
            {
            match(')'); 

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
            // InternalKiBuild.g:44:7: ( '\\'' )
            // InternalKiBuild.g:44:9: '\\''
            {
            match('\''); 

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
            // InternalKiBuild.g:45:7: ( '[' )
            // InternalKiBuild.g:45:9: '['
            {
            match('['); 

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
            // InternalKiBuild.g:46:7: ( ']' )
            // InternalKiBuild.g:46:9: ']'
            {
            match(']'); 

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
            // InternalKiBuild.g:47:7: ( 'extern' )
            // InternalKiBuild.g:47:9: 'extern'
            {
            match("extern"); 


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
            // InternalKiBuild.g:48:7: ( '@' )
            // InternalKiBuild.g:48:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiBuild.g:49:7: ( '#' )
            // InternalKiBuild.g:49:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiBuild.g:13061:14: ( ( 'true' | 'false' ) )
            // InternalKiBuild.g:13061:16: ( 'true' | 'false' )
            {
            // InternalKiBuild.g:13061:16: ( 'true' | 'false' )
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
                    // InternalKiBuild.g:13061:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalKiBuild.g:13061:24: 'false'
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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiBuild.g:13063:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' | '\\\\' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '/' | '\\\\' | '0' .. '9' )* )
            // InternalKiBuild.g:13063:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' | '\\\\' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '/' | '\\\\' | '0' .. '9' )*
            {
            // InternalKiBuild.g:13063:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKiBuild.g:13063:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='/'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKiBuild.g:13063:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '/' | '\\\\' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='-' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='\\'||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKiBuild.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_HOSTCODE"
    public final void mRULE_HOSTCODE() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiBuild.g:13065:15: ( '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`' )
            // InternalKiBuild.g:13065:17: '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`'
            {
            match('`'); 
            // InternalKiBuild.g:13065:21: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='_')||(LA4_0>='a' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKiBuild.g:13065:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalKiBuild.g:13065:63: ~ ( ( '\\\\' | '`' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HOSTCODE"

    // $ANTLR start "RULE_COMMENT_ANNOTATION"
    public final void mRULE_COMMENT_ANNOTATION() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_ANNOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiBuild.g:13067:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalKiBuild.g:13067:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalKiBuild.g:13067:33: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKiBuild.g:13067:61: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_ANNOTATION"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiBuild.g:13069:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalKiBuild.g:13069:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKiBuild.g:13069:31: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKiBuild.g:13069:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT_ANNOTATION"
    public final void mRULE_SL_COMMENT_ANNOTATION() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT_ANNOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiBuild.g:13071:28: ( '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKiBuild.g:13071:30: '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//*"); 

            // InternalKiBuild.g:13071:36: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKiBuild.g:13071:36: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);

            // InternalKiBuild.g:13071:52: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKiBuild.g:13071:53: ( '\\r' )? '\\n'
                    {
                    // InternalKiBuild.g:13071:53: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalKiBuild.g:13071:53: '\\r'
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT_ANNOTATION"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiBuild.g:13073:17: ( '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKiBuild.g:13073:19: '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKiBuild.g:13073:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKiBuild.g:13073:31: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalKiBuild.g:13073:47: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKiBuild.g:13073:48: ( '\\r' )? '\\n'
                    {
                    // InternalKiBuild.g:13073:48: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalKiBuild.g:13073:48: '\\r'
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            // InternalKiBuild.g:13075:22: ( '0' .. '9' )
            // InternalKiBuild.g:13075:24: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiBuild.g:13077:10: ( ( RULE_NUMBER )+ )
            // InternalKiBuild.g:13077:12: ( RULE_NUMBER )+
            {
            // InternalKiBuild.g:13077:12: ( RULE_NUMBER )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKiBuild.g:13077:12: RULE_NUMBER
            	    {
            	    mRULE_NUMBER(); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalKiBuild.g:13079:12: ( ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' ) )
            // InternalKiBuild.g:13079:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            {
            // InternalKiBuild.g:13079:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalKiBuild.g:13079:15: ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // InternalKiBuild.g:13079:15: ( RULE_NUMBER )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalKiBuild.g:13079:15: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    match('.'); 
                    // InternalKiBuild.g:13079:32: ( RULE_NUMBER )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalKiBuild.g:13079:32: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    // InternalKiBuild.g:13079:45: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='E'||LA18_0=='e') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalKiBuild.g:13079:46: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalKiBuild.g:13079:56: ( '+' | '-' )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0=='+'||LA16_0=='-') ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // InternalKiBuild.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // InternalKiBuild.g:13079:67: ( RULE_NUMBER )+
                            int cnt17=0;
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalKiBuild.g:13079:67: RULE_NUMBER
                            	    {
                            	    mRULE_NUMBER(); 

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
                            break;

                    }

                    // InternalKiBuild.g:13079:82: ( 'f' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='f') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalKiBuild.g:13079:82: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalKiBuild.g:13079:87: ( RULE_NUMBER )+ 'f'
                    {
                    // InternalKiBuild.g:13079:87: ( RULE_NUMBER )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalKiBuild.g:13079:87: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    match('f'); 

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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiBuild.g:13081:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalKiBuild.g:13081:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalKiBuild.g:13081:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\\') ) {
                    alt22=1;
                }
                else if ( ((LA22_0>='\u0000' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFF')) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKiBuild.g:13081:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalKiBuild.g:13081:61: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop22;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiBuild.g:13083:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKiBuild.g:13083:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKiBuild.g:13083:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKiBuild.g:
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiBuild.g:13085:16: ( . )
            // InternalKiBuild.g:13085:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalKiBuild.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_BOOLEAN | RULE_ID | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt24=51;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // InternalKiBuild.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalKiBuild.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalKiBuild.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalKiBuild.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalKiBuild.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalKiBuild.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalKiBuild.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalKiBuild.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalKiBuild.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalKiBuild.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalKiBuild.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalKiBuild.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalKiBuild.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalKiBuild.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalKiBuild.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalKiBuild.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalKiBuild.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalKiBuild.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalKiBuild.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalKiBuild.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalKiBuild.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalKiBuild.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalKiBuild.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalKiBuild.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalKiBuild.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalKiBuild.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalKiBuild.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalKiBuild.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalKiBuild.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalKiBuild.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalKiBuild.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalKiBuild.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalKiBuild.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalKiBuild.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalKiBuild.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalKiBuild.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalKiBuild.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalKiBuild.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalKiBuild.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalKiBuild.g:1:244: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 41 :
                // InternalKiBuild.g:1:257: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 42 :
                // InternalKiBuild.g:1:265: RULE_HOSTCODE
                {
                mRULE_HOSTCODE(); 

                }
                break;
            case 43 :
                // InternalKiBuild.g:1:279: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 44 :
                // InternalKiBuild.g:1:303: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 45 :
                // InternalKiBuild.g:1:319: RULE_SL_COMMENT_ANNOTATION
                {
                mRULE_SL_COMMENT_ANNOTATION(); 

                }
                break;
            case 46 :
                // InternalKiBuild.g:1:346: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // InternalKiBuild.g:1:362: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 48 :
                // InternalKiBuild.g:1:371: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 49 :
                // InternalKiBuild.g:1:382: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 50 :
                // InternalKiBuild.g:1:394: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 51 :
                // InternalKiBuild.g:1:402: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA21_eotS =
        "\4\uffff";
    static final String DFA21_eofS =
        "\4\uffff";
    static final String DFA21_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA21_maxS =
        "\1\71\1\146\2\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA21_specialS =
        "\4\uffff}>";
    static final String[] DFA21_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\54\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    static class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "13079:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\1\51\1\53\1\55\1\57\4\uffff\1\66\1\51\1\71\1\uffff\1\47\1\75\1\77\2\51\2\uffff\3\51\6\uffff\1\51\2\uffff\1\51\1\47\1\uffff\1\47\1\124\1\47\2\uffff\1\51\14\uffff\1\51\1\uffff\1\51\10\uffff\2\51\2\uffff\5\51\6\uffff\1\51\2\uffff\1\51\3\uffff\1\124\2\uffff\1\152\1\51\3\uffff\1\51\1\uffff\1\155\11\51\1\uffff\2\51\1\uffff\5\51\1\175\4\51\1\u0082\4\51\1\uffff\2\51\1\175\1\51\1\uffff\5\51\1\u008f\1\u0090\4\51\1\u0095\2\uffff\1\u0096\1\51\1\u0098\1\u0099\2\uffff\1\51\2\uffff\1\u009b\1\uffff";
    static final String DFA24_eofS =
        "\u009c\uffff";
    static final String DFA24_minS =
        "\1\0\1\162\1\174\1\46\1\75\4\uffff\1\52\1\141\1\51\1\uffff\3\75\2\157\2\uffff\1\143\1\145\1\162\6\uffff\1\170\2\uffff\1\141\1\57\1\uffff\1\0\1\56\1\0\2\uffff\1\145\13\uffff\2\0\1\uffff\1\154\10\uffff\1\144\1\155\2\uffff\1\155\1\150\1\155\1\165\1\141\6\uffff\1\164\2\uffff\1\154\3\uffff\1\56\2\uffff\1\55\1\143\3\uffff\1\0\1\uffff\1\55\1\145\1\160\1\165\1\145\1\160\1\145\1\160\1\145\1\163\1\uffff\1\145\1\0\1\uffff\1\154\1\151\1\154\1\144\1\154\1\55\1\160\1\162\1\145\1\163\1\55\1\154\1\141\1\165\1\141\1\uffff\1\145\1\156\1\55\1\163\1\uffff\1\145\1\164\1\154\1\164\1\162\2\55\1\162\1\151\2\145\1\55\2\uffff\1\55\1\157\2\55\2\uffff\1\156\2\uffff\1\55\1\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\162\1\174\1\46\1\75\4\uffff\1\172\1\141\1\51\1\uffff\3\75\2\157\2\uffff\1\151\2\162\6\uffff\1\170\2\uffff\1\141\1\172\1\uffff\1\uffff\1\146\1\uffff\2\uffff\1\157\13\uffff\2\uffff\1\uffff\1\154\10\uffff\1\144\1\155\2\uffff\1\155\1\150\1\155\1\165\1\141\6\uffff\1\164\2\uffff\1\154\3\uffff\1\146\2\uffff\1\172\1\143\3\uffff\1\uffff\1\uffff\1\172\1\145\1\160\1\165\1\145\1\160\1\145\1\160\1\145\1\163\1\uffff\1\145\1\uffff\1\uffff\1\154\1\151\1\154\1\144\1\154\1\172\1\160\1\162\1\145\1\163\1\172\1\154\1\141\1\165\1\141\1\uffff\1\145\1\156\1\172\1\163\1\uffff\1\145\1\164\1\154\1\164\1\162\2\172\1\162\1\151\2\145\1\172\2\uffff\1\172\1\157\2\172\2\uffff\1\156\2\uffff\1\172\1\uffff";
    static final String DFA24_acceptS =
        "\5\uffff\1\5\1\6\1\7\1\10\3\uffff\1\16\5\uffff\1\27\1\30\3\uffff\1\35\1\36\1\41\1\42\1\43\1\44\1\uffff\1\46\1\47\2\uffff\1\51\3\uffff\1\62\1\63\1\uffff\1\51\1\13\1\2\1\14\1\3\1\24\1\4\1\5\1\6\1\7\1\10\2\uffff\1\11\1\uffff\1\15\1\40\1\16\1\17\1\21\1\20\1\23\1\22\2\uffff\1\27\1\30\5\uffff\1\35\1\36\1\41\1\42\1\43\1\44\1\uffff\1\46\1\47\1\uffff\1\52\1\57\1\60\1\uffff\1\61\1\62\2\uffff\1\53\1\54\1\55\1\uffff\1\56\12\uffff\1\1\2\uffff\1\12\17\uffff\1\50\4\uffff\1\25\14\uffff\1\45\1\32\4\uffff\1\34\1\26\1\uffff\1\37\1\33\1\uffff\1\31";
    static final String DFA24_specialS =
        "\1\3\42\uffff\1\6\1\uffff\1\1\16\uffff\1\0\1\5\50\uffff\1\4\15\uffff\1\2\57\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\4\1\45\1\37\1\47\1\10\1\3\1\32\1\13\1\31\1\7\1\5\1\30\1\6\1\14\1\11\12\44\1\27\1\47\1\16\1\15\1\17\1\47\1\36\32\42\1\33\1\42\1\34\1\41\1\42\1\43\2\42\1\21\1\42\1\35\1\40\6\42\1\20\2\42\1\1\2\42\1\24\1\25\1\42\1\12\1\26\3\42\1\22\1\2\1\23\uff82\47",
            "\1\50",
            "\1\52",
            "\1\54",
            "\1\56",
            "",
            "",
            "",
            "",
            "\1\64\2\uffff\2\51\1\65\12\51\7\uffff\32\51\1\uffff\1\51\2\uffff\1\51\1\uffff\32\51",
            "\1\67",
            "\1\70",
            "",
            "\1\73",
            "\1\74",
            "\1\76",
            "\1\100",
            "\1\101",
            "",
            "",
            "\1\105\5\uffff\1\104",
            "\1\106\14\uffff\1\107",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117",
            "",
            "",
            "\1\122",
            "\1\51\21\uffff\32\51\1\uffff\1\51\2\uffff\1\51\1\uffff\32\51",
            "",
            "\0\123",
            "\1\125\1\uffff\12\126\54\uffff\1\125",
            "\0\127",
            "",
            "",
            "\1\131\11\uffff\1\132",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\134\1\133\uffd5\134",
            "\52\137\1\135\2\137\15\136\7\137\32\136\1\137\1\136\2\137\1\136\1\137\32\136\uff85\137",
            "",
            "\1\140",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "\1\142",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\150",
            "",
            "",
            "\1\151",
            "",
            "",
            "",
            "\1\125\1\uffff\12\126\54\uffff\1\125",
            "",
            "",
            "\15\51\7\uffff\32\51\1\uffff\1\51\2\uffff\1\51\1\uffff\32\51",
            "\1\153",
            "",
            "",
            "",
            "\55\137\15\154\7\137\32\154\1\137\1\154\2\137\1\154\1\137\32\154\uff85\137",
            "",
            "\15\51\7\uffff\32\51\1\uffff\1\51\2\uffff\1\51\1\uffff\32\51",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "\55\137\15\154\7\137\32\154\1\137\1\154\2\137\1\154\1\137\32\154\uff85\137",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\15\51\7\uffff\32\51\1\uffff\1\51\2\uffff\1\51\1\uffff\32\51",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\15\51\7\uffff\32\51\1\uffff\1\51\2\uffff\1\51\1\uffff\32\51",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\1\u0087",
            "\1\u0088",
            "\15\51\7\uffff\32\51\1\uffff\1\51\2\uffff\1\51\1\uffff\32\51",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\15\51\7\uffff\32\51\1\uffff\1\51\2\uffff\1\51\1\uffff\32\51",
            "\15\51\7\uffff\32\51\1\uffff\1\51\2\uffff\1\51\1\uffff\32\51",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\15\51\7\uffff\32\51\1\uffff\1\51\2\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\15\51\7\uffff\32\51\1\uffff\1\51\2\uffff\1\51\1\uffff\32\51",
            "\1\u0097",
            "\15\51\7\uffff\32\51\1\uffff\1\51\2\uffff\1\51\1\uffff\32\51",
            "\15\51\7\uffff\32\51\1\uffff\1\51\2\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u009a",
            "",
            "",
            "\15\51\7\uffff\32\51\1\uffff\1\51\2\uffff\1\51\1\uffff\32\51",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_BOOLEAN | RULE_ID | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_52 = input.LA(1);

                        s = -1;
                        if ( (LA24_52=='*') ) {s = 91;}

                        else if ( ((LA24_52>='\u0000' && LA24_52<=')')||(LA24_52>='+' && LA24_52<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_37 = input.LA(1);

                        s = -1;
                        if ( ((LA24_37>='\u0000' && LA24_37<='\uFFFF')) ) {s = 87;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_108 = input.LA(1);

                        s = -1;
                        if ( ((LA24_108>='\u0000' && LA24_108<=',')||(LA24_108>=':' && LA24_108<='@')||LA24_108=='['||(LA24_108>=']' && LA24_108<='^')||LA24_108=='`'||(LA24_108>='{' && LA24_108<='\uFFFF')) ) {s = 95;}

                        else if ( ((LA24_108>='-' && LA24_108<='9')||(LA24_108>='A' && LA24_108<='Z')||LA24_108=='\\'||LA24_108=='_'||(LA24_108>='a' && LA24_108<='z')) ) {s = 108;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='p') ) {s = 1;}

                        else if ( (LA24_0=='|') ) {s = 2;}

                        else if ( (LA24_0=='&') ) {s = 3;}

                        else if ( (LA24_0=='!') ) {s = 4;}

                        else if ( (LA24_0=='+') ) {s = 5;}

                        else if ( (LA24_0=='-') ) {s = 6;}

                        else if ( (LA24_0=='*') ) {s = 7;}

                        else if ( (LA24_0=='%') ) {s = 8;}

                        else if ( (LA24_0=='/') ) {s = 9;}

                        else if ( (LA24_0=='v') ) {s = 10;}

                        else if ( (LA24_0=='(') ) {s = 11;}

                        else if ( (LA24_0=='.') ) {s = 12;}

                        else if ( (LA24_0=='=') ) {s = 13;}

                        else if ( (LA24_0=='<') ) {s = 14;}

                        else if ( (LA24_0=='>') ) {s = 15;}

                        else if ( (LA24_0=='m') ) {s = 16;}

                        else if ( (LA24_0=='c') ) {s = 17;}

                        else if ( (LA24_0=='{') ) {s = 18;}

                        else if ( (LA24_0=='}') ) {s = 19;}

                        else if ( (LA24_0=='s') ) {s = 20;}

                        else if ( (LA24_0=='t') ) {s = 21;}

                        else if ( (LA24_0=='w') ) {s = 22;}

                        else if ( (LA24_0==':') ) {s = 23;}

                        else if ( (LA24_0==',') ) {s = 24;}

                        else if ( (LA24_0==')') ) {s = 25;}

                        else if ( (LA24_0=='\'') ) {s = 26;}

                        else if ( (LA24_0=='[') ) {s = 27;}

                        else if ( (LA24_0==']') ) {s = 28;}

                        else if ( (LA24_0=='e') ) {s = 29;}

                        else if ( (LA24_0=='@') ) {s = 30;}

                        else if ( (LA24_0=='#') ) {s = 31;}

                        else if ( (LA24_0=='f') ) {s = 32;}

                        else if ( (LA24_0=='^') ) {s = 33;}

                        else if ( ((LA24_0>='A' && LA24_0<='Z')||LA24_0=='\\'||LA24_0=='_'||(LA24_0>='a' && LA24_0<='b')||LA24_0=='d'||(LA24_0>='g' && LA24_0<='l')||(LA24_0>='n' && LA24_0<='o')||(LA24_0>='q' && LA24_0<='r')||LA24_0=='u'||(LA24_0>='x' && LA24_0<='z')) ) {s = 34;}

                        else if ( (LA24_0=='`') ) {s = 35;}

                        else if ( ((LA24_0>='0' && LA24_0<='9')) ) {s = 36;}

                        else if ( (LA24_0=='\"') ) {s = 37;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 38;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='$'||LA24_0==';'||LA24_0=='?'||(LA24_0>='~' && LA24_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_94 = input.LA(1);

                        s = -1;
                        if ( ((LA24_94>='-' && LA24_94<='9')||(LA24_94>='A' && LA24_94<='Z')||LA24_94=='\\'||LA24_94=='_'||(LA24_94>='a' && LA24_94<='z')) ) {s = 108;}

                        else if ( ((LA24_94>='\u0000' && LA24_94<=',')||(LA24_94>=':' && LA24_94<='@')||LA24_94=='['||(LA24_94>=']' && LA24_94<='^')||LA24_94=='`'||(LA24_94>='{' && LA24_94<='\uFFFF')) ) {s = 95;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_53 = input.LA(1);

                        s = -1;
                        if ( (LA24_53=='*') ) {s = 93;}

                        else if ( ((LA24_53>='-' && LA24_53<='9')||(LA24_53>='A' && LA24_53<='Z')||LA24_53=='\\'||LA24_53=='_'||(LA24_53>='a' && LA24_53<='z')) ) {s = 94;}

                        else if ( ((LA24_53>='\u0000' && LA24_53<=')')||(LA24_53>='+' && LA24_53<=',')||(LA24_53>=':' && LA24_53<='@')||LA24_53=='['||(LA24_53>=']' && LA24_53<='^')||LA24_53=='`'||(LA24_53>='{' && LA24_53<='\uFFFF')) ) {s = 95;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_35 = input.LA(1);

                        s = -1;
                        if ( ((LA24_35>='\u0000' && LA24_35<='\uFFFF')) ) {s = 83;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}