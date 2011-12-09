package de.cau.cs.kieler.sim.esi.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.sim.esi.services.EsiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsiParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ALPHANUMSPECIAL", "RULE_ID", "RULE_NUM", "RULE_DIGIT", "RULE_LETTER", "RULE_SPECIAL", "RULE_WS", "RULE_COMMENT", "'!'", "'reset'", "';'", "'%'", "'Output'", "':'", "'%%'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int T__20=20;
    public static final int RULE_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_LETTER=8;
    public static final int RULE_NUM=6;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_SPECIAL=9;
    public static final int RULE_ALPHANUMSPECIAL=4;
    public static final int RULE_WS=10;
    public static final int RULE_DIGIT=7;

    // delegates
    // delegators


        public InternalEsiParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEsiParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEsiParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g"; }



     	private EsiGrammarAccess grammarAccess;
     	
        public InternalEsiParser(TokenStream input, EsiGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "tracelist";	
       	}
       	
       	@Override
       	protected EsiGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuletracelist"
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:67:1: entryRuletracelist returns [EObject current=null] : iv_ruletracelist= ruletracelist EOF ;
    public final EObject entryRuletracelist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletracelist = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:68:2: (iv_ruletracelist= ruletracelist EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:69:2: iv_ruletracelist= ruletracelist EOF
            {
             newCompositeNode(grammarAccess.getTracelistRule()); 
            pushFollow(FOLLOW_ruletracelist_in_entryRuletracelist75);
            iv_ruletracelist=ruletracelist();

            state._fsp--;

             current =iv_ruletracelist; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletracelist85); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:76:1: ruletracelist returns [EObject current=null] : ( ( (lv_traces_0_0= ruletrace ) )? (otherlv_1= '!' otherlv_2= 'reset' otherlv_3= ';' ( (lv_traces_4_0= ruletrace ) ) )+ ) ;
    public final EObject ruletracelist() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_traces_0_0 = null;

        EObject lv_traces_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:79:28: ( ( ( (lv_traces_0_0= ruletrace ) )? (otherlv_1= '!' otherlv_2= 'reset' otherlv_3= ';' ( (lv_traces_4_0= ruletrace ) ) )+ ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:80:1: ( ( (lv_traces_0_0= ruletrace ) )? (otherlv_1= '!' otherlv_2= 'reset' otherlv_3= ';' ( (lv_traces_4_0= ruletrace ) ) )+ )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:80:1: ( ( (lv_traces_0_0= ruletrace ) )? (otherlv_1= '!' otherlv_2= 'reset' otherlv_3= ';' ( (lv_traces_4_0= ruletrace ) ) )+ )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:80:2: ( (lv_traces_0_0= ruletrace ) )? (otherlv_1= '!' otherlv_2= 'reset' otherlv_3= ';' ( (lv_traces_4_0= ruletrace ) ) )+
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:80:2: ( (lv_traces_0_0= ruletrace ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||(LA1_0>=14 && LA1_0<=15)||LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:81:1: (lv_traces_0_0= ruletrace )
                    {
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:81:1: (lv_traces_0_0= ruletrace )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:82:3: lv_traces_0_0= ruletrace
                    {
                     
                    	        newCompositeNode(grammarAccess.getTracelistAccess().getTracesTraceParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruletrace_in_ruletracelist131);
                    lv_traces_0_0=ruletrace();

                    state._fsp--;


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
                    break;

            }

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:98:3: (otherlv_1= '!' otherlv_2= 'reset' otherlv_3= ';' ( (lv_traces_4_0= ruletrace ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:98:5: otherlv_1= '!' otherlv_2= 'reset' otherlv_3= ';' ( (lv_traces_4_0= ruletrace ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruletracelist145); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTracelistAccess().getExclamationMarkKeyword_1_0());
            	        
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruletracelist157); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTracelistAccess().getResetKeyword_1_1());
            	        
            	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruletracelist169); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTracelistAccess().getSemicolonKeyword_1_2());
            	        
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:110:1: ( (lv_traces_4_0= ruletrace ) )
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:111:1: (lv_traces_4_0= ruletrace )
            	    {
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:111:1: (lv_traces_4_0= ruletrace )
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:112:3: lv_traces_4_0= ruletrace
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTracelistAccess().getTracesTraceParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletrace_in_ruletracelist190);
            	    lv_traces_4_0=ruletrace();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTracelistRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"traces",
            	            		lv_traces_4_0, 
            	            		"trace");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


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


            }

             leaveRule(); 
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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:136:1: entryRuletrace returns [EObject current=null] : iv_ruletrace= ruletrace EOF ;
    public final EObject entryRuletrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletrace = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:137:2: (iv_ruletrace= ruletrace EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:138:2: iv_ruletrace= ruletrace EOF
            {
             newCompositeNode(grammarAccess.getTraceRule()); 
            pushFollow(FOLLOW_ruletrace_in_entryRuletrace228);
            iv_ruletrace=ruletrace();

            state._fsp--;

             current =iv_ruletrace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletrace238); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:145:1: ruletrace returns [EObject current=null] : ( () ( (lv_ticks_1_0= ruletick ) )+ ) ;
    public final EObject ruletrace() throws RecognitionException {
        EObject current = null;

        EObject lv_ticks_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:148:28: ( ( () ( (lv_ticks_1_0= ruletick ) )+ ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:149:1: ( () ( (lv_ticks_1_0= ruletick ) )+ )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:149:1: ( () ( (lv_ticks_1_0= ruletick ) )+ )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:149:2: () ( (lv_ticks_1_0= ruletick ) )+
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:149:2: ()
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:150:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTraceAccess().getTraceAction_0(),
                        current);
                

            }

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:155:2: ( (lv_ticks_1_0= ruletick ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=14 && LA3_0<=15)||LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:156:1: (lv_ticks_1_0= ruletick )
            	    {
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:156:1: (lv_ticks_1_0= ruletick )
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:157:3: lv_ticks_1_0= ruletick
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTraceAccess().getTicksTickParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletick_in_ruletrace293);
            	    lv_ticks_1_0=ruletick();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTraceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ticks",
            	            		lv_ticks_1_0, 
            	            		"tick");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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


            }

             leaveRule(); 
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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:181:1: entryRuletick returns [EObject current=null] : iv_ruletick= ruletick EOF ;
    public final EObject entryRuletick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletick = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:182:2: (iv_ruletick= ruletick EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:183:2: iv_ruletick= ruletick EOF
            {
             newCompositeNode(grammarAccess.getTickRule()); 
            pushFollow(FOLLOW_ruletick_in_entryRuletick330);
            iv_ruletick=ruletick();

            state._fsp--;

             current =iv_ruletick; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletick340); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:190:1: ruletick returns [EObject current=null] : ( ( (lv_input_0_0= rulesignal ) )* (otherlv_1= '%' otherlv_2= 'Output' otherlv_3= ':' ( (lv_output_4_0= rulesignal ) )* )? ( (lv_extraInfos_5_0= rulekvpair ) )* ( (lv_n_6_0= ';' ) ) ) ;
    public final EObject ruletick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_n_6_0=null;
        EObject lv_input_0_0 = null;

        EObject lv_output_4_0 = null;

        EObject lv_extraInfos_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:193:28: ( ( ( (lv_input_0_0= rulesignal ) )* (otherlv_1= '%' otherlv_2= 'Output' otherlv_3= ':' ( (lv_output_4_0= rulesignal ) )* )? ( (lv_extraInfos_5_0= rulekvpair ) )* ( (lv_n_6_0= ';' ) ) ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:194:1: ( ( (lv_input_0_0= rulesignal ) )* (otherlv_1= '%' otherlv_2= 'Output' otherlv_3= ':' ( (lv_output_4_0= rulesignal ) )* )? ( (lv_extraInfos_5_0= rulekvpair ) )* ( (lv_n_6_0= ';' ) ) )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:194:1: ( ( (lv_input_0_0= rulesignal ) )* (otherlv_1= '%' otherlv_2= 'Output' otherlv_3= ':' ( (lv_output_4_0= rulesignal ) )* )? ( (lv_extraInfos_5_0= rulekvpair ) )* ( (lv_n_6_0= ';' ) ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:194:2: ( (lv_input_0_0= rulesignal ) )* (otherlv_1= '%' otherlv_2= 'Output' otherlv_3= ':' ( (lv_output_4_0= rulesignal ) )* )? ( (lv_extraInfos_5_0= rulekvpair ) )* ( (lv_n_6_0= ';' ) )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:194:2: ( (lv_input_0_0= rulesignal ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:195:1: (lv_input_0_0= rulesignal )
            	    {
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:195:1: (lv_input_0_0= rulesignal )
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:196:3: lv_input_0_0= rulesignal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTickAccess().getInputSignalParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesignal_in_ruletick386);
            	    lv_input_0_0=rulesignal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTickRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"input",
            	            		lv_input_0_0, 
            	            		"signal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:212:3: (otherlv_1= '%' otherlv_2= 'Output' otherlv_3= ':' ( (lv_output_4_0= rulesignal ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:212:5: otherlv_1= '%' otherlv_2= 'Output' otherlv_3= ':' ( (lv_output_4_0= rulesignal ) )*
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruletick400); 

                        	newLeafNode(otherlv_1, grammarAccess.getTickAccess().getPercentSignKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruletick412); 

                        	newLeafNode(otherlv_2, grammarAccess.getTickAccess().getOutputKeyword_1_1());
                        
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruletick424); 

                        	newLeafNode(otherlv_3, grammarAccess.getTickAccess().getColonKeyword_1_2());
                        
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:224:1: ( (lv_output_4_0= rulesignal ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:225:1: (lv_output_4_0= rulesignal )
                    	    {
                    	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:225:1: (lv_output_4_0= rulesignal )
                    	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:226:3: lv_output_4_0= rulesignal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTickAccess().getOutputSignalParserRuleCall_1_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulesignal_in_ruletick445);
                    	    lv_output_4_0=rulesignal();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTickRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"output",
                    	            		lv_output_4_0, 
                    	            		"signal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:242:5: ( (lv_extraInfos_5_0= rulekvpair ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:243:1: (lv_extraInfos_5_0= rulekvpair )
            	    {
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:243:1: (lv_extraInfos_5_0= rulekvpair )
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:244:3: lv_extraInfos_5_0= rulekvpair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTickAccess().getExtraInfosKvpairParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulekvpair_in_ruletick469);
            	    lv_extraInfos_5_0=rulekvpair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTickRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extraInfos",
            	            		lv_extraInfos_5_0, 
            	            		"kvpair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:260:3: ( (lv_n_6_0= ';' ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:261:1: (lv_n_6_0= ';' )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:261:1: (lv_n_6_0= ';' )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:262:3: lv_n_6_0= ';'
            {
            lv_n_6_0=(Token)match(input,14,FOLLOW_14_in_ruletick488); 

                    newLeafNode(lv_n_6_0, grammarAccess.getTickAccess().getNSemicolonKeyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTickRule());
            	        }
                   		setWithLastConsumed(current, "n", lv_n_6_0, ";");
            	    

            }


            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulekvpair"
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:283:1: entryRulekvpair returns [EObject current=null] : iv_rulekvpair= rulekvpair EOF ;
    public final EObject entryRulekvpair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulekvpair = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:284:2: (iv_rulekvpair= rulekvpair EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:285:2: iv_rulekvpair= rulekvpair EOF
            {
             newCompositeNode(grammarAccess.getKvpairRule()); 
            pushFollow(FOLLOW_rulekvpair_in_entryRulekvpair537);
            iv_rulekvpair=rulekvpair();

            state._fsp--;

             current =iv_rulekvpair; 
            match(input,EOF,FOLLOW_EOF_in_entryRulekvpair547); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:292:1: rulekvpair returns [EObject current=null] : (otherlv_0= '%%' ( (lv_k_1_0= RULE_ALPHANUMSPECIAL ) ) otherlv_2= ':' ( (lv_val_3_0= RULE_ALPHANUMSPECIAL ) ) ) ;
    public final EObject rulekvpair() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_k_1_0=null;
        Token otherlv_2=null;
        Token lv_val_3_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:295:28: ( (otherlv_0= '%%' ( (lv_k_1_0= RULE_ALPHANUMSPECIAL ) ) otherlv_2= ':' ( (lv_val_3_0= RULE_ALPHANUMSPECIAL ) ) ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:296:1: (otherlv_0= '%%' ( (lv_k_1_0= RULE_ALPHANUMSPECIAL ) ) otherlv_2= ':' ( (lv_val_3_0= RULE_ALPHANUMSPECIAL ) ) )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:296:1: (otherlv_0= '%%' ( (lv_k_1_0= RULE_ALPHANUMSPECIAL ) ) otherlv_2= ':' ( (lv_val_3_0= RULE_ALPHANUMSPECIAL ) ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:296:3: otherlv_0= '%%' ( (lv_k_1_0= RULE_ALPHANUMSPECIAL ) ) otherlv_2= ':' ( (lv_val_3_0= RULE_ALPHANUMSPECIAL ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulekvpair584); 

                	newLeafNode(otherlv_0, grammarAccess.getKvpairAccess().getPercentSignPercentSignKeyword_0());
                
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:300:1: ( (lv_k_1_0= RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:301:1: (lv_k_1_0= RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:301:1: (lv_k_1_0= RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:302:3: lv_k_1_0= RULE_ALPHANUMSPECIAL
            {
            lv_k_1_0=(Token)match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair601); 

            			newLeafNode(lv_k_1_0, grammarAccess.getKvpairAccess().getKAlphaNumSpecialTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKvpairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"k",
                    		lv_k_1_0, 
                    		"AlphaNumSpecial");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulekvpair618); 

                	newLeafNode(otherlv_2, grammarAccess.getKvpairAccess().getColonKeyword_2());
                
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:322:1: ( (lv_val_3_0= RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:323:1: (lv_val_3_0= RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:323:1: (lv_val_3_0= RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:324:3: lv_val_3_0= RULE_ALPHANUMSPECIAL
            {
            lv_val_3_0=(Token)match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair635); 

            			newLeafNode(lv_val_3_0, grammarAccess.getKvpairAccess().getValAlphaNumSpecialTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKvpairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"val",
                    		lv_val_3_0, 
                    		"AlphaNumSpecial");
            	    

            }


            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulesignal"
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:348:1: entryRulesignal returns [EObject current=null] : iv_rulesignal= rulesignal EOF ;
    public final EObject entryRulesignal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignal = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:349:2: (iv_rulesignal= rulesignal EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:350:2: iv_rulesignal= rulesignal EOF
            {
             newCompositeNode(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_rulesignal_in_entryRulesignal676);
            iv_rulesignal=rulesignal();

            state._fsp--;

             current =iv_rulesignal; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignal686); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:357:1: rulesignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) otherlv_3= ')' )? ) ;
    public final EObject rulesignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_valued_1_0=null;
        Token lv_val_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:360:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) otherlv_3= ')' )? ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:361:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) otherlv_3= ')' )? )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:361:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) otherlv_3= ')' )? )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:361:2: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) otherlv_3= ')' )?
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:361:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:362:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:362:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:363:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesignal728); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSignalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:379:2: ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) otherlv_3= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:379:3: ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) otherlv_3= ')'
                    {
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:379:3: ( (lv_valued_1_0= '(' ) )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:380:1: (lv_valued_1_0= '(' )
                    {
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:380:1: (lv_valued_1_0= '(' )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:381:3: lv_valued_1_0= '('
                    {
                    lv_valued_1_0=(Token)match(input,19,FOLLOW_19_in_rulesignal752); 

                            newLeafNode(lv_valued_1_0, grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSignalRule());
                    	        }
                           		setWithLastConsumed(current, "valued", true, "(");
                    	    

                    }


                    }

                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:394:2: ( (lv_val_2_0= RULE_NUM ) )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:395:1: (lv_val_2_0= RULE_NUM )
                    {
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:395:1: (lv_val_2_0= RULE_NUM )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:396:3: lv_val_2_0= RULE_NUM
                    {
                    lv_val_2_0=(Token)match(input,RULE_NUM,FOLLOW_RULE_NUM_in_rulesignal782); 

                    			newLeafNode(lv_val_2_0, grammarAccess.getSignalAccess().getValNUMTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSignalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_2_0, 
                            		"NUM");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_rulesignal799); 

                        	newLeafNode(otherlv_3, grammarAccess.getSignalAccess().getRightParenthesisKeyword_1_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruletracelist_in_entryRuletracelist75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletracelist85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletrace_in_ruletracelist131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruletracelist145 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruletracelist157 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruletracelist169 = new BitSet(new long[]{0x000000000004C020L});
    public static final BitSet FOLLOW_ruletrace_in_ruletracelist190 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruletrace_in_entryRuletrace228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletrace238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletick_in_ruletrace293 = new BitSet(new long[]{0x000000000004C022L});
    public static final BitSet FOLLOW_ruletick_in_entryRuletick330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletick340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_ruletick386 = new BitSet(new long[]{0x000000000004C020L});
    public static final BitSet FOLLOW_15_in_ruletick400 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruletick412 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruletick424 = new BitSet(new long[]{0x0000000000044020L});
    public static final BitSet FOLLOW_rulesignal_in_ruletick445 = new BitSet(new long[]{0x0000000000044020L});
    public static final BitSet FOLLOW_rulekvpair_in_ruletick469 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_14_in_ruletick488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekvpair_in_entryRulekvpair537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulekvpair547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulekvpair584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair601 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulekvpair618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_entryRulesignal676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignal686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesignal728 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulesignal752 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUM_in_rulesignal782 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulesignal799 = new BitSet(new long[]{0x0000000000000002L});

}