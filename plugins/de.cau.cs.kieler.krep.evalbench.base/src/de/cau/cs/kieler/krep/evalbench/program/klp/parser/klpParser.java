///*
// * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
// *
// * http://www.informatik.uni-kiel.de/rtsys/kieler/
// * 
// * Copyright 2009 by
// * + Christian-Albrechts-University of Kiel
// *   + Department of Computer Science
// *     + Real-Time and Embedded Systems Group
// * 
// * This code is provided under the terms of the Eclipse Public License (EPL).
// * See the file epl-v10.html for the license text.
// */
//// $ANTLR 3.1.1 klp.g 2009-08-19 09:11:45
//
//package de.cau.cs.kieler.krep.evalbench.program.klp.parser;
//
//import java.util.LinkedList;
//
//import org.antlr.runtime.*;
//
//import de.cau.cs.kieler.krep.evalbench.program.Instruction;
//import de.cau.cs.kieler.krep.evalbench.program.klp.*;
//
//import java.util.Stack;
//import java.util.List;
//import java.util.ArrayList;
//
//@SuppressWarnings("all")
//public class klpParser extends Parser {
//    public static final String[] tokenNames = new String[] { "<invalid>",
//            "<EOR>", "<DOWN>", "<UP>", "ID", "NUMBER", "Letter", "Digit",
//            "WHITESPACE", "COMMENT", "':'", "'SETCLK'", "'SETPC'", "'PRIO'",
//            "'DONE'", "'JMP'", "'INPUT'", "'OUTPUT'", "'LOCAL'", "'INITV'",
//            "'INITC'", "'ADD'", "'SUB'", "'MUL'", "'DIV'", "'AND'", "'OR'",
//            "'XOR'", "'LT'", "'LE'", "'EQ'", "'GE'", "'GT'", "'NEQ'", "'IADD'",
//            "'ISUB'", "'IMUL'", "'IDIV'", "'IAND'", "'IOR'", "'IXOR'", "'ILT'",
//            "'ILE'", "'IEQ'", "'IGE'", "'IGT'", "'INEQ'", "'JT'", "'JF'",
//            "'JZ'", "'JNZ'", "'CVMOV'", "'VCMOV'", "'VVMOV'", "'CCMOV'",
//            "'IVMOV'", "'ICMOV'", "'pre'", "'('", "')'" };
//    public static final int T__29 = 29;
//    public static final int T__28 = 28;
//    public static final int T__27 = 27;
//    public static final int T__26 = 26;
//    public static final int T__25 = 25;
//    public static final int T__24 = 24;
//    public static final int T__23 = 23;
//    public static final int T__22 = 22;
//    public static final int T__21 = 21;
//    public static final int T__20 = 20;
//    public static final int ID = 4;
//    public static final int EOF = -1;
//    public static final int T__55 = 55;
//    public static final int T__56 = 56;
//    public static final int T__19 = 19;
//    public static final int T__57 = 57;
//    public static final int T__58 = 58;
//    public static final int T__51 = 51;
//    public static final int T__16 = 16;
//    public static final int T__52 = 52;
//    public static final int T__15 = 15;
//    public static final int T__53 = 53;
//    public static final int T__18 = 18;
//    public static final int T__54 = 54;
//    public static final int T__17 = 17;
//    public static final int T__12 = 12;
//    public static final int T__11 = 11;
//    public static final int T__14 = 14;
//    public static final int T__13 = 13;
//    public static final int T__59 = 59;
//    public static final int T__10 = 10;
//    public static final int COMMENT = 9;
//    public static final int T__50 = 50;
//    public static final int T__42 = 42;
//    public static final int T__43 = 43;
//    public static final int T__40 = 40;
//    public static final int T__41 = 41;
//    public static final int T__46 = 46;
//    public static final int T__47 = 47;
//    public static final int T__44 = 44;
//    public static final int T__45 = 45;
//    public static final int T__48 = 48;
//    public static final int T__49 = 49;
//    public static final int NUMBER = 5;
//    public static final int WHITESPACE = 8;
//    public static final int Digit = 7;
//    public static final int T__30 = 30;
//    public static final int T__31 = 31;
//    public static final int T__32 = 32;
//    public static final int T__33 = 33;
//    public static final int T__34 = 34;
//    public static final int T__35 = 35;
//    public static final int T__36 = 36;
//    public static final int T__37 = 37;
//    public static final int T__38 = 38;
//    public static final int T__39 = 39;
//    public static final int Letter = 6;
//
//    // delegates
//    // delegators
//
//    public klpParser(TokenStream input) {
//        this(input, new RecognizerSharedState());
//    }
//
//    public klpParser(TokenStream input, RecognizerSharedState state) {
//        super(input, state);
//
//    }
//
//    public String[] getTokenNames() {
//        return klpParser.tokenNames;
//    }
//
//    public String getGrammarFileName() {
//        return "klp.g";
//    }
//
//    LinkedList<Instruction> instructions = new LinkedList<Instruction>();
//    LinkedList<String> labels = new LinkedList<String>();
//
//    private String errorMsg = new String();
//    private boolean error = false;
//
//    public void emitErrorMessage(String msg) {
//        errorMsg += msg + "\n";
//        error = true;
//    }
//
//    public String getErrorMsg() {
//        return errorMsg;
//    }
//
//    public boolean getError() {
//        return error;
//    }
//
//    // $ANTLR start "prog"
//    // klp.g:36:1: prog returns [LinkedList<Instruction> res] : ( (i= instr ) |
//    // (l= ID ':' ) )+ ;
//    public final LinkedList<Instruction> prog() throws RecognitionException {
//        LinkedList<Instruction> res = null;
//
//        Token l = null;
//        Instruction i = null;
//
//        try {
//            // klp.g:37:3: ( ( (i= instr ) | (l= ID ':' ) )+ )
//            // klp.g:37:4: ( (i= instr ) | (l= ID ':' ) )+
//            {
//                error = false;
//                // klp.g:38:4: ( (i= instr ) | (l= ID ':' ) )+
//                int cnt1 = 0;
//                loop1: do {
//                    int alt1 = 3;
//                    int LA1_0 = input.LA(1);
//
//                    if (((LA1_0 >= 11 && LA1_0 <= 18) || (LA1_0 >= 21 && LA1_0 <= 56))) {
//                        alt1 = 1;
//                    } else if ((LA1_0 == ID)) {
//                        alt1 = 2;
//                    }
//
//                    switch (alt1) {
//                    case 1:
//                        // klp.g:39:6: (i= instr )
//                    {
//                        // klp.g:39:6: (i= instr )
//                        // klp.g:39:7: i= instr
//                        {
//                            pushFollow(FOLLOW_instr_in_prog54);
//                            i = instr();
//
//                            state._fsp--;
//
//                            i.setLabels(labels);
//                            labels.clear();
//                            instructions.add(i);
//
//                        }
//
//                    }
//                        break;
//                    case 2:
//                        // klp.g:41:8: (l= ID ':' )
//                    {
//                        // klp.g:41:8: (l= ID ':' )
//                        // klp.g:41:9: l= ID ':'
//                        {
//                            l = (Token) match(input, ID, FOLLOW_ID_in_prog76);
//                            match(input, 10, FOLLOW_10_in_prog78);
//                            labels.add((l != null ? l.getText() : null));
//
//                        }
//
//                    }
//                        break;
//
//                    default:
//                        if (cnt1 >= 1)
//                            break loop1;
//                        EarlyExitException eee = new EarlyExitException(1,
//                                input);
//                        throw eee;
//                    }
//                    cnt1++;
//                } while (true);
//
//                res = instructions;
//
//            }
//
//        } catch (RecognitionException re) {
//            reportError(re);
//            recover(input, re);
//        } finally {
//        }
//        return res;
//    }
//
//    // $ANTLR end "prog"
//
//    // $ANTLR start "instr"
//    // klp.g:45:1: instr returns [Instruction instr] : (i= decl reg= ID |
//    // 'SETCLK' reg= ID clk= ID | 'SETPC' reg= ID l= ID | 'PRIO' (pc= ID )?
//    // prio= num | 'DONE' (pc= ID )? | op= binop to= ID r1= read r2= read | op=
//    // ibinop to= ID r= read v= num | 'JMP' to= ID | cond= cjump r= read to= ID
//    // | type= mov to= ID r= read | itype= imov to= ID val= num );
//    public final Instruction instr() throws RecognitionException {
//        Instruction instr = null;
//
//        Token reg = null;
//        Token clk = null;
//        Token l = null;
//        Token pc = null;
//        Token to = null;
//        Decl.Kind i = null;
//
//        Integer prio = null;
//
//        OP op = null;
//
//        Read r1 = null;
//
//        Read r2 = null;
//
//        Read r = null;
//
//        Integer v = null;
//
//        CJmp.Cond cond = null;
//
//        Mov.Type type = null;
//
//        IMov.Type itype = null;
//
//        Integer val = null;
//
//        try {
//            // klp.g:46:7: (i= decl reg= ID | 'SETCLK' reg= ID clk= ID | 'SETPC'
//            // reg= ID l= ID | 'PRIO' (pc= ID )? prio= num | 'DONE' (pc= ID )? |
//            // op= binop to= ID r1= read r2= read | op= ibinop to= ID r= read v=
//            // num | 'JMP' to= ID | cond= cjump r= read to= ID | type= mov to=
//            // ID r= read | itype= imov to= ID val= num )
//            int alt4 = 11;
//            switch (input.LA(1)) {
//            case 16:
//            case 17:
//            case 18: {
//                alt4 = 1;
//            }
//                break;
//            case 11: {
//                alt4 = 2;
//            }
//                break;
//            case 12: {
//                alt4 = 3;
//            }
//                break;
//            case 13: {
//                alt4 = 4;
//            }
//                break;
//            case 14: {
//                alt4 = 5;
//            }
//                break;
//            case 21:
//            case 22:
//            case 23:
//            case 24:
//            case 25:
//            case 26:
//            case 27:
//            case 28:
//            case 29:
//            case 30:
//            case 31:
//            case 32:
//            case 33: {
//                alt4 = 6;
//            }
//                break;
//            case 34:
//            case 35:
//            case 36:
//            case 37:
//            case 38:
//            case 39:
//            case 40:
//            case 41:
//            case 42:
//            case 43:
//            case 44:
//            case 45:
//            case 46: {
//                alt4 = 7;
//            }
//                break;
//            case 15: {
//                alt4 = 8;
//            }
//                break;
//            case 47:
//            case 48:
//            case 49:
//            case 50: {
//                alt4 = 9;
//            }
//                break;
//            case 51:
//            case 52:
//            case 53:
//            case 54: {
//                alt4 = 10;
//            }
//                break;
//            case 55:
//            case 56: {
//                alt4 = 11;
//            }
//                break;
//            default:
//                NoViableAltException nvae = new NoViableAltException("", 4, 0,
//                        input);
//
//                throw nvae;
//            }
//
//            switch (alt4) {
//            case 1:
//                // klp.g:46:9: i= decl reg= ID
//            {
//                pushFollow(FOLLOW_decl_in_instr114);
//                i = decl();
//
//                state._fsp--;
//
//                reg = (Token) match(input, ID, FOLLOW_ID_in_instr118);
//                instr = new Decl(i, (reg != null ? reg.getText() : null));
//
//            }
//                break;
//            case 2:
//                // klp.g:48:9: 'SETCLK' reg= ID clk= ID
//            {
//                match(input, 11, FOLLOW_11_in_instr139);
//                reg = (Token) match(input, ID, FOLLOW_ID_in_instr143);
//                clk = (Token) match(input, ID, FOLLOW_ID_in_instr147);
//                instr = new SetClk((reg != null ? reg.getText() : null),
//                        (clk != null ? clk.getText() : null));
//
//            }
//                break;
//            case 3:
//                // klp.g:50:9: 'SETPC' reg= ID l= ID
//            {
//                match(input, 12, FOLLOW_12_in_instr168);
//                reg = (Token) match(input, ID, FOLLOW_ID_in_instr172);
//                l = (Token) match(input, ID, FOLLOW_ID_in_instr176);
//                instr = new SetPC((reg != null ? reg.getText() : null),
//                        (l != null ? l.getText() : null));
//
//            }
//                break;
//            case 4:
//                // klp.g:52:9: 'PRIO' (pc= ID )? prio= num
//            {
//                match(input, 13, FOLLOW_13_in_instr205);
//                // klp.g:52:18: (pc= ID )?
//                int alt2 = 2;
//                int LA2_0 = input.LA(1);
//
//                if ((LA2_0 == ID)) {
//                    alt2 = 1;
//                }
//                switch (alt2) {
//                case 1:
//                    // klp.g:52:18: pc= ID
//                {
//                    pc = (Token) match(input, ID, FOLLOW_ID_in_instr209);
//
//                }
//                    break;
//
//                }
//
//                pushFollow(FOLLOW_num_in_instr214);
//                prio = num();
//
//                state._fsp--;
//
//                instr = new Prio((pc != null ? pc.getText() : null), prio);
//
//            }
//                break;
//            case 5:
//                // klp.g:54:9: 'DONE' (pc= ID )?
//            {
//                match(input, 14, FOLLOW_14_in_instr249);
//                // klp.g:54:18: (pc= ID )?
//                int alt3 = 2;
//                int LA3_0 = input.LA(1);
//
//                if ((LA3_0 == ID)) {
//                    int LA3_1 = input.LA(2);
//
//                    if ((LA3_1 == EOF || LA3_1 == ID
//                            || (LA3_1 >= 11 && LA3_1 <= 18) || (LA3_1 >= 21 && LA3_1 <= 56))) {
//                        alt3 = 1;
//                    }
//                }
//                switch (alt3) {
//                case 1:
//                    // klp.g:54:18: pc= ID
//                {
//                    pc = (Token) match(input, ID, FOLLOW_ID_in_instr253);
//
//                }
//                    break;
//
//                }
//
//                instr = new Done((pc != null ? pc.getText() : null));
//
//            }
//                break;
//            case 6:
//                // klp.g:56:9: op= binop to= ID r1= read r2= read
//            {
//                pushFollow(FOLLOW_binop_in_instr294);
//                op = binop();
//
//                state._fsp--;
//
//                to = (Token) match(input, ID, FOLLOW_ID_in_instr299);
//                pushFollow(FOLLOW_read_in_instr303);
//                r1 = read();
//
//                state._fsp--;
//
//                pushFollow(FOLLOW_read_in_instr307);
//                r2 = read();
//
//                state._fsp--;
//
//                instr = new BinOp((to != null ? to.getText() : null), r1, r2,
//                        op);
//
//            }
//                break;
//            case 7:
//                // klp.g:58:9: op= ibinop to= ID r= read v= num
//            {
//                pushFollow(FOLLOW_ibinop_in_instr332);
//                op = ibinop();
//
//                state._fsp--;
//
//                to = (Token) match(input, ID, FOLLOW_ID_in_instr336);
//                pushFollow(FOLLOW_read_in_instr340);
//                r = read();
//
//                state._fsp--;
//
//                pushFollow(FOLLOW_num_in_instr344);
//                v = num();
//
//                state._fsp--;
//
//                instr = new IBinOp((to != null ? to.getText() : null), r, v, op);
//
//            }
//                break;
//            case 8:
//                // klp.g:60:9: 'JMP' to= ID
//            {
//                match(input, 15, FOLLOW_15_in_instr370);
//                to = (Token) match(input, ID, FOLLOW_ID_in_instr374);
//                instr = new Jmp((to != null ? to.getText() : null));
//
//            }
//                break;
//            case 9:
//                // klp.g:62:9: cond= cjump r= read to= ID
//            {
//                pushFollow(FOLLOW_cjump_in_instr396);
//                cond = cjump();
//
//                state._fsp--;
//
//                pushFollow(FOLLOW_read_in_instr400);
//                r = read();
//
//                state._fsp--;
//
//                to = (Token) match(input, ID, FOLLOW_ID_in_instr404);
//                instr = new CJmp(cond, r, (to != null ? to.getText() : null));
//
//            }
//                break;
//            case 10:
//                // klp.g:64:9: type= mov to= ID r= read
//            {
//                pushFollow(FOLLOW_mov_in_instr426);
//                type = mov();
//
//                state._fsp--;
//
//                to = (Token) match(input, ID, FOLLOW_ID_in_instr431);
//                pushFollow(FOLLOW_read_in_instr435);
//                r = read();
//
//                state._fsp--;
//
//                instr = new Mov(type, (to != null ? to.getText() : null), r);
//
//            }
//                break;
//            case 11:
//                // klp.g:66:9: itype= imov to= ID val= num
//            {
//                pushFollow(FOLLOW_imov_in_instr457);
//                itype = imov();
//
//                state._fsp--;
//
//                to = (Token) match(input, ID, FOLLOW_ID_in_instr461);
//                pushFollow(FOLLOW_num_in_instr465);
//                val = num();
//
//                state._fsp--;
//
//                instr = new IMov(itype, (to != null ? to.getText() : null), val);
//
//            }
//                break;
//
//            }
//        } catch (RecognitionException re) {
//            reportError(re);
//            recover(input, re);
//        } finally {
//        }
//        return instr;
//    }
//
//    // $ANTLR end "instr"
//
//    // $ANTLR start "decl"
//    // klp.g:72:1: decl returns [Decl.Kind io] : ( 'INPUT' | 'OUTPUT' | 'LOCAL'
//    // );
//    public final Decl.Kind decl() throws RecognitionException {
//        Decl.Kind io = null;
//
//        try {
//            // klp.g:73:7: ( 'INPUT' | 'OUTPUT' | 'LOCAL' )
//            int alt5 = 3;
//            switch (input.LA(1)) {
//            case 16: {
//                alt5 = 1;
//            }
//                break;
//            case 17: {
//                alt5 = 2;
//            }
//                break;
//            case 18: {
//                alt5 = 3;
//            }
//                break;
//            default:
//                NoViableAltException nvae = new NoViableAltException("", 5, 0,
//                        input);
//
//                throw nvae;
//            }
//
//            switch (alt5) {
//            case 1:
//                // klp.g:73:9: 'INPUT'
//            {
//                match(input, 16, FOLLOW_16_in_decl502);
//                io = Decl.Kind.INPUT;
//
//            }
//                break;
//            case 2:
//                // klp.g:74:9: 'OUTPUT'
//            {
//                match(input, 17, FOLLOW_17_in_decl516);
//                io = Decl.Kind.OUTPUT;
//
//            }
//                break;
//            case 3:
//                // klp.g:75:9: 'LOCAL'
//            {
//                match(input, 18, FOLLOW_18_in_decl532);
//                io = Decl.Kind.LOCAL;
//
//            }
//                break;
//
//            }
//        } catch (RecognitionException re) {
//            reportError(re);
//            recover(input, re);
//        } finally {
//        }
//        return io;
//    }
//
//    // $ANTLR end "decl"
//
//    // $ANTLR start "init"
//    // klp.g:78:1: init : ( 'INITV' | 'INITC' );
//    public final void init() throws RecognitionException {
//        try {
//            // klp.g:79:7: ( 'INITV' | 'INITC' )
//            int alt6 = 2;
//            int LA6_0 = input.LA(1);
//
//            if ((LA6_0 == 19)) {
//                alt6 = 1;
//            } else if ((LA6_0 == 20)) {
//                alt6 = 2;
//            } else {
//                NoViableAltException nvae = new NoViableAltException("", 6, 0,
//                        input);
//
//                throw nvae;
//            }
//            switch (alt6) {
//            case 1:
//                // klp.g:79:9: 'INITV'
//            {
//                match(input, 19, FOLLOW_19_in_init565);
//
//            }
//                break;
//            case 2:
//                // klp.g:80:9: 'INITC'
//            {
//                match(input, 20, FOLLOW_20_in_init577);
//
//            }
//                break;
//
//            }
//        } catch (RecognitionException re) {
//            reportError(re);
//            recover(input, re);
//        } finally {
//        }
//        return;
//    }
//
//    // $ANTLR end "init"
//
//    // $ANTLR start "binop"
//    // klp.g:83:1: binop returns [OP op] : ( 'ADD' | 'SUB' | 'MUL' | 'DIV' |
//    // 'AND' | 'OR' | 'XOR' | 'LT' | 'LE' | 'EQ' | 'GE' | 'GT' | 'NEQ' );
//    public final OP binop() throws RecognitionException {
//        OP op = null;
//
//        try {
//            // klp.g:84:7: ( 'ADD' | 'SUB' | 'MUL' | 'DIV' | 'AND' | 'OR' |
//            // 'XOR' | 'LT' | 'LE' | 'EQ' | 'GE' | 'GT' | 'NEQ' )
//            int alt7 = 13;
//            switch (input.LA(1)) {
//            case 21: {
//                alt7 = 1;
//            }
//                break;
//            case 22: {
//                alt7 = 2;
//            }
//                break;
//            case 23: {
//                alt7 = 3;
//            }
//                break;
//            case 24: {
//                alt7 = 4;
//            }
//                break;
//            case 25: {
//                alt7 = 5;
//            }
//                break;
//            case 26: {
//                alt7 = 6;
//            }
//                break;
//            case 27: {
//                alt7 = 7;
//            }
//                break;
//            case 28: {
//                alt7 = 8;
//            }
//                break;
//            case 29: {
//                alt7 = 9;
//            }
//                break;
//            case 30: {
//                alt7 = 10;
//            }
//                break;
//            case 31: {
//                alt7 = 11;
//            }
//                break;
//            case 32: {
//                alt7 = 12;
//            }
//                break;
//            case 33: {
//                alt7 = 13;
//            }
//                break;
//            default:
//                NoViableAltException nvae = new NoViableAltException("", 7, 0,
//                        input);
//
//                throw nvae;
//            }
//
//            switch (alt7) {
//            case 1:
//                // klp.g:84:9: 'ADD'
//            {
//                match(input, 21, FOLLOW_21_in_binop609);
//                op = OP.ADD;
//
//            }
//                break;
//            case 2:
//                // klp.g:85:9: 'SUB'
//            {
//                match(input, 22, FOLLOW_22_in_binop621);
//                op = OP.SUB;
//
//            }
//                break;
//            case 3:
//                // klp.g:86:9: 'MUL'
//            {
//                match(input, 23, FOLLOW_23_in_binop633);
//                op = OP.MUL;
//
//            }
//                break;
//            case 4:
//                // klp.g:87:9: 'DIV'
//            {
//                match(input, 24, FOLLOW_24_in_binop645);
//                op = OP.DIV;
//
//            }
//                break;
//            case 5:
//                // klp.g:88:9: 'AND'
//            {
//                match(input, 25, FOLLOW_25_in_binop657);
//                op = OP.AND;
//
//            }
//                break;
//            case 6:
//                // klp.g:89:9: 'OR'
//            {
//                match(input, 26, FOLLOW_26_in_binop669);
//                op = OP.OR;
//
//            }
//                break;
//            case 7:
//                // klp.g:90:9: 'XOR'
//            {
//                match(input, 27, FOLLOW_27_in_binop682);
//                op = OP.XOR;
//
//            }
//                break;
//            case 8:
//                // klp.g:91:9: 'LT'
//            {
//                match(input, 28, FOLLOW_28_in_binop698);
//                op = OP.LT;
//
//            }
//                break;
//            case 9:
//                // klp.g:92:9: 'LE'
//            {
//                match(input, 29, FOLLOW_29_in_binop711);
//                op = OP.LE;
//
//            }
//                break;
//            case 10:
//                // klp.g:93:9: 'EQ'
//            {
//                match(input, 30, FOLLOW_30_in_binop724);
//                op = OP.EQ;
//
//            }
//                break;
//            case 11:
//                // klp.g:94:9: 'GE'
//            {
//                match(input, 31, FOLLOW_31_in_binop737);
//                op = OP.GE;
//
//            }
//                break;
//            case 12:
//                // klp.g:95:9: 'GT'
//            {
//                match(input, 32, FOLLOW_32_in_binop750);
//                op = OP.GT;
//
//            }
//                break;
//            case 13:
//                // klp.g:96:9: 'NEQ'
//            {
//                match(input, 33, FOLLOW_33_in_binop763);
//                op = OP.NEQ;
//
//            }
//                break;
//
//            }
//        } catch (RecognitionException re) {
//            reportError(re);
//            recover(input, re);
//        } finally {
//        }
//        return op;
//    }
//
//    // $ANTLR end "binop"
//
//    // $ANTLR start "ibinop"
//    // klp.g:99:1: ibinop returns [OP op] : ( 'IADD' | 'ISUB' | 'IMUL' | 'IDIV'
//    // | 'IAND' | 'IOR' | 'IXOR' | 'ILT' | 'ILE' | 'IEQ' | 'IGE' | 'IGT' |
//    // 'INEQ' );
//    public final OP ibinop() throws RecognitionException {
//        OP op = null;
//
//        try {
//            // klp.g:100:7: ( 'IADD' | 'ISUB' | 'IMUL' | 'IDIV' | 'IAND' | 'IOR'
//            // | 'IXOR' | 'ILT' | 'ILE' | 'IEQ' | 'IGE' | 'IGT' | 'INEQ' )
//            int alt8 = 13;
//            switch (input.LA(1)) {
//            case 34: {
//                alt8 = 1;
//            }
//                break;
//            case 35: {
//                alt8 = 2;
//            }
//                break;
//            case 36: {
//                alt8 = 3;
//            }
//                break;
//            case 37: {
//                alt8 = 4;
//            }
//                break;
//            case 38: {
//                alt8 = 5;
//            }
//                break;
//            case 39: {
//                alt8 = 6;
//            }
//                break;
//            case 40: {
//                alt8 = 7;
//            }
//                break;
//            case 41: {
//                alt8 = 8;
//            }
//                break;
//            case 42: {
//                alt8 = 9;
//            }
//                break;
//            case 43: {
//                alt8 = 10;
//            }
//                break;
//            case 44: {
//                alt8 = 11;
//            }
//                break;
//            case 45: {
//                alt8 = 12;
//            }
//                break;
//            case 46: {
//                alt8 = 13;
//            }
//                break;
//            default:
//                NoViableAltException nvae = new NoViableAltException("", 8, 0,
//                        input);
//
//                throw nvae;
//            }
//
//            switch (alt8) {
//            case 1:
//                // klp.g:100:9: 'IADD'
//            {
//                match(input, 34, FOLLOW_34_in_ibinop797);
//                op = OP.ADD;
//
//            }
//                break;
//            case 2:
//                // klp.g:101:9: 'ISUB'
//            {
//                match(input, 35, FOLLOW_35_in_ibinop809);
//                op = OP.SUB;
//
//            }
//                break;
//            case 3:
//                // klp.g:102:9: 'IMUL'
//            {
//                match(input, 36, FOLLOW_36_in_ibinop821);
//                op = OP.MUL;
//
//            }
//                break;
//            case 4:
//                // klp.g:103:9: 'IDIV'
//            {
//                match(input, 37, FOLLOW_37_in_ibinop833);
//                op = OP.DIV;
//
//            }
//                break;
//            case 5:
//                // klp.g:104:9: 'IAND'
//            {
//                match(input, 38, FOLLOW_38_in_ibinop845);
//                op = OP.AND;
//
//            }
//                break;
//            case 6:
//                // klp.g:105:9: 'IOR'
//            {
//                match(input, 39, FOLLOW_39_in_ibinop857);
//                op = OP.OR;
//
//            }
//                break;
//            case 7:
//                // klp.g:106:9: 'IXOR'
//            {
//                match(input, 40, FOLLOW_40_in_ibinop870);
//                op = OP.XOR;
//
//            }
//                break;
//            case 8:
//                // klp.g:107:9: 'ILT'
//            {
//                match(input, 41, FOLLOW_41_in_ibinop888);
//                op = OP.LT;
//
//            }
//                break;
//            case 9:
//                // klp.g:108:9: 'ILE'
//            {
//                match(input, 42, FOLLOW_42_in_ibinop901);
//                op = OP.LE;
//
//            }
//                break;
//            case 10:
//                // klp.g:109:9: 'IEQ'
//            {
//                match(input, 43, FOLLOW_43_in_ibinop914);
//                op = OP.EQ;
//
//            }
//                break;
//            case 11:
//                // klp.g:110:9: 'IGE'
//            {
//                match(input, 44, FOLLOW_44_in_ibinop927);
//                op = OP.GE;
//
//            }
//                break;
//            case 12:
//                // klp.g:111:9: 'IGT'
//            {
//                match(input, 45, FOLLOW_45_in_ibinop940);
//                op = OP.GT;
//
//            }
//                break;
//            case 13:
//                // klp.g:112:9: 'INEQ'
//            {
//                match(input, 46, FOLLOW_46_in_ibinop953);
//                op = OP.NEQ;
//
//            }
//                break;
//
//            }
//        } catch (RecognitionException re) {
//            reportError(re);
//            recover(input, re);
//        } finally {
//        }
//        return op;
//    }
//
//    // $ANTLR end "ibinop"
//
//    // $ANTLR start "cjump"
//    // klp.g:115:2: cjump returns [CJmp.Cond c] : ( 'JT' | 'JF' | 'JZ' | 'JNZ'
//    // );
//    public final CJmp.Cond cjump() throws RecognitionException {
//        CJmp.Cond c = null;
//
//        try {
//            // klp.g:116:8: ( 'JT' | 'JF' | 'JZ' | 'JNZ' )
//            int alt9 = 4;
//            switch (input.LA(1)) {
//            case 47: {
//                alt9 = 1;
//            }
//                break;
//            case 48: {
//                alt9 = 2;
//            }
//                break;
//            case 49: {
//                alt9 = 3;
//            }
//                break;
//            case 50: {
//                alt9 = 4;
//            }
//                break;
//            default:
//                NoViableAltException nvae = new NoViableAltException("", 9, 0,
//                        input);
//
//                throw nvae;
//            }
//
//            switch (alt9) {
//            case 1:
//                // klp.g:116:10: 'JT'
//            {
//                match(input, 47, FOLLOW_47_in_cjump994);
//                c = CJmp.Cond.T;
//
//            }
//                break;
//            case 2:
//                // klp.g:117:10: 'JF'
//            {
//                match(input, 48, FOLLOW_48_in_cjump1008);
//                c = CJmp.Cond.F;
//
//            }
//                break;
//            case 3:
//                // klp.g:118:10: 'JZ'
//            {
//                match(input, 49, FOLLOW_49_in_cjump1022);
//                c = CJmp.Cond.Z;
//
//            }
//                break;
//            case 4:
//                // klp.g:119:10: 'JNZ'
//            {
//                match(input, 50, FOLLOW_50_in_cjump1037);
//                c = CJmp.Cond.NZ;
//
//            }
//                break;
//
//            }
//        } catch (RecognitionException re) {
//            reportError(re);
//            recover(input, re);
//        } finally {
//        }
//        return c;
//    }
//
//    // $ANTLR end "cjump"
//
//    // $ANTLR start "mov"
//    // klp.g:122:2: mov returns [Mov.Type t] : ( 'CVMOV' | 'VCMOV' | 'VVMOV' |
//    // 'CCMOV' );
//    public final Mov.Type mov() throws RecognitionException {
//        Mov.Type t = null;
//
//        try {
//            // klp.g:123:7: ( 'CVMOV' | 'VCMOV' | 'VVMOV' | 'CCMOV' )
//            int alt10 = 4;
//            switch (input.LA(1)) {
//            case 51: {
//                alt10 = 1;
//            }
//                break;
//            case 52: {
//                alt10 = 2;
//            }
//                break;
//            case 53: {
//                alt10 = 3;
//            }
//                break;
//            case 54: {
//                alt10 = 4;
//            }
//                break;
//            default:
//                NoViableAltException nvae = new NoViableAltException("", 10, 0,
//                        input);
//
//                throw nvae;
//            }
//
//            switch (alt10) {
//            case 1:
//                // klp.g:123:9: 'CVMOV'
//            {
//                match(input, 51, FOLLOW_51_in_mov1075);
//                t = Mov.Type.CV;
//
//            }
//                break;
//            case 2:
//                // klp.g:124:9: 'VCMOV'
//            {
//                match(input, 52, FOLLOW_52_in_mov1090);
//                t = Mov.Type.VC;
//
//            }
//                break;
//            case 3:
//                // klp.g:125:9: 'VVMOV'
//            {
//                match(input, 53, FOLLOW_53_in_mov1104);
//                t = Mov.Type.VV;
//
//            }
//                break;
//            case 4:
//                // klp.g:126:9: 'CCMOV'
//            {
//                match(input, 54, FOLLOW_54_in_mov1117);
//                t = Mov.Type.CC;
//
//            }
//                break;
//
//            }
//        } catch (RecognitionException re) {
//            reportError(re);
//            recover(input, re);
//        } finally {
//        }
//        return t;
//    }
//
//    // $ANTLR end "mov"
//
//    // $ANTLR start "imov"
//    // klp.g:129:2: imov returns [IMov.Type t] : ( 'IVMOV' | 'ICMOV' );
//    public final IMov.Type imov() throws RecognitionException {
//        IMov.Type t = null;
//
//        try {
//            // klp.g:130:7: ( 'IVMOV' | 'ICMOV' )
//            int alt11 = 2;
//            int LA11_0 = input.LA(1);
//
//            if ((LA11_0 == 55)) {
//                alt11 = 1;
//            } else if ((LA11_0 == 56)) {
//                alt11 = 2;
//            } else {
//                NoViableAltException nvae = new NoViableAltException("", 11, 0,
//                        input);
//
//                throw nvae;
//            }
//            switch (alt11) {
//            case 1:
//                // klp.g:130:9: 'IVMOV'
//            {
//                match(input, 55, FOLLOW_55_in_imov1152);
//                t = IMov.Type.IV;
//
//            }
//                break;
//            case 2:
//                // klp.g:131:9: 'ICMOV'
//            {
//                match(input, 56, FOLLOW_56_in_imov1164);
//                t = IMov.Type.IC;
//
//            }
//                break;
//
//            }
//        } catch (RecognitionException re) {
//            reportError(re);
//            recover(input, re);
//        } finally {
//        }
//        return t;
//    }
//
//    // $ANTLR end "imov"
//
//    // $ANTLR start "num"
//    // klp.g:134:2: num returns [Integer v] : n= NUMBER ;
//    public final Integer num() throws RecognitionException {
//        Integer v = null;
//
//        Token n = null;
//
//        try {
//            // klp.g:135:7: (n= NUMBER )
//            // klp.g:135:9: n= NUMBER
//            {
//                n = (Token) match(input, NUMBER, FOLLOW_NUMBER_in_num1201);
//                v = Integer.parseInt((n != null ? n.getText() : null));
//
//            }
//
//        } catch (RecognitionException re) {
//            reportError(re);
//            recover(input, re);
//        } finally {
//        }
//        return v;
//    }
//
//    // $ANTLR end "num"
//
//    // $ANTLR start "read"
//    // klp.g:138:2: read returns [Read r] : ( 'pre' '(' v= ID ')' | v= ID );
//    public final Read read() throws RecognitionException {
//        Read r = null;
//
//        Token v = null;
//
//        try {
//            // klp.g:139:7: ( 'pre' '(' v= ID ')' | v= ID )
//            int alt12 = 2;
//            int LA12_0 = input.LA(1);
//
//            if ((LA12_0 == 57)) {
//                alt12 = 1;
//            } else if ((LA12_0 == ID)) {
//                alt12 = 2;
//            } else {
//                NoViableAltException nvae = new NoViableAltException("", 12, 0,
//                        input);
//
//                throw nvae;
//            }
//            switch (alt12) {
//            case 1:
//                // klp.g:139:9: 'pre' '(' v= ID ')'
//            {
//                match(input, 57, FOLLOW_57_in_read1235);
//                match(input, 58, FOLLOW_58_in_read1237);
//                v = (Token) match(input, ID, FOLLOW_ID_in_read1241);
//                match(input, 59, FOLLOW_59_in_read1243);
//                r = new Read((v != null ? v.getText() : null), true);
//
//            }
//                break;
//            case 2:
//                // klp.g:140:9: v= ID
//            {
//                v = (Token) match(input, ID, FOLLOW_ID_in_read1257);
//                r = new Read((v != null ? v.getText() : null), false);
//
//            }
//                break;
//
//            }
//        } catch (RecognitionException re) {
//            reportError(re);
//            recover(input, re);
//        } finally {
//        }
//        return r;
//    }
//
//    // $ANTLR end "read"
//
//    // Delegated rules
//
//    public static final BitSet FOLLOW_instr_in_prog54 = new BitSet(
//            new long[] { 0x01FFFFFFFFE7F812L });
//    public static final BitSet FOLLOW_ID_in_prog76 = new BitSet(
//            new long[] { 0x0000000000000400L });
//    public static final BitSet FOLLOW_10_in_prog78 = new BitSet(
//            new long[] { 0x01FFFFFFFFE7F812L });
//    public static final BitSet FOLLOW_decl_in_instr114 = new BitSet(
//            new long[] { 0x0000000000000010L });
//    public static final BitSet FOLLOW_ID_in_instr118 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_11_in_instr139 = new BitSet(
//            new long[] { 0x0000000000000010L });
//    public static final BitSet FOLLOW_ID_in_instr143 = new BitSet(
//            new long[] { 0x0000000000000010L });
//    public static final BitSet FOLLOW_ID_in_instr147 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_12_in_instr168 = new BitSet(
//            new long[] { 0x0000000000000010L });
//    public static final BitSet FOLLOW_ID_in_instr172 = new BitSet(
//            new long[] { 0x0000000000000010L });
//    public static final BitSet FOLLOW_ID_in_instr176 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_13_in_instr205 = new BitSet(
//            new long[] { 0x0000000000000030L });
//    public static final BitSet FOLLOW_ID_in_instr209 = new BitSet(
//            new long[] { 0x0000000000000030L });
//    public static final BitSet FOLLOW_num_in_instr214 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_14_in_instr249 = new BitSet(
//            new long[] { 0x0000000000000012L });
//    public static final BitSet FOLLOW_ID_in_instr253 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_binop_in_instr294 = new BitSet(
//            new long[] { 0x0000000000000010L });
//    public static final BitSet FOLLOW_ID_in_instr299 = new BitSet(
//            new long[] { 0x0200000000000010L });
//    public static final BitSet FOLLOW_read_in_instr303 = new BitSet(
//            new long[] { 0x0200000000000010L });
//    public static final BitSet FOLLOW_read_in_instr307 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_ibinop_in_instr332 = new BitSet(
//            new long[] { 0x0000000000000010L });
//    public static final BitSet FOLLOW_ID_in_instr336 = new BitSet(
//            new long[] { 0x0200000000000010L });
//    public static final BitSet FOLLOW_read_in_instr340 = new BitSet(
//            new long[] { 0x0000000000000030L });
//    public static final BitSet FOLLOW_num_in_instr344 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_15_in_instr370 = new BitSet(
//            new long[] { 0x0000000000000010L });
//    public static final BitSet FOLLOW_ID_in_instr374 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_cjump_in_instr396 = new BitSet(
//            new long[] { 0x0200000000000010L });
//    public static final BitSet FOLLOW_read_in_instr400 = new BitSet(
//            new long[] { 0x0000000000000010L });
//    public static final BitSet FOLLOW_ID_in_instr404 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_mov_in_instr426 = new BitSet(
//            new long[] { 0x0000000000000010L });
//    public static final BitSet FOLLOW_ID_in_instr431 = new BitSet(
//            new long[] { 0x0200000000000010L });
//    public static final BitSet FOLLOW_read_in_instr435 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_imov_in_instr457 = new BitSet(
//            new long[] { 0x0000000000000010L });
//    public static final BitSet FOLLOW_ID_in_instr461 = new BitSet(
//            new long[] { 0x0000000000000030L });
//    public static final BitSet FOLLOW_num_in_instr465 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_16_in_decl502 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_17_in_decl516 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_18_in_decl532 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_19_in_init565 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_20_in_init577 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_21_in_binop609 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_22_in_binop621 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_23_in_binop633 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_24_in_binop645 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_25_in_binop657 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_26_in_binop669 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_27_in_binop682 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_28_in_binop698 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_29_in_binop711 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_30_in_binop724 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_31_in_binop737 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_32_in_binop750 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_33_in_binop763 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_34_in_ibinop797 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_35_in_ibinop809 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_36_in_ibinop821 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_37_in_ibinop833 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_38_in_ibinop845 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_39_in_ibinop857 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_40_in_ibinop870 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_41_in_ibinop888 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_42_in_ibinop901 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_43_in_ibinop914 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_44_in_ibinop927 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_45_in_ibinop940 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_46_in_ibinop953 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_47_in_cjump994 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_48_in_cjump1008 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_49_in_cjump1022 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_50_in_cjump1037 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_51_in_mov1075 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_52_in_mov1090 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_53_in_mov1104 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_54_in_mov1117 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_55_in_imov1152 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_56_in_imov1164 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_NUMBER_in_num1201 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_57_in_read1235 = new BitSet(
//            new long[] { 0x0400000000000000L });
//    public static final BitSet FOLLOW_58_in_read1237 = new BitSet(
//            new long[] { 0x0000000000000010L });
//    public static final BitSet FOLLOW_ID_in_read1241 = new BitSet(
//            new long[] { 0x0800000000000000L });
//    public static final BitSet FOLLOW_59_in_read1243 = new BitSet(
//            new long[] { 0x0000000000000002L });
//    public static final BitSet FOLLOW_ID_in_read1257 = new BitSet(
//            new long[] { 0x0000000000000002L });
//
//}
