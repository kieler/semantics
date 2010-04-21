// $ANTLR 3.1.1 de/cau/cs/kieler/krep/compiler/parser/scade.g 2010-04-21 14:45:31

            
  package de.cau.cs.kieler.krep.compiler.parser;
  import java.util.LinkedList;
  
 import org.antlr.runtime.*;
 import java.util.Stack;
 import java.util.List;
 import java.util.ArrayList;

import de.cau.cs.kieler.krep.compiler.ceq.Automaton;
import de.cau.cs.kieler.krep.compiler.ceq.BinOpExpression;
import de.cau.cs.kieler.krep.compiler.ceq.ConstExpression;
import de.cau.cs.kieler.krep.compiler.ceq.Equation;
import de.cau.cs.kieler.krep.compiler.ceq.Program;
import de.cau.cs.kieler.krep.compiler.ceq.Expression;
import de.cau.cs.kieler.krep.compiler.ceq.ScadeProgram;
import de.cau.cs.kieler.krep.compiler.ceq.Scope;
import de.cau.cs.kieler.krep.compiler.ceq.State;
import de.cau.cs.kieler.krep.compiler.ceq.Transition;
import de.cau.cs.kieler.krep.compiler.ceq.VarAccessExpression;
import de.cau.cs.kieler.krep.compiler.ceq.Variable;
import de.cau.cs.kieler.krep.compiler.ceq.Variable.Kind;
import de.cau.cs.kieler.krep.compiler.util.Type;
import de.cau.cs.kieler.krep.compiler.lustre.Operator;

  import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class scadeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUMBER", "Letter", "Digit", "WHITESPACE", "COMMENT", "'::'", "'bool'", "'int'", "','", "':'", "'\\''", "'when'", "'default'", "'='", "'last'", "'node'", "'returns'", "'('", "';'", "')'", "'let'", "'tel'", "'sig'", "'var'", "'..'", "'_'", "'emit'", "'if'", "'automaton'", "'initial'", "'final'", "'state'", "'unless'", "'until'", "'synchro'", "'end'", "'elsif'", "'else'", "'restart'", "'resume'", "'do'", "'{'", "'}'", "'not'", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'div'", "'<>'", "'<'", "'>'", "'<='", "'>='", "'and'", "'or'", "'xor'", "'real'", "'with'", "'['", "']'", "'.'"
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
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int Letter=6;

    // delegates
    // delegators


        public scadeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public scadeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return scadeParser.tokenNames; }
    public String getGrammarFileName() { return "de/cau/cs/kieler/krep/compiler/parser/scade.g"; }


      ScadeProgram main;
      

     // LinkedList<Variable> inputs = new LinkedList<Variable>();

     
      private LinkedList<Variable> toVar(LinkedList<String> vars, Kind io, Type t){
          LinkedList<Variable> res = new LinkedList<Variable>();
          for(String v: vars){
              res.add(main.getVar(v, io, t));
          }
          return res;
      }

      public void setProg(ScadeProgram main){
        this.main=main;
      }



    // $ANTLR start "program"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:56:1: program : user_op_decl ;
    public final void program() throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:56:9: ( user_op_decl )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:56:11: user_op_decl
            {
            pushFollow(FOLLOW_user_op_decl_in_program31);
            user_op_decl();

            state._fsp--;


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


    // $ANTLR start "path"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:59:1: path : ID ( '::' ID )* ;
    public final void path() throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:59:6: ( ID ( '::' ID )* )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:59:8: ID ( '::' ID )*
            {
            match(input,ID,FOLLOW_ID_in_path41); 
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:59:11: ( '::' ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==10) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==ID) ) {
                        int LA1_2 = input.LA(3);

                        if ( (LA1_2==10) ) {
                            alt1=1;
                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:59:12: '::' ID
            	    {
            	    match(input,10,FOLLOW_10_in_path44); 
            	    match(input,ID,FOLLOW_ID_in_path46); 

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
    // $ANTLR end "path"


    // $ANTLR start "path_id"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:60:1: path_id : ( path '::' )? ID ;
    public final void path_id() throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:60:9: ( ( path '::' )? ID )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:60:11: ( path '::' )? ID
            {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:60:11: ( path '::' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==10) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:60:12: path '::'
                    {
                    pushFollow(FOLLOW_path_in_path_id57);
                    path();

                    state._fsp--;

                    match(input,10,FOLLOW_10_in_path_id59); 

                    }
                    break;

            }

            match(input,ID,FOLLOW_ID_in_path_id63); 

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
    // $ANTLR end "path_id"


    // $ANTLR start "type_expr"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:65:1: type_expr returns [Type type] : ( 'bool' | 'int' );
    public final Type type_expr() throws RecognitionException {
        Type type = null;

        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:66:5: ( 'bool' | 'int' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:66:7: 'bool'
                    {
                    match(input,11,FOLLOW_11_in_type_expr83); 
                     type =Type.BOOL; 

                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:67:7: 'int'
                    {
                    match(input,12,FOLLOW_12_in_type_expr94); 
                     type =Type.INT; 

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
        return type;
    }
    // $ANTLR end "type_expr"

    public static class var_decls_return extends ParserRuleReturnScope {
        public LinkedList<String> vars;
        public Type type;
    };

    // $ANTLR start "var_decls"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:73:1: var_decls returns [LinkedList<String> vars, Type type] : v= var_id ( ',' v= var_id )* ':' t= type_expr ( when_decl )? ( default_decl )? ( last_decl )? ;
    public final scadeParser.var_decls_return var_decls() throws RecognitionException {
        scadeParser.var_decls_return retval = new scadeParser.var_decls_return();
        retval.start = input.LT(1);

        String v = null;

        Type t = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:74:5: (v= var_id ( ',' v= var_id )* ':' t= type_expr ( when_decl )? ( default_decl )? ( last_decl )? )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:74:7: v= var_id ( ',' v= var_id )* ':' t= type_expr ( when_decl )? ( default_decl )? ( last_decl )?
            {
            retval.vars = new LinkedList<String>();
            pushFollow(FOLLOW_var_id_in_var_decls143);
            v=var_id();

            state._fsp--;

             retval.vars.add(v); 
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:76:9: ( ',' v= var_id )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:76:10: ',' v= var_id
            	    {
            	    match(input,13,FOLLOW_13_in_var_decls157); 
            	    pushFollow(FOLLOW_var_id_in_var_decls161);
            	    v=var_id();

            	    state._fsp--;

            	     retval.vars.add(v); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_var_decls176); 
            pushFollow(FOLLOW_type_expr_in_var_decls180);
            t=type_expr();

            state._fsp--;

            retval.type =t;
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:77:42: ( when_decl )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:77:42: when_decl
                    {
                    pushFollow(FOLLOW_when_decl_in_var_decls184);
                    when_decl();

                    state._fsp--;


                    }
                    break;

            }

            // de/cau/cs/kieler/krep/compiler/parser/scade.g:77:53: ( default_decl )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:77:53: default_decl
                    {
                    pushFollow(FOLLOW_default_decl_in_var_decls187);
                    default_decl();

                    state._fsp--;


                    }
                    break;

            }

            // de/cau/cs/kieler/krep/compiler/parser/scade.g:77:67: ( last_decl )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:77:67: last_decl
                    {
                    pushFollow(FOLLOW_last_decl_in_var_decls190);
                    last_decl();

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "var_decls"


    // $ANTLR start "var_id"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:81:1: var_id returns [String id] : ( '\\'' )? n= ID ;
    public final String var_id() throws RecognitionException {
        String id = null;

        Token n=null;

        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:82:5: ( ( '\\'' )? n= ID )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:82:7: ( '\\'' )? n= ID
            {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:82:7: ( '\\'' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:82:7: '\\''
                    {
                    match(input,15,FOLLOW_15_in_var_id219); 

                    }
                    break;

            }

            n=(Token)match(input,ID,FOLLOW_ID_in_var_id224); 
            id = (n!=null?n.getText():null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "var_id"


    // $ANTLR start "when_decl"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:85:1: when_decl : 'when' clock_expr ;
    public final void when_decl() throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:85:11: ( 'when' clock_expr )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:85:13: 'when' clock_expr
            {
            match(input,16,FOLLOW_16_in_when_decl239); 
            pushFollow(FOLLOW_clock_expr_in_when_decl241);
            clock_expr();

            state._fsp--;


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
    // $ANTLR end "when_decl"


    // $ANTLR start "default_decl"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:86:1: default_decl : 'default' '=' expr ;
    public final void default_decl() throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:86:14: ( 'default' '=' expr )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:86:16: 'default' '=' expr
            {
            match(input,17,FOLLOW_17_in_default_decl248); 
            match(input,18,FOLLOW_18_in_default_decl250); 
            pushFollow(FOLLOW_expr_in_default_decl252);
            expr();

            state._fsp--;


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
    // $ANTLR end "default_decl"


    // $ANTLR start "last_decl"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:87:1: last_decl : 'last' '=' expr ;
    public final void last_decl() throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:87:14: ( 'last' '=' expr )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:87:16: 'last' '=' expr
            {
            match(input,19,FOLLOW_19_in_last_decl262); 
            match(input,18,FOLLOW_18_in_last_decl264); 
            pushFollow(FOLLOW_expr_in_last_decl266);
            expr();

            state._fsp--;


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
    // $ANTLR end "last_decl"


    // $ANTLR start "user_op_decl"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:91:1: user_op_decl : 'node' id= ID in= params[Kind.INPUT] 'returns' out= params[Kind.OUTPUT] opt_body[main] ;
    public final void user_op_decl() throws RecognitionException {
        Token id=null;
        LinkedList<Variable> in = null;

        LinkedList<Variable> out = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:92:5: ( 'node' id= ID in= params[Kind.INPUT] 'returns' out= params[Kind.OUTPUT] opt_body[main] )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:92:7: 'node' id= ID in= params[Kind.INPUT] 'returns' out= params[Kind.OUTPUT] opt_body[main]
            {
            match(input,20,FOLLOW_20_in_user_op_decl285); 
            id=(Token)match(input,ID,FOLLOW_ID_in_user_op_decl289); 
             main.setName((id!=null?id.getText():null)); 
            pushFollow(FOLLOW_params_in_user_op_decl304);
            in=params(Kind.INPUT);

            state._fsp--;

            main.add(in); 
            match(input,21,FOLLOW_21_in_user_op_decl318); 
            pushFollow(FOLLOW_params_in_user_op_decl322);
            out=params(Kind.OUTPUT);

            state._fsp--;

            main.add(out); 
            pushFollow(FOLLOW_opt_body_in_user_op_decl337);
            opt_body(main);

            state._fsp--;


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
    // $ANTLR end "user_op_decl"


    // $ANTLR start "params"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:99:1: params[Kind io] returns [LinkedList<Variable> vars] : '(' (v= var_decls ( ';' v= var_decls )* )? ')' ;
    public final LinkedList<Variable> params(Kind io) throws RecognitionException {
        LinkedList<Variable> vars = null;

        scadeParser.var_decls_return v = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:100:5: ( '(' (v= var_decls ( ';' v= var_decls )* )? ')' )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:100:7: '(' (v= var_decls ( ';' v= var_decls )* )? ')'
            {
             vars =new LinkedList<Variable>(); 
            match(input,22,FOLLOW_22_in_params375); 
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:101:13: (v= var_decls ( ';' v= var_decls )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID||LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:101:14: v= var_decls ( ';' v= var_decls )*
                    {
                    pushFollow(FOLLOW_var_decls_in_params380);
                    v=var_decls();

                    state._fsp--;

                    vars.addAll(toVar((v!=null?v.vars:null), io, (v!=null?v.type:null)));
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:102:13: ( ';' v= var_decls )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==23) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:102:14: ';' v= var_decls
                    	    {
                    	    match(input,23,FOLLOW_23_in_params397); 
                    	    pushFollow(FOLLOW_var_decls_in_params401);
                    	    v=var_decls();

                    	    state._fsp--;

                    	    vars.addAll(toVar((v!=null?v.vars:null), io, (v!=null?v.type:null)));

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,24,FOLLOW_24_in_params411); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return vars;
    }
    // $ANTLR end "params"


    // $ANTLR start "opt_body"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:109:1: opt_body[Scope scope] : ( ';' | equation[scope] ';' | (s= signal_block )? (l= local_block )? 'let' ( equation[scope] ';' )* 'tel' ( ';' )? );
    public final void opt_body(Scope scope) throws RecognitionException {
        LinkedList<Variable> s = null;

        LinkedList<Variable> l = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:109:23: ( ';' | equation[scope] ';' | (s= signal_block )? (l= local_block )? 'let' ( equation[scope] ';' )* 'tel' ( ';' )? )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt15=1;
                }
                break;
            case ID:
            case 22:
            case 30:
            case 31:
            case 33:
                {
                alt15=2;
                }
                break;
            case 25:
            case 27:
            case 28:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:109:25: ';'
                    {
                    match(input,23,FOLLOW_23_in_opt_body429); 

                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:110:6: equation[scope] ';'
                    {
                    pushFollow(FOLLOW_equation_in_opt_body436);
                    equation(scope);

                    state._fsp--;

                    match(input,23,FOLLOW_23_in_opt_body439); 

                    }
                    break;
                case 3 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:111:6: (s= signal_block )? (l= local_block )? 'let' ( equation[scope] ';' )* 'tel' ( ';' )?
                    {
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:111:6: (s= signal_block )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==27) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // de/cau/cs/kieler/krep/compiler/parser/scade.g:111:7: s= signal_block
                            {
                            pushFollow(FOLLOW_signal_block_in_opt_body449);
                            s=signal_block();

                            state._fsp--;

                            scope.add(s);

                            }
                            break;

                    }

                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:112:13: (l= local_block )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==28) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // de/cau/cs/kieler/krep/compiler/parser/scade.g:112:14: l= local_block
                            {
                            pushFollow(FOLLOW_local_block_in_opt_body472);
                            l=local_block();

                            state._fsp--;

                            scope.add(l); 

                            }
                            break;

                    }

                    match(input,25,FOLLOW_25_in_opt_body491); 
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:113:18: ( equation[scope] ';' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==ID||LA13_0==22||(LA13_0>=30 && LA13_0<=31)||LA13_0==33) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:113:19: equation[scope] ';'
                    	    {
                    	    pushFollow(FOLLOW_equation_in_opt_body494);
                    	    equation(scope);

                    	    state._fsp--;

                    	    match(input,23,FOLLOW_23_in_opt_body497); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match(input,26,FOLLOW_26_in_opt_body501); 
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:113:47: ( ';' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==23) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // de/cau/cs/kieler/krep/compiler/parser/scade.g:113:47: ';'
                            {
                            match(input,23,FOLLOW_23_in_opt_body503); 

                            }
                            break;

                    }


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
    // $ANTLR end "opt_body"


    // $ANTLR start "data_def"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:116:1: data_def[Scope scope] : ( equation[scope] ';' | sscope[scope] );
    public final void data_def(Scope scope) throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:117:5: ( equation[scope] ';' | sscope[scope] )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID||LA16_0==22||(LA16_0>=30 && LA16_0<=31)||LA16_0==33) ) {
                alt16=1;
            }
            else if ( (LA16_0==21||LA16_0==25||(LA16_0>=27 && LA16_0<=28)||LA16_0==32||(LA16_0>=34 && LA16_0<=36)||LA16_0==38||(LA16_0>=43 && LA16_0<=44)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:117:7: equation[scope] ';'
                    {
                    pushFollow(FOLLOW_equation_in_data_def526);
                    equation(scope);

                    state._fsp--;

                    match(input,23,FOLLOW_23_in_data_def529); 

                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:118:7: sscope[scope]
                    {
                    pushFollow(FOLLOW_sscope_in_data_def537);
                    sscope(scope);

                    state._fsp--;


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
    // $ANTLR end "data_def"


    // $ANTLR start "sscope"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:122:1: sscope[Scope scope] : (s= signal_block )? (l= local_block )? ( eqs[scope] )? ;
    public final void sscope(Scope scope) throws RecognitionException {
        LinkedList<Variable> s = null;

        LinkedList<Variable> l = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:123:5: ( (s= signal_block )? (l= local_block )? ( eqs[scope] )? )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:123:7: (s= signal_block )? (l= local_block )? ( eqs[scope] )?
            {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:123:7: (s= signal_block )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:123:8: s= signal_block
                    {
                    pushFollow(FOLLOW_signal_block_in_sscope569);
                    s=signal_block();

                    state._fsp--;

                     scope.add(s);

                    }
                    break;

            }

            // de/cau/cs/kieler/krep/compiler/parser/scade.g:124:9: (l= local_block )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:124:10: l= local_block
                    {
                    pushFollow(FOLLOW_local_block_in_sscope588);
                    l=local_block();

                    state._fsp--;

                    scope.add(l);

                    }
                    break;

            }

            // de/cau/cs/kieler/krep/compiler/parser/scade.g:125:9: ( eqs[scope] )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:125:9: eqs[scope]
                    {
                    pushFollow(FOLLOW_eqs_in_sscope604);
                    eqs(scope);

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "sscope"


    // $ANTLR start "signal_block"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:127:1: signal_block returns [LinkedList<Variable> sigs] : 'sig' id= ID ( ',' id= ID )* ';' ;
    public final LinkedList<Variable> signal_block() throws RecognitionException {
        LinkedList<Variable> sigs = null;

        Token id=null;

        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:128:5: ( 'sig' id= ID ( ',' id= ID )* ';' )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:128:7: 'sig' id= ID ( ',' id= ID )* ';'
            {
             sigs = new LinkedList<Variable>(); 
            match(input,27,FOLLOW_27_in_signal_block637); 
            id=(Token)match(input,ID,FOLLOW_ID_in_signal_block641); 
             sigs.add(new Variable((id!=null?id.getText():null), Kind.LOCAL, Type.BOOL));
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:130:9: ( ',' id= ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:130:10: ',' id= ID
            	    {
            	    match(input,13,FOLLOW_13_in_signal_block654); 
            	    id=(Token)match(input,ID,FOLLOW_ID_in_signal_block658); 
            	     sigs.add(new Variable((id!=null?id.getText():null), Kind.LOCAL, Type.BOOL)); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_signal_block666); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sigs;
    }
    // $ANTLR end "signal_block"


    // $ANTLR start "local_block"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:133:1: local_block returns [LinkedList<Variable> vars] : 'var' (v= var_decls ';' )* ;
    public final LinkedList<Variable> local_block() throws RecognitionException {
        LinkedList<Variable> vars = null;

        scadeParser.var_decls_return v = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:134:5: ( 'var' (v= var_decls ';' )* )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:134:7: 'var' (v= var_decls ';' )*
            {
            vars =new LinkedList<Variable>();
            match(input,28,FOLLOW_28_in_local_block697); 
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:135:15: (v= var_decls ';' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ID||LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:135:17: v= var_decls ';'
            	    {
            	    pushFollow(FOLLOW_var_decls_in_local_block703);
            	    v=var_decls();

            	    state._fsp--;

            	    vars.addAll(toVar((v!=null?v.vars:null), Kind.LOCAL, (v!=null?v.type:null)));
            	    match(input,23,FOLLOW_23_in_local_block707); 

            	    }
            	    break;

            	default :
            	    break loop21;
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
        return vars;
    }
    // $ANTLR end "local_block"


    // $ANTLR start "eqs"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:138:1: eqs[Scope scope] : 'let' ( equation[scope] ';' )* 'tel' ;
    public final void eqs(Scope scope) throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:139:5: ( 'let' ( equation[scope] ';' )* 'tel' )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:139:7: 'let' ( equation[scope] ';' )* 'tel'
            {
            match(input,25,FOLLOW_25_in_eqs727); 
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:139:13: ( equation[scope] ';' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ID||LA22_0==22||(LA22_0>=30 && LA22_0<=31)||LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:139:14: equation[scope] ';'
            	    {
            	    pushFollow(FOLLOW_equation_in_eqs730);
            	    equation(scope);

            	    state._fsp--;

            	    match(input,23,FOLLOW_23_in_eqs733); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match(input,26,FOLLOW_26_in_eqs737); 

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
    // $ANTLR end "eqs"


    // $ANTLR start "equation"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:141:1: equation[Scope scope] : (eq= simple_equation | em= emission | a= state_machine 'returns' '..' );
    public final void equation(Scope scope) throws RecognitionException {
        Equation eq = null;

        LinkedList<Equation> em = null;

        Automaton a = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:142:5: (eq= simple_equation | em= emission | a= state_machine 'returns' '..' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case ID:
            case 22:
            case 30:
                {
                alt23=1;
                }
                break;
            case 31:
                {
                alt23=2;
                }
                break;
            case 33:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:142:7: eq= simple_equation
                    {
                    pushFollow(FOLLOW_simple_equation_in_equation755);
                    eq=simple_equation();

                    state._fsp--;

                     scope.add(eq); 

                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:143:7: em= emission
                    {
                    pushFollow(FOLLOW_emission_in_equation767);
                    em=emission();

                    state._fsp--;

                     scope.addEq(em); 

                    }
                    break;
                case 3 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:144:7: a= state_machine 'returns' '..'
                    {
                    pushFollow(FOLLOW_state_machine_in_equation780);
                    a=state_machine();

                    state._fsp--;

                    scope.add(a);
                    match(input,21,FOLLOW_21_in_equation784); 
                    match(input,29,FOLLOW_29_in_equation786); 

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
    // $ANTLR end "equation"


    // $ANTLR start "simple_equation"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:147:1: simple_equation returns [Equation eq] : id= lhs '=' e= expr ;
    public final Equation simple_equation() throws RecognitionException {
        Equation eq = null;

        scadeParser.lhs_return id = null;

        Expression e = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:148:5: (id= lhs '=' e= expr )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:148:7: id= lhs '=' e= expr
            {
            pushFollow(FOLLOW_lhs_in_simple_equation810);
            id=lhs();

            state._fsp--;

            match(input,18,FOLLOW_18_in_simple_equation812); 
            pushFollow(FOLLOW_expr_in_simple_equation816);
            e=expr();

            state._fsp--;

            eq = new Equation((id!=null?input.toString(id.start,id.stop):null), e); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return eq;
    }
    // $ANTLR end "simple_equation"

    public static class lhs_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "lhs"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:151:1: lhs : ( '(' ')' | lhs_id ( ',' lhs_id )* );
    public final scadeParser.lhs_return lhs() throws RecognitionException {
        scadeParser.lhs_return retval = new scadeParser.lhs_return();
        retval.start = input.LT(1);

        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:152:5: ( '(' ')' | lhs_id ( ',' lhs_id )* )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            else if ( (LA25_0==ID||LA25_0==30) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:152:7: '(' ')'
                    {
                    match(input,22,FOLLOW_22_in_lhs849); 
                    match(input,24,FOLLOW_24_in_lhs851); 

                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:153:7: lhs_id ( ',' lhs_id )*
                    {
                    pushFollow(FOLLOW_lhs_id_in_lhs860);
                    lhs_id();

                    state._fsp--;

                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:153:14: ( ',' lhs_id )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==13) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:153:15: ',' lhs_id
                    	    {
                    	    match(input,13,FOLLOW_13_in_lhs863); 
                    	    pushFollow(FOLLOW_lhs_id_in_lhs865);
                    	    lhs_id();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


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
    // $ANTLR end "lhs"


    // $ANTLR start "lhs_id"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:156:1: lhs_id : ( ID | '_' );
    public final void lhs_id() throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:156:8: ( ID | '_' )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:
            {
            if ( input.LA(1)==ID||input.LA(1)==30 ) {
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
    // $ANTLR end "lhs_id"


    // $ANTLR start "emission"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:157:1: emission returns [LinkedList<Equation> eqs] : 'emit' e= emission_body ;
    public final LinkedList<Equation> emission() throws RecognitionException {
        LinkedList<Equation> eqs = null;

        scadeParser.emission_body_return e = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:158:5: ( 'emit' e= emission_body )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:158:7: 'emit' e= emission_body
            {
            eqs = new LinkedList<Equation>(); 
            match(input,31,FOLLOW_31_in_emission910); 
            pushFollow(FOLLOW_emission_body_in_emission914);
            e=emission_body();

            state._fsp--;


                      for(String s:(e!=null?e.ids:null)){
                      eqs.add(new Equation(s, (e!=null?e.expr:null)==null?new ConstExpression("True",1, main):(e!=null?e.expr:null)));
                                     
                      } ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return eqs;
    }
    // $ANTLR end "emission"

    public static class emission_body_return extends ParserRuleReturnScope {
        public LinkedList<String> ids;
        public Expression expr;
    };

    // $ANTLR start "emission_body"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:166:1: emission_body returns [LinkedList<String> ids, Expression expr] : ( '\\'' id= ID ( 'if' e= expr )? | '(' '\\'' id= ID ( ',' '\\'' id= ID ) ')' ( 'if' e= expr )? );
    public final scadeParser.emission_body_return emission_body() throws RecognitionException {
        scadeParser.emission_body_return retval = new scadeParser.emission_body_return();
        retval.start = input.LT(1);

        Token id=null;
        Expression e = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:168:5: ( '\\'' id= ID ( 'if' e= expr )? | '(' '\\'' id= ID ( ',' '\\'' id= ID ) ')' ( 'if' e= expr )? )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==15) ) {
                alt28=1;
            }
            else if ( (LA28_0==22) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:168:7: '\\'' id= ID ( 'if' e= expr )?
                    {
                    retval.ids =new LinkedList<String>(); 
                    match(input,15,FOLLOW_15_in_emission_body960); 
                    id=(Token)match(input,ID,FOLLOW_ID_in_emission_body963); 
                    retval.ids.add((id!=null?id.getText():null));
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:170:9: ( 'if' e= expr )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==32) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // de/cau/cs/kieler/krep/compiler/parser/scade.g:170:11: 'if' e= expr
                            {
                            match(input,32,FOLLOW_32_in_emission_body978); 
                            pushFollow(FOLLOW_expr_in_emission_body982);
                            e=expr();

                            state._fsp--;

                            retval.expr =e;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:171:7: '(' '\\'' id= ID ( ',' '\\'' id= ID ) ')' ( 'if' e= expr )?
                    {
                     retval.ids =new LinkedList<String>(); 
                    match(input,22,FOLLOW_22_in_emission_body1004); 
                    match(input,15,FOLLOW_15_in_emission_body1006); 
                    id=(Token)match(input,ID,FOLLOW_ID_in_emission_body1010); 
                    retval.ids.add((id!=null?id.getText():null));
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:173:9: ( ',' '\\'' id= ID )
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:173:10: ',' '\\'' id= ID
                    {
                    match(input,13,FOLLOW_13_in_emission_body1024); 
                    match(input,15,FOLLOW_15_in_emission_body1026); 
                    id=(Token)match(input,ID,FOLLOW_ID_in_emission_body1030); 
                    retval.ids.add((id!=null?id.getText():null));

                    }

                    match(input,24,FOLLOW_24_in_emission_body1035); 
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:174:9: ( 'if' e= expr )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==32) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // de/cau/cs/kieler/krep/compiler/parser/scade.g:174:10: 'if' e= expr
                            {
                            match(input,32,FOLLOW_32_in_emission_body1047); 
                            pushFollow(FOLLOW_expr_in_emission_body1051);
                            e=expr();

                            state._fsp--;

                            retval.expr =e;

                            }
                            break;

                    }


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
    // $ANTLR end "emission_body"


    // $ANTLR start "state_machine"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:176:1: state_machine returns [Automaton a] : 'automaton' id= ID ( state_decl[a] )+ ;
    public final Automaton state_machine() throws RecognitionException {
        Automaton a = null;

        Token id=null;

        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:177:5: ( 'automaton' id= ID ( state_decl[a] )+ )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:177:7: 'automaton' id= ID ( state_decl[a] )+
            {
            match(input,33,FOLLOW_33_in_state_machine1071); 
            id=(Token)match(input,ID,FOLLOW_ID_in_state_machine1075); 
            a = new Automaton((id!=null?id.getText():null));
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:177:56: ( state_decl[a] )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=34 && LA29_0<=36)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:177:56: state_decl[a]
            	    {
            	    pushFollow(FOLLOW_state_decl_in_state_machine1079);
            	    state_decl(a);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "state_machine"


    // $ANTLR start "state_decl"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:180:1: state_decl[Automaton a] : (init= 'initial' )? ( 'final' )? 'state' id= ID ( 'unless' (t= transition[s] ';' )+ )? data_def[s] ( 'until' (t= transition[s] ';' )* ( 'synchro' ( actions[s] )? fork[s] ';' )? )? ;
    public final void state_decl(Automaton a) throws RecognitionException {
        Token init=null;
        Token id=null;
        Transition t = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:181:5: ( (init= 'initial' )? ( 'final' )? 'state' id= ID ( 'unless' (t= transition[s] ';' )+ )? data_def[s] ( 'until' (t= transition[s] ';' )* ( 'synchro' ( actions[s] )? fork[s] ';' )? )? )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:181:7: (init= 'initial' )? ( 'final' )? 'state' id= ID ( 'unless' (t= transition[s] ';' )+ )? data_def[s] ( 'until' (t= transition[s] ';' )* ( 'synchro' ( actions[s] )? fork[s] ';' )? )?
            {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:181:11: (init= 'initial' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:181:11: init= 'initial'
                    {
                    init=(Token)match(input,34,FOLLOW_34_in_state_decl1105); 

                    }
                    break;

            }

            // de/cau/cs/kieler/krep/compiler/parser/scade.g:181:23: ( 'final' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:181:23: 'final'
                    {
                    match(input,35,FOLLOW_35_in_state_decl1108); 

                    }
                    break;

            }

            match(input,36,FOLLOW_36_in_state_decl1111); 
            id=(Token)match(input,ID,FOLLOW_ID_in_state_decl1115); 
            State s = new State((id!=null?id.getText():null), init!=null);
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:183:9: ( 'unless' (t= transition[s] ';' )+ )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:183:10: 'unless' (t= transition[s] ';' )+
                    {
                    match(input,37,FOLLOW_37_in_state_decl1138); 
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:183:19: (t= transition[s] ';' )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==32) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:183:20: t= transition[s] ';'
                    	    {
                    	    pushFollow(FOLLOW_transition_in_state_decl1143);
                    	    t=transition(s);

                    	    state._fsp--;

                    	    s.addSAbort(t);
                    	    match(input,23,FOLLOW_23_in_state_decl1148); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);


                    }
                    break;

            }

            pushFollow(FOLLOW_data_def_in_state_decl1162);
            data_def(s);

            state._fsp--;

            // de/cau/cs/kieler/krep/compiler/parser/scade.g:185:9: ( 'until' (t= transition[s] ';' )* ( 'synchro' ( actions[s] )? fork[s] ';' )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:185:10: 'until' (t= transition[s] ';' )* ( 'synchro' ( actions[s] )? fork[s] ';' )?
                    {
                    match(input,38,FOLLOW_38_in_state_decl1174); 
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:185:18: (t= transition[s] ';' )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==32) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:185:19: t= transition[s] ';'
                    	    {
                    	    pushFollow(FOLLOW_transition_in_state_decl1179);
                    	    t=transition(s);

                    	    state._fsp--;

                    	    s.addWAbort(t);
                    	    match(input,23,FOLLOW_23_in_state_decl1184); 

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:186:13: ( 'synchro' ( actions[s] )? fork[s] ';' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==39) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // de/cau/cs/kieler/krep/compiler/parser/scade.g:186:14: 'synchro' ( actions[s] )? fork[s] ';'
                            {
                            match(input,39,FOLLOW_39_in_state_decl1202); 
                            // de/cau/cs/kieler/krep/compiler/parser/scade.g:186:24: ( actions[s] )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==45) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:186:24: actions[s]
                                    {
                                    pushFollow(FOLLOW_actions_in_state_decl1204);
                                    actions(s);

                                    state._fsp--;


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_fork_in_state_decl1208);
                            fork(s);

                            state._fsp--;

                            match(input,23,FOLLOW_23_in_state_decl1211); 

                            }
                            break;

                    }


                    }
                    break;

            }

             a.add(s); 

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
    // $ANTLR end "state_decl"


    // $ANTLR start "transition"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:189:1: transition[Scope scope] returns [Transition trans] : 'if' trigger= expr t= arrow[scope] ;
    public final Transition transition(Scope scope) throws RecognitionException {
        Transition trans = null;

        Expression trigger = null;

        String t = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:190:5: ( 'if' trigger= expr t= arrow[scope] )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:190:7: 'if' trigger= expr t= arrow[scope]
            {
            match(input,32,FOLLOW_32_in_transition1246); 
            pushFollow(FOLLOW_expr_in_transition1250);
            trigger=expr();

            state._fsp--;

            pushFollow(FOLLOW_arrow_in_transition1254);
            t=arrow(scope);

            state._fsp--;

            trans =new Transition(trigger, t); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return trans;
    }
    // $ANTLR end "transition"


    // $ANTLR start "arrow"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:192:1: arrow[Scope scope] returns [String target] : ( actions[scope] )? s= fork[scope] ;
    public final String arrow(Scope scope) throws RecognitionException {
        String target = null;

        String s = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:193:5: ( ( actions[scope] )? s= fork[scope] )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:193:8: ( actions[scope] )? s= fork[scope]
            {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:193:8: ( actions[scope] )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:193:8: actions[scope]
                    {
                    pushFollow(FOLLOW_actions_in_arrow1275);
                    actions(scope);

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_fork_in_arrow1281);
            s=fork(scope);

            state._fsp--;

            target =s; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return target;
    }
    // $ANTLR end "arrow"


    // $ANTLR start "fork"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:195:1: fork[Scope scope] returns [String target] : (t= target | 'if' expr arrow[scope] ( elsif_fork[scope] )* ( else_fork[scope] )? 'end' );
    public final String fork(Scope scope) throws RecognitionException {
        String target = null;

        String t = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:196:5: (t= target | 'if' expr arrow[scope] ( elsif_fork[scope] )* ( else_fork[scope] )? 'end' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=43 && LA41_0<=44)) ) {
                alt41=1;
            }
            else if ( (LA41_0==32) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:196:7: t= target
                    {
                    pushFollow(FOLLOW_target_in_fork1303);
                    t=target();

                    state._fsp--;

                    target =t;

                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:197:7: 'if' expr arrow[scope] ( elsif_fork[scope] )* ( else_fork[scope] )? 'end'
                    {
                    match(input,32,FOLLOW_32_in_fork1313); 
                    pushFollow(FOLLOW_expr_in_fork1315);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_arrow_in_fork1317);
                    arrow(scope);

                    state._fsp--;

                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:197:30: ( elsif_fork[scope] )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==41) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:197:30: elsif_fork[scope]
                    	    {
                    	    pushFollow(FOLLOW_elsif_fork_in_fork1320);
                    	    elsif_fork(scope);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:197:50: ( else_fork[scope] )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==42) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // de/cau/cs/kieler/krep/compiler/parser/scade.g:197:50: else_fork[scope]
                            {
                            pushFollow(FOLLOW_else_fork_in_fork1325);
                            else_fork(scope);

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,40,FOLLOW_40_in_fork1329); 

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
        return target;
    }
    // $ANTLR end "fork"


    // $ANTLR start "elsif_fork"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:199:1: elsif_fork[Scope scope] : 'elsif' expr arrow[scope] ;
    public final void elsif_fork(Scope scope) throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:200:5: ( 'elsif' expr arrow[scope] )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:200:7: 'elsif' expr arrow[scope]
            {
            match(input,41,FOLLOW_41_in_elsif_fork1342); 
            pushFollow(FOLLOW_expr_in_elsif_fork1344);
            expr();

            state._fsp--;

            pushFollow(FOLLOW_arrow_in_elsif_fork1346);
            arrow(scope);

            state._fsp--;


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
    // $ANTLR end "elsif_fork"


    // $ANTLR start "else_fork"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:201:1: else_fork[Scope scope] : 'else' arrow[scope] ;
    public final void else_fork(Scope scope) throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:202:5: ( 'else' arrow[scope] )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:202:7: 'else' arrow[scope]
            {
            match(input,42,FOLLOW_42_in_else_fork1359); 
            pushFollow(FOLLOW_arrow_in_else_fork1361);
            arrow(scope);

            state._fsp--;


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
    // $ANTLR end "else_fork"


    // $ANTLR start "target"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:204:1: target returns [String t] : ( 'restart' id= ID | 'resume' id= ID );
    public final String target() throws RecognitionException {
        String t = null;

        Token id=null;

        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:205:5: ( 'restart' id= ID | 'resume' id= ID )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            else if ( (LA42_0==44) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:205:7: 'restart' id= ID
                    {
                    match(input,43,FOLLOW_43_in_target1378); 
                    id=(Token)match(input,ID,FOLLOW_ID_in_target1382); 
                    t =(id!=null?id.getText():null); 

                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:206:7: 'resume' id= ID
                    {
                    match(input,44,FOLLOW_44_in_target1392); 
                    id=(Token)match(input,ID,FOLLOW_ID_in_target1396); 
                    t =(id!=null?id.getText():null); 

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
        return t;
    }
    // $ANTLR end "target"


    // $ANTLR start "actions"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:209:1: actions[Scope scope] : ( 'do' '{' ( 'emit' )? emission_body ( ';' ( 'emit' )? emission_body )* '}' | 'do' data_def[scope] );
    public final void actions(Scope scope) throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:210:5: ( 'do' '{' ( 'emit' )? emission_body ( ';' ( 'emit' )? emission_body )* '}' | 'do' data_def[scope] )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==45) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==46) ) {
                    alt46=1;
                }
                else if ( (LA46_1==ID||LA46_1==22||LA46_1==25||(LA46_1>=27 && LA46_1<=28)||(LA46_1>=30 && LA46_1<=33)||(LA46_1>=43 && LA46_1<=44)) ) {
                    alt46=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:210:7: 'do' '{' ( 'emit' )? emission_body ( ';' ( 'emit' )? emission_body )* '}'
                    {
                    match(input,45,FOLLOW_45_in_actions1416); 
                    match(input,46,FOLLOW_46_in_actions1418); 
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:210:16: ( 'emit' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==31) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // de/cau/cs/kieler/krep/compiler/parser/scade.g:210:16: 'emit'
                            {
                            match(input,31,FOLLOW_31_in_actions1420); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_emission_body_in_actions1423);
                    emission_body();

                    state._fsp--;

                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:210:38: ( ';' ( 'emit' )? emission_body )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==23) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:210:39: ';' ( 'emit' )? emission_body
                    	    {
                    	    match(input,23,FOLLOW_23_in_actions1426); 
                    	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:210:43: ( 'emit' )?
                    	    int alt44=2;
                    	    int LA44_0 = input.LA(1);

                    	    if ( (LA44_0==31) ) {
                    	        alt44=1;
                    	    }
                    	    switch (alt44) {
                    	        case 1 :
                    	            // de/cau/cs/kieler/krep/compiler/parser/scade.g:210:43: 'emit'
                    	            {
                    	            match(input,31,FOLLOW_31_in_actions1428); 

                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_emission_body_in_actions1431);
                    	    emission_body();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    match(input,47,FOLLOW_47_in_actions1435); 

                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:211:7: 'do' data_def[scope]
                    {
                    match(input,45,FOLLOW_45_in_actions1443); 
                    pushFollow(FOLLOW_data_def_in_actions1445);
                    data_def(scope);

                    state._fsp--;


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
    // $ANTLR end "actions"


    // $ANTLR start "clock_expr"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:214:1: clock_expr : ( ID | 'not' ID );
    public final void clock_expr() throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:215:5: ( ID | 'not' ID )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ID) ) {
                alt47=1;
            }
            else if ( (LA47_0==48) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:215:7: ID
                    {
                    match(input,ID,FOLLOW_ID_in_clock_expr1467); 

                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:215:12: 'not' ID
                    {
                    match(input,48,FOLLOW_48_in_clock_expr1471); 
                    match(input,ID,FOLLOW_ID_in_clock_expr1473); 

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
    // $ANTLR end "clock_expr"


    // $ANTLR start "expr"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:218:1: expr returns [Expression expr] : a= atom (op= bin_op b= atom )? ;
    public final Expression expr() throws RecognitionException {
        Expression expr = null;

        Expression a = null;

        Operator op = null;

        Expression b = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:219:5: (a= atom (op= bin_op b= atom )? )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:219:8: a= atom (op= bin_op b= atom )?
            {
            pushFollow(FOLLOW_atom_in_expr1500);
            a=atom();

            state._fsp--;

             expr = a; 
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:220:13: (op= bin_op b= atom )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==18||(LA48_0>=51 && LA48_0<=64)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:220:14: op= bin_op b= atom
                    {
                    pushFollow(FOLLOW_bin_op_in_expr1523);
                    op=bin_op();

                    state._fsp--;

                    pushFollow(FOLLOW_atom_in_expr1527);
                    b=atom();

                    state._fsp--;

                    expr =new BinOpExpression(expr.toString(), expr, b, op, main);

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "expr"


    // $ANTLR start "atom"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:228:1: atom returns [Expression expr] : (a= bool_atom | n= num | id= id_expr );
    public final Expression atom() throws RecognitionException {
        Expression expr = null;

        Expression a = null;

        int n = 0;

        Expression id = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:229:5: (a= bool_atom | n= num | id= id_expr )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 49:
            case 50:
                {
                alt49=1;
                }
                break;
            case NUMBER:
                {
                alt49=2;
                }
                break;
            case ID:
            case 15:
            case 19:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:229:7: a= bool_atom
                    {
                    pushFollow(FOLLOW_bool_atom_in_atom1580);
                    a=bool_atom();

                    state._fsp--;

                     expr = a; 

                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:230:7: n= num
                    {
                    pushFollow(FOLLOW_num_in_atom1592);
                    n=num();

                    state._fsp--;

                     expr = new ConstExpression("NUMBER", n, main); 

                    }
                    break;
                case 3 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:231:7: id= id_expr
                    {
                    pushFollow(FOLLOW_id_expr_in_atom1604);
                    id=id_expr();

                    state._fsp--;

                     expr = id; 

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
        return expr;
    }
    // $ANTLR end "atom"


    // $ANTLR start "num"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:234:1: num returns [int val] : n= NUMBER ;
    public final int num() throws RecognitionException {
        int val = 0;

        Token n=null;

        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:234:23: (n= NUMBER )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:234:25: n= NUMBER
            {
            n=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_num1626); 
             val =Integer.parseInt((n!=null?n.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "num"


    // $ANTLR start "bool_atom"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:236:1: bool_atom returns [Expression expr] : ( 'true' | 'false' );
    public final Expression bool_atom() throws RecognitionException {
        Expression expr = null;

        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:237:5: ( 'true' | 'false' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==49) ) {
                alt50=1;
            }
            else if ( (LA50_0==50) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:237:7: 'true'
                    {
                    match(input,49,FOLLOW_49_in_bool_atom1646); 
                     expr = new ConstExpression("TRUE", true, main); 

                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:238:7: 'false'
                    {
                    match(input,50,FOLLOW_50_in_bool_atom1660); 
                     expr = new ConstExpression("False", false, main); 

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
        return expr;
    }
    // $ANTLR end "bool_atom"


    // $ANTLR start "id_expr"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:241:1: id_expr returns [Expression expr] : (v= var | 'last' v= var );
    public final Expression id_expr() throws RecognitionException {
        Expression expr = null;

        Variable v = null;


        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:242:5: (v= var | 'last' v= var )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ID||LA51_0==15) ) {
                alt51=1;
            }
            else if ( (LA51_0==19) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:242:8: v= var
                    {
                    pushFollow(FOLLOW_var_in_id_expr1691);
                    v=var();

                    state._fsp--;

                     expr = new VarAccessExpression(v, false, main); 

                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:243:7: 'last' v= var
                    {
                    match(input,19,FOLLOW_19_in_id_expr1701); 
                    pushFollow(FOLLOW_var_in_id_expr1705);
                    v=var();

                    state._fsp--;

                     expr = new VarAccessExpression(v, true, main); 

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
        return expr;
    }
    // $ANTLR end "id_expr"


    // $ANTLR start "var"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:246:1: var returns [Variable var] : ( '\\'' )? id= ID ;
    public final Variable var() throws RecognitionException {
        Variable var = null;

        Token id=null;

        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:247:5: ( ( '\\'' )? id= ID )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:247:7: ( '\\'' )? id= ID
            {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:247:7: ( '\\'' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==15) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:247:7: '\\''
                    {
                    match(input,15,FOLLOW_15_in_var1730); 

                    }
                    break;

            }

            id=(Token)match(input,ID,FOLLOW_ID_in_var1737); 
             var = main.getVar((id!=null?id.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return var;
    }
    // $ANTLR end "var"


    // $ANTLR start "bin_op"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:260:1: bin_op returns [Operator op] : ( '+' | '-' | '*' | '/' | 'mod' | 'div' | '=' | '<>' | '<' | '>' | '<=' | '>=' | 'and' | 'or' | 'xor' );
    public final Operator bin_op() throws RecognitionException {
        Operator op = null;

        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:261:5: ( '+' | '-' | '*' | '/' | 'mod' | 'div' | '=' | '<>' | '<' | '>' | '<=' | '>=' | 'and' | 'or' | 'xor' )
            int alt53=15;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt53=1;
                }
                break;
            case 52:
                {
                alt53=2;
                }
                break;
            case 53:
                {
                alt53=3;
                }
                break;
            case 54:
                {
                alt53=4;
                }
                break;
            case 55:
                {
                alt53=5;
                }
                break;
            case 56:
                {
                alt53=6;
                }
                break;
            case 18:
                {
                alt53=7;
                }
                break;
            case 57:
                {
                alt53=8;
                }
                break;
            case 58:
                {
                alt53=9;
                }
                break;
            case 59:
                {
                alt53=10;
                }
                break;
            case 60:
                {
                alt53=11;
                }
                break;
            case 61:
                {
                alt53=12;
                }
                break;
            case 62:
                {
                alt53=13;
                }
                break;
            case 63:
                {
                alt53=14;
                }
                break;
            case 64:
                {
                alt53=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:261:7: '+'
                    {
                    match(input,51,FOLLOW_51_in_bin_op1770); 
                     op =Operator.ADD; 

                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:262:7: '-'
                    {
                    match(input,52,FOLLOW_52_in_bin_op1780); 
                     op =Operator.SUB; 

                    }
                    break;
                case 3 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:263:7: '*'
                    {
                    match(input,53,FOLLOW_53_in_bin_op1790); 
                     op =Operator.MUL; 

                    }
                    break;
                case 4 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:264:7: '/'
                    {
                    match(input,54,FOLLOW_54_in_bin_op1800); 
                     op =Operator.DIV; 

                    }
                    break;
                case 5 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:265:7: 'mod'
                    {
                    match(input,55,FOLLOW_55_in_bin_op1810); 

                    }
                    break;
                case 6 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:266:7: 'div'
                    {
                    match(input,56,FOLLOW_56_in_bin_op1819); 
                     op =Operator.DIV; 

                    }
                    break;
                case 7 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:267:7: '='
                    {
                    match(input,18,FOLLOW_18_in_bin_op1829); 
                     op =Operator.EQ; 

                    }
                    break;
                case 8 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:268:7: '<>'
                    {
                    match(input,57,FOLLOW_57_in_bin_op1841); 
                     op =Operator.NEQ; 

                    }
                    break;
                case 9 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:269:7: '<'
                    {
                    match(input,58,FOLLOW_58_in_bin_op1851); 
                     op =Operator.LT; 

                    }
                    break;
                case 10 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:270:7: '>'
                    {
                    match(input,59,FOLLOW_59_in_bin_op1861); 
                     op =Operator.GT; 

                    }
                    break;
                case 11 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:271:7: '<='
                    {
                    match(input,60,FOLLOW_60_in_bin_op1871); 
                     op =Operator.LE; 

                    }
                    break;
                case 12 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:272:7: '>='
                    {
                    match(input,61,FOLLOW_61_in_bin_op1881); 
                     op =Operator.GE; 

                    }
                    break;
                case 13 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:273:8: 'and'
                    {
                    match(input,62,FOLLOW_62_in_bin_op1892); 
                     op =Operator.AND; 

                    }
                    break;
                case 14 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:274:7: 'or'
                    {
                    match(input,63,FOLLOW_63_in_bin_op1902); 
                     op =Operator.OR; 

                    }
                    break;
                case 15 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:275:7: 'xor'
                    {
                    match(input,64,FOLLOW_64_in_bin_op1912); 
                     op =Operator.XOR; 

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
        return op;
    }
    // $ANTLR end "bin_op"


    // $ANTLR start "unary_arith_op"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:276:1: unary_arith_op : ( '-' | '+' | 'int' | 'real' );
    public final void unary_arith_op() throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:276:16: ( '-' | '+' | 'int' | 'real' )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:
            {
            if ( input.LA(1)==12||(input.LA(1)>=51 && input.LA(1)<=52)||input.LA(1)==65 ) {
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
    // $ANTLR end "unary_arith_op"


    // $ANTLR start "mixed_constructor"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:286:1: mixed_constructor : '(' expr 'with' ( label_or_index )+ '=' expr ')' ;
    public final void mixed_constructor() throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:286:19: ( '(' expr 'with' ( label_or_index )+ '=' expr ')' )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:286:21: '(' expr 'with' ( label_or_index )+ '=' expr ')'
            {
            match(input,22,FOLLOW_22_in_mixed_constructor1949); 
            pushFollow(FOLLOW_expr_in_mixed_constructor1951);
            expr();

            state._fsp--;

            match(input,66,FOLLOW_66_in_mixed_constructor1953); 
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:286:37: ( label_or_index )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==67||LA54_0==69) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // de/cau/cs/kieler/krep/compiler/parser/scade.g:286:37: label_or_index
            	    {
            	    pushFollow(FOLLOW_label_or_index_in_mixed_constructor1955);
            	    label_or_index();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            match(input,18,FOLLOW_18_in_mixed_constructor1958); 
            pushFollow(FOLLOW_expr_in_mixed_constructor1960);
            expr();

            state._fsp--;

            match(input,24,FOLLOW_24_in_mixed_constructor1962); 

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
    // $ANTLR end "mixed_constructor"


    // $ANTLR start "label_expr"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:287:1: label_expr : ID ':' expr ;
    public final void label_expr() throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:287:12: ( ID ':' expr )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:287:14: ID ':' expr
            {
            match(input,ID,FOLLOW_ID_in_label_expr1969); 
            match(input,14,FOLLOW_14_in_label_expr1971); 
            pushFollow(FOLLOW_expr_in_label_expr1973);
            expr();

            state._fsp--;


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
    // $ANTLR end "label_expr"


    // $ANTLR start "index"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:288:1: index : '[' expr ']' ;
    public final void index() throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:288:7: ( '[' expr ']' )
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:288:9: '[' expr ']'
            {
            match(input,67,FOLLOW_67_in_index1980); 
            pushFollow(FOLLOW_expr_in_index1982);
            expr();

            state._fsp--;

            match(input,68,FOLLOW_68_in_index1984); 

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
    // $ANTLR end "index"


    // $ANTLR start "label_or_index"
    // de/cau/cs/kieler/krep/compiler/parser/scade.g:289:1: label_or_index : ( '.' ID | index );
    public final void label_or_index() throws RecognitionException {
        try {
            // de/cau/cs/kieler/krep/compiler/parser/scade.g:289:16: ( '.' ID | index )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==69) ) {
                alt55=1;
            }
            else if ( (LA55_0==67) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:289:18: '.' ID
                    {
                    match(input,69,FOLLOW_69_in_label_or_index1991); 
                    match(input,ID,FOLLOW_ID_in_label_or_index1993); 

                    }
                    break;
                case 2 :
                    // de/cau/cs/kieler/krep/compiler/parser/scade.g:290:18: index
                    {
                    pushFollow(FOLLOW_index_in_label_or_index2012);
                    index();

                    state._fsp--;


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
    // $ANTLR end "label_or_index"

    // Delegated rules


 

    public static final BitSet FOLLOW_user_op_decl_in_program31 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_path41 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_path44 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_path46 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_path_in_path_id57 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_path_id59 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_path_id63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_type_expr83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_type_expr94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_id_in_var_decls143 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_var_decls157 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_var_id_in_var_decls161 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_var_decls176 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_type_expr_in_var_decls180 = new BitSet(new long[]{0x00000000000B0002L});
    public static final BitSet FOLLOW_when_decl_in_var_decls184 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_default_decl_in_var_decls187 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_last_decl_in_var_decls190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_var_id219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_var_id224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_when_decl239 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_clock_expr_in_when_decl241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_default_decl248 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_default_decl250 = new BitSet(new long[]{0x0006000000088030L});
    public static final BitSet FOLLOW_expr_in_default_decl252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_last_decl262 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_last_decl264 = new BitSet(new long[]{0x0006000000088030L});
    public static final BitSet FOLLOW_expr_in_last_decl266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_user_op_decl285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_user_op_decl289 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_params_in_user_op_decl304 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_user_op_decl318 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_params_in_user_op_decl322 = new BitSet(new long[]{0x00000002DAC00010L});
    public static final BitSet FOLLOW_opt_body_in_user_op_decl337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_params375 = new BitSet(new long[]{0x0000000001008010L});
    public static final BitSet FOLLOW_var_decls_in_params380 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_params397 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_var_decls_in_params401 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_params411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_opt_body429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equation_in_opt_body436 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_opt_body439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signal_block_in_opt_body449 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_local_block_in_opt_body472 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_opt_body491 = new BitSet(new long[]{0x00000002C4400010L});
    public static final BitSet FOLLOW_equation_in_opt_body494 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_opt_body497 = new BitSet(new long[]{0x00000002C4400010L});
    public static final BitSet FOLLOW_26_in_opt_body501 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_opt_body503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equation_in_data_def526 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_data_def529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sscope_in_data_def537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signal_block_in_sscope569 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_local_block_in_sscope588 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_eqs_in_sscope604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_signal_block637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_signal_block641 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_13_in_signal_block654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_signal_block658 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_23_in_signal_block666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_local_block697 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_var_decls_in_local_block703 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_local_block707 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_25_in_eqs727 = new BitSet(new long[]{0x00000002C4400010L});
    public static final BitSet FOLLOW_equation_in_eqs730 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_eqs733 = new BitSet(new long[]{0x00000002C4400010L});
    public static final BitSet FOLLOW_26_in_eqs737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_equation_in_equation755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emission_in_equation767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_state_machine_in_equation780 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_equation784 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_equation786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_simple_equation810 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_simple_equation812 = new BitSet(new long[]{0x0006000000088030L});
    public static final BitSet FOLLOW_expr_in_simple_equation816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_lhs849 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_lhs851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_id_in_lhs860 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_lhs863 = new BitSet(new long[]{0x0000000040400010L});
    public static final BitSet FOLLOW_lhs_id_in_lhs865 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_set_in_lhs_id0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_emission910 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_emission_body_in_emission914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_emission_body960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_emission_body963 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_emission_body978 = new BitSet(new long[]{0x0006000000088030L});
    public static final BitSet FOLLOW_expr_in_emission_body982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_emission_body1004 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_emission_body1006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_emission_body1010 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_emission_body1024 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_emission_body1026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_emission_body1030 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_emission_body1035 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_emission_body1047 = new BitSet(new long[]{0x0006000000088030L});
    public static final BitSet FOLLOW_expr_in_emission_body1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_state_machine1071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_state_machine1075 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_state_decl_in_state_machine1079 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_34_in_state_decl1105 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_state_decl1108 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_state_decl1111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_state_decl1115 = new BitSet(new long[]{0x00000022DA400010L});
    public static final BitSet FOLLOW_37_in_state_decl1138 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_transition_in_state_decl1143 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_state_decl1148 = new BitSet(new long[]{0x00000023DA400010L});
    public static final BitSet FOLLOW_data_def_in_state_decl1162 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_state_decl1174 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_transition_in_state_decl1179 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_state_decl1184 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_39_in_state_decl1202 = new BitSet(new long[]{0x0000380100000000L});
    public static final BitSet FOLLOW_actions_in_state_decl1204 = new BitSet(new long[]{0x0000380100000000L});
    public static final BitSet FOLLOW_fork_in_state_decl1208 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_state_decl1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_transition1246 = new BitSet(new long[]{0x0006000000088030L});
    public static final BitSet FOLLOW_expr_in_transition1250 = new BitSet(new long[]{0x0000380100000000L});
    public static final BitSet FOLLOW_arrow_in_transition1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actions_in_arrow1275 = new BitSet(new long[]{0x0000380100000000L});
    public static final BitSet FOLLOW_fork_in_arrow1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_target_in_fork1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_fork1313 = new BitSet(new long[]{0x0006000000088030L});
    public static final BitSet FOLLOW_expr_in_fork1315 = new BitSet(new long[]{0x0000380100000000L});
    public static final BitSet FOLLOW_arrow_in_fork1317 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_elsif_fork_in_fork1320 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_else_fork_in_fork1325 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fork1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_elsif_fork1342 = new BitSet(new long[]{0x0006000000088030L});
    public static final BitSet FOLLOW_expr_in_elsif_fork1344 = new BitSet(new long[]{0x0000380100000000L});
    public static final BitSet FOLLOW_arrow_in_elsif_fork1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_else_fork1359 = new BitSet(new long[]{0x0000380100000000L});
    public static final BitSet FOLLOW_arrow_in_else_fork1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_target1378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_target1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_target1392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_target1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_actions1416 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_actions1418 = new BitSet(new long[]{0x0000000080408000L});
    public static final BitSet FOLLOW_31_in_actions1420 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_emission_body_in_actions1423 = new BitSet(new long[]{0x0000800000800000L});
    public static final BitSet FOLLOW_23_in_actions1426 = new BitSet(new long[]{0x0000000080408000L});
    public static final BitSet FOLLOW_31_in_actions1428 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_emission_body_in_actions1431 = new BitSet(new long[]{0x0000800000800000L});
    public static final BitSet FOLLOW_47_in_actions1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_actions1443 = new BitSet(new long[]{0x00000022DA400010L});
    public static final BitSet FOLLOW_data_def_in_actions1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_clock_expr1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_clock_expr1471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_clock_expr1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_expr1500 = new BitSet(new long[]{0xFFF8000000040002L,0x0000000000000001L});
    public static final BitSet FOLLOW_bin_op_in_expr1523 = new BitSet(new long[]{0x0006000000088030L});
    public static final BitSet FOLLOW_atom_in_expr1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_atom_in_atom1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_in_atom1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_expr_in_atom1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_num1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_bool_atom1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_bool_atom1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_id_expr1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_id_expr1701 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_var_in_id_expr1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_var1730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_var1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_bin_op1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_bin_op1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_bin_op1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_bin_op1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_bin_op1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_bin_op1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_bin_op1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_bin_op1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_bin_op1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_bin_op1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_bin_op1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_bin_op1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_bin_op1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_bin_op1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_bin_op1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unary_arith_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_mixed_constructor1949 = new BitSet(new long[]{0x0006000000088030L});
    public static final BitSet FOLLOW_expr_in_mixed_constructor1951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_mixed_constructor1953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_label_or_index_in_mixed_constructor1955 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000028L});
    public static final BitSet FOLLOW_18_in_mixed_constructor1958 = new BitSet(new long[]{0x0006000000088030L});
    public static final BitSet FOLLOW_expr_in_mixed_constructor1960 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_mixed_constructor1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label_expr1969 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_label_expr1971 = new BitSet(new long[]{0x0006000000088030L});
    public static final BitSet FOLLOW_expr_in_label_expr1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_index1980 = new BitSet(new long[]{0x0006000000088030L});
    public static final BitSet FOLLOW_expr_in_index1982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_index1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_label_or_index1991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_label_or_index1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_index_in_label_or_index2012 = new BitSet(new long[]{0x0000000000000002L});

}