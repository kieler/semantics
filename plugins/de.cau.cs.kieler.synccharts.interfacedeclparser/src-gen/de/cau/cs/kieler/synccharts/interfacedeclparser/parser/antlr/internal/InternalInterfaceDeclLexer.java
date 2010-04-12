package de.cau.cs.kieler.synccharts.interfacedeclparser.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalInterfaceDeclLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=39;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_STRING_D=5;
    public static final int RULE_STRING_S=6;
    public static final int RULE_STRING=8;
    public static final int RULE_INT=7;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=11;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T36=36;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalInterfaceDeclLexer() {;} 
    public InternalInterfaceDeclLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:10:5: ( 'input' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:10:7: 'input'
            {
            match("input"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:11:5: ( 'output' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:11:7: 'output'
            {
            match("output"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:12:5: ( 'signal' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:12:7: 'signal'
            {
            match("signal"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:13:5: ( 'renaming' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:13:7: 'renaming'
            {
            match("renaming"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:14:5: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:14:7: ':'
            {
            match(':'); 

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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:15:5: ( 'var' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:15:7: 'var'
            {
            match("var"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:16:5: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:16:7: ','
            {
            match(','); 

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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:17:5: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:17:7: ';'
            {
            match(';'); 

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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:18:5: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:18:7: ':='
            {
            match(":="); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:19:5: ( 'combine' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:19:7: 'combine'
            {
            match("combine"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:20:5: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:20:7: 'with'
            {
            match("with"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:21:5: ( '/' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:21:7: '/'
            {
            match('/'); 

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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:22:5: ( 'PURE' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:22:7: 'PURE'
            {
            match("PURE"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:23:5: ( 'BOOL' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:23:7: 'BOOL'
            {
            match("BOOL"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:24:5: ( 'UNSIGNED' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:24:7: 'UNSIGNED'
            {
            match("UNSIGNED"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:25:5: ( 'INT' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:25:7: 'INT'
            {
            match("INT"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:26:5: ( 'FLOAT' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:26:7: 'FLOAT'
            {
            match("FLOAT"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:27:5: ( 'HOST' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:27:7: 'HOST'
            {
            match("HOST"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:28:5: ( 'NONE' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:28:7: 'NONE'
            {
            match("NONE"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:29:5: ( '+' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:29:7: '+'
            {
            match('+'); 

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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:30:5: ( '*' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:30:7: '*'
            {
            match('*'); 

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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:31:5: ( 'max' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:31:7: 'max'
            {
            match("max"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:32:5: ( 'min' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:32:7: 'min'
            {
            match("min"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:33:5: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:33:7: 'or'
            {
            match("or"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:34:5: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:34:7: 'and'
            {
            match("and"); 


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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:35:5: ( 'host' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:35:7: 'host'
            {
            match("host"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start RULE_STRING_D
    public final void mRULE_STRING_D() throws RecognitionException {
        try {
            int _type = RULE_STRING_D;
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2242:15: ( ( '\"' '\"' | '\"' ( '\\\\' '\"' | ~ ( '\"' ) )* ( '\\\\' '\"' | ~ ( ( '\\\\' | '\"' ) ) ) '\"' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2242:17: ( '\"' '\"' | '\"' ( '\\\\' '\"' | ~ ( '\"' ) )* ( '\\\\' '\"' | ~ ( ( '\\\\' | '\"' ) ) ) '\"' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2242:17: ( '\"' '\"' | '\"' ( '\\\\' '\"' | ~ ( '\"' ) )* ( '\\\\' '\"' | ~ ( ( '\\\\' | '\"' ) ) ) '\"' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\"') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='\"') ) {
                    alt3=1;
                }
                else if ( ((LA3_1>='\u0000' && LA3_1<='!')||(LA3_1>='#' && LA3_1<='\uFFFE')) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2242:17: ( '\"' '\"' | '\"' ( '\\\\' '\"' | ~ ( '\"' ) )* ( '\\\\' '\"' | ~ ( ( '\\\\' | '\"' ) ) ) '\"' )", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2242:17: ( '\"' '\"' | '\"' ( '\\\\' '\"' | ~ ( '\"' ) )* ( '\\\\' '\"' | ~ ( ( '\\\\' | '\"' ) ) ) '\"' )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2242:18: '\"' '\"'
                    {
                    match('\"'); 
                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2242:26: '\"' ( '\\\\' '\"' | ~ ( '\"' ) )* ( '\\\\' '\"' | ~ ( ( '\\\\' | '\"' ) ) ) '\"'
                    {
                    match('\"'); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2242:30: ( '\\\\' '\"' | ~ ( '\"' ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='\\') ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1=='\"') ) {
                                int LA1_3 = input.LA(3);

                                if ( ((LA1_3>='\u0000' && LA1_3<='!')||(LA1_3>='#' && LA1_3<='\uFFFE')) ) {
                                    alt1=1;
                                }


                            }
                            else if ( ((LA1_1>='\u0000' && LA1_1<='!')||(LA1_1>='#' && LA1_1<='\uFFFE')) ) {
                                alt1=2;
                            }


                        }
                        else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFE')) ) {
                            int LA1_2 = input.LA(2);

                            if ( ((LA1_2>='\u0000' && LA1_2<='!')||(LA1_2>='#' && LA1_2<='\uFFFE')) ) {
                                alt1=2;
                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2242:31: '\\\\' '\"'
                    	    {
                    	    match('\\'); 
                    	    match('\"'); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2242:40: ~ ( '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFE') ) {
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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2242:49: ( '\\\\' '\"' | ~ ( ( '\\\\' | '\"' ) ) )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\\') ) {
                        alt2=1;
                    }
                    else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFE')) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2242:49: ( '\\\\' '\"' | ~ ( ( '\\\\' | '\"' ) ) )", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2242:50: '\\\\' '\"'
                            {
                            match('\\'); 
                            match('\"'); 

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2242:59: ~ ( ( '\\\\' | '\"' ) )
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

                    }

                    match('\"'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING_D

    // $ANTLR start RULE_STRING_S
    public final void mRULE_STRING_S() throws RecognitionException {
        try {
            int _type = RULE_STRING_S;
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2244:15: ( ( '\\'' '\\'' | '\\'' ( '\\\\' '\\'' | ~ ( '\\'' ) )* ( '\\\\' '\\'' | ~ ( ( '\\\\' | '\\'' ) ) ) '\\'' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2244:17: ( '\\'' '\\'' | '\\'' ( '\\\\' '\\'' | ~ ( '\\'' ) )* ( '\\\\' '\\'' | ~ ( ( '\\\\' | '\\'' ) ) ) '\\'' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2244:17: ( '\\'' '\\'' | '\\'' ( '\\\\' '\\'' | ~ ( '\\'' ) )* ( '\\\\' '\\'' | ~ ( ( '\\\\' | '\\'' ) ) ) '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\'') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='\'') ) {
                    alt6=1;
                }
                else if ( ((LA6_1>='\u0000' && LA6_1<='&')||(LA6_1>='(' && LA6_1<='\uFFFE')) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2244:17: ( '\\'' '\\'' | '\\'' ( '\\\\' '\\'' | ~ ( '\\'' ) )* ( '\\\\' '\\'' | ~ ( ( '\\\\' | '\\'' ) ) ) '\\'' )", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2244:17: ( '\\'' '\\'' | '\\'' ( '\\\\' '\\'' | ~ ( '\\'' ) )* ( '\\\\' '\\'' | ~ ( ( '\\\\' | '\\'' ) ) ) '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2244:18: '\\'' '\\''
                    {
                    match('\''); 
                    match('\''); 

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2244:28: '\\'' ( '\\\\' '\\'' | ~ ( '\\'' ) )* ( '\\\\' '\\'' | ~ ( ( '\\\\' | '\\'' ) ) ) '\\''
                    {
                    match('\''); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2244:33: ( '\\\\' '\\'' | ~ ( '\\'' ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1=='\'') ) {
                                int LA4_3 = input.LA(3);

                                if ( ((LA4_3>='\u0000' && LA4_3<='&')||(LA4_3>='(' && LA4_3<='\uFFFE')) ) {
                                    alt4=1;
                                }


                            }
                            else if ( ((LA4_1>='\u0000' && LA4_1<='&')||(LA4_1>='(' && LA4_1<='\uFFFE')) ) {
                                alt4=2;
                            }


                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            int LA4_2 = input.LA(2);

                            if ( ((LA4_2>='\u0000' && LA4_2<='&')||(LA4_2>='(' && LA4_2<='\uFFFE')) ) {
                                alt4=2;
                            }


                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2244:34: '\\\\' '\\''
                    	    {
                    	    match('\\'); 
                    	    match('\''); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2244:44: ~ ( '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFE') ) {
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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2244:54: ( '\\\\' '\\'' | ~ ( ( '\\\\' | '\\'' ) ) )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\\') ) {
                        alt5=1;
                    }
                    else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2244:54: ( '\\\\' '\\'' | ~ ( ( '\\\\' | '\\'' ) ) )", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2244:55: '\\\\' '\\''
                            {
                            match('\\'); 
                            match('\''); 

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2244:65: ~ ( ( '\\\\' | '\\'' ) )
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

                    }

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
    // $ANTLR end RULE_STRING_S

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2246:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2246:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2246:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2246:11: '^'
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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2246:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:
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
            	    break loop8;
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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2248:10: ( ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2248:12: ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2248:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2248:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2250:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2250:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2250:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2250:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2250:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2250:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFE')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2250:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2250:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2250:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2250:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFE')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2250:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2250:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2252:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2252:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2252:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFE')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFE')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2252:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2254:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2254:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2254:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFE')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2254:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2254:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2254:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2254:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2254:41: '\\r'
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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2256:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2256:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2256:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2258:16: ( . )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:2258:18: .
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
        // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | RULE_STRING_D | RULE_STRING_S | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=35;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:38: T20
                {
                mT20(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:42: T21
                {
                mT21(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:46: T22
                {
                mT22(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:50: T23
                {
                mT23(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:54: T24
                {
                mT24(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:58: T25
                {
                mT25(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:62: T26
                {
                mT26(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:66: T27
                {
                mT27(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:70: T28
                {
                mT28(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:74: T29
                {
                mT29(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:78: T30
                {
                mT30(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:82: T31
                {
                mT31(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:86: T32
                {
                mT32(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:90: T33
                {
                mT33(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:94: T34
                {
                mT34(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:98: T35
                {
                mT35(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:102: T36
                {
                mT36(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:106: T37
                {
                mT37(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:110: T38
                {
                mT38(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:114: RULE_STRING_D
                {
                mRULE_STRING_D(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:128: RULE_STRING_S
                {
                mRULE_STRING_S(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:142: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:150: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:159: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:171: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:187: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:203: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1:211: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\4\40\1\46\1\40\2\uffff\2\40\1\56\7\40\2\uffff\3\40\3\36"+
        "\4\uffff\1\40\1\uffff\1\105\3\40\2\uffff\1\40\2\uffff\2\40\3\uffff"+
        "\7\40\2\uffff\4\40\10\uffff\1\40\1\uffff\3\40\1\145\5\40\1\153\3"+
        "\40\1\157\1\160\1\161\1\40\12\uffff\4\40\1\uffff\1\40\1\172\1\173"+
        "\1\174\1\40\1\uffff\1\40\1\177\1\u0080\3\uffff\1\u0081\2\u0082\1"+
        "\u0083\4\40\3\uffff\1\40\1\u0089\5\uffff\1\u008a\1\u008b\3\40\3"+
        "\uffff\1\40\1\u0090\1\40\1\u0092\1\uffff\1\u0093\2\uffff";
    static final String DFA18_eofS =
        "\u0094\uffff";
    static final String DFA18_minS =
        "\1\0\1\156\1\162\1\151\1\145\1\75\1\141\2\uffff\1\157\1\151\1\52"+
        "\1\125\1\117\2\116\1\114\2\117\2\uffff\1\141\1\156\1\157\2\0\1\101"+
        "\4\uffff\1\160\1\uffff\1\60\1\164\1\147\1\156\2\uffff\1\162\2\uffff"+
        "\1\155\1\164\3\uffff\1\122\1\117\1\123\1\124\1\117\1\123\1\116\2"+
        "\uffff\1\156\1\170\1\144\1\163\1\uffff\2\0\1\uffff\2\0\2\uffff\1"+
        "\165\1\uffff\1\160\1\156\1\141\1\60\1\142\1\150\1\105\1\114\1\111"+
        "\1\60\1\101\1\124\1\105\3\60\1\164\1\uffff\3\0\2\uffff\3\0\1\uffff"+
        "\1\164\1\165\1\141\1\155\1\uffff\1\151\3\60\1\107\1\uffff\1\124"+
        "\2\60\3\uffff\1\60\2\0\1\60\1\164\1\154\1\151\1\156\3\uffff\1\116"+
        "\1\60\5\uffff\2\60\1\156\1\145\1\105\3\uffff\1\147\1\60\1\104\1"+
        "\60\1\uffff\1\60\2\uffff";
    static final String DFA18_maxS =
        "\1\ufffe\1\156\1\165\1\151\1\145\1\75\1\141\2\uffff\1\157\1\151"+
        "\1\57\1\125\1\117\2\116\1\114\2\117\2\uffff\1\151\1\156\1\157\2"+
        "\ufffe\1\172\4\uffff\1\160\1\uffff\1\172\1\164\1\147\1\156\2\uffff"+
        "\1\162\2\uffff\1\155\1\164\3\uffff\1\122\1\117\1\123\1\124\1\117"+
        "\1\123\1\116\2\uffff\1\156\1\170\1\144\1\163\1\uffff\2\ufffe\1\uffff"+
        "\2\ufffe\2\uffff\1\165\1\uffff\1\160\1\156\1\141\1\172\1\142\1\150"+
        "\1\105\1\114\1\111\1\172\1\101\1\124\1\105\3\172\1\164\1\uffff\3"+
        "\ufffe\2\uffff\3\ufffe\1\uffff\1\164\1\165\1\141\1\155\1\uffff\1"+
        "\151\3\172\1\107\1\uffff\1\124\2\172\3\uffff\1\172\2\ufffe\1\172"+
        "\1\164\1\154\1\151\1\156\3\uffff\1\116\1\172\5\uffff\2\172\1\156"+
        "\1\145\1\105\3\uffff\1\147\1\172\1\104\1\172\1\uffff\1\172\2\uffff";
    static final String DFA18_acceptS =
        "\7\uffff\1\7\1\10\12\uffff\1\24\1\25\6\uffff\1\35\1\36\1\42\1\43"+
        "\1\uffff\1\35\4\uffff\1\11\1\5\1\uffff\1\7\1\10\2\uffff\1\41\1\40"+
        "\1\14\7\uffff\1\24\1\25\4\uffff\1\33\2\uffff\1\34\2\uffff\1\36\1"+
        "\42\1\uffff\1\30\21\uffff\1\33\3\uffff\1\33\1\34\3\uffff\1\34\4"+
        "\uffff\1\6\5\uffff\1\20\3\uffff\1\27\1\26\1\31\10\uffff\1\13\1\15"+
        "\1\16\2\uffff\1\22\1\23\1\32\1\37\1\1\5\uffff\1\21\1\2\1\3\4\uffff"+
        "\1\12\1\uffff\1\4\1\17";
    static final String DFA18_specialS =
        "\u0094\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\30\4\36\1\31\2\36\1"+
            "\24\1\23\1\7\2\36\1\13\12\34\1\5\1\10\5\36\1\33\1\15\3\33\1"+
            "\20\1\33\1\21\1\17\4\33\1\22\1\33\1\14\4\33\1\16\5\33\3\36\1"+
            "\32\1\33\1\36\1\26\1\33\1\11\4\33\1\27\1\1\3\33\1\25\1\33\1"+
            "\2\2\33\1\4\1\3\2\33\1\6\1\12\3\33\uff84\36",
            "\1\37",
            "\1\41\2\uffff\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\47",
            "",
            "",
            "\1\52",
            "\1\53",
            "\1\55\4\uffff\1\54",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "",
            "\1\71\7\uffff\1\70",
            "\1\72",
            "\1\73",
            "\42\76\1\74\71\76\1\75\uffa2\76",
            "\47\101\1\77\64\101\1\100\uffa2\101",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "",
            "\1\104",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "\1\111",
            "",
            "",
            "\1\112",
            "\1\113",
            "",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\42\127\1\130\4\127\1\132\64\127\1\131\5\127\1\132\3\127\1\132"+
            "\7\127\1\132\3\127\1\132\1\127\1\132\uff8a\127",
            "\42\76\1\133\71\76\1\75\uffa2\76",
            "",
            "\42\134\1\137\4\134\1\135\64\134\1\136\5\134\1\137\3\134\1\137"+
            "\7\134\1\137\3\134\1\137\1\134\1\137\uff8a\134",
            "\47\101\1\140\64\101\1\100\uffa2\101",
            "",
            "",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\162",
            "",
            "\42\76\1\133\71\76\1\75\uffa2\76",
            "\42\76\1\163\71\76\1\75\uffa2\76",
            "\42\76\1\133\71\76\1\75\uffa2\76",
            "",
            "",
            "\47\101\1\140\64\101\1\100\uffa2\101",
            "\47\101\1\164\64\101\1\100\uffa2\101",
            "\47\101\1\140\64\101\1\100\uffa2\101",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\175",
            "",
            "\1\176",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\uffff\127",
            "\uffff\134",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "",
            "",
            "\1\u0088",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "",
            "",
            "\1\u008f",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0091",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
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

    class DFA18 extends DFA {

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
            return "1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | RULE_STRING_D | RULE_STRING_S | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}