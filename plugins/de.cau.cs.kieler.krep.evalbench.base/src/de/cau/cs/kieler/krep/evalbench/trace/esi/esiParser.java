/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
// $ANTLR 3.1.1 esi.g 2009-01-15 16:13:46

package de.cau.cs.kieler.krep.evalbench.trace.esi;

import java.util.LinkedList;
import java.util.HashMap;
import java.io.Reader;

import org.antlr.runtime.*;

import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.program.krep.*;
import de.cau.cs.kieler.krep.evalbench.trace.*;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class esiParser extends Parser {
    public static final String[] tokenNames = new String[] { "<invalid>",
            "<EOR>", "<DOWN>", "<UP>", "ID", "NUMBER", "Letter", "Digit",
            "WHITESPACE", "COMMENT", "'!'", "'reset'", "';'", "'%'",
            "'Output'", "':'", "'('", "')'" };
    public static final int T__16 = 16;
    public static final int T__15 = 15;
    public static final int T__17 = 17;
    public static final int T__12 = 12;
    public static final int T__11 = 11;
    public static final int T__14 = 14;
    public static final int T__13 = 13;
    public static final int T__10 = 10;
    public static final int NUMBER = 5;
    public static final int WHITESPACE = 8;
    public static final int COMMENT = 9;
    public static final int Digit = 7;
    public static final int ID = 4;
    public static final int EOF = -1;
    public static final int Letter = 6;

    // delegates
    // delegators

    public esiParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }

    public esiParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);

    }

    public String[] getTokenNames() {
        return esiParser.tokenNames;
    }

    public String getGrammarFileName() {
        return "esi.g";
    }

    LinkedList<Trace> traces = null;
    Trace currentTrace = null;
    Tick currentTick = null;

    public static LinkedList<Trace> parse(IAssembler asm, final Reader source) {
        try {
            final esiLexer lex = new esiLexer(new ANTLRReaderStream(source));
            final CommonTokenStream tokens = new CommonTokenStream(lex);
            return new esiParser(tokens).parse(asm);
        } catch (final Exception e) {
            return null;
        }
    }

    private String errorMsg = new String();
    private boolean error = false;

    private HashMap<String, Integer> index;

    public void emitErrorMessage(String msg) {
        errorMsg += msg + "\n";
        error = true;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    // $ANTLR start "parse"
    // esi.g:49:1: parse[IAssembler asm] returns [LinkedList<Trace> traces] : l=
    // tracelist ;
    public final LinkedList<Trace> parse(IAssembler asm)
            throws RecognitionException {
        LinkedList<Trace> traces = null;

        LinkedList<Trace> l = null;

        try {
            // esi.g:49:57: (l= tracelist )
            // esi.g:50:3: l= tracelist
            {
                this.index = asm.getSignalIndex();
                pushFollow(FOLLOW_tracelist_in_parse45);
                l = tracelist();

                state._fsp--;

                traces = l;

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return traces;
    }

    // $ANTLR end "parse"

    // $ANTLR start "tracelist"
    // esi.g:55:1: tracelist returns [LinkedList<Trace> traces] : (t= trace | (
    // ( '!' 'reset' ';' t= trace )+ ) ) ;
    public final LinkedList<Trace> tracelist() throws RecognitionException {
        LinkedList<Trace> traces = null;

        Trace t = null;

        try {
            // esi.g:55:46: ( (t= trace | ( ( '!' 'reset' ';' t= trace )+ ) ) )
            // esi.g:56:3: (t= trace | ( ( '!' 'reset' ';' t= trace )+ ) )
            {
                LinkedList<Trace> ts = new LinkedList<Trace>();
                // esi.g:57:3: (t= trace | ( ( '!' 'reset' ';' t= trace )+ ) )
                int alt2 = 2;
                int LA2_0 = input.LA(1);

                if ((LA2_0 == EOF || LA2_0 == ID || (LA2_0 >= 12 && LA2_0 <= 13))) {
                    alt2 = 1;
                } else if ((LA2_0 == 10)) {
                    alt2 = 2;
                } else {
                    NoViableAltException nvae = new NoViableAltException("", 2,
                            0, input);

                    throw nvae;
                }
                switch (alt2) {
                case 1:
                    // esi.g:58:4: t= trace
                {
                    pushFollow(FOLLOW_trace_in_tracelist80);
                    t = trace();

                    state._fsp--;

                    ts.add(t);

                }
                    break;
                case 2:
                    // esi.g:59:6: ( ( '!' 'reset' ';' t= trace )+ )
                {
                    // esi.g:59:6: ( ( '!' 'reset' ';' t= trace )+ )
                    // esi.g:59:7: ( '!' 'reset' ';' t= trace )+
                    {
                        // esi.g:59:7: ( '!' 'reset' ';' t= trace )+
                        int cnt1 = 0;
                        loop1: do {
                            int alt1 = 2;
                            int LA1_0 = input.LA(1);

                            if ((LA1_0 == 10)) {
                                alt1 = 1;
                            }

                            switch (alt1) {
                            case 1:
                                // esi.g:59:8: '!' 'reset' ';' t= trace
                            {
                                match(input, 10, FOLLOW_10_in_tracelist92);
                                match(input, 11, FOLLOW_11_in_tracelist94);
                                match(input, 12, FOLLOW_12_in_tracelist96);
                                pushFollow(FOLLOW_trace_in_tracelist100);
                                t = trace();

                                state._fsp--;

                                ts.add(t);

                            }
                                break;

                            default:
                                if (cnt1 >= 1)
                                    break loop1;
                                EarlyExitException eee = new EarlyExitException(
                                        1, input);
                                throw eee;
                            }
                            cnt1++;
                        } while (true);

                    }

                }
                    break;

                }

                traces = ts;

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return traces;
    }

    // $ANTLR end "tracelist"

    // $ANTLR start "trace"
    // esi.g:65:1: trace returns [Trace trace] : ( (t= tick )* ) ;
    public final Trace trace() throws RecognitionException {
        Trace trace = null;

        Tick t = null;

        try {
            // esi.g:65:28: ( ( (t= tick )* ) )
            // esi.g:66:4: ( (t= tick )* )
            {
                LinkedList<Tick> ts = new LinkedList<Tick>();
                // esi.g:67:4: ( (t= tick )* )
                // esi.g:67:5: (t= tick )*
                {
                    // esi.g:67:5: (t= tick )*
                    loop3: do {
                        int alt3 = 2;
                        int LA3_0 = input.LA(1);

                        if ((LA3_0 == ID || (LA3_0 >= 12 && LA3_0 <= 13))) {
                            alt3 = 1;
                        }

                        switch (alt3) {
                        case 1:
                            // esi.g:67:6: t= tick
                        {
                            pushFollow(FOLLOW_tick_in_trace144);
                            t = tick();

                            state._fsp--;

                            ts.add(t);

                        }
                            break;

                        default:
                            break loop3;
                        }
                    } while (true);

                }

                trace = new Trace(ts);

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return trace;
    }

    // $ANTLR end "trace"

    // $ANTLR start "tick"
    // esi.g:72:1: tick returns [Tick t] : inputs= signals ( '%' 'Output' ':'
    // outputs= signals )? ';' ;
    public final Tick tick() throws RecognitionException {
        Tick t = null;

        LinkedList<Signal> inputs = null;

        LinkedList<Signal> outputs = null;

        try {
            // esi.g:72:22: (inputs= signals ( '%' 'Output' ':' outputs= signals
            // )? ';' )
            // esi.g:73:5: inputs= signals ( '%' 'Output' ':' outputs= signals
            // )? ';'
            {
                pushFollow(FOLLOW_signals_in_tick178);
                inputs = signals();

                state._fsp--;

                // esi.g:73:20: ( '%' 'Output' ':' outputs= signals )?
                int alt4 = 2;
                int LA4_0 = input.LA(1);

                if ((LA4_0 == 13)) {
                    alt4 = 1;
                }
                switch (alt4) {
                case 1:
                    // esi.g:73:21: '%' 'Output' ':' outputs= signals
                {
                    match(input, 13, FOLLOW_13_in_tick181);
                    match(input, 14, FOLLOW_14_in_tick183);
                    match(input, 15, FOLLOW_15_in_tick185);
                    pushFollow(FOLLOW_signals_in_tick189);
                    outputs = signals();

                    state._fsp--;

                }
                    break;

                }

                match(input, 12, FOLLOW_12_in_tick193);
                t = new Tick(inputs, outputs);

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return t;
    }

    // $ANTLR end "tick"

    // $ANTLR start "signals"
    // esi.g:76:1: signals returns [LinkedList<Signal> sigs] : ( (s= signal )* )
    // ;
    public final LinkedList<Signal> signals() throws RecognitionException {
        LinkedList<Signal> sigs = null;

        Signal s = null;

        try {
            // esi.g:76:42: ( ( (s= signal )* ) )
            // esi.g:77:4: ( (s= signal )* )
            {
                LinkedList<Signal> ss = new LinkedList<Signal>();
                // esi.g:78:4: ( (s= signal )* )
                // esi.g:78:5: (s= signal )*
                {
                    // esi.g:78:5: (s= signal )*
                    loop5: do {
                        int alt5 = 2;
                        int LA5_0 = input.LA(1);

                        if ((LA5_0 == ID)) {
                            alt5 = 1;
                        }

                        switch (alt5) {
                        case 1:
                            // esi.g:78:6: s= signal
                        {
                            pushFollow(FOLLOW_signal_in_signals223);
                            s = signal();

                            state._fsp--;

                            ss.add(s);

                        }
                            break;

                        default:
                            break loop5;
                        }
                    } while (true);

                }

                sigs = ss;

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return sigs;
    }

    // $ANTLR end "signals"

    // $ANTLR start "signal"
    // esi.g:82:1: signal returns [Signal s] : (i= ID | i= ID '(' v= num ')' );
    public final Signal signal() throws RecognitionException {
        Signal s = null;

        Token i = null;
        Integer v = null;

        try {
            // esi.g:82:26: (i= ID | i= ID '(' v= num ')' )
            int alt6 = 2;
            int LA6_0 = input.LA(1);

            if ((LA6_0 == ID)) {
                int LA6_1 = input.LA(2);

                if ((LA6_1 == 16)) {
                    alt6 = 2;
                } else if ((LA6_1 == ID || (LA6_1 >= 12 && LA6_1 <= 13))) {
                    alt6 = 1;
                } else {
                    NoViableAltException nvae = new NoViableAltException("", 6,
                            1, input);

                    throw nvae;
                }
            } else {
                NoViableAltException nvae = new NoViableAltException("", 6, 0,
                        input);

                throw nvae;
            }
            switch (alt6) {
            case 1:
                // esi.g:83:6: i= ID
            {
                i = (Token) match(input, ID, FOLLOW_ID_in_signal256);
                s = new Signal((i != null ? i.getText() : null), true, null,
                        index);

            }
                break;
            case 2:
                // esi.g:84:6: i= ID '(' v= num ')'
            {
                i = (Token) match(input, ID, FOLLOW_ID_in_signal281);
                match(input, 16, FOLLOW_16_in_signal283);
                pushFollow(FOLLOW_num_in_signal287);
                v = num();

                state._fsp--;

                match(input, 17, FOLLOW_17_in_signal289);
                s = new Signal((i != null ? i.getText() : null), true, v, index);

            }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return s;
    }

    // $ANTLR end "signal"

    // $ANTLR start "num"
    // esi.g:87:2: num returns [Integer v] : n= NUMBER ;
    public final Integer num() throws RecognitionException {
        Integer v = null;

        Token n = null;

        try {
            // esi.g:88:7: (n= NUMBER )
            // esi.g:88:9: n= NUMBER
            {
                n = (Token) match(input, NUMBER, FOLLOW_NUMBER_in_num325);
                v = Integer.parseInt((n != null ? n.getText() : null));

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return v;
    }

    // $ANTLR end "num"

    // Delegated rules

    public static final BitSet FOLLOW_tracelist_in_parse45 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_trace_in_tracelist80 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_10_in_tracelist92 = new BitSet(
            new long[] { 0x0000000000000800L });
    public static final BitSet FOLLOW_11_in_tracelist94 = new BitSet(
            new long[] { 0x0000000000001000L });
    public static final BitSet FOLLOW_12_in_tracelist96 = new BitSet(
            new long[] { 0x0000000000003410L });
    public static final BitSet FOLLOW_trace_in_tracelist100 = new BitSet(
            new long[] { 0x0000000000000402L });
    public static final BitSet FOLLOW_tick_in_trace144 = new BitSet(
            new long[] { 0x0000000000003012L });
    public static final BitSet FOLLOW_signals_in_tick178 = new BitSet(
            new long[] { 0x0000000000003000L });
    public static final BitSet FOLLOW_13_in_tick181 = new BitSet(
            new long[] { 0x0000000000004000L });
    public static final BitSet FOLLOW_14_in_tick183 = new BitSet(
            new long[] { 0x0000000000008000L });
    public static final BitSet FOLLOW_15_in_tick185 = new BitSet(
            new long[] { 0x0000000000001010L });
    public static final BitSet FOLLOW_signals_in_tick189 = new BitSet(
            new long[] { 0x0000000000001000L });
    public static final BitSet FOLLOW_12_in_tick193 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_signal_in_signals223 = new BitSet(
            new long[] { 0x0000000000000012L });
    public static final BitSet FOLLOW_ID_in_signal256 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_ID_in_signal281 = new BitSet(
            new long[] { 0x0000000000010000L });
    public static final BitSet FOLLOW_16_in_signal283 = new BitSet(
            new long[] { 0x0000000000000020L });
    public static final BitSet FOLLOW_num_in_signal287 = new BitSet(
            new long[] { 0x0000000000020000L });
    public static final BitSet FOLLOW_17_in_signal289 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_NUMBER_in_num325 = new BitSet(
            new long[] { 0x0000000000000002L });

}
