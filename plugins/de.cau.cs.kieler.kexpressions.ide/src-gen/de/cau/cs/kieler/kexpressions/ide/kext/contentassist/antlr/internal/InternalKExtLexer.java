package de.cau.cs.kieler.kexpressions.ide.kext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKExtLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
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
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int T__37=37;
    public static final int RULE_SL_COMMENT_ANNOTATION=11;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=5;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NUMBER=14;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
            // InternalKExt.g:12:7: ( '~' )
            // InternalKExt.g:12:9: '~'
            {
            match('~'); 

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
            // InternalKExt.g:13:7: ( '^' )
            // InternalKExt.g:13:9: '^'
            {
            match('^'); 

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
            // InternalKExt.g:14:7: ( '|' )
            // InternalKExt.g:14:9: '|'
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
            // InternalKExt.g:15:7: ( '&' )
            // InternalKExt.g:15:9: '&'
            {
            match('&'); 

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
            // InternalKExt.g:16:7: ( '!' )
            // InternalKExt.g:16:9: '!'
            {
            match('!'); 

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
            // InternalKExt.g:17:7: ( '+' )
            // InternalKExt.g:17:9: '+'
            {
            match('+'); 

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
            // InternalKExt.g:18:7: ( '-' )
            // InternalKExt.g:18:9: '-'
            {
            match('-'); 

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
            // InternalKExt.g:19:7: ( '*' )
            // InternalKExt.g:19:9: '*'
            {
            match('*'); 

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
            // InternalKExt.g:20:7: ( '%' )
            // InternalKExt.g:20:9: '%'
            {
            match('%'); 

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
            // InternalKExt.g:21:7: ( '/' )
            // InternalKExt.g:21:9: '/'
            {
            match('/'); 

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
            // InternalKExt.g:22:7: ( 'val' )
            // InternalKExt.g:22:9: 'val'
            {
            match("val"); 


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
            // InternalKExt.g:23:7: ( '||' )
            // InternalKExt.g:23:9: '||'
            {
            match("||"); 


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
            // InternalKExt.g:24:7: ( '&&' )
            // InternalKExt.g:24:9: '&&'
            {
            match("&&"); 


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
            // InternalKExt.g:25:7: ( '<<' )
            // InternalKExt.g:25:9: '<<'
            {
            match("<<"); 


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
            // InternalKExt.g:26:7: ( '>>' )
            // InternalKExt.g:26:9: '>>'
            {
            match(">>"); 


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
            // InternalKExt.g:27:7: ( '>>>' )
            // InternalKExt.g:27:9: '>>>'
            {
            match(">>>"); 


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
            // InternalKExt.g:28:7: ( '?' )
            // InternalKExt.g:28:9: '?'
            {
            match('?'); 

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
            // InternalKExt.g:29:7: ( '->' )
            // InternalKExt.g:29:9: '->'
            {
            match("->"); 


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
            // InternalKExt.g:30:7: ( 'fby' )
            // InternalKExt.g:30:9: 'fby'
            {
            match("fby"); 


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
            // InternalKExt.g:31:7: ( 'sfby' )
            // InternalKExt.g:31:9: 'sfby'
            {
            match("sfby"); 


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
            // InternalKExt.g:32:7: ( 'host' )
            // InternalKExt.g:32:9: 'host'
            {
            match("host"); 


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
            // InternalKExt.g:33:7: ( 'struct' )
            // InternalKExt.g:33:9: 'struct'
            {
            match("struct"); 


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
            // InternalKExt.g:34:7: ( 'class' )
            // InternalKExt.g:34:9: 'class'
            {
            match("class"); 


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
            // InternalKExt.g:35:7: ( 'enum' )
            // InternalKExt.g:35:9: 'enum'
            {
            match("enum"); 


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
            // InternalKExt.g:36:7: ( '()' )
            // InternalKExt.g:36:9: '()'
            {
            match("()"); 


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
            // InternalKExt.g:37:7: ( '.' )
            // InternalKExt.g:37:9: '.'
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
            // InternalKExt.g:38:7: ( 'conflicting' )
            // InternalKExt.g:38:9: 'conflicting'
            {
            match("conflicting"); 


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
            // InternalKExt.g:39:7: ( 'commuting' )
            // InternalKExt.g:39:9: 'commuting'
            {
            match("commuting"); 


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
            // InternalKExt.g:40:7: ( '=' )
            // InternalKExt.g:40:9: '='
            {
            match('='); 

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
            // InternalKExt.g:41:7: ( '+=' )
            // InternalKExt.g:41:9: '+='
            {
            match("+="); 


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
            // InternalKExt.g:42:7: ( '-=' )
            // InternalKExt.g:42:9: '-='
            {
            match("-="); 


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
            // InternalKExt.g:43:7: ( '*=' )
            // InternalKExt.g:43:9: '*='
            {
            match("*="); 


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
            // InternalKExt.g:44:7: ( '/=' )
            // InternalKExt.g:44:9: '/='
            {
            match("/="); 


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
            // InternalKExt.g:45:7: ( '%=' )
            // InternalKExt.g:45:9: '%='
            {
            match("%="); 


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
            // InternalKExt.g:46:7: ( '&=' )
            // InternalKExt.g:46:9: '&='
            {
            match("&="); 


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
            // InternalKExt.g:47:7: ( '|=' )
            // InternalKExt.g:47:9: '|='
            {
            match("|="); 


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
            // InternalKExt.g:48:7: ( '^=' )
            // InternalKExt.g:48:9: '^='
            {
            match("^="); 


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
            // InternalKExt.g:49:7: ( '<<=' )
            // InternalKExt.g:49:9: '<<='
            {
            match("<<="); 


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
            // InternalKExt.g:50:7: ( '>>=' )
            // InternalKExt.g:50:9: '>>='
            {
            match(">>="); 


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
            // InternalKExt.g:51:7: ( '>>>=' )
            // InternalKExt.g:51:9: '>>>='
            {
            match(">>>="); 


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
            // InternalKExt.g:52:7: ( 'min=' )
            // InternalKExt.g:52:9: 'min='
            {
            match("min="); 


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
            // InternalKExt.g:53:7: ( 'max=' )
            // InternalKExt.g:53:9: 'max='
            {
            match("max="); 


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
            // InternalKExt.g:54:7: ( '++' )
            // InternalKExt.g:54:9: '++'
            {
            match("++"); 


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
            // InternalKExt.g:55:7: ( '--' )
            // InternalKExt.g:55:9: '--'
            {
            match("--"); 


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
            // InternalKExt.g:56:7: ( '==' )
            // InternalKExt.g:56:9: '=='
            {
            match("=="); 


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
            // InternalKExt.g:57:7: ( '<' )
            // InternalKExt.g:57:9: '<'
            {
            match('<'); 

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
            // InternalKExt.g:58:7: ( '<=' )
            // InternalKExt.g:58:9: '<='
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
            // InternalKExt.g:59:7: ( '>' )
            // InternalKExt.g:59:9: '>'
            {
            match('>'); 

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
            // InternalKExt.g:60:7: ( '>=' )
            // InternalKExt.g:60:9: '>='
            {
            match(">="); 


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
            // InternalKExt.g:61:7: ( '!=' )
            // InternalKExt.g:61:9: '!='
            {
            match("!="); 


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
            // InternalKExt.g:62:7: ( 'pure' )
            // InternalKExt.g:62:9: 'pure'
            {
            match("pure"); 


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
            // InternalKExt.g:63:7: ( 'bool' )
            // InternalKExt.g:63:9: 'bool'
            {
            match("bool"); 


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
            // InternalKExt.g:64:7: ( 'int' )
            // InternalKExt.g:64:9: 'int'
            {
            match("int"); 


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
            // InternalKExt.g:65:7: ( 'float' )
            // InternalKExt.g:65:9: 'float'
            {
            match("float"); 


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
            // InternalKExt.g:66:7: ( 'string' )
            // InternalKExt.g:66:9: 'string'
            {
            match("string"); 


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
            // InternalKExt.g:67:7: ( 'none' )
            // InternalKExt.g:67:9: 'none'
            {
            match("none"); 


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
            // InternalKExt.g:68:7: ( 'max' )
            // InternalKExt.g:68:9: 'max'
            {
            match("max"); 


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
            // InternalKExt.g:69:7: ( 'min' )
            // InternalKExt.g:69:9: 'min'
            {
            match("min"); 


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
            // InternalKExt.g:70:7: ( 'public' )
            // InternalKExt.g:70:9: 'public'
            {
            match("public"); 


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
            // InternalKExt.g:71:7: ( 'protected' )
            // InternalKExt.g:71:9: 'protected'
            {
            match("protected"); 


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
            // InternalKExt.g:72:7: ( 'private' )
            // InternalKExt.g:72:9: 'private'
            {
            match("private"); 


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
            // InternalKExt.g:73:7: ( 'void' )
            // InternalKExt.g:73:9: 'void'
            {
            match("void"); 


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
            // InternalKExt.g:74:7: ( '!&' )
            // InternalKExt.g:74:9: '!&'
            {
            match("!&"); 


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
            // InternalKExt.g:75:7: ( 'scope' )
            // InternalKExt.g:75:9: 'scope'
            {
            match("scope"); 


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
            // InternalKExt.g:76:7: ( '{' )
            // InternalKExt.g:76:9: '{'
            {
            match('{'); 

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
            // InternalKExt.g:77:7: ( '}' )
            // InternalKExt.g:77:9: '}'
            {
            match('}'); 

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
            // InternalKExt.g:78:7: ( 'expression' )
            // InternalKExt.g:78:9: 'expression'
            {
            match("expression"); 


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
            // InternalKExt.g:79:7: ( 'json' )
            // InternalKExt.g:79:9: 'json'
            {
            match("json"); 


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
            // InternalKExt.g:80:7: ( ';' )
            // InternalKExt.g:80:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:81:7: ( ',' )
            // InternalKExt.g:81:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:82:7: ( '(' )
            // InternalKExt.g:82:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:83:7: ( ')' )
            // InternalKExt.g:83:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:84:7: ( 'schedule' )
            // InternalKExt.g:84:9: 'schedule'
            {
            match("schedule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:85:7: ( 'ref' )
            // InternalKExt.g:85:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:86:7: ( 'extern' )
            // InternalKExt.g:86:9: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:87:7: ( '[' )
            // InternalKExt.g:87:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:88:7: ( ']' )
            // InternalKExt.g:88:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:89:7: ( 'global' )
            // InternalKExt.g:89:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:90:7: ( 'combine' )
            // InternalKExt.g:90:9: 'combine'
            {
            match("combine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:91:7: ( 'label' )
            // InternalKExt.g:91:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:92:7: ( 'print' )
            // InternalKExt.g:92:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:93:7: ( 'randomize' )
            // InternalKExt.g:93:9: 'randomize'
            {
            match("randomize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:94:8: ( ':' )
            // InternalKExt.g:94:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:95:8: ( '\\'' )
            // InternalKExt.g:95:10: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:96:8: ( 'random' )
            // InternalKExt.g:96:10: 'random'
            {
            match("random"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:97:8: ( '_' )
            // InternalKExt.g:97:10: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:98:8: ( 'null' )
            // InternalKExt.g:98:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:99:8: ( '#' )
            // InternalKExt.g:99:10: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:100:8: ( '@' )
            // InternalKExt.g:100:10: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:101:8: ( 'const' )
            // InternalKExt.g:101:10: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:102:8: ( 'input' )
            // InternalKExt.g:102:10: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:103:8: ( 'output' )
            // InternalKExt.g:103:10: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:104:8: ( 'static' )
            // InternalKExt.g:104:10: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:105:8: ( 'signal' )
            // InternalKExt.g:105:10: 'signal'
            {
            match("signal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:106:8: ( 'super.' )
            // InternalKExt.g:106:10: 'super.'
            {
            match("super."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:107:8: ( 'to' )
            // InternalKExt.g:107:10: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "RULE_HOSTCODE"
    public final void mRULE_HOSTCODE() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKExt.g:31595:15: ( '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`' )
            // InternalKExt.g:31595:17: '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`'
            {
            match('`'); 
            // InternalKExt.g:31595:21: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )*
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
            	    // InternalKExt.g:31595:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKExt.g:31595:63: ~ ( ( '\\\\' | '`' ) )
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
            // InternalKExt.g:31597:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalKExt.g:31597:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalKExt.g:31597:33: ( options {greedy=false; } : . )*
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
            	    // InternalKExt.g:31597:61: .
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
            // InternalKExt.g:31599:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalKExt.g:31599:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKExt.g:31599:31: ( options {greedy=false; } : . )*
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
            	    // InternalKExt.g:31599:59: .
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
            // InternalKExt.g:31601:28: ( '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKExt.g:31601:30: '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//*"); 

            // InternalKExt.g:31601:36: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKExt.g:31601:36: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalKExt.g:31601:52: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKExt.g:31601:53: ( '\\r' )? '\\n'
                    {
                    // InternalKExt.g:31601:53: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalKExt.g:31601:53: '\\r'
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
            // InternalKExt.g:31603:17: ( '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKExt.g:31603:19: '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKExt.g:31603:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKExt.g:31603:31: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalKExt.g:31603:47: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKExt.g:31603:48: ( '\\r' )? '\\n'
                    {
                    // InternalKExt.g:31603:48: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalKExt.g:31603:48: '\\r'
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
            // InternalKExt.g:31605:22: ( '0' .. '9' )
            // InternalKExt.g:31605:24: '0' .. '9'
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
            // InternalKExt.g:31607:10: ( ( RULE_NUMBER )+ )
            // InternalKExt.g:31607:12: ( RULE_NUMBER )+
            {
            // InternalKExt.g:31607:12: ( RULE_NUMBER )+
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
            	    // InternalKExt.g:31607:12: RULE_NUMBER
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
            // InternalKExt.g:31609:12: ( ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' ) )
            // InternalKExt.g:31609:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            {
            // InternalKExt.g:31609:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalKExt.g:31609:15: ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // InternalKExt.g:31609:15: ( RULE_NUMBER )+
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
                    	    // InternalKExt.g:31609:15: RULE_NUMBER
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
                    // InternalKExt.g:31609:32: ( RULE_NUMBER )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalKExt.g:31609:32: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalKExt.g:31609:45: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalKExt.g:31609:46: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalKExt.g:31609:56: ( '+' | '-' )?
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

                            // InternalKExt.g:31609:67: ( RULE_NUMBER )+
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
                            	    // InternalKExt.g:31609:67: RULE_NUMBER
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

                    // InternalKExt.g:31609:82: ( 'f' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='f') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalKExt.g:31609:82: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:31609:87: ( RULE_NUMBER )+ 'f'
                    {
                    // InternalKExt.g:31609:87: ( RULE_NUMBER )+
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
                    	    // InternalKExt.g:31609:87: RULE_NUMBER
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
            // InternalKExt.g:31611:14: ( ( 'true' | 'false' ) )
            // InternalKExt.g:31611:16: ( 'true' | 'false' )
            {
            // InternalKExt.g:31611:16: ( 'true' | 'false' )
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
                    // InternalKExt.g:31611:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalKExt.g:31611:24: 'false'
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
            // InternalKExt.g:31613:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalKExt.g:31613:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalKExt.g:31613:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalKExt.g:31613:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKExt.g:31613:61: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalKExt.g:31615:9: ( ( '^' )? ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKExt.g:31615:11: ( '^' )? ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKExt.g:31615:11: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKExt.g:31615:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // InternalKExt.g:31615:16: ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' )
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
                    // InternalKExt.g:31615:17: ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' )
                    {
                    // InternalKExt.g:31615:17: ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' )
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
                            // InternalKExt.g:31615:18: ( '_' )? 'a' .. 'z'
                            {
                            // InternalKExt.g:31615:18: ( '_' )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0=='_') ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // InternalKExt.g:31615:18: '_'
                                    {
                                    match('_'); 

                                    }
                                    break;

                            }

                            matchRange('a','z'); 

                            }
                            break;
                        case 2 :
                            // InternalKExt.g:31615:32: ( '_' )? 'A' .. 'Z'
                            {
                            // InternalKExt.g:31615:32: ( '_' )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0=='_') ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // InternalKExt.g:31615:32: '_'
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
                    // InternalKExt.g:31615:47: '_' '0' .. '9'
                    {
                    match('_'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 3 :
                    // InternalKExt.g:31615:60: '__'
                    {
                    match("__"); 


                    }
                    break;

            }

            // InternalKExt.g:31615:66: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')) ) {
                    alt26=1;
                }


                switch (alt26) {
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
            // InternalKExt.g:31617:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKExt.g:31617:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKExt.g:31617:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalKExt.g:31619:16: ( . )
            // InternalKExt.g:31619:18: .
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
        // InternalKExt.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER )
        int alt28=109;
        alt28 = dfa28.predict(input);
        switch (alt28) {
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
                // InternalKExt.g:1:430: T__87
                {
                mT__87(); 

                }
                break;
            case 72 :
                // InternalKExt.g:1:436: T__88
                {
                mT__88(); 

                }
                break;
            case 73 :
                // InternalKExt.g:1:442: T__89
                {
                mT__89(); 

                }
                break;
            case 74 :
                // InternalKExt.g:1:448: T__90
                {
                mT__90(); 

                }
                break;
            case 75 :
                // InternalKExt.g:1:454: T__91
                {
                mT__91(); 

                }
                break;
            case 76 :
                // InternalKExt.g:1:460: T__92
                {
                mT__92(); 

                }
                break;
            case 77 :
                // InternalKExt.g:1:466: T__93
                {
                mT__93(); 

                }
                break;
            case 78 :
                // InternalKExt.g:1:472: T__94
                {
                mT__94(); 

                }
                break;
            case 79 :
                // InternalKExt.g:1:478: T__95
                {
                mT__95(); 

                }
                break;
            case 80 :
                // InternalKExt.g:1:484: T__96
                {
                mT__96(); 

                }
                break;
            case 81 :
                // InternalKExt.g:1:490: T__97
                {
                mT__97(); 

                }
                break;
            case 82 :
                // InternalKExt.g:1:496: T__98
                {
                mT__98(); 

                }
                break;
            case 83 :
                // InternalKExt.g:1:502: T__99
                {
                mT__99(); 

                }
                break;
            case 84 :
                // InternalKExt.g:1:508: T__100
                {
                mT__100(); 

                }
                break;
            case 85 :
                // InternalKExt.g:1:515: T__101
                {
                mT__101(); 

                }
                break;
            case 86 :
                // InternalKExt.g:1:522: T__102
                {
                mT__102(); 

                }
                break;
            case 87 :
                // InternalKExt.g:1:529: T__103
                {
                mT__103(); 

                }
                break;
            case 88 :
                // InternalKExt.g:1:536: T__104
                {
                mT__104(); 

                }
                break;
            case 89 :
                // InternalKExt.g:1:543: T__105
                {
                mT__105(); 

                }
                break;
            case 90 :
                // InternalKExt.g:1:550: T__106
                {
                mT__106(); 

                }
                break;
            case 91 :
                // InternalKExt.g:1:557: T__107
                {
                mT__107(); 

                }
                break;
            case 92 :
                // InternalKExt.g:1:564: T__108
                {
                mT__108(); 

                }
                break;
            case 93 :
                // InternalKExt.g:1:571: T__109
                {
                mT__109(); 

                }
                break;
            case 94 :
                // InternalKExt.g:1:578: T__110
                {
                mT__110(); 

                }
                break;
            case 95 :
                // InternalKExt.g:1:585: T__111
                {
                mT__111(); 

                }
                break;
            case 96 :
                // InternalKExt.g:1:592: T__112
                {
                mT__112(); 

                }
                break;
            case 97 :
                // InternalKExt.g:1:599: T__113
                {
                mT__113(); 

                }
                break;
            case 98 :
                // InternalKExt.g:1:606: RULE_HOSTCODE
                {
                mRULE_HOSTCODE(); 

                }
                break;
            case 99 :
                // InternalKExt.g:1:620: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 100 :
                // InternalKExt.g:1:644: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 101 :
                // InternalKExt.g:1:660: RULE_SL_COMMENT_ANNOTATION
                {
                mRULE_SL_COMMENT_ANNOTATION(); 

                }
                break;
            case 102 :
                // InternalKExt.g:1:687: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 103 :
                // InternalKExt.g:1:703: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 104 :
                // InternalKExt.g:1:712: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 105 :
                // InternalKExt.g:1:723: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 106 :
                // InternalKExt.g:1:736: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 107 :
                // InternalKExt.g:1:748: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 108 :
                // InternalKExt.g:1:756: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 109 :
                // InternalKExt.g:1:764: RULE_ANY_OTHER
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
    static final String[] DFA18_transitionS = DFA18_transitionS_.DFA18_transitionS;
    private static final class DFA18_transitionS_ {
        static final String[] DFA18_transitionS = {
                "\12\1",
                "\1\2\1\uffff\12\1\54\uffff\1\3",
                "",
                ""
        };
    }

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
            return "31609:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA28_eotS =
        "\1\uffff\1\67\1\uffff\1\72\1\75\1\100\1\103\1\106\1\112\1\114\1\116\1\122\1\67\1\127\1\132\1\uffff\5\67\1\152\1\uffff\1\155\4\67\2\uffff\1\67\3\uffff\1\67\2\uffff\2\67\2\uffff\1\u0082\2\uffff\2\67\1\64\1\u0089\1\64\4\uffff\2\67\34\uffff\2\67\1\u009a\2\uffff\1\u009d\3\uffff\15\67\5\uffff\6\67\2\uffff\1\67\3\uffff\2\67\2\uffff\2\67\5\uffff\1\67\1\u00bc\1\67\3\uffff\1\u0089\2\uffff\1\u00be\4\67\4\uffff\1\u00c4\1\67\2\uffff\1\u00c7\2\uffff\1\u00c8\20\67\1\u00dd\1\u00df\1\67\1\u00e1\4\67\1\u00e6\4\67\1\uffff\1\67\1\uffff\3\67\1\u00ef\1\67\1\uffff\1\u00f1\3\uffff\2\67\1\u00f4\7\67\1\u00fc\5\67\1\u0102\2\67\4\uffff\1\u0105\1\uffff\1\67\1\u0107\1\u0108\1\u0109\1\uffff\4\67\1\u010e\2\67\1\u0111\1\uffff\1\67\1\uffff\1\u0113\1\u010e\1\uffff\3\67\1\u0117\3\67\1\uffff\1\u011b\1\67\1\u011d\2\67\1\uffff\2\67\1\uffff\1\u0122\3\uffff\2\67\1\u0125\1\67\1\uffff\2\67\1\uffff\1\u0129\1\uffff\1\u012a\1\u012b\1\u012c\1\uffff\1\67\1\u012e\2\uffff\1\67\1\uffff\3\67\1\u0133\1\uffff\1\u0135\1\u0136\1\uffff\1\u0137\1\67\1\u0139\4\uffff\1\67\1\uffff\2\67\1\u013d\1\67\1\uffff\1\67\3\uffff\1\67\1\uffff\1\u0141\2\67\1\uffff\2\67\1\u0146\1\uffff\1\67\1\u0148\1\67\1\u014a\1\uffff\1\67\1\uffff\1\u014c\1\uffff\1\u014d\2\uffff";
    static final String DFA28_eofS =
        "\u014e\uffff";
    static final String DFA28_minS =
        "\1\0\1\162\1\uffff\2\75\2\46\1\53\1\55\2\75\1\52\1\141\1\74\1\75\1\uffff\1\141\1\143\1\157\1\154\1\156\1\51\1\uffff\1\75\1\141\1\157\1\156\1\157\2\uffff\1\163\3\uffff\1\141\2\uffff\1\154\1\141\2\uffff\1\60\2\uffff\1\165\1\157\1\0\1\56\1\0\4\uffff\1\145\1\142\31\uffff\2\0\1\uffff\1\154\1\151\1\75\2\uffff\1\75\3\uffff\1\171\1\157\1\154\1\142\1\141\1\150\1\147\1\160\1\163\1\141\1\155\1\165\1\160\5\uffff\1\156\1\170\1\157\1\160\1\156\1\154\2\uffff\1\157\3\uffff\1\146\1\156\2\uffff\1\157\1\142\5\uffff\1\164\1\60\1\165\3\uffff\1\56\2\uffff\1\60\1\164\1\156\1\145\1\154\4\uffff\1\60\1\144\2\uffff\1\75\2\uffff\1\60\1\141\1\163\1\171\1\151\1\164\1\160\1\145\1\156\1\145\1\164\1\163\1\146\1\142\1\155\1\162\1\145\2\60\1\154\1\60\1\165\1\145\1\154\1\156\1\60\1\144\1\142\1\145\1\160\1\uffff\1\145\1\uffff\1\145\1\141\1\164\1\60\1\151\1\uffff\1\60\3\uffff\1\164\1\145\1\60\1\143\1\156\1\151\1\145\1\144\1\141\1\162\1\60\1\163\1\154\1\164\1\165\1\151\1\60\1\145\1\162\4\uffff\1\60\1\uffff\1\164\3\60\1\uffff\1\157\1\141\1\154\1\165\1\60\1\143\1\164\1\60\1\uffff\1\143\1\uffff\2\60\1\uffff\1\164\1\147\1\143\1\60\1\165\1\154\1\56\1\uffff\1\60\1\151\1\60\1\164\1\156\1\uffff\1\163\1\156\1\uffff\1\60\3\uffff\1\155\1\154\1\60\1\164\1\uffff\1\164\1\145\1\uffff\1\60\1\uffff\3\60\1\uffff\1\154\1\60\2\uffff\1\143\1\uffff\1\151\1\145\1\163\1\60\1\uffff\2\60\1\uffff\1\60\1\145\1\60\4\uffff\1\145\1\uffff\1\164\1\156\1\60\1\151\1\uffff\1\172\3\uffff\1\144\1\uffff\1\60\1\151\1\147\1\uffff\1\157\1\145\1\60\1\uffff\1\156\1\60\1\156\1\60\1\uffff\1\147\1\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA28_maxS =
        "\1\uffff\1\165\1\uffff\1\172\1\174\3\75\1\76\3\75\1\157\1\75\1\76\1\uffff\1\154\1\165\2\157\1\170\1\51\1\uffff\1\75\1\151\1\157\1\156\1\165\2\uffff\1\163\3\uffff\1\145\2\uffff\1\154\1\141\2\uffff\1\172\2\uffff\1\165\1\162\1\uffff\1\146\1\uffff\4\uffff\1\157\1\162\31\uffff\2\uffff\1\uffff\1\154\1\151\1\75\2\uffff\1\76\3\uffff\1\171\1\157\1\154\1\142\1\162\1\157\1\147\1\160\1\163\1\141\1\156\1\165\1\164\5\uffff\1\156\1\170\1\157\1\164\1\156\1\154\2\uffff\1\157\3\uffff\1\146\1\156\2\uffff\1\157\1\142\5\uffff\1\164\1\172\1\165\3\uffff\1\146\2\uffff\1\172\1\164\1\166\1\145\1\154\4\uffff\1\172\1\144\2\uffff\1\75\2\uffff\1\172\1\141\1\163\1\171\1\165\1\164\1\160\1\145\1\156\1\145\1\164\2\163\2\155\1\162\1\145\2\172\1\154\1\172\1\165\1\145\1\154\1\156\1\172\1\144\1\142\1\145\1\160\1\uffff\1\145\1\uffff\1\145\1\141\1\164\1\172\1\151\1\uffff\1\172\3\uffff\1\164\1\145\1\172\1\143\1\156\1\151\1\145\1\144\1\141\1\162\1\172\1\163\1\154\1\164\1\165\1\151\1\172\1\145\1\162\4\uffff\1\172\1\uffff\1\164\3\172\1\uffff\1\157\1\141\1\154\1\165\1\172\1\143\1\164\1\172\1\uffff\1\143\1\uffff\2\172\1\uffff\1\164\1\147\1\143\1\172\1\165\1\154\1\56\1\uffff\1\172\1\151\1\172\1\164\1\156\1\uffff\1\163\1\156\1\uffff\1\172\3\uffff\1\155\1\154\1\172\1\164\1\uffff\1\164\1\145\1\uffff\1\172\1\uffff\3\172\1\uffff\1\154\1\172\2\uffff\1\143\1\uffff\1\151\1\145\1\163\1\172\1\uffff\2\172\1\uffff\1\172\1\145\1\172\4\uffff\1\145\1\uffff\1\164\1\156\1\172\1\151\1\uffff\1\172\3\uffff\1\144\1\uffff\1\172\1\151\1\147\1\uffff\1\157\1\145\1\172\1\uffff\1\156\1\172\1\156\1\172\1\uffff\1\147\1\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\14\uffff\1\22\6\uffff\1\33\5\uffff\1\102\1\103\1\uffff\1\106\1\107\1\111\1\uffff\1\115\1\116\2\uffff\1\124\1\125\1\uffff\1\131\1\132\5\uffff\2\153\1\154\1\155\2\uffff\1\153\1\2\1\46\1\3\1\15\1\45\1\4\1\16\1\44\1\5\1\63\1\100\1\6\1\37\1\54\1\7\1\23\1\40\1\55\1\10\1\41\1\11\1\43\1\12\1\42\2\uffff\1\13\3\uffff\1\60\1\57\1\uffff\1\62\1\61\1\22\15\uffff\1\32\1\110\1\33\1\56\1\36\6\uffff\1\102\1\103\1\uffff\1\106\1\107\1\111\2\uffff\1\115\1\116\2\uffff\1\124\1\125\1\127\1\131\1\132\3\uffff\1\142\1\147\1\150\1\uffff\1\152\1\154\5\uffff\1\143\1\144\1\145\1\146\2\uffff\1\47\1\17\1\uffff\1\50\1\20\36\uffff\1\141\1\uffff\1\1\5\uffff\1\14\1\uffff\1\51\1\21\1\24\23\uffff\1\52\1\73\1\53\1\72\1\uffff\1\66\4\uffff\1\113\10\uffff\1\64\1\uffff\1\77\2\uffff\1\25\7\uffff\1\26\5\uffff\1\31\2\uffff\1\65\1\uffff\1\71\1\130\1\105\4\uffff\1\151\2\uffff\1\122\1\uffff\1\67\3\uffff\1\101\2\uffff\1\140\1\30\1\uffff\1\133\4\uffff\1\134\2\uffff\1\121\3\uffff\1\74\1\27\1\70\1\136\1\uffff\1\137\4\uffff\1\114\1\uffff\1\126\1\117\1\135\1\uffff\1\76\3\uffff\1\120\3\uffff\1\112\4\uffff\1\75\1\uffff\1\35\1\uffff\1\123\1\uffff\1\104\1\34";
    static final String DFA28_specialS =
        "\1\4\55\uffff\1\3\1\uffff\1\1\37\uffff\1\0\1\2\u00fc\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\64\2\63\2\64\1\63\22\64\1\63\1\6\1\60\1\52\1\64\1\12\1\5\1\50\1\25\1\41\1\11\1\7\1\40\1\10\1\26\1\13\12\57\1\47\1\37\1\15\1\27\1\16\1\17\1\53\32\62\1\43\1\64\1\44\1\3\1\51\1\56\1\61\1\31\1\23\1\61\1\24\1\20\1\45\1\22\1\32\1\36\1\61\1\46\1\30\1\33\1\54\1\1\1\61\1\42\1\21\1\55\1\61\1\14\4\61\1\34\1\4\1\35\1\2\uff81\64",
            "\1\65\2\uffff\1\66",
            "",
            "\1\71\3\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\74\76\uffff\1\73",
            "\1\76\26\uffff\1\77",
            "\1\102\26\uffff\1\101",
            "\1\105\21\uffff\1\104",
            "\1\111\17\uffff\1\110\1\107",
            "\1\113",
            "\1\115",
            "\1\120\4\uffff\1\121\15\uffff\1\117",
            "\1\123\15\uffff\1\124",
            "\1\125\1\126",
            "\1\131\1\130",
            "",
            "\1\136\1\134\11\uffff\1\135",
            "\1\141\2\uffff\1\137\2\uffff\1\142\12\uffff\1\140\1\143",
            "\1\144",
            "\1\145\2\uffff\1\146",
            "\1\147\11\uffff\1\150",
            "\1\151",
            "",
            "\1\154",
            "\1\157\7\uffff\1\156",
            "\1\160",
            "\1\161",
            "\1\162\5\uffff\1\163",
            "",
            "",
            "\1\166",
            "",
            "",
            "",
            "\1\173\3\uffff\1\172",
            "",
            "",
            "\1\176",
            "\1\177",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\1\u0085",
            "\1\u0086\2\uffff\1\u0087",
            "\0\u0088",
            "\1\u008a\1\uffff\12\u008b\54\uffff\1\u008a",
            "\0\u008c",
            "",
            "",
            "",
            "",
            "\1\u008e\3\uffff\1\u0090\5\uffff\1\u008f",
            "\1\u0092\17\uffff\1\u0091",
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
            "",
            "",
            "",
            "",
            "",
            "\52\u0094\1\u0093\uffd5\u0094",
            "\52\u0096\1\u0095\uffd5\u0096",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "",
            "\1\u009c\1\u009b",
            "",
            "",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a3\20\uffff\1\u00a2",
            "\1\u00a5\6\uffff\1\u00a4",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00ab\1\u00aa",
            "\1\u00ac",
            "\1\u00ad\3\uffff\1\u00ae",
            "",
            "",
            "",
            "",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b3\3\uffff\1\u00b2",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "",
            "\1\u00b6",
            "",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00bd",
            "",
            "",
            "",
            "\1\u008a\1\uffff\12\u008b\54\uffff\1\u008a",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00bf",
            "\1\u00c1\7\uffff\1\u00c0",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00c5",
            "",
            "",
            "\1\u00c6",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cd\13\uffff\1\u00cc",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5\14\uffff\1\u00d6",
            "\1\u00d8\12\uffff\1\u00d7",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\12\67\3\uffff\1\u00dc\3\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\3\uffff\1\u00de\3\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00e0",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00f0",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0103",
            "\1\u0104",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0106",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u010f",
            "\1\u0110",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0112",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u011c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u011e",
            "\1\u011f",
            "",
            "\1\u0120",
            "\1\u0121",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "\1\u0123",
            "\1\u0124",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0126",
            "",
            "\1\u0127",
            "\1\u0128",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u012d",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\10\67\1\u0134\21\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0138",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "",
            "\1\u013a",
            "",
            "\1\u013b",
            "\1\u013c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u013e",
            "",
            "\1\u013f",
            "",
            "",
            "",
            "\1\u0140",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0147",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0149",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u014b",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
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
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_80 = input.LA(1);

                        s = -1;
                        if ( (LA28_80=='*') ) {s = 147;}

                        else if ( ((LA28_80>='\u0000' && LA28_80<=')')||(LA28_80>='+' && LA28_80<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_48 = input.LA(1);

                        s = -1;
                        if ( ((LA28_48>='\u0000' && LA28_48<='\uFFFF')) ) {s = 140;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_81 = input.LA(1);

                        s = -1;
                        if ( (LA28_81=='*') ) {s = 149;}

                        else if ( ((LA28_81>='\u0000' && LA28_81<=')')||(LA28_81>='+' && LA28_81<='\uFFFF')) ) {s = 150;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_46 = input.LA(1);

                        s = -1;
                        if ( ((LA28_46>='\u0000' && LA28_46<='\uFFFF')) ) {s = 136;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_0 = input.LA(1);

                        s = -1;
                        if ( (LA28_0=='p') ) {s = 1;}

                        else if ( (LA28_0=='~') ) {s = 2;}

                        else if ( (LA28_0=='^') ) {s = 3;}

                        else if ( (LA28_0=='|') ) {s = 4;}

                        else if ( (LA28_0=='&') ) {s = 5;}

                        else if ( (LA28_0=='!') ) {s = 6;}

                        else if ( (LA28_0=='+') ) {s = 7;}

                        else if ( (LA28_0=='-') ) {s = 8;}

                        else if ( (LA28_0=='*') ) {s = 9;}

                        else if ( (LA28_0=='%') ) {s = 10;}

                        else if ( (LA28_0=='/') ) {s = 11;}

                        else if ( (LA28_0=='v') ) {s = 12;}

                        else if ( (LA28_0=='<') ) {s = 13;}

                        else if ( (LA28_0=='>') ) {s = 14;}

                        else if ( (LA28_0=='?') ) {s = 15;}

                        else if ( (LA28_0=='f') ) {s = 16;}

                        else if ( (LA28_0=='s') ) {s = 17;}

                        else if ( (LA28_0=='h') ) {s = 18;}

                        else if ( (LA28_0=='c') ) {s = 19;}

                        else if ( (LA28_0=='e') ) {s = 20;}

                        else if ( (LA28_0=='(') ) {s = 21;}

                        else if ( (LA28_0=='.') ) {s = 22;}

                        else if ( (LA28_0=='=') ) {s = 23;}

                        else if ( (LA28_0=='m') ) {s = 24;}

                        else if ( (LA28_0=='b') ) {s = 25;}

                        else if ( (LA28_0=='i') ) {s = 26;}

                        else if ( (LA28_0=='n') ) {s = 27;}

                        else if ( (LA28_0=='{') ) {s = 28;}

                        else if ( (LA28_0=='}') ) {s = 29;}

                        else if ( (LA28_0=='j') ) {s = 30;}

                        else if ( (LA28_0==';') ) {s = 31;}

                        else if ( (LA28_0==',') ) {s = 32;}

                        else if ( (LA28_0==')') ) {s = 33;}

                        else if ( (LA28_0=='r') ) {s = 34;}

                        else if ( (LA28_0=='[') ) {s = 35;}

                        else if ( (LA28_0==']') ) {s = 36;}

                        else if ( (LA28_0=='g') ) {s = 37;}

                        else if ( (LA28_0=='l') ) {s = 38;}

                        else if ( (LA28_0==':') ) {s = 39;}

                        else if ( (LA28_0=='\'') ) {s = 40;}

                        else if ( (LA28_0=='_') ) {s = 41;}

                        else if ( (LA28_0=='#') ) {s = 42;}

                        else if ( (LA28_0=='@') ) {s = 43;}

                        else if ( (LA28_0=='o') ) {s = 44;}

                        else if ( (LA28_0=='t') ) {s = 45;}

                        else if ( (LA28_0=='`') ) {s = 46;}

                        else if ( ((LA28_0>='0' && LA28_0<='9')) ) {s = 47;}

                        else if ( (LA28_0=='\"') ) {s = 48;}

                        else if ( (LA28_0=='a'||LA28_0=='d'||LA28_0=='k'||LA28_0=='q'||LA28_0=='u'||(LA28_0>='w' && LA28_0<='z')) ) {s = 49;}

                        else if ( ((LA28_0>='A' && LA28_0<='Z')) ) {s = 50;}

                        else if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {s = 51;}

                        else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\u001F')||LA28_0=='$'||LA28_0=='\\'||(LA28_0>='\u007F' && LA28_0<='\uFFFF')) ) {s = 52;}

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