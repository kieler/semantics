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

@SuppressWarnings("all")
public class InternalEsoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ALPHANUMSPECIAL", "RULE_INT", "RULE_STRING", "RULE_FLOAT", "RULE_BOOL", "RULE_SPECIAL", "RULE_WS", "'!'", "'reset'", "';'", "'%'", "'Output'", "':'", "'('", "')'", "'%%'"
    };
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
    public static final int T__13=13;
    public static final int RULE_SPECIAL=9;
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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:67:1: entryRuletracelist returns [EObject current=null] : iv_ruletracelist= ruletracelist EOF ;
    public final EObject entryRuletracelist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletracelist = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:68:2: (iv_ruletracelist= ruletracelist EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:69:2: iv_ruletracelist= ruletracelist EOF
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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:76:1: ruletracelist returns [EObject current=null] : ( (lv_traces_0_0= ruletrace ) )+ ;
    public final EObject ruletracelist() throws RecognitionException {
        EObject current = null;

        EObject lv_traces_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:79:28: ( ( (lv_traces_0_0= ruletrace ) )+ )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:80:1: ( (lv_traces_0_0= ruletrace ) )+
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:80:1: ( (lv_traces_0_0= ruletrace ) )+
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
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:81:1: (lv_traces_0_0= ruletrace )
            	    {
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:81:1: (lv_traces_0_0= ruletrace )
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:82:3: lv_traces_0_0= ruletrace
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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:106:1: entryRuletrace returns [EObject current=null] : iv_ruletrace= ruletrace EOF ;
    public final EObject entryRuletrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletrace = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:107:2: (iv_ruletrace= ruletrace EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:108:2: iv_ruletrace= ruletrace EOF
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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:115:1: ruletrace returns [EObject current=null] : (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+ ) ;
    public final EObject ruletrace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ticks_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:118:28: ( (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+ ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:119:1: (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+ )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:119:1: (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+ )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:119:3: otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruletick ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruletrace213); 

                	newLeafNode(otherlv_0, grammarAccess.getTraceAccess().getExclamationMarkKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruletrace225); 

                	newLeafNode(otherlv_1, grammarAccess.getTraceAccess().getResetKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruletrace237); 

                	newLeafNode(otherlv_2, grammarAccess.getTraceAccess().getSemicolonKeyword_2());
                
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:131:1: ( (lv_ticks_3_0= ruletick ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ALPHANUMSPECIAL||(LA2_0>=13 && LA2_0<=14)||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:132:1: (lv_ticks_3_0= ruletick )
            	    {
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:132:1: (lv_ticks_3_0= ruletick )
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:133:3: lv_ticks_3_0= ruletick
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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:157:1: entryRuletick returns [EObject current=null] : iv_ruletick= ruletick EOF ;
    public final EObject entryRuletick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletick = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:158:2: (iv_ruletick= ruletick EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:159:2: iv_ruletick= ruletick EOF
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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:166:1: ruletick returns [EObject current=null] : ( () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )* )? ( (lv_extraInfos_6_0= rulekvpair ) )* otherlv_7= ';' ) ;
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
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:169:28: ( ( () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )* )? ( (lv_extraInfos_6_0= rulekvpair ) )* otherlv_7= ';' ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:170:1: ( () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )* )? ( (lv_extraInfos_6_0= rulekvpair ) )* otherlv_7= ';' )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:170:1: ( () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )* )? ( (lv_extraInfos_6_0= rulekvpair ) )* otherlv_7= ';' )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:170:2: () ( (lv_input_1_0= rulesignal ) )* (otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )* )? ( (lv_extraInfos_6_0= rulekvpair ) )* otherlv_7= ';'
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:170:2: ()
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:171:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTickAccess().getTickAction_0(),
                        current);
                

            }

            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:176:2: ( (lv_input_1_0= rulesignal ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ALPHANUMSPECIAL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:177:1: (lv_input_1_0= rulesignal )
            	    {
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:177:1: (lv_input_1_0= rulesignal )
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:178:3: lv_input_1_0= rulesignal
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

            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:194:3: (otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:194:5: otherlv_2= '%' otherlv_3= 'Output' otherlv_4= ':' ( (lv_output_5_0= rulesignal ) )*
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruletick374); 

                        	newLeafNode(otherlv_2, grammarAccess.getTickAccess().getPercentSignKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruletick386); 

                        	newLeafNode(otherlv_3, grammarAccess.getTickAccess().getOutputKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruletick398); 

                        	newLeafNode(otherlv_4, grammarAccess.getTickAccess().getColonKeyword_2_2());
                        
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:206:1: ( (lv_output_5_0= rulesignal ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ALPHANUMSPECIAL) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:207:1: (lv_output_5_0= rulesignal )
                    	    {
                    	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:207:1: (lv_output_5_0= rulesignal )
                    	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:208:3: lv_output_5_0= rulesignal
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

            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:224:5: ( (lv_extraInfos_6_0= rulekvpair ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:225:1: (lv_extraInfos_6_0= rulekvpair )
            	    {
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:225:1: (lv_extraInfos_6_0= rulekvpair )
            	    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:226:3: lv_extraInfos_6_0= rulekvpair
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

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruletick456); 

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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:254:1: entryRulesignal returns [EObject current=null] : iv_rulesignal= rulesignal EOF ;
    public final EObject entryRulesignal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignal = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:255:2: (iv_rulesignal= rulesignal EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:256:2: iv_rulesignal= rulesignal EOF
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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:263:1: rulesignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( (lv_valued_1_0= '(' ) )? ( ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) ) otherlv_3= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:266:28: ( ( ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( (lv_valued_1_0= '(' ) )? ( ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) ) otherlv_3= ')' )? ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:267:1: ( ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( (lv_valued_1_0= '(' ) )? ( ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) ) otherlv_3= ')' )? )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:267:1: ( ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( (lv_valued_1_0= '(' ) )? ( ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) ) otherlv_3= ')' )? )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:267:2: ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) ) ( (lv_valued_1_0= '(' ) )? ( ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) ) otherlv_3= ')' )?
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:267:2: ( (lv_name_0_0= RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:268:1: (lv_name_0_0= RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:268:1: (lv_name_0_0= RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:269:3: lv_name_0_0= RULE_ALPHANUMSPECIAL
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

            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:285:2: ( (lv_valued_1_0= '(' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:286:1: (lv_valued_1_0= '(' )
                    {
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:286:1: (lv_valued_1_0= '(' )
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:287:3: lv_valued_1_0= '('
                    {
                    lv_valued_1_0=(Token)match(input,17,FOLLOW_17_in_rulesignal567); 

                            newLeafNode(lv_valued_1_0, grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSignalRule());
                    	        }
                           		setWithLastConsumed(current, "valued", true, "(");
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:300:3: ( ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) ) otherlv_3= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_BOOL)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:300:4: ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) ) otherlv_3= ')'
                    {
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:300:4: ( ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) ) )
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:301:1: ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) )
                    {
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:301:1: ( (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString ) )
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:302:1: (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString )
                    {
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:302:1: (lv_val_2_1= ruleEsoInt | lv_val_2_2= ruleEsoFloat | lv_val_2_3= ruleEsoBool | lv_val_2_4= ruleEsoString )
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
                    case RULE_BOOL:
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
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:303:3: lv_val_2_1= ruleEsoInt
                            {
                             
                            	        newCompositeNode(grammarAccess.getSignalAccess().getValEsoIntParserRuleCall_2_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleEsoInt_in_rulesignal605);
                            lv_val_2_1=ruleEsoInt();

                            state._fsp--;


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
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:318:8: lv_val_2_2= ruleEsoFloat
                            {
                             
                            	        newCompositeNode(grammarAccess.getSignalAccess().getValEsoFloatParserRuleCall_2_0_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleEsoFloat_in_rulesignal624);
                            lv_val_2_2=ruleEsoFloat();

                            state._fsp--;


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
                            break;
                        case 3 :
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:333:8: lv_val_2_3= ruleEsoBool
                            {
                             
                            	        newCompositeNode(grammarAccess.getSignalAccess().getValEsoBoolParserRuleCall_2_0_0_2()); 
                            	    
                            pushFollow(FOLLOW_ruleEsoBool_in_rulesignal643);
                            lv_val_2_3=ruleEsoBool();

                            state._fsp--;


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
                            break;
                        case 4 :
                            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:348:8: lv_val_2_4= ruleEsoString
                            {
                             
                            	        newCompositeNode(grammarAccess.getSignalAccess().getValEsoStringParserRuleCall_2_0_0_3()); 
                            	    
                            pushFollow(FOLLOW_ruleEsoString_in_rulesignal662);
                            lv_val_2_4=ruleEsoString();

                            state._fsp--;


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
                            break;

                    }


                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulesignal677); 

                        	newLeafNode(otherlv_3, grammarAccess.getSignalAccess().getRightParenthesisKeyword_2_1());
                        

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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:378:1: entryRulekvpair returns [EObject current=null] : iv_rulekvpair= rulekvpair EOF ;
    public final EObject entryRulekvpair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulekvpair = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:379:2: (iv_rulekvpair= rulekvpair EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:380:2: iv_rulekvpair= rulekvpair EOF
            {
             newCompositeNode(grammarAccess.getKvpairRule()); 
            pushFollow(FOLLOW_rulekvpair_in_entryRulekvpair715);
            iv_rulekvpair=rulekvpair();

            state._fsp--;

             current =iv_rulekvpair; 
            match(input,EOF,FOLLOW_EOF_in_entryRulekvpair725); 

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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:387:1: rulekvpair returns [EObject current=null] : ( () otherlv_1= '%%' ( (lv_key_2_0= RULE_ALPHANUMSPECIAL ) ) otherlv_3= ':' ( ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) ) ) ) ;
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
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:390:28: ( ( () otherlv_1= '%%' ( (lv_key_2_0= RULE_ALPHANUMSPECIAL ) ) otherlv_3= ':' ( ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) ) ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:391:1: ( () otherlv_1= '%%' ( (lv_key_2_0= RULE_ALPHANUMSPECIAL ) ) otherlv_3= ':' ( ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) ) ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:391:1: ( () otherlv_1= '%%' ( (lv_key_2_0= RULE_ALPHANUMSPECIAL ) ) otherlv_3= ':' ( ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:391:2: () otherlv_1= '%%' ( (lv_key_2_0= RULE_ALPHANUMSPECIAL ) ) otherlv_3= ':' ( ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:391:2: ()
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:392:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKvpairAccess().getKvpairAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_rulekvpair771); 

                	newLeafNode(otherlv_1, grammarAccess.getKvpairAccess().getPercentSignPercentSignKeyword_1());
                
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:401:1: ( (lv_key_2_0= RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:402:1: (lv_key_2_0= RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:402:1: (lv_key_2_0= RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:403:3: lv_key_2_0= RULE_ALPHANUMSPECIAL
            {
            lv_key_2_0=(Token)match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair788); 

            			newLeafNode(lv_key_2_0, grammarAccess.getKvpairAccess().getKeyAlphaNumSpecialTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKvpairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_2_0, 
                    		"AlphaNumSpecial");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_rulekvpair805); 

                	newLeafNode(otherlv_3, grammarAccess.getKvpairAccess().getColonKeyword_3());
                
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:423:1: ( ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:424:1: ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:424:1: ( (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:425:1: (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:425:1: (lv_value_4_1= ruleEsoJson | lv_value_4_2= ruleEsoString | lv_value_4_3= ruleEsoFloat | lv_value_4_4= ruleEsoBool | lv_value_4_5= ruleEsoInt )
            int alt10=5;
            switch ( input.LA(1) ) {
            case RULE_ALPHANUMSPECIAL:
                {
                alt10=1;
                }
                break;
            case RULE_STRING:
                {
                alt10=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt10=3;
                }
                break;
            case RULE_BOOL:
                {
                alt10=4;
                }
                break;
            case RULE_INT:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:426:3: lv_value_4_1= ruleEsoJson
                    {
                     
                    	        newCompositeNode(grammarAccess.getKvpairAccess().getValueEsoJsonParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEsoJson_in_rulekvpair828);
                    lv_value_4_1=ruleEsoJson();

                    state._fsp--;


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
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:441:8: lv_value_4_2= ruleEsoString
                    {
                     
                    	        newCompositeNode(grammarAccess.getKvpairAccess().getValueEsoStringParserRuleCall_4_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleEsoString_in_rulekvpair847);
                    lv_value_4_2=ruleEsoString();

                    state._fsp--;


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
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:456:8: lv_value_4_3= ruleEsoFloat
                    {
                     
                    	        newCompositeNode(grammarAccess.getKvpairAccess().getValueEsoFloatParserRuleCall_4_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleEsoFloat_in_rulekvpair866);
                    lv_value_4_3=ruleEsoFloat();

                    state._fsp--;


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
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:471:8: lv_value_4_4= ruleEsoBool
                    {
                     
                    	        newCompositeNode(grammarAccess.getKvpairAccess().getValueEsoBoolParserRuleCall_4_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleEsoBool_in_rulekvpair885);
                    lv_value_4_4=ruleEsoBool();

                    state._fsp--;


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
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:486:8: lv_value_4_5= ruleEsoInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getKvpairAccess().getValueEsoIntParserRuleCall_4_0_4()); 
                    	    
                    pushFollow(FOLLOW_ruleEsoInt_in_rulekvpair904);
                    lv_value_4_5=ruleEsoInt();

                    state._fsp--;


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


    // $ANTLR start "entryRuleEsoInt"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:512:1: entryRuleEsoInt returns [EObject current=null] : iv_ruleEsoInt= ruleEsoInt EOF ;
    public final EObject entryRuleEsoInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsoInt = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:513:2: (iv_ruleEsoInt= ruleEsoInt EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:514:2: iv_ruleEsoInt= ruleEsoInt EOF
            {
             newCompositeNode(grammarAccess.getEsoIntRule()); 
            pushFollow(FOLLOW_ruleEsoInt_in_entryRuleEsoInt943);
            iv_ruleEsoInt=ruleEsoInt();

            state._fsp--;

             current =iv_ruleEsoInt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoInt953); 

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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:521:1: ruleEsoInt returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleEsoInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:524:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:525:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:525:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:526:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:526:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:527:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEsoInt994); 

            			newLeafNode(lv_value_0_0, grammarAccess.getEsoIntAccess().getValueINTTerminalRuleCall_0()); 
            		

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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:551:1: entryRuleEsoString returns [EObject current=null] : iv_ruleEsoString= ruleEsoString EOF ;
    public final EObject entryRuleEsoString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsoString = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:552:2: (iv_ruleEsoString= ruleEsoString EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:553:2: iv_ruleEsoString= ruleEsoString EOF
            {
             newCompositeNode(grammarAccess.getEsoStringRule()); 
            pushFollow(FOLLOW_ruleEsoString_in_entryRuleEsoString1034);
            iv_ruleEsoString=ruleEsoString();

            state._fsp--;

             current =iv_ruleEsoString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoString1044); 

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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:560:1: ruleEsoString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleEsoString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:563:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:564:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:564:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:565:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:565:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:566:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEsoString1085); 

            			newLeafNode(lv_value_0_0, grammarAccess.getEsoStringAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:590:1: entryRuleEsoFloat returns [EObject current=null] : iv_ruleEsoFloat= ruleEsoFloat EOF ;
    public final EObject entryRuleEsoFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsoFloat = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:591:2: (iv_ruleEsoFloat= ruleEsoFloat EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:592:2: iv_ruleEsoFloat= ruleEsoFloat EOF
            {
             newCompositeNode(grammarAccess.getEsoFloatRule()); 
            pushFollow(FOLLOW_ruleEsoFloat_in_entryRuleEsoFloat1125);
            iv_ruleEsoFloat=ruleEsoFloat();

            state._fsp--;

             current =iv_ruleEsoFloat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoFloat1135); 

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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:599:1: ruleEsoFloat returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleEsoFloat() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:602:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:603:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:603:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:604:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:604:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:605:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleEsoFloat1176); 

            			newLeafNode(lv_value_0_0, grammarAccess.getEsoFloatAccess().getValueFLOATTerminalRuleCall_0()); 
            		

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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:629:1: entryRuleEsoBool returns [EObject current=null] : iv_ruleEsoBool= ruleEsoBool EOF ;
    public final EObject entryRuleEsoBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsoBool = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:630:2: (iv_ruleEsoBool= ruleEsoBool EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:631:2: iv_ruleEsoBool= ruleEsoBool EOF
            {
             newCompositeNode(grammarAccess.getEsoBoolRule()); 
            pushFollow(FOLLOW_ruleEsoBool_in_entryRuleEsoBool1216);
            iv_ruleEsoBool=ruleEsoBool();

            state._fsp--;

             current =iv_ruleEsoBool; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoBool1226); 

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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:638:1: ruleEsoBool returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL ) ) ;
    public final EObject ruleEsoBool() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:641:28: ( ( (lv_value_0_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:642:1: ( (lv_value_0_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:642:1: ( (lv_value_0_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:643:1: (lv_value_0_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:643:1: (lv_value_0_0= RULE_BOOL )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:644:3: lv_value_0_0= RULE_BOOL
            {
            lv_value_0_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleEsoBool1267); 

            			newLeafNode(lv_value_0_0, grammarAccess.getEsoBoolAccess().getValueBOOLTerminalRuleCall_0()); 
            		

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


    // $ANTLR start "entryRuleEsoJson"
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:668:1: entryRuleEsoJson returns [EObject current=null] : iv_ruleEsoJson= ruleEsoJson EOF ;
    public final EObject entryRuleEsoJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsoJson = null;


        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:669:2: (iv_ruleEsoJson= ruleEsoJson EOF )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:670:2: iv_ruleEsoJson= ruleEsoJson EOF
            {
             newCompositeNode(grammarAccess.getEsoJsonRule()); 
            pushFollow(FOLLOW_ruleEsoJson_in_entryRuleEsoJson1307);
            iv_ruleEsoJson=ruleEsoJson();

            state._fsp--;

             current =iv_ruleEsoJson; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoJson1317); 

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
    // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:677:1: ruleEsoJson returns [EObject current=null] : ( (lv_value_0_0= RULE_ALPHANUMSPECIAL ) ) ;
    public final EObject ruleEsoJson() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:680:28: ( ( (lv_value_0_0= RULE_ALPHANUMSPECIAL ) ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:681:1: ( (lv_value_0_0= RULE_ALPHANUMSPECIAL ) )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:681:1: ( (lv_value_0_0= RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:682:1: (lv_value_0_0= RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:682:1: (lv_value_0_0= RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.eso/src-gen/de/cau/cs/kieler/sim/eso/parser/antlr/internal/InternalEso.g:683:3: lv_value_0_0= RULE_ALPHANUMSPECIAL
            {
            lv_value_0_0=(Token)match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_ruleEsoJson1358); 

            			newLeafNode(lv_value_0_0, grammarAccess.getEsoJsonAccess().getValueAlphaNumSpecialTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEsoJsonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"AlphaNumSpecial");
            	    

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
    // $ANTLR end "ruleEsoJson"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruletracelist_in_entryRuletracelist75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletracelist85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletrace_in_ruletracelist130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruletrace_in_entryRuletrace166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletrace176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruletrace213 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruletrace225 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruletrace237 = new BitSet(new long[]{0x0000000000086010L});
    public static final BitSet FOLLOW_ruletick_in_ruletrace258 = new BitSet(new long[]{0x0000000000086012L});
    public static final BitSet FOLLOW_ruletick_in_entryRuletick295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletick305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_ruletick360 = new BitSet(new long[]{0x0000000000086010L});
    public static final BitSet FOLLOW_14_in_ruletick374 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruletick386 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruletick398 = new BitSet(new long[]{0x0000000000082010L});
    public static final BitSet FOLLOW_rulesignal_in_ruletick419 = new BitSet(new long[]{0x0000000000082010L});
    public static final BitSet FOLLOW_rulekvpair_in_ruletick443 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13_in_ruletick456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_entryRulesignal492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignal502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rulesignal544 = new BitSet(new long[]{0x00000000000201E2L});
    public static final BitSet FOLLOW_17_in_rulesignal567 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_ruleEsoInt_in_rulesignal605 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_rulesignal624 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleEsoBool_in_rulesignal643 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleEsoString_in_rulesignal662 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulesignal677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekvpair_in_entryRulekvpair715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulekvpair725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulekvpair771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rulekvpair788 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulekvpair805 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleEsoJson_in_rulekvpair828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoString_in_rulekvpair847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_rulekvpair866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoBool_in_rulekvpair885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoInt_in_rulekvpair904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoInt_in_entryRuleEsoInt943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoInt953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEsoInt994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoString_in_entryRuleEsoString1034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoString1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEsoString1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_entryRuleEsoFloat1125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoFloat1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleEsoFloat1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoBool_in_entryRuleEsoBool1216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoBool1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleEsoBool1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoJson_in_entryRuleEsoJson1307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoJson1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_ruleEsoJson1358 = new BitSet(new long[]{0x0000000000000002L});

}