package de.cau.cs.kieler.krep.editors.klp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalKlpLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=13;
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
    public static final int T20=20;
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
    public static final int RULE_COMMENT=9;
    public static final int T43=43;
    public static final int Tokens=62;
    public static final int RULE_SL_COMMENT=12;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int RULE_LETTER=7;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=11;
    public static final int T44=44;
    public static final int RULE_STRING=10;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=8;
    public static final int T51=51;
    public static final int T16=16;
    public static final int RULE_DIGIT=6;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalKlpLexer() {;} 
    public InternalKlpLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g"; }

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:10:5: ( ':' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:10:7: ':'
            {
            match(':'); 

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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:11:5: ( 'SETCLK' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:11:7: 'SETCLK'
            {
            match("SETCLK"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:12:5: ( 'SETPC' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:12:7: 'SETPC'
            {
            match("SETPC"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:13:5: ( 'PRIO' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:13:7: 'PRIO'
            {
            match("PRIO"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:14:5: ( 'DONE' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:14:7: 'DONE'
            {
            match("DONE"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:15:5: ( 'JMP' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:15:7: 'JMP'
            {
            match("JMP"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:16:5: ( 'pre' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:16:7: 'pre'
            {
            match("pre"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:17:5: ( '(' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:17:7: '('
            {
            match('('); 

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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:18:5: ( ')' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:18:7: ')'
            {
            match(')'); 

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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:19:5: ( 'INPUT' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:19:7: 'INPUT'
            {
            match("INPUT"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:20:5: ( 'OUTPUT' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:20:7: 'OUTPUT'
            {
            match("OUTPUT"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:21:5: ( 'LOCAL' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:21:7: 'LOCAL'
            {
            match("LOCAL"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:22:5: ( 'ADD' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:22:7: 'ADD'
            {
            match("ADD"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:23:5: ( 'IADD' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:23:7: 'IADD'
            {
            match("IADD"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:24:5: ( 'SUB' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:24:7: 'SUB'
            {
            match("SUB"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:25:5: ( 'MUL' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:25:7: 'MUL'
            {
            match("MUL"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:26:5: ( 'DIV' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:26:7: 'DIV'
            {
            match("DIV"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:27:5: ( 'AND' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:27:7: 'AND'
            {
            match("AND"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:28:5: ( 'OR' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:28:7: 'OR'
            {
            match("OR"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:29:5: ( 'XOR' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:29:7: 'XOR'
            {
            match("XOR"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:30:5: ( 'LT' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:30:7: 'LT'
            {
            match("LT"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:31:5: ( 'LE' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:31:7: 'LE'
            {
            match("LE"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:32:5: ( 'EQ' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:32:7: 'EQ'
            {
            match("EQ"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:33:5: ( 'GE' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:33:7: 'GE'
            {
            match("GE"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:34:5: ( 'GT' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:34:7: 'GT'
            {
            match("GT"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:35:5: ( 'NEQ' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:35:7: 'NEQ'
            {
            match("NEQ"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:36:5: ( 'ISUB' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:36:7: 'ISUB'
            {
            match("ISUB"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:37:5: ( 'IMUL' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:37:7: 'IMUL'
            {
            match("IMUL"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:38:5: ( 'IDIV' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:38:7: 'IDIV'
            {
            match("IDIV"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:39:5: ( 'IAND' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:39:7: 'IAND'
            {
            match("IAND"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:40:5: ( 'IOR' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:40:7: 'IOR'
            {
            match("IOR"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:41:5: ( 'IXOR' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:41:7: 'IXOR'
            {
            match("IXOR"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:42:5: ( 'ILT' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:42:7: 'ILT'
            {
            match("ILT"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:43:5: ( 'ILE' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:43:7: 'ILE'
            {
            match("ILE"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:44:5: ( 'IEQ' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:44:7: 'IEQ'
            {
            match("IEQ"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:45:5: ( 'IGE' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:45:7: 'IGE'
            {
            match("IGE"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:46:5: ( 'IGT' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:46:7: 'IGT'
            {
            match("IGT"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:47:5: ( 'INEQ' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:47:7: 'INEQ'
            {
            match("INEQ"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:48:5: ( 'JT' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:48:7: 'JT'
            {
            match("JT"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:49:5: ( 'JF' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:49:7: 'JF'
            {
            match("JF"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:50:5: ( 'JZ' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:50:7: 'JZ'
            {
            match("JZ"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:51:5: ( 'JNZ' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:51:7: 'JNZ'
            {
            match("JNZ"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:52:5: ( 'CVMOV' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:52:7: 'CVMOV'
            {
            match("CVMOV"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:53:5: ( 'VCMOV' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:53:7: 'VCMOV'
            {
            match("VCMOV"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:54:5: ( 'VVMOV' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:54:7: 'VVMOV'
            {
            match("VVMOV"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:55:5: ( 'CCMOV' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:55:7: 'CCMOV'
            {
            match("CCMOV"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:56:5: ( 'IVMOV' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:56:7: 'IVMOV'
            {
            match("IVMOV"); 


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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:57:5: ( 'ICMOV' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:57:7: 'ICMOV'
            {
            match("ICMOV"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1533:10: ( ( '+' | '-' )? ( RULE_DIGIT )+ )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1533:12: ( '+' | '-' )? ( RULE_DIGIT )+
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1533:12: ( '+' | '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:
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

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1533:23: ( RULE_DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1533:23: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1535:9: ( ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT | '_' )* )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1535:11: ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1535:29: ( RULE_LETTER | RULE_DIGIT | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:
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
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1537:9: ( ( '\\t' | ' ' | '\\r' | '\\n' ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1537:11: ( '\\t' | ' ' | '\\r' | '\\n' )
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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1539:14: ( '#' ( options {greedy=false; } : . )* '\\n' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1539:16: '#' ( options {greedy=false; } : . )* '\\n'
            {
            match('#'); 
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1539:20: ( options {greedy=false; } : . )*
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
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1539:48: .
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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1541:12: ( '0' .. '9' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1541:14: '0' .. '9'
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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1543:13: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1543:15: ( 'a' .. 'z' | 'A' .. 'Z' )
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

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1545:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1545:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1545:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1545:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1545:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1545:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1545:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1545:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1545:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1545:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1545:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1545:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1547:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1547:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1547:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1547:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1549:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1549:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1549:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1549:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1549:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1549:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1549:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1549:41: '\\r'
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

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1551:16: ( . )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1551:18: .
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
        // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:8: ( T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_INT | RULE_ID | RULE_WS | RULE_COMMENT | RULE_DIGIT | RULE_LETTER | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt12=58;
        int LA12_0 = input.LA(1);

        if ( (LA12_0==':') ) {
            alt12=1;
        }
        else if ( (LA12_0=='S') ) {
            switch ( input.LA(2) ) {
            case 'E':
                {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='T') ) {
                    switch ( input.LA(4) ) {
                    case 'C':
                        {
                        int LA12_124 = input.LA(5);

                        if ( (LA12_124=='L') ) {
                            int LA12_160 = input.LA(6);

                            if ( (LA12_160=='K') ) {
                                int LA12_180 = input.LA(7);

                                if ( ((LA12_180>='0' && LA12_180<='9')||(LA12_180>='A' && LA12_180<='Z')||LA12_180=='_'||(LA12_180>='a' && LA12_180<='z')) ) {
                                    alt12=50;
                                }
                                else {
                                    alt12=2;}
                            }
                            else {
                                alt12=50;}
                        }
                        else {
                            alt12=50;}
                        }
                        break;
                    case 'P':
                        {
                        int LA12_125 = input.LA(5);

                        if ( (LA12_125=='C') ) {
                            int LA12_161 = input.LA(6);

                            if ( ((LA12_161>='0' && LA12_161<='9')||(LA12_161>='A' && LA12_161<='Z')||LA12_161=='_'||(LA12_161>='a' && LA12_161<='z')) ) {
                                alt12=50;
                            }
                            else {
                                alt12=3;}
                        }
                        else {
                            alt12=50;}
                        }
                        break;
                    default:
                        alt12=50;}

                }
                else {
                    alt12=50;}
                }
                break;
            case 'U':
                {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='B') ) {
                    int LA12_81 = input.LA(4);

                    if ( ((LA12_81>='0' && LA12_81<='9')||(LA12_81>='A' && LA12_81<='Z')||LA12_81=='_'||(LA12_81>='a' && LA12_81<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=15;}
                }
                else {
                    alt12=50;}
                }
                break;
            default:
                alt12=50;}

        }
        else if ( (LA12_0=='P') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='R') ) {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='I') ) {
                    int LA12_82 = input.LA(4);

                    if ( (LA12_82=='O') ) {
                        int LA12_127 = input.LA(5);

                        if ( ((LA12_127>='0' && LA12_127<='9')||(LA12_127>='A' && LA12_127<='Z')||LA12_127=='_'||(LA12_127>='a' && LA12_127<='z')) ) {
                            alt12=50;
                        }
                        else {
                            alt12=4;}
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=50;}
            }
            else {
                alt12=50;}
        }
        else if ( (LA12_0=='D') ) {
            switch ( input.LA(2) ) {
            case 'O':
                {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='N') ) {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='E') ) {
                        int LA12_128 = input.LA(5);

                        if ( ((LA12_128>='0' && LA12_128<='9')||(LA12_128>='A' && LA12_128<='Z')||LA12_128=='_'||(LA12_128>='a' && LA12_128<='z')) ) {
                            alt12=50;
                        }
                        else {
                            alt12=5;}
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'I':
                {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='V') ) {
                    int LA12_84 = input.LA(4);

                    if ( ((LA12_84>='0' && LA12_84<='9')||(LA12_84>='A' && LA12_84<='Z')||LA12_84=='_'||(LA12_84>='a' && LA12_84<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=50;}
                }
                break;
            default:
                alt12=50;}

        }
        else if ( (LA12_0=='J') ) {
            switch ( input.LA(2) ) {
            case 'M':
                {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='P') ) {
                    int LA12_85 = input.LA(4);

                    if ( ((LA12_85>='0' && LA12_85<='9')||(LA12_85>='A' && LA12_85<='Z')||LA12_85=='_'||(LA12_85>='a' && LA12_85<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=6;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'N':
                {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='Z') ) {
                    int LA12_86 = input.LA(4);

                    if ( ((LA12_86>='0' && LA12_86<='9')||(LA12_86>='A' && LA12_86<='Z')||LA12_86=='_'||(LA12_86>='a' && LA12_86<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'Z':
                {
                int LA12_39 = input.LA(3);

                if ( ((LA12_39>='0' && LA12_39<='9')||(LA12_39>='A' && LA12_39<='Z')||LA12_39=='_'||(LA12_39>='a' && LA12_39<='z')) ) {
                    alt12=50;
                }
                else {
                    alt12=41;}
                }
                break;
            case 'F':
                {
                int LA12_40 = input.LA(3);

                if ( ((LA12_40>='0' && LA12_40<='9')||(LA12_40>='A' && LA12_40<='Z')||LA12_40=='_'||(LA12_40>='a' && LA12_40<='z')) ) {
                    alt12=50;
                }
                else {
                    alt12=40;}
                }
                break;
            case 'T':
                {
                int LA12_41 = input.LA(3);

                if ( ((LA12_41>='0' && LA12_41<='9')||(LA12_41>='A' && LA12_41<='Z')||LA12_41=='_'||(LA12_41>='a' && LA12_41<='z')) ) {
                    alt12=50;
                }
                else {
                    alt12=39;}
                }
                break;
            default:
                alt12=50;}

        }
        else if ( (LA12_0=='p') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='r') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='e') ) {
                    int LA12_90 = input.LA(4);

                    if ( ((LA12_90>='0' && LA12_90<='9')||(LA12_90>='A' && LA12_90<='Z')||LA12_90=='_'||(LA12_90>='a' && LA12_90<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=7;}
                }
                else {
                    alt12=50;}
            }
            else {
                alt12=50;}
        }
        else if ( (LA12_0=='(') ) {
            alt12=8;
        }
        else if ( (LA12_0==')') ) {
            alt12=9;
        }
        else if ( (LA12_0=='I') ) {
            switch ( input.LA(2) ) {
            case 'N':
                {
                switch ( input.LA(3) ) {
                case 'P':
                    {
                    int LA12_91 = input.LA(4);

                    if ( (LA12_91=='U') ) {
                        int LA12_133 = input.LA(5);

                        if ( (LA12_133=='T') ) {
                            int LA12_164 = input.LA(6);

                            if ( ((LA12_164>='0' && LA12_164<='9')||(LA12_164>='A' && LA12_164<='Z')||LA12_164=='_'||(LA12_164>='a' && LA12_164<='z')) ) {
                                alt12=50;
                            }
                            else {
                                alt12=10;}
                        }
                        else {
                            alt12=50;}
                    }
                    else {
                        alt12=50;}
                    }
                    break;
                case 'E':
                    {
                    int LA12_92 = input.LA(4);

                    if ( (LA12_92=='Q') ) {
                        int LA12_134 = input.LA(5);

                        if ( ((LA12_134>='0' && LA12_134<='9')||(LA12_134>='A' && LA12_134<='Z')||LA12_134=='_'||(LA12_134>='a' && LA12_134<='z')) ) {
                            alt12=50;
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=50;}
                    }
                    break;
                default:
                    alt12=50;}

                }
                break;
            case 'A':
                {
                switch ( input.LA(3) ) {
                case 'D':
                    {
                    int LA12_93 = input.LA(4);

                    if ( (LA12_93=='D') ) {
                        int LA12_135 = input.LA(5);

                        if ( ((LA12_135>='0' && LA12_135<='9')||(LA12_135>='A' && LA12_135<='Z')||LA12_135=='_'||(LA12_135>='a' && LA12_135<='z')) ) {
                            alt12=50;
                        }
                        else {
                            alt12=14;}
                    }
                    else {
                        alt12=50;}
                    }
                    break;
                case 'N':
                    {
                    int LA12_94 = input.LA(4);

                    if ( (LA12_94=='D') ) {
                        int LA12_136 = input.LA(5);

                        if ( ((LA12_136>='0' && LA12_136<='9')||(LA12_136>='A' && LA12_136<='Z')||LA12_136=='_'||(LA12_136>='a' && LA12_136<='z')) ) {
                            alt12=50;
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=50;}
                    }
                    break;
                default:
                    alt12=50;}

                }
                break;
            case 'L':
                {
                switch ( input.LA(3) ) {
                case 'T':
                    {
                    int LA12_95 = input.LA(4);

                    if ( ((LA12_95>='0' && LA12_95<='9')||(LA12_95>='A' && LA12_95<='Z')||LA12_95=='_'||(LA12_95>='a' && LA12_95<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=33;}
                    }
                    break;
                case 'E':
                    {
                    int LA12_96 = input.LA(4);

                    if ( ((LA12_96>='0' && LA12_96<='9')||(LA12_96>='A' && LA12_96<='Z')||LA12_96=='_'||(LA12_96>='a' && LA12_96<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=34;}
                    }
                    break;
                default:
                    alt12=50;}

                }
                break;
            case 'O':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='R') ) {
                    int LA12_97 = input.LA(4);

                    if ( ((LA12_97>='0' && LA12_97<='9')||(LA12_97>='A' && LA12_97<='Z')||LA12_97=='_'||(LA12_97>='a' && LA12_97<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=31;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'X':
                {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='O') ) {
                    int LA12_98 = input.LA(4);

                    if ( (LA12_98=='R') ) {
                        int LA12_140 = input.LA(5);

                        if ( ((LA12_140>='0' && LA12_140<='9')||(LA12_140>='A' && LA12_140<='Z')||LA12_140=='_'||(LA12_140>='a' && LA12_140<='z')) ) {
                            alt12=50;
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'D':
                {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='I') ) {
                    int LA12_99 = input.LA(4);

                    if ( (LA12_99=='V') ) {
                        int LA12_141 = input.LA(5);

                        if ( ((LA12_141>='0' && LA12_141<='9')||(LA12_141>='A' && LA12_141<='Z')||LA12_141=='_'||(LA12_141>='a' && LA12_141<='z')) ) {
                            alt12=50;
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'S':
                {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='U') ) {
                    int LA12_100 = input.LA(4);

                    if ( (LA12_100=='B') ) {
                        int LA12_142 = input.LA(5);

                        if ( ((LA12_142>='0' && LA12_142<='9')||(LA12_142>='A' && LA12_142<='Z')||LA12_142=='_'||(LA12_142>='a' && LA12_142<='z')) ) {
                            alt12=50;
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'M':
                {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='U') ) {
                    int LA12_101 = input.LA(4);

                    if ( (LA12_101=='L') ) {
                        int LA12_143 = input.LA(5);

                        if ( ((LA12_143>='0' && LA12_143<='9')||(LA12_143>='A' && LA12_143<='Z')||LA12_143=='_'||(LA12_143>='a' && LA12_143<='z')) ) {
                            alt12=50;
                        }
                        else {
                            alt12=28;}
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'G':
                {
                switch ( input.LA(3) ) {
                case 'T':
                    {
                    int LA12_102 = input.LA(4);

                    if ( ((LA12_102>='0' && LA12_102<='9')||(LA12_102>='A' && LA12_102<='Z')||LA12_102=='_'||(LA12_102>='a' && LA12_102<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=37;}
                    }
                    break;
                case 'E':
                    {
                    int LA12_103 = input.LA(4);

                    if ( ((LA12_103>='0' && LA12_103<='9')||(LA12_103>='A' && LA12_103<='Z')||LA12_103=='_'||(LA12_103>='a' && LA12_103<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=36;}
                    }
                    break;
                default:
                    alt12=50;}

                }
                break;
            case 'E':
                {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='Q') ) {
                    int LA12_104 = input.LA(4);

                    if ( ((LA12_104>='0' && LA12_104<='9')||(LA12_104>='A' && LA12_104<='Z')||LA12_104=='_'||(LA12_104>='a' && LA12_104<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'C':
                {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='M') ) {
                    int LA12_105 = input.LA(4);

                    if ( (LA12_105=='O') ) {
                        int LA12_147 = input.LA(5);

                        if ( (LA12_147=='V') ) {
                            int LA12_172 = input.LA(6);

                            if ( ((LA12_172>='0' && LA12_172<='9')||(LA12_172>='A' && LA12_172<='Z')||LA12_172=='_'||(LA12_172>='a' && LA12_172<='z')) ) {
                                alt12=50;
                            }
                            else {
                                alt12=48;}
                        }
                        else {
                            alt12=50;}
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'V':
                {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='M') ) {
                    int LA12_106 = input.LA(4);

                    if ( (LA12_106=='O') ) {
                        int LA12_148 = input.LA(5);

                        if ( (LA12_148=='V') ) {
                            int LA12_173 = input.LA(6);

                            if ( ((LA12_173>='0' && LA12_173<='9')||(LA12_173>='A' && LA12_173<='Z')||LA12_173=='_'||(LA12_173>='a' && LA12_173<='z')) ) {
                                alt12=50;
                            }
                            else {
                                alt12=47;}
                        }
                        else {
                            alt12=50;}
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=50;}
                }
                break;
            default:
                alt12=50;}

        }
        else if ( (LA12_0=='O') ) {
            switch ( input.LA(2) ) {
            case 'U':
                {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='T') ) {
                    int LA12_107 = input.LA(4);

                    if ( (LA12_107=='P') ) {
                        int LA12_149 = input.LA(5);

                        if ( (LA12_149=='U') ) {
                            int LA12_174 = input.LA(6);

                            if ( (LA12_174=='T') ) {
                                int LA12_185 = input.LA(7);

                                if ( ((LA12_185>='0' && LA12_185<='9')||(LA12_185>='A' && LA12_185<='Z')||LA12_185=='_'||(LA12_185>='a' && LA12_185<='z')) ) {
                                    alt12=50;
                                }
                                else {
                                    alt12=11;}
                            }
                            else {
                                alt12=50;}
                        }
                        else {
                            alt12=50;}
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'R':
                {
                int LA12_58 = input.LA(3);

                if ( ((LA12_58>='0' && LA12_58<='9')||(LA12_58>='A' && LA12_58<='Z')||LA12_58=='_'||(LA12_58>='a' && LA12_58<='z')) ) {
                    alt12=50;
                }
                else {
                    alt12=19;}
                }
                break;
            default:
                alt12=50;}

        }
        else if ( (LA12_0=='L') ) {
            switch ( input.LA(2) ) {
            case 'O':
                {
                int LA12_59 = input.LA(3);

                if ( (LA12_59=='C') ) {
                    int LA12_109 = input.LA(4);

                    if ( (LA12_109=='A') ) {
                        int LA12_150 = input.LA(5);

                        if ( (LA12_150=='L') ) {
                            int LA12_175 = input.LA(6);

                            if ( ((LA12_175>='0' && LA12_175<='9')||(LA12_175>='A' && LA12_175<='Z')||LA12_175=='_'||(LA12_175>='a' && LA12_175<='z')) ) {
                                alt12=50;
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=50;}
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'T':
                {
                int LA12_60 = input.LA(3);

                if ( ((LA12_60>='0' && LA12_60<='9')||(LA12_60>='A' && LA12_60<='Z')||LA12_60=='_'||(LA12_60>='a' && LA12_60<='z')) ) {
                    alt12=50;
                }
                else {
                    alt12=21;}
                }
                break;
            case 'E':
                {
                int LA12_61 = input.LA(3);

                if ( ((LA12_61>='0' && LA12_61<='9')||(LA12_61>='A' && LA12_61<='Z')||LA12_61=='_'||(LA12_61>='a' && LA12_61<='z')) ) {
                    alt12=50;
                }
                else {
                    alt12=22;}
                }
                break;
            default:
                alt12=50;}

        }
        else if ( (LA12_0=='A') ) {
            switch ( input.LA(2) ) {
            case 'D':
                {
                int LA12_62 = input.LA(3);

                if ( (LA12_62=='D') ) {
                    int LA12_112 = input.LA(4);

                    if ( ((LA12_112>='0' && LA12_112<='9')||(LA12_112>='A' && LA12_112<='Z')||LA12_112=='_'||(LA12_112>='a' && LA12_112<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=13;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'N':
                {
                int LA12_63 = input.LA(3);

                if ( (LA12_63=='D') ) {
                    int LA12_113 = input.LA(4);

                    if ( ((LA12_113>='0' && LA12_113<='9')||(LA12_113>='A' && LA12_113<='Z')||LA12_113=='_'||(LA12_113>='a' && LA12_113<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=50;}
                }
                break;
            default:
                alt12=50;}

        }
        else if ( (LA12_0=='M') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='U') ) {
                int LA12_64 = input.LA(3);

                if ( (LA12_64=='L') ) {
                    int LA12_114 = input.LA(4);

                    if ( ((LA12_114>='0' && LA12_114<='9')||(LA12_114>='A' && LA12_114<='Z')||LA12_114=='_'||(LA12_114>='a' && LA12_114<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=16;}
                }
                else {
                    alt12=50;}
            }
            else {
                alt12=50;}
        }
        else if ( (LA12_0=='X') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='O') ) {
                int LA12_65 = input.LA(3);

                if ( (LA12_65=='R') ) {
                    int LA12_115 = input.LA(4);

                    if ( ((LA12_115>='0' && LA12_115<='9')||(LA12_115>='A' && LA12_115<='Z')||LA12_115=='_'||(LA12_115>='a' && LA12_115<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=50;}
            }
            else {
                alt12=50;}
        }
        else if ( (LA12_0=='E') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='Q') ) {
                int LA12_66 = input.LA(3);

                if ( ((LA12_66>='0' && LA12_66<='9')||(LA12_66>='A' && LA12_66<='Z')||LA12_66=='_'||(LA12_66>='a' && LA12_66<='z')) ) {
                    alt12=50;
                }
                else {
                    alt12=23;}
            }
            else {
                alt12=50;}
        }
        else if ( (LA12_0=='G') ) {
            switch ( input.LA(2) ) {
            case 'T':
                {
                int LA12_67 = input.LA(3);

                if ( ((LA12_67>='0' && LA12_67<='9')||(LA12_67>='A' && LA12_67<='Z')||LA12_67=='_'||(LA12_67>='a' && LA12_67<='z')) ) {
                    alt12=50;
                }
                else {
                    alt12=25;}
                }
                break;
            case 'E':
                {
                int LA12_68 = input.LA(3);

                if ( ((LA12_68>='0' && LA12_68<='9')||(LA12_68>='A' && LA12_68<='Z')||LA12_68=='_'||(LA12_68>='a' && LA12_68<='z')) ) {
                    alt12=50;
                }
                else {
                    alt12=24;}
                }
                break;
            default:
                alt12=50;}

        }
        else if ( (LA12_0=='N') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='E') ) {
                int LA12_69 = input.LA(3);

                if ( (LA12_69=='Q') ) {
                    int LA12_119 = input.LA(4);

                    if ( ((LA12_119>='0' && LA12_119<='9')||(LA12_119>='A' && LA12_119<='Z')||LA12_119=='_'||(LA12_119>='a' && LA12_119<='z')) ) {
                        alt12=50;
                    }
                    else {
                        alt12=26;}
                }
                else {
                    alt12=50;}
            }
            else {
                alt12=50;}
        }
        else if ( (LA12_0=='C') ) {
            switch ( input.LA(2) ) {
            case 'C':
                {
                int LA12_70 = input.LA(3);

                if ( (LA12_70=='M') ) {
                    int LA12_120 = input.LA(4);

                    if ( (LA12_120=='O') ) {
                        int LA12_156 = input.LA(5);

                        if ( (LA12_156=='V') ) {
                            int LA12_176 = input.LA(6);

                            if ( ((LA12_176>='0' && LA12_176<='9')||(LA12_176>='A' && LA12_176<='Z')||LA12_176=='_'||(LA12_176>='a' && LA12_176<='z')) ) {
                                alt12=50;
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=50;}
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'V':
                {
                int LA12_71 = input.LA(3);

                if ( (LA12_71=='M') ) {
                    int LA12_121 = input.LA(4);

                    if ( (LA12_121=='O') ) {
                        int LA12_157 = input.LA(5);

                        if ( (LA12_157=='V') ) {
                            int LA12_177 = input.LA(6);

                            if ( ((LA12_177>='0' && LA12_177<='9')||(LA12_177>='A' && LA12_177<='Z')||LA12_177=='_'||(LA12_177>='a' && LA12_177<='z')) ) {
                                alt12=50;
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=50;}
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=50;}
                }
                break;
            default:
                alt12=50;}

        }
        else if ( (LA12_0=='V') ) {
            switch ( input.LA(2) ) {
            case 'V':
                {
                int LA12_72 = input.LA(3);

                if ( (LA12_72=='M') ) {
                    int LA12_122 = input.LA(4);

                    if ( (LA12_122=='O') ) {
                        int LA12_158 = input.LA(5);

                        if ( (LA12_158=='V') ) {
                            int LA12_178 = input.LA(6);

                            if ( ((LA12_178>='0' && LA12_178<='9')||(LA12_178>='A' && LA12_178<='Z')||LA12_178=='_'||(LA12_178>='a' && LA12_178<='z')) ) {
                                alt12=50;
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=50;}
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=50;}
                }
                break;
            case 'C':
                {
                int LA12_73 = input.LA(3);

                if ( (LA12_73=='M') ) {
                    int LA12_123 = input.LA(4);

                    if ( (LA12_123=='O') ) {
                        int LA12_159 = input.LA(5);

                        if ( (LA12_159=='V') ) {
                            int LA12_179 = input.LA(6);

                            if ( ((LA12_179>='0' && LA12_179<='9')||(LA12_179>='A' && LA12_179<='Z')||LA12_179=='_'||(LA12_179>='a' && LA12_179<='z')) ) {
                                alt12=50;
                            }
                            else {
                                alt12=44;}
                        }
                        else {
                            alt12=50;}
                    }
                    else {
                        alt12=50;}
                }
                else {
                    alt12=50;}
                }
                break;
            default:
                alt12=50;}

        }
        else if ( (LA12_0=='+'||LA12_0=='-') ) {
            int LA12_20 = input.LA(2);

            if ( ((LA12_20>='0' && LA12_20<='9')) ) {
                alt12=49;
            }
            else {
                alt12=58;}
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=49;
        }
        else if ( (LA12_0=='B'||LA12_0=='F'||LA12_0=='H'||LA12_0=='K'||(LA12_0>='Q' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='U')||LA12_0=='W'||(LA12_0>='Y' && LA12_0<='Z')||(LA12_0>='a' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='z')) ) {
            alt12=50;
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=51;
        }
        else if ( (LA12_0=='#') ) {
            int LA12_24 = input.LA(2);

            if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFE')) ) {
                alt12=52;
            }
            else {
                alt12=58;}
        }
        else if ( (LA12_0=='_') ) {
            alt12=50;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_26 = input.LA(2);

            if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFE')) ) {
                alt12=55;
            }
            else {
                alt12=58;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_27 = input.LA(2);

            if ( ((LA12_27>='\u0000' && LA12_27<='\uFFFE')) ) {
                alt12=55;
            }
            else {
                alt12=58;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=56;
                }
                break;
            case '/':
                {
                alt12=57;
                }
                break;
            default:
                alt12=58;}

        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||LA12_0=='*'||LA12_0==','||LA12_0=='.'||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<='^')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=58;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_INT | RULE_ID | RULE_WS | RULE_COMMENT | RULE_DIGIT | RULE_LETTER | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:10: T14
                {
                mT14(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:14: T15
                {
                mT15(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:18: T16
                {
                mT16(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:22: T17
                {
                mT17(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:26: T18
                {
                mT18(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:30: T19
                {
                mT19(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:34: T20
                {
                mT20(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:38: T21
                {
                mT21(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:42: T22
                {
                mT22(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:46: T23
                {
                mT23(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:50: T24
                {
                mT24(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:54: T25
                {
                mT25(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:58: T26
                {
                mT26(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:62: T27
                {
                mT27(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:66: T28
                {
                mT28(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:70: T29
                {
                mT29(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:74: T30
                {
                mT30(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:78: T31
                {
                mT31(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:82: T32
                {
                mT32(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:86: T33
                {
                mT33(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:90: T34
                {
                mT34(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:94: T35
                {
                mT35(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:98: T36
                {
                mT36(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:102: T37
                {
                mT37(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:106: T38
                {
                mT38(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:110: T39
                {
                mT39(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:114: T40
                {
                mT40(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:118: T41
                {
                mT41(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:122: T42
                {
                mT42(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:126: T43
                {
                mT43(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:130: T44
                {
                mT44(); 

                }
                break;
            case 32 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:134: T45
                {
                mT45(); 

                }
                break;
            case 33 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:138: T46
                {
                mT46(); 

                }
                break;
            case 34 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:142: T47
                {
                mT47(); 

                }
                break;
            case 35 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:146: T48
                {
                mT48(); 

                }
                break;
            case 36 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:150: T49
                {
                mT49(); 

                }
                break;
            case 37 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:154: T50
                {
                mT50(); 

                }
                break;
            case 38 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:158: T51
                {
                mT51(); 

                }
                break;
            case 39 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:162: T52
                {
                mT52(); 

                }
                break;
            case 40 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:166: T53
                {
                mT53(); 

                }
                break;
            case 41 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:170: T54
                {
                mT54(); 

                }
                break;
            case 42 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:174: T55
                {
                mT55(); 

                }
                break;
            case 43 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:178: T56
                {
                mT56(); 

                }
                break;
            case 44 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:182: T57
                {
                mT57(); 

                }
                break;
            case 45 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:186: T58
                {
                mT58(); 

                }
                break;
            case 46 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:190: T59
                {
                mT59(); 

                }
                break;
            case 47 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:194: T60
                {
                mT60(); 

                }
                break;
            case 48 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:198: T61
                {
                mT61(); 

                }
                break;
            case 49 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:202: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 50 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:211: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 51 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:219: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 52 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:227: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 53 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:240: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 54 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:251: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 55 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:263: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:275: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 57 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:291: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 58 :
                // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1:307: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}