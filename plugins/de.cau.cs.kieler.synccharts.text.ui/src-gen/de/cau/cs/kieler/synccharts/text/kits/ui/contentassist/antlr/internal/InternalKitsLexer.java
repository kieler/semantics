package de.cau.cs.kieler.synccharts.text.kits.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKitsLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int RULE_BOOLEAN=4;
    public static final int T73=73;
    public static final int RULE_ID=7;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int RULE_ANY_OTHER=14;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T72=72;
    public static final int T21=21;
    public static final int T71=71;
    public static final int T20=20;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_INT=5;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int RULE_FLOAT=6;
    public static final int T43=43;
    public static final int Tokens=81;
    public static final int RULE_SL_COMMENT=12;
    public static final int T42=42;
    public static final int RULE_HOSTCODE=9;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=11;
    public static final int T44=44;
    public static final int RULE_STRING=8;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=13;
    public static final int T80=80;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalKitsLexer() {;} 
    public InternalKitsLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g"; }

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:10:5: ( ':' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:10:7: ':'
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
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:11:5: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:11:7: 'pre'
            {
            match("pre"); 


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
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:12:5: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:12:7: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:13:5: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:13:7: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:14:5: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:14:7: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15:5: ( '+' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:16:5: ( '-' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:16:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:17:5: ( '*' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:17:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:18:5: ( 'mod' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:18:7: 'mod'
            {
            match("mod"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:19:5: ( '?' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:19:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:20:5: ( 'normal' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:20:7: 'normal'
            {
            match("normal"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:21:5: ( 'conditional' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:21:7: 'conditional'
            {
            match("conditional"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:22:5: ( 'reference' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:22:7: 'reference'
            {
            match("reference"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:23:5: ( 'textual' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:23:7: 'textual'
            {
            match("textual"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:24:5: ( '-->' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:24:7: '-->'
            {
            match("-->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:25:5: ( 'o->' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:25:7: 'o->'
            {
            match("o->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:26:5: ( '>->' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:26:7: '>->'
            {
            match(">->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:27:5: ( '=' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:27:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:28:5: ( '<' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:28:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:29:5: ( '<=' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:29:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:30:5: ( '>' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:30:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:31:5: ( '>=' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:31:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:32:5: ( '<>' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:32:7: '<>'
            {
            match("<>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:33:5: ( 'pure' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:33:7: 'pure'
            {
            match("pure"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:34:5: ( 'boolean' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:34:7: 'boolean'
            {
            match("boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:35:5: ( 'unsigned' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:35:7: 'unsigned'
            {
            match("unsigned"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:36:5: ( 'integer' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:36:7: 'integer'
            {
            match("integer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:37:5: ( 'float' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:37:7: 'float'
            {
            match("float"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:38:5: ( 'double' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:38:7: 'double'
            {
            match("double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:39:5: ( 'string' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:39:7: 'string'
            {
            match("string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:40:5: ( 'host' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:40:7: 'host'
            {
            match("host"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:41:5: ( 'none' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:41:7: 'none'
            {
            match("none"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:42:5: ( 'max' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:42:7: 'max'
            {
            match("max"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:43:5: ( 'min' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:43:7: 'min'
            {
            match("min"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:44:5: ( 'region' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:44:7: 'region'
            {
            match("region"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:45:5: ( 'code' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:45:7: 'code'
            {
            match("code"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:46:5: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:46:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:47:5: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:47:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:48:5: ( 'state' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:48:7: 'state'
            {
            match("state"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:49:5: ( '@' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:49:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:50:5: ( '[' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:50:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:51:5: ( ']' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:51:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:52:5: ( ',' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:52:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:53:5: ( '{' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:53:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:54:5: ( '}' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:54:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:55:5: ( 'onentry' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:55:7: 'onentry'
            {
            match("onentry"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:56:5: ( 'oninner' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:56:7: 'oninner'
            {
            match("oninner"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:57:5: ( 'onexit' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:57:7: 'onexit'
            {
            match("onexit"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:58:5: ( 'suspension' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:58:7: 'suspension'
            {
            match("suspension"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:59:5: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:59:7: 'with'
            {
            match("with"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:60:5: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:60:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:61:5: ( 'signal' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:61:7: 'signal'
            {
            match("signal"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:62:5: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:62:7: ':='
            {
            match(":="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:63:5: ( 'combine' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:63:7: 'combine'
            {
            match("combine"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:64:5: ( 'var' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:64:7: 'var'
            {
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:65:5: ( 'input' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:65:7: 'input'
            {
            match("input"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:66:5: ( ';' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:66:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:67:5: ( 'output' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:67:7: 'output'
            {
            match("output"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:68:5: ( 'inputoutput' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:68:7: 'inputoutput'
            {
            match("inputoutput"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:69:5: ( 'return' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:69:7: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:70:5: ( 'import' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:70:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:71:5: ( '.' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:71:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:72:5: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:72:7: 'init'
            {
            match("init"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:73:5: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:73:7: 'final'
            {
            match("final"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:74:5: ( '#' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:74:7: '#'
            {
            match('#'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:75:5: ( 'history' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:75:7: 'history'
            {
            match("history"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start RULE_HOSTCODE
    public final void mRULE_HOSTCODE() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODE;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15854:15: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15854:17: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15854:22: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFE')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15854:23: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15854:64: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
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

            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_HOSTCODE

    // $ANTLR start RULE_COMMENT_ANNOTATION
    public final void mRULE_COMMENT_ANNOTATION() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_ANNOTATION;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15856:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15856:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15856:33: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFE')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15856:61: .
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_COMMENT_ANNOTATION

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15858:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15858:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFE') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15858:31: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFE')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFE')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15858:59: .
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15860:10: ( ( '-' )? ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15860:12: ( '-' )? ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15860:12: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15860:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15860:17: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15860:18: '0' .. '9'
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


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_FLOAT
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:12: ( ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:14: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:14: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:15: ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )?
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:15: ( '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:15: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:20: ( '0' .. '9' )+
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
                    	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:21: '0' .. '9'
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

                    match('.'); 
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:36: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:37: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:48: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:49: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }

                            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:59: ( '+' | '-' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0=='+'||LA9_0=='-') ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:
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

                            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:70: ( '0' .. '9' )+
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
                            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:71: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

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
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:84: ( 'f' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='f') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:84: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:89: ( '-' )? ( '0' .. '9' )+ 'f'
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:89: ( '-' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='-') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:89: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:94: ( '0' .. '9' )+
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
                    	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15862:95: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    match('f'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_FLOAT

    // $ANTLR start RULE_BOOLEAN
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15864:14: ( ( 'true' | 'false' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15864:16: ( 'true' | 'false' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15864:16: ( 'true' | 'false' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='t') ) {
                alt16=1;
            }
            else if ( (LA16_0=='f') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("15864:16: ( 'true' | 'false' )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15864:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15864:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_BOOLEAN

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15866:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15866:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15866:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\\') ) {
                    alt17=1;
                }
                else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFE')) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15866:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15866:61: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
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
            	    break loop17;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15868:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15868:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15868:11: ( '^' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='^') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15868:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15868:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:
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
            	    break loop19;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15870:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15870:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15870:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\uFFFE')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15870:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
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
            	    break loop20;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15870:40: ( ( '\\r' )? '\\n' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\n'||LA22_0=='\r') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15870:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15870:41: ( '\\r' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='\r') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15870:41: '\\r'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15872:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15872:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15872:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15874:16: ( . )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:15874:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:8: ( T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt24=77;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:10: T15
                {
                mT15(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:14: T16
                {
                mT16(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:18: T17
                {
                mT17(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:22: T18
                {
                mT18(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:26: T19
                {
                mT19(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:30: T20
                {
                mT20(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:34: T21
                {
                mT21(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:38: T22
                {
                mT22(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:42: T23
                {
                mT23(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:46: T24
                {
                mT24(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:50: T25
                {
                mT25(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:54: T26
                {
                mT26(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:58: T27
                {
                mT27(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:62: T28
                {
                mT28(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:66: T29
                {
                mT29(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:70: T30
                {
                mT30(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:74: T31
                {
                mT31(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:78: T32
                {
                mT32(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:82: T33
                {
                mT33(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:86: T34
                {
                mT34(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:90: T35
                {
                mT35(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:94: T36
                {
                mT36(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:98: T37
                {
                mT37(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:102: T38
                {
                mT38(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:106: T39
                {
                mT39(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:110: T40
                {
                mT40(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:114: T41
                {
                mT41(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:118: T42
                {
                mT42(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:122: T43
                {
                mT43(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:126: T44
                {
                mT44(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:130: T45
                {
                mT45(); 

                }
                break;
            case 32 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:134: T46
                {
                mT46(); 

                }
                break;
            case 33 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:138: T47
                {
                mT47(); 

                }
                break;
            case 34 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:142: T48
                {
                mT48(); 

                }
                break;
            case 35 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:146: T49
                {
                mT49(); 

                }
                break;
            case 36 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:150: T50
                {
                mT50(); 

                }
                break;
            case 37 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:154: T51
                {
                mT51(); 

                }
                break;
            case 38 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:158: T52
                {
                mT52(); 

                }
                break;
            case 39 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:162: T53
                {
                mT53(); 

                }
                break;
            case 40 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:166: T54
                {
                mT54(); 

                }
                break;
            case 41 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:170: T55
                {
                mT55(); 

                }
                break;
            case 42 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:174: T56
                {
                mT56(); 

                }
                break;
            case 43 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:178: T57
                {
                mT57(); 

                }
                break;
            case 44 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:182: T58
                {
                mT58(); 

                }
                break;
            case 45 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:186: T59
                {
                mT59(); 

                }
                break;
            case 46 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:190: T60
                {
                mT60(); 

                }
                break;
            case 47 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:194: T61
                {
                mT61(); 

                }
                break;
            case 48 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:198: T62
                {
                mT62(); 

                }
                break;
            case 49 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:202: T63
                {
                mT63(); 

                }
                break;
            case 50 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:206: T64
                {
                mT64(); 

                }
                break;
            case 51 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:210: T65
                {
                mT65(); 

                }
                break;
            case 52 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:214: T66
                {
                mT66(); 

                }
                break;
            case 53 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:218: T67
                {
                mT67(); 

                }
                break;
            case 54 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:222: T68
                {
                mT68(); 

                }
                break;
            case 55 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:226: T69
                {
                mT69(); 

                }
                break;
            case 56 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:230: T70
                {
                mT70(); 

                }
                break;
            case 57 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:234: T71
                {
                mT71(); 

                }
                break;
            case 58 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:238: T72
                {
                mT72(); 

                }
                break;
            case 59 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:242: T73
                {
                mT73(); 

                }
                break;
            case 60 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:246: T74
                {
                mT74(); 

                }
                break;
            case 61 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:250: T75
                {
                mT75(); 

                }
                break;
            case 62 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:254: T76
                {
                mT76(); 

                }
                break;
            case 63 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:258: T77
                {
                mT77(); 

                }
                break;
            case 64 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:262: T78
                {
                mT78(); 

                }
                break;
            case 65 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:266: T79
                {
                mT79(); 

                }
                break;
            case 66 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:270: T80
                {
                mT80(); 

                }
                break;
            case 67 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:274: RULE_HOSTCODE
                {
                mRULE_HOSTCODE(); 

                }
                break;
            case 68 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:288: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 69 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:312: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 70 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:328: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 71 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:337: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 72 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:348: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 73 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:361: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 74 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:373: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 75 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:381: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 76 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:397: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 77 :
                // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/kits/ui/contentassist/antlr/internal/InternalKits.g:1:405: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA15_eotS =
        "\5\uffff";
    static final String DFA15_eofS =
        "\5\uffff";
    static final String DFA15_minS =
        "\1\55\1\60\1\56\2\uffff";
    static final String DFA15_maxS =
        "\2\71\1\146\2\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA15_specialS =
        "\5\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\2\uffff\12\2",
            "\12\2",
            "\1\4\1\uffff\12\2\54\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "15862:14: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\1\56\4\61\1\uffff\1\73\1\uffff\1\61\1\uffff\3\61\1\107"+
        "\1\uffff\1\113\7\61\10\uffff\1\61\1\144\1\61\3\uffff\1\54\1\152"+
        "\2\54\5\uffff\2\61\2\uffff\2\61\1\163\2\61\2\uffff\1\152\2\uffff"+
        "\3\61\1\uffff\4\61\7\uffff\15\61\10\uffff\1\61\3\uffff\1\61\10\uffff"+
        "\1\61\1\u0098\3\61\1\uffff\1\u009d\2\61\1\u00a0\1\u00a1\1\u00a2"+
        "\1\u00a3\31\61\2\uffff\1\u00bd\1\u00be\1\uffff\4\61\1\uffff\1\61"+
        "\1\u00c4\4\uffff\2\61\1\u00c7\3\61\1\u00cb\5\61\1\u00d1\11\61\1"+
        "\u00db\1\61\1\u00dd\2\uffff\5\61\1\uffff\2\61\1\uffff\3\61\1\uffff"+
        "\3\61\1\u00ec\1\61\1\uffff\1\61\1\u00ef\1\u00cb\1\u00f0\2\61\1\u00f3"+
        "\2\61\1\uffff\1\61\1\uffff\1\61\1\u00f8\1\61\1\u00fa\1\u00fb\2\61"+
        "\1\u00fe\1\u00ff\5\61\1\uffff\1\61\1\u0106\2\uffff\1\u0107\1\u0108"+
        "\1\uffff\1\61\1\u010a\1\61\1\u010c\1\uffff\1\u010d\2\uffff\1\61"+
        "\1\u010f\2\uffff\1\61\1\u0111\1\u0112\2\61\1\u0115\3\uffff\1\61"+
        "\1\uffff\1\u0117\2\uffff\1\61\1\uffff\1\61\2\uffff\1\u011a\1\61"+
        "\1\uffff\1\61\1\uffff\1\61\1\u011e\1\uffff\3\61\1\uffff\1\61\1\u0123"+
        "\1\u0124\1\u0125\3\uffff";
    static final String DFA24_eofS =
        "\u0126\uffff";
    static final String DFA24_minS =
        "\1\0\1\75\1\162\1\55\1\156\1\157\1\uffff\1\55\1\uffff\1\141\1\uffff"+
        "\1\157\2\145\1\55\1\uffff\1\75\1\157\1\156\1\155\1\141\1\157\2\151"+
        "\10\uffff\1\151\1\52\1\141\3\uffff\1\0\1\56\1\0\1\101\5\uffff\1"+
        "\162\1\145\2\uffff\1\145\1\164\1\60\1\144\1\156\2\uffff\1\56\2\uffff"+
        "\1\170\1\156\1\144\1\uffff\1\144\1\146\1\165\1\170\7\uffff\1\157"+
        "\1\163\1\151\1\160\1\157\1\154\1\156\1\165\1\141\1\163\1\147\2\163"+
        "\10\uffff\1\164\1\uffff\1\0\1\uffff\1\162\10\uffff\1\145\1\60\2"+
        "\156\1\160\1\uffff\1\60\1\155\1\145\4\60\1\144\1\142\1\145\1\151"+
        "\1\165\2\145\1\164\1\154\1\151\1\165\1\145\1\164\1\157\1\141\1\163"+
        "\1\141\1\142\1\151\1\164\1\160\1\156\2\164\1\150\2\uffff\2\60\1"+
        "\uffff\1\164\1\151\1\156\1\165\1\uffff\1\141\1\60\4\uffff\2\151"+
        "\1\60\1\157\2\162\1\60\1\165\1\145\1\147\1\164\1\147\1\60\1\162"+
        "\1\164\1\145\2\154\1\156\2\145\1\141\1\60\1\157\1\60\2\uffff\1\162"+
        "\1\164\1\145\1\164\1\154\1\uffff\1\164\1\156\1\uffff\2\156\1\145"+
        "\1\uffff\2\141\1\156\1\60\1\145\1\uffff\1\164\3\60\1\145\1\147\1"+
        "\60\1\156\1\154\1\uffff\1\162\1\uffff\1\171\1\60\1\162\2\60\1\151"+
        "\1\145\2\60\1\156\1\154\1\156\1\145\1\165\1\uffff\1\162\1\60\2\uffff"+
        "\2\60\1\uffff\1\163\1\60\1\171\1\60\1\uffff\1\60\2\uffff\1\157\1"+
        "\60\2\uffff\1\143\2\60\1\144\1\164\1\60\3\uffff\1\151\1\uffff\1"+
        "\60\2\uffff\1\156\1\uffff\1\145\2\uffff\1\60\1\160\1\uffff\1\157"+
        "\1\uffff\1\141\1\60\1\uffff\1\165\1\156\1\154\1\uffff\1\164\3\60"+
        "\3\uffff";
    static final String DFA24_maxS =
        "\1\ufffe\1\75\2\165\1\156\1\157\1\uffff\1\71\1\uffff\1\157\1\uffff"+
        "\1\157\1\145\1\162\1\75\1\uffff\1\76\1\157\2\156\1\154\1\157\1\165"+
        "\1\157\10\uffff\1\151\1\57\1\141\3\uffff\1\ufffe\1\146\1\ufffe\1"+
        "\172\5\uffff\1\162\1\145\2\uffff\1\151\1\164\1\172\1\144\1\164\2"+
        "\uffff\1\146\2\uffff\1\170\1\156\1\144\1\uffff\1\156\1\164\1\165"+
        "\1\170\7\uffff\1\157\1\163\1\164\1\160\1\157\1\154\1\156\1\165\1"+
        "\162\1\163\1\147\2\163\10\uffff\1\164\1\uffff\1\ufffe\1\uffff\1"+
        "\162\10\uffff\1\145\1\172\1\170\1\156\1\160\1\uffff\1\172\1\155"+
        "\1\145\4\172\1\144\1\142\1\145\1\151\1\165\2\145\1\164\1\154\1\151"+
        "\1\165\1\145\1\164\1\157\1\141\1\163\1\141\1\142\1\151\1\164\1\160"+
        "\1\156\2\164\1\150\2\uffff\2\172\1\uffff\1\164\1\151\1\156\1\165"+
        "\1\uffff\1\141\1\172\4\uffff\2\151\1\172\1\157\2\162\1\172\1\165"+
        "\1\145\1\147\1\164\1\147\1\172\1\162\1\164\1\145\2\154\1\156\2\145"+
        "\1\141\1\172\1\157\1\172\2\uffff\1\162\1\164\1\145\1\164\1\154\1"+
        "\uffff\1\164\1\156\1\uffff\2\156\1\145\1\uffff\2\141\1\156\1\172"+
        "\1\145\1\uffff\1\164\3\172\1\145\1\147\1\172\1\156\1\154\1\uffff"+
        "\1\162\1\uffff\1\171\1\172\1\162\2\172\1\151\1\145\2\172\1\156\1"+
        "\154\1\156\1\145\1\165\1\uffff\1\162\1\172\2\uffff\2\172\1\uffff"+
        "\1\163\1\172\1\171\1\172\1\uffff\1\172\2\uffff\1\157\1\172\2\uffff"+
        "\1\143\2\172\1\144\1\164\1\172\3\uffff\1\151\1\uffff\1\172\2\uffff"+
        "\1\156\1\uffff\1\145\2\uffff\1\172\1\160\1\uffff\1\157\1\uffff\1"+
        "\141\1\172\1\uffff\1\165\1\156\1\154\1\uffff\1\164\3\172\3\uffff";
    static final String DFA24_acceptS =
        "\6\uffff\1\6\1\uffff\1\10\1\uffff\1\12\4\uffff\1\22\10\uffff\1\45"+
        "\1\46\1\50\1\51\1\52\1\53\1\54\1\55\3\uffff\1\71\1\76\1\101\4\uffff"+
        "\1\112\1\114\1\115\1\65\1\1\2\uffff\1\112\1\20\5\uffff\1\6\1\17"+
        "\1\uffff\1\7\1\10\3\uffff\1\12\4\uffff\1\21\1\26\1\25\1\22\1\24"+
        "\1\27\1\23\15\uffff\1\45\1\46\1\50\1\51\1\52\1\53\1\54\1\55\1\uffff"+
        "\1\113\1\uffff\1\63\1\uffff\1\71\1\76\1\101\1\103\1\106\1\107\1"+
        "\111\1\114\5\uffff\1\3\40\uffff\1\105\1\104\2\uffff\1\2\4\uffff"+
        "\1\4\2\uffff\1\5\1\41\1\42\1\11\31\uffff\1\67\1\30\5\uffff\1\40"+
        "\2\uffff\1\44\3\uffff\1\110\5\uffff\1\77\11\uffff\1\37\1\uffff\1"+
        "\62\16\uffff\1\70\2\uffff\1\34\1\100\2\uffff\1\47\4\uffff\1\60\1"+
        "\uffff\1\72\1\13\2\uffff\1\43\1\74\6\uffff\1\75\1\35\1\36\1\uffff"+
        "\1\64\1\uffff\1\56\1\57\1\uffff\1\66\1\uffff\1\16\1\31\2\uffff\1"+
        "\33\1\uffff\1\102\2\uffff\1\32\3\uffff\1\15\4\uffff\1\61\1\14\1"+
        "\73";
    static final String DFA24_specialS =
        "\u0126\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\54\1\50\1\45\3\54\1\46\1"+
            "\30\1\31\1\10\1\6\1\35\1\7\1\44\1\41\12\47\1\1\1\43\1\20\1\17"+
            "\1\16\1\12\1\32\32\52\1\33\1\54\1\34\1\51\1\52\1\54\1\4\1\21"+
            "\1\13\1\25\1\52\1\24\1\52\1\27\1\23\3\52\1\11\1\5\1\3\1\2\1"+
            "\52\1\14\1\26\1\15\1\22\1\42\1\40\3\52\1\36\1\54\1\37\uff81"+
            "\54",
            "\1\55",
            "\1\60\2\uffff\1\57",
            "\1\62\100\uffff\1\63\3\uffff\1\65\2\uffff\1\64",
            "\1\66",
            "\1\67",
            "",
            "\1\71\2\uffff\12\72",
            "",
            "\1\75\7\uffff\1\76\5\uffff\1\77",
            "",
            "\1\101",
            "\1\102",
            "\1\104\14\uffff\1\103",
            "\1\105\17\uffff\1\106",
            "",
            "\1\111\1\112",
            "\1\114",
            "\1\115",
            "\1\117\1\116",
            "\1\121\7\uffff\1\122\2\uffff\1\120",
            "\1\123",
            "\1\126\12\uffff\1\124\1\125",
            "\1\130\5\uffff\1\127",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "\1\143\4\uffff\1\142",
            "\1\145",
            "",
            "",
            "",
            "\uffff\151",
            "\1\153\1\uffff\12\72\54\uffff\1\153",
            "\uffff\154",
            "\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "",
            "\1\156",
            "\1\157",
            "",
            "",
            "\1\160\3\uffff\1\161",
            "\1\162",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\164",
            "\1\166\3\uffff\1\165\1\uffff\1\167",
            "",
            "",
            "\1\153\1\uffff\12\72\54\uffff\1\153",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\1\175\10\uffff\1\174\1\173",
            "\1\u0080\1\176\14\uffff\1\177",
            "\1\u0081",
            "\1\u0082",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0087\6\uffff\1\u0085\3\uffff\1\u0086",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008e\20\uffff\1\u008d",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0093",
            "",
            "\52\u0094\1\u0095\uffd4\u0094",
            "",
            "\1\u0096",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0097",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0099\11\uffff\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u009e",
            "\1\u009f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
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
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00dc",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u00eb\13\61",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f1",
            "\1\u00f2",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00fc",
            "\1\u00fd",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "",
            "\1\u0105",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0109",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u010b",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u010e",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u0110",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0113",
            "\1\u0114",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "\1\u0116",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u0118",
            "",
            "\1\u0119",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u011b",
            "",
            "\1\u011c",
            "",
            "\1\u011d",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "\1\u0122",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
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
            return "1:1: Tokens : ( T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}