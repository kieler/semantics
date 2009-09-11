package de.cau.cs.kieler.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalEsterelLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=16;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_BASETYPE=5;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int RULE_ESTEREL_ML_COMMENT=12;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int RULE_ML_COMMENT=13;
    public static final int T45=45;
    public static final int T44=44;
    public static final int RULE_STRING=8;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T52=52;
    public static final int T51=51;
    public static final int T54=54;
    public static final int T53=53;
    public static final int T56=56;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public static final int T75=75;
    public static final int RULE_BOOLEAN=10;
    public static final int T76=76;
    public static final int T73=73;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int T72=72;
    public static final int T71=71;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_NUMBER=6;
    public static final int RULE_INT=7;
    public static final int T61=61;
    public static final int RULE_ESTEREL_SL_COMMENT=11;
    public static final int T60=60;
    public static final int RULE_FLOAT=9;
    public static final int RULE_SL_COMMENT=14;
    public static final int Tokens=91;
    public static final int T90=90;
    public static final int T88=88;
    public static final int T89=89;
    public static final int T84=84;
    public static final int T85=85;
    public static final int T86=86;
    public static final int T87=87;
    public static final int RULE_WS=15;
    public static final int T81=81;
    public static final int T80=80;
    public static final int T17=17;
    public static final int T83=83;
    public static final int T18=18;
    public static final int T82=82;
    public static final int T19=19;
    public InternalEsterelLexer() {;} 
    public InternalEsterelLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g"; }

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:10:5: ( 'module' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:10:7: 'module'
            {
            match("module"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:11:5: ( ':' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:11:7: ':'
            {
            match(':'); 

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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:12:5: ( 'end' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:12:7: 'end'
            {
            match("end"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:13:5: ( '.' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:13:7: '.'
            {
            match('.'); 

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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:14:5: ( 'input' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:14:7: 'input'
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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:15:5: ( ',' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:15:7: ','
            {
            match(','); 

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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:16:5: ( ';' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:16:7: ';'
            {
            match(';'); 

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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:17:5: ( 'output' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:17:7: 'output'
            {
            match("output"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:18:5: ( 'inputoutput' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:18:7: 'inputoutput'
            {
            match("inputoutput"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:19:5: ( 'return' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:19:7: 'return'
            {
            match("return"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:20:5: ( 'sensor' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:20:7: 'sensor'
            {
            match("sensor"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:21:5: ( 'relation' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:21:7: 'relation'
            {
            match("relation"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:22:5: ( '=>' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:22:7: '=>'
            {
            match("=>"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:23:5: ( '#' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:23:7: '#'
            {
            match('#'); 

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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:24:5: ( 'type' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:24:7: 'type'
            {
            match("type"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:25:5: ( 'constant' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:25:7: 'constant'
            {
            match("constant"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:26:5: ( '=' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:26:7: '='
            {
            match('='); 

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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:27:5: ( 'function' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:27:7: 'function'
            {
            match("function"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:28:5: ( '(' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:28:7: '('
            {
            match('('); 

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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:29:5: ( ')' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:29:7: ')'
            {
            match(')'); 

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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:30:5: ( '||' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:30:7: '||'
            {
            match("||"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:31:5: ( '[' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:31:7: '['
            {
            match('['); 

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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:32:5: ( ']' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:32:7: ']'
            {
            match(']'); 

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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:33:5: ( ':=' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:33:7: ':='
            {
            match(":="); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:34:5: ( 'abort' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:34:7: 'abort'
            {
            match("abort"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:35:5: ( 'when' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:35:7: 'when'
            {
            match("when"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:36:5: ( 'do' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:36:7: 'do'
            {
            match("do"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:37:5: ( 'case' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:37:7: 'case'
            {
            match("case"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:38:5: ( 'await' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:38:7: 'await'
            {
            match("await"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:39:5: ( 'upto' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:39:7: 'upto'
            {
            match("upto"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:40:5: ( 'watching' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:40:7: 'watching'
            {
            match("watching"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:41:5: ( 'timeout' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:41:7: 'timeout'
            {
            match("timeout"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:42:5: ( 'emit' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:42:7: 'emit'
            {
            match("emit"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:43:5: ( 'every' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:43:7: 'every'
            {
            match("every"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:44:5: ( 'exit' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:44:7: 'exit'
            {
            match("exit"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:45:5: ( 'halt' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:45:7: 'halt'
            {
            match("halt"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:46:5: ( 'if' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:46:7: 'if'
            {
            match("if"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:47:5: ( 'elsif' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:47:7: 'elsif'
            {
            match("elsif"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:48:5: ( 'then' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:48:7: 'then'
            {
            match("then"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:49:5: ( 'else' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:49:7: 'else'
            {
            match("else"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:50:5: ( 'loop' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:50:7: 'loop'
            {
            match("loop"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:51:5: ( 'each' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:51:7: 'each'
            {
            match("each"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:52:5: ( 'nothing' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:52:7: 'nothing'
            {
            match("nothing"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:53:5: ( 'pause' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:53:7: 'pause'
            {
            match("pause"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:54:5: ( 'present' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:54:7: 'present'
            {
            match("present"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:55:5: ( 'positive' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:55:7: 'positive'
            {
            match("positive"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:56:5: ( 'repeat' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:56:7: 'repeat'
            {
            match("repeat"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:57:5: ( 'times' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:57:7: 'times'
            {
            match("times"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:58:5: ( 'run' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:58:7: 'run'
            {
            match("run"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:59:5: ( 'copymodule' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:59:7: 'copymodule'
            {
            match("copymodule"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:60:5: ( '/' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:60:7: '/'
            {
            match('/'); 

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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:61:5: ( 'signal' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:61:7: 'signal'
            {
            match("signal"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:62:5: ( 'in' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:62:7: 'in'
            {
            match("in"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:63:5: ( 'suspend' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:63:7: 'suspend'
            {
            match("suspend"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:64:5: ( 'sustain' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:64:7: 'sustain'
            {
            match("sustain"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:65:5: ( 'trap' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:65:7: 'trap'
            {
            match("trap"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:66:5: ( 'handle' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:66:7: 'handle'
            {
            match("handle"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:67:5: ( 'var' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:67:7: 'var'
            {
            match("var"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:68:5: ( 'weak' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:68:7: 'weak'
            {
            match("weak"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:69:5: ( '?' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:69:7: '?'
            {
            match('?'); 

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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:70:5: ( 'pre' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:70:7: 'pre'
            {
            match("pre"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:71:5: ( '??' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:71:7: '??'
            {
            match("??"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:72:5: ( 'and' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:72:7: 'and'
            {
            match("and"); 


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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:73:5: ( 'or' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:73:7: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:74:5: ( 'not' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:74:7: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:75:5: ( '<' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:75:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:76:5: ( '>' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:76:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:77:5: ( '<=' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:77:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:78:5: ( '>=' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:78:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:79:5: ( '<>' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:79:7: '<>'
            {
            match("<>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:80:5: ( '+' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:80:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:81:5: ( '-' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:81:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:82:5: ( '*' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:82:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public final void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:83:5: ( 'mod' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:83:7: 'mod'
            {
            match("mod"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start RULE_FLOAT
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8081:12: ( ( ( RULE_INT '.' RULE_INT | RULE_INT ( '.' RULE_INT )? ( 'e' | 'E' ) ( '-' | '+' )? RULE_INT ) ( 'f' )? | RULE_INT 'f' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8081:14: ( ( RULE_INT '.' RULE_INT | RULE_INT ( '.' RULE_INT )? ( 'e' | 'E' ) ( '-' | '+' )? RULE_INT ) ( 'f' )? | RULE_INT 'f' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8081:14: ( ( RULE_INT '.' RULE_INT | RULE_INT ( '.' RULE_INT )? ( 'e' | 'E' ) ( '-' | '+' )? RULE_INT ) ( 'f' )? | RULE_INT 'f' )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8081:15: ( RULE_INT '.' RULE_INT | RULE_INT ( '.' RULE_INT )? ( 'e' | 'E' ) ( '-' | '+' )? RULE_INT ) ( 'f' )?
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8081:15: ( RULE_INT '.' RULE_INT | RULE_INT ( '.' RULE_INT )? ( 'e' | 'E' ) ( '-' | '+' )? RULE_INT )
                    int alt3=2;
                    alt3 = dfa3.predict(input);
                    switch (alt3) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8081:16: RULE_INT '.' RULE_INT
                            {
                            mRULE_INT(); 
                            match('.'); 
                            mRULE_INT(); 

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8081:38: RULE_INT ( '.' RULE_INT )? ( 'e' | 'E' ) ( '-' | '+' )? RULE_INT
                            {
                            mRULE_INT(); 
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8081:47: ( '.' RULE_INT )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0=='.') ) {
                                alt1=1;
                            }
                            switch (alt1) {
                                case 1 :
                                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8081:48: '.' RULE_INT
                                    {
                                    match('.'); 
                                    mRULE_INT(); 

                                    }
                                    break;

                            }

                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }

                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8081:73: ( '-' | '+' )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0=='+'||LA2_0=='-') ) {
                                alt2=1;
                            }
                            switch (alt2) {
                                case 1 :
                                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:
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

                            mRULE_INT(); 

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8081:94: ( 'f' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='f') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8081:94: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8081:99: RULE_INT 'f'
                    {
                    mRULE_INT(); 
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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8083:14: ( ( 'true' | 'false' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8083:16: ( 'true' | 'false' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8083:16: ( 'true' | 'false' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='t') ) {
                alt6=1;
            }
            else if ( (LA6_0=='f') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("8083:16: ( 'true' | 'false' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8083:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8083:24: 'false'
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

    // $ANTLR start RULE_BASETYPE
    public final void mRULE_BASETYPE() throws RecognitionException {
        try {
            int _type = RULE_BASETYPE;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8085:15: ( ( 'boolean' | 'integer' | 'float' | 'double' | 'string' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8085:17: ( 'boolean' | 'integer' | 'float' | 'double' | 'string' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8085:17: ( 'boolean' | 'integer' | 'float' | 'double' | 'string' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 'b':
                {
                alt7=1;
                }
                break;
            case 'i':
                {
                alt7=2;
                }
                break;
            case 'f':
                {
                alt7=3;
                }
                break;
            case 'd':
                {
                alt7=4;
                }
                break;
            case 's':
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("8085:17: ( 'boolean' | 'integer' | 'float' | 'double' | 'string' )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8085:18: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8085:28: 'integer'
                    {
                    match("integer"); 


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8085:38: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8085:46: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8085:55: 'string'
                    {
                    match("string"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_BASETYPE

    // $ANTLR start RULE_ESTEREL_SL_COMMENT
    public final void mRULE_ESTEREL_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ESTEREL_SL_COMMENT;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8087:25: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8087:27: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8087:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8087:31: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8087:47: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8087:48: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8087:48: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8087:48: '\\r'
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
    // $ANTLR end RULE_ESTEREL_SL_COMMENT

    // $ANTLR start RULE_ESTEREL_ML_COMMENT
    public final void mRULE_ESTEREL_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ESTEREL_ML_COMMENT;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8089:25: ( '%' '{' ( options {greedy=false; } : . )* '}' '%' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8089:27: '%' '{' ( options {greedy=false; } : . )* '}' '%'
            {
            match('%'); 
            match('{'); 
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8089:35: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='}') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='%') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='$')||(LA11_1>='&' && LA11_1<='\uFFFE')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='|')||(LA11_0>='~' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8089:63: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match('}'); 
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ESTEREL_ML_COMMENT

    // $ANTLR start RULE_NUMBER
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8091:13: ( ( '+' | '-' ) ( ' ' )? RULE_INT )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8091:15: ( '+' | '-' ) ( ' ' )? RULE_INT
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8091:25: ( ' ' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==' ') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8091:25: ' '
                    {
                    match(' '); 

                    }
                    break;

            }

            mRULE_INT(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_NUMBER

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8093:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8093:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8093:11: ( '^' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='^') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8093:11: '^'
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

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8093:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:
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
            	    break loop14;
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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8095:10: ( ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8095:12: ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8095:12: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8095:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8097:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8097:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8097:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\"') ) {
                alt18=1;
            }
            else if ( (LA18_0=='\'') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("8097:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8097:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8097:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFE')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8097:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8097:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop16;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8097:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8097:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFE')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8097:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8097:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop17;
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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8099:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8099:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8099:24: ( options {greedy=false; } : . )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='*') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='/') ) {
                        alt19=2;
                    }
                    else if ( ((LA19_1>='\u0000' && LA19_1<='.')||(LA19_1>='0' && LA19_1<='\uFFFE')) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>='\u0000' && LA19_0<=')')||(LA19_0>='+' && LA19_0<='\uFFFE')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8099:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop19;
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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8101:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8101:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8101:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\uFFFE')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8101:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8101:40: ( ( '\\r' )? '\\n' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\n'||LA22_0=='\r') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8101:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8101:41: ( '\\r' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='\r') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8101:41: '\\r'
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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8103:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8103:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8103:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:
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
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8105:16: ( . )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8105:18: .
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
        // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:8: ( T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | RULE_FLOAT | RULE_BOOLEAN | RULE_BASETYPE | RULE_ESTEREL_SL_COMMENT | RULE_ESTEREL_ML_COMMENT | RULE_NUMBER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt24=87;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:10: T17
                {
                mT17(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:14: T18
                {
                mT18(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:18: T19
                {
                mT19(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:22: T20
                {
                mT20(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:26: T21
                {
                mT21(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:30: T22
                {
                mT22(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:34: T23
                {
                mT23(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:38: T24
                {
                mT24(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:42: T25
                {
                mT25(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:46: T26
                {
                mT26(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:50: T27
                {
                mT27(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:54: T28
                {
                mT28(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:58: T29
                {
                mT29(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:62: T30
                {
                mT30(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:66: T31
                {
                mT31(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:70: T32
                {
                mT32(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:74: T33
                {
                mT33(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:78: T34
                {
                mT34(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:82: T35
                {
                mT35(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:86: T36
                {
                mT36(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:90: T37
                {
                mT37(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:94: T38
                {
                mT38(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:98: T39
                {
                mT39(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:102: T40
                {
                mT40(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:106: T41
                {
                mT41(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:110: T42
                {
                mT42(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:114: T43
                {
                mT43(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:118: T44
                {
                mT44(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:122: T45
                {
                mT45(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:126: T46
                {
                mT46(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:130: T47
                {
                mT47(); 

                }
                break;
            case 32 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:134: T48
                {
                mT48(); 

                }
                break;
            case 33 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:138: T49
                {
                mT49(); 

                }
                break;
            case 34 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:142: T50
                {
                mT50(); 

                }
                break;
            case 35 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:146: T51
                {
                mT51(); 

                }
                break;
            case 36 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:150: T52
                {
                mT52(); 

                }
                break;
            case 37 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:154: T53
                {
                mT53(); 

                }
                break;
            case 38 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:158: T54
                {
                mT54(); 

                }
                break;
            case 39 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:162: T55
                {
                mT55(); 

                }
                break;
            case 40 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:166: T56
                {
                mT56(); 

                }
                break;
            case 41 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:170: T57
                {
                mT57(); 

                }
                break;
            case 42 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:174: T58
                {
                mT58(); 

                }
                break;
            case 43 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:178: T59
                {
                mT59(); 

                }
                break;
            case 44 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:182: T60
                {
                mT60(); 

                }
                break;
            case 45 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:186: T61
                {
                mT61(); 

                }
                break;
            case 46 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:190: T62
                {
                mT62(); 

                }
                break;
            case 47 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:194: T63
                {
                mT63(); 

                }
                break;
            case 48 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:198: T64
                {
                mT64(); 

                }
                break;
            case 49 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:202: T65
                {
                mT65(); 

                }
                break;
            case 50 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:206: T66
                {
                mT66(); 

                }
                break;
            case 51 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:210: T67
                {
                mT67(); 

                }
                break;
            case 52 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:214: T68
                {
                mT68(); 

                }
                break;
            case 53 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:218: T69
                {
                mT69(); 

                }
                break;
            case 54 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:222: T70
                {
                mT70(); 

                }
                break;
            case 55 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:226: T71
                {
                mT71(); 

                }
                break;
            case 56 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:230: T72
                {
                mT72(); 

                }
                break;
            case 57 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:234: T73
                {
                mT73(); 

                }
                break;
            case 58 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:238: T74
                {
                mT74(); 

                }
                break;
            case 59 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:242: T75
                {
                mT75(); 

                }
                break;
            case 60 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:246: T76
                {
                mT76(); 

                }
                break;
            case 61 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:250: T77
                {
                mT77(); 

                }
                break;
            case 62 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:254: T78
                {
                mT78(); 

                }
                break;
            case 63 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:258: T79
                {
                mT79(); 

                }
                break;
            case 64 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:262: T80
                {
                mT80(); 

                }
                break;
            case 65 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:266: T81
                {
                mT81(); 

                }
                break;
            case 66 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:270: T82
                {
                mT82(); 

                }
                break;
            case 67 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:274: T83
                {
                mT83(); 

                }
                break;
            case 68 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:278: T84
                {
                mT84(); 

                }
                break;
            case 69 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:282: T85
                {
                mT85(); 

                }
                break;
            case 70 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:286: T86
                {
                mT86(); 

                }
                break;
            case 71 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:290: T87
                {
                mT87(); 

                }
                break;
            case 72 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:294: T88
                {
                mT88(); 

                }
                break;
            case 73 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:298: T89
                {
                mT89(); 

                }
                break;
            case 74 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:302: T90
                {
                mT90(); 

                }
                break;
            case 75 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:306: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 76 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:317: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 77 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:330: RULE_BASETYPE
                {
                mRULE_BASETYPE(); 

                }
                break;
            case 78 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:344: RULE_ESTEREL_SL_COMMENT
                {
                mRULE_ESTEREL_SL_COMMENT(); 

                }
                break;
            case 79 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:368: RULE_ESTEREL_ML_COMMENT
                {
                mRULE_ESTEREL_ML_COMMENT(); 

                }
                break;
            case 80 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:392: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 81 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:404: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 82 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:412: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 83 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:421: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 84 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:433: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 85 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:449: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 86 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:465: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 87 :
                // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1:473: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA5_eotS =
        "\4\uffff";
    static final String DFA5_eofS =
        "\4\uffff";
    static final String DFA5_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA5_maxS =
        "\1\71\1\146\2\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\4\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\2\37\uffff\1\2\1\3",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "8081:14: ( ( RULE_INT '.' RULE_INT | RULE_INT ( '.' RULE_INT )? ( 'e' | 'E' ) ( '-' | '+' )? RULE_INT ) ( 'f' )? | RULE_INT 'f' )";
        }
    }
    static final String DFA3_eotS =
        "\4\uffff\1\5\1\uffff";
    static final String DFA3_eofS =
        "\6\uffff";
    static final String DFA3_minS =
        "\1\60\1\56\1\60\1\uffff\1\60\1\uffff";
    static final String DFA3_maxS =
        "\1\71\1\145\1\71\1\uffff\1\145\1\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\2\1\uffff\1\1";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "\12\4",
            "",
            "\12\4\13\uffff\1\3\37\uffff\1\3",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "8081:15: ( RULE_INT '.' RULE_INT | RULE_INT ( '.' RULE_INT )? ( 'e' | 'E' ) ( '-' | '+' )? RULE_INT )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\1\57\1\61\1\57\1\uffff\1\57\2\uffff\3\57\1\106\1\uffff"+
        "\3\57\2\uffff\1\55\2\uffff\10\57\1\146\1\57\1\151\1\154\1\156\1"+
        "\157\1\161\1\uffff\1\163\1\57\1\170\1\55\1\uffff\2\55\2\uffff\1"+
        "\57\3\uffff\6\57\1\uffff\1\u0084\1\u0085\2\uffff\1\57\1\u0087\6"+
        "\57\3\uffff\11\57\5\uffff\6\57\1\u00a2\7\57\3\uffff\1\57\15\uffff"+
        "\1\163\1\57\1\170\3\uffff\1\u00b2\1\u00b3\7\57\2\uffff\1\57\1\uffff"+
        "\3\57\1\u00c0\21\57\1\u00d3\4\57\1\uffff\4\57\1\u00dd\1\57\1\u00e0"+
        "\1\57\1\u00e2\1\57\1\170\1\uffff\2\170\1\57\2\uffff\1\57\1\u00e8"+
        "\1\u00e9\1\57\1\u00eb\1\u00ec\6\57\1\uffff\5\57\1\u00f8\1\u00f9"+
        "\1\57\1\u00fc\1\u00fd\1\u00fe\7\57\1\uffff\1\u0106\1\57\1\u0108"+
        "\1\57\1\u010a\1\57\1\u010c\1\u010d\1\57\1\uffff\2\57\1\uffff\1\57"+
        "\1\uffff\1\57\1\170\1\uffff\1\57\1\u0114\2\uffff\1\u0115\2\uffff"+
        "\1\57\1\u0118\11\57\2\uffff\1\u0122\1\57\3\uffff\3\57\1\u0127\1"+
        "\u00fc\1\u0128\1\u0129\1\uffff\1\57\1\uffff\1\57\1\uffff\1\57\2"+
        "\uffff\1\57\1\u012e\3\57\1\u0132\2\uffff\2\57\1\uffff\1\u0135\1"+
        "\u0136\1\u0137\1\57\1\u0139\2\57\1\u013c\1\u0127\1\uffff\4\57\3"+
        "\uffff\1\57\1\u0127\1\u0142\1\57\1\uffff\3\57\1\uffff\1\u0127\1"+
        "\57\3\uffff\1\57\1\uffff\1\u0149\1\u014a\1\uffff\1\u014b\4\57\1"+
        "\uffff\1\u0150\1\u0151\1\57\1\u0127\1\57\1\u0154\3\uffff\1\57\1"+
        "\u0156\1\u0157\1\u0158\2\uffff\1\u0159\1\57\1\uffff\1\57\4\uffff"+
        "\1\57\1\u015d\1\u015e\2\uffff";
    static final String DFA24_eofS =
        "\u015f\uffff";
    static final String DFA24_minS =
        "\1\0\1\157\1\75\1\141\1\uffff\1\146\2\uffff\1\162\2\145\1\76\1\uffff"+
        "\1\150\2\141\2\uffff\1\174\2\uffff\1\142\1\141\1\157\1\160\1\141"+
        "\2\157\1\141\1\52\1\141\1\77\2\75\2\40\1\uffff\1\56\1\157\1\173"+
        "\1\101\1\uffff\2\0\2\uffff\1\144\3\uffff\1\144\1\163\1\151\1\145"+
        "\1\151\1\143\1\uffff\2\60\2\uffff\1\164\1\60\1\154\2\156\1\163\1"+
        "\147\1\162\3\uffff\1\160\1\145\1\155\1\141\1\163\2\156\1\157\1\154"+
        "\5\uffff\1\157\1\141\1\144\1\145\1\164\1\141\1\60\1\164\1\154\1"+
        "\157\1\164\1\165\1\145\1\163\3\uffff\1\162\15\uffff\1\56\1\157\1"+
        "\0\3\uffff\2\60\1\145\1\164\1\162\1\164\1\150\1\145\1\165\2\uffff"+
        "\1\160\1\uffff\1\145\1\165\1\141\1\60\1\163\1\160\1\156\1\151\1"+
        "\145\1\156\2\145\1\160\1\145\1\171\1\163\1\143\1\141\1\163\1\162"+
        "\1\151\1\60\1\156\1\143\1\153\1\142\1\uffff\1\157\1\144\1\164\1"+
        "\160\1\60\1\163\1\60\1\151\1\60\1\154\4\0\1\154\2\uffff\1\146\2"+
        "\60\1\171\2\60\1\147\1\164\1\165\1\141\1\162\1\164\1\uffff\1\157"+
        "\1\141\1\145\1\141\1\156\2\60\1\157\3\60\1\155\3\164\1\145\2\164"+
        "\1\uffff\1\60\1\150\1\60\1\154\1\60\1\154\2\60\1\151\1\uffff\2\145"+
        "\1\uffff\1\164\1\uffff\1\145\1\0\1\uffff\1\145\1\60\2\uffff\1\60"+
        "\2\uffff\1\145\1\60\2\164\1\156\1\151\1\162\1\151\1\156\1\154\1"+
        "\147\2\uffff\1\60\1\165\3\uffff\1\157\1\141\1\151\4\60\1\uffff\1"+
        "\151\1\uffff\1\145\1\uffff\1\145\2\uffff\1\156\1\60\1\156\1\151"+
        "\1\141\1\60\2\uffff\1\162\1\165\1\uffff\3\60\1\157\1\60\1\156\1"+
        "\144\2\60\1\uffff\1\164\1\144\1\156\1\157\3\uffff\1\156\2\60\1\147"+
        "\1\uffff\1\164\1\166\1\156\1\uffff\1\60\1\164\3\uffff\1\156\1\uffff"+
        "\2\60\1\uffff\1\60\1\165\1\164\1\156\1\147\1\uffff\2\60\1\145\1"+
        "\60\1\160\1\60\3\uffff\1\154\3\60\2\uffff\1\60\1\165\1\uffff\1\145"+
        "\4\uffff\1\164\2\60\2\uffff";
    static final String DFA24_maxS =
        "\1\ufffe\1\157\1\75\1\170\1\uffff\1\156\2\uffff\3\165\1\76\1\uffff"+
        "\1\171\1\157\1\165\2\uffff\1\174\2\uffff\1\167\1\150\1\157\1\160"+
        "\1\141\2\157\1\162\1\57\1\141\1\77\1\76\1\75\2\71\1\uffff\1\146"+
        "\1\157\1\173\1\172\1\uffff\2\ufffe\2\uffff\1\144\3\uffff\1\144\1"+
        "\163\1\151\1\145\1\151\1\143\1\uffff\2\172\2\uffff\1\164\1\172\1"+
        "\164\2\156\1\163\1\147\1\162\3\uffff\1\160\1\145\1\155\1\165\1\163"+
        "\1\160\1\156\1\157\1\154\5\uffff\1\157\1\141\1\144\1\145\1\164\1"+
        "\141\1\172\1\164\1\156\1\157\1\164\1\165\1\145\1\163\3\uffff\1\162"+
        "\15\uffff\1\146\1\157\1\ufffe\3\uffff\2\172\1\151\1\164\1\162\1"+
        "\164\1\150\1\145\1\165\2\uffff\1\160\1\uffff\1\145\1\165\1\141\1"+
        "\172\1\163\1\164\1\156\1\151\1\145\1\156\2\145\1\160\1\145\1\171"+
        "\1\163\1\143\1\141\1\163\1\162\1\151\1\172\1\156\1\143\1\153\1\142"+
        "\1\uffff\1\157\1\144\1\164\1\160\1\172\1\163\1\172\1\151\1\172\1"+
        "\154\4\ufffe\1\154\2\uffff\1\146\2\172\1\171\2\172\1\147\1\164\1"+
        "\165\1\141\1\162\1\164\1\uffff\1\157\1\141\1\145\1\141\1\156\2\172"+
        "\1\163\3\172\1\155\3\164\1\145\2\164\1\uffff\1\172\1\150\1\172\1"+
        "\154\1\172\1\154\2\172\1\151\1\uffff\2\145\1\uffff\1\164\1\uffff"+
        "\1\145\1\ufffe\1\uffff\1\145\1\172\2\uffff\1\172\2\uffff\1\145\1"+
        "\172\2\164\1\156\1\151\1\162\1\151\1\156\1\154\1\147\2\uffff\1\172"+
        "\1\165\3\uffff\1\157\1\141\1\151\4\172\1\uffff\1\151\1\uffff\1\145"+
        "\1\uffff\1\145\2\uffff\1\156\1\172\1\156\1\151\1\141\1\172\2\uffff"+
        "\1\162\1\165\1\uffff\3\172\1\157\1\172\1\156\1\144\2\172\1\uffff"+
        "\1\164\1\144\1\156\1\157\3\uffff\1\156\2\172\1\147\1\uffff\1\164"+
        "\1\166\1\156\1\uffff\1\172\1\164\3\uffff\1\156\1\uffff\2\172\1\uffff"+
        "\1\172\1\165\1\164\1\156\1\147\1\uffff\2\172\1\145\1\172\1\160\1"+
        "\172\3\uffff\1\154\3\172\2\uffff\1\172\1\165\1\uffff\1\145\4\uffff"+
        "\1\164\2\172\2\uffff";
    static final String DFA24_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\4\uffff\1\16\3\uffff\1\23\1\24\1\uffff"+
        "\1\26\1\27\17\uffff\1\111\4\uffff\1\121\2\uffff\1\126\1\127\1\uffff"+
        "\1\121\1\30\1\2\6\uffff\1\4\2\uffff\1\6\1\7\10\uffff\1\15\1\21\1"+
        "\16\11\uffff\1\23\1\24\1\25\1\26\1\27\16\uffff\1\125\1\124\1\63"+
        "\1\uffff\1\76\1\74\1\104\1\106\1\102\1\105\1\103\1\107\1\120\1\110"+
        "\1\111\1\122\1\113\3\uffff\1\116\1\123\1\126\11\uffff\1\65\1\45"+
        "\1\uffff\1\100\32\uffff\1\33\17\uffff\1\112\1\3\14\uffff\1\61\22"+
        "\uffff\1\77\11\uffff\1\101\2\uffff\1\75\1\uffff\1\72\2\uffff\1\117"+
        "\2\uffff\1\50\1\43\1\uffff\1\41\1\52\13\uffff\1\17\1\47\2\uffff"+
        "\1\114\1\70\1\34\7\uffff\1\32\1\uffff\1\73\1\uffff\1\36\1\uffff"+
        "\1\44\1\51\6\uffff\1\46\1\42\2\uffff\1\5\11\uffff\1\60\4\uffff\1"+
        "\115\1\31\1\35\4\uffff\1\54\3\uffff\1\1\2\uffff\1\10\1\57\1\12\1"+
        "\uffff\1\13\2\uffff\1\64\5\uffff\1\71\6\uffff\1\67\1\66\1\40\4\uffff"+
        "\1\53\1\55\2\uffff\1\14\1\uffff\1\20\1\22\1\37\1\56\3\uffff\1\62"+
        "\1\11";
    static final String DFA24_specialS =
        "\u015f\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\55\2\54\2\55\1\54\22\55\1\54\1\55\1\52\1\14\1\55\1\47\1"+
            "\55\1\53\1\20\1\21\1\44\1\42\1\6\1\43\1\4\1\35\12\45\1\2\1\7"+
            "\1\40\1\13\1\41\1\37\1\55\32\51\1\23\1\55\1\24\1\50\1\51\1\55"+
            "\1\25\1\46\1\16\1\27\1\3\1\17\1\51\1\31\1\5\2\51\1\32\1\1\1"+
            "\33\1\10\1\34\1\51\1\11\1\12\1\15\1\30\1\36\1\26\3\51\1\55\1"+
            "\22\uff82\55",
            "\1\56",
            "\1\60",
            "\1\67\12\uffff\1\63\1\66\1\62\7\uffff\1\65\1\uffff\1\64",
            "",
            "\1\72\7\uffff\1\71",
            "",
            "",
            "\1\76\2\uffff\1\75",
            "\1\77\17\uffff\1\100",
            "\1\101\3\uffff\1\103\12\uffff\1\104\1\102",
            "\1\105",
            "",
            "\1\111\1\112\10\uffff\1\113\6\uffff\1\110",
            "\1\114\15\uffff\1\115",
            "\1\120\12\uffff\1\117\10\uffff\1\116",
            "",
            "",
            "\1\123",
            "",
            "",
            "\1\126\13\uffff\1\130\10\uffff\1\127",
            "\1\132\3\uffff\1\133\2\uffff\1\131",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141\15\uffff\1\143\2\uffff\1\142",
            "\1\145\4\uffff\1\144",
            "\1\147",
            "\1\150",
            "\1\152\1\153",
            "\1\155",
            "\1\160\17\uffff\12\160",
            "\1\160\17\uffff\12\160",
            "",
            "\1\164\1\uffff\12\165\13\uffff\1\164\37\uffff\2\164",
            "\1\166",
            "\1\167",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\uffff\171",
            "\uffff\171",
            "",
            "",
            "\1\173",
            "",
            "",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u0083\3\57"+
            "\1\u0082\6\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u0086",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u008a\3\uffff\1\u0088\3\uffff\1\u0089",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0094\23\uffff\1\u0093",
            "\1\u0095",
            "\1\u0097\1\uffff\1\u0096",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "",
            "",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00a1\5\57",
            "\1\u00a3",
            "\1\u00a5\1\uffff\1\u00a4",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "",
            "",
            "\1\u00ab",
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
            "\1\164\1\uffff\12\165\13\uffff\1\164\37\uffff\2\164",
            "\1\u00ac",
            "\12\u00b0\1\u00af\2\u00b0\1\u00ae\157\u00b0\1\u00ad\uff81\u00b0",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00b1\5\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b5\3\uffff\1\u00b4",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c1",
            "\1\u00c3\3\uffff\1\u00c2",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\u00dc\22\57",
            "\1\u00de",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00df\7\57",
            "\1\u00e1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e3",
            "\12\u00b0\1\u00af\2\u00b0\1\u00ae\27\u00b0\1\u00e4\127\u00b0"+
            "\1\u00ad\uff81\u00b0",
            "\12\u00e5\1\u00af\ufff4\u00e5",
            "\uffff\u00e5",
            "\12\u00b0\1\u00af\2\u00b0\1\u00ae\157\u00b0\1\u00ad\uff81\u00b0",
            "\1\u00e6",
            "",
            "",
            "\1\u00e7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ea",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00fb\3\uffff\1\u00fa",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0107",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0109",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u010b",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u010e",
            "",
            "\1\u010f",
            "\1\u0110",
            "",
            "\1\u0111",
            "",
            "\1\u0112",
            "\12\u00b0\1\u00af\2\u00b0\1\u00ae\157\u00b0\1\u00ad\uff81\u00b0",
            "",
            "\1\u0113",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u0116",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u0117\13\57",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0123",
            "",
            "",
            "",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u012a",
            "",
            "\1\u012b",
            "",
            "\1\u012c",
            "",
            "",
            "\1\u012d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u0133",
            "\1\u0134",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0138",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u013a",
            "\1\u013b",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "",
            "",
            "",
            "\1\u0141",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0147",
            "",
            "",
            "",
            "\1\u0148",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0152",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0153",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\1\u0155",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u015a",
            "",
            "\1\u015b",
            "",
            "",
            "",
            "",
            "\1\u015c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
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
            return "1:1: Tokens : ( T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | RULE_FLOAT | RULE_BOOLEAN | RULE_BASETYPE | RULE_ESTEREL_SL_COMMENT | RULE_ESTEREL_ML_COMMENT | RULE_NUMBER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}