package de.cau.cs.kieler.s.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSLexer extends Lexer {
    public static final int RULE_ID=4;
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
    public static final int RULE_INT=5;
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
    public static final int RULE_STRING=6;
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
    public String getGrammarFileName() { return "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:10:5: ( 'Synchronous Program' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:10:7: 'Synchronous Program'
            {
            match("Synchronous Program"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:11:5: ( '(' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:11:7: '('
            {
            match('('); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:12:5: ( ')' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:12:7: ')'
            {
            match(')'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:13:5: ( 'Inputs' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:13:7: 'Inputs'
            {
            match("Inputs"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:14:5: ( ',' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:14:7: ','
            {
            match(','); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:15:5: ( ';' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:15:7: ';'
            {
            match(';'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:16:5: ( 'Outputs' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:16:7: 'Outputs'
            {
            match("Outputs"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:17:5: ( 'Signals' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:17:7: 'Signals'
            {
            match("Signals"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:18:5: ( ':' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:18:7: ':'
            {
            match(':'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:19:5: ( 'SIGNALS' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:19:7: 'SIGNALS'
            {
            match("SIGNALS"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:20:5: ( 'input' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:20:7: 'input'
            {
            match("input"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:21:5: ( 'output' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:21:7: 'output'
            {
            match("output"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:22:5: ( 'signal' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:22:7: 'signal'
            {
            match("signal"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:23:5: ( ':=' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:23:7: ':='
            {
            match(":="); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:24:5: ( 'combine' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:24:7: 'combine'
            {
            match("combine"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:25:5: ( 'with' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:25:7: 'with'
            {
            match("with"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:26:5: ( 'PAUSE' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:26:7: 'PAUSE'
            {
            match("PAUSE"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:27:5: ( 'TERM' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:27:7: 'TERM'
            {
            match("TERM"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:28:5: ( 'Halt' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:28:7: 'Halt'
            {
            match("Halt"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:29:5: ( 'JOIN' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:29:7: 'JOIN'
            {
            match("JOIN"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:30:5: ( 'ABORT' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:30:7: 'ABORT'
            {
            match("ABORT"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:31:5: ( 'PRESENT' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:31:7: 'PRESENT'
            {
            match("PRESENT"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:32:5: ( '{' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:32:7: '{'
            {
            match('{'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:33:5: ( '}' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:33:7: '}'
            {
            match('}'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:34:5: ( 'GOTO' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:34:7: 'GOTO'
            {
            match("GOTO"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:35:5: ( 'FORK' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:35:7: 'FORK'
            {
            match("FORK"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:36:5: ( 'FORKE' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:36:7: 'FORKE'
            {
            match("FORKE"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:37:5: ( 'EMIT' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:37:7: 'EMIT'
            {
            match("EMIT"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:38:5: ( 'AWAIT' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:38:7: 'AWAIT'
            {
            match("AWAIT"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:39:5: ( 'PRIO' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:39:7: 'PRIO'
            {
            match("PRIO"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:40:5: ( '-' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:40:7: '-'
            {
            match('-'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:41:5: ( '.' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:41:7: '.'
            {
            match('.'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:42:5: ( 'E' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:42:7: 'E'
            {
            match('E'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:43:5: ( 'e' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:43:7: 'e'
            {
            match('e'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:44:5: ( 'true' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:44:7: 'true'
            {
            match("true"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:45:5: ( 'false' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:45:7: 'false'
            {
            match("false"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:46:5: ( '=' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:46:7: '='
            {
            match('='); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:47:5: ( '<' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:47:7: '<'
            {
            match('<'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:48:5: ( '<=' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:48:7: '<='
            {
            match("<="); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:49:5: ( '>' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:49:7: '>'
            {
            match('>'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:50:5: ( '>=' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:50:7: '>='
            {
            match(">="); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:51:5: ( '<>' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:51:7: '<>'
            {
            match("<>"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:52:5: ( 'pre' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:52:7: 'pre'
            {
            match("pre"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:53:5: ( 'or' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:53:7: 'or'
            {
            match("or"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:54:5: ( 'and' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:54:7: 'and'
            {
            match("and"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:55:5: ( 'not' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:55:7: 'not'
            {
            match("not"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:56:5: ( '+' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:56:7: '+'
            {
            match('+'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:57:5: ( '*' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:57:7: '*'
            {
            match('*'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:58:5: ( 'mod' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:58:7: 'mod'
            {
            match("mod"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:59:5: ( '/' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:59:7: '/'
            {
            match('/'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:60:5: ( '?' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:60:7: '?'
            {
            match('?'); 

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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:61:5: ( 'PURE' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:61:7: 'PURE'
            {
            match("PURE"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:62:5: ( 'BOOL' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:62:7: 'BOOL'
            {
            match("BOOL"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:63:5: ( 'UNSIGNED' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:63:7: 'UNSIGNED'
            {
            match("UNSIGNED"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:64:5: ( 'INT' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:64:7: 'INT'
            {
            match("INT"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:65:5: ( 'FLOAT' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:65:7: 'FLOAT'
            {
            match("FLOAT"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:66:5: ( 'HOST' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:66:7: 'HOST'
            {
            match("HOST"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:67:5: ( 'NONE' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:67:7: 'NONE'
            {
            match("NONE"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:68:5: ( 'max' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:68:7: 'max'
            {
            match("max"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:69:5: ( 'min' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:69:7: 'min'
            {
            match("min"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:70:5: ( 'host' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:70:7: 'host'
            {
            match("host"); 


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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4083:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4083:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4083:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4083:11: '^'
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

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4083:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:
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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4085:10: ( ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4085:12: ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4085:12: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4085:13: '0' .. '9'
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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4087:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4087:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4087:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("4087:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4087:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4087:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4087:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4087:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4087:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4087:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4087:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4087:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4089:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4089:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4089:24: ( options {greedy=false; } : . )*
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
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4089:52: .
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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4091:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4091:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4091:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4091:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4091:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4091:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4091:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4091:41: '\\r'
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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4093:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4093:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4093:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:
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
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4095:16: ( . )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:4095:18: .
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
        // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=68;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='S') ) {
            switch ( input.LA(2) ) {
            case 'y':
                {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='n') ) {
                    int LA12_116 = input.LA(4);

                    if ( (LA12_116=='c') ) {
                        int LA12_154 = input.LA(5);

                        if ( (LA12_154=='h') ) {
                            int LA12_191 = input.LA(6);

                            if ( (LA12_191=='r') ) {
                                int LA12_222 = input.LA(7);

                                if ( (LA12_222=='o') ) {
                                    int LA12_239 = input.LA(8);

                                    if ( (LA12_239=='n') ) {
                                        int LA12_249 = input.LA(9);

                                        if ( (LA12_249=='o') ) {
                                            int LA12_256 = input.LA(10);

                                            if ( (LA12_256=='u') ) {
                                                int LA12_258 = input.LA(11);

                                                if ( (LA12_258=='s') ) {
                                                    int LA12_259 = input.LA(12);

                                                    if ( (LA12_259==' ') ) {
                                                        alt12=1;
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
            case 'I':
                {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='G') ) {
                    int LA12_117 = input.LA(4);

                    if ( (LA12_117=='N') ) {
                        int LA12_155 = input.LA(5);

                        if ( (LA12_155=='A') ) {
                            int LA12_192 = input.LA(6);

                            if ( (LA12_192=='L') ) {
                                int LA12_223 = input.LA(7);

                                if ( (LA12_223=='S') ) {
                                    int LA12_240 = input.LA(8);

                                    if ( ((LA12_240>='0' && LA12_240<='9')||(LA12_240>='A' && LA12_240<='Z')||LA12_240=='_'||(LA12_240>='a' && LA12_240<='z')) ) {
                                        alt12=62;
                                    }
                                    else {
                                        alt12=10;}
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
            case 'i':
                {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='g') ) {
                    int LA12_118 = input.LA(4);

                    if ( (LA12_118=='n') ) {
                        int LA12_156 = input.LA(5);

                        if ( (LA12_156=='a') ) {
                            int LA12_193 = input.LA(6);

                            if ( (LA12_193=='l') ) {
                                int LA12_224 = input.LA(7);

                                if ( (LA12_224=='s') ) {
                                    int LA12_241 = input.LA(8);

                                    if ( ((LA12_241>='0' && LA12_241<='9')||(LA12_241>='A' && LA12_241<='Z')||LA12_241=='_'||(LA12_241>='a' && LA12_241<='z')) ) {
                                        alt12=62;
                                    }
                                    else {
                                        alt12=8;}
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
            alt12=2;
        }
        else if ( (LA12_0==')') ) {
            alt12=3;
        }
        else if ( (LA12_0=='I') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='p') ) {
                    int LA12_119 = input.LA(4);

                    if ( (LA12_119=='u') ) {
                        int LA12_157 = input.LA(5);

                        if ( (LA12_157=='t') ) {
                            int LA12_194 = input.LA(6);

                            if ( (LA12_194=='s') ) {
                                int LA12_225 = input.LA(7);

                                if ( ((LA12_225>='0' && LA12_225<='9')||(LA12_225>='A' && LA12_225<='Z')||LA12_225=='_'||(LA12_225>='a' && LA12_225<='z')) ) {
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
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            case 'N':
                {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='T') ) {
                    int LA12_120 = input.LA(4);

                    if ( ((LA12_120>='0' && LA12_120<='9')||(LA12_120>='A' && LA12_120<='Z')||LA12_120=='_'||(LA12_120>='a' && LA12_120<='z')) ) {
                        alt12=62;
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=62;}
                }
                break;
            default:
                alt12=62;}

        }
        else if ( (LA12_0==',') ) {
            alt12=5;
        }
        else if ( (LA12_0==';') ) {
            alt12=6;
        }
        else if ( (LA12_0=='O') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='u') ) {
                int LA12_61 = input.LA(3);

                if ( (LA12_61=='t') ) {
                    int LA12_121 = input.LA(4);

                    if ( (LA12_121=='p') ) {
                        int LA12_159 = input.LA(5);

                        if ( (LA12_159=='u') ) {
                            int LA12_195 = input.LA(6);

                            if ( (LA12_195=='t') ) {
                                int LA12_226 = input.LA(7);

                                if ( (LA12_226=='s') ) {
                                    int LA12_243 = input.LA(8);

                                    if ( ((LA12_243>='0' && LA12_243<='9')||(LA12_243>='A' && LA12_243<='Z')||LA12_243=='_'||(LA12_243>='a' && LA12_243<='z')) ) {
                                        alt12=62;
                                    }
                                    else {
                                        alt12=7;}
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
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='=') ) {
                alt12=14;
            }
            else {
                alt12=9;}
        }
        else if ( (LA12_0=='i') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='n') ) {
                int LA12_64 = input.LA(3);

                if ( (LA12_64=='p') ) {
                    int LA12_122 = input.LA(4);

                    if ( (LA12_122=='u') ) {
                        int LA12_160 = input.LA(5);

                        if ( (LA12_160=='t') ) {
                            int LA12_196 = input.LA(6);

                            if ( ((LA12_196>='0' && LA12_196<='9')||(LA12_196>='A' && LA12_196<='Z')||LA12_196=='_'||(LA12_196>='a' && LA12_196<='z')) ) {
                                alt12=62;
                            }
                            else {
                                alt12=11;}
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
        else if ( (LA12_0=='o') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_65 = input.LA(3);

                if ( ((LA12_65>='0' && LA12_65<='9')||(LA12_65>='A' && LA12_65<='Z')||LA12_65=='_'||(LA12_65>='a' && LA12_65<='z')) ) {
                    alt12=62;
                }
                else {
                    alt12=44;}
                }
                break;
            case 'u':
                {
                int LA12_66 = input.LA(3);

                if ( (LA12_66=='t') ) {
                    int LA12_124 = input.LA(4);

                    if ( (LA12_124=='p') ) {
                        int LA12_161 = input.LA(5);

                        if ( (LA12_161=='u') ) {
                            int LA12_197 = input.LA(6);

                            if ( (LA12_197=='t') ) {
                                int LA12_228 = input.LA(7);

                                if ( ((LA12_228>='0' && LA12_228<='9')||(LA12_228>='A' && LA12_228<='Z')||LA12_228=='_'||(LA12_228>='a' && LA12_228<='z')) ) {
                                    alt12=62;
                                }
                                else {
                                    alt12=12;}
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
        else if ( (LA12_0=='s') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='i') ) {
                int LA12_67 = input.LA(3);

                if ( (LA12_67=='g') ) {
                    int LA12_125 = input.LA(4);

                    if ( (LA12_125=='n') ) {
                        int LA12_162 = input.LA(5);

                        if ( (LA12_162=='a') ) {
                            int LA12_198 = input.LA(6);

                            if ( (LA12_198=='l') ) {
                                int LA12_229 = input.LA(7);

                                if ( ((LA12_229>='0' && LA12_229<='9')||(LA12_229>='A' && LA12_229<='Z')||LA12_229=='_'||(LA12_229>='a' && LA12_229<='z')) ) {
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
                else {
                    alt12=62;}
            }
            else {
                alt12=62;}
        }
        else if ( (LA12_0=='c') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='o') ) {
                int LA12_68 = input.LA(3);

                if ( (LA12_68=='m') ) {
                    int LA12_126 = input.LA(4);

                    if ( (LA12_126=='b') ) {
                        int LA12_163 = input.LA(5);

                        if ( (LA12_163=='i') ) {
                            int LA12_199 = input.LA(6);

                            if ( (LA12_199=='n') ) {
                                int LA12_230 = input.LA(7);

                                if ( (LA12_230=='e') ) {
                                    int LA12_246 = input.LA(8);

                                    if ( ((LA12_246>='0' && LA12_246<='9')||(LA12_246>='A' && LA12_246<='Z')||LA12_246=='_'||(LA12_246>='a' && LA12_246<='z')) ) {
                                        alt12=62;
                                    }
                                    else {
                                        alt12=15;}
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
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='i') ) {
                int LA12_69 = input.LA(3);

                if ( (LA12_69=='t') ) {
                    int LA12_127 = input.LA(4);

                    if ( (LA12_127=='h') ) {
                        int LA12_164 = input.LA(5);

                        if ( ((LA12_164>='0' && LA12_164<='9')||(LA12_164>='A' && LA12_164<='Z')||LA12_164=='_'||(LA12_164>='a' && LA12_164<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=16;}
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
        else if ( (LA12_0=='P') ) {
            switch ( input.LA(2) ) {
            case 'U':
                {
                int LA12_70 = input.LA(3);

                if ( (LA12_70=='R') ) {
                    int LA12_128 = input.LA(4);

                    if ( (LA12_128=='E') ) {
                        int LA12_165 = input.LA(5);

                        if ( ((LA12_165>='0' && LA12_165<='9')||(LA12_165>='A' && LA12_165<='Z')||LA12_165=='_'||(LA12_165>='a' && LA12_165<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=62;}
                }
                else {
                    alt12=62;}
                }
                break;
            case 'A':
                {
                int LA12_71 = input.LA(3);

                if ( (LA12_71=='U') ) {
                    int LA12_129 = input.LA(4);

                    if ( (LA12_129=='S') ) {
                        int LA12_166 = input.LA(5);

                        if ( (LA12_166=='E') ) {
                            int LA12_202 = input.LA(6);

                            if ( ((LA12_202>='0' && LA12_202<='9')||(LA12_202>='A' && LA12_202<='Z')||LA12_202=='_'||(LA12_202>='a' && LA12_202<='z')) ) {
                                alt12=62;
                            }
                            else {
                                alt12=17;}
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
                    int LA12_130 = input.LA(4);

                    if ( (LA12_130=='O') ) {
                        int LA12_167 = input.LA(5);

                        if ( ((LA12_167>='0' && LA12_167<='9')||(LA12_167>='A' && LA12_167<='Z')||LA12_167=='_'||(LA12_167>='a' && LA12_167<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=62;}
                    }
                    break;
                case 'E':
                    {
                    int LA12_131 = input.LA(4);

                    if ( (LA12_131=='S') ) {
                        int LA12_168 = input.LA(5);

                        if ( (LA12_168=='E') ) {
                            int LA12_204 = input.LA(6);

                            if ( (LA12_204=='N') ) {
                                int LA12_232 = input.LA(7);

                                if ( (LA12_232=='T') ) {
                                    int LA12_247 = input.LA(8);

                                    if ( ((LA12_247>='0' && LA12_247<='9')||(LA12_247>='A' && LA12_247<='Z')||LA12_247=='_'||(LA12_247>='a' && LA12_247<='z')) ) {
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
                    else {
                        alt12=62;}
                    }
                    break;
                default:
                    alt12=62;}

                }
                break;
            default:
                alt12=62;}

        }
        else if ( (LA12_0=='T') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='E') ) {
                int LA12_73 = input.LA(3);

                if ( (LA12_73=='R') ) {
                    int LA12_132 = input.LA(4);

                    if ( (LA12_132=='M') ) {
                        int LA12_169 = input.LA(5);

                        if ( ((LA12_169>='0' && LA12_169<='9')||(LA12_169>='A' && LA12_169<='Z')||LA12_169=='_'||(LA12_169>='a' && LA12_169<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=18;}
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
        else if ( (LA12_0=='H') ) {
            switch ( input.LA(2) ) {
            case 'O':
                {
                int LA12_74 = input.LA(3);

                if ( (LA12_74=='S') ) {
                    int LA12_133 = input.LA(4);

                    if ( (LA12_133=='T') ) {
                        int LA12_170 = input.LA(5);

                        if ( ((LA12_170>='0' && LA12_170<='9')||(LA12_170>='A' && LA12_170<='Z')||LA12_170=='_'||(LA12_170>='a' && LA12_170<='z')) ) {
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
                break;
            case 'a':
                {
                int LA12_75 = input.LA(3);

                if ( (LA12_75=='l') ) {
                    int LA12_134 = input.LA(4);

                    if ( (LA12_134=='t') ) {
                        int LA12_171 = input.LA(5);

                        if ( ((LA12_171>='0' && LA12_171<='9')||(LA12_171>='A' && LA12_171<='Z')||LA12_171=='_'||(LA12_171>='a' && LA12_171<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=19;}
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
        else if ( (LA12_0=='J') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='O') ) {
                int LA12_76 = input.LA(3);

                if ( (LA12_76=='I') ) {
                    int LA12_135 = input.LA(4);

                    if ( (LA12_135=='N') ) {
                        int LA12_172 = input.LA(5);

                        if ( ((LA12_172>='0' && LA12_172<='9')||(LA12_172>='A' && LA12_172<='Z')||LA12_172=='_'||(LA12_172>='a' && LA12_172<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=20;}
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
                int LA12_77 = input.LA(3);

                if ( (LA12_77=='O') ) {
                    int LA12_136 = input.LA(4);

                    if ( (LA12_136=='R') ) {
                        int LA12_173 = input.LA(5);

                        if ( (LA12_173=='T') ) {
                            int LA12_209 = input.LA(6);

                            if ( ((LA12_209>='0' && LA12_209<='9')||(LA12_209>='A' && LA12_209<='Z')||LA12_209=='_'||(LA12_209>='a' && LA12_209<='z')) ) {
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
                else {
                    alt12=62;}
                }
                break;
            case 'W':
                {
                int LA12_78 = input.LA(3);

                if ( (LA12_78=='A') ) {
                    int LA12_137 = input.LA(4);

                    if ( (LA12_137=='I') ) {
                        int LA12_174 = input.LA(5);

                        if ( (LA12_174=='T') ) {
                            int LA12_210 = input.LA(6);

                            if ( ((LA12_210>='0' && LA12_210<='9')||(LA12_210>='A' && LA12_210<='Z')||LA12_210=='_'||(LA12_210>='a' && LA12_210<='z')) ) {
                                alt12=62;
                            }
                            else {
                                alt12=29;}
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
            alt12=23;
        }
        else if ( (LA12_0=='}') ) {
            alt12=24;
        }
        else if ( (LA12_0=='G') ) {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='O') ) {
                int LA12_81 = input.LA(3);

                if ( (LA12_81=='T') ) {
                    int LA12_138 = input.LA(4);

                    if ( (LA12_138=='O') ) {
                        int LA12_175 = input.LA(5);

                        if ( ((LA12_175>='0' && LA12_175<='9')||(LA12_175>='A' && LA12_175<='Z')||LA12_175=='_'||(LA12_175>='a' && LA12_175<='z')) ) {
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
        else if ( (LA12_0=='F') ) {
            switch ( input.LA(2) ) {
            case 'L':
                {
                int LA12_82 = input.LA(3);

                if ( (LA12_82=='O') ) {
                    int LA12_139 = input.LA(4);

                    if ( (LA12_139=='A') ) {
                        int LA12_176 = input.LA(5);

                        if ( (LA12_176=='T') ) {
                            int LA12_212 = input.LA(6);

                            if ( ((LA12_212>='0' && LA12_212<='9')||(LA12_212>='A' && LA12_212<='Z')||LA12_212=='_'||(LA12_212>='a' && LA12_212<='z')) ) {
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
                else {
                    alt12=62;}
                }
                break;
            case 'O':
                {
                int LA12_83 = input.LA(3);

                if ( (LA12_83=='R') ) {
                    int LA12_140 = input.LA(4);

                    if ( (LA12_140=='K') ) {
                        switch ( input.LA(5) ) {
                        case 'E':
                            {
                            int LA12_213 = input.LA(6);

                            if ( ((LA12_213>='0' && LA12_213<='9')||(LA12_213>='A' && LA12_213<='Z')||LA12_213=='_'||(LA12_213>='a' && LA12_213<='z')) ) {
                                alt12=62;
                            }
                            else {
                                alt12=27;}
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
        else if ( (LA12_0=='E') ) {
            switch ( input.LA(2) ) {
            case 'M':
                {
                int LA12_84 = input.LA(3);

                if ( (LA12_84=='I') ) {
                    int LA12_141 = input.LA(4);

                    if ( (LA12_141=='T') ) {
                        int LA12_178 = input.LA(5);

                        if ( ((LA12_178>='0' && LA12_178<='9')||(LA12_178>='A' && LA12_178<='Z')||LA12_178=='_'||(LA12_178>='a' && LA12_178<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=28;}
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
                alt12=33;}

        }
        else if ( (LA12_0=='-') ) {
            alt12=31;
        }
        else if ( (LA12_0=='.') ) {
            alt12=32;
        }
        else if ( (LA12_0=='e') ) {
            int LA12_26 = input.LA(2);

            if ( ((LA12_26>='0' && LA12_26<='9')||(LA12_26>='A' && LA12_26<='Z')||LA12_26=='_'||(LA12_26>='a' && LA12_26<='z')) ) {
                alt12=62;
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='t') ) {
            int LA12_27 = input.LA(2);

            if ( (LA12_27=='r') ) {
                int LA12_89 = input.LA(3);

                if ( (LA12_89=='u') ) {
                    int LA12_142 = input.LA(4);

                    if ( (LA12_142=='e') ) {
                        int LA12_179 = input.LA(5);

                        if ( ((LA12_179>='0' && LA12_179<='9')||(LA12_179>='A' && LA12_179<='Z')||LA12_179=='_'||(LA12_179>='a' && LA12_179<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=35;}
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
            int LA12_28 = input.LA(2);

            if ( (LA12_28=='a') ) {
                int LA12_90 = input.LA(3);

                if ( (LA12_90=='l') ) {
                    int LA12_143 = input.LA(4);

                    if ( (LA12_143=='s') ) {
                        int LA12_180 = input.LA(5);

                        if ( (LA12_180=='e') ) {
                            int LA12_217 = input.LA(6);

                            if ( ((LA12_217>='0' && LA12_217<='9')||(LA12_217>='A' && LA12_217<='Z')||LA12_217=='_'||(LA12_217>='a' && LA12_217<='z')) ) {
                                alt12=62;
                            }
                            else {
                                alt12=36;}
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
            alt12=37;
        }
        else if ( (LA12_0=='<') ) {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt12=42;
                }
                break;
            case '=':
                {
                alt12=39;
                }
                break;
            default:
                alt12=38;}

        }
        else if ( (LA12_0=='>') ) {
            int LA12_31 = input.LA(2);

            if ( (LA12_31=='=') ) {
                alt12=41;
            }
            else {
                alt12=40;}
        }
        else if ( (LA12_0=='p') ) {
            int LA12_32 = input.LA(2);

            if ( (LA12_32=='r') ) {
                int LA12_97 = input.LA(3);

                if ( (LA12_97=='e') ) {
                    int LA12_144 = input.LA(4);

                    if ( ((LA12_144>='0' && LA12_144<='9')||(LA12_144>='A' && LA12_144<='Z')||LA12_144=='_'||(LA12_144>='a' && LA12_144<='z')) ) {
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
        else if ( (LA12_0=='a') ) {
            int LA12_33 = input.LA(2);

            if ( (LA12_33=='n') ) {
                int LA12_98 = input.LA(3);

                if ( (LA12_98=='d') ) {
                    int LA12_145 = input.LA(4);

                    if ( ((LA12_145>='0' && LA12_145<='9')||(LA12_145>='A' && LA12_145<='Z')||LA12_145=='_'||(LA12_145>='a' && LA12_145<='z')) ) {
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
        else if ( (LA12_0=='n') ) {
            int LA12_34 = input.LA(2);

            if ( (LA12_34=='o') ) {
                int LA12_99 = input.LA(3);

                if ( (LA12_99=='t') ) {
                    int LA12_146 = input.LA(4);

                    if ( ((LA12_146>='0' && LA12_146<='9')||(LA12_146>='A' && LA12_146<='Z')||LA12_146=='_'||(LA12_146>='a' && LA12_146<='z')) ) {
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
        else if ( (LA12_0=='+') ) {
            alt12=47;
        }
        else if ( (LA12_0=='*') ) {
            alt12=48;
        }
        else if ( (LA12_0=='m') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_102 = input.LA(3);

                if ( (LA12_102=='d') ) {
                    int LA12_147 = input.LA(4);

                    if ( ((LA12_147>='0' && LA12_147<='9')||(LA12_147>='A' && LA12_147<='Z')||LA12_147=='_'||(LA12_147>='a' && LA12_147<='z')) ) {
                        alt12=62;
                    }
                    else {
                        alt12=49;}
                }
                else {
                    alt12=62;}
                }
                break;
            case 'a':
                {
                int LA12_103 = input.LA(3);

                if ( (LA12_103=='x') ) {
                    int LA12_148 = input.LA(4);

                    if ( ((LA12_148>='0' && LA12_148<='9')||(LA12_148>='A' && LA12_148<='Z')||LA12_148=='_'||(LA12_148>='a' && LA12_148<='z')) ) {
                        alt12=62;
                    }
                    else {
                        alt12=59;}
                }
                else {
                    alt12=62;}
                }
                break;
            case 'i':
                {
                int LA12_104 = input.LA(3);

                if ( (LA12_104=='n') ) {
                    int LA12_149 = input.LA(4);

                    if ( ((LA12_149>='0' && LA12_149<='9')||(LA12_149>='A' && LA12_149<='Z')||LA12_149=='_'||(LA12_149>='a' && LA12_149<='z')) ) {
                        alt12=62;
                    }
                    else {
                        alt12=60;}
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
                alt12=50;}

        }
        else if ( (LA12_0=='?') ) {
            alt12=51;
        }
        else if ( (LA12_0=='B') ) {
            int LA12_40 = input.LA(2);

            if ( (LA12_40=='O') ) {
                int LA12_109 = input.LA(3);

                if ( (LA12_109=='O') ) {
                    int LA12_150 = input.LA(4);

                    if ( (LA12_150=='L') ) {
                        int LA12_187 = input.LA(5);

                        if ( ((LA12_187>='0' && LA12_187<='9')||(LA12_187>='A' && LA12_187<='Z')||LA12_187=='_'||(LA12_187>='a' && LA12_187<='z')) ) {
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
        else if ( (LA12_0=='U') ) {
            int LA12_41 = input.LA(2);

            if ( (LA12_41=='N') ) {
                int LA12_110 = input.LA(3);

                if ( (LA12_110=='S') ) {
                    int LA12_151 = input.LA(4);

                    if ( (LA12_151=='I') ) {
                        int LA12_188 = input.LA(5);

                        if ( (LA12_188=='G') ) {
                            int LA12_219 = input.LA(6);

                            if ( (LA12_219=='N') ) {
                                int LA12_238 = input.LA(7);

                                if ( (LA12_238=='E') ) {
                                    int LA12_248 = input.LA(8);

                                    if ( (LA12_248=='D') ) {
                                        int LA12_255 = input.LA(9);

                                        if ( ((LA12_255>='0' && LA12_255<='9')||(LA12_255>='A' && LA12_255<='Z')||LA12_255=='_'||(LA12_255>='a' && LA12_255<='z')) ) {
                                            alt12=62;
                                        }
                                        else {
                                            alt12=54;}
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
        else if ( (LA12_0=='N') ) {
            int LA12_42 = input.LA(2);

            if ( (LA12_42=='O') ) {
                int LA12_111 = input.LA(3);

                if ( (LA12_111=='N') ) {
                    int LA12_152 = input.LA(4);

                    if ( (LA12_152=='E') ) {
                        int LA12_189 = input.LA(5);

                        if ( ((LA12_189>='0' && LA12_189<='9')||(LA12_189>='A' && LA12_189<='Z')||LA12_189=='_'||(LA12_189>='a' && LA12_189<='z')) ) {
                            alt12=62;
                        }
                        else {
                            alt12=58;}
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
            int LA12_43 = input.LA(2);

            if ( (LA12_43=='o') ) {
                int LA12_112 = input.LA(3);

                if ( (LA12_112=='s') ) {
                    int LA12_153 = input.LA(4);

                    if ( (LA12_153=='t') ) {
                        int LA12_190 = input.LA(5);

                        if ( ((LA12_190>='0' && LA12_190<='9')||(LA12_190>='A' && LA12_190<='Z')||LA12_190=='_'||(LA12_190>='a' && LA12_190<='z')) ) {
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
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:186: T55
                {
                mT55(); 

                }
                break;
            case 46 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:190: T56
                {
                mT56(); 

                }
                break;
            case 47 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:194: T57
                {
                mT57(); 

                }
                break;
            case 48 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:198: T58
                {
                mT58(); 

                }
                break;
            case 49 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:202: T59
                {
                mT59(); 

                }
                break;
            case 50 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:206: T60
                {
                mT60(); 

                }
                break;
            case 51 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:210: T61
                {
                mT61(); 

                }
                break;
            case 52 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:214: T62
                {
                mT62(); 

                }
                break;
            case 53 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:218: T63
                {
                mT63(); 

                }
                break;
            case 54 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:222: T64
                {
                mT64(); 

                }
                break;
            case 55 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:226: T65
                {
                mT65(); 

                }
                break;
            case 56 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:230: T66
                {
                mT66(); 

                }
                break;
            case 57 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:234: T67
                {
                mT67(); 

                }
                break;
            case 58 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:238: T68
                {
                mT68(); 

                }
                break;
            case 59 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:242: T69
                {
                mT69(); 

                }
                break;
            case 60 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:246: T70
                {
                mT70(); 

                }
                break;
            case 61 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:250: T71
                {
                mT71(); 

                }
                break;
            case 62 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:254: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 63 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:262: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 64 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:271: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 65 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:283: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 66 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:299: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 67 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:315: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 68 :
                // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1:323: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}