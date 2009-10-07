/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
// $ANTLR 3.1.1 kep.g 2009-03-27 15:25:59

  package de.cau.cs.kieler.krep.evalbench.program.kep.parser;
  import java.util.LinkedList;
  import java.util.HashMap;
  


import org.antlr.runtime.*;

import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.program.kep.*;
import de.cau.cs.kieler.krep.evalbench.program.kep.Constants.*;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class kepParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUMBER", "Letter", "Digit", "WHITESPACE", "COMMENT", "'EMIT'", "'_TICKLEN'", "','", "'#'", "':'", "'INPUT'", "'OUTPUT'", "'INPUTV'", "'OUTPUTV'", "'SIGNAL'", "'SIGNALV'", "'VAR'", "'NOTHING'", "'GOTO'", "'CALL'", "'RETURN'", "'PRESENT'", "'AWAIT'", "'PAUSE'", "'AWAITI'", "'HALT'", "'CAWAITS'", "'CAWAIT'", "'CAWAITI'", "'CAWAITE'", "'ABORT'", "'ABORTI'", "'WABORT'", "'WABORTI'", "'SUSPEND'", "'SUSPENDI'", "'SETV'", "'SUSTAIN'", "'PAR'", "'PARE'", "'PRIO'", "'JOIN'", "'LABORT'", "'LABORTI'", "'LWABORT'", "'LWABORTI'", "'TABORT'", "'TABORTI'", "'TWABORT'", "'TWABORTI'", "'JC'", "'JNC'", "'CLRC'", "'SETC'", "'SR'", "'SRC'", "'SL'", "'SLC'", "'NOTR'", "'LOAD'", "'ADD'", "'ADDC'", "'SUB'", "'SUBC'", "'MUL'", "'ANDR'", "'ORR'", "'XORR'", "'CMP'", "'CMPS'", "'DEF32'", "'EXIT'", "'PRE'", "'('", "')'", "'?'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int ID=4;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int T__10=10;
    public static final int COMMENT=9;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int NUMBER=5;
    public static final int WHITESPACE=8;
    public static final int Digit=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int Letter=6;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public kepParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public kepParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return kepParser.tokenNames; }
    public String getGrammarFileName() { return "kep.g"; }


      LinkedList<Instruction> instructions = new LinkedList<Instruction>();
      
      LinkedList<Signal> inputs = new LinkedList<Signal>();
      LinkedList<Signal> outputs = new LinkedList<Signal>();
      LinkedList<Signal> locals = new LinkedList<Signal>();
      
      int signalIndex=1; //0=ticklen; 
      
      LinkedList<String> labels = new LinkedList<String>();
      
      private String errorMsg = new String();
      private boolean error = false;
      
      private HashMap<String, Integer> signalID= new HashMap<String, Integer>();

      private void addSignal(Scope scope, boolean valued, String name){
        Signal s = new Signal(name, false, valued?0:null, signalIndex);
        if(scope == Scope.INPUT){
          inputs.add(s);
        }else if (scope == Scope.OUTPUT){
          outputs.add(s);
        }else{
          locals.add(s);
        }
        if(signalID.get(name)==null){
          signalID.put(name, signalIndex);
        }
        signalIndex++;
      }
      
      public void emitErrorMessage(String msg) {
        errorMsg += msg + "\n";
        error = true;
      }
      
      public String getErrorMsg(){
        return errorMsg;
      }
      
      public boolean getError(){
        return error;
      }
      
      public LinkedList<Signal> getInputs(){
        return inputs;
      }
      
      public LinkedList<Signal> getOutputs(){
        return outputs;
      }
      
      public LinkedList<Signal> getLocals(){
        return locals;
      }
      
      public LinkedList<Instruction> getInstructions(){
        return instructions;
      }
      
      private void unsupported(String keyword){
        System.err.println(keyword + " not supported");
      }
      
      private enum Scope{
        INPUT, OUTPUT, LOCAL;
      }



    // $ANTLR start "program"
    // kep.g:89:1: program : ( io_expr )* 'EMIT' '_TICKLEN' ',' '#' d= num ( kst )* ;
    public final void program() throws RecognitionException {
        Integer d = null;


        try {
            // kep.g:89:10: ( ( io_expr )* 'EMIT' '_TICKLEN' ',' '#' d= num ( kst )* )
            // kep.g:89:13: ( io_expr )* 'EMIT' '_TICKLEN' ',' '#' d= num ( kst )*
            {
            // kep.g:89:13: ( io_expr )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // kep.g:89:13: io_expr
            	    {
            	    pushFollow(FOLLOW_io_expr_in_program34);
            	    io_expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,10,FOLLOW_10_in_program53); 
            match(input,11,FOLLOW_11_in_program55); 
            match(input,12,FOLLOW_12_in_program57); 
            match(input,13,FOLLOW_13_in_program60); 
            pushFollow(FOLLOW_num_in_program64);
            d=num();

            state._fsp--;

            instructions.add(new Emit(new KepSignal("_TICKLEN", null, 0, 1+d), null));
            // kep.g:92:13: ( kst )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID||LA2_0==10||(LA2_0>=19 && LA2_0<=20)||(LA2_0>=22 && LA2_0<=76)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // kep.g:92:13: kst
            	    {
            	    pushFollow(FOLLOW_kst_in_program96);
            	    kst();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "kst"
    // kep.g:95:1: kst : (i= kasm_st | l= ID ':' );
    public final void kst() throws RecognitionException {
        Token l=null;
        Instruction i = null;


        try {
            // kep.g:95:5: (i= kasm_st | l= ID ':' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10||(LA3_0>=19 && LA3_0<=20)||(LA3_0>=22 && LA3_0<=76)) ) {
                alt3=1;
            }
            else if ( (LA3_0==ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // kep.g:95:8: i= kasm_st
                    {
                    pushFollow(FOLLOW_kasm_st_in_kst115);
                    i=kasm_st();

                    state._fsp--;

                     if(i!=null){
                                        i.setLabels(labels);
                                        labels.clear(); 
                                        instructions.add(i);
                                       }else{
                                         System.err.println("unknown expression");
                                       };
                                     

                    }
                    break;
                case 2 :
                    // kep.g:103:8: l= ID ':'
                    {
                    l=(Token)match(input,ID,FOLLOW_ID_in_kst128); 
                    match(input,14,FOLLOW_14_in_kst130); 
                    labels.add((l!=null?l.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "kst"


    // $ANTLR start "io_expr"
    // kep.g:106:1: io_expr : ( 'INPUT' sig_list[Scope.INPUT, false] | 'OUTPUT' sig_list[Scope.OUTPUT, false] | 'INPUTV' sig_list[Scope.INPUT, true] | 'OUTPUTV' sig_list[Scope.OUTPUT,true] | 'SIGNAL' sig_list[Scope.LOCAL, false] | 'SIGNALV' sig_list[Scope.LOCAL,true] | 'VAR' var_list );
    public final void io_expr() throws RecognitionException {
        try {
            // kep.g:106:10: ( 'INPUT' sig_list[Scope.INPUT, false] | 'OUTPUT' sig_list[Scope.OUTPUT, false] | 'INPUTV' sig_list[Scope.INPUT, true] | 'OUTPUTV' sig_list[Scope.OUTPUT,true] | 'SIGNAL' sig_list[Scope.LOCAL, false] | 'SIGNALV' sig_list[Scope.LOCAL,true] | 'VAR' var_list )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            case 20:
                {
                alt4=6;
                }
                break;
            case 21:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // kep.g:106:12: 'INPUT' sig_list[Scope.INPUT, false]
                    {
                    match(input,15,FOLLOW_15_in_io_expr152); 
                    pushFollow(FOLLOW_sig_list_in_io_expr156);
                    sig_list(Scope.INPUT, false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // kep.g:107:12: 'OUTPUT' sig_list[Scope.OUTPUT, false]
                    {
                    match(input,16,FOLLOW_16_in_io_expr170); 
                    pushFollow(FOLLOW_sig_list_in_io_expr173);
                    sig_list(Scope.OUTPUT, false);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // kep.g:108:12: 'INPUTV' sig_list[Scope.INPUT, true]
                    {
                    match(input,17,FOLLOW_17_in_io_expr187); 
                    pushFollow(FOLLOW_sig_list_in_io_expr190);
                    sig_list(Scope.INPUT, true);

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // kep.g:109:12: 'OUTPUTV' sig_list[Scope.OUTPUT,true]
                    {
                    match(input,18,FOLLOW_18_in_io_expr204); 
                    pushFollow(FOLLOW_sig_list_in_io_expr206);
                    sig_list(Scope.OUTPUT, true);

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // kep.g:110:12: 'SIGNAL' sig_list[Scope.LOCAL, false]
                    {
                    match(input,19,FOLLOW_19_in_io_expr220); 
                    pushFollow(FOLLOW_sig_list_in_io_expr223);
                    sig_list(Scope.LOCAL, false);

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // kep.g:111:12: 'SIGNALV' sig_list[Scope.LOCAL,true]
                    {
                    match(input,20,FOLLOW_20_in_io_expr237); 
                    pushFollow(FOLLOW_sig_list_in_io_expr239);
                    sig_list(Scope.LOCAL, true);

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // kep.g:112:12: 'VAR' var_list
                    {
                    match(input,21,FOLLOW_21_in_io_expr253); 
                    pushFollow(FOLLOW_var_list_in_io_expr255);
                    var_list();

                    state._fsp--;

                     unsupported("var"); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "io_expr"


    // $ANTLR start "sig_list"
    // kep.g:115:1: sig_list[Scope scope, boolean valued] : id0= signal_id ( ',' id1= signal_id )* ;
    public final void sig_list(Scope scope, boolean valued) throws RecognitionException {
        kepParser.signal_id_return id0 = null;

        kepParser.signal_id_return id1 = null;


        try {
            // kep.g:116:9: (id0= signal_id ( ',' id1= signal_id )* )
            // kep.g:116:12: id0= signal_id ( ',' id1= signal_id )*
            {
            pushFollow(FOLLOW_signal_id_in_sig_list297);
            id0=signal_id();

            state._fsp--;

            addSignal(scope, valued,  (id0!=null?input.toString(id0.start,id0.stop):null));
            // kep.g:117:12: ( ',' id1= signal_id )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // kep.g:117:13: ',' id1= signal_id
            	    {
            	    match(input,12,FOLLOW_12_in_sig_list314); 
            	    pushFollow(FOLLOW_signal_id_in_sig_list318);
            	    id1=signal_id();

            	    state._fsp--;

            	    addSignal(scope, valued, (id1!=null?input.toString(id1.start,id1.stop):null));

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "sig_list"


    // $ANTLR start "var_list"
    // kep.g:120:1: var_list : variable ( ',' variable )* ;
    public final void var_list() throws RecognitionException {
        try {
            // kep.g:120:10: ( variable ( ',' variable )* )
            // kep.g:120:13: variable ( ',' variable )*
            {
            pushFollow(FOLLOW_variable_in_var_list342);
            variable();

            state._fsp--;

            // kep.g:120:23: ( ',' variable )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // kep.g:120:24: ',' variable
            	    {
            	    match(input,12,FOLLOW_12_in_var_list346); 
            	    pushFollow(FOLLOW_variable_in_var_list348);
            	    variable();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "var_list"


    // $ANTLR start "kasm_st"
    // kep.g:123:1: kasm_st returns [Instruction instr] : ( 'NOTHING' | 'GOTO' a= addr | 'CALL' addr | 'RETURN' | 'PRESENT' s= signal ',' a2= addr | 'AWAIT' s1= signal | 'PAUSE' | 'AWAITI' s2= signal | 'HALT' | 'CAWAITS' | 'CAWAIT' signal ',' addr | 'CAWAITI' signal ',' addr | 'CAWAITE' addr | 'ABORT' s3= signal ',' a3= addr | 'ABORTI' s4= signal ',' a4= addr | 'WABORT' s5= signal ',' a5= addr | 'WABORTI' s6= signal ',' a6= addr | 'SUSPEND' s7= signal ',' a7= addr | 'SUSPENDI' s8= signal ',' a8= addr | 'SIGNAL' s9= signal | 'SIGNALV' s10= signal | 'EMIT' sexpr= sig_expr | 'SETV' sig_expr | 'SUSTAIN' sexpr= sig_expr | 'PAR' p0= num ',' l0= addr ',' t0= num | 'PARE' l1= addr ',' p1= num | 'PRIO' p2= num ',' t2= num | 'PRIO' p3= num | 'JOIN' p4= num | 'LABORT' signal ',' addr | 'LABORTI' signal ',' addr | 'LWABORT' signal ',' addr | 'LWABORTI' signal ',' addr | 'TABORT' signal ',' addr | 'TABORTI' signal ',' addr | 'TWABORT' signal ',' addr | 'TWABORTI' signal ',' addr | 'JC' addr | 'JNC' addr | 'CLRC' | 'SETC' | 'SR' reg | 'SRC' reg | 'SL' reg | 'SLC' reg | 'NOTR' reg | 'LOAD' r= reg_expr | 'ADD' reg_expr | 'ADDC' reg_expr | 'SUB' reg_expr | 'SUBC' reg_expr | 'MUL' reg_expr | 'ANDR' reg_expr | 'ORR' reg_expr | 'XORR' reg_expr | 'CMP' reg_expr | 'CMPS' reg_expr | 'DEF32' '#' data | 'EXIT' a= addr ',' addr );
    public final Instruction kasm_st() throws RecognitionException {
        Instruction instr = null;

        Label a = null;

        KepSignal s = null;

        Label a2 = null;

        KepSignal s1 = null;

        KepSignal s2 = null;

        KepSignal s3 = null;

        Label a3 = null;

        KepSignal s4 = null;

        Label a4 = null;

        KepSignal s5 = null;

        Label a5 = null;

        KepSignal s6 = null;

        Label a6 = null;

        KepSignal s7 = null;

        Label a7 = null;

        KepSignal s8 = null;

        Label a8 = null;

        KepSignal s9 = null;

        KepSignal s10 = null;

        KepSignal sexpr = null;

        Integer p0 = null;

        Label l0 = null;

        Integer t0 = null;

        Label l1 = null;

        Integer p1 = null;

        Integer p2 = null;

        Integer t2 = null;

        Integer p3 = null;

        Integer p4 = null;

        kepParser.reg_expr_return r = null;


        try {
            // kep.g:124:9: ( 'NOTHING' | 'GOTO' a= addr | 'CALL' addr | 'RETURN' | 'PRESENT' s= signal ',' a2= addr | 'AWAIT' s1= signal | 'PAUSE' | 'AWAITI' s2= signal | 'HALT' | 'CAWAITS' | 'CAWAIT' signal ',' addr | 'CAWAITI' signal ',' addr | 'CAWAITE' addr | 'ABORT' s3= signal ',' a3= addr | 'ABORTI' s4= signal ',' a4= addr | 'WABORT' s5= signal ',' a5= addr | 'WABORTI' s6= signal ',' a6= addr | 'SUSPEND' s7= signal ',' a7= addr | 'SUSPENDI' s8= signal ',' a8= addr | 'SIGNAL' s9= signal | 'SIGNALV' s10= signal | 'EMIT' sexpr= sig_expr | 'SETV' sig_expr | 'SUSTAIN' sexpr= sig_expr | 'PAR' p0= num ',' l0= addr ',' t0= num | 'PARE' l1= addr ',' p1= num | 'PRIO' p2= num ',' t2= num | 'PRIO' p3= num | 'JOIN' p4= num | 'LABORT' signal ',' addr | 'LABORTI' signal ',' addr | 'LWABORT' signal ',' addr | 'LWABORTI' signal ',' addr | 'TABORT' signal ',' addr | 'TABORTI' signal ',' addr | 'TWABORT' signal ',' addr | 'TWABORTI' signal ',' addr | 'JC' addr | 'JNC' addr | 'CLRC' | 'SETC' | 'SR' reg | 'SRC' reg | 'SL' reg | 'SLC' reg | 'NOTR' reg | 'LOAD' r= reg_expr | 'ADD' reg_expr | 'ADDC' reg_expr | 'SUB' reg_expr | 'SUBC' reg_expr | 'MUL' reg_expr | 'ANDR' reg_expr | 'ORR' reg_expr | 'XORR' reg_expr | 'CMP' reg_expr | 'CMPS' reg_expr | 'DEF32' '#' data | 'EXIT' a= addr ',' addr )
            int alt7=59;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // kep.g:124:11: 'NOTHING'
                    {
                    match(input,22,FOLLOW_22_in_kasm_st380); 
                    instr = new Nothing(null); 

                    }
                    break;
                case 2 :
                    // kep.g:125:11: 'GOTO' a= addr
                    {
                    match(input,23,FOLLOW_23_in_kasm_st402); 
                    pushFollow(FOLLOW_addr_in_kasm_st406);
                    a=addr();

                    state._fsp--;

                    instr = new Goto(a, null);

                    }
                    break;
                case 3 :
                    // kep.g:126:11: 'CALL' addr
                    {
                    match(input,24,FOLLOW_24_in_kasm_st427); 
                    pushFollow(FOLLOW_addr_in_kasm_st429);
                    addr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 4 :
                    // kep.g:127:11: 'RETURN'
                    {
                    match(input,25,FOLLOW_25_in_kasm_st449); 
                    instr = null;

                    }
                    break;
                case 5 :
                    // kep.g:129:11: 'PRESENT' s= signal ',' a2= addr
                    {
                    match(input,26,FOLLOW_26_in_kasm_st473); 
                    pushFollow(FOLLOW_signal_in_kasm_st477);
                    s=signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st479); 
                    pushFollow(FOLLOW_addr_in_kasm_st483);
                    a2=addr();

                    state._fsp--;

                    instr = new Present(s, a2, null); 

                    }
                    break;
                case 6 :
                    // kep.g:132:11: 'AWAIT' s1= signal
                    {
                    match(input,27,FOLLOW_27_in_kasm_st527); 
                    pushFollow(FOLLOW_signal_in_kasm_st531);
                    s1=signal();

                    state._fsp--;

                    instr = new Await(s1, null); 

                    }
                    break;
                case 7 :
                    // kep.g:133:11: 'PAUSE'
                    {
                    match(input,28,FOLLOW_28_in_kasm_st548); 
                    instr = new Pause(null); 

                    }
                    break;
                case 8 :
                    // kep.g:134:11: 'AWAITI' s2= signal
                    {
                    match(input,29,FOLLOW_29_in_kasm_st575); 
                    pushFollow(FOLLOW_signal_in_kasm_st579);
                    s2=signal();

                    state._fsp--;

                    instr = new Awaiti(s2, null); 

                    }
                    break;
                case 9 :
                    // kep.g:135:11: 'HALT'
                    {
                    match(input,30,FOLLOW_30_in_kasm_st595); 
                    instr = new Halt(null); 

                    }
                    break;
                case 10 :
                    // kep.g:137:11: 'CAWAITS'
                    {
                    match(input,31,FOLLOW_31_in_kasm_st624); 
                    instr = null;

                    }
                    break;
                case 11 :
                    // kep.g:138:11: 'CAWAIT' signal ',' addr
                    {
                    match(input,32,FOLLOW_32_in_kasm_st659); 
                    pushFollow(FOLLOW_signal_in_kasm_st662);
                    signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st666); 
                    pushFollow(FOLLOW_addr_in_kasm_st671);
                    addr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 12 :
                    // kep.g:139:11: 'CAWAITI' signal ',' addr
                    {
                    match(input,33,FOLLOW_33_in_kasm_st685); 
                    pushFollow(FOLLOW_signal_in_kasm_st687);
                    signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st691); 
                    pushFollow(FOLLOW_addr_in_kasm_st696);
                    addr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 13 :
                    // kep.g:140:11: 'CAWAITE' addr
                    {
                    match(input,34,FOLLOW_34_in_kasm_st710); 
                    pushFollow(FOLLOW_addr_in_kasm_st712);
                    addr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 14 :
                    // kep.g:142:11: 'ABORT' s3= signal ',' a3= addr
                    {
                    match(input,35,FOLLOW_35_in_kasm_st743); 
                    pushFollow(FOLLOW_signal_in_kasm_st749);
                    s3=signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st751); 
                    pushFollow(FOLLOW_addr_in_kasm_st755);
                    a3=addr();

                    state._fsp--;

                    instr = new Abort(s3, a3, null, null); 

                    }
                    break;
                case 15 :
                    // kep.g:144:11: 'ABORTI' s4= signal ',' a4= addr
                    {
                    match(input,36,FOLLOW_36_in_kasm_st780); 
                    pushFollow(FOLLOW_signal_in_kasm_st785);
                    s4=signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st787); 
                    pushFollow(FOLLOW_addr_in_kasm_st791);
                    a4=addr();

                    state._fsp--;

                    instr = new Aborti(s4, a4, null, null); 

                    }
                    break;
                case 16 :
                    // kep.g:146:11: 'WABORT' s5= signal ',' a5= addr
                    {
                    match(input,37,FOLLOW_37_in_kasm_st818); 
                    pushFollow(FOLLOW_signal_in_kasm_st823);
                    s5=signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st825); 
                    pushFollow(FOLLOW_addr_in_kasm_st829);
                    a5=addr();

                    state._fsp--;

                    instr = new WAbort(s5, a5, null, null); 

                    }
                    break;
                case 17 :
                    // kep.g:148:11: 'WABORTI' s6= signal ',' a6= addr
                    {
                    match(input,38,FOLLOW_38_in_kasm_st855); 
                    pushFollow(FOLLOW_signal_in_kasm_st859);
                    s6=signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st861); 
                    pushFollow(FOLLOW_addr_in_kasm_st865);
                    a6=addr();

                    state._fsp--;

                    instr = new WAborti(s6, a6, null, null); 

                    }
                    break;
                case 18 :
                    // kep.g:151:11: 'SUSPEND' s7= signal ',' a7= addr
                    {
                    match(input,39,FOLLOW_39_in_kasm_st901); 
                    pushFollow(FOLLOW_signal_in_kasm_st906);
                    s7=signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st908); 
                    pushFollow(FOLLOW_addr_in_kasm_st912);
                    a7=addr();

                    state._fsp--;

                    instr = new Suspend(s7, a7, null, null); 

                    }
                    break;
                case 19 :
                    // kep.g:153:11: 'SUSPENDI' s8= signal ',' a8= addr
                    {
                    match(input,40,FOLLOW_40_in_kasm_st939); 
                    pushFollow(FOLLOW_signal_in_kasm_st943);
                    s8=signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st945); 
                    pushFollow(FOLLOW_addr_in_kasm_st949);
                    a8=addr();

                    state._fsp--;

                    instr = new Suspendi(s8, a8, null, null); 

                    }
                    break;
                case 20 :
                    // kep.g:156:11: 'SIGNAL' s9= signal
                    {
                    match(input,19,FOLLOW_19_in_kasm_st977); 
                    pushFollow(FOLLOW_signal_in_kasm_st983);
                    s9=signal();

                    state._fsp--;

                    addSignal(Scope.LOCAL, false, s9.getName());
                               s9.setId(signalID.get(s9.getName()));   
                               instr = new SignalIn(s9, null); 

                    }
                    break;
                case 21 :
                    // kep.g:160:11: 'SIGNALV' s10= signal
                    {
                    match(input,20,FOLLOW_20_in_kasm_st1011); 
                    pushFollow(FOLLOW_signal_in_kasm_st1016);
                    s10=signal();

                    state._fsp--;

                    addSignal(Scope.LOCAL, false, s10.getName());
                               s10.setId(signalID.get(s10.getName()));  
                               instr = new SignalIn(s10, null); 

                    }
                    break;
                case 22 :
                    // kep.g:164:11: 'EMIT' sexpr= sig_expr
                    {
                    match(input,10,FOLLOW_10_in_kasm_st1043); 
                    pushFollow(FOLLOW_sig_expr_in_kasm_st1050);
                    sexpr=sig_expr();

                    state._fsp--;

                    instr = new Emit(sexpr, null); 

                    }
                    break;
                case 23 :
                    // kep.g:165:11: 'SETV' sig_expr
                    {
                    match(input,41,FOLLOW_41_in_kasm_st1065); 
                    pushFollow(FOLLOW_sig_expr_in_kasm_st1070);
                    sig_expr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 24 :
                    // kep.g:166:11: 'SUSTAIN' sexpr= sig_expr
                    {
                    match(input,42,FOLLOW_42_in_kasm_st1091); 
                    pushFollow(FOLLOW_sig_expr_in_kasm_st1095);
                    sexpr=sig_expr();

                    state._fsp--;

                    instr = new Sustain(sexpr, null); 

                    }
                    break;
                case 25 :
                    // kep.g:168:11: 'PAR' p0= num ',' l0= addr ',' t0= num
                    {
                    match(input,43,FOLLOW_43_in_kasm_st1119); 
                    pushFollow(FOLLOW_num_in_kasm_st1124);
                    p0=num();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st1126); 
                    pushFollow(FOLLOW_addr_in_kasm_st1130);
                    l0=addr();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st1132); 
                    pushFollow(FOLLOW_num_in_kasm_st1136);
                    t0=num();

                    state._fsp--;

                    instr = new Par(l0, new ThreadID(t0, p0), null);

                    }
                    break;
                case 26 :
                    // kep.g:170:11: 'PARE' l1= addr ',' p1= num
                    {
                    match(input,44,FOLLOW_44_in_kasm_st1162); 
                    pushFollow(FOLLOW_addr_in_kasm_st1166);
                    l1=addr();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st1168); 
                    pushFollow(FOLLOW_num_in_kasm_st1173);
                    p1=num();

                    state._fsp--;

                    instr = new Pare(l1, new PrioID(p1), null); 

                    }
                    break;
                case 27 :
                    // kep.g:172:11: 'PRIO' p2= num ',' t2= num
                    {
                    match(input,45,FOLLOW_45_in_kasm_st1199); 
                    pushFollow(FOLLOW_num_in_kasm_st1203);
                    p2=num();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st1205); 
                    pushFollow(FOLLOW_num_in_kasm_st1209);
                    t2=num();

                    state._fsp--;

                    instr =new Prio(new ThreadID(t2, p2), null); 

                    }
                    break;
                case 28 :
                    // kep.g:174:11: 'PRIO' p3= num
                    {
                    match(input,45,FOLLOW_45_in_kasm_st1237); 
                    pushFollow(FOLLOW_num_in_kasm_st1241);
                    p3=num();

                    state._fsp--;

                    instr =new Prio(new ThreadID(0, p3), null); 

                    }
                    break;
                case 29 :
                    // kep.g:176:11: 'JOIN' p4= num
                    {
                    match(input,46,FOLLOW_46_in_kasm_st1280); 
                    pushFollow(FOLLOW_num_in_kasm_st1284);
                    p4=num();

                    state._fsp--;

                    instr =new Join(new PrioID(p4), null); 

                    }
                    break;
                case 30 :
                    // kep.g:179:11: 'LABORT' signal ',' addr
                    {
                    match(input,47,FOLLOW_47_in_kasm_st1325); 
                    pushFollow(FOLLOW_signal_in_kasm_st1329);
                    signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st1331); 
                    pushFollow(FOLLOW_addr_in_kasm_st1333);
                    addr();

                    state._fsp--;


                    }
                    break;
                case 31 :
                    // kep.g:180:11: 'LABORTI' signal ',' addr
                    {
                    match(input,48,FOLLOW_48_in_kasm_st1346); 
                    pushFollow(FOLLOW_signal_in_kasm_st1349);
                    signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st1351); 
                    pushFollow(FOLLOW_addr_in_kasm_st1353);
                    addr();

                    state._fsp--;


                    }
                    break;
                case 32 :
                    // kep.g:181:11: 'LWABORT' signal ',' addr
                    {
                    match(input,49,FOLLOW_49_in_kasm_st1366); 
                    pushFollow(FOLLOW_signal_in_kasm_st1369);
                    signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st1371); 
                    pushFollow(FOLLOW_addr_in_kasm_st1373);
                    addr();

                    state._fsp--;


                    }
                    break;
                case 33 :
                    // kep.g:182:11: 'LWABORTI' signal ',' addr
                    {
                    match(input,50,FOLLOW_50_in_kasm_st1386); 
                    pushFollow(FOLLOW_signal_in_kasm_st1388);
                    signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st1390); 
                    pushFollow(FOLLOW_addr_in_kasm_st1392);
                    addr();

                    state._fsp--;


                    }
                    break;
                case 34 :
                    // kep.g:184:11: 'TABORT' signal ',' addr
                    {
                    match(input,51,FOLLOW_51_in_kasm_st1406); 
                    pushFollow(FOLLOW_signal_in_kasm_st1410);
                    signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st1412); 
                    pushFollow(FOLLOW_addr_in_kasm_st1414);
                    addr();

                    state._fsp--;


                    }
                    break;
                case 35 :
                    // kep.g:185:11: 'TABORTI' signal ',' addr
                    {
                    match(input,52,FOLLOW_52_in_kasm_st1427); 
                    pushFollow(FOLLOW_signal_in_kasm_st1430);
                    signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st1432); 
                    pushFollow(FOLLOW_addr_in_kasm_st1434);
                    addr();

                    state._fsp--;


                    }
                    break;
                case 36 :
                    // kep.g:186:11: 'TWABORT' signal ',' addr
                    {
                    match(input,53,FOLLOW_53_in_kasm_st1447); 
                    pushFollow(FOLLOW_signal_in_kasm_st1450);
                    signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st1452); 
                    pushFollow(FOLLOW_addr_in_kasm_st1454);
                    addr();

                    state._fsp--;


                    }
                    break;
                case 37 :
                    // kep.g:187:11: 'TWABORTI' signal ',' addr
                    {
                    match(input,54,FOLLOW_54_in_kasm_st1467); 
                    pushFollow(FOLLOW_signal_in_kasm_st1469);
                    signal();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st1471); 
                    pushFollow(FOLLOW_addr_in_kasm_st1473);
                    addr();

                    state._fsp--;


                    }
                    break;
                case 38 :
                    // kep.g:190:11: 'JC' addr
                    {
                    match(input,55,FOLLOW_55_in_kasm_st1495); 
                    pushFollow(FOLLOW_addr_in_kasm_st1503);
                    addr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 39 :
                    // kep.g:191:11: 'JNC' addr
                    {
                    match(input,56,FOLLOW_56_in_kasm_st1517); 
                    pushFollow(FOLLOW_addr_in_kasm_st1524);
                    addr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 40 :
                    // kep.g:192:11: 'CLRC'
                    {
                    match(input,57,FOLLOW_57_in_kasm_st1538); 
                    instr = null;

                    }
                    break;
                case 41 :
                    // kep.g:193:11: 'SETC'
                    {
                    match(input,58,FOLLOW_58_in_kasm_st1552); 
                    instr = null;

                    }
                    break;
                case 42 :
                    // kep.g:194:11: 'SR' reg
                    {
                    match(input,59,FOLLOW_59_in_kasm_st1566); 
                    pushFollow(FOLLOW_reg_in_kasm_st1574);
                    reg();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 43 :
                    // kep.g:195:11: 'SRC' reg
                    {
                    match(input,60,FOLLOW_60_in_kasm_st1588); 
                    pushFollow(FOLLOW_reg_in_kasm_st1595);
                    reg();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 44 :
                    // kep.g:196:11: 'SL' reg
                    {
                    match(input,61,FOLLOW_61_in_kasm_st1609); 
                    pushFollow(FOLLOW_reg_in_kasm_st1617);
                    reg();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 45 :
                    // kep.g:197:11: 'SLC' reg
                    {
                    match(input,62,FOLLOW_62_in_kasm_st1631); 
                    pushFollow(FOLLOW_reg_in_kasm_st1638);
                    reg();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 46 :
                    // kep.g:198:11: 'NOTR' reg
                    {
                    match(input,63,FOLLOW_63_in_kasm_st1652); 
                    pushFollow(FOLLOW_reg_in_kasm_st1658);
                    reg();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 47 :
                    // kep.g:199:11: 'LOAD' r= reg_expr
                    {
                    match(input,64,FOLLOW_64_in_kasm_st1672); 
                    pushFollow(FOLLOW_reg_expr_in_kasm_st1680);
                    r=reg_expr();

                    state._fsp--;

                    instr = new Load_Data((r!=null?r.reg:null), new Data((r!=null?r.data:null)), null);

                    }
                    break;
                case 48 :
                    // kep.g:201:11: 'ADD' reg_expr
                    {
                    match(input,65,FOLLOW_65_in_kasm_st1705); 
                    pushFollow(FOLLOW_reg_expr_in_kasm_st1712);
                    reg_expr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 49 :
                    // kep.g:202:11: 'ADDC' reg_expr
                    {
                    match(input,66,FOLLOW_66_in_kasm_st1726); 
                    pushFollow(FOLLOW_reg_expr_in_kasm_st1732);
                    reg_expr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 50 :
                    // kep.g:203:11: 'SUB' reg_expr
                    {
                    match(input,67,FOLLOW_67_in_kasm_st1746); 
                    pushFollow(FOLLOW_reg_expr_in_kasm_st1753);
                    reg_expr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 51 :
                    // kep.g:204:11: 'SUBC' reg_expr
                    {
                    match(input,68,FOLLOW_68_in_kasm_st1767); 
                    pushFollow(FOLLOW_reg_expr_in_kasm_st1773);
                    reg_expr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 52 :
                    // kep.g:205:11: 'MUL' reg_expr
                    {
                    match(input,69,FOLLOW_69_in_kasm_st1787); 
                    pushFollow(FOLLOW_reg_expr_in_kasm_st1794);
                    reg_expr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 53 :
                    // kep.g:206:11: 'ANDR' reg_expr
                    {
                    match(input,70,FOLLOW_70_in_kasm_st1808); 
                    pushFollow(FOLLOW_reg_expr_in_kasm_st1814);
                    reg_expr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 54 :
                    // kep.g:207:11: 'ORR' reg_expr
                    {
                    match(input,71,FOLLOW_71_in_kasm_st1828); 
                    pushFollow(FOLLOW_reg_expr_in_kasm_st1835);
                    reg_expr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 55 :
                    // kep.g:208:11: 'XORR' reg_expr
                    {
                    match(input,72,FOLLOW_72_in_kasm_st1849); 
                    pushFollow(FOLLOW_reg_expr_in_kasm_st1855);
                    reg_expr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 56 :
                    // kep.g:209:11: 'CMP' reg_expr
                    {
                    match(input,73,FOLLOW_73_in_kasm_st1869); 
                    pushFollow(FOLLOW_reg_expr_in_kasm_st1876);
                    reg_expr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 57 :
                    // kep.g:210:11: 'CMPS' reg_expr
                    {
                    match(input,74,FOLLOW_74_in_kasm_st1890); 
                    pushFollow(FOLLOW_reg_expr_in_kasm_st1896);
                    reg_expr();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 58 :
                    // kep.g:211:11: 'DEF32' '#' data
                    {
                    match(input,75,FOLLOW_75_in_kasm_st1910); 
                    match(input,13,FOLLOW_13_in_kasm_st1915); 
                    pushFollow(FOLLOW_data_in_kasm_st1917);
                    data();

                    state._fsp--;

                    instr = null;

                    }
                    break;
                case 59 :
                    // kep.g:212:11: 'EXIT' a= addr ',' addr
                    {
                    match(input,76,FOLLOW_76_in_kasm_st1931); 
                    pushFollow(FOLLOW_addr_in_kasm_st1939);
                    a=addr();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_kasm_st1943); 
                    pushFollow(FOLLOW_addr_in_kasm_st1950);
                    addr();

                    state._fsp--;

                    instr = new Goto(a, null);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return instr;
    }
    // $ANTLR end "kasm_st"


    // $ANTLR start "sig_expr"
    // kep.g:215:1: sig_expr returns [KepSignal sig] : (s= ID | s= ID ',' '#' v= num | s= ID ',' r= reg );
    public final KepSignal sig_expr() throws RecognitionException {
        KepSignal sig = null;

        Token s=null;
        Integer v = null;

        kepParser.reg_return r = null;


        try {
            // kep.g:216:10: (s= ID | s= ID ',' '#' v= num | s= ID ',' r= reg )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==12) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==13) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==ID) ) {
                        alt8=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_1==EOF||LA8_1==ID||LA8_1==10||(LA8_1>=19 && LA8_1<=20)||(LA8_1>=22 && LA8_1<=76)) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // kep.g:216:12: s= ID
                    {
                    s=(Token)match(input,ID,FOLLOW_ID_in_sig_expr1984); 
                    sig = new KepSignal((s!=null?s.getText():null), null, signalID.get((s!=null?s.getText():null)));

                    }
                    break;
                case 2 :
                    // kep.g:217:12: s= ID ',' '#' v= num
                    {
                    s=(Token)match(input,ID,FOLLOW_ID_in_sig_expr2016); 
                    match(input,12,FOLLOW_12_in_sig_expr2018); 
                    match(input,13,FOLLOW_13_in_sig_expr2020); 
                    pushFollow(FOLLOW_num_in_sig_expr2024);
                    v=num();

                    state._fsp--;

                    sig = new KepSignal((s!=null?s.getText():null), null, signalID.get((s!=null?s.getText():null)), v);

                    }
                    break;
                case 3 :
                    // kep.g:218:12: s= ID ',' r= reg
                    {
                    s=(Token)match(input,ID,FOLLOW_ID_in_sig_expr2042); 
                    match(input,12,FOLLOW_12_in_sig_expr2044); 
                    pushFollow(FOLLOW_reg_in_sig_expr2048);
                    r=reg();

                    state._fsp--;

                    sig = new KepSignal((s!=null?s.getText():null), null, signalID.get((s!=null?s.getText():null)), (r!=null?r.reg:null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sig;
    }
    // $ANTLR end "sig_expr"


    // $ANTLR start "signal"
    // kep.g:230:1: signal returns [KepSignal signal] : (i0= ID | 'PRE' '(' i1= ID ')' );
    public final KepSignal signal() throws RecognitionException {
        KepSignal signal = null;

        Token i0=null;
        Token i1=null;

        try {
            // kep.g:231:7: (i0= ID | 'PRE' '(' i1= ID ')' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==77) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // kep.g:231:9: i0= ID
                    {
                    i0=(Token)match(input,ID,FOLLOW_ID_in_signal2157); 
                    signal = new KepSignal((i0!=null?i0.getText():null), null,signalID.get((i0!=null?i0.getText():null)), false);

                    }
                    break;
                case 2 :
                    // kep.g:232:9: 'PRE' '(' i1= ID ')'
                    {
                    match(input,77,FOLLOW_77_in_signal2183); 
                    match(input,78,FOLLOW_78_in_signal2185); 
                    i1=(Token)match(input,ID,FOLLOW_ID_in_signal2189); 
                    match(input,79,FOLLOW_79_in_signal2191); 
                    signal = new KepSignal((i0!=null?i0.getText():null), null,signalID.get((i1!=null?i1.getText():null)), true);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return signal;
    }
    // $ANTLR end "signal"

    public static class reg_expr_return extends ParserRuleReturnScope {
        public Register reg;
        public Integer data;
    };

    // $ANTLR start "reg_expr"
    // kep.g:235:1: reg_expr returns [Register reg, Integer data] : (r= reg ',' '#' d= num | reg ',' reg | reg ',' signal_val );
    public final kepParser.reg_expr_return reg_expr() throws RecognitionException {
        kepParser.reg_expr_return retval = new kepParser.reg_expr_return();
        retval.start = input.LT(1);

        kepParser.reg_return r = null;

        Integer d = null;


        try {
            // kep.g:236:7: (r= reg ',' '#' d= num | reg ',' reg | reg ',' signal_val )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==12) ) {
                    switch ( input.LA(3) ) {
                    case 13:
                        {
                        alt10=1;
                        }
                        break;
                    case 77:
                    case 80:
                        {
                        alt10=3;
                        }
                        break;
                    case ID:
                        {
                        alt10=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // kep.g:236:9: r= reg ',' '#' d= num
                    {
                    pushFollow(FOLLOW_reg_in_reg_expr2221);
                    r=reg();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_reg_expr2223); 
                    match(input,13,FOLLOW_13_in_reg_expr2225); 
                    pushFollow(FOLLOW_num_in_reg_expr2229);
                    d=num();

                    state._fsp--;

                    retval.reg =new Register((r!=null?input.toString(r.start,r.stop):null),0); retval.data =d;

                    }
                    break;
                case 2 :
                    // kep.g:237:9: reg ',' reg
                    {
                    pushFollow(FOLLOW_reg_in_reg_expr2242);
                    reg();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_reg_expr2244); 
                    pushFollow(FOLLOW_reg_in_reg_expr2246);
                    reg();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // kep.g:238:9: reg ',' signal_val
                    {
                    pushFollow(FOLLOW_reg_in_reg_expr2256);
                    reg();

                    state._fsp--;

                    match(input,12,FOLLOW_12_in_reg_expr2258); 
                    pushFollow(FOLLOW_signal_val_in_reg_expr2260);
                    signal_val();

                    state._fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reg_expr"


    // $ANTLR start "signal_val"
    // kep.g:241:1: signal_val : ( '?' signal_id | 'PRE' '(' '?' signal_id ')' );
    public final void signal_val() throws RecognitionException {
        try {
            // kep.g:241:11: ( '?' signal_id | 'PRE' '(' '?' signal_id ')' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==80) ) {
                alt11=1;
            }
            else if ( (LA11_0==77) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // kep.g:241:17: '?' signal_id
                    {
                    match(input,80,FOLLOW_80_in_signal_val2278); 
                    pushFollow(FOLLOW_signal_id_in_signal_val2284);
                    signal_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // kep.g:242:22: 'PRE' '(' '?' signal_id ')'
                    {
                    match(input,77,FOLLOW_77_in_signal_val2307); 
                    match(input,78,FOLLOW_78_in_signal_val2315); 
                    match(input,80,FOLLOW_80_in_signal_val2319); 
                    pushFollow(FOLLOW_signal_id_in_signal_val2322);
                    signal_id();

                    state._fsp--;

                    match(input,79,FOLLOW_79_in_signal_val2324); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "signal_val"


    // $ANTLR start "addr"
    // kep.g:245:1: addr returns [Label label] : i= ID ;
    public final Label addr() throws RecognitionException {
        Label label = null;

        Token i=null;

        try {
            // kep.g:245:32: (i= ID )
            // kep.g:245:34: i= ID
            {
            i=(Token)match(input,ID,FOLLOW_ID_in_addr2349); 
            label =new Label((i!=null?i.getText():null), null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return label;
    }
    // $ANTLR end "addr"

    public static class signal_id_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "signal_id"
    // kep.g:246:1: signal_id : ID ;
    public final kepParser.signal_id_return signal_id() throws RecognitionException {
        kepParser.signal_id_return retval = new kepParser.signal_id_return();
        retval.start = input.LT(1);

        try {
            // kep.g:246:11: ( ID )
            // kep.g:246:13: ID
            {
            match(input,ID,FOLLOW_ID_in_signal_id2358); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "signal_id"

    public static class reg_return extends ParserRuleReturnScope {
        public Register reg;
    };

    // $ANTLR start "reg"
    // kep.g:247:1: reg returns [Register reg] : i= ID ;
    public final kepParser.reg_return reg() throws RecognitionException {
        kepParser.reg_return retval = new kepParser.reg_return();
        retval.start = input.LT(1);

        Token i=null;

        try {
            // kep.g:247:33: (i= ID )
            // kep.g:247:35: i= ID
            {
            i=(Token)match(input,ID,FOLLOW_ID_in_reg2377); 
            retval.reg = new Register((i!=null?i.getText():null), 0);

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reg"


    // $ANTLR start "variable"
    // kep.g:248:1: variable : ID ;
    public final void variable() throws RecognitionException {
        try {
            // kep.g:248:11: ( ID )
            // kep.g:248:13: ID
            {
            match(input,ID,FOLLOW_ID_in_variable2387); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variable"


    // $ANTLR start "prio_val"
    // kep.g:249:1: prio_val : NUMBER ;
    public final void prio_val() throws RecognitionException {
        try {
            // kep.g:249:11: ( NUMBER )
            // kep.g:249:13: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_prio_val2396); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prio_val"


    // $ANTLR start "thread_id"
    // kep.g:250:1: thread_id : NUMBER ;
    public final void thread_id() throws RecognitionException {
        try {
            // kep.g:250:11: ( NUMBER )
            // kep.g:250:13: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_thread_id2403); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "thread_id"


    // $ANTLR start "data"
    // kep.g:251:1: data : NUMBER ;
    public final void data() throws RecognitionException {
        try {
            // kep.g:251:11: ( NUMBER )
            // kep.g:251:13: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_data2415); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "data"


    // $ANTLR start "watcher"
    // kep.g:252:1: watcher : NUMBER ;
    public final void watcher() throws RecognitionException {
        try {
            // kep.g:252:11: ( NUMBER )
            // kep.g:252:13: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_watcher2424); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "watcher"


    // $ANTLR start "num"
    // kep.g:339:3: num returns [Integer v] : n= NUMBER ;
    public final Integer num() throws RecognitionException {
        Integer v = null;

        Token n=null;

        try {
            // kep.g:340:7: (n= NUMBER )
            // kep.g:340:9: n= NUMBER
            {
            n=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_num2453); 
             v=Integer.parseInt((n!=null?n.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return v;
    }
    // $ANTLR end "num"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\76\uffff";
    static final String DFA7_eofS =
        "\73\uffff\1\74\2\uffff";
    static final String DFA7_minS =
        "\1\12\32\uffff\1\5\37\uffff\1\4\2\uffff";
    static final String DFA7_maxS =
        "\1\114\32\uffff\1\5\37\uffff\1\114\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\uffff\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
        "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63"+
        "\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\uffff\1\34\1\33";
    static final String DFA7_specialS =
        "\76\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\26\10\uffff\1\24\1\25\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
            "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
            "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72",
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
            "",
            "\1\73",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\5\uffff\1\74\1\uffff\1\75\6\uffff\2\74\1\uffff\67\74",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "123:1: kasm_st returns [Instruction instr] : ( 'NOTHING' | 'GOTO' a= addr | 'CALL' addr | 'RETURN' | 'PRESENT' s= signal ',' a2= addr | 'AWAIT' s1= signal | 'PAUSE' | 'AWAITI' s2= signal | 'HALT' | 'CAWAITS' | 'CAWAIT' signal ',' addr | 'CAWAITI' signal ',' addr | 'CAWAITE' addr | 'ABORT' s3= signal ',' a3= addr | 'ABORTI' s4= signal ',' a4= addr | 'WABORT' s5= signal ',' a5= addr | 'WABORTI' s6= signal ',' a6= addr | 'SUSPEND' s7= signal ',' a7= addr | 'SUSPENDI' s8= signal ',' a8= addr | 'SIGNAL' s9= signal | 'SIGNALV' s10= signal | 'EMIT' sexpr= sig_expr | 'SETV' sig_expr | 'SUSTAIN' sexpr= sig_expr | 'PAR' p0= num ',' l0= addr ',' t0= num | 'PARE' l1= addr ',' p1= num | 'PRIO' p2= num ',' t2= num | 'PRIO' p3= num | 'JOIN' p4= num | 'LABORT' signal ',' addr | 'LABORTI' signal ',' addr | 'LWABORT' signal ',' addr | 'LWABORTI' signal ',' addr | 'TABORT' signal ',' addr | 'TABORTI' signal ',' addr | 'TWABORT' signal ',' addr | 'TWABORTI' signal ',' addr | 'JC' addr | 'JNC' addr | 'CLRC' | 'SETC' | 'SR' reg | 'SRC' reg | 'SL' reg | 'SLC' reg | 'NOTR' reg | 'LOAD' r= reg_expr | 'ADD' reg_expr | 'ADDC' reg_expr | 'SUB' reg_expr | 'SUBC' reg_expr | 'MUL' reg_expr | 'ANDR' reg_expr | 'ORR' reg_expr | 'XORR' reg_expr | 'CMP' reg_expr | 'CMPS' reg_expr | 'DEF32' '#' data | 'EXIT' a= addr ',' addr );";
        }
    }
 

    public static final BitSet FOLLOW_io_expr_in_program34 = new BitSet(new long[]{0x00000000003F8400L});
    public static final BitSet FOLLOW_10_in_program53 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_program55 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_program57 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_program60 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_num_in_program64 = new BitSet(new long[]{0xFFFFFFFFFFD80412L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_kst_in_program96 = new BitSet(new long[]{0xFFFFFFFFFFD80412L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_kasm_st_in_kst115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_kst128 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_kst130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_io_expr152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sig_list_in_io_expr156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_io_expr170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sig_list_in_io_expr173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_io_expr187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sig_list_in_io_expr190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_io_expr204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sig_list_in_io_expr206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_io_expr220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sig_list_in_io_expr223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_io_expr237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sig_list_in_io_expr239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_io_expr253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_var_list_in_io_expr255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signal_id_in_sig_list297 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_sig_list314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signal_id_in_sig_list318 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_variable_in_var_list342 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_var_list346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variable_in_var_list348 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_22_in_kasm_st380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_kasm_st402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_kasm_st427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_kasm_st449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_kasm_st473 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st477 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_kasm_st527 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_kasm_st548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_kasm_st575 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_kasm_st595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_kasm_st624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_kasm_st659 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st662 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_kasm_st685 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st687 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_kasm_st710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_kasm_st743 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st749 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_kasm_st780 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st785 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_kasm_st818 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st823 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_kasm_st855 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st859 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_kasm_st901 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st906 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_kasm_st939 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st943 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_kasm_st977 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_kasm_st1011 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_kasm_st1043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sig_expr_in_kasm_st1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_kasm_st1065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sig_expr_in_kasm_st1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_kasm_st1091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sig_expr_in_kasm_st1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_kasm_st1119 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_num_in_kasm_st1124 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st1126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st1130 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st1132 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_num_in_kasm_st1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_kasm_st1162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st1166 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st1168 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_num_in_kasm_st1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_kasm_st1199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_num_in_kasm_st1203 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st1205 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_num_in_kasm_st1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_kasm_st1237 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_num_in_kasm_st1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_kasm_st1280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_num_in_kasm_st1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_kasm_st1325 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st1329 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st1331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_kasm_st1346 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st1349 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st1351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_kasm_st1366 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st1369 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st1371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_kasm_st1386 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st1388 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st1390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_kasm_st1406 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st1410 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st1412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_kasm_st1427 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st1430 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st1432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_kasm_st1447 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st1450 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st1452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_kasm_st1467 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_signal_in_kasm_st1469 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st1471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_kasm_st1495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_kasm_st1517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_kasm_st1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_kasm_st1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_kasm_st1566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_in_kasm_st1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_kasm_st1588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_in_kasm_st1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_kasm_st1609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_in_kasm_st1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_kasm_st1631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_in_kasm_st1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_kasm_st1652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_in_kasm_st1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_kasm_st1672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_expr_in_kasm_st1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_kasm_st1705 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_expr_in_kasm_st1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_kasm_st1726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_expr_in_kasm_st1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_kasm_st1746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_expr_in_kasm_st1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_kasm_st1767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_expr_in_kasm_st1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_kasm_st1787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_expr_in_kasm_st1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_kasm_st1808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_expr_in_kasm_st1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_kasm_st1828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_expr_in_kasm_st1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_kasm_st1849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_expr_in_kasm_st1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_kasm_st1869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_expr_in_kasm_st1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_kasm_st1890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_expr_in_kasm_st1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_kasm_st1910 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_kasm_st1915 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_data_in_kasm_st1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_kasm_st1931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st1939 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_kasm_st1943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addr_in_kasm_st1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_sig_expr1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_sig_expr2016 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sig_expr2018 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_sig_expr2020 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_num_in_sig_expr2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_sig_expr2042 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sig_expr2044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_in_sig_expr2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_signal2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_signal2183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_signal2185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_signal2189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_signal2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reg_in_reg_expr2221 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_reg_expr2223 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_reg_expr2225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_num_in_reg_expr2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reg_in_reg_expr2242 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_reg_expr2244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_reg_in_reg_expr2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reg_in_reg_expr2256 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_reg_expr2258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_signal_val_in_reg_expr2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_signal_val2278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signal_id_in_signal_val2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_signal_val2307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_signal_val2315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_signal_val2319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_signal_id_in_signal_val2322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_signal_val2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_addr2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_signal_id2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_reg2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_prio_val2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_thread_id2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_data2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_watcher2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_num2453 = new BitSet(new long[]{0x0000000000000002L});

}