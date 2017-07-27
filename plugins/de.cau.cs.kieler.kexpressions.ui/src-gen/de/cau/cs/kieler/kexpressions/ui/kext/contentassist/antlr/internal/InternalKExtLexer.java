package de.cau.cs.kieler.kexpressions.ui.kext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKExtLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=5;
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
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
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_SL_COMMENT_ANNOTATION=11;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
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
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalKExtLexer() {;} 
    public InternalKExtLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKExtLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKExt.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:11:7: ( 'pre' )
            // InternalKExt.g:11:9: 'pre'
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
            // InternalKExt.g:12:7: ( '|' )
            // InternalKExt.g:12:9: '|'
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
            // InternalKExt.g:13:7: ( '&' )
            // InternalKExt.g:13:9: '&'
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
            // InternalKExt.g:14:7: ( '!' )
            // InternalKExt.g:14:9: '!'
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
            // InternalKExt.g:15:7: ( '+' )
            // InternalKExt.g:15:9: '+'
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
            // InternalKExt.g:16:7: ( '-' )
            // InternalKExt.g:16:9: '-'
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
            // InternalKExt.g:17:7: ( '*' )
            // InternalKExt.g:17:9: '*'
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
            // InternalKExt.g:18:7: ( '%' )
            // InternalKExt.g:18:9: '%'
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
            // InternalKExt.g:19:7: ( '/' )
            // InternalKExt.g:19:9: '/'
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
            // InternalKExt.g:20:7: ( 'val' )
            // InternalKExt.g:20:9: 'val'
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
            // InternalKExt.g:21:7: ( '||' )
            // InternalKExt.g:21:9: '||'
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
            // InternalKExt.g:22:7: ( '&&' )
            // InternalKExt.g:22:9: '&&'
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
            // InternalKExt.g:23:7: ( '()' )
            // InternalKExt.g:23:9: '()'
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
            // InternalKExt.g:24:7: ( '.' )
            // InternalKExt.g:24:9: '.'
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
            // InternalKExt.g:25:7: ( 'conflict' )
            // InternalKExt.g:25:9: 'conflict'
            {
            match("conflict"); 


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
            // InternalKExt.g:26:7: ( 'confluent' )
            // InternalKExt.g:26:9: 'confluent'
            {
            match("confluent"); 


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
            // InternalKExt.g:27:7: ( '=' )
            // InternalKExt.g:27:9: '='
            {
            match('='); 

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
            // InternalKExt.g:28:7: ( '+=' )
            // InternalKExt.g:28:9: '+='
            {
            match("+="); 


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
            // InternalKExt.g:29:7: ( '-=' )
            // InternalKExt.g:29:9: '-='
            {
            match("-="); 


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
            // InternalKExt.g:30:7: ( '*=' )
            // InternalKExt.g:30:9: '*='
            {
            match("*="); 


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
            // InternalKExt.g:31:7: ( '/=' )
            // InternalKExt.g:31:9: '/='
            {
            match("/="); 


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
            // InternalKExt.g:32:7: ( '%=' )
            // InternalKExt.g:32:9: '%='
            {
            match("%="); 


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
            // InternalKExt.g:33:7: ( '&=' )
            // InternalKExt.g:33:9: '&='
            {
            match("&="); 


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
            // InternalKExt.g:34:7: ( '|=' )
            // InternalKExt.g:34:9: '|='
            {
            match("|="); 


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
            // InternalKExt.g:35:7: ( '^=' )
            // InternalKExt.g:35:9: '^='
            {
            match("^="); 


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
            // InternalKExt.g:36:7: ( 'min=' )
            // InternalKExt.g:36:9: 'min='
            {
            match("min="); 


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
            // InternalKExt.g:37:7: ( 'max=' )
            // InternalKExt.g:37:9: 'max='
            {
            match("max="); 


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
            // InternalKExt.g:38:7: ( '++' )
            // InternalKExt.g:38:9: '++'
            {
            match("++"); 


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
            // InternalKExt.g:39:7: ( '--' )
            // InternalKExt.g:39:9: '--'
            {
            match("--"); 


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
            // InternalKExt.g:40:7: ( '==' )
            // InternalKExt.g:40:9: '=='
            {
            match("=="); 


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
            // InternalKExt.g:41:7: ( '<' )
            // InternalKExt.g:41:9: '<'
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
            // InternalKExt.g:42:7: ( '<=' )
            // InternalKExt.g:42:9: '<='
            {
            match("<="); 


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
            // InternalKExt.g:43:7: ( '>' )
            // InternalKExt.g:43:9: '>'
            {
            match('>'); 

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
            // InternalKExt.g:44:7: ( '>=' )
            // InternalKExt.g:44:9: '>='
            {
            match(">="); 


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
            // InternalKExt.g:45:7: ( '!=' )
            // InternalKExt.g:45:9: '!='
            {
            match("!="); 


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
            // InternalKExt.g:46:7: ( 'pure' )
            // InternalKExt.g:46:9: 'pure'
            {
            match("pure"); 


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
            // InternalKExt.g:47:7: ( 'bool' )
            // InternalKExt.g:47:9: 'bool'
            {
            match("bool"); 


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
            // InternalKExt.g:48:7: ( 'unsigned' )
            // InternalKExt.g:48:9: 'unsigned'
            {
            match("unsigned"); 


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
            // InternalKExt.g:49:7: ( 'int' )
            // InternalKExt.g:49:9: 'int'
            {
            match("int"); 


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
            // InternalKExt.g:50:7: ( 'float' )
            // InternalKExt.g:50:9: 'float'
            {
            match("float"); 


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
            // InternalKExt.g:51:7: ( 'string' )
            // InternalKExt.g:51:9: 'string'
            {
            match("string"); 


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
            // InternalKExt.g:52:7: ( 'host' )
            // InternalKExt.g:52:9: 'host'
            {
            match("host"); 


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
            // InternalKExt.g:53:7: ( 'none' )
            // InternalKExt.g:53:9: 'none'
            {
            match("none"); 


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
            // InternalKExt.g:54:7: ( 'max' )
            // InternalKExt.g:54:9: 'max'
            {
            match("max"); 


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
            // InternalKExt.g:55:7: ( 'min' )
            // InternalKExt.g:55:9: 'min'
            {
            match("min"); 


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
            // InternalKExt.g:56:7: ( 'scope' )
            // InternalKExt.g:56:9: 'scope'
            {
            match("scope"); 


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
            // InternalKExt.g:57:7: ( '{' )
            // InternalKExt.g:57:9: '{'
            {
            match('{'); 

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
            // InternalKExt.g:58:7: ( '}' )
            // InternalKExt.g:58:9: '}'
            {
            match('}'); 

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
            // InternalKExt.g:59:7: ( 'expression' )
            // InternalKExt.g:59:9: 'expression'
            {
            match("expression"); 


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
            // InternalKExt.g:60:7: ( ';' )
            // InternalKExt.g:60:9: ';'
            {
            match(';'); 

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
            // InternalKExt.g:61:7: ( ',' )
            // InternalKExt.g:61:9: ','
            {
            match(','); 

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
            // InternalKExt.g:62:7: ( ':' )
            // InternalKExt.g:62:9: ':'
            {
            match(':'); 

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
            // InternalKExt.g:63:7: ( 'ref' )
            // InternalKExt.g:63:9: 'ref'
            {
            match("ref"); 


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
            // InternalKExt.g:64:7: ( 'extern' )
            // InternalKExt.g:64:9: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:65:7: ( 'schedule' )
            // InternalKExt.g:65:9: 'schedule'
            {
            match("schedule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:66:7: ( 'prio' )
            // InternalKExt.g:66:9: 'prio'
            {
            match("prio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:67:7: ( '[' )
            // InternalKExt.g:67:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:68:7: ( ']' )
            // InternalKExt.g:68:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:69:7: ( 'combine' )
            // InternalKExt.g:69:9: 'combine'
            {
            match("combine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:70:7: ( '(' )
            // InternalKExt.g:70:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:71:7: ( ')' )
            // InternalKExt.g:71:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:72:7: ( 'print' )
            // InternalKExt.g:72:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:73:7: ( '\\'' )
            // InternalKExt.g:73:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:74:7: ( '@' )
            // InternalKExt.g:74:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:75:7: ( '#' )
            // InternalKExt.g:75:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:76:7: ( 'const' )
            // InternalKExt.g:76:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:77:7: ( 'input' )
            // InternalKExt.g:77:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:78:7: ( 'output' )
            // InternalKExt.g:78:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:79:7: ( 'static' )
            // InternalKExt.g:79:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:80:7: ( 'signal' )
            // InternalKExt.g:80:9: 'signal'
            {
            match("signal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "RULE_HOSTCODE"
    public final void mRULE_HOSTCODE() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:18720:15: ( '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`' )
            // InternalKExt.g:18720:17: '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`'
            {
            match('`'); 
            // InternalKExt.g:18720:21: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )*
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
            	    // InternalKExt.g:18720:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKExt.g:18720:63: ~ ( ( '\\\\' | '`' ) )
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
            // InternalKExt.g:18722:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalKExt.g:18722:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalKExt.g:18722:33: ( options {greedy=false; } : . )*
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
            	    // InternalKExt.g:18722:61: .
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
            // InternalKExt.g:18724:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalKExt.g:18724:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKExt.g:18724:31: ( options {greedy=false; } : . )*
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
            	    // InternalKExt.g:18724:59: .
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
            // InternalKExt.g:18726:28: ( '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKExt.g:18726:30: '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//*"); 

            // InternalKExt.g:18726:36: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKExt.g:18726:36: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalKExt.g:18726:52: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKExt.g:18726:53: ( '\\r' )? '\\n'
                    {
                    // InternalKExt.g:18726:53: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalKExt.g:18726:53: '\\r'
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
            // InternalKExt.g:18728:17: ( '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKExt.g:18728:19: '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKExt.g:18728:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKExt.g:18728:31: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalKExt.g:18728:47: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKExt.g:18728:48: ( '\\r' )? '\\n'
                    {
                    // InternalKExt.g:18728:48: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalKExt.g:18728:48: '\\r'
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
            // InternalKExt.g:18730:22: ( '0' .. '9' )
            // InternalKExt.g:18730:24: '0' .. '9'
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
            // InternalKExt.g:18732:10: ( ( RULE_NUMBER )+ )
            // InternalKExt.g:18732:12: ( RULE_NUMBER )+
            {
            // InternalKExt.g:18732:12: ( RULE_NUMBER )+
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
            	    // InternalKExt.g:18732:12: RULE_NUMBER
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
            // InternalKExt.g:18734:12: ( ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' ) )
            // InternalKExt.g:18734:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            {
            // InternalKExt.g:18734:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalKExt.g:18734:15: ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // InternalKExt.g:18734:15: ( RULE_NUMBER )+
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
                    	    // InternalKExt.g:18734:15: RULE_NUMBER
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
                    // InternalKExt.g:18734:32: ( RULE_NUMBER )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalKExt.g:18734:32: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalKExt.g:18734:45: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalKExt.g:18734:46: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalKExt.g:18734:56: ( '+' | '-' )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0=='+'||LA13_0=='-') ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalKExt.g:
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

                            // InternalKExt.g:18734:67: ( RULE_NUMBER )+
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
                            	    // InternalKExt.g:18734:67: RULE_NUMBER
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

                    // InternalKExt.g:18734:82: ( 'f' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='f') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalKExt.g:18734:82: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:18734:87: ( RULE_NUMBER )+ 'f'
                    {
                    // InternalKExt.g:18734:87: ( RULE_NUMBER )+
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
                    	    // InternalKExt.g:18734:87: RULE_NUMBER
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
            // InternalKExt.g:18736:14: ( ( 'true' | 'false' ) )
            // InternalKExt.g:18736:16: ( 'true' | 'false' )
            {
            // InternalKExt.g:18736:16: ( 'true' | 'false' )
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
                    // InternalKExt.g:18736:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalKExt.g:18736:24: 'false'
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
            // InternalKExt.g:18738:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalKExt.g:18738:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalKExt.g:18738:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalKExt.g:18738:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKExt.g:18738:61: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalKExt.g:18740:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKExt.g:18740:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKExt.g:18740:11: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKExt.g:18740:11: '^'
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

            // InternalKExt.g:18740:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKExt.g:
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
            	    break loop22;
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
            // InternalKExt.g:18742:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKExt.g:18742:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKExt.g:18742:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalKExt.g:
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
            // InternalKExt.g:18744:16: ( . )
            // InternalKExt.g:18744:18: .
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
        // InternalKExt.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER )
        int alt24=82;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // InternalKExt.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalKExt.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalKExt.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalKExt.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalKExt.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalKExt.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalKExt.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalKExt.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalKExt.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalKExt.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalKExt.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalKExt.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalKExt.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalKExt.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalKExt.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalKExt.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalKExt.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalKExt.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalKExt.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalKExt.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalKExt.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalKExt.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalKExt.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalKExt.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalKExt.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalKExt.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalKExt.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalKExt.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalKExt.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalKExt.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalKExt.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalKExt.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalKExt.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalKExt.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalKExt.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalKExt.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalKExt.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalKExt.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalKExt.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalKExt.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalKExt.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalKExt.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalKExt.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalKExt.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalKExt.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalKExt.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalKExt.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalKExt.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalKExt.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalKExt.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalKExt.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalKExt.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalKExt.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalKExt.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalKExt.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalKExt.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalKExt.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalKExt.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalKExt.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalKExt.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalKExt.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // InternalKExt.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // InternalKExt.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // InternalKExt.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // InternalKExt.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // InternalKExt.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // InternalKExt.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // InternalKExt.g:1:412: T__84
                {
                mT__84(); 

                }
                break;
            case 69 :
                // InternalKExt.g:1:418: T__85
                {
                mT__85(); 

                }
                break;
            case 70 :
                // InternalKExt.g:1:424: T__86
                {
                mT__86(); 

                }
                break;
            case 71 :
                // InternalKExt.g:1:430: RULE_HOSTCODE
                {
                mRULE_HOSTCODE(); 

                }
                break;
            case 72 :
                // InternalKExt.g:1:444: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 73 :
                // InternalKExt.g:1:468: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 74 :
                // InternalKExt.g:1:484: RULE_SL_COMMENT_ANNOTATION
                {
                mRULE_SL_COMMENT_ANNOTATION(); 

                }
                break;
            case 75 :
                // InternalKExt.g:1:511: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 76 :
                // InternalKExt.g:1:527: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 77 :
                // InternalKExt.g:1:536: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 78 :
                // InternalKExt.g:1:547: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 79 :
                // InternalKExt.g:1:560: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 80 :
                // InternalKExt.g:1:572: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 81 :
                // InternalKExt.g:1:580: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 82 :
                // InternalKExt.g:1:588: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA24 dfa24 = new DFA24(this);
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
            return "18734:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\1\61\1\64\1\67\1\71\1\74\1\77\1\101\1\103\1\107\1\61\1\112\1\uffff\1\61\1\116\1\56\1\61\1\123\1\125\7\61\2\uffff\1\61\3\uffff\1\61\6\uffff\1\61\1\56\1\157\1\61\1\56\3\uffff\2\61\27\uffff\1\61\3\uffff\1\61\3\uffff\2\61\4\uffff\12\61\2\uffff\1\61\3\uffff\1\61\6\uffff\1\61\2\uffff\1\157\1\uffff\1\61\2\uffff\1\u0093\2\61\4\uffff\1\u0097\2\61\1\u009c\1\u009e\2\61\1\u00a1\14\61\1\u00ae\2\61\1\uffff\1\u00b1\1\61\1\u00b3\1\uffff\3\61\4\uffff\1\u00b7\1\61\1\uffff\10\61\1\u00c1\1\u00c2\2\61\1\uffff\1\61\1\u00c6\1\uffff\1\u00c7\1\uffff\1\61\1\u00ca\1\61\1\uffff\1\61\1\u00cd\1\u00ce\1\u00c6\2\61\1\u00d1\2\61\2\uffff\3\61\2\uffff\2\61\1\uffff\2\61\2\uffff\1\u00db\1\u00dc\1\uffff\1\61\1\u00de\1\61\1\u00e0\1\u00e1\2\61\1\u00e4\1\61\2\uffff\1\61\1\uffff\1\61\2\uffff\1\u00e8\1\61\1\uffff\1\u00ea\1\u00eb\1\61\1\uffff\1\u00ed\2\uffff\1\61\1\uffff\1\u00ef\1\uffff";
    static final String DFA24_eofS =
        "\u00f0\uffff";
    static final String DFA24_minS =
        "\1\0\1\162\1\75\1\46\1\75\1\53\1\55\2\75\1\52\1\141\1\51\1\uffff\1\157\2\75\1\141\2\75\1\157\2\156\1\141\1\143\2\157\2\uffff\1\170\3\uffff\1\145\6\uffff\1\165\1\0\1\56\1\162\1\0\3\uffff\1\145\1\162\24\uffff\2\0\1\uffff\1\154\3\uffff\1\155\3\uffff\1\156\1\170\4\uffff\1\157\1\163\1\160\1\157\1\154\1\141\1\150\1\147\1\163\1\156\2\uffff\1\160\3\uffff\1\146\6\uffff\1\164\2\uffff\1\56\1\uffff\1\165\2\uffff\1\60\1\156\1\145\4\uffff\1\60\1\146\1\142\2\60\1\154\1\151\1\60\1\165\1\141\1\163\1\151\1\164\1\160\1\145\1\156\1\164\1\145\1\162\1\145\1\60\1\160\1\145\1\uffff\1\60\1\164\1\60\1\uffff\1\154\1\164\1\151\4\uffff\1\60\1\147\1\uffff\2\164\1\145\1\156\1\151\1\145\1\144\1\141\2\60\1\145\1\162\1\uffff\1\165\1\60\1\uffff\1\60\1\uffff\1\151\1\60\1\156\1\uffff\1\156\3\60\1\147\1\143\1\60\1\165\1\154\2\uffff\1\163\1\156\1\164\2\uffff\1\143\1\145\1\uffff\2\145\2\uffff\2\60\1\uffff\1\154\1\60\1\163\2\60\1\164\1\156\1\60\1\144\2\uffff\1\145\1\uffff\1\151\2\uffff\1\60\1\164\1\uffff\2\60\1\157\1\uffff\1\60\2\uffff\1\156\1\uffff\1\60\1\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\165\1\174\7\75\1\141\1\51\1\uffff\1\157\1\75\1\172\1\151\2\75\1\157\2\156\1\154\1\164\2\157\2\uffff\1\170\3\uffff\1\145\6\uffff\1\165\1\uffff\1\146\1\162\1\uffff\3\uffff\1\151\1\162\24\uffff\2\uffff\1\uffff\1\154\3\uffff\1\156\3\uffff\1\156\1\170\4\uffff\1\157\1\163\1\164\1\157\1\154\1\162\1\157\1\147\1\163\1\156\2\uffff\1\164\3\uffff\1\146\6\uffff\1\164\2\uffff\1\146\1\uffff\1\165\2\uffff\1\172\1\157\1\145\4\uffff\1\172\1\163\1\142\2\172\1\154\1\151\1\172\1\165\1\141\1\163\1\151\1\164\1\160\1\145\1\156\1\164\1\145\1\162\1\145\1\172\1\160\1\145\1\uffff\1\172\1\164\1\172\1\uffff\1\154\1\164\1\151\4\uffff\1\172\1\147\1\uffff\2\164\1\145\1\156\1\151\1\145\1\144\1\141\2\172\1\145\1\162\1\uffff\1\165\1\172\1\uffff\1\172\1\uffff\1\165\1\172\1\156\1\uffff\1\156\3\172\1\147\1\143\1\172\1\165\1\154\2\uffff\1\163\1\156\1\164\2\uffff\1\143\1\145\1\uffff\2\145\2\uffff\2\172\1\uffff\1\154\1\172\1\163\2\172\1\164\1\156\1\172\1\144\2\uffff\1\145\1\uffff\1\151\2\uffff\1\172\1\164\1\uffff\2\172\1\157\1\uffff\1\172\2\uffff\1\156\1\uffff\1\172\1\uffff";
    static final String DFA24_acceptS =
        "\14\uffff\1\16\15\uffff\1\57\1\60\1\uffff\1\62\1\63\1\64\1\uffff\1\71\1\72\1\75\1\77\1\100\1\101\5\uffff\1\120\1\121\1\122\2\uffff\1\120\1\13\1\30\1\2\1\14\1\27\1\3\1\43\1\4\1\22\1\34\1\5\1\23\1\35\1\6\1\24\1\7\1\26\1\10\1\25\2\uffff\1\11\1\uffff\1\15\1\74\1\16\1\uffff\1\36\1\21\1\31\2\uffff\1\40\1\37\1\42\1\41\12\uffff\1\57\1\60\1\uffff\1\62\1\63\1\64\1\uffff\1\71\1\72\1\75\1\77\1\100\1\101\1\uffff\1\107\1\114\1\uffff\1\115\1\uffff\1\117\1\121\3\uffff\1\110\1\111\1\112\1\113\27\uffff\1\1\3\uffff\1\12\3\uffff\1\32\1\55\1\33\1\54\2\uffff\1\47\14\uffff\1\65\2\uffff\1\70\1\uffff\1\44\3\uffff\1\45\11\uffff\1\52\1\53\3\uffff\1\116\1\76\2\uffff\1\102\2\uffff\1\103\1\50\2\uffff\1\56\11\uffff\1\51\1\105\1\uffff\1\106\1\uffff\1\66\1\104\2\uffff\1\73\3\uffff\1\17\1\uffff\1\46\1\67\1\uffff\1\20\1\uffff\1\61";
    static final String DFA24_specialS =
        "\1\0\47\uffff\1\4\2\uffff\1\3\31\uffff\1\1\1\2\u00a9\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\4\1\53\1\46\1\56\1\10\1\3\1\44\1\13\1\43\1\7\1\5\1\36\1\6\1\14\1\11\12\51\1\37\1\35\1\21\1\16\1\22\1\56\1\45\32\54\1\41\1\56\1\42\1\17\1\54\1\50\1\54\1\23\1\15\1\54\1\34\1\26\1\54\1\30\1\25\3\54\1\20\1\31\1\47\1\1\1\54\1\40\1\27\1\52\1\24\1\12\4\54\1\32\1\2\1\33\uff82\56",
            "\1\57\2\uffff\1\60",
            "\1\63\76\uffff\1\62",
            "\1\65\26\uffff\1\66",
            "\1\70",
            "\1\73\21\uffff\1\72",
            "\1\76\17\uffff\1\75",
            "\1\100",
            "\1\102",
            "\1\105\4\uffff\1\106\15\uffff\1\104",
            "\1\110",
            "\1\111",
            "",
            "\1\114",
            "\1\115",
            "\1\117\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\121\7\uffff\1\120",
            "\1\122",
            "\1\124",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\132\12\uffff\1\131",
            "\1\134\5\uffff\1\135\12\uffff\1\133",
            "\1\136",
            "\1\137",
            "",
            "",
            "\1\142",
            "",
            "",
            "",
            "\1\146",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\155",
            "\0\156",
            "\1\161\1\uffff\12\160\54\uffff\1\161",
            "\1\162",
            "\0\163",
            "",
            "",
            "",
            "\1\165\3\uffff\1\166",
            "\1\167",
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
            "",
            "",
            "",
            "\52\171\1\170\uffd5\171",
            "\52\173\1\172\uffd5\173",
            "",
            "\1\174",
            "",
            "",
            "",
            "\1\176\1\175",
            "",
            "",
            "",
            "\1\177",
            "\1\u0080",
            "",
            "",
            "",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0084\3\uffff\1\u0083",
            "\1\u0085",
            "\1\u0086",
            "\1\u0088\20\uffff\1\u0087",
            "\1\u008a\6\uffff\1\u0089",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "",
            "\1\u008e\3\uffff\1\u008f",
            "",
            "",
            "",
            "\1\u0090",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0091",
            "",
            "",
            "\1\161\1\uffff\12\160\54\uffff\1\161",
            "",
            "\1\u0092",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0095\1\u0094",
            "\1\u0096",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0098\14\uffff\1\u0099",
            "\1\u009a",
            "\12\61\3\uffff\1\u009b\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\3\uffff\1\u009d\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u009f",
            "\1\u00a0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00b2",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00c8\13\uffff\1\u00c9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00cf",
            "\1\u00d0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00dd",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00df",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00e2",
            "\1\u00e3",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00e5",
            "",
            "",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00e9",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00ec",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u00ee",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
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
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
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

                        else if ( (LA24_0=='c') ) {s = 13;}

                        else if ( (LA24_0=='=') ) {s = 14;}

                        else if ( (LA24_0=='^') ) {s = 15;}

                        else if ( (LA24_0=='m') ) {s = 16;}

                        else if ( (LA24_0=='<') ) {s = 17;}

                        else if ( (LA24_0=='>') ) {s = 18;}

                        else if ( (LA24_0=='b') ) {s = 19;}

                        else if ( (LA24_0=='u') ) {s = 20;}

                        else if ( (LA24_0=='i') ) {s = 21;}

                        else if ( (LA24_0=='f') ) {s = 22;}

                        else if ( (LA24_0=='s') ) {s = 23;}

                        else if ( (LA24_0=='h') ) {s = 24;}

                        else if ( (LA24_0=='n') ) {s = 25;}

                        else if ( (LA24_0=='{') ) {s = 26;}

                        else if ( (LA24_0=='}') ) {s = 27;}

                        else if ( (LA24_0=='e') ) {s = 28;}

                        else if ( (LA24_0==';') ) {s = 29;}

                        else if ( (LA24_0==',') ) {s = 30;}

                        else if ( (LA24_0==':') ) {s = 31;}

                        else if ( (LA24_0=='r') ) {s = 32;}

                        else if ( (LA24_0=='[') ) {s = 33;}

                        else if ( (LA24_0==']') ) {s = 34;}

                        else if ( (LA24_0==')') ) {s = 35;}

                        else if ( (LA24_0=='\'') ) {s = 36;}

                        else if ( (LA24_0=='@') ) {s = 37;}

                        else if ( (LA24_0=='#') ) {s = 38;}

                        else if ( (LA24_0=='o') ) {s = 39;}

                        else if ( (LA24_0=='`') ) {s = 40;}

                        else if ( ((LA24_0>='0' && LA24_0<='9')) ) {s = 41;}

                        else if ( (LA24_0=='t') ) {s = 42;}

                        else if ( (LA24_0=='\"') ) {s = 43;}

                        else if ( ((LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||LA24_0=='a'||LA24_0=='d'||LA24_0=='g'||(LA24_0>='j' && LA24_0<='l')||LA24_0=='q'||(LA24_0>='w' && LA24_0<='z')) ) {s = 44;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 45;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='$'||LA24_0=='?'||LA24_0=='\\'||(LA24_0>='~' && LA24_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_69 = input.LA(1);

                        s = -1;
                        if ( (LA24_69=='*') ) {s = 120;}

                        else if ( ((LA24_69>='\u0000' && LA24_69<=')')||(LA24_69>='+' && LA24_69<='\uFFFF')) ) {s = 121;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_70 = input.LA(1);

                        s = -1;
                        if ( (LA24_70=='*') ) {s = 122;}

                        else if ( ((LA24_70>='\u0000' && LA24_70<=')')||(LA24_70>='+' && LA24_70<='\uFFFF')) ) {s = 123;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_43 = input.LA(1);

                        s = -1;
                        if ( ((LA24_43>='\u0000' && LA24_43<='\uFFFF')) ) {s = 115;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_40 = input.LA(1);

                        s = -1;
                        if ( ((LA24_40>='\u0000' && LA24_40<='\uFFFF')) ) {s = 110;}

                        else s = 46;

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