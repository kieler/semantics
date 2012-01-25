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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ALPHA", "RULE_ALPHANUM", "RULE_ALPHANUMSPECIAL", "RULE_NUM", "RULE_DIGIT", "RULE_SPECIAL", "RULE_COMMENT", "RULE_WS", "'!'", "'reset'", "';'", "'%'", "'Output'", "':'", "'('", "')'", "'%%'"
    };
    public static final int RULE_ALPHANUM=5;
    public static final int T__20=20;
    public static final int RULE_ALPHA=4;
    public static final int RULE_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_NUM=7;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_SPECIAL=9;
    public static final int RULE_ALPHANUMSPECIAL=6;
    public static final int RULE_WS=11;
    public static final int RULE_DIGIT=8;

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

                if ( (LA1_0==12) ) {
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
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruletrace213); 

                	newLeafNode(otherlv_0, grammarAccess.getTraceAccess().getExclamationMarkKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruletrace225); 

                	newLeafNode(otherlv_1, grammarAccess.getTraceAccess().getResetKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruletrace237); 

                	newLeafNode(otherlv_2, grammarAccess.getTraceAccess().getSemicolonKeyword_2());
                
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:131:1: ( (lv_ticks_3_0= ruletick ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ALPHA && LA2_0<=RULE_ALPHANUMSPECIAL)||(LA2_0>=14 && LA2_0<=15)||LA2_0==20) ) {
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

                if ( ((LA3_0>=RULE_ALPHA && LA3_0<=RULE_ALPHANUMSPECIAL)) ) {
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

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:194:5: otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )*
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruletick374); 

                        	newLeafNode(otherlv_2, grammarAccess.getTickAccess().getPercentSignKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruletick386); 

                        	newLeafNode(otherlv_3, grammarAccess.getTickAccess().getOutputKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruletick398); 

                        	newLeafNode(otherlv_4, grammarAccess.getTickAccess().getColonKeyword_2_2());
                        
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:206:1: ( (lv_output_5_0= rulesignal ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=RULE_ALPHA && LA4_0<=RULE_ALPHANUMSPECIAL)) ) {
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

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruletick456); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:263:1: rulesignal returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ALPHA | lv_name_0_2= RULE_ALPHANUM | lv_name_0_3= RULE_ALPHANUMSPECIAL ) ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) otherlv_3= ')' )? ) ;
    public final EObject rulesignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_valued_1_0=null;
        Token lv_val_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:266:28: ( ( ( ( (lv_name_0_1= RULE_ALPHA | lv_name_0_2= RULE_ALPHANUM | lv_name_0_3= RULE_ALPHANUMSPECIAL ) ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) otherlv_3= ')' )? ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:267:1: ( ( ( (lv_name_0_1= RULE_ALPHA | lv_name_0_2= RULE_ALPHANUM | lv_name_0_3= RULE_ALPHANUMSPECIAL ) ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) otherlv_3= ')' )? )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:267:1: ( ( ( (lv_name_0_1= RULE_ALPHA | lv_name_0_2= RULE_ALPHANUM | lv_name_0_3= RULE_ALPHANUMSPECIAL ) ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) otherlv_3= ')' )? )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:267:2: ( ( (lv_name_0_1= RULE_ALPHA | lv_name_0_2= RULE_ALPHANUM | lv_name_0_3= RULE_ALPHANUMSPECIAL ) ) ) ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) otherlv_3= ')' )?
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:267:2: ( ( (lv_name_0_1= RULE_ALPHA | lv_name_0_2= RULE_ALPHANUM | lv_name_0_3= RULE_ALPHANUMSPECIAL ) ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:268:1: ( (lv_name_0_1= RULE_ALPHA | lv_name_0_2= RULE_ALPHANUM | lv_name_0_3= RULE_ALPHANUMSPECIAL ) )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:268:1: ( (lv_name_0_1= RULE_ALPHA | lv_name_0_2= RULE_ALPHANUM | lv_name_0_3= RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:269:1: (lv_name_0_1= RULE_ALPHA | lv_name_0_2= RULE_ALPHANUM | lv_name_0_3= RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:269:1: (lv_name_0_1= RULE_ALPHA | lv_name_0_2= RULE_ALPHANUM | lv_name_0_3= RULE_ALPHANUMSPECIAL )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ALPHA:
                {
                alt7=1;
                }
                break;
            case RULE_ALPHANUM:
                {
                alt7=2;
                }
                break;
            case RULE_ALPHANUMSPECIAL:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:270:3: lv_name_0_1= RULE_ALPHA
                    {
                    lv_name_0_1=(Token)match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rulesignal546); 

                    			newLeafNode(lv_name_0_1, grammarAccess.getSignalAccess().getNameAlphaTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSignalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_1, 
                            		"Alpha");
                    	    

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:285:8: lv_name_0_2= RULE_ALPHANUM
                    {
                    lv_name_0_2=(Token)match(input,RULE_ALPHANUM,FOLLOW_RULE_ALPHANUM_in_rulesignal566); 

                    			newLeafNode(lv_name_0_2, grammarAccess.getSignalAccess().getNameAlphaNumTerminalRuleCall_0_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSignalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_2, 
                            		"AlphaNum");
                    	    

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:300:8: lv_name_0_3= RULE_ALPHANUMSPECIAL
                    {
                    lv_name_0_3=(Token)match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rulesignal586); 

                    			newLeafNode(lv_name_0_3, grammarAccess.getSignalAccess().getNameAlphaNumSpecialTerminalRuleCall_0_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSignalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_3, 
                            		"AlphaNumSpecial");
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:318:2: ( ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) otherlv_3= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:318:3: ( (lv_valued_1_0= '(' ) ) ( (lv_val_2_0= RULE_NUM ) ) otherlv_3= ')'
                    {
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:318:3: ( (lv_valued_1_0= '(' ) )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:319:1: (lv_valued_1_0= '(' )
                    {
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:319:1: (lv_valued_1_0= '(' )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:320:3: lv_valued_1_0= '('
                    {
                    lv_valued_1_0=(Token)match(input,18,FOLLOW_18_in_rulesignal613); 

                            newLeafNode(lv_valued_1_0, grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSignalRule());
                    	        }
                           		setWithLastConsumed(current, "valued", true, "(");
                    	    

                    }


                    }

                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:333:2: ( (lv_val_2_0= RULE_NUM ) )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:334:1: (lv_val_2_0= RULE_NUM )
                    {
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:334:1: (lv_val_2_0= RULE_NUM )
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:335:3: lv_val_2_0= RULE_NUM
                    {
                    lv_val_2_0=(Token)match(input,RULE_NUM,FOLLOW_RULE_NUM_in_rulesignal643); 

                    			newLeafNode(lv_val_2_0, grammarAccess.getSignalAccess().getValNumTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSignalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_2_0, 
                            		"Num");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_rulesignal660); 

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


    // $ANTLR start "entryRulekvpair"
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:363:1: entryRulekvpair returns [EObject current=null] : iv_rulekvpair= rulekvpair EOF ;
    public final EObject entryRulekvpair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulekvpair = null;


        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:364:2: (iv_rulekvpair= rulekvpair EOF )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:365:2: iv_rulekvpair= rulekvpair EOF
            {
             newCompositeNode(grammarAccess.getKvpairRule()); 
            pushFollow(FOLLOW_rulekvpair_in_entryRulekvpair698);
            iv_rulekvpair=rulekvpair();

            state._fsp--;

             current =iv_rulekvpair; 
            match(input,EOF,FOLLOW_EOF_in_entryRulekvpair708); 

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
    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:372:1: rulekvpair returns [EObject current=null] : (otherlv_0= '%%' ( ( (lv_k_1_1= RULE_ALPHA | lv_k_1_2= RULE_ALPHANUM | lv_k_1_3= RULE_ALPHANUMSPECIAL ) ) ) otherlv_2= ':' ( ( (lv_val_3_1= RULE_ALPHA | lv_val_3_2= RULE_ALPHANUM | lv_val_3_3= RULE_ALPHANUMSPECIAL ) ) ) ) ;
    public final EObject rulekvpair() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_k_1_1=null;
        Token lv_k_1_2=null;
        Token lv_k_1_3=null;
        Token otherlv_2=null;
        Token lv_val_3_1=null;
        Token lv_val_3_2=null;
        Token lv_val_3_3=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:375:28: ( (otherlv_0= '%%' ( ( (lv_k_1_1= RULE_ALPHA | lv_k_1_2= RULE_ALPHANUM | lv_k_1_3= RULE_ALPHANUMSPECIAL ) ) ) otherlv_2= ':' ( ( (lv_val_3_1= RULE_ALPHA | lv_val_3_2= RULE_ALPHANUM | lv_val_3_3= RULE_ALPHANUMSPECIAL ) ) ) ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:376:1: (otherlv_0= '%%' ( ( (lv_k_1_1= RULE_ALPHA | lv_k_1_2= RULE_ALPHANUM | lv_k_1_3= RULE_ALPHANUMSPECIAL ) ) ) otherlv_2= ':' ( ( (lv_val_3_1= RULE_ALPHA | lv_val_3_2= RULE_ALPHANUM | lv_val_3_3= RULE_ALPHANUMSPECIAL ) ) ) )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:376:1: (otherlv_0= '%%' ( ( (lv_k_1_1= RULE_ALPHA | lv_k_1_2= RULE_ALPHANUM | lv_k_1_3= RULE_ALPHANUMSPECIAL ) ) ) otherlv_2= ':' ( ( (lv_val_3_1= RULE_ALPHA | lv_val_3_2= RULE_ALPHANUM | lv_val_3_3= RULE_ALPHANUMSPECIAL ) ) ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:376:3: otherlv_0= '%%' ( ( (lv_k_1_1= RULE_ALPHA | lv_k_1_2= RULE_ALPHANUM | lv_k_1_3= RULE_ALPHANUMSPECIAL ) ) ) otherlv_2= ':' ( ( (lv_val_3_1= RULE_ALPHA | lv_val_3_2= RULE_ALPHANUM | lv_val_3_3= RULE_ALPHANUMSPECIAL ) ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_rulekvpair745); 

                	newLeafNode(otherlv_0, grammarAccess.getKvpairAccess().getPercentSignPercentSignKeyword_0());
                
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:380:1: ( ( (lv_k_1_1= RULE_ALPHA | lv_k_1_2= RULE_ALPHANUM | lv_k_1_3= RULE_ALPHANUMSPECIAL ) ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:381:1: ( (lv_k_1_1= RULE_ALPHA | lv_k_1_2= RULE_ALPHANUM | lv_k_1_3= RULE_ALPHANUMSPECIAL ) )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:381:1: ( (lv_k_1_1= RULE_ALPHA | lv_k_1_2= RULE_ALPHANUM | lv_k_1_3= RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:382:1: (lv_k_1_1= RULE_ALPHA | lv_k_1_2= RULE_ALPHANUM | lv_k_1_3= RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:382:1: (lv_k_1_1= RULE_ALPHA | lv_k_1_2= RULE_ALPHANUM | lv_k_1_3= RULE_ALPHANUMSPECIAL )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ALPHA:
                {
                alt9=1;
                }
                break;
            case RULE_ALPHANUM:
                {
                alt9=2;
                }
                break;
            case RULE_ALPHANUMSPECIAL:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:383:3: lv_k_1_1= RULE_ALPHA
                    {
                    lv_k_1_1=(Token)match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rulekvpair764); 

                    			newLeafNode(lv_k_1_1, grammarAccess.getKvpairAccess().getKAlphaTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKvpairRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"k",
                            		lv_k_1_1, 
                            		"Alpha");
                    	    

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:398:8: lv_k_1_2= RULE_ALPHANUM
                    {
                    lv_k_1_2=(Token)match(input,RULE_ALPHANUM,FOLLOW_RULE_ALPHANUM_in_rulekvpair784); 

                    			newLeafNode(lv_k_1_2, grammarAccess.getKvpairAccess().getKAlphaNumTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKvpairRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"k",
                            		lv_k_1_2, 
                            		"AlphaNum");
                    	    

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:413:8: lv_k_1_3= RULE_ALPHANUMSPECIAL
                    {
                    lv_k_1_3=(Token)match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair804); 

                    			newLeafNode(lv_k_1_3, grammarAccess.getKvpairAccess().getKAlphaNumSpecialTerminalRuleCall_1_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKvpairRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"k",
                            		lv_k_1_3, 
                            		"AlphaNumSpecial");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulekvpair824); 

                	newLeafNode(otherlv_2, grammarAccess.getKvpairAccess().getColonKeyword_2());
                
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:435:1: ( ( (lv_val_3_1= RULE_ALPHA | lv_val_3_2= RULE_ALPHANUM | lv_val_3_3= RULE_ALPHANUMSPECIAL ) ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:436:1: ( (lv_val_3_1= RULE_ALPHA | lv_val_3_2= RULE_ALPHANUM | lv_val_3_3= RULE_ALPHANUMSPECIAL ) )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:436:1: ( (lv_val_3_1= RULE_ALPHA | lv_val_3_2= RULE_ALPHANUM | lv_val_3_3= RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:437:1: (lv_val_3_1= RULE_ALPHA | lv_val_3_2= RULE_ALPHANUM | lv_val_3_3= RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:437:1: (lv_val_3_1= RULE_ALPHA | lv_val_3_2= RULE_ALPHANUM | lv_val_3_3= RULE_ALPHANUMSPECIAL )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_ALPHA:
                {
                alt10=1;
                }
                break;
            case RULE_ALPHANUM:
                {
                alt10=2;
                }
                break;
            case RULE_ALPHANUMSPECIAL:
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
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:438:3: lv_val_3_1= RULE_ALPHA
                    {
                    lv_val_3_1=(Token)match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rulekvpair843); 

                    			newLeafNode(lv_val_3_1, grammarAccess.getKvpairAccess().getValAlphaTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKvpairRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_3_1, 
                            		"Alpha");
                    	    

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:453:8: lv_val_3_2= RULE_ALPHANUM
                    {
                    lv_val_3_2=(Token)match(input,RULE_ALPHANUM,FOLLOW_RULE_ALPHANUM_in_rulekvpair863); 

                    			newLeafNode(lv_val_3_2, grammarAccess.getKvpairAccess().getValAlphaNumTerminalRuleCall_3_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKvpairRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_3_2, 
                            		"AlphaNum");
                    	    

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sim.esi/src-gen/de/cau/cs/kieler/sim/esi/parser/antlr/internal/InternalEsi.g:468:8: lv_val_3_3= RULE_ALPHANUMSPECIAL
                    {
                    lv_val_3_3=(Token)match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair883); 

                    			newLeafNode(lv_val_3_3, grammarAccess.getKvpairAccess().getValAlphaNumSpecialTerminalRuleCall_3_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKvpairRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_3_3, 
                            		"AlphaNumSpecial");
                    	    

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
    public static final BitSet FOLLOW_ruletrace_in_ruletracelist130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruletrace_in_entryRuletrace166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletrace176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruletrace213 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruletrace225 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruletrace237 = new BitSet(new long[]{0x000000000010C070L});
    public static final BitSet FOLLOW_ruletick_in_ruletrace258 = new BitSet(new long[]{0x000000000010C072L});
    public static final BitSet FOLLOW_ruletick_in_entryRuletick295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletick305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_ruletick360 = new BitSet(new long[]{0x000000000010C070L});
    public static final BitSet FOLLOW_15_in_ruletick374 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruletick386 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruletick398 = new BitSet(new long[]{0x0000000000104070L});
    public static final BitSet FOLLOW_rulesignal_in_ruletick419 = new BitSet(new long[]{0x0000000000104070L});
    public static final BitSet FOLLOW_rulekvpair_in_ruletick443 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14_in_ruletick456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_entryRulesignal492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignal502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rulesignal546 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_ALPHANUM_in_rulesignal566 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rulesignal586 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_rulesignal613 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NUM_in_rulesignal643 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulesignal660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekvpair_in_entryRulekvpair698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulekvpair708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulekvpair745 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rulekvpair764 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_ALPHANUM_in_rulekvpair784 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair804 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulekvpair824 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rulekvpair843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUM_in_rulekvpair863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair883 = new BitSet(new long[]{0x0000000000000002L});

}