package de.cau.cs.kieler.sim.eso.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.sim.eso.services.EsoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEsoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ALPHANUMSPECIAL", "RULE_INT", "RULE_STRING", "RULE_FLOAT", "RULE_BOOL", "RULE_SPECIAL", "RULE_WS", "'!'", "'reset'", "';'", "'%'", "'Output:'", "'Output'", "':'", "'%%'", "'('", "')'", "'='"
    };
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=8;
    public static final int RULE_FLOAT=7;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int RULE_SPECIAL=9;
    public static final int T__13=13;
    public static final int RULE_ALPHANUMSPECIAL=4;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalEsoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEsoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEsoParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private EsoGrammarAccess grammarAccess;
     	
        public InternalEsoParser(TokenStream input, EsoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "tracelist";	
       	}
       	
       	@Override
       	protected EsoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuletracelist"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:73:1: entryRuletracelist returns [EObject current=null] : iv_ruletracelist= ruletracelist EOF ;
    public final EObject entryRuletracelist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletracelist = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:74:2: (iv_ruletracelist= ruletracelist EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:75:2: iv_ruletracelist= ruletracelist EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTracelistRule()); 
            }
            pushFollow(FOLLOW_ruletracelist_in_entryRuletracelist81);
            iv_ruletracelist=ruletracelist();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletracelist; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletracelist91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletracelist"


    // $ANTLR start "ruletracelist"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:82:1: ruletracelist returns [EObject current=null] : ( (lv_traces_0_0= ruletrace ) )+ ;
    public final EObject ruletracelist() throws RecognitionException {
        EObject current = null;

        EObject lv_traces_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:85:28: ( ( (lv_traces_0_0= ruletrace ) )+ )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:86:1: ( (lv_traces_0_0= ruletrace ) )+
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:86:1: ( (lv_traces_0_0= ruletrace ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:87:1: (lv_traces_0_0= ruletrace )
            	    {
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:87:1: (lv_traces_0_0= ruletrace )
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:88:3: lv_traces_0_0= ruletrace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTracelistAccess().getTracesTraceParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruletrace_in_ruletracelist136);
            	    lv_traces_0_0=ruletrace();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTracelistRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"traces",
            	              		lv_traces_0_0, 
            	              		"trace");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletracelist"


    // $ANTLR start "entryRuletrace"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:112:1: entryRuletrace returns [EObject current=null] : iv_ruletrace= ruletrace EOF ;
    public final EObject entryRuletrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletrace = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:113:2: (iv_ruletrace= ruletrace EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:114:2: iv_ruletrace= ruletrace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceRule()); 
            }
            pushFollow(FOLLOW_ruletrace_in_entryRuletrace172);
            iv_ruletrace=ruletrace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletrace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletrace182); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletrace"


    // $ANTLR start "ruletrace"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:121:1: ruletrace returns [EObject current=null] : (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+ ) ;
    public final EObject ruletrace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ticks_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:124:28: ( (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+ ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:125:1: (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+ )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:125:1: (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+ )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:125:3: otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruletrace219); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTraceAccess().getExclamationMarkKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruletrace231); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTraceAccess().getResetKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruletrace243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTraceAccess().getSemicolonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:137:1: ( (lv_ticks_3_0= ruletick ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ALPHANUMSPECIAL||(LA2_0>=13 && LA2_0<=14)||LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:138:1: (lv_ticks_3_0= ruletick )
            	    {
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:138:1: (lv_ticks_3_0= ruletick )
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:139:3: lv_ticks_3_0= ruletick
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTraceAccess().getTicksTickParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruletick_in_ruletrace264);
            	    lv_ticks_3_0=ruletick();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTraceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ticks",
            	              		lv_ticks_3_0, 
            	              		"tick");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletrace"


    // $ANTLR start "entryRuletick"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:163:1: entryRuletick returns [EObject current=null] : iv_ruletick= ruletick EOF ;
    public final EObject entryRuletick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletick = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:164:2: (iv_ruletick= ruletick EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:165:2: iv_ruletick= ruletick EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTickRule()); 
            }
            pushFollow(FOLLOW_ruletick_in_entryRuletick301);
            iv_ruletick=ruletick();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletick; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletick311); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletick"


    // $ANTLR start "ruletick"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:172:1: ruletick returns [EObject current=null] : ( () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) ) ( (lv_output_6_0= rulesignal ) )* )? ( (lv_extraInfos_7_0= rulekvpair ) )* (otherlv_8= '%%' (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) ) ( (lv_extraInfosOutput_12_0= rulekvpair ) )* )? otherlv_13= ';' ) ;
    public final EObject ruletick() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_input_1_0 = null;

        EObject lv_output_6_0 = null;

        EObject lv_extraInfos_7_0 = null;

        EObject lv_extraInfosOutput_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:175:28: ( ( () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) ) ( (lv_output_6_0= rulesignal ) )* )? ( (lv_extraInfos_7_0= rulekvpair ) )* (otherlv_8= '%%' (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) ) ( (lv_extraInfosOutput_12_0= rulekvpair ) )* )? otherlv_13= ';' ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:176:1: ( () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) ) ( (lv_output_6_0= rulesignal ) )* )? ( (lv_extraInfos_7_0= rulekvpair ) )* (otherlv_8= '%%' (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) ) ( (lv_extraInfosOutput_12_0= rulekvpair ) )* )? otherlv_13= ';' )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:176:1: ( () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) ) ( (lv_output_6_0= rulesignal ) )* )? ( (lv_extraInfos_7_0= rulekvpair ) )* (otherlv_8= '%%' (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) ) ( (lv_extraInfosOutput_12_0= rulekvpair ) )* )? otherlv_13= ';' )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:176:2: () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) ) ( (lv_output_6_0= rulesignal ) )* )? ( (lv_extraInfos_7_0= rulekvpair ) )* (otherlv_8= '%%' (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) ) ( (lv_extraInfosOutput_12_0= rulekvpair ) )* )? otherlv_13= ';'
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:176:2: ()
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:177:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTickAccess().getTickAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:185:2: ( (lv_input_1_0= rulesignal ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ALPHANUMSPECIAL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:186:1: (lv_input_1_0= rulesignal )
            	    {
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:186:1: (lv_input_1_0= rulesignal )
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:187:3: lv_input_1_0= rulesignal
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTickAccess().getInputSignalParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulesignal_in_ruletick369);
            	    lv_input_1_0=rulesignal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTickRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"input",
            	              		lv_input_1_0, 
            	              		"signal");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:203:3: (otherlv_2= '%' (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) ) ( (lv_output_6_0= rulesignal ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:203:5: otherlv_2= '%' (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) ) ( (lv_output_6_0= rulesignal ) )*
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruletick383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTickAccess().getPercentSignKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:207:1: (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==15) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==16) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:207:3: otherlv_3= 'Output:'
                            {
                            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruletick396); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getTickAccess().getOutputKeyword_2_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:212:6: (otherlv_4= 'Output' otherlv_5= ':' )
                            {
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:212:6: (otherlv_4= 'Output' otherlv_5= ':' )
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:212:8: otherlv_4= 'Output' otherlv_5= ':'
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruletick415); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getTickAccess().getOutputKeyword_2_1_1_0());
                                  
                            }
                            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruletick427); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getTickAccess().getColonKeyword_2_1_1_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:220:3: ( (lv_output_6_0= rulesignal ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ALPHANUMSPECIAL) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:221:1: (lv_output_6_0= rulesignal )
                    	    {
                    	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:221:1: (lv_output_6_0= rulesignal )
                    	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:222:3: lv_output_6_0= rulesignal
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTickAccess().getOutputSignalParserRuleCall_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulesignal_in_ruletick450);
                    	    lv_output_6_0=rulesignal();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTickRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"output",
                    	              		lv_output_6_0, 
                    	              		"signal");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:238:5: ( (lv_extraInfos_7_0= rulekvpair ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==RULE_ALPHANUMSPECIAL) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:239:1: (lv_extraInfos_7_0= rulekvpair )
            	    {
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:239:1: (lv_extraInfos_7_0= rulekvpair )
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:240:3: lv_extraInfos_7_0= rulekvpair
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTickAccess().getExtraInfosKvpairParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulekvpair_in_ruletick474);
            	    lv_extraInfos_7_0=rulekvpair();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTickRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"extraInfos",
            	              		lv_extraInfos_7_0, 
            	              		"kvpair");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:256:3: (otherlv_8= '%%' (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) ) ( (lv_extraInfosOutput_12_0= rulekvpair ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:256:5: otherlv_8= '%%' (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) ) ( (lv_extraInfosOutput_12_0= rulekvpair ) )*
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruletick488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTickAccess().getPercentSignPercentSignKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:260:1: (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==15) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==16) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:260:3: otherlv_9= 'Output:'
                            {
                            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruletick501); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getTickAccess().getOutputKeyword_4_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:265:6: (otherlv_10= 'Output' otherlv_11= ':' )
                            {
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:265:6: (otherlv_10= 'Output' otherlv_11= ':' )
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:265:8: otherlv_10= 'Output' otherlv_11= ':'
                            {
                            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruletick520); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getTickAccess().getOutputKeyword_4_1_1_0());
                                  
                            }
                            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruletick532); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getTickAccess().getColonKeyword_4_1_1_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:273:3: ( (lv_extraInfosOutput_12_0= rulekvpair ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:274:1: (lv_extraInfosOutput_12_0= rulekvpair )
                    	    {
                    	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:274:1: (lv_extraInfosOutput_12_0= rulekvpair )
                    	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:275:3: lv_extraInfosOutput_12_0= rulekvpair
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTickAccess().getExtraInfosOutputKvpairParserRuleCall_4_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulekvpair_in_ruletick555);
                    	    lv_extraInfosOutput_12_0=rulekvpair();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTickRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"extraInfosOutput",
                    	              		lv_extraInfosOutput_12_0, 
                    	              		"kvpair");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruletick570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getTickAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletick"


    // $ANTLR start "entryRulesignal"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:303:1: entryRulesignal returns [EObject current=null] : iv_rulesignal= rulesignal EOF ;
    public final EObject entryRulesignal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignal = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:304:2: (iv_rulesignal= rulesignal EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:305:2: iv_rulesignal= rulesignal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalRule()); 
            }
            pushFollow(FOLLOW_rulesignal_in_entryRulesignal606);
            iv_rulesignal=rulesignal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesignal616); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignal"


    // $ANTLR start "rulesignal"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:312:1: rulesignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( (lv_valued_1_0= '(' ) )? ( ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) ) otherlv_3= ')' )? ) ;
    public final EObject rulesignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_valued_1_0=null;
        Token otherlv_3=null;
        EObject lv_val_2_1 = null;

        EObject lv_val_2_2 = null;

        EObject lv_val_2_3 = null;

        EObject lv_val_2_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:315:28: ( ( ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( (lv_valued_1_0= '(' ) )? ( ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) ) otherlv_3= ')' )? ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:316:1: ( ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( (lv_valued_1_0= '(' ) )? ( ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) ) otherlv_3= ')' )? )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:316:1: ( ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( (lv_valued_1_0= '(' ) )? ( ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) ) otherlv_3= ')' )? )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:316:2: ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( (lv_valued_1_0= '(' ) )? ( ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) ) otherlv_3= ')' )?
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:316:2: ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:317:1: (lv_name_0_0= RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:317:1: (lv_name_0_0= RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:318:3: lv_name_0_0= RULE_ALPHANUMSPECIAL
            {
            lv_name_0_0=(Token)match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rulesignal658); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getSignalAccess().getNameALPHANUMSPECIALTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSignalRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ALPHANUMSPECIAL");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:334:2: ( (lv_valued_1_0= '(' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:335:1: (lv_valued_1_0= '(' )
                    {
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:335:1: (lv_valued_1_0= '(' )
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:336:3: lv_valued_1_0= '('
                    {
                    lv_valued_1_0=(Token)match(input,19,FOLLOW_19_in_rulesignal681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_valued_1_0, grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalRule());
                      	        }
                             		setWithLastConsumed(current, "valued", true, "(");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:349:3: ( ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) ) otherlv_3= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_BOOL)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:349:4: ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) ) otherlv_3= ')'
                    {
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:349:4: ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) )
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:350:1: ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) )
                    {
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:350:1: ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) )
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:351:1: (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString )
                    {
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:351:1: (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString )
                    int alt12=4;
                    switch ( input.LA(1) ) {
                    case RULE_INT:
                        {
                        alt12=1;
                        }
                        break;
                    case RULE_FLOAT:
                        {
                        alt12=2;
                        }
                        break;
                    case RULE_BOOL:
                        {
                        alt12=3;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt12=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:352:3: lv_val_2_1= ruleEsoInt
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalAccess().getValEsoIntParserRuleCall_2_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEsoInt_in_rulesignal719);
                            lv_val_2_1=ruleEsoInt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSignalRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"val",
                                      		lv_val_2_1, 
                                      		"EsoInt");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:367:8: lv_val_2_2= ruleEsoFloat
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalAccess().getValEsoFloatParserRuleCall_2_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEsoFloat_in_rulesignal738);
                            lv_val_2_2=ruleEsoFloat();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSignalRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"val",
                                      		lv_val_2_2, 
                                      		"EsoFloat");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:382:8: lv_val_2_3= ruleEsoBool
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalAccess().getValEsoBoolParserRuleCall_2_0_0_2()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEsoBool_in_rulesignal757);
                            lv_val_2_3=ruleEsoBool();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSignalRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"val",
                                      		lv_val_2_3, 
                                      		"EsoBool");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:397:8: lv_val_2_4= ruleEsoString
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalAccess().getValEsoStringParserRuleCall_2_0_0_3()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEsoString_in_rulesignal776);
                            lv_val_2_4=ruleEsoString();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSignalRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"val",
                                      		lv_val_2_4, 
                                      		"EsoString");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_rulesignal791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSignalAccess().getRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignal"


    // $ANTLR start "entryRulekvpair"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:427:1: entryRulekvpair returns [EObject current=null] : iv_rulekvpair= rulekvpair EOF ;
    public final EObject entryRulekvpair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulekvpair = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:428:2: (iv_rulekvpair= rulekvpair EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:429:2: iv_rulekvpair= rulekvpair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKvpairRule()); 
            }
            pushFollow(FOLLOW_rulekvpair_in_entryRulekvpair829);
            iv_rulekvpair=rulekvpair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulekvpair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulekvpair839); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulekvpair"


    // $ANTLR start "rulekvpair"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:436:1: rulekvpair returns [EObject current=null] : ( () otherlv_1= '%%' ( (lv_key_2_0= RULE_ALPHANUMSPECIAL ) ) otherlv_3= '=' ( ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) ) ) ) ;
    public final EObject rulekvpair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_key_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_4_1 = null;

        EObject lv_value_4_2 = null;

        EObject lv_value_4_3 = null;

        EObject lv_value_4_4 = null;

        EObject lv_value_4_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:439:28: ( ( () otherlv_1= '%%' ( (lv_key_2_0= RULE_ALPHANUMSPECIAL ) ) otherlv_3= '=' ( ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) ) ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:440:1: ( () otherlv_1= '%%' ( (lv_key_2_0= RULE_ALPHANUMSPECIAL ) ) otherlv_3= '=' ( ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) ) ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:440:1: ( () otherlv_1= '%%' ( (lv_key_2_0= RULE_ALPHANUMSPECIAL ) ) otherlv_3= '=' ( ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:440:2: () otherlv_1= '%%' ( (lv_key_2_0= RULE_ALPHANUMSPECIAL ) ) otherlv_3= '=' ( ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:440:2: ()
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:441:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getKvpairAccess().getKvpairAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulekvpair888); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getKvpairAccess().getPercentSignPercentSignKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:453:1: ( (lv_key_2_0= RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:454:1: (lv_key_2_0= RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:454:1: (lv_key_2_0= RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:455:3: lv_key_2_0= RULE_ALPHANUMSPECIAL
            {
            lv_key_2_0=(Token)match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair905); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_2_0, grammarAccess.getKvpairAccess().getKeyALPHANUMSPECIALTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKvpairRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_2_0, 
                      		"ALPHANUMSPECIAL");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulekvpair922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getKvpairAccess().getEqualsSignKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:475:1: ( ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:476:1: ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:476:1: ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:477:1: (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:477:1: (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt )
            int alt14=5;
            switch ( input.LA(1) ) {
            case RULE_ALPHANUMSPECIAL:
                {
                alt14=1;
                }
                break;
            case RULE_STRING:
                {
                alt14=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt14=3;
                }
                break;
            case RULE_BOOL:
                {
                alt14=4;
                }
                break;
            case RULE_INT:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:478:3: lv_value_4_1= ruleEsoJson
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getKvpairAccess().getValueEsoJsonParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEsoJson_in_rulekvpair945);
                    lv_value_4_1=ruleEsoJson();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getKvpairRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_1, 
                              		"EsoJson");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:493:8: lv_value_4_2= ruleEsoString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getKvpairAccess().getValueEsoStringParserRuleCall_4_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEsoString_in_rulekvpair964);
                    lv_value_4_2=ruleEsoString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getKvpairRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_2, 
                              		"EsoString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:508:8: lv_value_4_3= ruleEsoFloat
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getKvpairAccess().getValueEsoFloatParserRuleCall_4_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEsoFloat_in_rulekvpair983);
                    lv_value_4_3=ruleEsoFloat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getKvpairRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_3, 
                              		"EsoFloat");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:523:8: lv_value_4_4= ruleEsoBool
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getKvpairAccess().getValueEsoBoolParserRuleCall_4_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEsoBool_in_rulekvpair1002);
                    lv_value_4_4=ruleEsoBool();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getKvpairRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_4, 
                              		"EsoBool");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:538:8: lv_value_4_5= ruleEsoInt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getKvpairAccess().getValueEsoIntParserRuleCall_4_0_4()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEsoInt_in_rulekvpair1021);
                    lv_value_4_5=ruleEsoInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getKvpairRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_5, 
                              		"EsoInt");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulekvpair"


    // $ANTLR start "entryRuleEsoInt"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:564:1: entryRuleEsoInt returns [EObject current=null] : iv_ruleEsoInt= ruleEsoInt EOF ;
    public final EObject entryRuleEsoInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsoInt = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:565:2: (iv_ruleEsoInt= ruleEsoInt EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:566:2: iv_ruleEsoInt= ruleEsoInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsoIntRule()); 
            }
            pushFollow(FOLLOW_ruleEsoInt_in_entryRuleEsoInt1060);
            iv_ruleEsoInt=ruleEsoInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsoInt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoInt1070); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEsoInt"


    // $ANTLR start "ruleEsoInt"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:573:1: ruleEsoInt returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleEsoInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:576:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:577:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:577:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:578:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:578:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:579:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEsoInt1111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getEsoIntAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEsoIntRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEsoInt"


    // $ANTLR start "entryRuleEsoString"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:603:1: entryRuleEsoString returns [EObject current=null] : iv_ruleEsoString= ruleEsoString EOF ;
    public final EObject entryRuleEsoString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsoString = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:604:2: (iv_ruleEsoString= ruleEsoString EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:605:2: iv_ruleEsoString= ruleEsoString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsoStringRule()); 
            }
            pushFollow(FOLLOW_ruleEsoString_in_entryRuleEsoString1151);
            iv_ruleEsoString=ruleEsoString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsoString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoString1161); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEsoString"


    // $ANTLR start "ruleEsoString"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:612:1: ruleEsoString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleEsoString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:615:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:616:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:616:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:617:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:617:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:618:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEsoString1202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getEsoStringAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEsoStringRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEsoString"


    // $ANTLR start "entryRuleEsoFloat"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:642:1: entryRuleEsoFloat returns [EObject current=null] : iv_ruleEsoFloat= ruleEsoFloat EOF ;
    public final EObject entryRuleEsoFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsoFloat = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:643:2: (iv_ruleEsoFloat= ruleEsoFloat EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:644:2: iv_ruleEsoFloat= ruleEsoFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsoFloatRule()); 
            }
            pushFollow(FOLLOW_ruleEsoFloat_in_entryRuleEsoFloat1242);
            iv_ruleEsoFloat=ruleEsoFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsoFloat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoFloat1252); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEsoFloat"


    // $ANTLR start "ruleEsoFloat"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:651:1: ruleEsoFloat returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleEsoFloat() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:654:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:655:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:655:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:656:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:656:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:657:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleEsoFloat1293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getEsoFloatAccess().getValueFLOATTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEsoFloatRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"FLOAT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEsoFloat"


    // $ANTLR start "entryRuleEsoBool"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:681:1: entryRuleEsoBool returns [EObject current=null] : iv_ruleEsoBool= ruleEsoBool EOF ;
    public final EObject entryRuleEsoBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsoBool = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:682:2: (iv_ruleEsoBool= ruleEsoBool EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:683:2: iv_ruleEsoBool= ruleEsoBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsoBoolRule()); 
            }
            pushFollow(FOLLOW_ruleEsoBool_in_entryRuleEsoBool1333);
            iv_ruleEsoBool=ruleEsoBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsoBool; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoBool1343); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEsoBool"


    // $ANTLR start "ruleEsoBool"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:690:1: ruleEsoBool returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL ) ) ;
    public final EObject ruleEsoBool() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:693:28: ( ( (lv_value_0_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:694:1: ( (lv_value_0_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:694:1: ( (lv_value_0_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:695:1: (lv_value_0_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:695:1: (lv_value_0_0= RULE_BOOL )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:696:3: lv_value_0_0= RULE_BOOL
            {
            lv_value_0_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleEsoBool1384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getEsoBoolAccess().getValueBOOLTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEsoBoolRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"BOOL");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEsoBool"


    // $ANTLR start "entryRuleEsoJson"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:720:1: entryRuleEsoJson returns [EObject current=null] : iv_ruleEsoJson= ruleEsoJson EOF ;
    public final EObject entryRuleEsoJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsoJson = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:721:2: (iv_ruleEsoJson= ruleEsoJson EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:722:2: iv_ruleEsoJson= ruleEsoJson EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsoJsonRule()); 
            }
            pushFollow(FOLLOW_ruleEsoJson_in_entryRuleEsoJson1424);
            iv_ruleEsoJson=ruleEsoJson();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsoJson; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoJson1434); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEsoJson"


    // $ANTLR start "ruleEsoJson"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:729:1: ruleEsoJson returns [EObject current=null] : ( (lv_value_0_0= RULE_ALPHANUMSPECIAL ) ) ;
    public final EObject ruleEsoJson() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:732:28: ( ( (lv_value_0_0= RULE_ALPHANUMSPECIAL ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:733:1: ( (lv_value_0_0= RULE_ALPHANUMSPECIAL ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:733:1: ( (lv_value_0_0= RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:734:1: (lv_value_0_0= RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:734:1: (lv_value_0_0= RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:735:3: lv_value_0_0= RULE_ALPHANUMSPECIAL
            {
            lv_value_0_0=(Token)match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_ruleEsoJson1475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getEsoJsonAccess().getValueALPHANUMSPECIALTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEsoJsonRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"ALPHANUMSPECIAL");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEsoJson"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruletracelist_in_entryRuletracelist81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletracelist91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletrace_in_ruletracelist136 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruletrace_in_entryRuletrace172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletrace182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruletrace219 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruletrace231 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruletrace243 = new BitSet(new long[]{0x0000000000046010L});
    public static final BitSet FOLLOW_ruletick_in_ruletrace264 = new BitSet(new long[]{0x0000000000046012L});
    public static final BitSet FOLLOW_ruletick_in_entryRuletick301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletick311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_ruletick369 = new BitSet(new long[]{0x0000000000046010L});
    public static final BitSet FOLLOW_14_in_ruletick383 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruletick396 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_16_in_ruletick415 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruletick427 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_rulesignal_in_ruletick450 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_rulekvpair_in_ruletick474 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruletick488 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruletick501 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_16_in_ruletick520 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruletick532 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rulekvpair_in_ruletick555 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruletick570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_entryRulesignal606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignal616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rulesignal658 = new BitSet(new long[]{0x00000000000801E2L});
    public static final BitSet FOLLOW_19_in_rulesignal681 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_ruleEsoInt_in_rulesignal719 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_rulesignal738 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleEsoBool_in_rulesignal757 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleEsoString_in_rulesignal776 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulesignal791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekvpair_in_entryRulekvpair829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulekvpair839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulekvpair888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair905 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulekvpair922 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleEsoJson_in_rulekvpair945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoString_in_rulekvpair964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_rulekvpair983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoBool_in_rulekvpair1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoInt_in_rulekvpair1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoInt_in_entryRuleEsoInt1060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoInt1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEsoInt1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoString_in_entryRuleEsoString1151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoString1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEsoString1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_entryRuleEsoFloat1242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoFloat1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleEsoFloat1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoBool_in_entryRuleEsoBool1333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoBool1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleEsoBool1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoJson_in_entryRuleEsoJson1424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoJson1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_ruleEsoJson1475 = new BitSet(new long[]{0x0000000000000002L});

}