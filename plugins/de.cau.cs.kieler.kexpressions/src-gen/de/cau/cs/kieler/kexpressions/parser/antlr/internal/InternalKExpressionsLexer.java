package de.cau.cs.kieler.kexpressions.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKExpressionsLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=6;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int RULE_STRING=9;
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
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalKExpressionsLexer() {;} 
    public InternalKExpressionsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKExpressionsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKExpressions.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExpressions.g:11:7: ( 'schedule' )
            // InternalKExpressions.g:11:9: 'schedule'
            {
            match("schedule"); 


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
            // InternalKExpressions.g:12:7: ( '||' )
            // InternalKExpressions.g:12:9: '||'
            {
            match("||"); 


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
            // InternalKExpressions.g:13:7: ( '&&' )
            // InternalKExpressions.g:13:9: '&&'
            {
            match("&&"); 


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
            // InternalKExpressions.g:14:7: ( '|' )
            // InternalKExpressions.g:14:9: '|'
            {
            match('|'); 

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
            // InternalKExpressions.g:15:7: ( '^' )
            // InternalKExpressions.g:15:9: '^'
            {
            match('^'); 

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
            // InternalKExpressions.g:16:7: ( '&' )
            // InternalKExpressions.g:16:9: '&'
            {
            match('&'); 

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
            // InternalKExpressions.g:17:7: ( '<<' )
            // InternalKExpressions.g:17:9: '<<'
            {
            match("<<"); 


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
            // InternalKExpressions.g:18:7: ( '>>' )
            // InternalKExpressions.g:18:9: '>>'
            {
            match(">>"); 


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
            // InternalKExpressions.g:19:7: ( '>>>' )
            // InternalKExpressions.g:19:9: '>>>'
            {
            match(">>>"); 


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
            // InternalKExpressions.g:20:7: ( '+' )
            // InternalKExpressions.g:20:9: '+'
            {
            match('+'); 

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
            // InternalKExpressions.g:21:7: ( '-' )
            // InternalKExpressions.g:21:9: '-'
            {
            match('-'); 

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
            // InternalKExpressions.g:22:7: ( '*' )
            // InternalKExpressions.g:22:9: '*'
            {
            match('*'); 

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
            // InternalKExpressions.g:23:7: ( '/' )
            // InternalKExpressions.g:23:9: '/'
            {
            match('/'); 

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
            // InternalKExpressions.g:24:7: ( '%' )
            // InternalKExpressions.g:24:9: '%'
            {
            match('%'); 

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
            // InternalKExpressions.g:25:7: ( ':' )
            // InternalKExpressions.g:25:9: ':'
            {
            match(':'); 

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
            // InternalKExpressions.g:26:7: ( '(' )
            // InternalKExpressions.g:26:9: '('
            {
            match('('); 

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
            // InternalKExpressions.g:27:7: ( ')' )
            // InternalKExpressions.g:27:9: ')'
            {
            match(')'); 

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
            // InternalKExpressions.g:28:7: ( '\\'' )
            // InternalKExpressions.g:28:9: '\\''
            {
            match('\''); 

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
            // InternalKExpressions.g:29:7: ( '[' )
            // InternalKExpressions.g:29:9: '['
            {
            match('['); 

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
            // InternalKExpressions.g:30:7: ( ']' )
            // InternalKExpressions.g:30:9: ']'
            {
            match(']'); 

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
            // InternalKExpressions.g:31:7: ( '.' )
            // InternalKExpressions.g:31:9: '.'
            {
            match('.'); 

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
            // InternalKExpressions.g:32:7: ( ',' )
            // InternalKExpressions.g:32:9: ','
            {
            match(','); 

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
            // InternalKExpressions.g:33:7: ( '()' )
            // InternalKExpressions.g:33:9: '()'
            {
            match("()"); 


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
            // InternalKExpressions.g:34:7: ( 'extern' )
            // InternalKExpressions.g:34:9: 'extern'
            {
            match("extern"); 


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
            // InternalKExpressions.g:35:7: ( '!' )
            // InternalKExpressions.g:35:9: '!'
            {
            match('!'); 

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
            // InternalKExpressions.g:36:7: ( '{' )
            // InternalKExpressions.g:36:9: '{'
            {
            match('{'); 

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
            // InternalKExpressions.g:37:7: ( '}' )
            // InternalKExpressions.g:37:9: '}'
            {
            match('}'); 

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
            // InternalKExpressions.g:38:7: ( '_' )
            // InternalKExpressions.g:38:9: '_'
            {
            match('_'); 

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
            // InternalKExpressions.g:39:7: ( '@' )
            // InternalKExpressions.g:39:9: '@'
            {
            match('@'); 

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
            // InternalKExpressions.g:40:7: ( '#' )
            // InternalKExpressions.g:40:9: '#'
            {
            match('#'); 

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
            // InternalKExpressions.g:41:7: ( '==' )
            // InternalKExpressions.g:41:9: '=='
            {
            match("=="); 


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
            // InternalKExpressions.g:42:7: ( '<' )
            // InternalKExpressions.g:42:9: '<'
            {
            match('<'); 

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
            // InternalKExpressions.g:43:7: ( '<=' )
            // InternalKExpressions.g:43:9: '<='
            {
            match("<="); 


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
            // InternalKExpressions.g:44:7: ( '>' )
            // InternalKExpressions.g:44:9: '>'
            {
            match('>'); 

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
            // InternalKExpressions.g:45:7: ( '>=' )
            // InternalKExpressions.g:45:9: '>='
            {
            match(">="); 


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
            // InternalKExpressions.g:46:7: ( '!=' )
            // InternalKExpressions.g:46:9: '!='
            {
            match("!="); 


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
            // InternalKExpressions.g:47:7: ( 'pre' )
            // InternalKExpressions.g:47:9: 'pre'
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
            // InternalKExpressions.g:48:7: ( '~' )
            // InternalKExpressions.g:48:9: '~'
            {
            match('~'); 

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
            // InternalKExpressions.g:49:7: ( 'val' )
            // InternalKExpressions.g:49:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExpressions.g:50:7: ( '?' )
            // InternalKExpressions.g:50:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "RULE_HOSTCODE"
    public final void mRULE_HOSTCODE() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExpressions.g:4491:15: ( '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`' )
            // InternalKExpressions.g:4491:17: '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`'
            {
            match('`'); 
            // InternalKExpressions.g:4491:21: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='_')||(LA1_0>='a' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKExpressions.g:4491:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKExpressions.g:4491:63: ~ ( ( '\\\\' | '`' ) )
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
            	    break loop1;
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
            // InternalKExpressions.g:4493:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalKExpressions.g:4493:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalKExpressions.g:4493:33: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKExpressions.g:4493:61: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
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
            // InternalKExpressions.g:4495:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalKExpressions.g:4495:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKExpressions.g:4495:31: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKExpressions.g:4495:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
            // InternalKExpressions.g:4497:28: ( '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKExpressions.g:4497:30: '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//*"); 

            // InternalKExpressions.g:4497:36: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKExpressions.g:4497:36: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop4;
                }
            } while (true);

            // InternalKExpressions.g:4497:52: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKExpressions.g:4497:53: ( '\\r' )? '\\n'
                    {
                    // InternalKExpressions.g:4497:53: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalKExpressions.g:4497:53: '\\r'
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
            // InternalKExpressions.g:4499:17: ( '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKExpressions.g:4499:19: '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKExpressions.g:4499:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKExpressions.g:4499:31: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalKExpressions.g:4499:47: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKExpressions.g:4499:48: ( '\\r' )? '\\n'
                    {
                    // InternalKExpressions.g:4499:48: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalKExpressions.g:4499:48: '\\r'
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
            // InternalKExpressions.g:4501:22: ( '0' .. '9' )
            // InternalKExpressions.g:4501:24: '0' .. '9'
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
            // InternalKExpressions.g:4503:10: ( ( RULE_NUMBER )+ )
            // InternalKExpressions.g:4503:12: ( RULE_NUMBER )+
            {
            // InternalKExpressions.g:4503:12: ( RULE_NUMBER )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKExpressions.g:4503:12: RULE_NUMBER
            	    {
            	    mRULE_NUMBER(); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // InternalKExpressions.g:4505:12: ( ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' ) )
            // InternalKExpressions.g:4505:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            {
            // InternalKExpressions.g:4505:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalKExpressions.g:4505:15: ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // InternalKExpressions.g:4505:15: ( RULE_NUMBER )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalKExpressions.g:4505:15: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    match('.'); 
                    // InternalKExpressions.g:4505:32: ( RULE_NUMBER )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalKExpressions.g:4505:32: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalKExpressions.g:4505:45: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalKExpressions.g:4505:46: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalKExpressions.g:4505:56: ( '+' | '-' )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0=='+'||LA13_0=='-') ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalKExpressions.g:
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

                            // InternalKExpressions.g:4505:67: ( RULE_NUMBER )+
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
                            	    // InternalKExpressions.g:4505:67: RULE_NUMBER
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


                            }
                            break;

                    }

                    // InternalKExpressions.g:4505:82: ( 'f' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='f') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalKExpressions.g:4505:82: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:4505:87: ( RULE_NUMBER )+ 'f'
                    {
                    // InternalKExpressions.g:4505:87: ( RULE_NUMBER )+
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
                    	    // InternalKExpressions.g:4505:87: RULE_NUMBER
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

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExpressions.g:4507:14: ( ( 'true' | 'false' ) )
            // InternalKExpressions.g:4507:16: ( 'true' | 'false' )
            {
            // InternalKExpressions.g:4507:16: ( 'true' | 'false' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='t') ) {
                alt19=1;
            }
            else if ( (LA19_0=='f') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalKExpressions.g:4507:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:4507:24: 'false'
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExpressions.g:4509:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalKExpressions.g:4509:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalKExpressions.g:4509:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\\') ) {
                    alt20=1;
                }
                else if ( ((LA20_0>='\u0000' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKExpressions.g:4509:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKExpressions.g:4509:61: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop20;
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExpressions.g:4511:9: ( ( '^' )? ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKExpressions.g:4511:11: ( '^' )? ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKExpressions.g:4511:11: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKExpressions.g:4511:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // InternalKExpressions.g:4511:16: ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='_') ) {
                switch ( input.LA(2) ) {
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
                    alt25=2;
                    }
                    break;
                case '_':
                    {
                    alt25=3;
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
                case 'O':
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
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt25=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA25_0>='A' && LA25_0<='Z')||(LA25_0>='a' && LA25_0<='z')) ) {
                alt25=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalKExpressions.g:4511:17: ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' )
                    {
                    // InternalKExpressions.g:4511:17: ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' )
                    int alt24=2;
                    switch ( input.LA(1) ) {
                    case '_':
                        {
                        int LA24_1 = input.LA(2);

                        if ( ((LA24_1>='A' && LA24_1<='Z')) ) {
                            alt24=2;
                        }
                        else if ( ((LA24_1>='a' && LA24_1<='z')) ) {
                            alt24=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 1, input);

                            throw nvae;
                        }
                        }
                        break;
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
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt24=1;
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
                    case 'O':
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
                        {
                        alt24=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // InternalKExpressions.g:4511:18: ( '_' )? 'a' .. 'z'
                            {
                            // InternalKExpressions.g:4511:18: ( '_' )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0=='_') ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // InternalKExpressions.g:4511:18: '_'
                                    {
                                    match('_'); 

                                    }
                                    break;

                            }

                            matchRange('a','z'); 

                            }
                            break;
                        case 2 :
                            // InternalKExpressions.g:4511:32: ( '_' )? 'A' .. 'Z'
                            {
                            // InternalKExpressions.g:4511:32: ( '_' )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0=='_') ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // InternalKExpressions.g:4511:32: '_'
                                    {
                                    match('_'); 

                                    }
                                    break;

                            }

                            matchRange('A','Z'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:4511:47: '_' '0' .. '9'
                    {
                    match('_'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:4511:60: '__'
                    {
                    match("__"); 


                    }
                    break;

            }

            // InternalKExpressions.g:4511:66: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKExpressions.g:
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
            	    break loop26;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExpressions.g:4513:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKExpressions.g:4513:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKExpressions.g:4513:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKExpressions.g:
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
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
            // InternalKExpressions.g:4515:16: ( . )
            // InternalKExpressions.g:4515:18: .
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
        // InternalKExpressions.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER )
        int alt28=52;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // InternalKExpressions.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalKExpressions.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalKExpressions.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalKExpressions.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalKExpressions.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalKExpressions.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalKExpressions.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalKExpressions.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalKExpressions.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalKExpressions.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalKExpressions.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalKExpressions.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalKExpressions.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalKExpressions.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalKExpressions.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalKExpressions.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalKExpressions.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalKExpressions.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalKExpressions.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalKExpressions.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalKExpressions.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalKExpressions.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalKExpressions.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalKExpressions.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalKExpressions.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalKExpressions.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalKExpressions.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalKExpressions.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalKExpressions.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalKExpressions.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalKExpressions.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalKExpressions.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalKExpressions.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalKExpressions.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalKExpressions.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalKExpressions.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalKExpressions.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalKExpressions.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalKExpressions.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalKExpressions.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalKExpressions.g:1:250: RULE_HOSTCODE
                {
                mRULE_HOSTCODE(); 

                }
                break;
            case 42 :
                // InternalKExpressions.g:1:264: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 43 :
                // InternalKExpressions.g:1:288: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 44 :
                // InternalKExpressions.g:1:304: RULE_SL_COMMENT_ANNOTATION
                {
                mRULE_SL_COMMENT_ANNOTATION(); 

                }
                break;
            case 45 :
                // InternalKExpressions.g:1:331: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 46 :
                // InternalKExpressions.g:1:347: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 47 :
                // InternalKExpressions.g:1:356: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 48 :
                // InternalKExpressions.g:1:367: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 49 :
                // InternalKExpressions.g:1:380: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 50 :
                // InternalKExpressions.g:1:392: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 51 :
                // InternalKExpressions.g:1:400: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 52 :
                // InternalKExpressions.g:1:408: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA18_eotS =
        "\4\uffff";
    static final String DFA18_eofS =
        "\4\uffff";
    static final String DFA18_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA18_maxS =
        "\1\71\1\146\2\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA18_specialS =
        "\4\uffff}>";
    static final String[] DFA18_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\54\uffff\1\3",
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

    static class DFA18 extends DFA {

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
            return "4505:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA28_eotS =
        "\1\uffff\1\52\1\54\1\56\1\57\1\62\1\65\3\uffff\1\73\2\uffff\1\77\6\uffff\1\52\1\110\2\uffff\1\113\2\uffff\1\50\1\52\1\uffff\1\52\1\uffff\1\50\1\124\2\52\1\50\4\uffff\1\52\11\uffff\1\135\22\uffff\1\52\10\uffff\1\52\1\uffff\1\52\4\uffff\1\124\2\52\2\uffff\1\52\6\uffff\1\52\1\151\1\152\4\52\2\uffff\1\157\3\52\1\uffff\1\157\1\52\1\164\1\52\1\uffff\1\166\1\uffff";
    static final String DFA28_eofS =
        "\167\uffff";
    static final String DFA28_minS =
        "\1\0\1\143\1\174\1\46\1\101\1\74\1\75\3\uffff\1\52\2\uffff\1\51\6\uffff\1\170\1\75\2\uffff\1\60\2\uffff\1\75\1\162\1\uffff\1\141\1\uffff\1\0\1\56\1\162\1\141\1\0\4\uffff\1\150\11\uffff\1\76\5\uffff\2\0\13\uffff\1\164\10\uffff\1\145\1\uffff\1\154\4\uffff\1\56\1\165\1\154\2\uffff\1\145\6\uffff\1\145\2\60\1\145\1\163\1\144\1\162\2\uffff\1\60\1\145\1\165\1\156\1\uffff\1\60\1\154\1\60\1\145\1\uffff\1\60\1\uffff";
    static final String DFA28_maxS =
        "\1\uffff\1\143\1\174\1\46\1\172\1\75\1\76\3\uffff\1\57\2\uffff\1\51\6\uffff\1\170\1\75\2\uffff\1\172\2\uffff\1\75\1\162\1\uffff\1\141\1\uffff\1\uffff\1\146\1\162\1\141\1\uffff\4\uffff\1\150\11\uffff\1\76\5\uffff\2\uffff\13\uffff\1\164\10\uffff\1\145\1\uffff\1\154\4\uffff\1\146\1\165\1\154\2\uffff\1\145\6\uffff\1\145\2\172\1\145\1\163\1\144\1\162\2\uffff\1\172\1\145\1\165\1\156\1\uffff\1\172\1\154\1\172\1\145\1\uffff\1\172\1\uffff";
    static final String DFA28_acceptS =
        "\7\uffff\1\12\1\13\1\14\1\uffff\1\16\1\17\1\uffff\1\21\1\22\1\23\1\24\1\25\1\26\2\uffff\1\32\1\33\1\uffff\1\35\1\36\2\uffff\1\46\1\uffff\1\50\5\uffff\2\62\1\63\1\64\1\uffff\1\62\1\2\1\4\1\3\1\6\1\5\1\7\1\41\1\40\1\uffff\1\43\1\42\1\12\1\13\1\14\2\uffff\1\15\1\16\1\17\1\27\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\uffff\1\44\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff\1\46\1\uffff\1\50\1\51\1\56\1\57\3\uffff\1\61\1\63\1\uffff\1\11\1\10\1\52\1\53\1\54\1\55\7\uffff\1\45\1\47\4\uffff\1\60\4\uffff\1\30\1\uffff\1\1";
    static final String DFA28_specialS =
        "\1\3\37\uffff\1\0\3\uffff\1\2\24\uffff\1\1\1\4\74\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\50\2\47\2\50\1\47\22\50\1\47\1\25\1\44\1\32\1\50\1\13\1\3\1\17\1\15\1\16\1\11\1\7\1\23\1\10\1\22\1\12\12\41\1\14\1\50\1\5\1\33\1\6\1\37\1\31\32\46\1\20\1\50\1\21\1\4\1\30\1\40\4\45\1\24\1\43\11\45\1\34\2\45\1\1\1\42\1\45\1\36\4\45\1\26\1\2\1\27\1\35\uff81\50",
            "\1\51",
            "\1\53",
            "\1\55",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\60\1\61",
            "\1\64\1\63",
            "",
            "",
            "",
            "\1\71\4\uffff\1\72",
            "",
            "",
            "\1\76",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\116",
            "\1\117",
            "",
            "\1\121",
            "",
            "\0\123",
            "\1\125\1\uffff\12\126\54\uffff\1\125",
            "\1\127",
            "\1\130",
            "\0\131",
            "",
            "",
            "",
            "",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\134",
            "",
            "",
            "",
            "",
            "",
            "\52\137\1\136\uffd5\137",
            "\52\141\1\140\uffd5\141",
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
            "\1\142",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\143",
            "",
            "\1\144",
            "",
            "",
            "",
            "",
            "\1\125\1\uffff\12\126\54\uffff\1\125",
            "\1\145",
            "\1\146",
            "",
            "",
            "\1\147",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\150",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\163",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\165",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_32 = input.LA(1);

                        s = -1;
                        if ( ((LA28_32>='\u0000' && LA28_32<='\uFFFF')) ) {s = 83;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_57 = input.LA(1);

                        s = -1;
                        if ( (LA28_57=='*') ) {s = 94;}

                        else if ( ((LA28_57>='\u0000' && LA28_57<=')')||(LA28_57>='+' && LA28_57<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_36 = input.LA(1);

                        s = -1;
                        if ( ((LA28_36>='\u0000' && LA28_36<='\uFFFF')) ) {s = 89;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_0 = input.LA(1);

                        s = -1;
                        if ( (LA28_0=='s') ) {s = 1;}

                        else if ( (LA28_0=='|') ) {s = 2;}

                        else if ( (LA28_0=='&') ) {s = 3;}

                        else if ( (LA28_0=='^') ) {s = 4;}

                        else if ( (LA28_0=='<') ) {s = 5;}

                        else if ( (LA28_0=='>') ) {s = 6;}

                        else if ( (LA28_0=='+') ) {s = 7;}

                        else if ( (LA28_0=='-') ) {s = 8;}

                        else if ( (LA28_0=='*') ) {s = 9;}

                        else if ( (LA28_0=='/') ) {s = 10;}

                        else if ( (LA28_0=='%') ) {s = 11;}

                        else if ( (LA28_0==':') ) {s = 12;}

                        else if ( (LA28_0=='(') ) {s = 13;}

                        else if ( (LA28_0==')') ) {s = 14;}

                        else if ( (LA28_0=='\'') ) {s = 15;}

                        else if ( (LA28_0=='[') ) {s = 16;}

                        else if ( (LA28_0==']') ) {s = 17;}

                        else if ( (LA28_0=='.') ) {s = 18;}

                        else if ( (LA28_0==',') ) {s = 19;}

                        else if ( (LA28_0=='e') ) {s = 20;}

                        else if ( (LA28_0=='!') ) {s = 21;}

                        else if ( (LA28_0=='{') ) {s = 22;}

                        else if ( (LA28_0=='}') ) {s = 23;}

                        else if ( (LA28_0=='_') ) {s = 24;}

                        else if ( (LA28_0=='@') ) {s = 25;}

                        else if ( (LA28_0=='#') ) {s = 26;}

                        else if ( (LA28_0=='=') ) {s = 27;}

                        else if ( (LA28_0=='p') ) {s = 28;}

                        else if ( (LA28_0=='~') ) {s = 29;}

                        else if ( (LA28_0=='v') ) {s = 30;}

                        else if ( (LA28_0=='?') ) {s = 31;}

                        else if ( (LA28_0=='`') ) {s = 32;}

                        else if ( ((LA28_0>='0' && LA28_0<='9')) ) {s = 33;}

                        else if ( (LA28_0=='t') ) {s = 34;}

                        else if ( (LA28_0=='f') ) {s = 35;}

                        else if ( (LA28_0=='\"') ) {s = 36;}

                        else if ( ((LA28_0>='a' && LA28_0<='d')||(LA28_0>='g' && LA28_0<='o')||(LA28_0>='q' && LA28_0<='r')||LA28_0=='u'||(LA28_0>='w' && LA28_0<='z')) ) {s = 37;}

                        else if ( ((LA28_0>='A' && LA28_0<='Z')) ) {s = 38;}

                        else if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {s = 39;}

                        else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\u001F')||LA28_0=='$'||LA28_0==';'||LA28_0=='\\'||(LA28_0>='\u007F' && LA28_0<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_58 = input.LA(1);

                        s = -1;
                        if ( (LA28_58=='*') ) {s = 96;}

                        else if ( ((LA28_58>='\u0000' && LA28_58<=')')||(LA28_58>='+' && LA28_58<='\uFFFF')) ) {s = 97;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}