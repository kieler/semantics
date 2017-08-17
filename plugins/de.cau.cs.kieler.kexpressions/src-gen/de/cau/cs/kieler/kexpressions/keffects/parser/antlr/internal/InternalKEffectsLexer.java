package de.cau.cs.kieler.kexpressions.keffects.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKEffectsLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=4;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
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

    public InternalKEffectsLexer() {;} 
    public InternalKEffectsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKEffectsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKEffects.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:11:7: ( '(' )
            // InternalKEffects.g:11:9: '('
            {
            match('('); 

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
            // InternalKEffects.g:12:7: ( ')' )
            // InternalKEffects.g:12:9: ')'
            {
            match(')'); 

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
            // InternalKEffects.g:13:7: ( 'schedule' )
            // InternalKEffects.g:13:9: 'schedule'
            {
            match("schedule"); 


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
            // InternalKEffects.g:14:7: ( '[' )
            // InternalKEffects.g:14:9: '['
            {
            match('['); 

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
            // InternalKEffects.g:15:7: ( ']' )
            // InternalKEffects.g:15:9: ']'
            {
            match(']'); 

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
            // InternalKEffects.g:16:7: ( ',' )
            // InternalKEffects.g:16:9: ','
            {
            match(','); 

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
            // InternalKEffects.g:17:7: ( '()' )
            // InternalKEffects.g:17:9: '()'
            {
            match("()"); 


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
            // InternalKEffects.g:18:7: ( 'extern' )
            // InternalKEffects.g:18:9: 'extern'
            {
            match("extern"); 


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
            // InternalKEffects.g:19:7: ( '<' )
            // InternalKEffects.g:19:9: '<'
            {
            match('<'); 

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
            // InternalKEffects.g:20:7: ( '>' )
            // InternalKEffects.g:20:9: '>'
            {
            match('>'); 

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
            // InternalKEffects.g:21:7: ( 'print' )
            // InternalKEffects.g:21:9: 'print'
            {
            match("print"); 


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
            // InternalKEffects.g:22:7: ( '||' )
            // InternalKEffects.g:22:9: '||'
            {
            match("||"); 


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
            // InternalKEffects.g:23:7: ( '&&' )
            // InternalKEffects.g:23:9: '&&'
            {
            match("&&"); 


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
            // InternalKEffects.g:24:7: ( '|' )
            // InternalKEffects.g:24:9: '|'
            {
            match('|'); 

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
            // InternalKEffects.g:25:7: ( '^' )
            // InternalKEffects.g:25:9: '^'
            {
            match('^'); 

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
            // InternalKEffects.g:26:7: ( '&' )
            // InternalKEffects.g:26:9: '&'
            {
            match('&'); 

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
            // InternalKEffects.g:27:7: ( '<<' )
            // InternalKEffects.g:27:9: '<<'
            {
            match("<<"); 


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
            // InternalKEffects.g:28:7: ( '>>' )
            // InternalKEffects.g:28:9: '>>'
            {
            match(">>"); 


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
            // InternalKEffects.g:29:7: ( '>>>' )
            // InternalKEffects.g:29:9: '>>>'
            {
            match(">>>"); 


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
            // InternalKEffects.g:30:7: ( '+' )
            // InternalKEffects.g:30:9: '+'
            {
            match('+'); 

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
            // InternalKEffects.g:31:7: ( '-' )
            // InternalKEffects.g:31:9: '-'
            {
            match('-'); 

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
            // InternalKEffects.g:32:7: ( '*' )
            // InternalKEffects.g:32:9: '*'
            {
            match('*'); 

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
            // InternalKEffects.g:33:7: ( '/' )
            // InternalKEffects.g:33:9: '/'
            {
            match('/'); 

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
            // InternalKEffects.g:34:7: ( '%' )
            // InternalKEffects.g:34:9: '%'
            {
            match('%'); 

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
            // InternalKEffects.g:35:7: ( ':' )
            // InternalKEffects.g:35:9: ':'
            {
            match(':'); 

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
            // InternalKEffects.g:36:7: ( '\\'' )
            // InternalKEffects.g:36:9: '\\''
            {
            match('\''); 

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
            // InternalKEffects.g:37:7: ( '.' )
            // InternalKEffects.g:37:9: '.'
            {
            match('.'); 

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
            // InternalKEffects.g:38:7: ( '!' )
            // InternalKEffects.g:38:9: '!'
            {
            match('!'); 

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
            // InternalKEffects.g:39:7: ( '{' )
            // InternalKEffects.g:39:9: '{'
            {
            match('{'); 

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
            // InternalKEffects.g:40:7: ( '}' )
            // InternalKEffects.g:40:9: '}'
            {
            match('}'); 

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
            // InternalKEffects.g:41:7: ( '_' )
            // InternalKEffects.g:41:9: '_'
            {
            match('_'); 

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
            // InternalKEffects.g:42:7: ( '@' )
            // InternalKEffects.g:42:9: '@'
            {
            match('@'); 

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
            // InternalKEffects.g:43:7: ( '#' )
            // InternalKEffects.g:43:9: '#'
            {
            match('#'); 

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
            // InternalKEffects.g:44:7: ( '=' )
            // InternalKEffects.g:44:9: '='
            {
            match('='); 

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
            // InternalKEffects.g:45:7: ( '+=' )
            // InternalKEffects.g:45:9: '+='
            {
            match("+="); 


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
            // InternalKEffects.g:46:7: ( '-=' )
            // InternalKEffects.g:46:9: '-='
            {
            match("-="); 


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
            // InternalKEffects.g:47:7: ( '*=' )
            // InternalKEffects.g:47:9: '*='
            {
            match("*="); 


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
            // InternalKEffects.g:48:7: ( '/=' )
            // InternalKEffects.g:48:9: '/='
            {
            match("/="); 


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
            // InternalKEffects.g:49:7: ( '%=' )
            // InternalKEffects.g:49:9: '%='
            {
            match("%="); 


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
            // InternalKEffects.g:50:7: ( '&=' )
            // InternalKEffects.g:50:9: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:51:7: ( '|=' )
            // InternalKEffects.g:51:9: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:52:7: ( '^=' )
            // InternalKEffects.g:52:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:53:7: ( 'min=' )
            // InternalKEffects.g:53:9: 'min='
            {
            match("min="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:54:7: ( 'max=' )
            // InternalKEffects.g:54:9: 'max='
            {
            match("max="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:55:7: ( '++' )
            // InternalKEffects.g:55:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:56:7: ( '--' )
            // InternalKEffects.g:56:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:57:7: ( '==' )
            // InternalKEffects.g:57:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:58:7: ( '<=' )
            // InternalKEffects.g:58:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:59:7: ( '>=' )
            // InternalKEffects.g:59:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:60:7: ( '!=' )
            // InternalKEffects.g:60:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:61:7: ( 'pre' )
            // InternalKEffects.g:61:9: 'pre'
            {
            match("pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:62:7: ( '~' )
            // InternalKEffects.g:62:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:63:7: ( 'val' )
            // InternalKEffects.g:63:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:64:7: ( '?' )
            // InternalKEffects.g:64:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "RULE_HOSTCODE"
    public final void mRULE_HOSTCODE() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKEffects.g:5618:15: ( '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`' )
            // InternalKEffects.g:5618:17: '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`'
            {
            match('`'); 
            // InternalKEffects.g:5618:21: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )*
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
            	    // InternalKEffects.g:5618:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKEffects.g:5618:63: ~ ( ( '\\\\' | '`' ) )
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
            // InternalKEffects.g:5620:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalKEffects.g:5620:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalKEffects.g:5620:33: ( options {greedy=false; } : . )*
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
            	    // InternalKEffects.g:5620:61: .
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
            // InternalKEffects.g:5622:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalKEffects.g:5622:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKEffects.g:5622:31: ( options {greedy=false; } : . )*
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
            	    // InternalKEffects.g:5622:59: .
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
            // InternalKEffects.g:5624:28: ( '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKEffects.g:5624:30: '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//*"); 

            // InternalKEffects.g:5624:36: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKEffects.g:5624:36: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalKEffects.g:5624:52: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKEffects.g:5624:53: ( '\\r' )? '\\n'
                    {
                    // InternalKEffects.g:5624:53: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalKEffects.g:5624:53: '\\r'
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
            // InternalKEffects.g:5626:17: ( '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKEffects.g:5626:19: '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKEffects.g:5626:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKEffects.g:5626:31: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalKEffects.g:5626:47: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKEffects.g:5626:48: ( '\\r' )? '\\n'
                    {
                    // InternalKEffects.g:5626:48: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalKEffects.g:5626:48: '\\r'
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
            // InternalKEffects.g:5628:22: ( '0' .. '9' )
            // InternalKEffects.g:5628:24: '0' .. '9'
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
            // InternalKEffects.g:5630:10: ( ( RULE_NUMBER )+ )
            // InternalKEffects.g:5630:12: ( RULE_NUMBER )+
            {
            // InternalKEffects.g:5630:12: ( RULE_NUMBER )+
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
            	    // InternalKEffects.g:5630:12: RULE_NUMBER
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
            // InternalKEffects.g:5632:12: ( ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' ) )
            // InternalKEffects.g:5632:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            {
            // InternalKEffects.g:5632:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalKEffects.g:5632:15: ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // InternalKEffects.g:5632:15: ( RULE_NUMBER )+
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
                    	    // InternalKEffects.g:5632:15: RULE_NUMBER
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
                    // InternalKEffects.g:5632:32: ( RULE_NUMBER )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalKEffects.g:5632:32: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalKEffects.g:5632:45: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalKEffects.g:5632:46: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalKEffects.g:5632:56: ( '+' | '-' )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0=='+'||LA13_0=='-') ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalKEffects.g:
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

                            // InternalKEffects.g:5632:67: ( RULE_NUMBER )+
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
                            	    // InternalKEffects.g:5632:67: RULE_NUMBER
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

                    // InternalKEffects.g:5632:82: ( 'f' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='f') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalKEffects.g:5632:82: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:5632:87: ( RULE_NUMBER )+ 'f'
                    {
                    // InternalKEffects.g:5632:87: ( RULE_NUMBER )+
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
                    	    // InternalKEffects.g:5632:87: RULE_NUMBER
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
            // InternalKEffects.g:5634:14: ( ( 'true' | 'false' ) )
            // InternalKEffects.g:5634:16: ( 'true' | 'false' )
            {
            // InternalKEffects.g:5634:16: ( 'true' | 'false' )
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
                    // InternalKEffects.g:5634:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:5634:24: 'false'
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
            // InternalKEffects.g:5636:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalKEffects.g:5636:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalKEffects.g:5636:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalKEffects.g:5636:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKEffects.g:5636:61: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalKEffects.g:5638:9: ( ( '^' )? ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKEffects.g:5638:11: ( '^' )? ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKEffects.g:5638:11: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKEffects.g:5638:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // InternalKEffects.g:5638:16: ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' )
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
                    // InternalKEffects.g:5638:17: ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' )
                    {
                    // InternalKEffects.g:5638:17: ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' )
                    int alt24=2;
                    switch ( input.LA(1) ) {
                    case '_':
                        {
                        int LA24_1 = input.LA(2);

                        if ( ((LA24_1>='a' && LA24_1<='z')) ) {
                            alt24=1;
                        }
                        else if ( ((LA24_1>='A' && LA24_1<='Z')) ) {
                            alt24=2;
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
                            // InternalKEffects.g:5638:18: ( '_' )? 'a' .. 'z'
                            {
                            // InternalKEffects.g:5638:18: ( '_' )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0=='_') ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // InternalKEffects.g:5638:18: '_'
                                    {
                                    match('_'); 

                                    }
                                    break;

                            }

                            matchRange('a','z'); 

                            }
                            break;
                        case 2 :
                            // InternalKEffects.g:5638:32: ( '_' )? 'A' .. 'Z'
                            {
                            // InternalKEffects.g:5638:32: ( '_' )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0=='_') ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // InternalKEffects.g:5638:32: '_'
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
                    // InternalKEffects.g:5638:47: '_' '0' .. '9'
                    {
                    match('_'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 3 :
                    // InternalKEffects.g:5638:60: '__'
                    {
                    match("__"); 


                    }
                    break;

            }

            // InternalKEffects.g:5638:66: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKEffects.g:
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
            // InternalKEffects.g:5640:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKEffects.g:5640:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKEffects.g:5640:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalKEffects.g:
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
            // InternalKEffects.g:5642:16: ( . )
            // InternalKEffects.g:5642:18: .
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
        // InternalKEffects.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER )
        int alt28=66;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // InternalKEffects.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalKEffects.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalKEffects.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalKEffects.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalKEffects.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalKEffects.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalKEffects.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalKEffects.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalKEffects.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalKEffects.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalKEffects.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalKEffects.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalKEffects.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalKEffects.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalKEffects.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalKEffects.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalKEffects.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalKEffects.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalKEffects.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalKEffects.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalKEffects.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalKEffects.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalKEffects.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalKEffects.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalKEffects.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalKEffects.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalKEffects.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalKEffects.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalKEffects.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalKEffects.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalKEffects.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalKEffects.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalKEffects.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalKEffects.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalKEffects.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalKEffects.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalKEffects.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalKEffects.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalKEffects.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalKEffects.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalKEffects.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalKEffects.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalKEffects.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalKEffects.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalKEffects.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalKEffects.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalKEffects.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalKEffects.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalKEffects.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalKEffects.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalKEffects.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalKEffects.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalKEffects.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalKEffects.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalKEffects.g:1:334: RULE_HOSTCODE
                {
                mRULE_HOSTCODE(); 

                }
                break;
            case 56 :
                // InternalKEffects.g:1:348: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 57 :
                // InternalKEffects.g:1:372: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 58 :
                // InternalKEffects.g:1:388: RULE_SL_COMMENT_ANNOTATION
                {
                mRULE_SL_COMMENT_ANNOTATION(); 

                }
                break;
            case 59 :
                // InternalKEffects.g:1:415: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 60 :
                // InternalKEffects.g:1:431: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 61 :
                // InternalKEffects.g:1:440: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 62 :
                // InternalKEffects.g:1:451: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 63 :
                // InternalKEffects.g:1:464: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 64 :
                // InternalKEffects.g:1:476: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 65 :
                // InternalKEffects.g:1:484: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 66 :
                // InternalKEffects.g:1:492: RULE_ANY_OTHER
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
        "\2\uffff\1\2\1\1";
    static final String DFA18_specialS =
        "\4\uffff}>";
    static final String[] DFA18_transitionS = {
            "\12\1",
            "\1\3\1\uffff\12\1\54\uffff\1\2",
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
            return "5632:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA28_eotS =
        "\1\uffff\1\53\1\uffff\1\56\3\uffff\1\56\1\65\1\70\1\56\1\74\1\77\1\101\1\104\1\107\1\111\1\115\1\117\3\uffff\1\124\2\uffff\1\127\2\uffff\1\133\1\56\1\uffff\1\56\1\uffff\1\51\1\142\2\56\1\51\7\uffff\1\56\4\uffff\1\56\3\uffff\1\154\2\uffff\1\56\42\uffff\2\56\1\uffff\1\56\4\uffff\1\142\2\56\2\uffff\2\56\2\uffff\1\56\1\173\4\uffff\2\56\1\176\5\56\4\uffff\1\u0084\3\56\1\u0088\1\uffff\1\u0084\1\56\1\u008a\1\uffff\1\56\1\uffff\1\u008c\1\uffff";
    static final String DFA28_eofS =
        "\u008d\uffff";
    static final String DFA28_minS =
        "\1\0\1\51\1\uffff\1\143\3\uffff\1\170\1\74\1\75\1\162\1\75\1\46\1\75\1\53\1\55\1\75\1\52\1\75\3\uffff\1\75\2\uffff\1\60\2\uffff\1\75\1\141\1\uffff\1\141\1\uffff\1\0\1\56\1\162\1\141\1\0\7\uffff\1\150\4\uffff\1\164\3\uffff\1\76\2\uffff\1\145\21\uffff\2\0\17\uffff\1\156\1\170\1\uffff\1\154\4\uffff\1\56\1\165\1\154\2\uffff\2\145\2\uffff\1\156\1\60\4\uffff\2\75\1\60\1\145\1\163\1\144\1\162\1\164\4\uffff\1\60\1\145\1\165\1\156\1\60\1\uffff\1\60\1\154\1\60\1\uffff\1\145\1\uffff\1\60\1\uffff";
    static final String DFA28_maxS =
        "\1\uffff\1\51\1\uffff\1\143\3\uffff\1\170\1\75\1\76\1\162\1\174\1\75\1\172\5\75\3\uffff\1\75\2\uffff\1\172\2\uffff\1\75\1\151\1\uffff\1\141\1\uffff\1\uffff\1\146\1\162\1\141\1\uffff\7\uffff\1\150\4\uffff\1\164\3\uffff\1\76\2\uffff\1\151\21\uffff\2\uffff\17\uffff\1\156\1\170\1\uffff\1\154\4\uffff\1\146\1\165\1\154\2\uffff\2\145\2\uffff\1\156\1\172\4\uffff\2\75\1\172\1\145\1\163\1\144\1\162\1\164\4\uffff\1\172\1\145\1\165\1\156\1\172\1\uffff\1\172\1\154\1\172\1\uffff\1\145\1\uffff\1\172\1\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\14\uffff\1\31\1\32\1\33\1\uffff\1\35\1\36\1\uffff\1\40\1\41\2\uffff\1\64\1\uffff\1\66\5\uffff\2\100\1\101\1\102\1\7\1\1\1\2\1\uffff\1\100\1\4\1\5\1\6\1\uffff\1\21\1\60\1\11\1\uffff\1\61\1\12\1\uffff\1\14\1\51\1\16\1\15\1\50\1\20\1\52\1\17\1\43\1\55\1\24\1\44\1\56\1\25\1\45\1\26\1\46\2\uffff\1\27\1\47\1\30\1\31\1\32\1\33\1\62\1\34\1\35\1\36\1\37\1\40\1\41\1\57\1\42\2\uffff\1\64\1\uffff\1\66\1\67\1\74\1\75\3\uffff\1\77\1\101\2\uffff\1\23\1\22\2\uffff\1\70\1\71\1\72\1\73\10\uffff\1\63\1\53\1\54\1\65\5\uffff\1\76\3\uffff\1\13\1\uffff\1\10\1\uffff\1\3";
    static final String DFA28_specialS =
        "\1\3\40\uffff\1\0\3\uffff\1\4\45\uffff\1\1\1\2\100\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\26\1\45\1\33\1\51\1\22\1\14\1\24\1\1\1\2\1\20\1\16\1\6\1\17\1\25\1\21\12\42\1\23\1\51\1\10\1\34\1\11\1\40\1\32\32\47\1\4\1\51\1\5\1\15\1\31\1\41\4\46\1\7\1\44\6\46\1\35\2\46\1\12\2\46\1\3\1\43\1\46\1\37\4\46\1\27\1\13\1\30\1\36\uff81\51",
            "\1\52",
            "",
            "\1\55",
            "",
            "",
            "",
            "\1\62",
            "\1\63\1\64",
            "\1\67\1\66",
            "\1\71",
            "\1\73\76\uffff\1\72",
            "\1\75\26\uffff\1\76",
            "\1\100\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\103\21\uffff\1\102",
            "\1\106\17\uffff\1\105",
            "\1\110",
            "\1\113\4\uffff\1\114\15\uffff\1\112",
            "\1\116",
            "",
            "",
            "",
            "\1\123",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\132",
            "\1\135\7\uffff\1\134",
            "",
            "\1\137",
            "",
            "\0\141",
            "\1\143\1\uffff\12\144\54\uffff\1\143",
            "\1\145",
            "\1\146",
            "\0\147",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\151",
            "",
            "",
            "",
            "",
            "\1\152",
            "",
            "",
            "",
            "\1\153",
            "",
            "",
            "\1\156\3\uffff\1\155",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\160\1\157\uffd5\160",
            "\52\162\1\161\uffd5\162",
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
            "",
            "",
            "",
            "",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "",
            "",
            "",
            "",
            "\1\143\1\uffff\12\144\54\uffff\1\143",
            "\1\166",
            "\1\167",
            "",
            "",
            "\1\170",
            "\1\171",
            "",
            "",
            "\1\172",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\1\174",
            "\1\175",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0089",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u008b",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_33 = input.LA(1);

                        s = -1;
                        if ( ((LA28_33>='\u0000' && LA28_33<='\uFFFF')) ) {s = 97;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_75 = input.LA(1);

                        s = -1;
                        if ( (LA28_75=='*') ) {s = 111;}

                        else if ( ((LA28_75>='\u0000' && LA28_75<=')')||(LA28_75>='+' && LA28_75<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_76 = input.LA(1);

                        s = -1;
                        if ( (LA28_76=='*') ) {s = 113;}

                        else if ( ((LA28_76>='\u0000' && LA28_76<=')')||(LA28_76>='+' && LA28_76<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_0 = input.LA(1);

                        s = -1;
                        if ( (LA28_0=='(') ) {s = 1;}

                        else if ( (LA28_0==')') ) {s = 2;}

                        else if ( (LA28_0=='s') ) {s = 3;}

                        else if ( (LA28_0=='[') ) {s = 4;}

                        else if ( (LA28_0==']') ) {s = 5;}

                        else if ( (LA28_0==',') ) {s = 6;}

                        else if ( (LA28_0=='e') ) {s = 7;}

                        else if ( (LA28_0=='<') ) {s = 8;}

                        else if ( (LA28_0=='>') ) {s = 9;}

                        else if ( (LA28_0=='p') ) {s = 10;}

                        else if ( (LA28_0=='|') ) {s = 11;}

                        else if ( (LA28_0=='&') ) {s = 12;}

                        else if ( (LA28_0=='^') ) {s = 13;}

                        else if ( (LA28_0=='+') ) {s = 14;}

                        else if ( (LA28_0=='-') ) {s = 15;}

                        else if ( (LA28_0=='*') ) {s = 16;}

                        else if ( (LA28_0=='/') ) {s = 17;}

                        else if ( (LA28_0=='%') ) {s = 18;}

                        else if ( (LA28_0==':') ) {s = 19;}

                        else if ( (LA28_0=='\'') ) {s = 20;}

                        else if ( (LA28_0=='.') ) {s = 21;}

                        else if ( (LA28_0=='!') ) {s = 22;}

                        else if ( (LA28_0=='{') ) {s = 23;}

                        else if ( (LA28_0=='}') ) {s = 24;}

                        else if ( (LA28_0=='_') ) {s = 25;}

                        else if ( (LA28_0=='@') ) {s = 26;}

                        else if ( (LA28_0=='#') ) {s = 27;}

                        else if ( (LA28_0=='=') ) {s = 28;}

                        else if ( (LA28_0=='m') ) {s = 29;}

                        else if ( (LA28_0=='~') ) {s = 30;}

                        else if ( (LA28_0=='v') ) {s = 31;}

                        else if ( (LA28_0=='?') ) {s = 32;}

                        else if ( (LA28_0=='`') ) {s = 33;}

                        else if ( ((LA28_0>='0' && LA28_0<='9')) ) {s = 34;}

                        else if ( (LA28_0=='t') ) {s = 35;}

                        else if ( (LA28_0=='f') ) {s = 36;}

                        else if ( (LA28_0=='\"') ) {s = 37;}

                        else if ( ((LA28_0>='a' && LA28_0<='d')||(LA28_0>='g' && LA28_0<='l')||(LA28_0>='n' && LA28_0<='o')||(LA28_0>='q' && LA28_0<='r')||LA28_0=='u'||(LA28_0>='w' && LA28_0<='z')) ) {s = 38;}

                        else if ( ((LA28_0>='A' && LA28_0<='Z')) ) {s = 39;}

                        else if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {s = 40;}

                        else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\u001F')||LA28_0=='$'||LA28_0==';'||LA28_0=='\\'||(LA28_0>='\u007F' && LA28_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_37 = input.LA(1);

                        s = -1;
                        if ( ((LA28_37>='\u0000' && LA28_37<='\uFFFF')) ) {s = 103;}

                        else s = 41;

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