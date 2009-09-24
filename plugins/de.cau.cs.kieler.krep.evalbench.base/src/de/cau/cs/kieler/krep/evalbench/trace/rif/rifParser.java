// $ANTLR 3.1.1 rif.g 2008-11-21 17:00:07

  package de.cau.cs.kieler.krep.evalbench.trace.rif;
  import java.util.LinkedList;
  import java.io.Reader;
  


import org.antlr.runtime.*;

import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.program.krep.*;
import de.cau.cs.kieler.krep.evalbench.trace.*;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class rifParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUMBER", "Letter", "Digit", "WHITESPACE", "COMMENT", "'#@inputs'", "'@#'", "'#@outputs'", "'#@locals'", "'\"'", "'\":'", "'bool'", "'int'", "'#step'", "'#outs'", "'#locs'", "'T'", "'F'"
    };
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int NUMBER=5;
    public static final int WHITESPACE=8;
    public static final int Digit=7;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int COMMENT=9;
    public static final int Letter=6;

    // delegates
    // delegators


        public rifParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public rifParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return rifParser.tokenNames; }
    public String getGrammarFileName() { return "rif.g"; }


      Trace trace = null;
      
       private ArrayList<String> inputs= new ArrayList<String>();
      private ArrayList<String> outputs= new ArrayList<String>();
      private int i,j;

      public static Trace parse(IAssembler asm, final Reader source) throws ParseException{
    	try {
    		Trace res = new Trace(asm);
    	    final rifLexer lex = new rifLexer(new ANTLRReaderStream(source));
    	    final CommonTokenStream tokens = new CommonTokenStream(lex);
    	    new rifParser(tokens).parse(res);
    	    return res;
    	} catch (final Error err) {
    	    throw new ParseException(err.getMessage());
    	} catch (final Exception exc) {
    	    throw new ParseException(exc.getMessage());
    	}
      }

      private void addSignal(IO io, int value){
        switch(io){
        case INPUT: trace.add(io, new Signal(inputs.get(i), true, value, i)); i++; break;
        case OUTPUT: trace.add(io, new Signal(outputs.get(j), true, value, j)); j++; break;
    	}
      }
      
      private void addName(IO io, String name){
        switch(io){
        case INPUT: inputs.add(name); break;
        case OUTPUT: outputs.add(name); break;
    	}
      }
      
      private String errorMsg = new String();
      private boolean error = false;
      
      public void emitErrorMessage(String msg) {
        errorMsg += msg + "\n";
        error = true;
        throw new Error(msg);
      }
      
      public String getErrorMsg(){
        return errorMsg;
      }



    // $ANTLR start "parse"
    // rif.g:68:1: parse[Trace trace] returns [boolean ok] : trace ;
    public final boolean parse(Trace trace) throws RecognitionException {
        boolean ok = false;

        try {
            // rif.g:68:40: ( trace )
            // rif.g:68:42: trace
            {
            error = false;this.trace=trace;
            pushFollow(FOLLOW_trace_in_parse37);
            trace();

            state._fsp--;

            return !error;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ok;
    }
    // $ANTLR end "parse"


    // $ANTLR start "trace"
    // rif.g:70:1: trace : init ( tick )* ;
    public final void trace() throws RecognitionException {
        try {
            // rif.g:70:6: ( init ( tick )* )
            // rif.g:70:8: init ( tick )*
            {
            pushFollow(FOLLOW_init_in_trace47);
            init();

            state._fsp--;

            // rif.g:70:13: ( tick )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // rif.g:70:14: tick
            	    {
            	    pushFollow(FOLLOW_tick_in_trace50);
            	    tick();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "trace"


    // $ANTLR start "init"
    // rif.g:72:1: init : '#@inputs' ( ( decl[IO.INPUT] )* ) '@#' '#@outputs' ( ( decl[IO.OUTPUT] )* ) '@#' '#@locals' ( ( decl[null] )* ) '@#' ;
    public final void init() throws RecognitionException {
        try {
            // rif.g:72:5: ( '#@inputs' ( ( decl[IO.INPUT] )* ) '@#' '#@outputs' ( ( decl[IO.OUTPUT] )* ) '@#' '#@locals' ( ( decl[null] )* ) '@#' )
            // rif.g:72:7: '#@inputs' ( ( decl[IO.INPUT] )* ) '@#' '#@outputs' ( ( decl[IO.OUTPUT] )* ) '@#' '#@locals' ( ( decl[null] )* ) '@#'
            {
            match(input,10,FOLLOW_10_in_init60); 
            // rif.g:72:18: ( ( decl[IO.INPUT] )* )
            // rif.g:72:19: ( decl[IO.INPUT] )*
            {
            // rif.g:72:19: ( decl[IO.INPUT] )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // rif.g:72:19: decl[IO.INPUT]
            	    {
            	    pushFollow(FOLLOW_decl_in_init63);
            	    decl(IO.INPUT);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            match(input,11,FOLLOW_11_in_init69); 
            match(input,12,FOLLOW_12_in_init78); 
            // rif.g:73:20: ( ( decl[IO.OUTPUT] )* )
            // rif.g:73:21: ( decl[IO.OUTPUT] )*
            {
            // rif.g:73:21: ( decl[IO.OUTPUT] )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // rif.g:73:21: decl[IO.OUTPUT]
            	    {
            	    pushFollow(FOLLOW_decl_in_init81);
            	    decl(IO.OUTPUT);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            match(input,11,FOLLOW_11_in_init86); 
            match(input,13,FOLLOW_13_in_init96); 
            // rif.g:74:19: ( ( decl[null] )* )
            // rif.g:74:20: ( decl[null] )*
            {
            // rif.g:74:20: ( decl[null] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // rif.g:74:20: decl[null]
            	    {
            	    pushFollow(FOLLOW_decl_in_init99);
            	    decl(null);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            match(input,11,FOLLOW_11_in_init105); 

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
    // $ANTLR end "init"


    // $ANTLR start "decl"
    // rif.g:76:1: decl[IO io] : '\"' n= ID '\":' type ;
    public final void decl(IO io) throws RecognitionException {
        Token n=null;

        try {
            // rif.g:76:14: ( '\"' n= ID '\":' type )
            // rif.g:76:16: '\"' n= ID '\":' type
            {
            match(input,14,FOLLOW_14_in_decl115); 
            n=(Token)match(input,ID,FOLLOW_ID_in_decl119); 
            match(input,15,FOLLOW_15_in_decl122); 
            pushFollow(FOLLOW_type_in_decl124);
            type();

            state._fsp--;

            addName(io, (n!=null?n.getText():null));

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
    // $ANTLR end "decl"


    // $ANTLR start "type"
    // rif.g:78:1: type : ( 'bool' | 'int' );
    public final void type() throws RecognitionException {
        try {
            // rif.g:78:6: ( 'bool' | 'int' )
            // rif.g:
            {
            if ( (input.LA(1)>=16 && input.LA(1)<=17) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "type"


    // $ANTLR start "tick"
    // rif.g:81:1: tick : '#step' num () ( data[IO.INPUT] )* '#outs' ( data[IO.OUTPUT] )* '#locs' ( data[null] )* ;
    public final void tick() throws RecognitionException {
        try {
            // rif.g:81:6: ( '#step' num () ( data[IO.INPUT] )* '#outs' ( data[IO.OUTPUT] )* '#locs' ( data[null] )* )
            // rif.g:81:8: '#step' num () ( data[IO.INPUT] )* '#outs' ( data[IO.OUTPUT] )* '#locs' ( data[null] )*
            {
            match(input,18,FOLLOW_18_in_tick158); 
            pushFollow(FOLLOW_num_in_tick161);
            num();

            state._fsp--;

            // rif.g:81:20: ()
            // rif.g:81:21: 
            {
            }

            i=0; j=0;trace.startTick();
            // rif.g:81:53: ( data[IO.INPUT] )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==NUMBER||(LA5_0>=21 && LA5_0<=22)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // rif.g:81:53: data[IO.INPUT]
            	    {
            	    pushFollow(FOLLOW_data_in_tick167);
            	    data(IO.INPUT);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_tick181); 
            // rif.g:82:18: ( data[IO.OUTPUT] )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==NUMBER||(LA6_0>=21 && LA6_0<=22)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // rif.g:82:18: data[IO.OUTPUT]
            	    {
            	    pushFollow(FOLLOW_data_in_tick183);
            	    data(IO.OUTPUT);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,20,FOLLOW_20_in_tick197); 
            // rif.g:83:18: ( data[null] )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==NUMBER||(LA7_0>=21 && LA7_0<=22)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // rif.g:83:18: data[null]
            	    {
            	    pushFollow(FOLLOW_data_in_tick199);
            	    data(null);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "tick"


    // $ANTLR start "data"
    // rif.g:85:1: data[IO io] : (v= num | 'T' | 'F' );
    public final void data(IO io) throws RecognitionException {
        Integer v = null;


        try {
            // rif.g:85:12: (v= num | 'T' | 'F' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // rif.g:85:16: v= num
                    {
                    pushFollow(FOLLOW_num_in_data214);
                    v=num();

                    state._fsp--;

                    addSignal(io, v);

                    }
                    break;
                case 2 :
                    // rif.g:86:11: 'T'
                    {
                    match(input,21,FOLLOW_21_in_data228); 
                    addSignal(io, 1);

                    }
                    break;
                case 3 :
                    // rif.g:87:11: 'F'
                    {
                    match(input,22,FOLLOW_22_in_data243); 
                    addSignal(io, 0);

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
    // $ANTLR end "data"


    // $ANTLR start "num"
    // rif.g:89:2: num returns [Integer v] : n= NUMBER ;
    public final Integer num() throws RecognitionException {
        Integer v = null;

        Token n=null;

        try {
            // rif.g:90:7: (n= NUMBER )
            // rif.g:90:9: n= NUMBER
            {
            n=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_num275); 
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


 

    public static final BitSet FOLLOW_trace_in_parse37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_in_trace47 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_tick_in_trace50 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10_in_init60 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_decl_in_init63 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11_in_init69 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_init78 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_decl_in_init81 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11_in_init86 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_init96 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_decl_in_init99 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11_in_init105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_decl115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_decl119 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_decl122 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_type_in_decl124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_tick158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_num_in_tick161 = new BitSet(new long[]{0x0000000000680020L});
    public static final BitSet FOLLOW_data_in_tick167 = new BitSet(new long[]{0x0000000000680020L});
    public static final BitSet FOLLOW_19_in_tick181 = new BitSet(new long[]{0x0000000000700020L});
    public static final BitSet FOLLOW_data_in_tick183 = new BitSet(new long[]{0x0000000000700020L});
    public static final BitSet FOLLOW_20_in_tick197 = new BitSet(new long[]{0x0000000000600022L});
    public static final BitSet FOLLOW_data_in_tick199 = new BitSet(new long[]{0x0000000000600022L});
    public static final BitSet FOLLOW_num_in_data214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_data228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_data243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_num275 = new BitSet(new long[]{0x0000000000000002L});

}