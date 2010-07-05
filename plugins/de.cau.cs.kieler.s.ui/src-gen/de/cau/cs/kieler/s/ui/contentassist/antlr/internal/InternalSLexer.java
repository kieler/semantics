package de.cau.cs.kieler.s.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
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
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=72;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=4;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=9;
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
    public InternalSLexer() {;} 
    public InternalSLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:10:5: ( 'pre' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:10:7: 'pre'
            {
            match("pre"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11:5: ( 'or' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11:7: 'or'
            {
            match("or"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:12:5: ( 'and' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:12:7: 'and'
            {
            match("and"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:13:5: ( 'not' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:13:7: 'not'
            {
            match("not"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:14:5: ( '+' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:14:7: '+'
            {
            match('+'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:15:5: ( '-' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:15:7: '-'
            {
            match('-'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:16:5: ( '*' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:16:7: '*'
            {
            match('*'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:17:5: ( 'mod' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:17:7: 'mod'
            {
            match("mod"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:18:5: ( '/' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:18:7: '/'
            {
            match('/'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:19:5: ( '?' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:19:7: '?'
            {
            match('?'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:20:5: ( 'E' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:20:7: 'E'
            {
            match('E'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:21:5: ( 'e' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:21:7: 'e'
            {
            match('e'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:22:5: ( 'true' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:22:7: 'true'
            {
            match("true"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:23:5: ( 'false' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:23:7: 'false'
            {
            match("false"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:24:5: ( '=' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:24:7: '='
            {
            match('='); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:25:5: ( '<' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:25:7: '<'
            {
            match('<'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:26:5: ( '<=' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:26:7: '<='
            {
            match("<="); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:27:5: ( '>' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:27:7: '>'
            {
            match('>'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:28:5: ( '>=' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:28:7: '>='
            {
            match(">="); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:29:5: ( '<>' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:29:7: '<>'
            {
            match("<>"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:30:5: ( 'PURE' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:30:7: 'PURE'
            {
            match("PURE"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:31:5: ( 'BOOL' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:31:7: 'BOOL'
            {
            match("BOOL"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:32:5: ( 'UNSIGNED' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:32:7: 'UNSIGNED'
            {
            match("UNSIGNED"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:33:5: ( 'INT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:33:7: 'INT'
            {
            match("INT"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:34:5: ( 'FLOAT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:34:7: 'FLOAT'
            {
            match("FLOAT"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:35:5: ( 'HOST' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:35:7: 'HOST'
            {
            match("HOST"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:36:5: ( 'NONE' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:36:7: 'NONE'
            {
            match("NONE"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:37:5: ( 'max' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:37:7: 'max'
            {
            match("max"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:38:5: ( 'min' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:38:7: 'min'
            {
            match("min"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:39:5: ( 'host' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:39:7: 'host'
            {
            match("host"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:40:5: ( 'Synchronous Program' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:40:7: 'Synchronous Program'
            {
            match("Synchronous Program"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:41:5: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:41:7: '('
            {
            match('('); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:42:5: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:42:7: ')'
            {
            match(')'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:43:5: ( 'Inputs' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:43:7: 'Inputs'
            {
            match("Inputs"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:44:5: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:44:7: ';'
            {
            match(';'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:45:5: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:45:7: ','
            {
            match(','); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:46:5: ( 'Outputs' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:46:7: 'Outputs'
            {
            match("Outputs"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:47:5: ( 'Signals' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:47:7: 'Signals'
            {
            match("Signals"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:48:5: ( ':' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:48:7: ':'
            {
            match(':'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:49:5: ( 'SIGNALS' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:49:7: 'SIGNALS'
            {
            match("SIGNALS"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:50:5: ( 'signal' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:50:7: 'signal'
            {
            match("signal"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:51:5: ( ':=' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:51:7: ':='
            {
            match(":="); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:52:5: ( 'combine' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:52:7: 'combine'
            {
            match("combine"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:53:5: ( 'with' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:53:7: 'with'
            {
            match("with"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:54:5: ( 'PAUSE' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:54:7: 'PAUSE'
            {
            match("PAUSE"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:55:5: ( 'TERM' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:55:7: 'TERM'
            {
            match("TERM"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:56:5: ( 'Halt' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:56:7: 'Halt'
            {
            match("Halt"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:57:5: ( 'JOIN' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:57:7: 'JOIN'
            {
            match("JOIN"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:58:5: ( 'ABORT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:58:7: 'ABORT'
            {
            match("ABORT"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:59:5: ( 'PRESENT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:59:7: 'PRESENT'
            {
            match("PRESENT"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:60:5: ( '{' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:60:7: '{'
            {
            match('{'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:61:5: ( '}' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:61:7: '}'
            {
            match('}'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:62:5: ( 'GOTO' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:62:7: 'GOTO'
            {
            match("GOTO"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:63:5: ( 'FORK' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:63:7: 'FORK'
            {
            match("FORK"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:64:5: ( 'FORKE' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:64:7: 'FORKE'
            {
            match("FORKE"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:65:5: ( 'EMIT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:65:7: 'EMIT'
            {
            match("EMIT"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:66:5: ( 'AWAIT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:66:7: 'AWAIT'
            {
            match("AWAIT"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:67:5: ( 'PRIO' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:67:7: 'PRIO'
            {
            match("PRIO"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:68:5: ( '.' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:68:7: '.'
            {
            match('.'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:69:5: ( 'input' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:69:7: 'input'
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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:70:5: ( 'output' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:70:7: 'output'
            {
            match("output"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9981:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9981:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9981:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9981:11: '^'
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

            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9981:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:
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
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9983:10: ( ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9983:12: ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9983:12: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9983:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9985:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9985:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9985:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("9985:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9985:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9985:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9985:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9985:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9985:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9985:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9985:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9985:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9987:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9987:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9987:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9987:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9989:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9989:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9989:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9989:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9989:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9989:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9989:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9989:41: '\\r'
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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9991:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9991:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9991:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9993:16: ( . )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:9993:18: .
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
        // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=68;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='p') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='r') ) {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='e') ) {
                    int LA12_116 = input.LA(4);

                    if ( ((LA12_116>='0' && LA12_116<='9')||(LA12_116>='A' && LA12_116<='Z')||LA12_116=='_'||(LA12_116>='a' && LA12_116<='z')) ) {
                        alt12=62;
                    }
                    else {
                        alt12=1;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='o') ) {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='t') ) {
                    int LA12_117 = input.LA(4);

                    if ( (LA12_117=='p') ) {
                        int LA12_155 = input.LA(5);

                        if ( (LA12_155=='u') ) {
                            int LA12_191 = input.LA(6);

                            if ( (LA12_191=='t') ) {
                                int LA12_222 = input.LA(7);

                                if ( ((LA12_222>='0' && LA12_222<='9')||(LA12_222>='A' && LA12_222<='Z')||LA12_222=='_'||(LA12_222>='a' && LA12_222<='z')) ) {
                                    alt12=62;
                                }
                                else {
                                    alt12=61;}
                            }
                            else {
                                alt12=62;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            case 'r':
                {
                int LA12_54 = input.LA(3);

                if ( ((LA12_54>='0' && LA12_54<='9')||(LA12_54>='A' && LA12_54<='Z')||LA12_54=='_'||(LA12_54>='a' && LA12_54<='z')) ) {
                    alt12=62;
                }
                else {
                    alt12=2;}
                }
                break;
            default:
                alt12=62;}

        }
        else if ( (LA12_0=='a') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='n') ) {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='d') ) {
                    int LA12_119 = input.LA(4);

                    if ( ((LA12_119>='0' && LA12_119<='9')||(LA12_119>='A' && LA12_119<='Z')||LA12_119=='_'||(LA12_119>='a' && LA12_119<='z')) ) {
                        alt12=62;
                    }
                    else {
                        alt12=3;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='n') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='o') ) {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='t') ) {
                    int LA12_120 = input.LA(4);

                    if ( ((LA12_120>='0' && LA12_120<='9')||(LA12_120>='A' && LA12_120<='Z')||LA12_120=='_'||(LA12_120>='a' && LA12_120<='z')) ) {
                        alt12=62;
                    }
                    else {
                        alt12=4;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='+') ) {
            alt12=5;
        }
        else if ( (LA12_0=='-') ) {
            alt12=6;
        }
        else if ( (LA12_0=='*') ) {
            alt12=7;
        }
        else if ( (LA12_0=='m') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_60 = input.LA(3);

                if ( (LA12_60=='d') ) {
                    int LA12_121 = input.LA(4);

                    if ( ((LA12_121>='0' && LA12_121<='9')||(LA12_121>='A' && LA12_121<='Z')||LA12_121=='_'||(LA12_121>='a' && LA12_121<='z')) ) {
                        alt12=62;
                    }
                    else {
                        alt12=8;}
                }
                else {
                    alt12=62;}
                }
                break;
            case 'i':
                {
                int LA12_61 = input.LA(3);

                if ( (LA12_61=='n') ) {
                    int LA12_122 = input.LA(4);

                    if ( ((LA12_122>='0' && LA12_122<='9')||(LA12_122>='A' && LA12_122<='Z')||LA12_122=='_'||(LA12_122>='a' && LA12_122<='z')) ) {
                        alt12=62;
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=62;}
                }
                break;
            case 'a':
                {
                int LA12_62 = input.LA(3);

                if ( (LA12_62=='x') ) {
                    int LA12_123 = input.LA(4);

                    if ( ((LA12_123>='0' && LA12_123<='9')||(LA12_123>='A' && LA12_123<='Z')||LA12_123=='_'||(LA12_123>='a' && LA12_123<='z')) ) {
                        alt12=62;
                    }
                    else {
                        alt12=28;}
                }
                else {
                    alt12=62;}
                }
                break;
            default:
                alt12=62;}

        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=66;
                }
                break;
            case '*':
                {
                alt12=65;
                }
                break;
            default:
                alt12=9;}

        }
        else if ( (LA12_0=='?') ) {
            alt12=10;
        }
        else if ( (LA12_0=='E') ) {
            switch ( input.LA(2) ) {
            case 'M':
                {
                int LA12_67 = input.LA(3);

                if ( (LA12_67=='I') ) {
                    int LA12_124 = input.LA(4);

                    if ( (LA12_124=='T') ) {
                        int LA12_161 = input.LA(5);

                        if ( ((LA12_161>='0' && LA12_161<='9')||(LA12_161>='A' && LA12_161<='Z')||LA12_161=='_'||(LA12_161>='a' && LA12_161<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=56;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
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
            case '_':
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
                alt12=62;
                }
                break;
            default:
                alt12=11;}

        }
        else if ( (LA12_0=='e') ) {
            int LA12_12 = input.LA(2);

            if ( ((LA12_12>='0' && LA12_12<='9')||(LA12_12>='A' && LA12_12<='Z')||LA12_12=='_'||(LA12_12>='a' && LA12_12<='z')) ) {
                alt12=62;
            }
            else {
                alt12=12;}
        }
        else if ( (LA12_0=='t') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='r') ) {
                int LA12_70 = input.LA(3);

                if ( (LA12_70=='u') ) {
                    int LA12_125 = input.LA(4);

                    if ( (LA12_125=='e') ) {
                        int LA12_162 = input.LA(5);

                        if ( ((LA12_162>='0' && LA12_162<='9')||(LA12_162>='A' && LA12_162<='Z')||LA12_162=='_'||(LA12_162>='a' && LA12_162<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=13;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='f') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='a') ) {
                int LA12_71 = input.LA(3);

                if ( (LA12_71=='l') ) {
                    int LA12_126 = input.LA(4);

                    if ( (LA12_126=='s') ) {
                        int LA12_163 = input.LA(5);

                        if ( (LA12_163=='e') ) {
                            int LA12_194 = input.LA(6);

                            if ( ((LA12_194>='0' && LA12_194<='9')||(LA12_194>='A' && LA12_194<='Z')||LA12_194=='_'||(LA12_194>='a' && LA12_194<='z')) ) {
                                alt12=62;
                            }
                            else {
                                alt12=14;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='=') ) {
            alt12=15;
        }
        else if ( (LA12_0=='<') ) {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt12=20;
                }
                break;
            case '=':
                {
                alt12=17;
                }
                break;
            default:
                alt12=16;}

        }
        else if ( (LA12_0=='>') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='=') ) {
                alt12=19;
            }
            else {
                alt12=18;}
        }
        else if ( (LA12_0=='P') ) {
            switch ( input.LA(2) ) {
            case 'A':
                {
                int LA12_78 = input.LA(3);

                if ( (LA12_78=='U') ) {
                    int LA12_127 = input.LA(4);

                    if ( (LA12_127=='S') ) {
                        int LA12_164 = input.LA(5);

                        if ( (LA12_164=='E') ) {
                            int LA12_195 = input.LA(6);

                            if ( ((LA12_195>='0' && LA12_195<='9')||(LA12_195>='A' && LA12_195<='Z')||LA12_195=='_'||(LA12_195>='a' && LA12_195<='z')) ) {
                                alt12=62;
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            case 'R':
                {
                switch ( input.LA(3) ) {
                case 'I':
                    {
                    int LA12_128 = input.LA(4);

                    if ( (LA12_128=='O') ) {
                        int LA12_165 = input.LA(5);

                        if ( ((LA12_165>='0' && LA12_165<='9')||(LA12_165>='A' && LA12_165<='Z')||LA12_165=='_'||(LA12_165>='a' && LA12_165<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=58;}
                    }
                    else {
                        alt12=62;}
                    }
                    break;
                case 'E':
                    {
                    int LA12_129 = input.LA(4);

                    if ( (LA12_129=='S') ) {
                        int LA12_166 = input.LA(5);

                        if ( (LA12_166=='E') ) {
                            int LA12_197 = input.LA(6);

                            if ( (LA12_197=='N') ) {
                                int LA12_225 = input.LA(7);

                                if ( (LA12_225=='T') ) {
                                    int LA12_240 = input.LA(8);

                                    if ( ((LA12_240>='0' && LA12_240<='9')||(LA12_240>='A' && LA12_240<='Z')||LA12_240=='_'||(LA12_240>='a' && LA12_240<='z')) ) {
                                        alt12=62;
                                    }
                                    else {
                                        alt12=50;}
                                }
                                else {
                                    alt12=62;}
                            }
                            else {
                                alt12=62;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                    }
                    break;
                default:
                    alt12=62;}

                }
                break;
            case 'U':
                {
                int LA12_80 = input.LA(3);

                if ( (LA12_80=='R') ) {
                    int LA12_130 = input.LA(4);

                    if ( (LA12_130=='E') ) {
                        int LA12_167 = input.LA(5);

                        if ( ((LA12_167>='0' && LA12_167<='9')||(LA12_167>='A' && LA12_167<='Z')||LA12_167=='_'||(LA12_167>='a' && LA12_167<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=21;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            default:
                alt12=62;}

        }
        else if ( (LA12_0=='B') ) {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='O') ) {
                int LA12_81 = input.LA(3);

                if ( (LA12_81=='O') ) {
                    int LA12_131 = input.LA(4);

                    if ( (LA12_131=='L') ) {
                        int LA12_168 = input.LA(5);

                        if ( ((LA12_168>='0' && LA12_168<='9')||(LA12_168>='A' && LA12_168<='Z')||LA12_168=='_'||(LA12_168>='a' && LA12_168<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='U') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='N') ) {
                int LA12_82 = input.LA(3);

                if ( (LA12_82=='S') ) {
                    int LA12_132 = input.LA(4);

                    if ( (LA12_132=='I') ) {
                        int LA12_169 = input.LA(5);

                        if ( (LA12_169=='G') ) {
                            int LA12_200 = input.LA(6);

                            if ( (LA12_200=='N') ) {
                                int LA12_226 = input.LA(7);

                                if ( (LA12_226=='E') ) {
                                    int LA12_241 = input.LA(8);

                                    if ( (LA12_241=='D') ) {
                                        int LA12_250 = input.LA(9);

                                        if ( ((LA12_250>='0' && LA12_250<='9')||(LA12_250>='A' && LA12_250<='Z')||LA12_250=='_'||(LA12_250>='a' && LA12_250<='z')) ) {
                                            alt12=62;
                                        }
                                        else {
                                            alt12=23;}
                                    }
                                    else {
                                        alt12=62;}
                                }
                                else {
                                    alt12=62;}
                            }
                            else {
                                alt12=62;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='I') ) {
            switch ( input.LA(2) ) {
            case 'N':
                {
                int LA12_83 = input.LA(3);

                if ( (LA12_83=='T') ) {
                    int LA12_133 = input.LA(4);

                    if ( ((LA12_133>='0' && LA12_133<='9')||(LA12_133>='A' && LA12_133<='Z')||LA12_133=='_'||(LA12_133>='a' && LA12_133<='z')) ) {
                        alt12=62;
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=62;}
                }
                break;
            case 'n':
                {
                int LA12_84 = input.LA(3);

                if ( (LA12_84=='p') ) {
                    int LA12_134 = input.LA(4);

                    if ( (LA12_134=='u') ) {
                        int LA12_171 = input.LA(5);

                        if ( (LA12_171=='t') ) {
                            int LA12_201 = input.LA(6);

                            if ( (LA12_201=='s') ) {
                                int LA12_227 = input.LA(7);

                                if ( ((LA12_227>='0' && LA12_227<='9')||(LA12_227>='A' && LA12_227<='Z')||LA12_227=='_'||(LA12_227>='a' && LA12_227<='z')) ) {
                                    alt12=62;
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=62;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            default:
                alt12=62;}

        }
        else if ( (LA12_0=='F') ) {
            switch ( input.LA(2) ) {
            case 'O':
                {
                int LA12_85 = input.LA(3);

                if ( (LA12_85=='R') ) {
                    int LA12_135 = input.LA(4);

                    if ( (LA12_135=='K') ) {
                        switch ( input.LA(5) ) {
                        case 'E':
                            {
                            int LA12_202 = input.LA(6);

                            if ( ((LA12_202>='0' && LA12_202<='9')||(LA12_202>='A' && LA12_202<='Z')||LA12_202=='_'||(LA12_202>='a' && LA12_202<='z')) ) {
                                alt12=62;
                            }
                            else {
                                alt12=55;}
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
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
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
                        case '_':
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
                            alt12=62;
                            }
                            break;
                        default:
                            alt12=54;}

                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            case 'L':
                {
                int LA12_86 = input.LA(3);

                if ( (LA12_86=='O') ) {
                    int LA12_136 = input.LA(4);

                    if ( (LA12_136=='A') ) {
                        int LA12_173 = input.LA(5);

                        if ( (LA12_173=='T') ) {
                            int LA12_204 = input.LA(6);

                            if ( ((LA12_204>='0' && LA12_204<='9')||(LA12_204>='A' && LA12_204<='Z')||LA12_204=='_'||(LA12_204>='a' && LA12_204<='z')) ) {
                                alt12=62;
                            }
                            else {
                                alt12=25;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            default:
                alt12=62;}

        }
        else if ( (LA12_0=='H') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_87 = input.LA(3);

                if ( (LA12_87=='l') ) {
                    int LA12_137 = input.LA(4);

                    if ( (LA12_137=='t') ) {
                        int LA12_174 = input.LA(5);

                        if ( ((LA12_174>='0' && LA12_174<='9')||(LA12_174>='A' && LA12_174<='Z')||LA12_174=='_'||(LA12_174>='a' && LA12_174<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=47;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            case 'O':
                {
                int LA12_88 = input.LA(3);

                if ( (LA12_88=='S') ) {
                    int LA12_138 = input.LA(4);

                    if ( (LA12_138=='T') ) {
                        int LA12_175 = input.LA(5);

                        if ( ((LA12_175>='0' && LA12_175<='9')||(LA12_175>='A' && LA12_175<='Z')||LA12_175=='_'||(LA12_175>='a' && LA12_175<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=26;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            default:
                alt12=62;}

        }
        else if ( (LA12_0=='N') ) {
            int LA12_24 = input.LA(2);

            if ( (LA12_24=='O') ) {
                int LA12_89 = input.LA(3);

                if ( (LA12_89=='N') ) {
                    int LA12_139 = input.LA(4);

                    if ( (LA12_139=='E') ) {
                        int LA12_176 = input.LA(5);

                        if ( ((LA12_176>='0' && LA12_176<='9')||(LA12_176>='A' && LA12_176<='Z')||LA12_176=='_'||(LA12_176>='a' && LA12_176<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='h') ) {
            int LA12_25 = input.LA(2);

            if ( (LA12_25=='o') ) {
                int LA12_90 = input.LA(3);

                if ( (LA12_90=='s') ) {
                    int LA12_140 = input.LA(4);

                    if ( (LA12_140=='t') ) {
                        int LA12_177 = input.LA(5);

                        if ( ((LA12_177>='0' && LA12_177<='9')||(LA12_177>='A' && LA12_177<='Z')||LA12_177=='_'||(LA12_177>='a' && LA12_177<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='S') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_91 = input.LA(3);

                if ( (LA12_91=='g') ) {
                    int LA12_141 = input.LA(4);

                    if ( (LA12_141=='n') ) {
                        int LA12_178 = input.LA(5);

                        if ( (LA12_178=='a') ) {
                            int LA12_209 = input.LA(6);

                            if ( (LA12_209=='l') ) {
                                int LA12_230 = input.LA(7);

                                if ( (LA12_230=='s') ) {
                                    int LA12_243 = input.LA(8);

                                    if ( ((LA12_243>='0' && LA12_243<='9')||(LA12_243>='A' && LA12_243<='Z')||LA12_243=='_'||(LA12_243>='a' && LA12_243<='z')) ) {
                                        alt12=62;
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=62;}
                            }
                            else {
                                alt12=62;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            case 'I':
                {
                int LA12_92 = input.LA(3);

                if ( (LA12_92=='G') ) {
                    int LA12_142 = input.LA(4);

                    if ( (LA12_142=='N') ) {
                        int LA12_179 = input.LA(5);

                        if ( (LA12_179=='A') ) {
                            int LA12_210 = input.LA(6);

                            if ( (LA12_210=='L') ) {
                                int LA12_231 = input.LA(7);

                                if ( (LA12_231=='S') ) {
                                    int LA12_244 = input.LA(8);

                                    if ( ((LA12_244>='0' && LA12_244<='9')||(LA12_244>='A' && LA12_244<='Z')||LA12_244=='_'||(LA12_244>='a' && LA12_244<='z')) ) {
                                        alt12=62;
                                    }
                                    else {
                                        alt12=40;}
                                }
                                else {
                                    alt12=62;}
                            }
                            else {
                                alt12=62;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            case 'y':
                {
                int LA12_93 = input.LA(3);

                if ( (LA12_93=='n') ) {
                    int LA12_143 = input.LA(4);

                    if ( (LA12_143=='c') ) {
                        int LA12_180 = input.LA(5);

                        if ( (LA12_180=='h') ) {
                            int LA12_211 = input.LA(6);

                            if ( (LA12_211=='r') ) {
                                int LA12_232 = input.LA(7);

                                if ( (LA12_232=='o') ) {
                                    int LA12_245 = input.LA(8);

                                    if ( (LA12_245=='n') ) {
                                        int LA12_253 = input.LA(9);

                                        if ( (LA12_253=='o') ) {
                                            int LA12_257 = input.LA(10);

                                            if ( (LA12_257=='u') ) {
                                                int LA12_258 = input.LA(11);

                                                if ( (LA12_258=='s') ) {
                                                    int LA12_259 = input.LA(12);

                                                    if ( (LA12_259==' ') ) {
                                                        alt12=31;
                                                    }
                                                    else {
                                                        alt12=62;}
                                                }
                                                else {
                                                    alt12=62;}
                                            }
                                            else {
                                                alt12=62;}
                                        }
                                        else {
                                            alt12=62;}
                                    }
                                    else {
                                        alt12=62;}
                                }
                                else {
                                    alt12=62;}
                            }
                            else {
                                alt12=62;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            default:
                alt12=62;}

        }
        else if ( (LA12_0=='(') ) {
            alt12=32;
        }
        else if ( (LA12_0==')') ) {
            alt12=33;
        }
        else if ( (LA12_0==';') ) {
            alt12=35;
        }
        else if ( (LA12_0==',') ) {
            alt12=36;
        }
        else if ( (LA12_0=='O') ) {
            int LA12_31 = input.LA(2);

            if ( (LA12_31=='u') ) {
                int LA12_98 = input.LA(3);

                if ( (LA12_98=='t') ) {
                    int LA12_144 = input.LA(4);

                    if ( (LA12_144=='p') ) {
                        int LA12_181 = input.LA(5);

                        if ( (LA12_181=='u') ) {
                            int LA12_212 = input.LA(6);

                            if ( (LA12_212=='t') ) {
                                int LA12_233 = input.LA(7);

                                if ( (LA12_233=='s') ) {
                                    int LA12_246 = input.LA(8);

                                    if ( ((LA12_246>='0' && LA12_246<='9')||(LA12_246>='A' && LA12_246<='Z')||LA12_246=='_'||(LA12_246>='a' && LA12_246<='z')) ) {
                                        alt12=62;
                                    }
                                    else {
                                        alt12=37;}
                                }
                                else {
                                    alt12=62;}
                            }
                            else {
                                alt12=62;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0==':') ) {
            int LA12_32 = input.LA(2);

            if ( (LA12_32=='=') ) {
                alt12=42;
            }
            else {
                alt12=39;}
        }
        else if ( (LA12_0=='s') ) {
            int LA12_33 = input.LA(2);

            if ( (LA12_33=='i') ) {
                int LA12_101 = input.LA(3);

                if ( (LA12_101=='g') ) {
                    int LA12_145 = input.LA(4);

                    if ( (LA12_145=='n') ) {
                        int LA12_182 = input.LA(5);

                        if ( (LA12_182=='a') ) {
                            int LA12_213 = input.LA(6);

                            if ( (LA12_213=='l') ) {
                                int LA12_234 = input.LA(7);

                                if ( ((LA12_234>='0' && LA12_234<='9')||(LA12_234>='A' && LA12_234<='Z')||LA12_234=='_'||(LA12_234>='a' && LA12_234<='z')) ) {
                                    alt12=62;
                                }
                                else {
                                    alt12=41;}
                            }
                            else {
                                alt12=62;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='c') ) {
            int LA12_34 = input.LA(2);

            if ( (LA12_34=='o') ) {
                int LA12_102 = input.LA(3);

                if ( (LA12_102=='m') ) {
                    int LA12_146 = input.LA(4);

                    if ( (LA12_146=='b') ) {
                        int LA12_183 = input.LA(5);

                        if ( (LA12_183=='i') ) {
                            int LA12_214 = input.LA(6);

                            if ( (LA12_214=='n') ) {
                                int LA12_235 = input.LA(7);

                                if ( (LA12_235=='e') ) {
                                    int LA12_248 = input.LA(8);

                                    if ( ((LA12_248>='0' && LA12_248<='9')||(LA12_248>='A' && LA12_248<='Z')||LA12_248=='_'||(LA12_248>='a' && LA12_248<='z')) ) {
                                        alt12=62;
                                    }
                                    else {
                                        alt12=43;}
                                }
                                else {
                                    alt12=62;}
                            }
                            else {
                                alt12=62;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='w') ) {
            int LA12_35 = input.LA(2);

            if ( (LA12_35=='i') ) {
                int LA12_103 = input.LA(3);

                if ( (LA12_103=='t') ) {
                    int LA12_147 = input.LA(4);

                    if ( (LA12_147=='h') ) {
                        int LA12_184 = input.LA(5);

                        if ( ((LA12_184>='0' && LA12_184<='9')||(LA12_184>='A' && LA12_184<='Z')||LA12_184=='_'||(LA12_184>='a' && LA12_184<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=44;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='T') ) {
            int LA12_36 = input.LA(2);

            if ( (LA12_36=='E') ) {
                int LA12_104 = input.LA(3);

                if ( (LA12_104=='R') ) {
                    int LA12_148 = input.LA(4);

                    if ( (LA12_148=='M') ) {
                        int LA12_185 = input.LA(5);

                        if ( ((LA12_185>='0' && LA12_185<='9')||(LA12_185>='A' && LA12_185<='Z')||LA12_185=='_'||(LA12_185>='a' && LA12_185<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='J') ) {
            int LA12_37 = input.LA(2);

            if ( (LA12_37=='O') ) {
                int LA12_105 = input.LA(3);

                if ( (LA12_105=='I') ) {
                    int LA12_149 = input.LA(4);

                    if ( (LA12_149=='N') ) {
                        int LA12_186 = input.LA(5);

                        if ( ((LA12_186>='0' && LA12_186<='9')||(LA12_186>='A' && LA12_186<='Z')||LA12_186=='_'||(LA12_186>='a' && LA12_186<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=48;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='A') ) {
            switch ( input.LA(2) ) {
            case 'B':
                {
                int LA12_106 = input.LA(3);

                if ( (LA12_106=='O') ) {
                    int LA12_150 = input.LA(4);

                    if ( (LA12_150=='R') ) {
                        int LA12_187 = input.LA(5);

                        if ( (LA12_187=='T') ) {
                            int LA12_218 = input.LA(6);

                            if ( ((LA12_218>='0' && LA12_218<='9')||(LA12_218>='A' && LA12_218<='Z')||LA12_218=='_'||(LA12_218>='a' && LA12_218<='z')) ) {
                                alt12=62;
                            }
                            else {
                                alt12=49;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            case 'W':
                {
                int LA12_107 = input.LA(3);

                if ( (LA12_107=='A') ) {
                    int LA12_151 = input.LA(4);

                    if ( (LA12_151=='I') ) {
                        int LA12_188 = input.LA(5);

                        if ( (LA12_188=='T') ) {
                            int LA12_219 = input.LA(6);

                            if ( ((LA12_219>='0' && LA12_219<='9')||(LA12_219>='A' && LA12_219<='Z')||LA12_219=='_'||(LA12_219>='a' && LA12_219<='z')) ) {
                                alt12=62;
                            }
                            else {
                                alt12=57;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            default:
                alt12=62;}

        }
        else if ( (LA12_0=='{') ) {
            alt12=51;
        }
        else if ( (LA12_0=='}') ) {
            alt12=52;
        }
        else if ( (LA12_0=='G') ) {
            int LA12_41 = input.LA(2);

            if ( (LA12_41=='O') ) {
                int LA12_110 = input.LA(3);

                if ( (LA12_110=='T') ) {
                    int LA12_152 = input.LA(4);

                    if ( (LA12_152=='O') ) {
                        int LA12_189 = input.LA(5);

                        if ( ((LA12_189>='0' && LA12_189<='9')||(LA12_189>='A' && LA12_189<='Z')||LA12_189=='_'||(LA12_189>='a' && LA12_189<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=59;
        }
        else if ( (LA12_0=='i') ) {
            int LA12_43 = input.LA(2);

            if ( (LA12_43=='n') ) {
                int LA12_112 = input.LA(3);

                if ( (LA12_112=='p') ) {
                    int LA12_153 = input.LA(4);

                    if ( (LA12_153=='u') ) {
                        int LA12_190 = input.LA(5);

                        if ( (LA12_190=='t') ) {
                            int LA12_221 = input.LA(6);

                            if ( ((LA12_221>='0' && LA12_221<='9')||(LA12_221>='A' && LA12_221<='Z')||LA12_221=='_'||(LA12_221>='a' && LA12_221<='z')) ) {
                                alt12=62;
                            }
                            else {
                                alt12=60;}
                        }
                        else {
                            alt12=62;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_44 = input.LA(2);

            if ( ((LA12_44>='A' && LA12_44<='Z')||LA12_44=='_'||(LA12_44>='a' && LA12_44<='z')) ) {
                alt12=62;
            }
            else {
                alt12=68;}
        }
        else if ( ((LA12_0>='C' && LA12_0<='D')||(LA12_0>='K' && LA12_0<='M')||(LA12_0>='Q' && LA12_0<='R')||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='d'||LA12_0=='g'||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='u' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12=62;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=63;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_47 = input.LA(2);

            if ( ((LA12_47>='\u0000' && LA12_47<='\uFFFE')) ) {
                alt12=64;
            }
            else {
                alt12=68;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_48 = input.LA(2);

            if ( ((LA12_48>='\u0000' && LA12_48<='\uFFFE')) ) {
                alt12=64;
            }
            else {
                alt12=68;}
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=67;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='@'||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=68;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:186: T55
                {
                mT55(); 

                }
                break;
            case 46 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:190: T56
                {
                mT56(); 

                }
                break;
            case 47 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:194: T57
                {
                mT57(); 

                }
                break;
            case 48 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:198: T58
                {
                mT58(); 

                }
                break;
            case 49 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:202: T59
                {
                mT59(); 

                }
                break;
            case 50 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:206: T60
                {
                mT60(); 

                }
                break;
            case 51 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:210: T61
                {
                mT61(); 

                }
                break;
            case 52 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:214: T62
                {
                mT62(); 

                }
                break;
            case 53 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:218: T63
                {
                mT63(); 

                }
                break;
            case 54 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:222: T64
                {
                mT64(); 

                }
                break;
            case 55 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:226: T65
                {
                mT65(); 

                }
                break;
            case 56 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:230: T66
                {
                mT66(); 

                }
                break;
            case 57 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:234: T67
                {
                mT67(); 

                }
                break;
            case 58 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:238: T68
                {
                mT68(); 

                }
                break;
            case 59 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:242: T69
                {
                mT69(); 

                }
                break;
            case 60 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:246: T70
                {
                mT70(); 

                }
                break;
            case 61 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:250: T71
                {
                mT71(); 

                }
                break;
            case 62 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:254: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 63 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:262: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 64 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:271: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 65 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:283: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 66 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:299: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 67 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:315: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 68 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:323: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}