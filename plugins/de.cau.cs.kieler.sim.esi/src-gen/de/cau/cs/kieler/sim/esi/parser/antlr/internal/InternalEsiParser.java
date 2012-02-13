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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ALPHANUMSPECIAL", "RULE_INT", "RULE_STRING", "RULE_FLOAT", "RULE_SPECIAL", "RULE_WS", "'!'", "'reset'", "';'", "'%'", "'Output'", "':'", "'('", "')'", "'true'", "'false'", "'%%'"
    };
    public static final int T__20=20;
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
    public static final int T__13=13;
    public static final int RULE_SPECIAL=8;
    public static final int RULE_ALPHANUMSPECIAL=4;
    public static final int T__10=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:76:1: ruletracelist returns [EObject current=null] : ( (lv_traces_0_0= ruletrace ) )+ ;
    public final EObject ruletracelist() throws RecognitionException {
        EObject current = null;

        EObject lv_traces_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:79:28: ( ( (lv_traces_0_0= ruletrace ) )+ )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:80:1: ( (lv_traces_0_0= ruletrace ) )+
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:80:1: ( (lv_traces_0_0= ruletrace ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==10) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:81:1: (lv_traces_0_0= ruletrace )
            	    {
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:81:1: (lv_traces_0_0= ruletrace )
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:82:3: lv_traces_0_0= ruletrace
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTracelistAccess().getTracesTraceParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletrace_in_ruletracelist130);
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

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:106:1: entryRuletrace returns [EObject current=null] : iv_ruletrace= ruletrace EOF ;
    public final EObject entryRuletrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletrace = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:107:2: (iv_ruletrace= ruletrace EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:108:2: iv_ruletrace= ruletrace EOF
            {
             newCompositeNode(grammarAccess.getTraceRule()); 
            pushFollow(FOLLOW_ruletrace_in_entryRuletrace166);
            iv_ruletrace=ruletrace();

            state._fsp--;

             current =iv_ruletrace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletrace176); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:115:1: ruletrace returns [EObject current=null] : (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+ ) ;
    public final EObject ruletrace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ticks_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:118:28: ( (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+ ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:119:1: (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+ )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:119:1: (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+ )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:119:3: otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+
            {
            otherlv_0=(Token)match(input,10,FOLLOW_10_in_ruletrace213); 

                	newLeafNode(otherlv_0, grammarAccess.getTraceAccess().getExclamationMarkKeyword_0());
                
            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruletrace225); 

                	newLeafNode(otherlv_1, grammarAccess.getTraceAccess().getResetKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruletrace237); 

                	newLeafNode(otherlv_2, grammarAccess.getTraceAccess().getSemicolonKeyword_2());
                
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:131:1: ( (lv_ticks_3_0= ruletick ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ALPHANUMSPECIAL||(LA2_0>=12 && LA2_0<=13)||LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:132:1: (lv_ticks_3_0= ruletick )
            	    {
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:132:1: (lv_ticks_3_0= ruletick )
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:133:3: lv_ticks_3_0= ruletick
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTraceAccess().getTicksTickParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletick_in_ruletrace258);
            	    lv_ticks_3_0=ruletick();

            	    state._fsp--;


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
    // $ANTLR end "ruletrace"


    // $ANTLR start "entryRuletick"
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:157:1: entryRuletick returns [EObject current=null] : iv_ruletick= ruletick EOF ;
    public final EObject entryRuletick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletick = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:158:2: (iv_ruletick= ruletick EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:159:2: iv_ruletick= ruletick EOF
            {
             newCompositeNode(grammarAccess.getTickRule()); 
            pushFollow(FOLLOW_ruletick_in_entryRuletick295);
            iv_ruletick=ruletick();

            state._fsp--;

             current =iv_ruletick; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletick305); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:166:1: ruletick returns [EObject current=null] : ( () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )* )? ( (lv_extraInfos_6_0= rulekvpair ) )* otherlv_7= ';' ) ;
    public final EObject ruletick() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_input_1_0 = null;

        EObject lv_output_5_0 = null;

        EObject lv_extraInfos_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:169:28: ( ( () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )* )? ( (lv_extraInfos_6_0= rulekvpair ) )* otherlv_7= ';' ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:170:1: ( () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )* )? ( (lv_extraInfos_6_0= rulekvpair ) )* otherlv_7= ';' )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:170:1: ( () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )* )? ( (lv_extraInfos_6_0= rulekvpair ) )* otherlv_7= ';' )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:170:2: () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )* )? ( (lv_extraInfos_6_0= rulekvpair ) )* otherlv_7= ';'
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:170:2: ()
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:171:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTickAccess().getTickAction_0(),
                        current);
                

            }

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:176:2: ( (lv_input_1_0= rulesignal ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ALPHANUMSPECIAL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:177:1: (lv_input_1_0= rulesignal )
            	    {
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:177:1: (lv_input_1_0= rulesignal )
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:178:3: lv_input_1_0= rulesignal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTickAccess().getInputSignalParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesignal_in_ruletick360);
            	    lv_input_1_0=rulesignal();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:194:3: (otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:194:5: otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )*
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruletick374); 

                        	newLeafNode(otherlv_2, grammarAccess.getTickAccess().getPercentSignKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruletick386); 

                        	newLeafNode(otherlv_3, grammarAccess.getTickAccess().getOutputKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruletick398); 

                        	newLeafNode(otherlv_4, grammarAccess.getTickAccess().getColonKeyword_2_2());
                        
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:206:1: ( (lv_output_5_0= rulesignal ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ALPHANUMSPECIAL) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:207:1: (lv_output_5_0= rulesignal )
                    	    {
                    	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:207:1: (lv_output_5_0= rulesignal )
                    	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:208:3: lv_output_5_0= rulesignal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTickAccess().getOutputSignalParserRuleCall_2_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulesignal_in_ruletick419);
                    	    lv_output_5_0=rulesignal();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTickRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"output",
                    	            		lv_output_5_0, 
                    	            		"signal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:224:5: ( (lv_extraInfos_6_0= rulekvpair ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:225:1: (lv_extraInfos_6_0= rulekvpair )
            	    {
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:225:1: (lv_extraInfos_6_0= rulekvpair )
            	    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:226:3: lv_extraInfos_6_0= rulekvpair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTickAccess().getExtraInfosKvpairParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulekvpair_in_ruletick443);
            	    lv_extraInfos_6_0=rulekvpair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTickRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extraInfos",
            	            		lv_extraInfos_6_0, 
            	            		"kvpair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruletick456); 

                	newLeafNode(otherlv_7, grammarAccess.getTickAccess().getSemicolonKeyword_4());
                

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


    // $ANTLR start "entryRulesignal"
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:254:1: entryRulesignal returns [EObject current=null] : iv_rulesignal= rulesignal EOF ;
    public final EObject entryRulesignal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignal = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:255:2: (iv_rulesignal= rulesignal EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:256:2: iv_rulesignal= rulesignal EOF
            {
             newCompositeNode(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_rulesignal_in_entryRulesignal492);
            iv_rulesignal=rulesignal();

            state._fsp--;

             current =iv_rulesignal; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignal502); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:263:1: rulesignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= rulevalue ) ) otherlv_3= ')' )? ) ;
    public final EObject rulesignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_valued_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_val_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:266:28: ( ( ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= rulevalue ) ) otherlv_3= ')' )? ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:267:1: ( ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= rulevalue ) ) otherlv_3= ')' )? )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:267:1: ( ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= rulevalue ) ) otherlv_3= ')' )? )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:267:2: ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= rulevalue ) ) otherlv_3= ')' )?
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:267:2: ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:268:1: (lv_name_0_0= RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:268:1: (lv_name_0_0= RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:269:3: lv_name_0_0= RULE_ALPHANUMSPECIAL
            {
            lv_name_0_0=(Token)match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rulesignal544); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSignalAccess().getNameAlphaNumSpecialTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSignalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"AlphaNumSpecial");
            	    

            }


            }

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:285:2: ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= rulevalue ) ) otherlv_3= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:285:3: ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= rulevalue ) ) otherlv_3= ')'
                    {
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:285:3: ( (lv_valued_1_0= '(' ) )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:286:1: (lv_valued_1_0= '(' )
                    {
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:286:1: (lv_valued_1_0= '(' )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:287:3: lv_valued_1_0= '('
                    {
                    lv_valued_1_0=(Token)match(input,16,FOLLOW_16_in_rulesignal568); 

                            newLeafNode(lv_valued_1_0, grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSignalRule());
                    	        }
                           		setWithLastConsumed(current, "valued", true, "(");
                    	    

                    }


                    }

                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:300:2: ( (lv_val_2_0= rulevalue ) )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:301:1: (lv_val_2_0= rulevalue )
                    {
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:301:1: (lv_val_2_0= rulevalue )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:302:3: lv_val_2_0= rulevalue
                    {
                     
                    	        newCompositeNode(grammarAccess.getSignalAccess().getValValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_in_rulesignal602);
                    lv_val_2_0=rulevalue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSignalRule());
                    	        }
                           		set(
                           			current, 
                           			"val",
                            		lv_val_2_0, 
                            		"value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_rulesignal614); 

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


    // $ANTLR start "entryRulevalue"
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:330:1: entryRulevalue returns [String current=null] : iv_rulevalue= rulevalue EOF ;
    public final String entryRulevalue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevalue = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:331:2: (iv_rulevalue= rulevalue EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:332:2: iv_rulevalue= rulevalue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_rulevalue_in_entryRulevalue653);
            iv_rulevalue=rulevalue();

            state._fsp--;

             current =iv_rulevalue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevalue664); 

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
    // $ANTLR end "entryRulevalue"


    // $ANTLR start "rulevalue"
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:339:1: rulevalue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EsoInt_0= ruleEsoInt | this_EsoFloat_1= ruleEsoFloat | this_EsoBool_2= ruleEsoBool | this_EsoString_3= ruleEsoString ) ;
    public final AntlrDatatypeRuleToken rulevalue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EsoInt_0 = null;

        AntlrDatatypeRuleToken this_EsoFloat_1 = null;

        AntlrDatatypeRuleToken this_EsoBool_2 = null;

        AntlrDatatypeRuleToken this_EsoString_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:342:28: ( (this_EsoInt_0= ruleEsoInt | this_EsoFloat_1= ruleEsoFloat | this_EsoBool_2= ruleEsoBool | this_EsoString_3= ruleEsoString ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:343:1: (this_EsoInt_0= ruleEsoInt | this_EsoFloat_1= ruleEsoFloat | this_EsoBool_2= ruleEsoBool | this_EsoString_3= ruleEsoString )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:343:1: (this_EsoInt_0= ruleEsoInt | this_EsoFloat_1= ruleEsoFloat | this_EsoBool_2= ruleEsoBool | this_EsoString_3= ruleEsoString )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt8=2;
                }
                break;
            case 18:
            case 19:
                {
                alt8=3;
                }
                break;
            case RULE_STRING:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:344:5: this_EsoInt_0= ruleEsoInt
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getEsoIntParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEsoInt_in_rulevalue711);
                    this_EsoInt_0=ruleEsoInt();

                    state._fsp--;


                    		current.merge(this_EsoInt_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:356:5: this_EsoFloat_1= ruleEsoFloat
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getEsoFloatParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEsoFloat_in_rulevalue744);
                    this_EsoFloat_1=ruleEsoFloat();

                    state._fsp--;


                    		current.merge(this_EsoFloat_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:368:5: this_EsoBool_2= ruleEsoBool
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getEsoBoolParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEsoBool_in_rulevalue777);
                    this_EsoBool_2=ruleEsoBool();

                    state._fsp--;


                    		current.merge(this_EsoBool_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:380:5: this_EsoString_3= ruleEsoString
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getEsoStringParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEsoString_in_rulevalue810);
                    this_EsoString_3=ruleEsoString();

                    state._fsp--;


                    		current.merge(this_EsoString_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "rulevalue"


    // $ANTLR start "entryRuleEsoInt"
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:398:1: entryRuleEsoInt returns [String current=null] : iv_ruleEsoInt= ruleEsoInt EOF ;
    public final String entryRuleEsoInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEsoInt = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:399:2: (iv_ruleEsoInt= ruleEsoInt EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:400:2: iv_ruleEsoInt= ruleEsoInt EOF
            {
             newCompositeNode(grammarAccess.getEsoIntRule()); 
            pushFollow(FOLLOW_ruleEsoInt_in_entryRuleEsoInt856);
            iv_ruleEsoInt=ruleEsoInt();

            state._fsp--;

             current =iv_ruleEsoInt.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoInt867); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:407:1: ruleEsoInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Int_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEsoInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Int_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:410:28: (this_Int_0= RULE_INT )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:411:5: this_Int_0= RULE_INT
            {
            this_Int_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEsoInt906); 

            		current.merge(this_Int_0);
                
             
                newLeafNode(this_Int_0, grammarAccess.getEsoIntAccess().getIntTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleEsoInt"


    // $ANTLR start "entryRuleEsoString"
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:426:1: entryRuleEsoString returns [String current=null] : iv_ruleEsoString= ruleEsoString EOF ;
    public final String entryRuleEsoString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEsoString = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:427:2: (iv_ruleEsoString= ruleEsoString EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:428:2: iv_ruleEsoString= ruleEsoString EOF
            {
             newCompositeNode(grammarAccess.getEsoStringRule()); 
            pushFollow(FOLLOW_ruleEsoString_in_entryRuleEsoString951);
            iv_ruleEsoString=ruleEsoString();

            state._fsp--;

             current =iv_ruleEsoString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoString962); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:435:1: ruleEsoString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEsoString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:438:28: (this_STRING_0= RULE_STRING )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:439:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEsoString1001); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getEsoStringAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleEsoString"


    // $ANTLR start "entryRuleEsoFloat"
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:454:1: entryRuleEsoFloat returns [String current=null] : iv_ruleEsoFloat= ruleEsoFloat EOF ;
    public final String entryRuleEsoFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEsoFloat = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:455:2: (iv_ruleEsoFloat= ruleEsoFloat EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:456:2: iv_ruleEsoFloat= ruleEsoFloat EOF
            {
             newCompositeNode(grammarAccess.getEsoFloatRule()); 
            pushFollow(FOLLOW_ruleEsoFloat_in_entryRuleEsoFloat1046);
            iv_ruleEsoFloat=ruleEsoFloat();

            state._fsp--;

             current =iv_ruleEsoFloat.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoFloat1057); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:463:1: ruleEsoFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Float_0= RULE_FLOAT ;
    public final AntlrDatatypeRuleToken ruleEsoFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Float_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:466:28: (this_Float_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:467:5: this_Float_0= RULE_FLOAT
            {
            this_Float_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleEsoFloat1096); 

            		current.merge(this_Float_0);
                
             
                newLeafNode(this_Float_0, grammarAccess.getEsoFloatAccess().getFloatTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleEsoFloat"


    // $ANTLR start "entryRuleEsoBool"
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:482:1: entryRuleEsoBool returns [String current=null] : iv_ruleEsoBool= ruleEsoBool EOF ;
    public final String entryRuleEsoBool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEsoBool = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:483:2: (iv_ruleEsoBool= ruleEsoBool EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:484:2: iv_ruleEsoBool= ruleEsoBool EOF
            {
             newCompositeNode(grammarAccess.getEsoBoolRule()); 
            pushFollow(FOLLOW_ruleEsoBool_in_entryRuleEsoBool1141);
            iv_ruleEsoBool=ruleEsoBool();

            state._fsp--;

             current =iv_ruleEsoBool.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoBool1152); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:491:1: ruleEsoBool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEsoBool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:494:28: ( (kw= 'true' | kw= 'false' ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:495:1: (kw= 'true' | kw= 'false' )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:495:1: (kw= 'true' | kw= 'false' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:496:2: kw= 'true'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleEsoBool1190); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEsoBoolAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:503:2: kw= 'false'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleEsoBool1209); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEsoBoolAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleEsoBool"


    // $ANTLR start "entryRulekvpair"
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:516:1: entryRulekvpair returns [EObject current=null] : iv_rulekvpair= rulekvpair EOF ;
    public final EObject entryRulekvpair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulekvpair = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:517:2: (iv_rulekvpair= rulekvpair EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:518:2: iv_rulekvpair= rulekvpair EOF
            {
             newCompositeNode(grammarAccess.getKvpairRule()); 
            pushFollow(FOLLOW_rulekvpair_in_entryRulekvpair1249);
            iv_rulekvpair=rulekvpair();

            state._fsp--;

             current =iv_rulekvpair; 
            match(input,EOF,FOLLOW_EOF_in_entryRulekvpair1259); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:525:1: rulekvpair returns [EObject current=null] : (otherlv_0= '%%' ( (lv_key_1_0= RULE_ALPHANUMSPECIAL ) ) otherlv_2= ':' ( ( (lv_value_3_1= RULE_ALPHANUMSPECIAL | lv_value_3_2= RULE_INT | lv_value_3_3= RULE_FLOAT ) ) ) ) ;
    public final EObject rulekvpair() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_1=null;
        Token lv_value_3_2=null;
        Token lv_value_3_3=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:528:28: ( (otherlv_0= '%%' ( (lv_key_1_0= RULE_ALPHANUMSPECIAL ) ) otherlv_2= ':' ( ( (lv_value_3_1= RULE_ALPHANUMSPECIAL | lv_value_3_2= RULE_INT | lv_value_3_3= RULE_FLOAT ) ) ) ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:529:1: (otherlv_0= '%%' ( (lv_key_1_0= RULE_ALPHANUMSPECIAL ) ) otherlv_2= ':' ( ( (lv_value_3_1= RULE_ALPHANUMSPECIAL | lv_value_3_2= RULE_INT | lv_value_3_3= RULE_FLOAT ) ) ) )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:529:1: (otherlv_0= '%%' ( (lv_key_1_0= RULE_ALPHANUMSPECIAL ) ) otherlv_2= ':' ( ( (lv_value_3_1= RULE_ALPHANUMSPECIAL | lv_value_3_2= RULE_INT | lv_value_3_3= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:529:3: otherlv_0= '%%' ( (lv_key_1_0= RULE_ALPHANUMSPECIAL ) ) otherlv_2= ':' ( ( (lv_value_3_1= RULE_ALPHANUMSPECIAL | lv_value_3_2= RULE_INT | lv_value_3_3= RULE_FLOAT ) ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_rulekvpair1296); 

                	newLeafNode(otherlv_0, grammarAccess.getKvpairAccess().getPercentSignPercentSignKeyword_0());
                
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:533:1: ( (lv_key_1_0= RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:534:1: (lv_key_1_0= RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:534:1: (lv_key_1_0= RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:535:3: lv_key_1_0= RULE_ALPHANUMSPECIAL
            {
            lv_key_1_0=(Token)match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair1313); 

            			newLeafNode(lv_key_1_0, grammarAccess.getKvpairAccess().getKeyAlphaNumSpecialTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKvpairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"AlphaNumSpecial");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulekvpair1330); 

                	newLeafNode(otherlv_2, grammarAccess.getKvpairAccess().getColonKeyword_2());
                
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:555:1: ( ( (lv_value_3_1= RULE_ALPHANUMSPECIAL | lv_value_3_2= RULE_INT | lv_value_3_3= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:556:1: ( (lv_value_3_1= RULE_ALPHANUMSPECIAL | lv_value_3_2= RULE_INT | lv_value_3_3= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:556:1: ( (lv_value_3_1= RULE_ALPHANUMSPECIAL | lv_value_3_2= RULE_INT | lv_value_3_3= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:557:1: (lv_value_3_1= RULE_ALPHANUMSPECIAL | lv_value_3_2= RULE_INT | lv_value_3_3= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:557:1: (lv_value_3_1= RULE_ALPHANUMSPECIAL | lv_value_3_2= RULE_INT | lv_value_3_3= RULE_FLOAT )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_ALPHANUMSPECIAL:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                alt10=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:558:3: lv_value_3_1= RULE_ALPHANUMSPECIAL
                    {
                    lv_value_3_1=(Token)match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair1349); 

                    			newLeafNode(lv_value_3_1, grammarAccess.getKvpairAccess().getValueAlphaNumSpecialTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKvpairRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_1, 
                            		"AlphaNumSpecial");
                    	    

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:573:8: lv_value_3_2= RULE_INT
                    {
                    lv_value_3_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulekvpair1369); 

                    			newLeafNode(lv_value_3_2, grammarAccess.getKvpairAccess().getValueIntTerminalRuleCall_3_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKvpairRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_2, 
                            		"Int");
                    	    

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:588:8: lv_value_3_3= RULE_FLOAT
                    {
                    lv_value_3_3=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rulekvpair1389); 

                    			newLeafNode(lv_value_3_3, grammarAccess.getKvpairAccess().getValueFloatTerminalRuleCall_3_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKvpairRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_3, 
                            		"Float");
                    	    

                    }
                    break;

            }


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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruletracelist_in_entryRuletracelist75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletracelist85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletrace_in_ruletracelist130 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ruletrace_in_entryRuletrace166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletrace176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruletrace213 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruletrace225 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruletrace237 = new BitSet(new long[]{0x0000000000103010L});
    public static final BitSet FOLLOW_ruletick_in_ruletrace258 = new BitSet(new long[]{0x0000000000103012L});
    public static final BitSet FOLLOW_ruletick_in_entryRuletick295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletick305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_ruletick360 = new BitSet(new long[]{0x0000000000103010L});
    public static final BitSet FOLLOW_13_in_ruletick374 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruletick386 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruletick398 = new BitSet(new long[]{0x0000000000101010L});
    public static final BitSet FOLLOW_rulesignal_in_ruletick419 = new BitSet(new long[]{0x0000000000101010L});
    public static final BitSet FOLLOW_rulekvpair_in_ruletick443 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_12_in_ruletick456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_entryRulesignal492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignal502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rulesignal544 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_rulesignal568 = new BitSet(new long[]{0x00000000000C00E0L});
    public static final BitSet FOLLOW_rulevalue_in_rulesignal602 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulesignal614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_in_entryRulevalue653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevalue664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoInt_in_rulevalue711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_rulevalue744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoBool_in_rulevalue777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoString_in_rulevalue810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoInt_in_entryRuleEsoInt856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoInt867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEsoInt906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoString_in_entryRuleEsoString951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoString962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEsoString1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_entryRuleEsoFloat1046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoFloat1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleEsoFloat1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoBool_in_entryRuleEsoBool1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoBool1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEsoBool1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEsoBool1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekvpair_in_entryRulekvpair1249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulekvpair1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulekvpair1296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair1313 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulekvpair1330 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulekvpair1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rulekvpair1389 = new BitSet(new long[]{0x0000000000000002L});

}