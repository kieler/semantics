package de.cau.cs.kieler.synccharts.dsl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalKits_textonlyLexer extends Lexer {
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
    public static final int T20=20;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=52;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int T50=50;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalKits_textonlyLexer() {;} 
    public InternalKits_textonlyLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:10:5: ( 'state' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:10:7: 'state'
            {
            match("state"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:11:5: ( 'cond' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:11:7: 'cond'
            {
            match("cond"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:12:5: ( 'ref' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:12:7: 'ref'
            {
            match("ref"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:13:5: ( 'textual' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:13:7: 'textual'
            {
            match("textual"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:14:5: ( 'NONE' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:14:7: 'NONE'
            {
            match("NONE"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:15:5: ( '+' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:15:7: '+'
            {
            match('+'); 

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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:16:5: ( '*' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:16:7: '*'
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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:17:5: ( 'AND' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:17:7: 'AND'
            {
            match("AND"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:18:5: ( 'OR' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:18:7: 'OR'
            {
            match("OR"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:19:5: ( 'hostCombineOperator' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:19:7: 'hostCombineOperator'
            {
            match("hostCombineOperator"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:20:5: ( 'PURE' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:20:7: 'PURE'
            {
            match("PURE"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:21:5: ( 'boolean' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:21:7: 'boolean'
            {
            match("boolean"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:22:5: ( 'unsigned' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:22:7: 'unsigned'
            {
            match("unsigned"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:23:5: ( 'integer' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:23:7: 'integer'
            {
            match("integer"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:24:5: ( 'float' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:24:7: 'float'
            {
            match("float"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:25:5: ( 'hostType' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:25:7: 'hostType'
            {
            match("hostType"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:26:5: ( '-->' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:26:7: '-->'
            {
            match("-->"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:27:5: ( 'o->' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:27:7: 'o->'
            {
            match("o->"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:28:5: ( '>->' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:28:7: '>->'
            {
            match(">->"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:29:5: ( 'region' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:29:7: 'region'
            {
            match("region"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:30:5: ( '{' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:30:7: '{'
            {
            match('{'); 

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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:31:5: ( '}' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:31:7: '}'
            {
            match('}'); 

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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:32:5: ( 'onentry' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:32:7: 'onentry'
            {
            match("onentry"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:33:5: ( 'oninner' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:33:7: 'oninner'
            {
            match("oninner"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:34:5: ( 'onexit' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:34:7: 'onexit'
            {
            match("onexit"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:35:5: ( 'suspension' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:35:7: 'suspension'
            {
            match("suspension"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:36:5: ( '||' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:36:7: '||'
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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:37:5: ( '@' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:37:7: '@'
            {
            match('@'); 

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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:38:5: ( ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:38:7: ';'
            {
            match(';'); 

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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:39:5: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:39:7: 'with'
            {
            match("with"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:40:5: ( 'var' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:40:7: 'var'
            {
            match("var"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:41:5: ( ': ' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:41:7: ': '
            {
            match(": "); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:42:5: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:42:7: ':='
            {
            match(":="); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:43:5: ( ': combine' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:43:7: ': combine'
            {
            match(": combine"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:44:5: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:44:7: 'init'
            {
            match("init"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:45:5: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:45:7: 'final'
            {
            match("final"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:46:5: ( '#' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:46:7: '#'
            {
            match('#'); 

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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:47:5: ( ' history' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:47:7: ' history'
            {
            match(" history"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:48:5: ( 'inputoutput' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:48:7: 'inputoutput'
            {
            match("inputoutput"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:49:5: ( 'input' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:49:7: 'input'
            {
            match("input"); 


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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:50:5: ( 'output' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:50:7: 'output'
            {
            match("output"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7255:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7255:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7255:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7255:11: '^'
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7255:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:
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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7257:10: ( ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7257:12: ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7257:12: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7257:13: '0' .. '9'
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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7259:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7259:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7259:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("7259:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7259:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7259:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7259:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7259:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7259:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7259:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7259:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7259:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7261:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7261:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7261:24: ( options {greedy=false; } : . )*
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
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7261:52: .
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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7263:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7263:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7263:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7263:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7263:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7263:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7263:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7263:41: '\\r'
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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7265:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7265:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7265:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:
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
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7267:16: ( . )
            // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:7267:18: .
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
        // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=48;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='s') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='a') ) {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='t') ) {
                        int LA12_101 = input.LA(5);

                        if ( (LA12_101=='e') ) {
                            int LA12_124 = input.LA(6);

                            if ( ((LA12_124>='0' && LA12_124<='9')||(LA12_124>='A' && LA12_124<='Z')||LA12_124=='_'||(LA12_124>='a' && LA12_124<='z')) ) {
                                alt12=42;
                            }
                            else {
                                alt12=1;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
                }
                break;
            case 'u':
                {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='s') ) {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='p') ) {
                        int LA12_102 = input.LA(5);

                        if ( (LA12_102=='e') ) {
                            int LA12_125 = input.LA(6);

                            if ( (LA12_125=='n') ) {
                                int LA12_146 = input.LA(7);

                                if ( (LA12_146=='s') ) {
                                    int LA12_162 = input.LA(8);

                                    if ( (LA12_162=='i') ) {
                                        int LA12_175 = input.LA(9);

                                        if ( (LA12_175=='o') ) {
                                            int LA12_185 = input.LA(10);

                                            if ( (LA12_185=='n') ) {
                                                int LA12_190 = input.LA(11);

                                                if ( ((LA12_190>='0' && LA12_190<='9')||(LA12_190>='A' && LA12_190<='Z')||LA12_190=='_'||(LA12_190>='a' && LA12_190<='z')) ) {
                                                    alt12=42;
                                                }
                                                else {
                                                    alt12=26;}
                                            }
                                            else {
                                                alt12=42;}
                                        }
                                        else {
                                            alt12=42;}
                                    }
                                    else {
                                        alt12=42;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
                }
                break;
            default:
                alt12=42;}

        }
        else if ( (LA12_0=='c') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='o') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='n') ) {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='d') ) {
                        int LA12_103 = input.LA(5);

                        if ( ((LA12_103>='0' && LA12_103<='9')||(LA12_103>='A' && LA12_103<='Z')||LA12_103=='_'||(LA12_103>='a' && LA12_103<='z')) ) {
                            alt12=42;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='r') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='e') ) {
                switch ( input.LA(3) ) {
                case 'f':
                    {
                    int LA12_79 = input.LA(4);

                    if ( ((LA12_79>='0' && LA12_79<='9')||(LA12_79>='A' && LA12_79<='Z')||LA12_79=='_'||(LA12_79>='a' && LA12_79<='z')) ) {
                        alt12=42;
                    }
                    else {
                        alt12=3;}
                    }
                    break;
                case 'g':
                    {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='i') ) {
                        int LA12_105 = input.LA(5);

                        if ( (LA12_105=='o') ) {
                            int LA12_127 = input.LA(6);

                            if ( (LA12_127=='n') ) {
                                int LA12_147 = input.LA(7);

                                if ( ((LA12_147>='0' && LA12_147<='9')||(LA12_147>='A' && LA12_147<='Z')||LA12_147=='_'||(LA12_147>='a' && LA12_147<='z')) ) {
                                    alt12=42;
                                }
                                else {
                                    alt12=20;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                    }
                    break;
                default:
                    alt12=42;}

            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='t') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='e') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='x') ) {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='t') ) {
                        int LA12_106 = input.LA(5);

                        if ( (LA12_106=='u') ) {
                            int LA12_128 = input.LA(6);

                            if ( (LA12_128=='a') ) {
                                int LA12_148 = input.LA(7);

                                if ( (LA12_148=='l') ) {
                                    int LA12_164 = input.LA(8);

                                    if ( ((LA12_164>='0' && LA12_164<='9')||(LA12_164>='A' && LA12_164<='Z')||LA12_164=='_'||(LA12_164>='a' && LA12_164<='z')) ) {
                                        alt12=42;
                                    }
                                    else {
                                        alt12=4;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='N') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='O') ) {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='N') ) {
                    int LA12_82 = input.LA(4);

                    if ( (LA12_82=='E') ) {
                        int LA12_107 = input.LA(5);

                        if ( ((LA12_107>='0' && LA12_107<='9')||(LA12_107>='A' && LA12_107<='Z')||LA12_107=='_'||(LA12_107>='a' && LA12_107<='z')) ) {
                            alt12=42;
                        }
                        else {
                            alt12=5;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='+') ) {
            alt12=6;
        }
        else if ( (LA12_0=='*') ) {
            alt12=7;
        }
        else if ( (LA12_0=='A') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='N') ) {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='D') ) {
                    int LA12_83 = input.LA(4);

                    if ( ((LA12_83>='0' && LA12_83<='9')||(LA12_83>='A' && LA12_83<='Z')||LA12_83=='_'||(LA12_83>='a' && LA12_83<='z')) ) {
                        alt12=42;
                    }
                    else {
                        alt12=8;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='O') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='R') ) {
                int LA12_47 = input.LA(3);

                if ( ((LA12_47>='0' && LA12_47<='9')||(LA12_47>='A' && LA12_47<='Z')||LA12_47=='_'||(LA12_47>='a' && LA12_47<='z')) ) {
                    alt12=42;
                }
                else {
                    alt12=9;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='h') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='o') ) {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='s') ) {
                    int LA12_85 = input.LA(4);

                    if ( (LA12_85=='t') ) {
                        switch ( input.LA(5) ) {
                        case 'T':
                            {
                            int LA12_130 = input.LA(6);

                            if ( (LA12_130=='y') ) {
                                int LA12_149 = input.LA(7);

                                if ( (LA12_149=='p') ) {
                                    int LA12_165 = input.LA(8);

                                    if ( (LA12_165=='e') ) {
                                        int LA12_177 = input.LA(9);

                                        if ( ((LA12_177>='0' && LA12_177<='9')||(LA12_177>='A' && LA12_177<='Z')||LA12_177=='_'||(LA12_177>='a' && LA12_177<='z')) ) {
                                            alt12=42;
                                        }
                                        else {
                                            alt12=16;}
                                    }
                                    else {
                                        alt12=42;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                            }
                            break;
                        case 'C':
                            {
                            int LA12_131 = input.LA(6);

                            if ( (LA12_131=='o') ) {
                                int LA12_150 = input.LA(7);

                                if ( (LA12_150=='m') ) {
                                    int LA12_166 = input.LA(8);

                                    if ( (LA12_166=='b') ) {
                                        int LA12_178 = input.LA(9);

                                        if ( (LA12_178=='i') ) {
                                            int LA12_187 = input.LA(10);

                                            if ( (LA12_187=='n') ) {
                                                int LA12_191 = input.LA(11);

                                                if ( (LA12_191=='e') ) {
                                                    int LA12_194 = input.LA(12);

                                                    if ( (LA12_194=='O') ) {
                                                        int LA12_196 = input.LA(13);

                                                        if ( (LA12_196=='p') ) {
                                                            int LA12_198 = input.LA(14);

                                                            if ( (LA12_198=='e') ) {
                                                                int LA12_199 = input.LA(15);

                                                                if ( (LA12_199=='r') ) {
                                                                    int LA12_200 = input.LA(16);

                                                                    if ( (LA12_200=='a') ) {
                                                                        int LA12_201 = input.LA(17);

                                                                        if ( (LA12_201=='t') ) {
                                                                            int LA12_202 = input.LA(18);

                                                                            if ( (LA12_202=='o') ) {
                                                                                int LA12_203 = input.LA(19);

                                                                                if ( (LA12_203=='r') ) {
                                                                                    int LA12_204 = input.LA(20);

                                                                                    if ( ((LA12_204>='0' && LA12_204<='9')||(LA12_204>='A' && LA12_204<='Z')||LA12_204=='_'||(LA12_204>='a' && LA12_204<='z')) ) {
                                                                                        alt12=42;
                                                                                    }
                                                                                    else {
                                                                                        alt12=10;}
                                                                                }
                                                                                else {
                                                                                    alt12=42;}
                                                                            }
                                                                            else {
                                                                                alt12=42;}
                                                                        }
                                                                        else {
                                                                            alt12=42;}
                                                                    }
                                                                    else {
                                                                        alt12=42;}
                                                                }
                                                                else {
                                                                    alt12=42;}
                                                            }
                                                            else {
                                                                alt12=42;}
                                                        }
                                                        else {
                                                            alt12=42;}
                                                    }
                                                    else {
                                                        alt12=42;}
                                                }
                                                else {
                                                    alt12=42;}
                                            }
                                            else {
                                                alt12=42;}
                                        }
                                        else {
                                            alt12=42;}
                                    }
                                    else {
                                        alt12=42;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                            }
                            break;
                        default:
                            alt12=42;}

                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='P') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='U') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='R') ) {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='E') ) {
                        int LA12_110 = input.LA(5);

                        if ( ((LA12_110>='0' && LA12_110<='9')||(LA12_110>='A' && LA12_110<='Z')||LA12_110=='_'||(LA12_110>='a' && LA12_110<='z')) ) {
                            alt12=42;
                        }
                        else {
                            alt12=11;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='b') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='o') ) {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='o') ) {
                    int LA12_87 = input.LA(4);

                    if ( (LA12_87=='l') ) {
                        int LA12_111 = input.LA(5);

                        if ( (LA12_111=='e') ) {
                            int LA12_133 = input.LA(6);

                            if ( (LA12_133=='a') ) {
                                int LA12_151 = input.LA(7);

                                if ( (LA12_151=='n') ) {
                                    int LA12_167 = input.LA(8);

                                    if ( ((LA12_167>='0' && LA12_167<='9')||(LA12_167>='A' && LA12_167<='Z')||LA12_167=='_'||(LA12_167>='a' && LA12_167<='z')) ) {
                                        alt12=42;
                                    }
                                    else {
                                        alt12=12;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='u') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='n') ) {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='s') ) {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='i') ) {
                        int LA12_112 = input.LA(5);

                        if ( (LA12_112=='g') ) {
                            int LA12_134 = input.LA(6);

                            if ( (LA12_134=='n') ) {
                                int LA12_152 = input.LA(7);

                                if ( (LA12_152=='e') ) {
                                    int LA12_168 = input.LA(8);

                                    if ( (LA12_168=='d') ) {
                                        int LA12_180 = input.LA(9);

                                        if ( ((LA12_180>='0' && LA12_180<='9')||(LA12_180>='A' && LA12_180<='Z')||LA12_180=='_'||(LA12_180>='a' && LA12_180<='z')) ) {
                                            alt12=42;
                                        }
                                        else {
                                            alt12=13;}
                                    }
                                    else {
                                        alt12=42;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='i') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='n') ) {
                switch ( input.LA(3) ) {
                case 'p':
                    {
                    int LA12_89 = input.LA(4);

                    if ( (LA12_89=='u') ) {
                        int LA12_113 = input.LA(5);

                        if ( (LA12_113=='t') ) {
                            switch ( input.LA(6) ) {
                            case 'o':
                                {
                                int LA12_153 = input.LA(7);

                                if ( (LA12_153=='u') ) {
                                    int LA12_169 = input.LA(8);

                                    if ( (LA12_169=='t') ) {
                                        int LA12_181 = input.LA(9);

                                        if ( (LA12_181=='p') ) {
                                            int LA12_189 = input.LA(10);

                                            if ( (LA12_189=='u') ) {
                                                int LA12_192 = input.LA(11);

                                                if ( (LA12_192=='t') ) {
                                                    int LA12_195 = input.LA(12);

                                                    if ( ((LA12_195>='0' && LA12_195<='9')||(LA12_195>='A' && LA12_195<='Z')||LA12_195=='_'||(LA12_195>='a' && LA12_195<='z')) ) {
                                                        alt12=42;
                                                    }
                                                    else {
                                                        alt12=39;}
                                                }
                                                else {
                                                    alt12=42;}
                                            }
                                            else {
                                                alt12=42;}
                                        }
                                        else {
                                            alt12=42;}
                                    }
                                    else {
                                        alt12=42;}
                                }
                                else {
                                    alt12=42;}
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
                                alt12=42;
                                }
                                break;
                            default:
                                alt12=40;}

                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                    }
                    break;
                case 'i':
                    {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='t') ) {
                        int LA12_114 = input.LA(5);

                        if ( ((LA12_114>='0' && LA12_114<='9')||(LA12_114>='A' && LA12_114<='Z')||LA12_114=='_'||(LA12_114>='a' && LA12_114<='z')) ) {
                            alt12=42;
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=42;}
                    }
                    break;
                case 't':
                    {
                    int LA12_91 = input.LA(4);

                    if ( (LA12_91=='e') ) {
                        int LA12_115 = input.LA(5);

                        if ( (LA12_115=='g') ) {
                            int LA12_137 = input.LA(6);

                            if ( (LA12_137=='e') ) {
                                int LA12_155 = input.LA(7);

                                if ( (LA12_155=='r') ) {
                                    int LA12_170 = input.LA(8);

                                    if ( ((LA12_170>='0' && LA12_170<='9')||(LA12_170>='A' && LA12_170<='Z')||LA12_170=='_'||(LA12_170>='a' && LA12_170<='z')) ) {
                                        alt12=42;
                                    }
                                    else {
                                        alt12=14;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                    }
                    break;
                default:
                    alt12=42;}

            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='o') ) {
                    int LA12_92 = input.LA(4);

                    if ( (LA12_92=='a') ) {
                        int LA12_116 = input.LA(5);

                        if ( (LA12_116=='t') ) {
                            int LA12_138 = input.LA(6);

                            if ( ((LA12_138>='0' && LA12_138<='9')||(LA12_138>='A' && LA12_138<='Z')||LA12_138=='_'||(LA12_138>='a' && LA12_138<='z')) ) {
                                alt12=42;
                            }
                            else {
                                alt12=15;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
                }
                break;
            case 'i':
                {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='n') ) {
                    int LA12_93 = input.LA(4);

                    if ( (LA12_93=='a') ) {
                        int LA12_117 = input.LA(5);

                        if ( (LA12_117=='l') ) {
                            int LA12_139 = input.LA(6);

                            if ( ((LA12_139>='0' && LA12_139<='9')||(LA12_139>='A' && LA12_139<='Z')||LA12_139=='_'||(LA12_139>='a' && LA12_139<='z')) ) {
                                alt12=42;
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
                }
                break;
            default:
                alt12=42;}

        }
        else if ( (LA12_0=='-') ) {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='-') ) {
                alt12=17;
            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0=='o') ) {
            switch ( input.LA(2) ) {
            case '-':
                {
                alt12=18;
                }
                break;
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA12_94 = input.LA(4);

                    if ( (LA12_94=='n') ) {
                        int LA12_118 = input.LA(5);

                        if ( (LA12_118=='n') ) {
                            int LA12_140 = input.LA(6);

                            if ( (LA12_140=='e') ) {
                                int LA12_158 = input.LA(7);

                                if ( (LA12_158=='r') ) {
                                    int LA12_171 = input.LA(8);

                                    if ( ((LA12_171>='0' && LA12_171<='9')||(LA12_171>='A' && LA12_171<='Z')||LA12_171=='_'||(LA12_171>='a' && LA12_171<='z')) ) {
                                        alt12=42;
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                    }
                    break;
                case 'e':
                    {
                    switch ( input.LA(4) ) {
                    case 'n':
                        {
                        int LA12_119 = input.LA(5);

                        if ( (LA12_119=='t') ) {
                            int LA12_141 = input.LA(6);

                            if ( (LA12_141=='r') ) {
                                int LA12_159 = input.LA(7);

                                if ( (LA12_159=='y') ) {
                                    int LA12_172 = input.LA(8);

                                    if ( ((LA12_172>='0' && LA12_172<='9')||(LA12_172>='A' && LA12_172<='Z')||LA12_172=='_'||(LA12_172>='a' && LA12_172<='z')) ) {
                                        alt12=42;
                                    }
                                    else {
                                        alt12=23;}
                                }
                                else {
                                    alt12=42;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                        }
                        break;
                    case 'x':
                        {
                        int LA12_120 = input.LA(5);

                        if ( (LA12_120=='i') ) {
                            int LA12_142 = input.LA(6);

                            if ( (LA12_142=='t') ) {
                                int LA12_160 = input.LA(7);

                                if ( ((LA12_160>='0' && LA12_160<='9')||(LA12_160>='A' && LA12_160<='Z')||LA12_160=='_'||(LA12_160>='a' && LA12_160<='z')) ) {
                                    alt12=42;
                                }
                                else {
                                    alt12=25;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                        }
                        break;
                    default:
                        alt12=42;}

                    }
                    break;
                default:
                    alt12=42;}

                }
                break;
            case 'u':
                {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='t') ) {
                    int LA12_96 = input.LA(4);

                    if ( (LA12_96=='p') ) {
                        int LA12_121 = input.LA(5);

                        if ( (LA12_121=='u') ) {
                            int LA12_143 = input.LA(6);

                            if ( (LA12_143=='t') ) {
                                int LA12_161 = input.LA(7);

                                if ( ((LA12_161>='0' && LA12_161<='9')||(LA12_161>='A' && LA12_161<='Z')||LA12_161=='_'||(LA12_161>='a' && LA12_161<='z')) ) {
                                    alt12=42;
                                }
                                else {
                                    alt12=41;}
                            }
                            else {
                                alt12=42;}
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
                }
                break;
            default:
                alt12=42;}

        }
        else if ( (LA12_0=='>') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='-') ) {
                alt12=19;
            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=21;
        }
        else if ( (LA12_0=='}') ) {
            alt12=22;
        }
        else if ( (LA12_0=='|') ) {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='|') ) {
                alt12=27;
            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0=='@') ) {
            alt12=28;
        }
        else if ( (LA12_0==';') ) {
            alt12=29;
        }
        else if ( (LA12_0=='w') ) {
            int LA12_24 = input.LA(2);

            if ( (LA12_24=='i') ) {
                int LA12_65 = input.LA(3);

                if ( (LA12_65=='t') ) {
                    int LA12_97 = input.LA(4);

                    if ( (LA12_97=='h') ) {
                        int LA12_122 = input.LA(5);

                        if ( ((LA12_122>='0' && LA12_122<='9')||(LA12_122>='A' && LA12_122<='Z')||LA12_122=='_'||(LA12_122>='a' && LA12_122<='z')) ) {
                            alt12=42;
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=42;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='v') ) {
            int LA12_25 = input.LA(2);

            if ( (LA12_25=='a') ) {
                int LA12_66 = input.LA(3);

                if ( (LA12_66=='r') ) {
                    int LA12_98 = input.LA(4);

                    if ( ((LA12_98>='0' && LA12_98<='9')||(LA12_98>='A' && LA12_98<='Z')||LA12_98=='_'||(LA12_98>='a' && LA12_98<='z')) ) {
                        alt12=42;
                    }
                    else {
                        alt12=31;}
                }
                else {
                    alt12=42;}
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0==':') ) {
            switch ( input.LA(2) ) {
            case ' ':
                {
                int LA12_67 = input.LA(3);

                if ( (LA12_67=='c') ) {
                    alt12=34;
                }
                else {
                    alt12=32;}
                }
                break;
            case '=':
                {
                alt12=33;
                }
                break;
            default:
                alt12=48;}

        }
        else if ( (LA12_0=='#') ) {
            alt12=37;
        }
        else if ( (LA12_0==' ') ) {
            int LA12_28 = input.LA(2);

            if ( (LA12_28=='h') ) {
                alt12=38;
            }
            else {
                alt12=47;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_29 = input.LA(2);

            if ( ((LA12_29>='A' && LA12_29<='Z')||LA12_29=='_'||(LA12_29>='a' && LA12_29<='z')) ) {
                alt12=42;
            }
            else {
                alt12=48;}
        }
        else if ( ((LA12_0>='B' && LA12_0<='M')||(LA12_0>='Q' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||(LA12_0>='d' && LA12_0<='e')||LA12_0=='g'||(LA12_0>='j' && LA12_0<='n')||(LA12_0>='p' && LA12_0<='q')||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12=42;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=43;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_32 = input.LA(2);

            if ( ((LA12_32>='\u0000' && LA12_32<='\uFFFE')) ) {
                alt12=44;
            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_33 = input.LA(2);

            if ( ((LA12_33>='\u0000' && LA12_33<='\uFFFE')) ) {
                alt12=44;
            }
            else {
                alt12=48;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=45;
                }
                break;
            case '/':
                {
                alt12=46;
                }
                break;
            default:
                alt12=48;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r') ) {
            alt12=47;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=')')||LA12_0==','||LA12_0=='.'||(LA12_0>='<' && LA12_0<='=')||LA12_0=='?'||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=48;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:174: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 43 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:182: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 44 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:191: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:203: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:219: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:235: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 48 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits_textonly.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalKits_textonly.g:1:243: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}