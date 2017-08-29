package de.cau.cs.kieler.simulation.trace.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.simulation.trace.services.KTraceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKTraceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_SL_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'!'", "'reset'", "';'", "'%'", "'Output:'", "'Output'", "':'", "'%%'", "'='", "'/'", "'pause'", "'scope'", "'{'", "'}'", "'expression'", "'const'", "'input'", "'output'", "'static'", "'signal'", "','", "'ref'", "'extern'", "'schedule'", "'prio'", "'['", "']'", "'combine'", "'('", "')'", "'()'", "'<'", "'>'", "'print'", "'||'", "'&&'", "'|'", "'&'", "'+'", "'-'", "'*'", "'\\''", "'.'", "'_'", "'@'", "'#'", "'conflict'", "'confluent'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'min='", "'max='", "'++'", "'--'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'val'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int T__37=37;
    public static final int RULE_SL_COMMENT_ANNOTATION=11;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=9;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=7;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NUMBER=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalKTraceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKTraceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKTraceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKTrace.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private KTraceGrammarAccess grammarAccess;
     	
        public InternalKTraceParser(TokenStream input, KTraceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TraceFile";	
       	}
       	
       	@Override
       	protected KTraceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTraceFile"
    // InternalKTrace.g:74:1: entryRuleTraceFile returns [EObject current=null] : iv_ruleTraceFile= ruleTraceFile EOF ;
    public final EObject entryRuleTraceFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceFile = null;


        try {
            // InternalKTrace.g:75:2: (iv_ruleTraceFile= ruleTraceFile EOF )
            // InternalKTrace.g:76:2: iv_ruleTraceFile= ruleTraceFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTraceFile=ruleTraceFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTraceFile"


    // $ANTLR start "ruleTraceFile"
    // InternalKTrace.g:83:1: ruleTraceFile returns [EObject current=null] : (this_EsoTraces_0= ruleEsoTraces | this_KTraces_1= ruleKTraces ) ;
    public final EObject ruleTraceFile() throws RecognitionException {
        EObject current = null;

        EObject this_EsoTraces_0 = null;

        EObject this_KTraces_1 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:86:28: ( (this_EsoTraces_0= ruleEsoTraces | this_KTraces_1= ruleKTraces ) )
            // InternalKTrace.g:87:1: (this_EsoTraces_0= ruleEsoTraces | this_KTraces_1= ruleKTraces )
            {
            // InternalKTrace.g:87:1: (this_EsoTraces_0= ruleEsoTraces | this_KTraces_1= ruleKTraces )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID||LA1_0==RULE_COMMENT_ANNOTATION||(LA1_0>=18 && LA1_0<=19)||(LA1_0>=26 && LA1_0<=27)||(LA1_0>=61 && LA1_0<=62)) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKTrace.g:88:2: this_EsoTraces_0= ruleEsoTraces
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTraceFileAccess().getEsoTracesParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EsoTraces_0=ruleEsoTraces();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EsoTraces_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKTrace.g:101:2: this_KTraces_1= ruleKTraces
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTraceFileAccess().getKTracesParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_KTraces_1=ruleKTraces();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KTraces_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleTraceFile"


    // $ANTLR start "entryRuleEsoTraces"
    // InternalKTrace.g:120:1: entryRuleEsoTraces returns [EObject current=null] : iv_ruleEsoTraces= ruleEsoTraces EOF ;
    public final EObject entryRuleEsoTraces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsoTraces = null;


        try {
            // InternalKTrace.g:121:2: (iv_ruleEsoTraces= ruleEsoTraces EOF )
            // InternalKTrace.g:122:2: iv_ruleEsoTraces= ruleEsoTraces EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsoTracesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEsoTraces=ruleEsoTraces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsoTraces; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEsoTraces"


    // $ANTLR start "ruleEsoTraces"
    // InternalKTrace.g:129:1: ruleEsoTraces returns [EObject current=null] : ( (lv_traces_0_0= ruleEsoTrace ) )+ ;
    public final EObject ruleEsoTraces() throws RecognitionException {
        EObject current = null;

        EObject lv_traces_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:132:28: ( ( (lv_traces_0_0= ruleEsoTrace ) )+ )
            // InternalKTrace.g:133:1: ( (lv_traces_0_0= ruleEsoTrace ) )+
            {
            // InternalKTrace.g:133:1: ( (lv_traces_0_0= ruleEsoTrace ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKTrace.g:134:1: (lv_traces_0_0= ruleEsoTrace )
            	    {
            	    // InternalKTrace.g:134:1: (lv_traces_0_0= ruleEsoTrace )
            	    // InternalKTrace.g:135:3: lv_traces_0_0= ruleEsoTrace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEsoTracesAccess().getTracesEsoTraceParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_traces_0_0=ruleEsoTrace();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEsoTracesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"traces",
            	              		lv_traces_0_0, 
            	              		"de.cau.cs.kieler.simulation.trace.KTrace.EsoTrace");
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
    // $ANTLR end "ruleEsoTraces"


    // $ANTLR start "entryRuleEsoTrace"
    // InternalKTrace.g:159:1: entryRuleEsoTrace returns [EObject current=null] : iv_ruleEsoTrace= ruleEsoTrace EOF ;
    public final EObject entryRuleEsoTrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsoTrace = null;


        try {
            // InternalKTrace.g:160:2: (iv_ruleEsoTrace= ruleEsoTrace EOF )
            // InternalKTrace.g:161:2: iv_ruleEsoTrace= ruleEsoTrace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsoTraceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEsoTrace=ruleEsoTrace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsoTrace; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEsoTrace"


    // $ANTLR start "ruleEsoTrace"
    // InternalKTrace.g:168:1: ruleEsoTrace returns [EObject current=null] : (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruleEsoTick ) )+ ) ;
    public final EObject ruleEsoTrace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ticks_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:171:28: ( (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruleEsoTick ) )+ ) )
            // InternalKTrace.g:172:1: (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruleEsoTick ) )+ )
            {
            // InternalKTrace.g:172:1: (otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruleEsoTick ) )+ )
            // InternalKTrace.g:172:3: otherlv_0= '!' otherlv_1= 'reset' otherlv_2= ';' ( (lv_ticks_3_0= ruleEsoTick ) )+
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEsoTraceAccess().getExclamationMarkKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEsoTraceAccess().getResetKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEsoTraceAccess().getSemicolonKeyword_2());
                  
            }
            // InternalKTrace.g:184:1: ( (lv_ticks_3_0= ruleEsoTick ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==RULE_COMMENT_ANNOTATION||(LA3_0>=19 && LA3_0<=20)||LA3_0==24||LA3_0==61) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKTrace.g:185:1: (lv_ticks_3_0= ruleEsoTick )
            	    {
            	    // InternalKTrace.g:185:1: (lv_ticks_3_0= ruleEsoTick )
            	    // InternalKTrace.g:186:3: lv_ticks_3_0= ruleEsoTick
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEsoTraceAccess().getTicksEsoTickParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_ticks_3_0=ruleEsoTick();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEsoTraceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ticks",
            	              		lv_ticks_3_0, 
            	              		"de.cau.cs.kieler.simulation.trace.KTrace.EsoTick");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleEsoTrace"


    // $ANTLR start "entryRuleEsoTick"
    // InternalKTrace.g:210:1: entryRuleEsoTick returns [EObject current=null] : iv_ruleEsoTick= ruleEsoTick EOF ;
    public final EObject entryRuleEsoTick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsoTick = null;


        try {
            // InternalKTrace.g:211:2: (iv_ruleEsoTick= ruleEsoTick EOF )
            // InternalKTrace.g:212:2: iv_ruleEsoTick= ruleEsoTick EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEsoTickRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEsoTick=ruleEsoTick();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEsoTick; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEsoTick"


    // $ANTLR start "ruleEsoTick"
    // InternalKTrace.g:219:1: ruleEsoTick returns [EObject current=null] : ( () ( (lv_inputs_1_0= ruleEmission ) )* (otherlv_2= '%' (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) ) ( (lv_outputs_6_0= ruleEmission ) )* )? ( (lv_annotations_7_0= ruleKVPair ) )* (otherlv_8= '%%' (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) ) ( (lv_annotations_12_0= ruleKVPair ) )* )? otherlv_13= ';' ) ;
    public final EObject ruleEsoTick() throws RecognitionException {
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
        EObject lv_inputs_1_0 = null;

        EObject lv_outputs_6_0 = null;

        EObject lv_annotations_7_0 = null;

        EObject lv_annotations_12_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:222:28: ( ( () ( (lv_inputs_1_0= ruleEmission ) )* (otherlv_2= '%' (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) ) ( (lv_outputs_6_0= ruleEmission ) )* )? ( (lv_annotations_7_0= ruleKVPair ) )* (otherlv_8= '%%' (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) ) ( (lv_annotations_12_0= ruleKVPair ) )* )? otherlv_13= ';' ) )
            // InternalKTrace.g:223:1: ( () ( (lv_inputs_1_0= ruleEmission ) )* (otherlv_2= '%' (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) ) ( (lv_outputs_6_0= ruleEmission ) )* )? ( (lv_annotations_7_0= ruleKVPair ) )* (otherlv_8= '%%' (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) ) ( (lv_annotations_12_0= ruleKVPair ) )* )? otherlv_13= ';' )
            {
            // InternalKTrace.g:223:1: ( () ( (lv_inputs_1_0= ruleEmission ) )* (otherlv_2= '%' (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) ) ( (lv_outputs_6_0= ruleEmission ) )* )? ( (lv_annotations_7_0= ruleKVPair ) )* (otherlv_8= '%%' (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) ) ( (lv_annotations_12_0= ruleKVPair ) )* )? otherlv_13= ';' )
            // InternalKTrace.g:223:2: () ( (lv_inputs_1_0= ruleEmission ) )* (otherlv_2= '%' (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) ) ( (lv_outputs_6_0= ruleEmission ) )* )? ( (lv_annotations_7_0= ruleKVPair ) )* (otherlv_8= '%%' (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) ) ( (lv_annotations_12_0= ruleKVPair ) )* )? otherlv_13= ';'
            {
            // InternalKTrace.g:223:2: ()
            // InternalKTrace.g:224:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEsoTickAccess().getTickAction_0(),
                          current);
                  
            }

            }

            // InternalKTrace.g:232:2: ( (lv_inputs_1_0= ruleEmission ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==RULE_COMMENT_ANNOTATION||LA4_0==61) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKTrace.g:233:1: (lv_inputs_1_0= ruleEmission )
            	    {
            	    // InternalKTrace.g:233:1: (lv_inputs_1_0= ruleEmission )
            	    // InternalKTrace.g:234:3: lv_inputs_1_0= ruleEmission
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEsoTickAccess().getInputsEmissionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_inputs_1_0=ruleEmission();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEsoTickRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"inputs",
            	              		lv_inputs_1_0, 
            	              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Emission");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalKTrace.g:250:3: (otherlv_2= '%' (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) ) ( (lv_outputs_6_0= ruleEmission ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKTrace.g:250:5: otherlv_2= '%' (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) ) ( (lv_outputs_6_0= ruleEmission ) )*
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEsoTickAccess().getPercentSignKeyword_2_0());
                          
                    }
                    // InternalKTrace.g:254:1: (otherlv_3= 'Output:' | (otherlv_4= 'Output' otherlv_5= ':' ) )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==21) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==22) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalKTrace.g:254:3: otherlv_3= 'Output:'
                            {
                            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getEsoTickAccess().getOutputKeyword_2_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalKTrace.g:259:6: (otherlv_4= 'Output' otherlv_5= ':' )
                            {
                            // InternalKTrace.g:259:6: (otherlv_4= 'Output' otherlv_5= ':' )
                            // InternalKTrace.g:259:8: otherlv_4= 'Output' otherlv_5= ':'
                            {
                            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getEsoTickAccess().getOutputKeyword_2_1_1_0());
                                  
                            }
                            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getEsoTickAccess().getColonKeyword_2_1_1_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // InternalKTrace.g:267:3: ( (lv_outputs_6_0= ruleEmission ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID||LA6_0==RULE_COMMENT_ANNOTATION||LA6_0==61) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKTrace.g:268:1: (lv_outputs_6_0= ruleEmission )
                    	    {
                    	    // InternalKTrace.g:268:1: (lv_outputs_6_0= ruleEmission )
                    	    // InternalKTrace.g:269:3: lv_outputs_6_0= ruleEmission
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEsoTickAccess().getOutputsEmissionParserRuleCall_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_9);
                    	    lv_outputs_6_0=ruleEmission();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEsoTickRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"outputs",
                    	              		lv_outputs_6_0, 
                    	              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Emission");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalKTrace.g:285:5: ( (lv_annotations_7_0= ruleKVPair ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalKTrace.g:286:1: (lv_annotations_7_0= ruleKVPair )
            	    {
            	    // InternalKTrace.g:286:1: (lv_annotations_7_0= ruleKVPair )
            	    // InternalKTrace.g:287:3: lv_annotations_7_0= ruleKVPair
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEsoTickAccess().getAnnotationsKVPairParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    lv_annotations_7_0=ruleKVPair();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEsoTickRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_7_0, 
            	              		"de.cau.cs.kieler.simulation.trace.KTrace.KVPair");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalKTrace.g:303:3: (otherlv_8= '%%' (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) ) ( (lv_annotations_12_0= ruleKVPair ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKTrace.g:303:5: otherlv_8= '%%' (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) ) ( (lv_annotations_12_0= ruleKVPair ) )*
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEsoTickAccess().getPercentSignPercentSignKeyword_4_0());
                          
                    }
                    // InternalKTrace.g:307:1: (otherlv_9= 'Output:' | (otherlv_10= 'Output' otherlv_11= ':' ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==21) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==22) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalKTrace.g:307:3: otherlv_9= 'Output:'
                            {
                            otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getEsoTickAccess().getOutputKeyword_4_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalKTrace.g:312:6: (otherlv_10= 'Output' otherlv_11= ':' )
                            {
                            // InternalKTrace.g:312:6: (otherlv_10= 'Output' otherlv_11= ':' )
                            // InternalKTrace.g:312:8: otherlv_10= 'Output' otherlv_11= ':'
                            {
                            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getEsoTickAccess().getOutputKeyword_4_1_1_0());
                                  
                            }
                            otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getEsoTickAccess().getColonKeyword_4_1_1_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // InternalKTrace.g:320:3: ( (lv_annotations_12_0= ruleKVPair ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==24) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalKTrace.g:321:1: (lv_annotations_12_0= ruleKVPair )
                    	    {
                    	    // InternalKTrace.g:321:1: (lv_annotations_12_0= ruleKVPair )
                    	    // InternalKTrace.g:322:3: lv_annotations_12_0= ruleKVPair
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEsoTickAccess().getAnnotationsKVPairParserRuleCall_4_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_11);
                    	    lv_annotations_12_0=ruleKVPair();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEsoTickRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_12_0, 
                    	              		"de.cau.cs.kieler.simulation.trace.KTrace.KVPair");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getEsoTickAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "ruleEsoTick"


    // $ANTLR start "entryRuleKVPair"
    // InternalKTrace.g:350:1: entryRuleKVPair returns [EObject current=null] : iv_ruleKVPair= ruleKVPair EOF ;
    public final EObject entryRuleKVPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKVPair = null;


        try {
            // InternalKTrace.g:351:2: (iv_ruleKVPair= ruleKVPair EOF )
            // InternalKTrace.g:352:2: iv_ruleKVPair= ruleKVPair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKVPairRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKVPair=ruleKVPair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKVPair; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKVPair"


    // $ANTLR start "ruleKVPair"
    // InternalKTrace.g:359:1: ruleKVPair returns [EObject current=null] : (otherlv_0= '%%' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_values_3_0= ruleEStringAllTypes ) ) ) ;
    public final EObject ruleKVPair() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:362:28: ( (otherlv_0= '%%' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_values_3_0= ruleEStringAllTypes ) ) ) )
            // InternalKTrace.g:363:1: (otherlv_0= '%%' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_values_3_0= ruleEStringAllTypes ) ) )
            {
            // InternalKTrace.g:363:1: (otherlv_0= '%%' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_values_3_0= ruleEStringAllTypes ) ) )
            // InternalKTrace.g:363:3: otherlv_0= '%%' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_values_3_0= ruleEStringAllTypes ) )
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKVPairAccess().getPercentSignPercentSignKeyword_0());
                  
            }
            // InternalKTrace.g:367:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalKTrace.g:368:1: (lv_name_1_0= RULE_ID )
            {
            // InternalKTrace.g:368:1: (lv_name_1_0= RULE_ID )
            // InternalKTrace.g:369:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getKVPairAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKVPairRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getKVPairAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalKTrace.g:389:1: ( (lv_values_3_0= ruleEStringAllTypes ) )
            // InternalKTrace.g:390:1: (lv_values_3_0= ruleEStringAllTypes )
            {
            // InternalKTrace.g:390:1: (lv_values_3_0= ruleEStringAllTypes )
            // InternalKTrace.g:391:3: lv_values_3_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKVPairAccess().getValuesEStringAllTypesParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_values_3_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKVPairRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_3_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleKVPair"


    // $ANTLR start "entryRuleKTraces"
    // InternalKTrace.g:415:1: entryRuleKTraces returns [EObject current=null] : iv_ruleKTraces= ruleKTraces EOF ;
    public final EObject entryRuleKTraces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKTraces = null;


        try {
            // InternalKTrace.g:416:2: (iv_ruleKTraces= ruleKTraces EOF )
            // InternalKTrace.g:417:2: iv_ruleKTraces= ruleKTraces EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKTracesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKTraces=ruleKTraces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKTraces; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKTraces"


    // $ANTLR start "ruleKTraces"
    // InternalKTrace.g:424:1: ruleKTraces returns [EObject current=null] : ( ( (lv_pragmas_0_0= rulePragma ) )* (otherlv_1= 'reset' otherlv_2= ';' )? ( (lv_traces_3_0= ruleKTrace ) ) (otherlv_4= 'reset' otherlv_5= ';' ( (lv_traces_6_0= ruleKTrace ) ) )* (otherlv_7= 'reset' otherlv_8= ';' )? ) ;
    public final EObject ruleKTraces() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_pragmas_0_0 = null;

        EObject lv_traces_3_0 = null;

        EObject lv_traces_6_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:427:28: ( ( ( (lv_pragmas_0_0= rulePragma ) )* (otherlv_1= 'reset' otherlv_2= ';' )? ( (lv_traces_3_0= ruleKTrace ) ) (otherlv_4= 'reset' otherlv_5= ';' ( (lv_traces_6_0= ruleKTrace ) ) )* (otherlv_7= 'reset' otherlv_8= ';' )? ) )
            // InternalKTrace.g:428:1: ( ( (lv_pragmas_0_0= rulePragma ) )* (otherlv_1= 'reset' otherlv_2= ';' )? ( (lv_traces_3_0= ruleKTrace ) ) (otherlv_4= 'reset' otherlv_5= ';' ( (lv_traces_6_0= ruleKTrace ) ) )* (otherlv_7= 'reset' otherlv_8= ';' )? )
            {
            // InternalKTrace.g:428:1: ( ( (lv_pragmas_0_0= rulePragma ) )* (otherlv_1= 'reset' otherlv_2= ';' )? ( (lv_traces_3_0= ruleKTrace ) ) (otherlv_4= 'reset' otherlv_5= ';' ( (lv_traces_6_0= ruleKTrace ) ) )* (otherlv_7= 'reset' otherlv_8= ';' )? )
            // InternalKTrace.g:428:2: ( (lv_pragmas_0_0= rulePragma ) )* (otherlv_1= 'reset' otherlv_2= ';' )? ( (lv_traces_3_0= ruleKTrace ) ) (otherlv_4= 'reset' otherlv_5= ';' ( (lv_traces_6_0= ruleKTrace ) ) )* (otherlv_7= 'reset' otherlv_8= ';' )?
            {
            // InternalKTrace.g:428:2: ( (lv_pragmas_0_0= rulePragma ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==62) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_ID) ) {
                        int LA12_3 = input.LA(3);

                        if ( (synpred12_InternalKTrace()) ) {
                            alt12=1;
                        }


                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalKTrace.g:429:1: (lv_pragmas_0_0= rulePragma )
            	    {
            	    // InternalKTrace.g:429:1: (lv_pragmas_0_0= rulePragma )
            	    // InternalKTrace.g:430:3: lv_pragmas_0_0= rulePragma
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKTracesAccess().getPragmasPragmaParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_pragmas_0_0=rulePragma();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKTracesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pragmas",
            	              		lv_pragmas_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Pragma");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalKTrace.g:446:3: (otherlv_1= 'reset' otherlv_2= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKTrace.g:446:5: otherlv_1= 'reset' otherlv_2= ';'
                    {
                    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getKTracesAccess().getResetKeyword_1_0());
                          
                    }
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getKTracesAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // InternalKTrace.g:454:3: ( (lv_traces_3_0= ruleKTrace ) )
            // InternalKTrace.g:455:1: (lv_traces_3_0= ruleKTrace )
            {
            // InternalKTrace.g:455:1: (lv_traces_3_0= ruleKTrace )
            // InternalKTrace.g:456:3: lv_traces_3_0= ruleKTrace
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKTracesAccess().getTracesKTraceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_traces_3_0=ruleKTrace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKTracesRule());
              	        }
                     		add(
                     			current, 
                     			"traces",
                      		lv_traces_3_0, 
                      		"de.cau.cs.kieler.simulation.trace.KTrace.KTrace");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:472:2: (otherlv_4= 'reset' otherlv_5= ';' ( (lv_traces_6_0= ruleKTrace ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==19) ) {
                        int LA14_3 = input.LA(3);

                        if ( (LA14_3==RULE_ID||LA14_3==RULE_COMMENT_ANNOTATION||LA14_3==19||(LA14_3>=26 && LA14_3<=27)||(LA14_3>=61 && LA14_3<=62)) ) {
                            alt14=1;
                        }


                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalKTrace.g:472:4: otherlv_4= 'reset' otherlv_5= ';' ( (lv_traces_6_0= ruleKTrace ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getKTracesAccess().getResetKeyword_3_0());
            	          
            	    }
            	    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getKTracesAccess().getSemicolonKeyword_3_1());
            	          
            	    }
            	    // InternalKTrace.g:480:1: ( (lv_traces_6_0= ruleKTrace ) )
            	    // InternalKTrace.g:481:1: (lv_traces_6_0= ruleKTrace )
            	    {
            	    // InternalKTrace.g:481:1: (lv_traces_6_0= ruleKTrace )
            	    // InternalKTrace.g:482:3: lv_traces_6_0= ruleKTrace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKTracesAccess().getTracesKTraceParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_traces_6_0=ruleKTrace();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKTracesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"traces",
            	              		lv_traces_6_0, 
            	              		"de.cau.cs.kieler.simulation.trace.KTrace.KTrace");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalKTrace.g:498:4: (otherlv_7= 'reset' otherlv_8= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKTrace.g:498:6: otherlv_7= 'reset' otherlv_8= ';'
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getKTracesAccess().getResetKeyword_4_0());
                          
                    }
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getKTracesAccess().getSemicolonKeyword_4_1());
                          
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
    // $ANTLR end "ruleKTraces"


    // $ANTLR start "entryRuleKTrace"
    // InternalKTrace.g:514:1: entryRuleKTrace returns [EObject current=null] : iv_ruleKTrace= ruleKTrace EOF ;
    public final EObject entryRuleKTrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKTrace = null;


        try {
            // InternalKTrace.g:515:2: (iv_ruleKTrace= ruleKTrace EOF )
            // InternalKTrace.g:516:2: iv_ruleKTrace= ruleKTrace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKTraceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKTrace=ruleKTrace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKTrace; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKTrace"


    // $ANTLR start "ruleKTrace"
    // InternalKTrace.g:523:1: ruleKTrace returns [EObject current=null] : ( ( (lv_pragmas_0_0= rulePragma ) )* ( (lv_ticks_1_0= ruleKTick ) )+ ) ;
    public final EObject ruleKTrace() throws RecognitionException {
        EObject current = null;

        EObject lv_pragmas_0_0 = null;

        EObject lv_ticks_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:526:28: ( ( ( (lv_pragmas_0_0= rulePragma ) )* ( (lv_ticks_1_0= ruleKTick ) )+ ) )
            // InternalKTrace.g:527:1: ( ( (lv_pragmas_0_0= rulePragma ) )* ( (lv_ticks_1_0= ruleKTick ) )+ )
            {
            // InternalKTrace.g:527:1: ( ( (lv_pragmas_0_0= rulePragma ) )* ( (lv_ticks_1_0= ruleKTick ) )+ )
            // InternalKTrace.g:527:2: ( (lv_pragmas_0_0= rulePragma ) )* ( (lv_ticks_1_0= ruleKTick ) )+
            {
            // InternalKTrace.g:527:2: ( (lv_pragmas_0_0= rulePragma ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==62) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKTrace.g:528:1: (lv_pragmas_0_0= rulePragma )
            	    {
            	    // InternalKTrace.g:528:1: (lv_pragmas_0_0= rulePragma )
            	    // InternalKTrace.g:529:3: lv_pragmas_0_0= rulePragma
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKTraceAccess().getPragmasPragmaParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_pragmas_0_0=rulePragma();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKTraceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pragmas",
            	              		lv_pragmas_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Pragma");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalKTrace.g:545:3: ( (lv_ticks_1_0= ruleKTick ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==RULE_COMMENT_ANNOTATION||LA17_0==19||(LA17_0>=26 && LA17_0<=27)||LA17_0==61) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKTrace.g:546:1: (lv_ticks_1_0= ruleKTick )
            	    {
            	    // InternalKTrace.g:546:1: (lv_ticks_1_0= ruleKTick )
            	    // InternalKTrace.g:547:3: lv_ticks_1_0= ruleKTick
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKTraceAccess().getTicksKTickParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    lv_ticks_1_0=ruleKTick();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKTraceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ticks",
            	              		lv_ticks_1_0, 
            	              		"de.cau.cs.kieler.simulation.trace.KTrace.KTick");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // $ANTLR end "ruleKTrace"


    // $ANTLR start "entryRuleKTick"
    // InternalKTrace.g:571:1: entryRuleKTick returns [EObject current=null] : iv_ruleKTick= ruleKTick EOF ;
    public final EObject entryRuleKTick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKTick = null;


        try {
            // InternalKTrace.g:572:2: (iv_ruleKTick= ruleKTick EOF )
            // InternalKTrace.g:573:2: iv_ruleKTick= ruleKTick EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKTickRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKTick=ruleKTick();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKTick; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKTick"


    // $ANTLR start "ruleKTick"
    // InternalKTrace.g:580:1: ruleKTick returns [EObject current=null] : ( () ( (lv_inputs_1_0= ruleAssignment ) )* (otherlv_2= '/' ( (lv_outputs_3_0= ruleAssignment ) )* )? (otherlv_4= 'pause' )? otherlv_5= ';' ) ;
    public final EObject ruleKTick() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_inputs_1_0 = null;

        EObject lv_outputs_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:583:28: ( ( () ( (lv_inputs_1_0= ruleAssignment ) )* (otherlv_2= '/' ( (lv_outputs_3_0= ruleAssignment ) )* )? (otherlv_4= 'pause' )? otherlv_5= ';' ) )
            // InternalKTrace.g:584:1: ( () ( (lv_inputs_1_0= ruleAssignment ) )* (otherlv_2= '/' ( (lv_outputs_3_0= ruleAssignment ) )* )? (otherlv_4= 'pause' )? otherlv_5= ';' )
            {
            // InternalKTrace.g:584:1: ( () ( (lv_inputs_1_0= ruleAssignment ) )* (otherlv_2= '/' ( (lv_outputs_3_0= ruleAssignment ) )* )? (otherlv_4= 'pause' )? otherlv_5= ';' )
            // InternalKTrace.g:584:2: () ( (lv_inputs_1_0= ruleAssignment ) )* (otherlv_2= '/' ( (lv_outputs_3_0= ruleAssignment ) )* )? (otherlv_4= 'pause' )? otherlv_5= ';'
            {
            // InternalKTrace.g:584:2: ()
            // InternalKTrace.g:585:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getKTickAccess().getTickAction_0(),
                          current);
                  
            }

            }

            // InternalKTrace.g:593:2: ( (lv_inputs_1_0= ruleAssignment ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==RULE_COMMENT_ANNOTATION||LA18_0==61) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKTrace.g:594:1: (lv_inputs_1_0= ruleAssignment )
            	    {
            	    // InternalKTrace.g:594:1: (lv_inputs_1_0= ruleAssignment )
            	    // InternalKTrace.g:595:3: lv_inputs_1_0= ruleAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKTickAccess().getInputsAssignmentParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_inputs_1_0=ruleAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKTickRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"inputs",
            	              		lv_inputs_1_0, 
            	              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Assignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalKTrace.g:611:3: (otherlv_2= '/' ( (lv_outputs_3_0= ruleAssignment ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKTrace.g:611:5: otherlv_2= '/' ( (lv_outputs_3_0= ruleAssignment ) )*
                    {
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getKTickAccess().getSolidusKeyword_2_0());
                          
                    }
                    // InternalKTrace.g:615:1: ( (lv_outputs_3_0= ruleAssignment ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID||LA19_0==RULE_COMMENT_ANNOTATION||LA19_0==61) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalKTrace.g:616:1: (lv_outputs_3_0= ruleAssignment )
                    	    {
                    	    // InternalKTrace.g:616:1: (lv_outputs_3_0= ruleAssignment )
                    	    // InternalKTrace.g:617:3: lv_outputs_3_0= ruleAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKTickAccess().getOutputsAssignmentParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_19);
                    	    lv_outputs_3_0=ruleAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKTickRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"outputs",
                    	              		lv_outputs_3_0, 
                    	              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Assignment");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalKTrace.g:633:5: (otherlv_4= 'pause' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKTrace.g:633:7: otherlv_4= 'pause'
                    {
                    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getKTickAccess().getPauseKeyword_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getKTickAccess().getSemicolonKeyword_4());
                  
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
    // $ANTLR end "ruleKTick"


    // $ANTLR start "entryRuleRootScope"
    // InternalKTrace.g:651:1: entryRuleRootScope returns [EObject current=null] : iv_ruleRootScope= ruleRootScope EOF ;
    public final EObject entryRuleRootScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootScope = null;


        try {
            // InternalKTrace.g:652:2: (iv_ruleRootScope= ruleRootScope EOF )
            // InternalKTrace.g:653:2: iv_ruleRootScope= ruleRootScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootScopeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRootScope=ruleRootScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRootScope; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRootScope"


    // $ANTLR start "ruleRootScope"
    // InternalKTrace.g:660:1: ruleRootScope returns [EObject current=null] : ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* ) ;
    public final EObject ruleRootScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_declarations_1_0 = null;

        EObject lv_entities_2_0 = null;

        EObject lv_scopes_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:663:28: ( ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* ) )
            // InternalKTrace.g:664:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* )
            {
            // InternalKTrace.g:664:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* )
            // InternalKTrace.g:664:2: () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )*
            {
            // InternalKTrace.g:664:2: ()
            // InternalKTrace.g:665:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRootScopeAccess().getKExtScopeAction_0(),
                          current);
                  
            }

            }

            // InternalKTrace.g:673:2: ( (lv_declarations_1_0= ruleDeclaration ) )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalKTrace.g:674:1: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // InternalKTrace.g:674:1: (lv_declarations_1_0= ruleDeclaration )
            	    // InternalKTrace.g:675:3: lv_declarations_1_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_declarations_1_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_1_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalKTrace.g:691:3: ( (lv_entities_2_0= ruleTestEntity ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==RULE_HOSTCODE||LA23_0==RULE_COMMENT_ANNOTATION||LA23_0==31||LA23_0==39||LA23_0==48||LA23_0==50||LA23_0==61) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKTrace.g:692:1: (lv_entities_2_0= ruleTestEntity )
            	    {
            	    // InternalKTrace.g:692:1: (lv_entities_2_0= ruleTestEntity )
            	    // InternalKTrace.g:693:3: lv_entities_2_0= ruleTestEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getEntitiesTestEntityParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_entities_2_0=ruleTestEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entities",
            	              		lv_entities_2_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.TestEntity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalKTrace.g:709:3: (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==28) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKTrace.g:709:5: otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRootScopeAccess().getScopeKeyword_3_0());
            	          
            	    }
            	    // InternalKTrace.g:713:1: ( (lv_scopes_4_0= ruleScope ) )
            	    // InternalKTrace.g:714:1: (lv_scopes_4_0= ruleScope )
            	    {
            	    // InternalKTrace.g:714:1: (lv_scopes_4_0= ruleScope )
            	    // InternalKTrace.g:715:3: lv_scopes_4_0= ruleScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getScopesScopeParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_scopes_4_0=ruleScope();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scopes",
            	              		lv_scopes_4_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Scope");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
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
    // $ANTLR end "ruleRootScope"


    // $ANTLR start "entryRuleScope"
    // InternalKTrace.g:739:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalKTrace.g:740:2: (iv_ruleScope= ruleScope EOF )
            // InternalKTrace.g:741:2: iv_ruleScope= ruleScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScope; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalKTrace.g:748:1: ruleScope returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_declarations_3_0 = null;

        EObject lv_entities_4_0 = null;

        EObject lv_scopes_6_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:751:28: ( ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' ) )
            // InternalKTrace.g:752:1: ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' )
            {
            // InternalKTrace.g:752:1: ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' )
            // InternalKTrace.g:752:2: () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}'
            {
            // InternalKTrace.g:752:2: ()
            // InternalKTrace.g:753:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getScopeAccess().getKExtScopeAction_0(),
                          current);
                  
            }

            }

            // InternalKTrace.g:761:2: ( (lv_name_1_0= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKTrace.g:762:1: (lv_name_1_0= RULE_ID )
                    {
                    // InternalKTrace.g:762:1: (lv_name_1_0= RULE_ID )
                    // InternalKTrace.g:763:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getScopeAccess().getNameIDTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScopeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getScopeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalKTrace.g:783:1: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalKTrace.g:784:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalKTrace.g:784:1: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalKTrace.g:785:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_3_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalKTrace.g:801:3: ( (lv_entities_4_0= ruleTestEntity ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==RULE_HOSTCODE||LA27_0==RULE_COMMENT_ANNOTATION||LA27_0==31||LA27_0==39||LA27_0==48||LA27_0==50||LA27_0==61) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKTrace.g:802:1: (lv_entities_4_0= ruleTestEntity )
            	    {
            	    // InternalKTrace.g:802:1: (lv_entities_4_0= ruleTestEntity )
            	    // InternalKTrace.g:803:3: lv_entities_4_0= ruleTestEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getEntitiesTestEntityParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_entities_4_0=ruleTestEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entities",
            	              		lv_entities_4_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.TestEntity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalKTrace.g:819:3: (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==28) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalKTrace.g:819:5: otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) )
            	    {
            	    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getScopeAccess().getScopeKeyword_5_0());
            	          
            	    }
            	    // InternalKTrace.g:823:1: ( (lv_scopes_6_0= ruleScope ) )
            	    // InternalKTrace.g:824:1: (lv_scopes_6_0= ruleScope )
            	    {
            	    // InternalKTrace.g:824:1: (lv_scopes_6_0= ruleScope )
            	    // InternalKTrace.g:825:3: lv_scopes_6_0= ruleScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getScopesScopeParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_scopes_6_0=ruleScope();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scopes",
            	              		lv_scopes_6_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Scope");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getScopeAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleTestEntity"
    // InternalKTrace.g:853:1: entryRuleTestEntity returns [EObject current=null] : iv_ruleTestEntity= ruleTestEntity EOF ;
    public final EObject entryRuleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestEntity = null;


        try {
            // InternalKTrace.g:854:2: (iv_ruleTestEntity= ruleTestEntity EOF )
            // InternalKTrace.g:855:2: iv_ruleTestEntity= ruleTestEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTestEntityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTestEntity=ruleTestEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTestEntity; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTestEntity"


    // $ANTLR start "ruleTestEntity"
    // InternalKTrace.g:862:1: ruleTestEntity returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) ;
    public final EObject ruleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_effect_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:865:28: ( ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) )
            // InternalKTrace.g:866:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            {
            // InternalKTrace.g:866:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalKTrace.g:866:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    {
                    // InternalKTrace.g:866:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    // InternalKTrace.g:867:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    {
                    // InternalKTrace.g:867:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    // InternalKTrace.g:868:3: lv_expression_0_0= ruleAnnotatedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTestEntityAccess().getExpressionAnnotatedExpressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expression_0_0=ruleAnnotatedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTestEntityRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_0_0, 
                              		"de.cau.cs.kieler.kexpressions.kext.KExt.AnnotatedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:885:6: ( (lv_effect_1_0= ruleEffect ) )
                    {
                    // InternalKTrace.g:885:6: ( (lv_effect_1_0= ruleEffect ) )
                    // InternalKTrace.g:886:1: (lv_effect_1_0= ruleEffect )
                    {
                    // InternalKTrace.g:886:1: (lv_effect_1_0= ruleEffect )
                    // InternalKTrace.g:887:3: lv_effect_1_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTestEntityAccess().getEffectEffectParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_effect_1_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTestEntityRule());
                      	        }
                             		set(
                             			current, 
                             			"effect",
                              		lv_effect_1_0, 
                              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleTestEntity"


    // $ANTLR start "entryRuleAnnotatedExpression"
    // InternalKTrace.g:911:1: entryRuleAnnotatedExpression returns [EObject current=null] : iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF ;
    public final EObject entryRuleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatedExpression = null;


        try {
            // InternalKTrace.g:912:2: (iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF )
            // InternalKTrace.g:913:2: iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotatedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnnotatedExpression=ruleAnnotatedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotatedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotatedExpression"


    // $ANTLR start "ruleAnnotatedExpression"
    // InternalKTrace.g:920:1: ruleAnnotatedExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:923:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKTrace.g:924:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKTrace.g:924:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKTrace.g:924:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKTrace.g:924:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_COMMENT_ANNOTATION||LA30_0==61) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKTrace.g:925:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKTrace.g:925:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKTrace.g:926:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotatedExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnnotatedExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotatedExpressionAccess().getExpressionKeyword_1());
                  
            }
            // InternalKTrace.g:946:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKTrace.g:947:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalKTrace.g:947:1: (lv_expression_2_0= ruleExpression )
            // InternalKTrace.g:948:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotatedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotatedExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleAnnotatedExpression"


    // $ANTLR start "entryRuleDeclaration"
    // InternalKTrace.g:972:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalKTrace.g:973:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalKTrace.g:974:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalKTrace.g:981:1: ruleDeclaration returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_ReferenceDeclaration_1 = null;

        EObject this_ScheduleDeclaration_2 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:984:28: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration ) )
            // InternalKTrace.g:985:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration )
            {
            // InternalKTrace.g:985:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration )
            int alt31=3;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalKTrace.g:986:2: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKTrace.g:999:2: this_ReferenceDeclaration_1= ruleReferenceDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getReferenceDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceDeclaration_1=ruleReferenceDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKTrace.g:1012:2: this_ScheduleDeclaration_2= ruleScheduleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getScheduleDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ScheduleDeclaration_2=ruleScheduleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ScheduleDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalKTrace.g:1033:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalKTrace.g:1034:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalKTrace.g:1035:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalKTrace.g:1042:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_const_1_0=null;
        Token lv_input_2_0=null;
        Token lv_output_3_0=null;
        Token lv_static_4_0=null;
        Token lv_signal_5_0=null;
        Token lv_signal_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_6_0 = null;

        EObject lv_valuedObjects_8_0 = null;

        EObject lv_valuedObjects_10_0 = null;

        EObject lv_annotations_12_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:1045:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalKTrace.g:1046:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalKTrace.g:1046:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )? )
            // InternalKTrace.g:1046:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalKTrace.g:1046:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_COMMENT_ANNOTATION||LA32_0==61) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKTrace.g:1047:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKTrace.g:1047:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKTrace.g:1048:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalKTrace.g:1064:3: ( (lv_const_1_0= 'const' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKTrace.g:1065:1: (lv_const_1_0= 'const' )
                    {
                    // InternalKTrace.g:1065:1: (lv_const_1_0= 'const' )
                    // InternalKTrace.g:1066:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,32,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_const_1_0, grammarAccess.getVariableDeclarationAccess().getConstConstKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "const", true, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKTrace.g:1079:3: ( (lv_input_2_0= 'input' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKTrace.g:1080:1: (lv_input_2_0= 'input' )
                    {
                    // InternalKTrace.g:1080:1: (lv_input_2_0= 'input' )
                    // InternalKTrace.g:1081:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,33,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_input_2_0, grammarAccess.getVariableDeclarationAccess().getInputInputKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "input", true, "input");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKTrace.g:1094:3: ( (lv_output_3_0= 'output' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKTrace.g:1095:1: (lv_output_3_0= 'output' )
                    {
                    // InternalKTrace.g:1095:1: (lv_output_3_0= 'output' )
                    // InternalKTrace.g:1096:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,34,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_output_3_0, grammarAccess.getVariableDeclarationAccess().getOutputOutputKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "output", true, "output");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKTrace.g:1109:3: ( (lv_static_4_0= 'static' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKTrace.g:1110:1: (lv_static_4_0= 'static' )
                    {
                    // InternalKTrace.g:1110:1: (lv_static_4_0= 'static' )
                    // InternalKTrace.g:1111:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,35,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_4_0, grammarAccess.getVariableDeclarationAccess().getStaticStaticKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKTrace.g:1124:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==RULE_ID||LA38_1==RULE_COMMENT_ANNOTATION||LA38_1==61) ) {
                    alt38=2;
                }
                else if ( ((LA38_1>=83 && LA38_1<=89)) ) {
                    alt38=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA38_0>=83 && LA38_0<=89)) ) {
                alt38=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalKTrace.g:1124:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // InternalKTrace.g:1124:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // InternalKTrace.g:1124:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // InternalKTrace.g:1124:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==36) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalKTrace.g:1125:1: (lv_signal_5_0= 'signal' )
                            {
                            // InternalKTrace.g:1125:1: (lv_signal_5_0= 'signal' )
                            // InternalKTrace.g:1126:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,36,FollowSets000.FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_signal_5_0, grammarAccess.getVariableDeclarationAccess().getSignalSignalKeyword_5_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                              	        }
                                     		setWithLastConsumed(current, "signal", true, "signal");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalKTrace.g:1139:3: ( (lv_type_6_0= ruleValueType ) )
                    // InternalKTrace.g:1140:1: (lv_type_6_0= ruleValueType )
                    {
                    // InternalKTrace.g:1140:1: (lv_type_6_0= ruleValueType )
                    // InternalKTrace.g:1141:3: lv_type_6_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeValueTypeEnumRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_type_6_0=ruleValueType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_6_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:1158:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // InternalKTrace.g:1158:6: ( (lv_signal_7_0= 'signal' ) )
                    // InternalKTrace.g:1159:1: (lv_signal_7_0= 'signal' )
                    {
                    // InternalKTrace.g:1159:1: (lv_signal_7_0= 'signal' )
                    // InternalKTrace.g:1160:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,36,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_signal_7_0, grammarAccess.getVariableDeclarationAccess().getSignalSignalKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "signal", true, "signal");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKTrace.g:1173:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // InternalKTrace.g:1174:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // InternalKTrace.g:1174:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // InternalKTrace.g:1175:3: lv_valuedObjects_8_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_valuedObjects_8_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_8_0, 
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:1191:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==37) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKTrace.g:1191:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // InternalKTrace.g:1195:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // InternalKTrace.g:1196:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // InternalKTrace.g:1196:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // InternalKTrace.g:1197:3: lv_valuedObjects_10_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    lv_valuedObjects_10_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_10_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_8());
                  
            }
            // InternalKTrace.g:1217:1: ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKTrace.g:1218:1: (lv_annotations_12_0= ruleCommentAnnotatonSL )
                    {
                    // InternalKTrace.g:1218:1: (lv_annotations_12_0= ruleCommentAnnotatonSL )
                    // InternalKTrace.g:1219:3: lv_annotations_12_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_9_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_annotations_12_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_12_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableDeclarationWOSemicolon"
    // InternalKTrace.g:1243:1: entryRuleVariableDeclarationWOSemicolon returns [EObject current=null] : iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF ;
    public final EObject entryRuleVariableDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationWOSemicolon = null;


        try {
            // InternalKTrace.g:1244:2: (iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF )
            // InternalKTrace.g:1245:2: iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariableDeclarationWOSemicolon=ruleVariableDeclarationWOSemicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclarationWOSemicolon; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDeclarationWOSemicolon"


    // $ANTLR start "ruleVariableDeclarationWOSemicolon"
    // InternalKTrace.g:1252:1: ruleVariableDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleVariableDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        Token lv_const_1_0=null;
        Token lv_input_2_0=null;
        Token lv_output_3_0=null;
        Token lv_static_4_0=null;
        Token lv_signal_5_0=null;
        Token lv_signal_7_0=null;
        Token otherlv_9=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_6_0 = null;

        EObject lv_valuedObjects_8_0 = null;

        EObject lv_valuedObjects_10_0 = null;

        EObject lv_annotations_11_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:1255:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalKTrace.g:1256:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalKTrace.g:1256:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? )
            // InternalKTrace.g:1256:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalKTrace.g:1256:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_COMMENT_ANNOTATION||LA41_0==61) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalKTrace.g:1257:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKTrace.g:1257:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKTrace.g:1258:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalKTrace.g:1274:3: ( (lv_const_1_0= 'const' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==32) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKTrace.g:1275:1: (lv_const_1_0= 'const' )
                    {
                    // InternalKTrace.g:1275:1: (lv_const_1_0= 'const' )
                    // InternalKTrace.g:1276:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,32,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_const_1_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getConstConstKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "const", true, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKTrace.g:1289:3: ( (lv_input_2_0= 'input' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==33) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKTrace.g:1290:1: (lv_input_2_0= 'input' )
                    {
                    // InternalKTrace.g:1290:1: (lv_input_2_0= 'input' )
                    // InternalKTrace.g:1291:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,33,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_input_2_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getInputInputKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "input", true, "input");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKTrace.g:1304:3: ( (lv_output_3_0= 'output' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==34) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalKTrace.g:1305:1: (lv_output_3_0= 'output' )
                    {
                    // InternalKTrace.g:1305:1: (lv_output_3_0= 'output' )
                    // InternalKTrace.g:1306:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,34,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_output_3_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getOutputOutputKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "output", true, "output");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKTrace.g:1319:3: ( (lv_static_4_0= 'static' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==35) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalKTrace.g:1320:1: (lv_static_4_0= 'static' )
                    {
                    // InternalKTrace.g:1320:1: (lv_static_4_0= 'static' )
                    // InternalKTrace.g:1321:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,35,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_4_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getStaticStaticKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKTrace.g:1334:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==36) ) {
                int LA47_1 = input.LA(2);

                if ( ((LA47_1>=83 && LA47_1<=89)) ) {
                    alt47=1;
                }
                else if ( (LA47_1==RULE_ID||LA47_1==RULE_COMMENT_ANNOTATION||LA47_1==61) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA47_0>=83 && LA47_0<=89)) ) {
                alt47=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalKTrace.g:1334:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // InternalKTrace.g:1334:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // InternalKTrace.g:1334:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // InternalKTrace.g:1334:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==36) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalKTrace.g:1335:1: (lv_signal_5_0= 'signal' )
                            {
                            // InternalKTrace.g:1335:1: (lv_signal_5_0= 'signal' )
                            // InternalKTrace.g:1336:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,36,FollowSets000.FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_signal_5_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getSignalSignalKeyword_5_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                              	        }
                                     		setWithLastConsumed(current, "signal", true, "signal");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalKTrace.g:1349:3: ( (lv_type_6_0= ruleValueType ) )
                    // InternalKTrace.g:1350:1: (lv_type_6_0= ruleValueType )
                    {
                    // InternalKTrace.g:1350:1: (lv_type_6_0= ruleValueType )
                    // InternalKTrace.g:1351:3: lv_type_6_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getTypeValueTypeEnumRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_type_6_0=ruleValueType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_6_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:1368:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // InternalKTrace.g:1368:6: ( (lv_signal_7_0= 'signal' ) )
                    // InternalKTrace.g:1369:1: (lv_signal_7_0= 'signal' )
                    {
                    // InternalKTrace.g:1369:1: (lv_signal_7_0= 'signal' )
                    // InternalKTrace.g:1370:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,36,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_signal_7_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getSignalSignalKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "signal", true, "signal");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKTrace.g:1383:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // InternalKTrace.g:1384:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // InternalKTrace.g:1384:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // InternalKTrace.g:1385:3: lv_valuedObjects_8_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_38);
            lv_valuedObjects_8_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_8_0, 
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:1401:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==37) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalKTrace.g:1401:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationWOSemicolonAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // InternalKTrace.g:1405:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // InternalKTrace.g:1406:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // InternalKTrace.g:1406:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // InternalKTrace.g:1407:3: lv_valuedObjects_10_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_valuedObjects_10_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_10_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // InternalKTrace.g:1423:4: ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalKTrace.g:1424:1: (lv_annotations_11_0= ruleCommentAnnotatonSL )
                    {
                    // InternalKTrace.g:1424:1: (lv_annotations_11_0= ruleCommentAnnotatonSL )
                    // InternalKTrace.g:1425:3: lv_annotations_11_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_annotations_11_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_11_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleVariableDeclarationWOSemicolon"


    // $ANTLR start "entryRuleNamespaceID"
    // InternalKTrace.g:1449:1: entryRuleNamespaceID returns [String current=null] : iv_ruleNamespaceID= ruleNamespaceID EOF ;
    public final String entryRuleNamespaceID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespaceID = null;


        try {
            // InternalKTrace.g:1450:2: (iv_ruleNamespaceID= ruleNamespaceID EOF )
            // InternalKTrace.g:1451:2: iv_ruleNamespaceID= ruleNamespaceID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNamespaceID=ruleNamespaceID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespaceID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNamespaceID"


    // $ANTLR start "ruleNamespaceID"
    // InternalKTrace.g:1458:1: ruleNamespaceID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )* ) ;
    public final AntlrDatatypeRuleToken ruleNamespaceID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_PrimeID_2 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:1461:28: ( (this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )* ) )
            // InternalKTrace.g:1462:1: (this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )* )
            {
            // InternalKTrace.g:1462:1: (this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )* )
            // InternalKTrace.g:1462:6: this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getNamespaceIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKTrace.g:1469:1: (kw= ':' this_PrimeID_2= rulePrimeID )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==23) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalKTrace.g:1470:2: kw= ':' this_PrimeID_2= rulePrimeID
            	    {
            	    kw=(Token)match(input,23,FollowSets000.FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getNamespaceIDAccess().getColonKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getNamespaceIDAccess().getPrimeIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_39);
            	    this_PrimeID_2=rulePrimeID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PrimeID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
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
    // $ANTLR end "ruleNamespaceID"


    // $ANTLR start "entryRuleReferenceDeclaration"
    // InternalKTrace.g:1494:1: entryRuleReferenceDeclaration returns [EObject current=null] : iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF ;
    public final EObject entryRuleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceDeclaration = null;


        try {
            // InternalKTrace.g:1495:2: (iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF )
            // InternalKTrace.g:1496:2: iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceDeclaration=ruleReferenceDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceDeclaration"


    // $ANTLR start "ruleReferenceDeclaration"
    // InternalKTrace.g:1503:1: ruleReferenceDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_extern_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_valuedObjects_5_0 = null;

        EObject lv_valuedObjects_7_0 = null;

        EObject lv_annotations_9_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:1506:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalKTrace.g:1507:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalKTrace.g:1507:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? )
            // InternalKTrace.g:1507:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalKTrace.g:1507:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_COMMENT_ANNOTATION||LA51_0==61) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalKTrace.g:1508:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKTrace.g:1508:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKTrace.g:1509:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_40);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // InternalKTrace.g:1525:3: ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==38) ) {
                alt52=1;
            }
            else if ( (LA52_0==39) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalKTrace.g:1525:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    {
                    // InternalKTrace.g:1525:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    // InternalKTrace.g:1525:6: otherlv_1= 'ref' ( ( ruleNamespaceID ) )
                    {
                    otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationAccess().getRefKeyword_1_0_0());
                          
                    }
                    // InternalKTrace.g:1529:1: ( ( ruleNamespaceID ) )
                    // InternalKTrace.g:1530:1: ( ruleNamespaceID )
                    {
                    // InternalKTrace.g:1530:1: ( ruleNamespaceID )
                    // InternalKTrace.g:1531:3: ruleNamespaceID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getReferenceDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getReferenceNamedObjectCrossReference_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    ruleNamespaceID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:1548:6: (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) )
                    {
                    // InternalKTrace.g:1548:6: (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) )
                    // InternalKTrace.g:1548:8: otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getReferenceDeclarationAccess().getExternKeyword_1_1_0());
                          
                    }
                    // InternalKTrace.g:1552:1: ( (lv_extern_4_0= RULE_STRING ) )
                    // InternalKTrace.g:1553:1: (lv_extern_4_0= RULE_STRING )
                    {
                    // InternalKTrace.g:1553:1: (lv_extern_4_0= RULE_STRING )
                    // InternalKTrace.g:1554:3: lv_extern_4_0= RULE_STRING
                    {
                    lv_extern_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_extern_4_0, grammarAccess.getReferenceDeclarationAccess().getExternSTRINGTerminalRuleCall_1_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReferenceDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"extern",
                              		lv_extern_4_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalKTrace.g:1570:4: ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            // InternalKTrace.g:1571:1: (lv_valuedObjects_5_0= ruleValuedObject )
            {
            // InternalKTrace.g:1571:1: (lv_valuedObjects_5_0= ruleValuedObject )
            // InternalKTrace.g:1572:3: lv_valuedObjects_5_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_valuedObjects_5_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_5_0, 
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:1588:2: (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==37) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalKTrace.g:1588:4: otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    {
            	    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getReferenceDeclarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKTrace.g:1592:1: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    // InternalKTrace.g:1593:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    {
            	    // InternalKTrace.g:1593:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    // InternalKTrace.g:1594:3: lv_valuedObjects_7_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    lv_valuedObjects_7_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_7_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getReferenceDeclarationAccess().getSemicolonKeyword_4());
                  
            }
            // InternalKTrace.g:1614:1: ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalKTrace.g:1615:1: (lv_annotations_9_0= ruleCommentAnnotatonSL )
                    {
                    // InternalKTrace.g:1615:1: (lv_annotations_9_0= ruleCommentAnnotatonSL )
                    // InternalKTrace.g:1616:3: lv_annotations_9_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_annotations_9_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_9_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleReferenceDeclaration"


    // $ANTLR start "entryRuleReferenceDeclarationWOSemicolon"
    // InternalKTrace.g:1640:1: entryRuleReferenceDeclarationWOSemicolon returns [EObject current=null] : iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF ;
    public final EObject entryRuleReferenceDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceDeclarationWOSemicolon = null;


        try {
            // InternalKTrace.g:1641:2: (iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF )
            // InternalKTrace.g:1642:2: iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceDeclarationWOSemicolon=ruleReferenceDeclarationWOSemicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceDeclarationWOSemicolon; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceDeclarationWOSemicolon"


    // $ANTLR start "ruleReferenceDeclarationWOSemicolon"
    // InternalKTrace.g:1649:1: ruleReferenceDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleReferenceDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_extern_4_0=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_valuedObjects_5_0 = null;

        EObject lv_valuedObjects_7_0 = null;

        EObject lv_annotations_8_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:1652:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalKTrace.g:1653:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalKTrace.g:1653:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? )
            // InternalKTrace.g:1653:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalKTrace.g:1653:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_COMMENT_ANNOTATION||LA55_0==61) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalKTrace.g:1654:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKTrace.g:1654:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKTrace.g:1655:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_40);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // InternalKTrace.g:1671:3: ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==38) ) {
                alt56=1;
            }
            else if ( (LA56_0==39) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalKTrace.g:1671:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    {
                    // InternalKTrace.g:1671:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    // InternalKTrace.g:1671:6: otherlv_1= 'ref' ( ( ruleNamespaceID ) )
                    {
                    otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getRefKeyword_1_0_0());
                          
                    }
                    // InternalKTrace.g:1675:1: ( ( ruleNamespaceID ) )
                    // InternalKTrace.g:1676:1: ( ruleNamespaceID )
                    {
                    // InternalKTrace.g:1676:1: ( ruleNamespaceID )
                    // InternalKTrace.g:1677:3: ruleNamespaceID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getReferenceDeclarationWOSemicolonRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getReferenceNamedObjectCrossReference_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    ruleNamespaceID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:1694:6: (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) )
                    {
                    // InternalKTrace.g:1694:6: (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) )
                    // InternalKTrace.g:1694:8: otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getExternKeyword_1_1_0());
                          
                    }
                    // InternalKTrace.g:1698:1: ( (lv_extern_4_0= RULE_STRING ) )
                    // InternalKTrace.g:1699:1: (lv_extern_4_0= RULE_STRING )
                    {
                    // InternalKTrace.g:1699:1: (lv_extern_4_0= RULE_STRING )
                    // InternalKTrace.g:1700:3: lv_extern_4_0= RULE_STRING
                    {
                    lv_extern_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_extern_4_0, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getExternSTRINGTerminalRuleCall_1_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReferenceDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"extern",
                              		lv_extern_4_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalKTrace.g:1716:4: ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            // InternalKTrace.g:1717:1: (lv_valuedObjects_5_0= ruleValuedObject )
            {
            // InternalKTrace.g:1717:1: (lv_valuedObjects_5_0= ruleValuedObject )
            // InternalKTrace.g:1718:3: lv_valuedObjects_5_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_38);
            lv_valuedObjects_5_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_5_0, 
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:1734:2: (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==37) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalKTrace.g:1734:4: otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    {
            	    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKTrace.g:1738:1: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    // InternalKTrace.g:1739:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    {
            	    // InternalKTrace.g:1739:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    // InternalKTrace.g:1740:3: lv_valuedObjects_7_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_valuedObjects_7_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_7_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // InternalKTrace.g:1756:4: ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalKTrace.g:1757:1: (lv_annotations_8_0= ruleCommentAnnotatonSL )
                    {
                    // InternalKTrace.g:1757:1: (lv_annotations_8_0= ruleCommentAnnotatonSL )
                    // InternalKTrace.g:1758:3: lv_annotations_8_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_annotations_8_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_8_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleReferenceDeclarationWOSemicolon"


    // $ANTLR start "entryRuleScheduleDeclaration"
    // InternalKTrace.g:1782:1: entryRuleScheduleDeclaration returns [EObject current=null] : iv_ruleScheduleDeclaration= ruleScheduleDeclaration EOF ;
    public final EObject entryRuleScheduleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleDeclaration = null;


        try {
            // InternalKTrace.g:1783:2: (iv_ruleScheduleDeclaration= ruleScheduleDeclaration EOF )
            // InternalKTrace.g:1784:2: iv_ruleScheduleDeclaration= ruleScheduleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScheduleDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScheduleDeclaration=ruleScheduleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScheduleDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScheduleDeclaration"


    // $ANTLR start "ruleScheduleDeclaration"
    // InternalKTrace.g:1791:1: ruleScheduleDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleScheduleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_global_3_0 = null;

        EObject lv_priorities_4_0 = null;

        EObject lv_valuedObjects_5_0 = null;

        EObject lv_valuedObjects_7_0 = null;

        EObject lv_annotations_9_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:1794:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalKTrace.g:1795:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalKTrace.g:1795:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )? )
            // InternalKTrace.g:1795:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalKTrace.g:1795:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_COMMENT_ANNOTATION||LA59_0==61) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalKTrace.g:1796:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKTrace.g:1796:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKTrace.g:1797:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_42);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getScheduleDeclarationAccess().getScheduleKeyword_1());
                  
            }
            // InternalKTrace.g:1817:1: ( (lv_name_2_0= rulePrimeID ) )
            // InternalKTrace.g:1818:1: (lv_name_2_0= rulePrimeID )
            {
            // InternalKTrace.g:1818:1: (lv_name_2_0= rulePrimeID )
            // InternalKTrace.g:1819:3: lv_name_2_0= rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getNamePrimeIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_43);
            lv_name_2_0=rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.PrimeID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:1835:2: ( (lv_global_3_0= ruleSchedulePriorityType ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=63 && LA60_0<=64)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalKTrace.g:1836:1: (lv_global_3_0= ruleSchedulePriorityType )
                    {
                    // InternalKTrace.g:1836:1: (lv_global_3_0= ruleSchedulePriorityType )
                    // InternalKTrace.g:1837:3: lv_global_3_0= ruleSchedulePriorityType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getGlobalSchedulePriorityTypeEnumRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
                    lv_global_3_0=ruleSchedulePriorityType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"global",
                              		lv_global_3_0, 
                              		"de.cau.cs.kieler.kexpressions.kext.KExt.SchedulePriorityType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKTrace.g:1853:3: ( (lv_priorities_4_0= ruleSchedulePriority ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==41) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalKTrace.g:1854:1: (lv_priorities_4_0= ruleSchedulePriority )
            	    {
            	    // InternalKTrace.g:1854:1: (lv_priorities_4_0= ruleSchedulePriority )
            	    // InternalKTrace.g:1855:3: lv_priorities_4_0= ruleSchedulePriority
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getPrioritiesSchedulePriorityParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    lv_priorities_4_0=ruleSchedulePriority();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"priorities",
            	              		lv_priorities_4_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.SchedulePriority");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            // InternalKTrace.g:1871:3: ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            // InternalKTrace.g:1872:1: (lv_valuedObjects_5_0= ruleValuedObject )
            {
            // InternalKTrace.g:1872:1: (lv_valuedObjects_5_0= ruleValuedObject )
            // InternalKTrace.g:1873:3: lv_valuedObjects_5_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_valuedObjects_5_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_5_0, 
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:1889:2: (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==37) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalKTrace.g:1889:4: otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    {
            	    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getScheduleDeclarationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKTrace.g:1893:1: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    // InternalKTrace.g:1894:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    {
            	    // InternalKTrace.g:1894:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    // InternalKTrace.g:1895:3: lv_valuedObjects_7_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    lv_valuedObjects_7_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_7_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getScheduleDeclarationAccess().getSemicolonKeyword_7());
                  
            }
            // InternalKTrace.g:1915:1: ( (lv_annotations_9_0= ruleCommentAnnotatonSL ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalKTrace.g:1916:1: (lv_annotations_9_0= ruleCommentAnnotatonSL )
                    {
                    // InternalKTrace.g:1916:1: (lv_annotations_9_0= ruleCommentAnnotatonSL )
                    // InternalKTrace.g:1917:3: lv_annotations_9_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_annotations_9_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_9_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleScheduleDeclaration"


    // $ANTLR start "entryRuleScheduleDeclarationWOSemicolon"
    // InternalKTrace.g:1941:1: entryRuleScheduleDeclarationWOSemicolon returns [EObject current=null] : iv_ruleScheduleDeclarationWOSemicolon= ruleScheduleDeclarationWOSemicolon EOF ;
    public final EObject entryRuleScheduleDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleDeclarationWOSemicolon = null;


        try {
            // InternalKTrace.g:1942:2: (iv_ruleScheduleDeclarationWOSemicolon= ruleScheduleDeclarationWOSemicolon EOF )
            // InternalKTrace.g:1943:2: iv_ruleScheduleDeclarationWOSemicolon= ruleScheduleDeclarationWOSemicolon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScheduleDeclarationWOSemicolon=ruleScheduleDeclarationWOSemicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScheduleDeclarationWOSemicolon; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScheduleDeclarationWOSemicolon"


    // $ANTLR start "ruleScheduleDeclarationWOSemicolon"
    // InternalKTrace.g:1950:1: ruleScheduleDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleScheduleDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_global_3_0 = null;

        EObject lv_priorities_4_0 = null;

        EObject lv_valuedObjects_5_0 = null;

        EObject lv_valuedObjects_7_0 = null;

        EObject lv_annotations_8_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:1953:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalKTrace.g:1954:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalKTrace.g:1954:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )? )
            // InternalKTrace.g:1954:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= rulePrimeID ) ) ( (lv_global_3_0= ruleSchedulePriorityType ) )? ( (lv_priorities_4_0= ruleSchedulePriority ) )* ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalKTrace.g:1954:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_COMMENT_ANNOTATION||LA64_0==61) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalKTrace.g:1955:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKTrace.g:1955:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKTrace.g:1956:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_42);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getScheduleDeclarationWOSemicolonAccess().getScheduleKeyword_1());
                  
            }
            // InternalKTrace.g:1976:1: ( (lv_name_2_0= rulePrimeID ) )
            // InternalKTrace.g:1977:1: (lv_name_2_0= rulePrimeID )
            {
            // InternalKTrace.g:1977:1: (lv_name_2_0= rulePrimeID )
            // InternalKTrace.g:1978:3: lv_name_2_0= rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getNamePrimeIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_43);
            lv_name_2_0=rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.PrimeID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:1994:2: ( (lv_global_3_0= ruleSchedulePriorityType ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=63 && LA65_0<=64)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalKTrace.g:1995:1: (lv_global_3_0= ruleSchedulePriorityType )
                    {
                    // InternalKTrace.g:1995:1: (lv_global_3_0= ruleSchedulePriorityType )
                    // InternalKTrace.g:1996:3: lv_global_3_0= ruleSchedulePriorityType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getGlobalSchedulePriorityTypeEnumRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
                    lv_global_3_0=ruleSchedulePriorityType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
                      	        }
                             		set(
                             			current, 
                             			"global",
                              		lv_global_3_0, 
                              		"de.cau.cs.kieler.kexpressions.kext.KExt.SchedulePriorityType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKTrace.g:2012:3: ( (lv_priorities_4_0= ruleSchedulePriority ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==41) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalKTrace.g:2013:1: (lv_priorities_4_0= ruleSchedulePriority )
            	    {
            	    // InternalKTrace.g:2013:1: (lv_priorities_4_0= ruleSchedulePriority )
            	    // InternalKTrace.g:2014:3: lv_priorities_4_0= ruleSchedulePriority
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getPrioritiesSchedulePriorityParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    lv_priorities_4_0=ruleSchedulePriority();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"priorities",
            	              		lv_priorities_4_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.SchedulePriority");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // InternalKTrace.g:2030:3: ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            // InternalKTrace.g:2031:1: (lv_valuedObjects_5_0= ruleValuedObject )
            {
            // InternalKTrace.g:2031:1: (lv_valuedObjects_5_0= ruleValuedObject )
            // InternalKTrace.g:2032:3: lv_valuedObjects_5_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_38);
            lv_valuedObjects_5_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_5_0, 
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:2048:2: (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==37) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalKTrace.g:2048:4: otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    {
            	    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getScheduleDeclarationWOSemicolonAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKTrace.g:2052:1: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    // InternalKTrace.g:2053:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    {
            	    // InternalKTrace.g:2053:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    // InternalKTrace.g:2054:3: lv_valuedObjects_7_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_valuedObjects_7_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_7_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            // InternalKTrace.g:2070:4: ( (lv_annotations_8_0= ruleCommentAnnotatonSL ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalKTrace.g:2071:1: (lv_annotations_8_0= ruleCommentAnnotatonSL )
                    {
                    // InternalKTrace.g:2071:1: (lv_annotations_8_0= ruleCommentAnnotatonSL )
                    // InternalKTrace.g:2072:3: lv_annotations_8_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_annotations_8_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_8_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleScheduleDeclarationWOSemicolon"


    // $ANTLR start "entryRuleSchedulePriority"
    // InternalKTrace.g:2096:1: entryRuleSchedulePriority returns [EObject current=null] : iv_ruleSchedulePriority= ruleSchedulePriority EOF ;
    public final EObject entryRuleSchedulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedulePriority = null;


        try {
            // InternalKTrace.g:2097:2: (iv_ruleSchedulePriority= ruleSchedulePriority EOF )
            // InternalKTrace.g:2098:2: iv_ruleSchedulePriority= ruleSchedulePriority EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchedulePriorityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSchedulePriority=ruleSchedulePriority();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchedulePriority; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSchedulePriority"


    // $ANTLR start "ruleSchedulePriority"
    // InternalKTrace.g:2105:1: ruleSchedulePriority returns [EObject current=null] : (otherlv_0= 'prio' ( (lv_priority_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleSchedulePriorityType ) ) ) ;
    public final EObject ruleSchedulePriority() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_priority_1_0=null;
        Enumerator lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:2108:28: ( (otherlv_0= 'prio' ( (lv_priority_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleSchedulePriorityType ) ) ) )
            // InternalKTrace.g:2109:1: (otherlv_0= 'prio' ( (lv_priority_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleSchedulePriorityType ) ) )
            {
            // InternalKTrace.g:2109:1: (otherlv_0= 'prio' ( (lv_priority_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleSchedulePriorityType ) ) )
            // InternalKTrace.g:2109:3: otherlv_0= 'prio' ( (lv_priority_1_0= RULE_INT ) ) ( (lv_type_2_0= ruleSchedulePriorityType ) )
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSchedulePriorityAccess().getPrioKeyword_0());
                  
            }
            // InternalKTrace.g:2113:1: ( (lv_priority_1_0= RULE_INT ) )
            // InternalKTrace.g:2114:1: (lv_priority_1_0= RULE_INT )
            {
            // InternalKTrace.g:2114:1: (lv_priority_1_0= RULE_INT )
            // InternalKTrace.g:2115:3: lv_priority_1_0= RULE_INT
            {
            lv_priority_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_priority_1_0, grammarAccess.getSchedulePriorityAccess().getPriorityINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSchedulePriorityRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"priority",
                      		lv_priority_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
            }

            }


            }

            // InternalKTrace.g:2131:2: ( (lv_type_2_0= ruleSchedulePriorityType ) )
            // InternalKTrace.g:2132:1: (lv_type_2_0= ruleSchedulePriorityType )
            {
            // InternalKTrace.g:2132:1: (lv_type_2_0= ruleSchedulePriorityType )
            // InternalKTrace.g:2133:3: lv_type_2_0= ruleSchedulePriorityType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSchedulePriorityAccess().getTypeSchedulePriorityTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_type_2_0=ruleSchedulePriorityType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSchedulePriorityRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.SchedulePriorityType");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleSchedulePriority"


    // $ANTLR start "entryRuleValuedObject"
    // InternalKTrace.g:2157:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObject = null;


        try {
            // InternalKTrace.g:2158:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // InternalKTrace.g:2159:2: iv_ruleValuedObject= ruleValuedObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedObject=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObject; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValuedObject"


    // $ANTLR start "ruleValuedObject"
    // InternalKTrace.g:2166:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_cardinalities_3_0 = null;

        EObject lv_initialValue_6_0 = null;

        Enumerator lv_combineOperator_8_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:2169:28: ( ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? ) )
            // InternalKTrace.g:2170:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? )
            {
            // InternalKTrace.g:2170:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? )
            // InternalKTrace.g:2170:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )?
            {
            // InternalKTrace.g:2170:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_COMMENT_ANNOTATION||LA69_0==61) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalKTrace.g:2171:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    {
            	    // InternalKTrace.g:2171:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    // InternalKTrace.g:2172:3: lv_annotations_0_0= ruleQuotedStringAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getAnnotationsQuotedStringAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    lv_annotations_0_0=ruleQuotedStringAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.QuotedStringAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            // InternalKTrace.g:2188:3: ( (lv_name_1_0= rulePrimeID ) )
            // InternalKTrace.g:2189:1: (lv_name_1_0= rulePrimeID )
            {
            // InternalKTrace.g:2189:1: (lv_name_1_0= rulePrimeID )
            // InternalKTrace.g:2190:3: lv_name_1_0= rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValuedObjectAccess().getNamePrimeIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_47);
            lv_name_1_0=rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.PrimeID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:2206:2: (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==42) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalKTrace.g:2206:4: otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalKTrace.g:2210:1: ( (lv_cardinalities_3_0= ruleExpression ) )
            	    // InternalKTrace.g:2211:1: (lv_cardinalities_3_0= ruleExpression )
            	    {
            	    // InternalKTrace.g:2211:1: (lv_cardinalities_3_0= ruleExpression )
            	    // InternalKTrace.g:2212:3: lv_cardinalities_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCardinalitiesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_48);
            	    lv_cardinalities_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cardinalities",
            	              		lv_cardinalities_3_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            // InternalKTrace.g:2232:3: (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==25) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalKTrace.g:2232:5: otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // InternalKTrace.g:2236:1: ( (lv_initialValue_6_0= ruleExpression ) )
                    // InternalKTrace.g:2237:1: (lv_initialValue_6_0= ruleExpression )
                    {
                    // InternalKTrace.g:2237:1: (lv_initialValue_6_0= ruleExpression )
                    // InternalKTrace.g:2238:3: lv_initialValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_49);
                    lv_initialValue_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_6_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKTrace.g:2254:4: (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==44) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalKTrace.g:2254:6: otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) )
                    {
                    otherlv_7=(Token)match(input,44,FollowSets000.FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getValuedObjectAccess().getCombineKeyword_4_0());
                          
                    }
                    // InternalKTrace.g:2258:1: ( (lv_combineOperator_8_0= ruleCombineOperator ) )
                    // InternalKTrace.g:2259:1: (lv_combineOperator_8_0= ruleCombineOperator )
                    {
                    // InternalKTrace.g:2259:1: (lv_combineOperator_8_0= ruleCombineOperator )
                    // InternalKTrace.g:2260:3: lv_combineOperator_8_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCombineOperatorCombineOperatorEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_combineOperator_8_0=ruleCombineOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"combineOperator",
                              		lv_combineOperator_8_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.CombineOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleValuedObject"


    // $ANTLR start "entryRuleEffect"
    // InternalKTrace.g:2284:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalKTrace.g:2285:2: (iv_ruleEffect= ruleEffect EOF )
            // InternalKTrace.g:2286:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalKTrace.g:2293:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_PostfixEffect_1 = null;

        EObject this_Emission_2 = null;

        EObject this_HostcodeEffect_3 = null;

        EObject this_ReferenceCallEffect_4 = null;

        EObject this_FunctionCallEffect_5 = null;

        EObject this_PrintCallEffect_6 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:2296:28: ( (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect ) )
            // InternalKTrace.g:2297:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect )
            {
            // InternalKTrace.g:2297:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect )
            int alt73=7;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // InternalKTrace.g:2298:2: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKTrace.g:2311:2: this_PostfixEffect_1= rulePostfixEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getPostfixEffectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PostfixEffect_1=rulePostfixEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PostfixEffect_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKTrace.g:2324:2: this_Emission_2= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Emission_2=ruleEmission();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Emission_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalKTrace.g:2337:2: this_HostcodeEffect_3= ruleHostcodeEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getHostcodeEffectParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_HostcodeEffect_3=ruleHostcodeEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HostcodeEffect_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalKTrace.g:2350:2: this_ReferenceCallEffect_4= ruleReferenceCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getReferenceCallEffectParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceCallEffect_4=ruleReferenceCallEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceCallEffect_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalKTrace.g:2363:2: this_FunctionCallEffect_5= ruleFunctionCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getFunctionCallEffectParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionCallEffect_5=ruleFunctionCallEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCallEffect_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalKTrace.g:2376:2: this_PrintCallEffect_6= rulePrintCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getPrintCallEffectParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrintCallEffect_6=rulePrintCallEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrintCallEffect_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleEmission"
    // InternalKTrace.g:2395:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // InternalKTrace.g:2396:2: (iv_ruleEmission= ruleEmission EOF )
            // InternalKTrace.g:2397:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEmission"


    // $ANTLR start "ruleEmission"
    // InternalKTrace.g:2404:1: ruleEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_newValue_3_0 = null;

        EObject lv_schedule_6_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:2407:28: ( ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKTrace.g:2408:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKTrace.g:2408:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKTrace.g:2408:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKTrace.g:2408:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==RULE_COMMENT_ANNOTATION||LA74_0==61) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalKTrace.g:2409:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    {
            	    // InternalKTrace.g:2409:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    // InternalKTrace.g:2410:3: lv_annotations_0_0= ruleQuotedStringAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmissionAccess().getAnnotationsQuotedStringAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    lv_annotations_0_0=ruleQuotedStringAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEmissionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.QuotedStringAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            // InternalKTrace.g:2426:3: ( ( rulePrimeID ) )
            // InternalKTrace.g:2427:1: ( rulePrimeID )
            {
            // InternalKTrace.g:2427:1: ( rulePrimeID )
            // InternalKTrace.g:2428:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_51);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:2444:2: (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==45) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalKTrace.g:2444:4: otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalKTrace.g:2448:1: ( (lv_newValue_3_0= ruleExpression ) )
                    // InternalKTrace.g:2449:1: (lv_newValue_3_0= ruleExpression )
                    {
                    // InternalKTrace.g:2449:1: (lv_newValue_3_0= ruleExpression )
                    // InternalKTrace.g:2450:3: lv_newValue_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
                    lv_newValue_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEmissionRule());
                      	        }
                             		set(
                             			current, 
                             			"newValue",
                              		lv_newValue_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEmissionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // InternalKTrace.g:2470:3: (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==40) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalKTrace.g:2470:5: otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEmissionAccess().getScheduleKeyword_3_0());
                          
                    }
                    // InternalKTrace.g:2474:1: ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        alt76 = dfa76.predict(input);
                        switch (alt76) {
                    	case 1 :
                    	    // InternalKTrace.g:2475:1: (lv_schedule_6_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKTrace.g:2475:1: (lv_schedule_6_0= ruleScheduleObjectReference )
                    	    // InternalKTrace.g:2476:3: lv_schedule_6_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEmissionAccess().getScheduleScheduleObjectReferenceParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_54);
                    	    lv_schedule_6_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEmissionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"schedule",
                    	              		lv_schedule_6_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ScheduleObjectReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt76 >= 1 ) break loop76;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);


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
    // $ANTLR end "ruleEmission"


    // $ANTLR start "entryRuleAssignment"
    // InternalKTrace.g:2500:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalKTrace.g:2501:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalKTrace.g:2502:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalKTrace.g:2509:1: ruleAssignment returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= 'schedule' ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_3_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_schedule_8_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:2512:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= 'schedule' ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKTrace.g:2513:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= 'schedule' ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKTrace.g:2513:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= 'schedule' ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKTrace.g:2513:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= 'schedule' ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKTrace.g:2513:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_COMMENT_ANNOTATION||LA78_0==61) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalKTrace.g:2514:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKTrace.g:2514:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKTrace.g:2515:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            // InternalKTrace.g:2531:3: ( ( rulePrimeID ) )
            // InternalKTrace.g:2532:1: ( rulePrimeID )
            {
            // InternalKTrace.g:2532:1: ( rulePrimeID )
            // InternalKTrace.g:2533:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_55);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:2549:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==42) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalKTrace.g:2549:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalKTrace.g:2553:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalKTrace.g:2554:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalKTrace.g:2554:1: (lv_indices_3_0= ruleExpression )
            	    // InternalKTrace.g:2555:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_48);
            	    lv_indices_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indices",
            	              		lv_indices_3_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // InternalKTrace.g:2575:3: ( (lv_operator_5_0= ruleAssignOperator ) )
            // InternalKTrace.g:2576:1: (lv_operator_5_0= ruleAssignOperator )
            {
            // InternalKTrace.g:2576:1: (lv_operator_5_0= ruleAssignOperator )
            // InternalKTrace.g:2577:3: lv_operator_5_0= ruleAssignOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getOperatorAssignOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_29);
            lv_operator_5_0=ruleAssignOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_5_0, 
                      		"de.cau.cs.kieler.kexpressions.keffects.KEffects.AssignOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:2593:2: ( (lv_expression_6_0= ruleExpression ) )
            // InternalKTrace.g:2594:1: (lv_expression_6_0= ruleExpression )
            {
            // InternalKTrace.g:2594:1: (lv_expression_6_0= ruleExpression )
            // InternalKTrace.g:2595:3: lv_expression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_53);
            lv_expression_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:2611:2: (otherlv_7= 'schedule' ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+ )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==40) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalKTrace.g:2611:4: otherlv_7= 'schedule' ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_7=(Token)match(input,40,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getAssignmentAccess().getScheduleKeyword_5_0());
                          
                    }
                    // InternalKTrace.g:2615:1: ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+
                    int cnt80=0;
                    loop80:
                    do {
                        int alt80=2;
                        alt80 = dfa80.predict(input);
                        switch (alt80) {
                    	case 1 :
                    	    // InternalKTrace.g:2616:1: (lv_schedule_8_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKTrace.g:2616:1: (lv_schedule_8_0= ruleScheduleObjectReference )
                    	    // InternalKTrace.g:2617:3: lv_schedule_8_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getScheduleScheduleObjectReferenceParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_54);
                    	    lv_schedule_8_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"schedule",
                    	              		lv_schedule_8_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ScheduleObjectReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt80 >= 1 ) break loop80;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(80, input);
                                throw eee;
                        }
                        cnt80++;
                    } while (true);


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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRulePostfixEffect"
    // InternalKTrace.g:2643:1: entryRulePostfixEffect returns [EObject current=null] : iv_rulePostfixEffect= rulePostfixEffect EOF ;
    public final EObject entryRulePostfixEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixEffect = null;


        try {
            // InternalKTrace.g:2644:2: (iv_rulePostfixEffect= rulePostfixEffect EOF )
            // InternalKTrace.g:2645:2: iv_rulePostfixEffect= rulePostfixEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePostfixEffect=rulePostfixEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePostfixEffect"


    // $ANTLR start "rulePostfixEffect"
    // InternalKTrace.g:2652:1: rulePostfixEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) (otherlv_6= 'schedule' ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject rulePostfixEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_3_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_schedule_7_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:2655:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) (otherlv_6= 'schedule' ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKTrace.g:2656:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) (otherlv_6= 'schedule' ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKTrace.g:2656:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) (otherlv_6= 'schedule' ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKTrace.g:2656:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) (otherlv_6= 'schedule' ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKTrace.g:2656:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_COMMENT_ANNOTATION||LA82_0==61) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalKTrace.g:2657:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKTrace.g:2657:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKTrace.g:2658:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            // InternalKTrace.g:2674:3: ( ( rulePrimeID ) )
            // InternalKTrace.g:2675:1: ( rulePrimeID )
            {
            // InternalKTrace.g:2675:1: ( rulePrimeID )
            // InternalKTrace.g:2676:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPostfixEffectRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_56);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:2692:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==42) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalKTrace.g:2692:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalKTrace.g:2696:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalKTrace.g:2697:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalKTrace.g:2697:1: (lv_indices_3_0= ruleExpression )
            	    // InternalKTrace.g:2698:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_48);
            	    lv_indices_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indices",
            	              		lv_indices_3_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_56); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            // InternalKTrace.g:2718:3: ( (lv_operator_5_0= rulePostfixOperator ) )
            // InternalKTrace.g:2719:1: (lv_operator_5_0= rulePostfixOperator )
            {
            // InternalKTrace.g:2719:1: (lv_operator_5_0= rulePostfixOperator )
            // InternalKTrace.g:2720:3: lv_operator_5_0= rulePostfixOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getOperatorPostfixOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_53);
            lv_operator_5_0=rulePostfixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_5_0, 
                      		"de.cau.cs.kieler.kexpressions.keffects.KEffects.PostfixOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:2736:2: (otherlv_6= 'schedule' ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+ )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==40) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalKTrace.g:2736:4: otherlv_6= 'schedule' ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_6=(Token)match(input,40,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPostfixEffectAccess().getScheduleKeyword_4_0());
                          
                    }
                    // InternalKTrace.g:2740:1: ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+
                    int cnt84=0;
                    loop84:
                    do {
                        int alt84=2;
                        alt84 = dfa84.predict(input);
                        switch (alt84) {
                    	case 1 :
                    	    // InternalKTrace.g:2741:1: (lv_schedule_7_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKTrace.g:2741:1: (lv_schedule_7_0= ruleScheduleObjectReference )
                    	    // InternalKTrace.g:2742:3: lv_schedule_7_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getScheduleScheduleObjectReferenceParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_54);
                    	    lv_schedule_7_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"schedule",
                    	              		lv_schedule_7_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ScheduleObjectReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt84 >= 1 ) break loop84;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(84, input);
                                throw eee;
                        }
                        cnt84++;
                    } while (true);


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
    // $ANTLR end "rulePostfixEffect"


    // $ANTLR start "entryRuleHostcodeEffect"
    // InternalKTrace.g:2766:1: entryRuleHostcodeEffect returns [EObject current=null] : iv_ruleHostcodeEffect= ruleHostcodeEffect EOF ;
    public final EObject entryRuleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostcodeEffect = null;


        try {
            // InternalKTrace.g:2767:2: (iv_ruleHostcodeEffect= ruleHostcodeEffect EOF )
            // InternalKTrace.g:2768:2: iv_ruleHostcodeEffect= ruleHostcodeEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostcodeEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHostcodeEffect=ruleHostcodeEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostcodeEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHostcodeEffect"


    // $ANTLR start "ruleHostcodeEffect"
    // InternalKTrace.g:2775:1: ruleHostcodeEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:2778:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalKTrace.g:2779:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalKTrace.g:2779:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalKTrace.g:2779:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalKTrace.g:2779:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==RULE_COMMENT_ANNOTATION||LA86_0==61) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalKTrace.g:2780:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKTrace.g:2780:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKTrace.g:2781:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_57);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHostcodeEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            // InternalKTrace.g:2797:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalKTrace.g:2798:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalKTrace.g:2798:1: (lv_text_1_0= RULE_HOSTCODE )
            // InternalKTrace.g:2799:3: lv_text_1_0= RULE_HOSTCODE
            {
            lv_text_1_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_1_0, grammarAccess.getHostcodeEffectAccess().getTextHOSTCODETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getHostcodeEffectRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_1_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.HOSTCODE");
              	    
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
    // $ANTLR end "ruleHostcodeEffect"


    // $ANTLR start "entryRuleReferenceCallEffect"
    // InternalKTrace.g:2823:1: entryRuleReferenceCallEffect returns [EObject current=null] : iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF ;
    public final EObject entryRuleReferenceCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCallEffect = null;


        try {
            // InternalKTrace.g:2824:2: (iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF )
            // InternalKTrace.g:2825:2: iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceCallEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceCallEffect=ruleReferenceCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceCallEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceCallEffect"


    // $ANTLR start "ruleReferenceCallEffect"
    // InternalKTrace.g:2832:1: ruleReferenceCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) ;
    public final EObject ruleReferenceCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:2835:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) )
            // InternalKTrace.g:2836:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            {
            // InternalKTrace.g:2836:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            // InternalKTrace.g:2836:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            {
            // InternalKTrace.g:2836:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==RULE_COMMENT_ANNOTATION||LA87_0==61) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalKTrace.g:2837:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKTrace.g:2837:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKTrace.g:2838:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            // InternalKTrace.g:2854:3: ( ( rulePrimeID ) )
            // InternalKTrace.g:2855:1: ( rulePrimeID )
            {
            // InternalKTrace.g:2855:1: ( rulePrimeID )
            // InternalKTrace.g:2856:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceCallEffectRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_58);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:2872:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==45) ) {
                alt89=1;
            }
            else if ( (LA89_0==47) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalKTrace.g:2872:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalKTrace.g:2872:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalKTrace.g:2872:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReferenceCallEffectAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // InternalKTrace.g:2876:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalKTrace.g:2877:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalKTrace.g:2877:1: (lv_parameters_3_0= ruleParameter )
                    // InternalKTrace.g:2878:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_60);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:2894:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==37) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalKTrace.g:2894:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getReferenceCallEffectAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // InternalKTrace.g:2898:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalKTrace.g:2899:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalKTrace.g:2899:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalKTrace.g:2900:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_60);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReferenceCallEffectAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:2921:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReferenceCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
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
    // $ANTLR end "ruleReferenceCallEffect"


    // $ANTLR start "entryRuleFunctionCallEffect"
    // InternalKTrace.g:2933:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallEffect = null;


        try {
            // InternalKTrace.g:2934:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // InternalKTrace.g:2935:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunctionCallEffect=ruleFunctionCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionCallEffect"


    // $ANTLR start "ruleFunctionCallEffect"
    // InternalKTrace.g:2942:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) | (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' ) ) ;
    public final EObject ruleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_functionName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_functionName_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_parameters_14_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:2945:28: ( ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) | (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' ) ) )
            // InternalKTrace.g:2946:1: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) | (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' ) )
            {
            // InternalKTrace.g:2946:1: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) | (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_COMMENT_ANNOTATION||LA95_0==39||LA95_0==61) ) {
                alt95=1;
            }
            else if ( (LA95_0==48) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalKTrace.g:2946:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
                    {
                    // InternalKTrace.g:2946:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
                    // InternalKTrace.g:2946:3: ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
                    {
                    // InternalKTrace.g:2946:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==RULE_COMMENT_ANNOTATION||LA90_0==61) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalKTrace.g:2947:1: (lv_annotations_0_0= ruleAnnotation )
                    	    {
                    	    // InternalKTrace.g:2947:1: (lv_annotations_0_0= ruleAnnotation )
                    	    // InternalKTrace.g:2948:3: lv_annotations_0_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_61);
                    	    lv_annotations_0_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_0_0, 
                    	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    // InternalKTrace.g:2964:3: (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
                    // InternalKTrace.g:2964:5: otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
                    {
                    otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getExternKeyword_0_1_0());
                          
                    }
                    // InternalKTrace.g:2968:1: ( (lv_functionName_2_0= RULE_ID ) )
                    // InternalKTrace.g:2969:1: (lv_functionName_2_0= RULE_ID )
                    {
                    // InternalKTrace.g:2969:1: (lv_functionName_2_0= RULE_ID )
                    // InternalKTrace.g:2970:3: lv_functionName_2_0= RULE_ID
                    {
                    lv_functionName_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_functionName_2_0, grammarAccess.getFunctionCallEffectAccess().getFunctionNameIDTerminalRuleCall_0_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionCallEffectRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"functionName",
                              		lv_functionName_2_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.ID");
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:2986:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==45) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==47) ) {
                        alt92=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        throw nvae;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalKTrace.g:2986:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                            {
                            // InternalKTrace.g:2986:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                            // InternalKTrace.g:2986:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                            {
                            otherlv_3=(Token)match(input,45,FollowSets000.FOLLOW_59); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_0_1_2_0_0());
                                  
                            }
                            // InternalKTrace.g:2990:1: ( (lv_parameters_4_0= ruleParameter ) )
                            // InternalKTrace.g:2991:1: (lv_parameters_4_0= ruleParameter )
                            {
                            // InternalKTrace.g:2991:1: (lv_parameters_4_0= ruleParameter )
                            // InternalKTrace.g:2992:3: lv_parameters_4_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_0_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_60);
                            lv_parameters_4_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_4_0, 
                                      		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalKTrace.g:3008:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                            loop91:
                            do {
                                int alt91=2;
                                int LA91_0 = input.LA(1);

                                if ( (LA91_0==37) ) {
                                    alt91=1;
                                }


                                switch (alt91) {
                            	case 1 :
                            	    // InternalKTrace.g:3008:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                            	    {
                            	    otherlv_5=(Token)match(input,37,FollowSets000.FOLLOW_59); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_0_1_2_0_2_0());
                            	          
                            	    }
                            	    // InternalKTrace.g:3012:1: ( (lv_parameters_6_0= ruleParameter ) )
                            	    // InternalKTrace.g:3013:1: (lv_parameters_6_0= ruleParameter )
                            	    {
                            	    // InternalKTrace.g:3013:1: (lv_parameters_6_0= ruleParameter )
                            	    // InternalKTrace.g:3014:3: lv_parameters_6_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_0_1_2_0_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_60);
                            	    lv_parameters_6_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameters",
                            	              		lv_parameters_6_0, 
                            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop91;
                                }
                            } while (true);

                            otherlv_7=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_0_1_2_0_3());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalKTrace.g:3035:7: otherlv_8= '()'
                            {
                            otherlv_8=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_0_1_2_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:3040:6: (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' )
                    {
                    // InternalKTrace.g:3040:6: (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' )
                    // InternalKTrace.g:3040:8: otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>'
                    {
                    otherlv_9=(Token)match(input,48,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // InternalKTrace.g:3044:1: ( (lv_functionName_10_0= RULE_ID ) )
                    // InternalKTrace.g:3045:1: (lv_functionName_10_0= RULE_ID )
                    {
                    // InternalKTrace.g:3045:1: (lv_functionName_10_0= RULE_ID )
                    // InternalKTrace.g:3046:3: lv_functionName_10_0= RULE_ID
                    {
                    lv_functionName_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_functionName_10_0, grammarAccess.getFunctionCallEffectAccess().getFunctionNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionCallEffectRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"functionName",
                              		lv_functionName_10_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.ID");
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:3062:2: ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' )
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==45) ) {
                        alt94=1;
                    }
                    else if ( (LA94_0==47) ) {
                        alt94=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;
                    }
                    switch (alt94) {
                        case 1 :
                            // InternalKTrace.g:3062:3: (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' )
                            {
                            // InternalKTrace.g:3062:3: (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' )
                            // InternalKTrace.g:3062:5: otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')'
                            {
                            otherlv_11=(Token)match(input,45,FollowSets000.FOLLOW_59); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_1_2_0_0());
                                  
                            }
                            // InternalKTrace.g:3066:1: ( (lv_parameters_12_0= ruleParameter ) )
                            // InternalKTrace.g:3067:1: (lv_parameters_12_0= ruleParameter )
                            {
                            // InternalKTrace.g:3067:1: (lv_parameters_12_0= ruleParameter )
                            // InternalKTrace.g:3068:3: lv_parameters_12_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_60);
                            lv_parameters_12_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_12_0, 
                                      		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalKTrace.g:3084:2: (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )*
                            loop93:
                            do {
                                int alt93=2;
                                int LA93_0 = input.LA(1);

                                if ( (LA93_0==37) ) {
                                    alt93=1;
                                }


                                switch (alt93) {
                            	case 1 :
                            	    // InternalKTrace.g:3084:4: otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) )
                            	    {
                            	    otherlv_13=(Token)match(input,37,FollowSets000.FOLLOW_59); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_13, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_1_2_0_2_0());
                            	          
                            	    }
                            	    // InternalKTrace.g:3088:1: ( (lv_parameters_14_0= ruleParameter ) )
                            	    // InternalKTrace.g:3089:1: (lv_parameters_14_0= ruleParameter )
                            	    {
                            	    // InternalKTrace.g:3089:1: (lv_parameters_14_0= ruleParameter )
                            	    // InternalKTrace.g:3090:3: lv_parameters_14_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_1_2_0_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_60);
                            	    lv_parameters_14_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameters",
                            	              		lv_parameters_14_0, 
                            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop93;
                                }
                            } while (true);

                            otherlv_15=(Token)match(input,46,FollowSets000.FOLLOW_62); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_15, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_1_2_0_3());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalKTrace.g:3111:7: otherlv_16= '()'
                            {
                            otherlv_16=(Token)match(input,47,FollowSets000.FOLLOW_62); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_1_2_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getFunctionCallEffectAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "ruleFunctionCallEffect"


    // $ANTLR start "entryRulePrintCallEffect"
    // InternalKTrace.g:3127:1: entryRulePrintCallEffect returns [EObject current=null] : iv_rulePrintCallEffect= rulePrintCallEffect EOF ;
    public final EObject entryRulePrintCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintCallEffect = null;


        try {
            // InternalKTrace.g:3128:2: (iv_rulePrintCallEffect= rulePrintCallEffect EOF )
            // InternalKTrace.g:3129:2: iv_rulePrintCallEffect= rulePrintCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrintCallEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrintCallEffect=rulePrintCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrintCallEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrintCallEffect"


    // $ANTLR start "rulePrintCallEffect"
    // InternalKTrace.g:3136:1: rulePrintCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* ) ;
    public final EObject rulePrintCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:3139:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* ) )
            // InternalKTrace.g:3140:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )
            {
            // InternalKTrace.g:3140:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )
            // InternalKTrace.g:3140:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
            {
            // InternalKTrace.g:3140:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==RULE_COMMENT_ANNOTATION||LA96_0==61) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalKTrace.g:3141:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKTrace.g:3141:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKTrace.g:3142:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrintCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPrintCallEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPrintCallEffectAccess().getPrintKeyword_1());
                  
            }
            // InternalKTrace.g:3162:1: ( (lv_parameters_2_0= ruleParameter ) )
            // InternalKTrace.g:3163:1: (lv_parameters_2_0= ruleParameter )
            {
            // InternalKTrace.g:3163:1: (lv_parameters_2_0= ruleParameter )
            // InternalKTrace.g:3164:3: lv_parameters_2_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrintCallEffectAccess().getParametersParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_64);
            lv_parameters_2_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrintCallEffectRule());
              	        }
                     		add(
                     			current, 
                     			"parameters",
                      		lv_parameters_2_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:3180:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==37) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalKTrace.g:3180:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
            	    {
            	    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getPrintCallEffectAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKTrace.g:3184:1: ( (lv_parameters_4_0= ruleParameter ) )
            	    // InternalKTrace.g:3185:1: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // InternalKTrace.g:3185:1: (lv_parameters_4_0= ruleParameter )
            	    // InternalKTrace.g:3186:3: lv_parameters_4_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrintCallEffectAccess().getParametersParameterParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_64);
            	    lv_parameters_4_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPrintCallEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_4_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
                }
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
    // $ANTLR end "rulePrintCallEffect"


    // $ANTLR start "entryRuleExpression"
    // InternalKTrace.g:3212:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKTrace.g:3213:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalKTrace.g:3214:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalKTrace.g:3221:1: ruleExpression returns [EObject current=null] : ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;

        EObject lv_schedule_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:3224:28: ( ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKTrace.g:3225:1: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKTrace.g:3225:1: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKTrace.g:3225:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKTrace.g:3225:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt98=2;
            alt98 = dfa98.predict(input);
            switch (alt98) {
                case 1 :
                    // InternalKTrace.g:3226:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_53);
                    this_BoolExpression_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKTrace.g:3239:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_53);
                    this_ValuedExpression_1=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // InternalKTrace.g:3250:2: (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )?
            int alt100=2;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // InternalKTrace.g:3250:4: otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getScheduleKeyword_1_0());
                          
                    }
                    // InternalKTrace.g:3254:1: ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+
                    int cnt99=0;
                    loop99:
                    do {
                        int alt99=2;
                        alt99 = dfa99.predict(input);
                        switch (alt99) {
                    	case 1 :
                    	    // InternalKTrace.g:3255:1: (lv_schedule_3_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKTrace.g:3255:1: (lv_schedule_3_0= ruleScheduleObjectReference )
                    	    // InternalKTrace.g:3256:3: lv_schedule_3_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionAccess().getScheduleScheduleObjectReferenceParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_54);
                    	    lv_schedule_3_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"schedule",
                    	              		lv_schedule_3_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ScheduleObjectReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt99 >= 1 ) break loop99;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(99, input);
                                throw eee;
                        }
                        cnt99++;
                    } while (true);


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // InternalKTrace.g:3280:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalKTrace.g:3281:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalKTrace.g:3282:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // InternalKTrace.g:3289:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:3292:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalKTrace.g:3294:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalKTrace.g:3313:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalKTrace.g:3314:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalKTrace.g:3315:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalKTrace.g:3322:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:3325:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) )
            // InternalKTrace.g:3326:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            {
            // InternalKTrace.g:3326:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            // InternalKTrace.g:3327:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_65);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKTrace.g:3338:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==51) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalKTrace.g:3338:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    {
                    // InternalKTrace.g:3338:2: ()
                    // InternalKTrace.g:3339:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKTrace.g:3347:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )
                    // InternalKTrace.g:3347:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    {
                    // InternalKTrace.g:3347:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    // InternalKTrace.g:3348:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    {
                    // InternalKTrace.g:3348:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    // InternalKTrace.g:3349:3: lv_operator_2_0= ruleLogicalOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_2_0=ruleLogicalOrOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalOrOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:3365:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    // InternalKTrace.g:3366:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    {
                    // InternalKTrace.g:3366:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    // InternalKTrace.g:3367:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_65);
                    lv_subExpressions_3_0=ruleLogicalAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKTrace.g:3383:3: (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==51) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalKTrace.g:3383:5: otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKTrace.g:3387:1: ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    // InternalKTrace.g:3388:1: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalKTrace.g:3388:1: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    // InternalKTrace.g:3389:3: lv_subExpressions_5_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_65);
                    	    lv_subExpressions_5_0=ruleLogicalAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);


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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalKTrace.g:3413:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalKTrace.g:3414:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalKTrace.g:3415:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalKTrace.g:3422:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:3425:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) )
            // InternalKTrace.g:3426:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            {
            // InternalKTrace.g:3426:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            // InternalKTrace.g:3427:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_66);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKTrace.g:3438:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==52) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalKTrace.g:3438:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    {
                    // InternalKTrace.g:3438:2: ()
                    // InternalKTrace.g:3439:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKTrace.g:3447:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )
                    // InternalKTrace.g:3447:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    {
                    // InternalKTrace.g:3447:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    // InternalKTrace.g:3448:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    {
                    // InternalKTrace.g:3448:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    // InternalKTrace.g:3449:3: lv_operator_2_0= ruleLogicalAndOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_2_0=ruleLogicalAndOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:3465:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    // InternalKTrace.g:3466:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    {
                    // InternalKTrace.g:3466:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    // InternalKTrace.g:3467:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_66);
                    lv_subExpressions_3_0=ruleBitwiseOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKTrace.g:3483:3: (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==52) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalKTrace.g:3483:5: otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,52,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKTrace.g:3487:1: ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    // InternalKTrace.g:3488:1: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalKTrace.g:3488:1: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    // InternalKTrace.g:3489:3: lv_subExpressions_5_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_66);
                    	    lv_subExpressions_5_0=ruleBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);


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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalKTrace.g:3513:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalKTrace.g:3514:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalKTrace.g:3515:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // InternalKTrace.g:3522:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:3525:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) )
            // InternalKTrace.g:3526:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            {
            // InternalKTrace.g:3526:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            // InternalKTrace.g:3527:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_67);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKTrace.g:3538:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==53) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalKTrace.g:3538:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    {
                    // InternalKTrace.g:3538:2: ()
                    // InternalKTrace.g:3539:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKTrace.g:3547:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )
                    // InternalKTrace.g:3547:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    {
                    // InternalKTrace.g:3547:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    // InternalKTrace.g:3548:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    {
                    // InternalKTrace.g:3548:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    // InternalKTrace.g:3549:3: lv_operator_2_0= ruleBitwiseOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_2_0=ruleBitwiseOrOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:3565:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    // InternalKTrace.g:3566:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    {
                    // InternalKTrace.g:3566:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    // InternalKTrace.g:3567:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_67);
                    lv_subExpressions_3_0=ruleBitwiseAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKTrace.g:3583:3: (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==53) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalKTrace.g:3583:5: otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKTrace.g:3587:1: ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    // InternalKTrace.g:3588:1: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalKTrace.g:3588:1: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    // InternalKTrace.g:3589:3: lv_subExpressions_5_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_67);
                    	    lv_subExpressions_5_0=ruleBitwiseAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);


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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalKTrace.g:3613:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalKTrace.g:3614:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalKTrace.g:3615:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // InternalKTrace.g:3622:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:3625:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) )
            // InternalKTrace.g:3626:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            {
            // InternalKTrace.g:3626:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            // InternalKTrace.g:3627:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_68);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKTrace.g:3638:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==54) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalKTrace.g:3638:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    {
                    // InternalKTrace.g:3638:2: ()
                    // InternalKTrace.g:3639:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKTrace.g:3647:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )
                    // InternalKTrace.g:3647:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    {
                    // InternalKTrace.g:3647:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    // InternalKTrace.g:3648:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    {
                    // InternalKTrace.g:3648:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    // InternalKTrace.g:3649:3: lv_operator_2_0= ruleBitwiseAndOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_2_0=ruleBitwiseAndOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:3665:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    // InternalKTrace.g:3666:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    {
                    // InternalKTrace.g:3666:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    // InternalKTrace.g:3667:3: lv_subExpressions_3_0= ruleCompareOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_68);
                    lv_subExpressions_3_0=ruleCompareOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKTrace.g:3683:3: (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==54) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // InternalKTrace.g:3683:5: otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKTrace.g:3687:1: ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    // InternalKTrace.g:3688:1: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    {
                    	    // InternalKTrace.g:3688:1: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    // InternalKTrace.g:3689:3: lv_subExpressions_5_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_68);
                    	    lv_subExpressions_5_0=ruleCompareOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);


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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalKTrace.g:3713:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalKTrace.g:3714:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalKTrace.g:3715:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalKTrace.g:3722:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:3725:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalKTrace.g:3726:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalKTrace.g:3726:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalKTrace.g:3727:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_69);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKTrace.g:3738:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt109=2;
            alt109 = dfa109.predict(input);
            switch (alt109) {
                case 1 :
                    // InternalKTrace.g:3738:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalKTrace.g:3738:2: ()
                    // InternalKTrace.g:3739:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKTrace.g:3747:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalKTrace.g:3748:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalKTrace.g:3748:1: (lv_operator_2_0= ruleCompareOperator )
                    // InternalKTrace.g:3749:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_2_0=ruleCompareOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:3765:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalKTrace.g:3766:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalKTrace.g:3766:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalKTrace.g:3767:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_3_0=ruleNotOrValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NotOrValuedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // InternalKTrace.g:3791:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalKTrace.g:3792:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalKTrace.g:3793:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotOrValuedExpression"


    // $ANTLR start "ruleNotOrValuedExpression"
    // InternalKTrace.g:3800:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:3803:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalKTrace.g:3804:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalKTrace.g:3804:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt110=2;
            alt110 = dfa110.predict(input);
            switch (alt110) {
                case 1 :
                    // InternalKTrace.g:3805:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedExpression_0=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKTrace.g:3818:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NotExpression_1=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleNotOrValuedExpression"


    // $ANTLR start "entryRuleNotExpression"
    // InternalKTrace.g:3837:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalKTrace.g:3838:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalKTrace.g:3839:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalKTrace.g:3846:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:3849:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalKTrace.g:3850:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalKTrace.g:3850:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==17) ) {
                alt111=1;
            }
            else if ( (LA111_0==RULE_ID||LA111_0==RULE_HOSTCODE||LA111_0==RULE_BOOLEAN||LA111_0==39||LA111_0==45||(LA111_0>=81 && LA111_0<=82)) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalKTrace.g:3850:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalKTrace.g:3850:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalKTrace.g:3850:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalKTrace.g:3850:3: ()
                    // InternalKTrace.g:3851:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalKTrace.g:3859:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalKTrace.g:3860:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalKTrace.g:3860:1: (lv_operator_1_0= ruleNotOperator )
                    // InternalKTrace.g:3861:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_1_0=ruleNotOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNotExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NotOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:3877:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalKTrace.g:3878:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalKTrace.g:3878:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalKTrace.g:3879:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_2_0=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNotExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NotExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:3897:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicExpression_3=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // InternalKTrace.g:3916:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalKTrace.g:3917:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalKTrace.g:3918:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValuedExpression"


    // $ANTLR start "ruleValuedExpression"
    // InternalKTrace.g:3925:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:3928:28: (this_AddExpression_0= ruleAddExpression )
            // InternalKTrace.g:3930:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AddExpression_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleValuedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalKTrace.g:3949:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalKTrace.g:3950:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalKTrace.g:3951:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalKTrace.g:3958:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:3961:28: ( (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? ) )
            // InternalKTrace.g:3962:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? )
            {
            // InternalKTrace.g:3962:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? )
            // InternalKTrace.g:3963:2: this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_70);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKTrace.g:3974:1: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==55) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalKTrace.g:3974:2: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    {
                    // InternalKTrace.g:3974:2: ()
                    // InternalKTrace.g:3975:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKTrace.g:3983:2: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )
                    // InternalKTrace.g:3983:3: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    {
                    // InternalKTrace.g:3983:3: ( (lv_operator_2_0= ruleAddOperator ) )
                    // InternalKTrace.g:3984:1: (lv_operator_2_0= ruleAddOperator )
                    {
                    // InternalKTrace.g:3984:1: (lv_operator_2_0= ruleAddOperator )
                    // InternalKTrace.g:3985:3: lv_operator_2_0= ruleAddOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_71);
                    lv_operator_2_0=ruleAddOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AddOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:4001:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    // InternalKTrace.g:4002:1: (lv_subExpressions_3_0= ruleSubExpression )
                    {
                    // InternalKTrace.g:4002:1: (lv_subExpressions_3_0= ruleSubExpression )
                    // InternalKTrace.g:4003:3: lv_subExpressions_3_0= ruleSubExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_70);
                    lv_subExpressions_3_0=ruleSubExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.SubExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKTrace.g:4019:3: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==55) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // InternalKTrace.g:4019:5: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKTrace.g:4023:1: ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    // InternalKTrace.g:4024:1: (lv_subExpressions_5_0= ruleSubExpression )
                    	    {
                    	    // InternalKTrace.g:4024:1: (lv_subExpressions_5_0= ruleSubExpression )
                    	    // InternalKTrace.g:4025:3: lv_subExpressions_5_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_70);
                    	    lv_subExpressions_5_0=ruleSubExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.SubExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);


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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalKTrace.g:4049:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalKTrace.g:4050:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalKTrace.g:4051:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // InternalKTrace.g:4058:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:4061:28: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? ) )
            // InternalKTrace.g:4062:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? )
            {
            // InternalKTrace.g:4062:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? )
            // InternalKTrace.g:4063:2: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_72);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKTrace.g:4074:1: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==56) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalKTrace.g:4074:2: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )*
                    {
                    // InternalKTrace.g:4074:2: ()
                    // InternalKTrace.g:4075:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKTrace.g:4083:2: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )
                    // InternalKTrace.g:4083:3: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    {
                    // InternalKTrace.g:4083:3: ( (lv_operator_2_0= ruleSubOperator ) )
                    // InternalKTrace.g:4084:1: (lv_operator_2_0= ruleSubOperator )
                    {
                    // InternalKTrace.g:4084:1: (lv_operator_2_0= ruleSubOperator )
                    // InternalKTrace.g:4085:3: lv_operator_2_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_71);
                    lv_operator_2_0=ruleSubOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.SubOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:4101:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    // InternalKTrace.g:4102:1: (lv_subExpressions_3_0= ruleMultExpression )
                    {
                    // InternalKTrace.g:4102:1: (lv_subExpressions_3_0= ruleMultExpression )
                    // InternalKTrace.g:4103:3: lv_subExpressions_3_0= ruleMultExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_72);
                    lv_subExpressions_3_0=ruleMultExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.MultExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKTrace.g:4119:3: (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==56) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // InternalKTrace.g:4119:5: otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getSubExpressionAccess().getHyphenMinusKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKTrace.g:4123:1: ( (lv_subExpressions_5_0= ruleMultExpression ) )
                    	    // InternalKTrace.g:4124:1: (lv_subExpressions_5_0= ruleMultExpression )
                    	    {
                    	    // InternalKTrace.g:4124:1: (lv_subExpressions_5_0= ruleMultExpression )
                    	    // InternalKTrace.g:4125:3: lv_subExpressions_5_0= ruleMultExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_72);
                    	    lv_subExpressions_5_0=ruleMultExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.MultExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);


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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalKTrace.g:4149:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalKTrace.g:4150:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalKTrace.g:4151:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // InternalKTrace.g:4158:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:4161:28: ( (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? ) )
            // InternalKTrace.g:4162:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? )
            {
            // InternalKTrace.g:4162:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? )
            // InternalKTrace.g:4163:2: this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_73);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKTrace.g:4174:1: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==57) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalKTrace.g:4174:2: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )*
                    {
                    // InternalKTrace.g:4174:2: ()
                    // InternalKTrace.g:4175:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKTrace.g:4183:2: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )
                    // InternalKTrace.g:4183:3: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    {
                    // InternalKTrace.g:4183:3: ( (lv_operator_2_0= ruleMultOperator ) )
                    // InternalKTrace.g:4184:1: (lv_operator_2_0= ruleMultOperator )
                    {
                    // InternalKTrace.g:4184:1: (lv_operator_2_0= ruleMultOperator )
                    // InternalKTrace.g:4185:3: lv_operator_2_0= ruleMultOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_71);
                    lv_operator_2_0=ruleMultOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.MultOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:4201:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    // InternalKTrace.g:4202:1: (lv_subExpressions_3_0= ruleDivExpression )
                    {
                    // InternalKTrace.g:4202:1: (lv_subExpressions_3_0= ruleDivExpression )
                    // InternalKTrace.g:4203:3: lv_subExpressions_3_0= ruleDivExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_73);
                    lv_subExpressions_3_0=ruleDivExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.DivExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKTrace.g:4219:3: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==57) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // InternalKTrace.g:4219:5: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,57,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKTrace.g:4223:1: ( (lv_subExpressions_5_0= ruleDivExpression ) )
                    	    // InternalKTrace.g:4224:1: (lv_subExpressions_5_0= ruleDivExpression )
                    	    {
                    	    // InternalKTrace.g:4224:1: (lv_subExpressions_5_0= ruleDivExpression )
                    	    // InternalKTrace.g:4225:3: lv_subExpressions_5_0= ruleDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_73);
                    	    lv_subExpressions_5_0=ruleDivExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.DivExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);


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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // InternalKTrace.g:4249:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // InternalKTrace.g:4250:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // InternalKTrace.g:4251:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDivExpression"


    // $ANTLR start "ruleDivExpression"
    // InternalKTrace.g:4258:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:4261:28: ( (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? ) )
            // InternalKTrace.g:4262:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? )
            {
            // InternalKTrace.g:4262:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? )
            // InternalKTrace.g:4263:2: this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_74);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKTrace.g:4274:1: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?
            int alt119=2;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // InternalKTrace.g:4274:2: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
                    {
                    // InternalKTrace.g:4274:2: ()
                    // InternalKTrace.g:4275:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKTrace.g:4283:2: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )
                    // InternalKTrace.g:4283:3: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // InternalKTrace.g:4283:3: ( (lv_operator_2_0= ruleDivOperator ) )
                    // InternalKTrace.g:4284:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // InternalKTrace.g:4284:1: (lv_operator_2_0= ruleDivOperator )
                    // InternalKTrace.g:4285:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_71);
                    lv_operator_2_0=ruleDivOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDivExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.DivOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:4301:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // InternalKTrace.g:4302:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // InternalKTrace.g:4302:1: (lv_subExpressions_3_0= ruleModExpression )
                    // InternalKTrace.g:4303:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_74);
                    lv_subExpressions_3_0=ruleModExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDivExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ModExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKTrace.g:4319:3: (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
                    loop118:
                    do {
                        int alt118=2;
                        alt118 = dfa118.predict(input);
                        switch (alt118) {
                    	case 1 :
                    	    // InternalKTrace.g:4319:5: otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getDivExpressionAccess().getSolidusKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKTrace.g:4323:1: ( (lv_subExpressions_5_0= ruleModExpression ) )
                    	    // InternalKTrace.g:4324:1: (lv_subExpressions_5_0= ruleModExpression )
                    	    {
                    	    // InternalKTrace.g:4324:1: (lv_subExpressions_5_0= ruleModExpression )
                    	    // InternalKTrace.g:4325:3: lv_subExpressions_5_0= ruleModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_74);
                    	    lv_subExpressions_5_0=ruleModExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDivExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ModExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);


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
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // InternalKTrace.g:4349:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // InternalKTrace.g:4350:2: (iv_ruleModExpression= ruleModExpression EOF )
            // InternalKTrace.g:4351:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // InternalKTrace.g:4358:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:4361:28: ( (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) )
            // InternalKTrace.g:4362:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            {
            // InternalKTrace.g:4362:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            // InternalKTrace.g:4363:2: this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_75);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKTrace.g:4374:1: ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==20) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalKTrace.g:4374:2: () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    {
                    // InternalKTrace.g:4374:2: ()
                    // InternalKTrace.g:4375:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKTrace.g:4383:2: ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    // InternalKTrace.g:4383:3: ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKTrace.g:4383:3: ( (lv_operator_2_0= ruleModOperator ) )
                    // InternalKTrace.g:4384:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // InternalKTrace.g:4384:1: (lv_operator_2_0= ruleModOperator )
                    // InternalKTrace.g:4385:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_71);
                    lv_operator_2_0=ruleModOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ModOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:4401:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKTrace.g:4402:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKTrace.g:4402:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKTrace.g:4403:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_75);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKTrace.g:4419:3: (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==20) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalKTrace.g:4419:5: otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getModExpressionAccess().getPercentSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKTrace.g:4423:1: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    // InternalKTrace.g:4424:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalKTrace.g:4424:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    // InternalKTrace.g:4425:3: lv_subExpressions_5_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_75);
                    	    lv_subExpressions_5_0=ruleAtomicValuedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);


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
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // InternalKTrace.g:4449:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalKTrace.g:4450:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalKTrace.g:4451:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // InternalKTrace.g:4458:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:4461:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // InternalKTrace.g:4462:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // InternalKTrace.g:4462:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==56) ) {
                alt122=1;
            }
            else if ( ((LA122_0>=RULE_ID && LA122_0<=RULE_BOOLEAN)||LA122_0==29||LA122_0==39||LA122_0==45||(LA122_0>=81 && LA122_0<=82)) ) {
                alt122=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // InternalKTrace.g:4462:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalKTrace.g:4462:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalKTrace.g:4462:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalKTrace.g:4462:3: ()
                    // InternalKTrace.g:4463:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalKTrace.g:4471:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalKTrace.g:4472:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalKTrace.g:4472:1: (lv_operator_1_0= ruleSubOperator )
                    // InternalKTrace.g:4473:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_71);
                    lv_operator_1_0=ruleSubOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNegExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.SubOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:4489:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalKTrace.g:4490:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalKTrace.g:4490:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalKTrace.g:4491:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_2_0=ruleNegExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNegExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:4509:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicValuedExpression_3=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicValuedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKTrace.g:4528:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKTrace.g:4529:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKTrace.g:4530:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalKTrace.g:4537:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_ReferenceCall_5 = null;

        EObject this_FunctionCall_6 = null;

        EObject this_TextExpression_7 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:4540:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression ) )
            // InternalKTrace.g:4541:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression )
            {
            // InternalKTrace.g:4541:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression )
            int alt123=6;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // InternalKTrace.g:4542:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BoolValue_0=ruleBoolValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKTrace.g:4555:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedObjectTestExpression_1=ruleValuedObjectTestExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedObjectTestExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKTrace.g:4567:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalKTrace.g:4567:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalKTrace.g:4567:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKTrace.g:4589:2: this_ReferenceCall_5= ruleReferenceCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getReferenceCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceCall_5=ruleReferenceCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceCall_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalKTrace.g:4602:2: this_FunctionCall_6= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionCall_6=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalKTrace.g:4615:2: this_TextExpression_7= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextExpression_7=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleAtomicValuedExpression"
    // InternalKTrace.g:4634:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalKTrace.g:4635:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalKTrace.g:4636:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomicValuedExpression"


    // $ANTLR start "ruleAtomicValuedExpression"
    // InternalKTrace.g:4643:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_VectorValue_3 = null;

        EObject this_ValuedExpression_5 = null;

        EObject this_AtomicExpression_7 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:4646:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) )
            // InternalKTrace.g:4647:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            {
            // InternalKTrace.g:4647:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            int alt124=6;
            alt124 = dfa124.predict(input);
            switch (alt124) {
                case 1 :
                    // InternalKTrace.g:4648:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKTrace.g:4661:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FloatValue_1=ruleFloatValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKTrace.g:4674:2: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalKTrace.g:4687:2: this_VectorValue_3= ruleVectorValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getVectorValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_VectorValue_3=ruleVectorValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VectorValue_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalKTrace.g:4699:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    {
                    // InternalKTrace.g:4699:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    // InternalKTrace.g:4699:8: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,45,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
                    this_ValuedExpression_5=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKTrace.g:4721:2: this_AtomicExpression_7= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicExpression_7=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleAtomicValuedExpression"


    // $ANTLR start "entryRuleValuedObjectTestExpression"
    // InternalKTrace.g:4740:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalKTrace.g:4741:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalKTrace.g:4742:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValuedObjectTestExpression"


    // $ANTLR start "ruleValuedObjectTestExpression"
    // InternalKTrace.g:4749:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
    public final EObject ruleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_operator_1_1 = null;

        Enumerator lv_operator_1_2 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_ValuedObjectReference_5 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:4752:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // InternalKTrace.g:4753:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // InternalKTrace.g:4753:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( ((LA126_0>=81 && LA126_0<=82)) ) {
                alt126=1;
            }
            else if ( (LA126_0==RULE_ID) ) {
                alt126=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // InternalKTrace.g:4753:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // InternalKTrace.g:4753:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // InternalKTrace.g:4753:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // InternalKTrace.g:4753:3: ()
                    // InternalKTrace.g:4754:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalKTrace.g:4762:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalKTrace.g:4763:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalKTrace.g:4763:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalKTrace.g:4764:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalKTrace.g:4764:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==81) ) {
                        alt125=1;
                    }
                    else if ( (LA125_0==82) ) {
                        alt125=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 125, 0, input);

                        throw nvae;
                    }
                    switch (alt125) {
                        case 1 :
                            // InternalKTrace.g:4765:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_76);
                            lv_operator_1_1=rulePreOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"operator",
                                      		lv_operator_1_1, 
                                      		"de.cau.cs.kieler.kexpressions.KExpressions.PreOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalKTrace.g:4780:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_76);
                            lv_operator_1_2=ruleValOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"operator",
                                      		lv_operator_1_2, 
                                      		"de.cau.cs.kieler.kexpressions.KExpressions.ValOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // InternalKTrace.g:4802:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalKTrace.g:4803:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalKTrace.g:4803:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalKTrace.g:4804:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
                    lv_subExpressions_3_0=ruleValuedObjectTestExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectTestExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:4826:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedObjectReference_5=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedObjectReference_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleValuedObjectTestExpression"


    // $ANTLR start "entryRulePrimeID"
    // InternalKTrace.g:4845:1: entryRulePrimeID returns [String current=null] : iv_rulePrimeID= rulePrimeID EOF ;
    public final String entryRulePrimeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimeID = null;


        try {
            // InternalKTrace.g:4846:2: (iv_rulePrimeID= rulePrimeID EOF )
            // InternalKTrace.g:4847:2: iv_rulePrimeID= rulePrimeID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimeIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimeID=rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimeID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimeID"


    // $ANTLR start "rulePrimeID"
    // InternalKTrace.g:4854:1: rulePrimeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '\\'' )* ) ;
    public final AntlrDatatypeRuleToken rulePrimeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalKTrace.g:4857:28: ( (this_ID_0= RULE_ID (kw= '\\'' )* ) )
            // InternalKTrace.g:4858:1: (this_ID_0= RULE_ID (kw= '\\'' )* )
            {
            // InternalKTrace.g:4858:1: (this_ID_0= RULE_ID (kw= '\\'' )* )
            // InternalKTrace.g:4858:6: this_ID_0= RULE_ID (kw= '\\'' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPrimeIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKTrace.g:4865:1: (kw= '\\'' )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==58) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // InternalKTrace.g:4866:2: kw= '\\''
            	    {
            	    kw=(Token)match(input,58,FollowSets000.FOLLOW_78); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPrimeIDAccess().getApostropheKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop127;
                }
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
    // $ANTLR end "rulePrimeID"


    // $ANTLR start "entryRuleValuedObjectReference"
    // InternalKTrace.g:4879:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalKTrace.g:4880:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalKTrace.g:4881:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValuedObjectReference"


    // $ANTLR start "ruleValuedObjectReference"
    // InternalKTrace.g:4888:1: ruleValuedObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_indices_2_0 = null;

        EObject lv_subReference_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:4891:28: ( ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) )
            // InternalKTrace.g:4892:1: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            {
            // InternalKTrace.g:4892:1: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            // InternalKTrace.g:4892:2: ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            {
            // InternalKTrace.g:4892:2: ( ( rulePrimeID ) )
            // InternalKTrace.g:4893:1: ( rulePrimeID )
            {
            // InternalKTrace.g:4893:1: ( rulePrimeID )
            // InternalKTrace.g:4894:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_79);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:4910:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==42) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // InternalKTrace.g:4910:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalKTrace.g:4914:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalKTrace.g:4915:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalKTrace.g:4915:1: (lv_indices_2_0= ruleExpression )
            	    // InternalKTrace.g:4916:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_48);
            	    lv_indices_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indices",
            	              		lv_indices_2_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_79); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop128;
                }
            } while (true);

            // InternalKTrace.g:4936:3: (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==59) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalKTrace.g:4936:5: otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    {
                    otherlv_4=(Token)match(input,59,FollowSets000.FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_2_0());
                          
                    }
                    // InternalKTrace.g:4940:1: ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    // InternalKTrace.g:4941:1: (lv_subReference_5_0= ruleValuedObjectReference )
                    {
                    // InternalKTrace.g:4941:1: (lv_subReference_5_0= ruleValuedObjectReference )
                    // InternalKTrace.g:4942:3: lv_subReference_5_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceValuedObjectReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subReference_5_0=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
                      	        }
                             		set(
                             			current, 
                             			"subReference",
                              		lv_subReference_5_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleScheduleObjectReference"
    // InternalKTrace.g:4966:1: entryRuleScheduleObjectReference returns [EObject current=null] : iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF ;
    public final EObject entryRuleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleObjectReference = null;


        try {
            // InternalKTrace.g:4967:2: (iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF )
            // InternalKTrace.g:4968:2: iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScheduleObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScheduleObjectReference=ruleScheduleObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScheduleObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScheduleObjectReference"


    // $ANTLR start "ruleScheduleObjectReference"
    // InternalKTrace.g:4975:1: ruleScheduleObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) ;
    public final EObject ruleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        Token lv_priority_1_0=null;

         enterRule(); 
            
        try {
            // InternalKTrace.g:4978:28: ( ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) )
            // InternalKTrace.g:4979:1: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            {
            // InternalKTrace.g:4979:1: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            // InternalKTrace.g:4979:2: ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) )
            {
            // InternalKTrace.g:4979:2: ( ( rulePrimeID ) )
            // InternalKTrace.g:4980:1: ( rulePrimeID )
            {
            // InternalKTrace.g:4980:1: ( rulePrimeID )
            // InternalKTrace.g:4981:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getScheduleObjectReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScheduleObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_45);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:4997:2: ( (lv_priority_1_0= RULE_INT ) )
            // InternalKTrace.g:4998:1: (lv_priority_1_0= RULE_INT )
            {
            // InternalKTrace.g:4998:1: (lv_priority_1_0= RULE_INT )
            // InternalKTrace.g:4999:3: lv_priority_1_0= RULE_INT
            {
            lv_priority_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_priority_1_0, grammarAccess.getScheduleObjectReferenceAccess().getPriorityINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getScheduleObjectReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"priority",
                      		lv_priority_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
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
    // $ANTLR end "ruleScheduleObjectReference"


    // $ANTLR start "entryRuleReferenceCall"
    // InternalKTrace.g:5023:1: entryRuleReferenceCall returns [EObject current=null] : iv_ruleReferenceCall= ruleReferenceCall EOF ;
    public final EObject entryRuleReferenceCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCall = null;


        try {
            // InternalKTrace.g:5024:2: (iv_ruleReferenceCall= ruleReferenceCall EOF )
            // InternalKTrace.g:5025:2: iv_ruleReferenceCall= ruleReferenceCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceCall=ruleReferenceCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceCall"


    // $ANTLR start "ruleReferenceCall"
    // InternalKTrace.g:5032:1: ruleReferenceCall returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) ;
    public final EObject ruleReferenceCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:5035:28: ( ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) )
            // InternalKTrace.g:5036:1: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            {
            // InternalKTrace.g:5036:1: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            // InternalKTrace.g:5036:2: ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            {
            // InternalKTrace.g:5036:2: ( ( rulePrimeID ) )
            // InternalKTrace.g:5037:1: ( rulePrimeID )
            {
            // InternalKTrace.g:5037:1: ( rulePrimeID )
            // InternalKTrace.g:5038:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceCallAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_58);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:5054:2: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==45) ) {
                alt131=1;
            }
            else if ( (LA131_0==47) ) {
                alt131=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }
            switch (alt131) {
                case 1 :
                    // InternalKTrace.g:5054:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    {
                    // InternalKTrace.g:5054:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    // InternalKTrace.g:5054:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceCallAccess().getLeftParenthesisKeyword_1_0_0());
                          
                    }
                    // InternalKTrace.g:5058:1: ( (lv_parameters_2_0= ruleParameter ) )
                    // InternalKTrace.g:5059:1: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalKTrace.g:5059:1: (lv_parameters_2_0= ruleParameter )
                    // InternalKTrace.g:5060:3: lv_parameters_2_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_60);
                    lv_parameters_2_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceCallRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:5076:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                    loop130:
                    do {
                        int alt130=2;
                        int LA130_0 = input.LA(1);

                        if ( (LA130_0==37) ) {
                            alt130=1;
                        }


                        switch (alt130) {
                    	case 1 :
                    	    // InternalKTrace.g:5076:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getReferenceCallAccess().getCommaKeyword_1_0_2_0());
                    	          
                    	    }
                    	    // InternalKTrace.g:5080:1: ( (lv_parameters_4_0= ruleParameter ) )
                    	    // InternalKTrace.g:5081:1: (lv_parameters_4_0= ruleParameter )
                    	    {
                    	    // InternalKTrace.g:5081:1: (lv_parameters_4_0= ruleParameter )
                    	    // InternalKTrace.g:5082:3: lv_parameters_4_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_60);
                    	    lv_parameters_4_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReferenceCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_4_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop130;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getReferenceCallAccess().getRightParenthesisKeyword_1_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:5103:7: otherlv_6= '()'
                    {
                    otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReferenceCallAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
                          
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
    // $ANTLR end "ruleReferenceCall"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalKTrace.g:5115:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKTrace.g:5116:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKTrace.g:5117:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalKTrace.g:5124:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_functionName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:5127:28: ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) )
            // InternalKTrace.g:5128:1: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            {
            // InternalKTrace.g:5128:1: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            // InternalKTrace.g:5128:3: otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getExternKeyword_0());
                  
            }
            // InternalKTrace.g:5132:1: ( (lv_functionName_1_0= RULE_ID ) )
            // InternalKTrace.g:5133:1: (lv_functionName_1_0= RULE_ID )
            {
            // InternalKTrace.g:5133:1: (lv_functionName_1_0= RULE_ID )
            // InternalKTrace.g:5134:3: lv_functionName_1_0= RULE_ID
            {
            lv_functionName_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_functionName_1_0, grammarAccess.getFunctionCallAccess().getFunctionNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionCallRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"functionName",
                      		lv_functionName_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ID");
              	    
            }

            }


            }

            // InternalKTrace.g:5150:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==45) ) {
                alt133=1;
            }
            else if ( (LA133_0==47) ) {
                alt133=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }
            switch (alt133) {
                case 1 :
                    // InternalKTrace.g:5150:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalKTrace.g:5150:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalKTrace.g:5150:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // InternalKTrace.g:5154:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalKTrace.g:5155:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalKTrace.g:5155:1: (lv_parameters_3_0= ruleParameter )
                    // InternalKTrace.g:5156:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_60);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKTrace.g:5172:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==37) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // InternalKTrace.g:5172:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // InternalKTrace.g:5176:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalKTrace.g:5177:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalKTrace.g:5177:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalKTrace.g:5178:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_60);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:5199:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // InternalKTrace.g:5211:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalKTrace.g:5212:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalKTrace.g:5213:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalKTrace.g:5220:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:5223:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKTrace.g:5224:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKTrace.g:5224:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKTrace.g:5224:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKTrace.g:5224:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==17) ) {
                int LA135_1 = input.LA(2);

                if ( (LA135_1==54) ) {
                    alt135=1;
                }
            }
            else if ( (LA135_0==54) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalKTrace.g:5224:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalKTrace.g:5224:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==17) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // InternalKTrace.g:5225:1: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalKTrace.g:5225:1: (lv_pureOutput_0_0= '!' )
                            // InternalKTrace.g:5226:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,17,FollowSets000.FOLLOW_80); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_pureOutput_0_0, grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getParameterRule());
                              	        }
                                     		setWithLastConsumed(current, "pureOutput", true, "!");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalKTrace.g:5239:3: ( (lv_callByReference_1_0= '&' ) )
                    // InternalKTrace.g:5240:1: (lv_callByReference_1_0= '&' )
                    {
                    // InternalKTrace.g:5240:1: (lv_callByReference_1_0= '&' )
                    // InternalKTrace.g:5241:3: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,54,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_callByReference_1_0, grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterRule());
                      	        }
                             		setWithLastConsumed(current, "callByReference", true, "&");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKTrace.g:5254:4: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKTrace.g:5255:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalKTrace.g:5255:1: (lv_expression_2_0= ruleExpression )
            // InternalKTrace.g:5256:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTextExpression"
    // InternalKTrace.g:5280:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalKTrace.g:5281:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalKTrace.g:5282:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // InternalKTrace.g:5289:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // InternalKTrace.g:5292:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // InternalKTrace.g:5293:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // InternalKTrace.g:5293:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // InternalKTrace.g:5294:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // InternalKTrace.g:5294:1: (lv_text_0_0= RULE_HOSTCODE )
            // InternalKTrace.g:5295:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_0_0, grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_0_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.HOSTCODE");
              	    
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
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // InternalKTrace.g:5319:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalKTrace.g:5320:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalKTrace.g:5321:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalKTrace.g:5328:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKTrace.g:5331:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalKTrace.g:5332:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalKTrace.g:5332:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalKTrace.g:5333:1: (lv_value_0_0= RULE_INT )
            {
            // InternalKTrace.g:5333:1: (lv_value_0_0= RULE_INT )
            // InternalKTrace.g:5334:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalKTrace.g:5358:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalKTrace.g:5359:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalKTrace.g:5360:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalKTrace.g:5367:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKTrace.g:5370:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalKTrace.g:5371:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalKTrace.g:5371:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalKTrace.g:5372:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalKTrace.g:5372:1: (lv_value_0_0= RULE_FLOAT )
            // InternalKTrace.g:5373:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloatValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.FLOAT");
              	    
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
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalKTrace.g:5397:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalKTrace.g:5398:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalKTrace.g:5399:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalKTrace.g:5406:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKTrace.g:5409:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalKTrace.g:5410:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalKTrace.g:5410:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalKTrace.g:5411:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalKTrace.g:5411:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalKTrace.g:5412:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getBoolValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBoolValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.BOOLEAN");
              	    
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
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalKTrace.g:5436:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalKTrace.g:5437:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalKTrace.g:5438:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalKTrace.g:5445:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKTrace.g:5448:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalKTrace.g:5449:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalKTrace.g:5449:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalKTrace.g:5450:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalKTrace.g:5450:1: (lv_value_0_0= RULE_STRING )
            // InternalKTrace.g:5451:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.STRING");
              	    
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleVectorValue"
    // InternalKTrace.g:5475:1: entryRuleVectorValue returns [EObject current=null] : iv_ruleVectorValue= ruleVectorValue EOF ;
    public final EObject entryRuleVectorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValue = null;


        try {
            // InternalKTrace.g:5476:2: (iv_ruleVectorValue= ruleVectorValue EOF )
            // InternalKTrace.g:5477:2: iv_ruleVectorValue= ruleVectorValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVectorValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVectorValue=ruleVectorValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVectorValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVectorValue"


    // $ANTLR start "ruleVectorValue"
    // InternalKTrace.g:5484:1: ruleVectorValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleVectorValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:5487:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' ) )
            // InternalKTrace.g:5488:1: (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' )
            {
            // InternalKTrace.g:5488:1: (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' )
            // InternalKTrace.g:5488:3: otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVectorValueAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // InternalKTrace.g:5492:1: ( (lv_values_1_0= ruleVectorValueMember ) )
            // InternalKTrace.g:5493:1: (lv_values_1_0= ruleVectorValueMember )
            {
            // InternalKTrace.g:5493:1: (lv_values_1_0= ruleVectorValueMember )
            // InternalKTrace.g:5494:3: lv_values_1_0= ruleVectorValueMember
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_82);
            lv_values_1_0=ruleVectorValueMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVectorValueRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_1_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.VectorValueMember");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:5510:2: (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==37) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // InternalKTrace.g:5510:4: otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) )
            	    {
            	    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_81); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVectorValueAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalKTrace.g:5514:1: ( (lv_values_3_0= ruleVectorValueMember ) )
            	    // InternalKTrace.g:5515:1: (lv_values_3_0= ruleVectorValueMember )
            	    {
            	    // InternalKTrace.g:5515:1: (lv_values_3_0= ruleVectorValueMember )
            	    // InternalKTrace.g:5516:3: lv_values_3_0= ruleVectorValueMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_82);
            	    lv_values_3_0=ruleVectorValueMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVectorValueRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_3_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.VectorValueMember");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop136;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVectorValueAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleVectorValue"


    // $ANTLR start "entryRuleVectorValueMember"
    // InternalKTrace.g:5544:1: entryRuleVectorValueMember returns [EObject current=null] : iv_ruleVectorValueMember= ruleVectorValueMember EOF ;
    public final EObject entryRuleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValueMember = null;


        try {
            // InternalKTrace.g:5545:2: (iv_ruleVectorValueMember= ruleVectorValueMember EOF )
            // InternalKTrace.g:5546:2: iv_ruleVectorValueMember= ruleVectorValueMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVectorValueMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVectorValueMember=ruleVectorValueMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVectorValueMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVectorValueMember"


    // $ANTLR start "ruleVectorValueMember"
    // InternalKTrace.g:5553:1: ruleVectorValueMember returns [EObject current=null] : (this_Expression_0= ruleExpression | this_IgnoreValue_1= ruleIgnoreValue ) ;
    public final EObject ruleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_IgnoreValue_1 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:5556:28: ( (this_Expression_0= ruleExpression | this_IgnoreValue_1= ruleIgnoreValue ) )
            // InternalKTrace.g:5557:1: (this_Expression_0= ruleExpression | this_IgnoreValue_1= ruleIgnoreValue )
            {
            // InternalKTrace.g:5557:1: (this_Expression_0= ruleExpression | this_IgnoreValue_1= ruleIgnoreValue )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( ((LA137_0>=RULE_ID && LA137_0<=RULE_BOOLEAN)||LA137_0==17||LA137_0==29||LA137_0==39||LA137_0==45||LA137_0==56||(LA137_0>=81 && LA137_0<=82)) ) {
                alt137=1;
            }
            else if ( (LA137_0==60) ) {
                alt137=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // InternalKTrace.g:5558:2: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVectorValueMemberAccess().getExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKTrace.g:5571:2: this_IgnoreValue_1= ruleIgnoreValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVectorValueMemberAccess().getIgnoreValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IgnoreValue_1=ruleIgnoreValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IgnoreValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleVectorValueMember"


    // $ANTLR start "entryRuleIgnoreValue"
    // InternalKTrace.g:5590:1: entryRuleIgnoreValue returns [EObject current=null] : iv_ruleIgnoreValue= ruleIgnoreValue EOF ;
    public final EObject entryRuleIgnoreValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnoreValue = null;


        try {
            // InternalKTrace.g:5591:2: (iv_ruleIgnoreValue= ruleIgnoreValue EOF )
            // InternalKTrace.g:5592:2: iv_ruleIgnoreValue= ruleIgnoreValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIgnoreValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIgnoreValue=ruleIgnoreValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIgnoreValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIgnoreValue"


    // $ANTLR start "ruleIgnoreValue"
    // InternalKTrace.g:5599:1: ruleIgnoreValue returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject ruleIgnoreValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalKTrace.g:5602:28: ( ( () otherlv_1= '_' ) )
            // InternalKTrace.g:5603:1: ( () otherlv_1= '_' )
            {
            // InternalKTrace.g:5603:1: ( () otherlv_1= '_' )
            // InternalKTrace.g:5603:2: () otherlv_1= '_'
            {
            // InternalKTrace.g:5603:2: ()
            // InternalKTrace.g:5604:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIgnoreValueAccess().getIgnoreValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIgnoreValueAccess().get_Keyword_1());
                  
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
    // $ANTLR end "ruleIgnoreValue"


    // $ANTLR start "entryRuleAnnotation"
    // InternalKTrace.g:5628:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalKTrace.g:5629:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalKTrace.g:5630:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalKTrace.g:5637:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:5640:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKTrace.g:5641:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKTrace.g:5641:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt138=4;
            alt138 = dfa138.predict(input);
            switch (alt138) {
                case 1 :
                    // InternalKTrace.g:5642:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CommentAnnotation_0=ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CommentAnnotation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKTrace.g:5655:2: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_KeyStringValueAnnotation_1=ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyStringValueAnnotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKTrace.g:5668:2: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedKeyStringValueAnnotation_2=ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedKeyStringValueAnnotation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalKTrace.g:5681:2: this_TagAnnotation_3= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TagAnnotation_3=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRulePragma"
    // InternalKTrace.g:5700:1: entryRulePragma returns [EObject current=null] : iv_rulePragma= rulePragma EOF ;
    public final EObject entryRulePragma() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragma = null;


        try {
            // InternalKTrace.g:5701:2: (iv_rulePragma= rulePragma EOF )
            // InternalKTrace.g:5702:2: iv_rulePragma= rulePragma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPragmaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePragma=rulePragma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePragma; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePragma"


    // $ANTLR start "rulePragma"
    // InternalKTrace.g:5709:1: rulePragma returns [EObject current=null] : (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag ) ;
    public final EObject rulePragma() throws RecognitionException {
        EObject current = null;

        EObject this_StringPragma_0 = null;

        EObject this_PragmaTag_1 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:5712:28: ( (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag ) )
            // InternalKTrace.g:5713:1: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )
            {
            // InternalKTrace.g:5713:1: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )
            int alt139=2;
            alt139 = dfa139.predict(input);
            switch (alt139) {
                case 1 :
                    // InternalKTrace.g:5714:2: this_StringPragma_0= ruleStringPragma
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPragmaAccess().getStringPragmaParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringPragma_0=ruleStringPragma();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringPragma_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKTrace.g:5727:2: this_PragmaTag_1= rulePragmaTag
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPragmaAccess().getPragmaTagParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PragmaTag_1=rulePragmaTag();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PragmaTag_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

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
    // $ANTLR end "rulePragma"


    // $ANTLR start "entryRuleQuotedStringAnnotation"
    // InternalKTrace.g:5750:1: entryRuleQuotedStringAnnotation returns [EObject current=null] : iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF ;
    public final EObject entryRuleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedStringAnnotation = null;


        try {
            // InternalKTrace.g:5751:2: (iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF )
            // InternalKTrace.g:5752:2: iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedStringAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuotedStringAnnotation=ruleQuotedStringAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedStringAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQuotedStringAnnotation"


    // $ANTLR start "ruleQuotedStringAnnotation"
    // InternalKTrace.g:5759:1: ruleQuotedStringAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_QuotedKeyStringValueAnnotation_1 = null;

        EObject this_QuotedTypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:5762:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKTrace.g:5763:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKTrace.g:5763:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt140=4;
            alt140 = dfa140.predict(input);
            switch (alt140) {
                case 1 :
                    // InternalKTrace.g:5764:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CommentAnnotation_0=ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CommentAnnotation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKTrace.g:5777:2: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QuotedKeyStringValueAnnotation_1=ruleQuotedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QuotedKeyStringValueAnnotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKTrace.g:5790:2: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QuotedTypedKeyStringValueAnnotation_2=ruleQuotedTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QuotedTypedKeyStringValueAnnotation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalKTrace.g:5803:2: this_TagAnnotation_3= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TagAnnotation_3=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleQuotedStringAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalKTrace.g:5822:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalKTrace.g:5823:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalKTrace.g:5824:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // InternalKTrace.g:5831:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalKTrace.g:5834:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalKTrace.g:5835:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalKTrace.g:5835:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalKTrace.g:5836:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalKTrace.g:5836:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalKTrace.g:5837:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_0_0, grammarAccess.getCommentAnnotationAccess().getValuesCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommentAnnotationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.COMMENT_ANNOTATION");
              	    
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
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleCommentAnnotatonSL"
    // InternalKTrace.g:5861:1: entryRuleCommentAnnotatonSL returns [EObject current=null] : iv_ruleCommentAnnotatonSL= ruleCommentAnnotatonSL EOF ;
    public final EObject entryRuleCommentAnnotatonSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotatonSL = null;


        try {
            // InternalKTrace.g:5862:2: (iv_ruleCommentAnnotatonSL= ruleCommentAnnotatonSL EOF )
            // InternalKTrace.g:5863:2: iv_ruleCommentAnnotatonSL= ruleCommentAnnotatonSL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotatonSLRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCommentAnnotatonSL=ruleCommentAnnotatonSL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotatonSL; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommentAnnotatonSL"


    // $ANTLR start "ruleCommentAnnotatonSL"
    // InternalKTrace.g:5870:1: ruleCommentAnnotatonSL returns [EObject current=null] : ( (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotatonSL() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalKTrace.g:5873:28: ( ( (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION ) ) )
            // InternalKTrace.g:5874:1: ( (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION ) )
            {
            // InternalKTrace.g:5874:1: ( (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION ) )
            // InternalKTrace.g:5875:1: (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION )
            {
            // InternalKTrace.g:5875:1: (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION )
            // InternalKTrace.g:5876:3: lv_values_0_0= RULE_SL_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_SL_COMMENT_ANNOTATION,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_0_0, grammarAccess.getCommentAnnotatonSLAccess().getValuesSL_COMMENT_ANNOTATIONTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommentAnnotatonSLRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.SL_COMMENT_ANNOTATION");
              	    
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
    // $ANTLR end "ruleCommentAnnotatonSL"


    // $ANTLR start "entryRuleTagAnnotation"
    // InternalKTrace.g:5900:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalKTrace.g:5901:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalKTrace.g:5902:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // InternalKTrace.g:5909:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:5912:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKTrace.g:5913:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKTrace.g:5913:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKTrace.g:5913:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKTrace.g:5917:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKTrace.g:5918:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKTrace.g:5918:1: (lv_name_1_0= ruleExtendedID )
            // InternalKTrace.g:5919:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTagAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRulePragmaTag"
    // InternalKTrace.g:5943:1: entryRulePragmaTag returns [EObject current=null] : iv_rulePragmaTag= rulePragmaTag EOF ;
    public final EObject entryRulePragmaTag() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaTag = null;


        try {
            // InternalKTrace.g:5944:2: (iv_rulePragmaTag= rulePragmaTag EOF )
            // InternalKTrace.g:5945:2: iv_rulePragmaTag= rulePragmaTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPragmaTagRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePragmaTag=rulePragmaTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePragmaTag; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePragmaTag"


    // $ANTLR start "rulePragmaTag"
    // InternalKTrace.g:5952:1: rulePragmaTag returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject rulePragmaTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:5955:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKTrace.g:5956:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKTrace.g:5956:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKTrace.g:5956:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0());
                  
            }
            // InternalKTrace.g:5960:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKTrace.g:5961:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKTrace.g:5961:1: (lv_name_1_0= ruleExtendedID )
            // InternalKTrace.g:5962:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPragmaTagAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPragmaTagRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "rulePragmaTag"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // InternalKTrace.g:5986:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalKTrace.g:5987:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalKTrace.g:5988:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // InternalKTrace.g:5995:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:5998:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKTrace.g:5999:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKTrace.g:5999:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKTrace.g:5999:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKTrace.g:6003:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKTrace.g:6004:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKTrace.g:6004:1: (lv_name_1_0= ruleExtendedID )
            // InternalKTrace.g:6005:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:6021:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKTrace.g:6022:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKTrace.g:6022:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKTrace.g:6023:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_64);
            lv_values_2_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:6039:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==37) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // InternalKTrace.g:6039:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKTrace.g:6043:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKTrace.g:6044:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKTrace.g:6044:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKTrace.g:6045:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_64);
            	    lv_values_4_0=ruleEStringAllTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop141;
                }
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
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleRestrictedKeyStringValueAnnotation"
    // InternalKTrace.g:6069:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // InternalKTrace.g:6070:2: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKTrace.g:6071:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRestrictedKeyStringValueAnnotation=ruleRestrictedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedKeyStringValueAnnotation"
    // InternalKTrace.g:6078:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:6081:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalKTrace.g:6082:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKTrace.g:6082:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalKTrace.g:6082:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKTrace.g:6086:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKTrace.g:6087:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKTrace.g:6087:1: (lv_name_1_0= ruleExtendedID )
            // InternalKTrace.g:6088:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_83);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:6104:2: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalKTrace.g:6105:1: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalKTrace.g:6105:1: (lv_values_2_0= ruleEStringBoolean )
            // InternalKTrace.g:6106:3: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_64);
            lv_values_2_0=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:6122:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==37) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // InternalKTrace.g:6122:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_83); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKTrace.g:6126:1: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalKTrace.g:6127:1: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalKTrace.g:6127:1: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalKTrace.g:6128:3: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_64);
            	    lv_values_4_0=ruleEStringBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop142;
                }
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
    // $ANTLR end "ruleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleStringPragma"
    // InternalKTrace.g:6152:1: entryRuleStringPragma returns [EObject current=null] : iv_ruleStringPragma= ruleStringPragma EOF ;
    public final EObject entryRuleStringPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPragma = null;


        try {
            // InternalKTrace.g:6153:2: (iv_ruleStringPragma= ruleStringPragma EOF )
            // InternalKTrace.g:6154:2: iv_ruleStringPragma= ruleStringPragma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringPragmaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringPragma=ruleStringPragma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringPragma; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringPragma"


    // $ANTLR start "ruleStringPragma"
    // InternalKTrace.g:6161:1: ruleStringPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleStringPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:6164:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKTrace.g:6165:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKTrace.g:6165:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKTrace.g:6165:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0());
                  
            }
            // InternalKTrace.g:6169:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKTrace.g:6170:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKTrace.g:6170:1: (lv_name_1_0= ruleExtendedID )
            // InternalKTrace.g:6171:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringPragmaRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:6187:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKTrace.g:6188:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKTrace.g:6188:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKTrace.g:6189:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_64);
            lv_values_2_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringPragmaRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:6205:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop143:
            do {
                int alt143=2;
                int LA143_0 = input.LA(1);

                if ( (LA143_0==37) ) {
                    alt143=1;
                }


                switch (alt143) {
            	case 1 :
            	    // InternalKTrace.g:6205:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKTrace.g:6209:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKTrace.g:6210:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKTrace.g:6210:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKTrace.g:6211:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_64);
            	    lv_values_4_0=ruleEStringAllTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStringPragmaRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop143;
                }
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
    // $ANTLR end "ruleStringPragma"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalKTrace.g:6235:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalKTrace.g:6236:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalKTrace.g:6237:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // InternalKTrace.g:6244:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        AntlrDatatypeRuleToken lv_values_7_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:6247:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKTrace.g:6248:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKTrace.g:6248:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalKTrace.g:6248:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKTrace.g:6252:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKTrace.g:6253:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKTrace.g:6253:1: (lv_name_1_0= ruleExtendedID )
            // InternalKTrace.g:6254:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_84);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKTrace.g:6274:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKTrace.g:6275:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKTrace.g:6275:1: (lv_type_3_0= ruleExtendedID )
            // InternalKTrace.g:6276:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_48);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKTrace.g:6296:1: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalKTrace.g:6297:1: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalKTrace.g:6297:1: (lv_values_5_0= ruleEStringAllTypes )
            // InternalKTrace.g:6298:3: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_64);
            lv_values_5_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_5_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:6314:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==37) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // InternalKTrace.g:6314:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKTrace.g:6318:1: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalKTrace.g:6319:1: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalKTrace.g:6319:1: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalKTrace.g:6320:3: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_64);
            	    lv_values_7_0=ruleEStringAllTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_7_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop144;
                }
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
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleRestrictedTypedKeyStringValueAnnotation"
    // InternalKTrace.g:6344:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKTrace.g:6345:2: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKTrace.g:6346:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRestrictedTypedKeyStringValueAnnotation=ruleRestrictedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedTypedKeyStringValueAnnotation"
    // InternalKTrace.g:6353:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        AntlrDatatypeRuleToken lv_values_7_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:6356:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalKTrace.g:6357:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKTrace.g:6357:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalKTrace.g:6357:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKTrace.g:6361:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKTrace.g:6362:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKTrace.g:6362:1: (lv_name_1_0= ruleExtendedID )
            // InternalKTrace.g:6363:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_84);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKTrace.g:6383:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKTrace.g:6384:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKTrace.g:6384:1: (lv_type_3_0= ruleExtendedID )
            // InternalKTrace.g:6385:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_48);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKTrace.g:6405:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalKTrace.g:6406:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalKTrace.g:6406:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalKTrace.g:6407:3: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_64);
            lv_values_5_0=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_5_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:6423:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==37) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // InternalKTrace.g:6423:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_83); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKTrace.g:6427:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalKTrace.g:6428:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalKTrace.g:6428:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalKTrace.g:6429:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_64);
            	    lv_values_7_0=ruleEStringBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_7_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop145;
                }
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
    // $ANTLR end "ruleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalKTrace.g:6453:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalKTrace.g:6454:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKTrace.g:6455:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuotedKeyStringValueAnnotation=ruleQuotedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQuotedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedKeyStringValueAnnotation"
    // InternalKTrace.g:6462:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:6465:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalKTrace.g:6466:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalKTrace.g:6466:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalKTrace.g:6466:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKTrace.g:6470:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKTrace.g:6471:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKTrace.g:6471:1: (lv_name_1_0= ruleExtendedID )
            // InternalKTrace.g:6472:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_41);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuotedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKTrace.g:6488:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalKTrace.g:6489:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalKTrace.g:6489:1: (lv_values_2_0= RULE_STRING )
            // InternalKTrace.g:6490:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_2_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQuotedKeyStringValueAnnotationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.STRING");
              	    
            }

            }


            }

            // InternalKTrace.g:6506:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop146:
            do {
                int alt146=2;
                int LA146_0 = input.LA(1);

                if ( (LA146_0==37) ) {
                    alt146=1;
                }


                switch (alt146) {
            	case 1 :
            	    // InternalKTrace.g:6506:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKTrace.g:6510:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalKTrace.g:6511:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalKTrace.g:6511:1: (lv_values_4_0= RULE_STRING )
            	    // InternalKTrace.g:6512:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_64); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_values_4_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getQuotedKeyStringValueAnnotationRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop146;
                }
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
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // InternalKTrace.g:6536:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKTrace.g:6537:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKTrace.g:6538:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuotedTypedKeyStringValueAnnotation=ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedTypedKeyStringValueAnnotation"
    // InternalKTrace.g:6545:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;
        Token lv_values_7_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:6548:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalKTrace.g:6549:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalKTrace.g:6549:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalKTrace.g:6549:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKTrace.g:6553:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKTrace.g:6554:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKTrace.g:6554:1: (lv_name_1_0= ruleExtendedID )
            // InternalKTrace.g:6555:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_84);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKTrace.g:6575:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKTrace.g:6576:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKTrace.g:6576:1: (lv_type_3_0= ruleExtendedID )
            // InternalKTrace.g:6577:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_48);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKTrace.g:6597:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalKTrace.g:6598:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalKTrace.g:6598:1: (lv_values_5_0= RULE_STRING )
            // InternalKTrace.g:6599:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_5_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_5_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.STRING");
              	    
            }

            }


            }

            // InternalKTrace.g:6615:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( (LA147_0==37) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // InternalKTrace.g:6615:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKTrace.g:6619:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalKTrace.g:6620:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalKTrace.g:6620:1: (lv_values_7_0= RULE_STRING )
            	    // InternalKTrace.g:6621:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_64); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_values_7_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_6_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"values",
            	              		lv_values_7_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop147;
                }
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
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalKTrace.g:6647:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalKTrace.g:6648:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalKTrace.g:6649:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEStringBoolean=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEStringBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEStringBoolean"


    // $ANTLR start "ruleEStringBoolean"
    // InternalKTrace.g:6656:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:6659:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalKTrace.g:6660:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalKTrace.g:6660:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt148=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt148=1;
                }
                break;
            case RULE_ID:
                {
                alt148=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt148=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;
            }

            switch (alt148) {
                case 1 :
                    // InternalKTrace.g:6660:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKTrace.g:6669:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExtendedID_1=ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExtendedID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKTrace.g:6680:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_2, grammarAccess.getEStringBooleanAccess().getBOOLEANTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleEStringBoolean"


    // $ANTLR start "entryRuleEStringAllTypes"
    // InternalKTrace.g:6695:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // InternalKTrace.g:6696:2: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalKTrace.g:6697:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringAllTypesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEStringAllTypes=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEStringAllTypes.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEStringAllTypes"


    // $ANTLR start "ruleEStringAllTypes"
    // InternalKTrace.g:6704:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;


         enterRule(); 
            
        try {
            // InternalKTrace.g:6707:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalKTrace.g:6708:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalKTrace.g:6708:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt149=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt149=1;
                }
                break;
            case RULE_ID:
                {
                alt149=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt149=3;
                }
                break;
            case 56:
                {
                int LA149_4 = input.LA(2);

                if ( (LA149_4==RULE_INT) ) {
                    alt149=4;
                }
                else if ( (LA149_4==RULE_FLOAT) ) {
                    alt149=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 149, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt149=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt149=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }

            switch (alt149) {
                case 1 :
                    // InternalKTrace.g:6708:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKTrace.g:6717:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExtendedID_1=ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExtendedID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKTrace.g:6728:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_2, grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalKTrace.g:6737:5: this_Integer_3= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Integer_3=ruleInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Integer_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalKTrace.g:6749:5: this_Floateger_4= ruleFloateger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getFloategerParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Floateger_4=ruleFloateger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Floateger_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleEStringAllTypes"


    // $ANTLR start "entryRuleExtendedID"
    // InternalKTrace.g:6767:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalKTrace.g:6768:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalKTrace.g:6769:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // InternalKTrace.g:6776:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // InternalKTrace.g:6779:28: ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) )
            // InternalKTrace.g:6780:1: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            {
            // InternalKTrace.g:6780:1: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            // InternalKTrace.g:6780:6: this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKTrace.g:6787:1: ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )*
            loop151:
            do {
                int alt151=2;
                int LA151_0 = input.LA(1);

                if ( (LA151_0==56) ) {
                    int LA151_2 = input.LA(2);

                    if ( (LA151_2==RULE_ID) ) {
                        alt151=1;
                    }


                }
                else if ( (LA151_0==59) ) {
                    alt151=1;
                }


                switch (alt151) {
            	case 1 :
            	    // InternalKTrace.g:6787:2: (kw= '.' | kw= '-' ) this_ID_3= RULE_ID
            	    {
            	    // InternalKTrace.g:6787:2: (kw= '.' | kw= '-' )
            	    int alt150=2;
            	    int LA150_0 = input.LA(1);

            	    if ( (LA150_0==59) ) {
            	        alt150=1;
            	    }
            	    else if ( (LA150_0==56) ) {
            	        alt150=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 150, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt150) {
            	        case 1 :
            	            // InternalKTrace.g:6788:2: kw= '.'
            	            {
            	            kw=(Token)match(input,59,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalKTrace.g:6795:2: kw= '-'
            	            {
            	            kw=(Token)match(input,56,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_85); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_3, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop151;
                }
            } while (true);

            // InternalKTrace.g:6807:3: (kw= '#' this_INT_5= RULE_INT )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==62) ) {
                int LA152_1 = input.LA(2);

                if ( (LA152_1==RULE_INT) ) {
                    alt152=1;
                }
            }
            switch (alt152) {
                case 1 :
                    // InternalKTrace.g:6808:2: kw= '#' this_INT_5= RULE_INT
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                          
                    }
                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_5, grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
                          
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
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // InternalKTrace.g:6830:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalKTrace.g:6831:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalKTrace.g:6832:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalKTrace.g:6839:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalKTrace.g:6842:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalKTrace.g:6843:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalKTrace.g:6843:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalKTrace.g:6843:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalKTrace.g:6843:2: (kw= '-' )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==56) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalKTrace.g:6844:2: kw= '-'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloateger"
    // InternalKTrace.g:6864:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalKTrace.g:6865:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalKTrace.g:6866:2: iv_ruleFloateger= ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloateger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloateger"


    // $ANTLR start "ruleFloateger"
    // InternalKTrace.g:6873:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // InternalKTrace.g:6876:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalKTrace.g:6877:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalKTrace.g:6877:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalKTrace.g:6877:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalKTrace.g:6877:2: (kw= '-' )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==56) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalKTrace.g:6878:2: kw= '-'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_86); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FLOAT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_FLOAT_1, grammarAccess.getFloategerAccess().getFLOATTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleFloateger"


    // $ANTLR start "ruleSchedulePriorityType"
    // InternalKTrace.g:6898:1: ruleSchedulePriorityType returns [Enumerator current=null] : ( (enumLiteral_0= 'conflict' ) | (enumLiteral_1= 'confluent' ) ) ;
    public final Enumerator ruleSchedulePriorityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalKTrace.g:6900:28: ( ( (enumLiteral_0= 'conflict' ) | (enumLiteral_1= 'confluent' ) ) )
            // InternalKTrace.g:6901:1: ( (enumLiteral_0= 'conflict' ) | (enumLiteral_1= 'confluent' ) )
            {
            // InternalKTrace.g:6901:1: ( (enumLiteral_0= 'conflict' ) | (enumLiteral_1= 'confluent' ) )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==63) ) {
                alt155=1;
            }
            else if ( (LA155_0==64) ) {
                alt155=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // InternalKTrace.g:6901:2: (enumLiteral_0= 'conflict' )
                    {
                    // InternalKTrace.g:6901:2: (enumLiteral_0= 'conflict' )
                    // InternalKTrace.g:6901:4: enumLiteral_0= 'conflict'
                    {
                    enumLiteral_0=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSchedulePriorityTypeAccess().getCONFLICTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSchedulePriorityTypeAccess().getCONFLICTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:6907:6: (enumLiteral_1= 'confluent' )
                    {
                    // InternalKTrace.g:6907:6: (enumLiteral_1= 'confluent' )
                    // InternalKTrace.g:6907:8: enumLiteral_1= 'confluent'
                    {
                    enumLiteral_1=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSchedulePriorityTypeAccess().getCONFLUENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSchedulePriorityTypeAccess().getCONFLUENTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSchedulePriorityType"


    // $ANTLR start "ruleAssignOperator"
    // InternalKTrace.g:6917:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= 'min=' ) | (enumLiteral_10= 'max=' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;

         enterRule(); 
        try {
            // InternalKTrace.g:6919:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= 'min=' ) | (enumLiteral_10= 'max=' ) ) )
            // InternalKTrace.g:6920:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= 'min=' ) | (enumLiteral_10= 'max=' ) )
            {
            // InternalKTrace.g:6920:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= 'min=' ) | (enumLiteral_10= 'max=' ) )
            int alt156=11;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt156=1;
                }
                break;
            case 65:
                {
                alt156=2;
                }
                break;
            case 66:
                {
                alt156=3;
                }
                break;
            case 67:
                {
                alt156=4;
                }
                break;
            case 68:
                {
                alt156=5;
                }
                break;
            case 69:
                {
                alt156=6;
                }
                break;
            case 70:
                {
                alt156=7;
                }
                break;
            case 71:
                {
                alt156=8;
                }
                break;
            case 72:
                {
                alt156=9;
                }
                break;
            case 73:
                {
                alt156=10;
                }
                break;
            case 74:
                {
                alt156=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }

            switch (alt156) {
                case 1 :
                    // InternalKTrace.g:6920:2: (enumLiteral_0= '=' )
                    {
                    // InternalKTrace.g:6920:2: (enumLiteral_0= '=' )
                    // InternalKTrace.g:6920:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:6926:6: (enumLiteral_1= '+=' )
                    {
                    // InternalKTrace.g:6926:6: (enumLiteral_1= '+=' )
                    // InternalKTrace.g:6926:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKTrace.g:6932:6: (enumLiteral_2= '-=' )
                    {
                    // InternalKTrace.g:6932:6: (enumLiteral_2= '-=' )
                    // InternalKTrace.g:6932:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKTrace.g:6938:6: (enumLiteral_3= '*=' )
                    {
                    // InternalKTrace.g:6938:6: (enumLiteral_3= '*=' )
                    // InternalKTrace.g:6938:8: enumLiteral_3= '*='
                    {
                    enumLiteral_3=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKTrace.g:6944:6: (enumLiteral_4= '/=' )
                    {
                    // InternalKTrace.g:6944:6: (enumLiteral_4= '/=' )
                    // InternalKTrace.g:6944:8: enumLiteral_4= '/='
                    {
                    enumLiteral_4=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKTrace.g:6950:6: (enumLiteral_5= '%=' )
                    {
                    // InternalKTrace.g:6950:6: (enumLiteral_5= '%=' )
                    // InternalKTrace.g:6950:8: enumLiteral_5= '%='
                    {
                    enumLiteral_5=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKTrace.g:6956:6: (enumLiteral_6= '&=' )
                    {
                    // InternalKTrace.g:6956:6: (enumLiteral_6= '&=' )
                    // InternalKTrace.g:6956:8: enumLiteral_6= '&='
                    {
                    enumLiteral_6=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKTrace.g:6962:6: (enumLiteral_7= '|=' )
                    {
                    // InternalKTrace.g:6962:6: (enumLiteral_7= '|=' )
                    // InternalKTrace.g:6962:8: enumLiteral_7= '|='
                    {
                    enumLiteral_7=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalKTrace.g:6968:6: (enumLiteral_8= '^=' )
                    {
                    // InternalKTrace.g:6968:6: (enumLiteral_8= '^=' )
                    // InternalKTrace.g:6968:8: enumLiteral_8= '^='
                    {
                    enumLiteral_8=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalKTrace.g:6974:6: (enumLiteral_9= 'min=' )
                    {
                    // InternalKTrace.g:6974:6: (enumLiteral_9= 'min=' )
                    // InternalKTrace.g:6974:8: enumLiteral_9= 'min='
                    {
                    enumLiteral_9=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMINEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignOperatorAccess().getASSIGNMINEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalKTrace.g:6980:6: (enumLiteral_10= 'max=' )
                    {
                    // InternalKTrace.g:6980:6: (enumLiteral_10= 'max=' )
                    // InternalKTrace.g:6980:8: enumLiteral_10= 'max='
                    {
                    enumLiteral_10=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMAXEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getAssignOperatorAccess().getASSIGNMAXEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "ruleAssignOperator"


    // $ANTLR start "rulePostfixOperator"
    // InternalKTrace.g:6990:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalKTrace.g:6992:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalKTrace.g:6993:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalKTrace.g:6993:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==75) ) {
                alt157=1;
            }
            else if ( (LA157_0==76) ) {
                alt157=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;
            }
            switch (alt157) {
                case 1 :
                    // InternalKTrace.g:6993:2: (enumLiteral_0= '++' )
                    {
                    // InternalKTrace.g:6993:2: (enumLiteral_0= '++' )
                    // InternalKTrace.g:6993:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:6999:6: (enumLiteral_1= '--' )
                    {
                    // InternalKTrace.g:6999:6: (enumLiteral_1= '--' )
                    // InternalKTrace.g:6999:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPostfixOperatorAccess().getPOSTFIXSUBEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rulePostfixOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalKTrace.g:7009:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7011:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalKTrace.g:7012:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalKTrace.g:7012:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt158=6;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt158=1;
                }
                break;
            case 48:
                {
                alt158=2;
                }
                break;
            case 78:
                {
                alt158=3;
                }
                break;
            case 49:
                {
                alt158=4;
                }
                break;
            case 79:
                {
                alt158=5;
                }
                break;
            case 80:
                {
                alt158=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }

            switch (alt158) {
                case 1 :
                    // InternalKTrace.g:7012:2: (enumLiteral_0= '==' )
                    {
                    // InternalKTrace.g:7012:2: (enumLiteral_0= '==' )
                    // InternalKTrace.g:7012:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:7018:6: (enumLiteral_1= '<' )
                    {
                    // InternalKTrace.g:7018:6: (enumLiteral_1= '<' )
                    // InternalKTrace.g:7018:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKTrace.g:7024:6: (enumLiteral_2= '<=' )
                    {
                    // InternalKTrace.g:7024:6: (enumLiteral_2= '<=' )
                    // InternalKTrace.g:7024:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKTrace.g:7030:6: (enumLiteral_3= '>' )
                    {
                    // InternalKTrace.g:7030:6: (enumLiteral_3= '>' )
                    // InternalKTrace.g:7030:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKTrace.g:7036:6: (enumLiteral_4= '>=' )
                    {
                    // InternalKTrace.g:7036:6: (enumLiteral_4= '>=' )
                    // InternalKTrace.g:7036:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKTrace.g:7042:6: (enumLiteral_5= '!=' )
                    {
                    // InternalKTrace.g:7042:6: (enumLiteral_5= '!=' )
                    // InternalKTrace.g:7042:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rulePreOperator"
    // InternalKTrace.g:7052:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7054:28: ( (enumLiteral_0= 'pre' ) )
            // InternalKTrace.g:7055:1: (enumLiteral_0= 'pre' )
            {
            // InternalKTrace.g:7055:1: (enumLiteral_0= 'pre' )
            // InternalKTrace.g:7055:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "rulePreOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // InternalKTrace.g:7065:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7067:28: ( (enumLiteral_0= '|' ) )
            // InternalKTrace.g:7068:1: (enumLiteral_0= '|' )
            {
            // InternalKTrace.g:7068:1: (enumLiteral_0= '|' )
            // InternalKTrace.g:7068:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleBitwiseOrOperator"


    // $ANTLR start "ruleBitwiseAndOperator"
    // InternalKTrace.g:7078:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7080:28: ( (enumLiteral_0= '&' ) )
            // InternalKTrace.g:7081:1: (enumLiteral_0= '&' )
            {
            // InternalKTrace.g:7081:1: (enumLiteral_0= '&' )
            // InternalKTrace.g:7081:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleBitwiseAndOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalKTrace.g:7091:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7093:28: ( (enumLiteral_0= '!' ) )
            // InternalKTrace.g:7094:1: (enumLiteral_0= '!' )
            {
            // InternalKTrace.g:7094:1: (enumLiteral_0= '!' )
            // InternalKTrace.g:7094:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleAddOperator"
    // InternalKTrace.g:7104:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7106:28: ( (enumLiteral_0= '+' ) )
            // InternalKTrace.g:7107:1: (enumLiteral_0= '+' )
            {
            // InternalKTrace.g:7107:1: (enumLiteral_0= '+' )
            // InternalKTrace.g:7107:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubOperator"
    // InternalKTrace.g:7117:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7119:28: ( (enumLiteral_0= '-' ) )
            // InternalKTrace.g:7120:1: (enumLiteral_0= '-' )
            {
            // InternalKTrace.g:7120:1: (enumLiteral_0= '-' )
            // InternalKTrace.g:7120:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleSubOperator"


    // $ANTLR start "ruleMultOperator"
    // InternalKTrace.g:7130:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7132:28: ( (enumLiteral_0= '*' ) )
            // InternalKTrace.g:7133:1: (enumLiteral_0= '*' )
            {
            // InternalKTrace.g:7133:1: (enumLiteral_0= '*' )
            // InternalKTrace.g:7133:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleMultOperator"


    // $ANTLR start "ruleModOperator"
    // InternalKTrace.g:7143:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7145:28: ( (enumLiteral_0= '%' ) )
            // InternalKTrace.g:7146:1: (enumLiteral_0= '%' )
            {
            // InternalKTrace.g:7146:1: (enumLiteral_0= '%' )
            // InternalKTrace.g:7146:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleModOperator"


    // $ANTLR start "ruleDivOperator"
    // InternalKTrace.g:7156:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7158:28: ( (enumLiteral_0= '/' ) )
            // InternalKTrace.g:7159:1: (enumLiteral_0= '/' )
            {
            // InternalKTrace.g:7159:1: (enumLiteral_0= '/' )
            // InternalKTrace.g:7159:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleDivOperator"


    // $ANTLR start "ruleValOperator"
    // InternalKTrace.g:7169:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7171:28: ( (enumLiteral_0= 'val' ) )
            // InternalKTrace.g:7172:1: (enumLiteral_0= 'val' )
            {
            // InternalKTrace.g:7172:1: (enumLiteral_0= 'val' )
            // InternalKTrace.g:7172:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleValOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // InternalKTrace.g:7182:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7184:28: ( (enumLiteral_0= '||' ) )
            // InternalKTrace.g:7185:1: (enumLiteral_0= '||' )
            {
            // InternalKTrace.g:7185:1: (enumLiteral_0= '||' )
            // InternalKTrace.g:7185:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // InternalKTrace.g:7195:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7197:28: ( (enumLiteral_0= '&&' ) )
            // InternalKTrace.g:7198:1: (enumLiteral_0= '&&' )
            {
            // InternalKTrace.g:7198:1: (enumLiteral_0= '&&' )
            // InternalKTrace.g:7198:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleValueType"
    // InternalKTrace.g:7212:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7214:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // InternalKTrace.g:7215:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // InternalKTrace.g:7215:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt159=7;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt159=1;
                }
                break;
            case 84:
                {
                alt159=2;
                }
                break;
            case 85:
                {
                alt159=3;
                }
                break;
            case 86:
                {
                alt159=4;
                }
                break;
            case 87:
                {
                alt159=5;
                }
                break;
            case 88:
                {
                alt159=6;
                }
                break;
            case 89:
                {
                alt159=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }

            switch (alt159) {
                case 1 :
                    // InternalKTrace.g:7215:2: (enumLiteral_0= 'pure' )
                    {
                    // InternalKTrace.g:7215:2: (enumLiteral_0= 'pure' )
                    // InternalKTrace.g:7215:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,83,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:7221:6: (enumLiteral_1= 'bool' )
                    {
                    // InternalKTrace.g:7221:6: (enumLiteral_1= 'bool' )
                    // InternalKTrace.g:7221:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,84,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKTrace.g:7227:6: (enumLiteral_2= 'unsigned' )
                    {
                    // InternalKTrace.g:7227:6: (enumLiteral_2= 'unsigned' )
                    // InternalKTrace.g:7227:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,85,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKTrace.g:7233:6: (enumLiteral_3= 'int' )
                    {
                    // InternalKTrace.g:7233:6: (enumLiteral_3= 'int' )
                    // InternalKTrace.g:7233:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,86,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKTrace.g:7239:6: (enumLiteral_4= 'float' )
                    {
                    // InternalKTrace.g:7239:6: (enumLiteral_4= 'float' )
                    // InternalKTrace.g:7239:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,87,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKTrace.g:7245:6: (enumLiteral_5= 'string' )
                    {
                    // InternalKTrace.g:7245:6: (enumLiteral_5= 'string' )
                    // InternalKTrace.g:7245:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,88,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKTrace.g:7251:6: (enumLiteral_6= 'host' )
                    {
                    // InternalKTrace.g:7251:6: (enumLiteral_6= 'host' )
                    // InternalKTrace.g:7251:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,89,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleCombineOperator"
    // InternalKTrace.g:7263:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // InternalKTrace.g:7265:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // InternalKTrace.g:7266:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // InternalKTrace.g:7266:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt160=8;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt160=1;
                }
                break;
            case 55:
                {
                alt160=2;
                }
                break;
            case 57:
                {
                alt160=3;
                }
                break;
            case 91:
                {
                alt160=4;
                }
                break;
            case 92:
                {
                alt160=5;
                }
                break;
            case 53:
                {
                alt160=6;
                }
                break;
            case 54:
                {
                alt160=7;
                }
                break;
            case 89:
                {
                alt160=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;
            }

            switch (alt160) {
                case 1 :
                    // InternalKTrace.g:7266:2: (enumLiteral_0= 'none' )
                    {
                    // InternalKTrace.g:7266:2: (enumLiteral_0= 'none' )
                    // InternalKTrace.g:7266:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,90,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKTrace.g:7272:6: (enumLiteral_1= '+' )
                    {
                    // InternalKTrace.g:7272:6: (enumLiteral_1= '+' )
                    // InternalKTrace.g:7272:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKTrace.g:7278:6: (enumLiteral_2= '*' )
                    {
                    // InternalKTrace.g:7278:6: (enumLiteral_2= '*' )
                    // InternalKTrace.g:7278:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKTrace.g:7284:6: (enumLiteral_3= 'max' )
                    {
                    // InternalKTrace.g:7284:6: (enumLiteral_3= 'max' )
                    // InternalKTrace.g:7284:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,91,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKTrace.g:7290:6: (enumLiteral_4= 'min' )
                    {
                    // InternalKTrace.g:7290:6: (enumLiteral_4= 'min' )
                    // InternalKTrace.g:7290:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,92,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKTrace.g:7296:6: (enumLiteral_5= '|' )
                    {
                    // InternalKTrace.g:7296:6: (enumLiteral_5= '|' )
                    // InternalKTrace.g:7296:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKTrace.g:7302:6: (enumLiteral_6= '&' )
                    {
                    // InternalKTrace.g:7302:6: (enumLiteral_6= '&' )
                    // InternalKTrace.g:7302:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKTrace.g:7308:6: (enumLiteral_7= 'host' )
                    {
                    // InternalKTrace.g:7308:6: (enumLiteral_7= 'host' )
                    // InternalKTrace.g:7308:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,89,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "ruleCombineOperator"

    // $ANTLR start synpred12_InternalKTrace
    public final void synpred12_InternalKTrace_fragment() throws RecognitionException {   
        EObject lv_pragmas_0_0 = null;


        // InternalKTrace.g:429:1: ( (lv_pragmas_0_0= rulePragma ) )
        // InternalKTrace.g:429:1: (lv_pragmas_0_0= rulePragma )
        {
        // InternalKTrace.g:429:1: (lv_pragmas_0_0= rulePragma )
        // InternalKTrace.g:430:3: lv_pragmas_0_0= rulePragma
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getKTracesAccess().getPragmasPragmaParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_pragmas_0_0=rulePragma();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalKTrace

    // $ANTLR start synpred29_InternalKTrace
    public final void synpred29_InternalKTrace_fragment() throws RecognitionException {   
        EObject lv_expression_0_0 = null;


        // InternalKTrace.g:866:2: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) )
        // InternalKTrace.g:866:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
        {
        // InternalKTrace.g:866:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
        // InternalKTrace.g:867:1: (lv_expression_0_0= ruleAnnotatedExpression )
        {
        // InternalKTrace.g:867:1: (lv_expression_0_0= ruleAnnotatedExpression )
        // InternalKTrace.g:868:3: lv_expression_0_0= ruleAnnotatedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTestEntityAccess().getExpressionAnnotatedExpressionParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_expression_0_0=ruleAnnotatedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred29_InternalKTrace

    // $ANTLR start synpred74_InternalKTrace
    public final void synpred74_InternalKTrace_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // InternalKTrace.g:2298:2: (this_Assignment_0= ruleAssignment )
        // InternalKTrace.g:2298:2: this_Assignment_0= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_Assignment_0=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_InternalKTrace

    // $ANTLR start synpred75_InternalKTrace
    public final void synpred75_InternalKTrace_fragment() throws RecognitionException {   
        EObject this_PostfixEffect_1 = null;


        // InternalKTrace.g:2311:2: (this_PostfixEffect_1= rulePostfixEffect )
        // InternalKTrace.g:2311:2: this_PostfixEffect_1= rulePostfixEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_PostfixEffect_1=rulePostfixEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_InternalKTrace

    // $ANTLR start synpred76_InternalKTrace
    public final void synpred76_InternalKTrace_fragment() throws RecognitionException {   
        EObject this_Emission_2 = null;


        // InternalKTrace.g:2324:2: (this_Emission_2= ruleEmission )
        // InternalKTrace.g:2324:2: this_Emission_2= ruleEmission
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_Emission_2=ruleEmission();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_InternalKTrace

    // $ANTLR start synpred77_InternalKTrace
    public final void synpred77_InternalKTrace_fragment() throws RecognitionException {   
        EObject this_HostcodeEffect_3 = null;


        // InternalKTrace.g:2337:2: (this_HostcodeEffect_3= ruleHostcodeEffect )
        // InternalKTrace.g:2337:2: this_HostcodeEffect_3= ruleHostcodeEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_HostcodeEffect_3=ruleHostcodeEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_InternalKTrace

    // $ANTLR start synpred78_InternalKTrace
    public final void synpred78_InternalKTrace_fragment() throws RecognitionException {   
        EObject this_ReferenceCallEffect_4 = null;


        // InternalKTrace.g:2350:2: (this_ReferenceCallEffect_4= ruleReferenceCallEffect )
        // InternalKTrace.g:2350:2: this_ReferenceCallEffect_4= ruleReferenceCallEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ReferenceCallEffect_4=ruleReferenceCallEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred78_InternalKTrace

    // $ANTLR start synpred79_InternalKTrace
    public final void synpred79_InternalKTrace_fragment() throws RecognitionException {   
        EObject this_FunctionCallEffect_5 = null;


        // InternalKTrace.g:2363:2: (this_FunctionCallEffect_5= ruleFunctionCallEffect )
        // InternalKTrace.g:2363:2: this_FunctionCallEffect_5= ruleFunctionCallEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_FunctionCallEffect_5=ruleFunctionCallEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_InternalKTrace

    // $ANTLR start synpred104_InternalKTrace
    public final void synpred104_InternalKTrace_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKTrace.g:3226:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKTrace.g:3226:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_InternalKTrace

    // $ANTLR start synpred106_InternalKTrace
    public final void synpred106_InternalKTrace_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_schedule_3_0 = null;


        // InternalKTrace.g:3250:4: (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )
        // InternalKTrace.g:3250:4: otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+
        {
        otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_35); if (state.failed) return ;
        // InternalKTrace.g:3254:1: ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+
        int cnt177=0;
        loop177:
        do {
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==RULE_ID) ) {
                alt177=1;
            }


            switch (alt177) {
        	case 1 :
        	    // InternalKTrace.g:3255:1: (lv_schedule_3_0= ruleScheduleObjectReference )
        	    {
        	    // InternalKTrace.g:3255:1: (lv_schedule_3_0= ruleScheduleObjectReference )
        	    // InternalKTrace.g:3256:3: lv_schedule_3_0= ruleScheduleObjectReference
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getExpressionAccess().getScheduleScheduleObjectReferenceParserRuleCall_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_schedule_3_0=ruleScheduleObjectReference();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt177 >= 1 ) break loop177;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(177, input);
                    throw eee;
            }
            cnt177++;
        } while (true);


        }
    }
    // $ANTLR end synpred106_InternalKTrace

    // $ANTLR start synpred115_InternalKTrace
    public final void synpred115_InternalKTrace_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // InternalKTrace.g:3738:2: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        // InternalKTrace.g:3738:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        {
        // InternalKTrace.g:3738:2: ()
        // InternalKTrace.g:3739:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // InternalKTrace.g:3747:2: ( (lv_operator_2_0= ruleCompareOperator ) )
        // InternalKTrace.g:3748:1: (lv_operator_2_0= ruleCompareOperator )
        {
        // InternalKTrace.g:3748:1: (lv_operator_2_0= ruleCompareOperator )
        // InternalKTrace.g:3749:3: lv_operator_2_0= ruleCompareOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_29);
        lv_operator_2_0=ruleCompareOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKTrace.g:3765:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        // InternalKTrace.g:3766:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        {
        // InternalKTrace.g:3766:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        // InternalKTrace.g:3767:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_3_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred115_InternalKTrace

    // $ANTLR start synpred116_InternalKTrace
    public final void synpred116_InternalKTrace_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalKTrace.g:3805:2: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalKTrace.g:3805:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred116_InternalKTrace

    // $ANTLR start synpred124_InternalKTrace
    public final void synpred124_InternalKTrace_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKTrace.g:4319:5: (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )
        // InternalKTrace.g:4319:5: otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) )
        {
        otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_71); if (state.failed) return ;
        // InternalKTrace.g:4323:1: ( (lv_subExpressions_5_0= ruleModExpression ) )
        // InternalKTrace.g:4324:1: (lv_subExpressions_5_0= ruleModExpression )
        {
        // InternalKTrace.g:4324:1: (lv_subExpressions_5_0= ruleModExpression )
        // InternalKTrace.g:4325:3: lv_subExpressions_5_0= ruleModExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleModExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred124_InternalKTrace

    // $ANTLR start synpred125_InternalKTrace
    public final void synpred125_InternalKTrace_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKTrace.g:4274:2: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )
        // InternalKTrace.g:4274:2: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
        {
        // InternalKTrace.g:4274:2: ()
        // InternalKTrace.g:4275:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // InternalKTrace.g:4283:2: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )
        // InternalKTrace.g:4283:3: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
        {
        // InternalKTrace.g:4283:3: ( (lv_operator_2_0= ruleDivOperator ) )
        // InternalKTrace.g:4284:1: (lv_operator_2_0= ruleDivOperator )
        {
        // InternalKTrace.g:4284:1: (lv_operator_2_0= ruleDivOperator )
        // InternalKTrace.g:4285:3: lv_operator_2_0= ruleDivOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_71);
        lv_operator_2_0=ruleDivOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKTrace.g:4301:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
        // InternalKTrace.g:4302:1: (lv_subExpressions_3_0= ruleModExpression )
        {
        // InternalKTrace.g:4302:1: (lv_subExpressions_3_0= ruleModExpression )
        // InternalKTrace.g:4303:3: lv_subExpressions_3_0= ruleModExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_74);
        lv_subExpressions_3_0=ruleModExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalKTrace.g:4319:3: (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
        loop185:
        do {
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==26) ) {
                alt185=1;
            }


            switch (alt185) {
        	case 1 :
        	    // InternalKTrace.g:4319:5: otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) )
        	    {
        	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_71); if (state.failed) return ;
        	    // InternalKTrace.g:4323:1: ( (lv_subExpressions_5_0= ruleModExpression ) )
        	    // InternalKTrace.g:4324:1: (lv_subExpressions_5_0= ruleModExpression )
        	    {
        	    // InternalKTrace.g:4324:1: (lv_subExpressions_5_0= ruleModExpression )
        	    // InternalKTrace.g:4325:3: lv_subExpressions_5_0= ruleModExpression
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_74);
        	    lv_subExpressions_5_0=ruleModExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop185;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred125_InternalKTrace

    // $ANTLR start synpred138_InternalKTrace
    public final void synpred138_InternalKTrace_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_ValuedExpression_5 = null;


        // InternalKTrace.g:4699:6: ( (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) )
        // InternalKTrace.g:4699:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        {
        // InternalKTrace.g:4699:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        // InternalKTrace.g:4699:8: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
        {
        otherlv_4=(Token)match(input,45,FollowSets000.FOLLOW_71); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_52);
        this_ValuedExpression_5=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred138_InternalKTrace

    // Delegated rules

    public final boolean synpred75_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred116_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred124_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred124_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_InternalKTrace() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_InternalKTrace_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA98 dfa98 = new DFA98(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA99 dfa99 = new DFA99(this);
    protected DFA109 dfa109 = new DFA109(this);
    protected DFA110 dfa110 = new DFA110(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA123 dfa123 = new DFA123(this);
    protected DFA124 dfa124 = new DFA124(this);
    protected DFA138 dfa138 = new DFA138(this);
    protected DFA139 dfa139 = new DFA139(this);
    protected DFA140 dfa140 = new DFA140(this);
    static final String dfa_1s = "\134\uffff";
    static final String dfa_2s = "\1\3\12\uffff\1\3\120\uffff";
    static final String dfa_3s = "\3\4\1\uffff\1\4\1\uffff\3\4\1\6\13\4\1\6\4\4\1\53\1\6\3\4\1\6\11\4\1\6\3\4\1\6\3\4\1\6\3\4\2\53\3\4\1\6\6\4\1\53\3\4\1\6\3\4\1\6\4\4\1\6\5\4\2\53\3\4\1\6\2\4";
    static final String dfa_4s = "\2\131\1\4\1\uffff\1\5\1\uffff\1\131\1\4\1\10\1\6\5\131\1\4\2\131\1\70\2\4\1\6\1\70\1\4\1\131\1\4\1\76\1\10\3\131\1\10\5\131\1\100\1\131\2\4\1\6\1\70\2\4\1\6\1\100\1\4\1\10\1\6\2\131\1\4\1\76\1\53\3\131\1\10\6\131\1\76\1\70\2\4\1\6\1\70\2\4\1\6\1\70\3\131\1\10\5\131\1\76\1\53\1\131\2\4\1\6\2\131";
    static final String dfa_5s = "\3\uffff\1\2\1\uffff\1\1\126\uffff";
    static final String dfa_6s = "\134\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\2\uffff\1\3\2\uffff\1\1\21\uffff\1\3\2\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\1\3\12\uffff\1\2\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\1\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\2\25\uffff\7\5",
            "\1\6",
            "",
            "\1\3\1\5",
            "",
            "\1\13\1\12\1\15\1\3\1\16\1\14\1\1\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\1\uffff\1\17\7\uffff\1\3\5\uffff\1\10\2\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\5",
            "\1\20",
            "\1\20\1\uffff\1\15\1\uffff\1\16",
            "\1\21",
            "\1\3\2\uffff\1\3\2\uffff\1\1\24\uffff\1\3\5\5\1\22\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\2\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\1\16\uffff\1\3\2\uffff\1\3\2\uffff\1\3\5\5\1\26\1\5\1\4\1\27\1\uffff\1\3\2\uffff\1\3\1\uffff\2\3\1\uffff\1\3\5\uffff\1\24\1\uffff\1\3\1\23\1\uffff\1\2\1\25\2\uffff\14\3\6\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\26\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\26\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\26\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\32",
            "\1\13\1\12\1\15\1\3\1\16\1\14\1\1\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\1\uffff\1\17\7\uffff\1\3\5\uffff\1\10\2\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\5",
            "\1\13\1\12\1\15\1\3\1\16\1\14\1\1\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\1\uffff\1\17\7\uffff\1\3\5\uffff\1\33\4\uffff\1\2\25\uffff\7\5",
            "\1\35\1\34\1\40\1\uffff\1\41\1\36\56\uffff\1\37",
            "\1\42",
            "\1\42",
            "\1\43",
            "\1\35\1\44\1\40\1\uffff\1\41\1\36\56\uffff\1\37",
            "\1\45",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\46",
            "\1\52\14\uffff\1\50\2\uffff\1\47\2\uffff\1\51",
            "\1\15\1\uffff\1\16",
            "\1\3\2\uffff\1\3\2\uffff\1\1\24\uffff\1\3\5\5\1\22\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\2\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\26\1\5\1\4\1\5\11\uffff\1\3\5\uffff\1\54\2\uffff\1\53\1\uffff\1\31\1\55\24\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\26\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\40\1\uffff\1\41",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\26\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\26\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\26\1\5\1\4\1\5\11\uffff\1\3\5\uffff\1\24\2\uffff\1\23\1\uffff\1\31\1\25\24\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\26\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\26\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\5\1\uffff\1\3\3\uffff\1\5\36\uffff\1\5\20\uffff\1\56\2\uffff\1\5\1\uffff\2\5",
            "\1\63\1\62\1\15\1\3\1\16\1\14\1\30\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\1\uffff\1\64\7\uffff\1\3\5\uffff\1\60\2\uffff\1\57\1\uffff\1\31\1\61\24\uffff\7\5",
            "\1\65",
            "\1\65",
            "\1\66",
            "\1\70\1\67\1\73\1\uffff\1\74\1\71\56\uffff\1\72",
            "\1\75",
            "\1\75",
            "\1\76",
            "\1\5\1\uffff\1\3\3\uffff\1\5\36\uffff\1\5\20\uffff\1\56\2\uffff\1\5\1\uffff\2\5",
            "\1\77",
            "\1\77\1\uffff\1\15\1\uffff\1\16",
            "\1\100",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\26\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\16\uffff\1\3\5\uffff\1\3\5\5\1\26\1\5\1\4\1\5\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\5\uffff\1\24\1\uffff\1\3\1\23\1\uffff\1\31\1\25\2\uffff\14\3\6\uffff\7\5",
            "\1\101",
            "\1\52\14\uffff\1\50\2\uffff\1\47\2\uffff\1\51",
            "\1\52",
            "\1\3\2\uffff\1\3\2\uffff\1\1\24\uffff\1\3\5\5\1\102\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\2\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\106\1\5\1\4\1\5\11\uffff\1\3\5\uffff\1\104\2\uffff\1\103\1\uffff\1\31\1\105\24\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\106\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\73\1\uffff\1\74",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\106\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\106\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\26\1\5\1\4\1\5\11\uffff\1\3\5\uffff\1\54\2\uffff\1\53\1\uffff\1\31\1\55\24\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\26\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\63\1\62\1\15\1\3\1\16\1\14\1\30\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\1\uffff\1\64\7\uffff\1\3\5\uffff\1\60\2\uffff\1\57\1\uffff\1\31\1\61\24\uffff\7\5",
            "\1\63\1\62\1\15\1\3\1\16\1\14\1\30\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\1\uffff\1\64\7\uffff\1\3\5\uffff\1\33\4\uffff\1\31\25\uffff\7\5",
            "\1\112\14\uffff\1\110\2\uffff\1\107\2\uffff\1\111",
            "\1\114\1\113\1\117\1\uffff\1\120\1\115\56\uffff\1\116",
            "\1\121",
            "\1\121",
            "\1\122",
            "\1\114\1\123\1\117\1\uffff\1\120\1\115\56\uffff\1\116",
            "\1\124",
            "\1\124",
            "\1\125",
            "\1\70\1\126\1\73\1\uffff\1\74\1\71\56\uffff\1\72",
            "\1\3\2\uffff\1\3\2\uffff\1\1\24\uffff\1\3\5\5\1\102\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\2\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\106\1\5\1\4\1\5\11\uffff\1\3\5\uffff\1\130\2\uffff\1\127\1\uffff\1\31\1\131\24\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\106\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\117\1\uffff\1\120",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\106\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\106\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\106\1\5\1\4\1\5\11\uffff\1\3\5\uffff\1\104\2\uffff\1\103\1\uffff\1\31\1\105\24\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\106\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\106\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\112\14\uffff\1\110\2\uffff\1\107\2\uffff\1\111",
            "\1\112",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\106\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5",
            "\1\132",
            "\1\132",
            "\1\133",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\106\1\5\1\4\1\5\11\uffff\1\3\5\uffff\1\130\2\uffff\1\127\1\uffff\1\31\1\131\24\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\30\24\uffff\1\3\5\5\1\106\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\31\25\uffff\7\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 673:2: ( (lv_declarations_1_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_8s = "\3\4\1\uffff\1\4\1\uffff\3\4\1\6\10\4\1\53\4\4\1\6\3\4\1\6\2\4\1\6\4\4\1\6\7\4\2\53\3\4\1\6\4\4\1\6\3\4\1\6\6\4\1\6\5\4\1\53\3\4\1\6\7\4\1\6\3\4\1\6\2\53\3\4";
    static final String dfa_9s = "\2\131\1\4\1\uffff\1\5\1\uffff\1\131\1\4\1\10\1\6\1\4\7\131\1\76\1\70\3\4\1\6\1\70\1\131\1\4\1\10\2\4\1\6\1\70\3\131\1\10\2\131\1\100\4\131\1\76\1\53\3\131\1\10\2\131\2\4\1\6\1\100\1\4\1\10\1\6\2\131\1\4\1\70\2\4\1\6\1\70\4\131\1\76\3\131\1\10\5\131\2\4\1\6\1\70\2\4\1\6\1\76\1\53\3\131";
    static final String[] dfa_10s = {
            "\1\3\2\uffff\1\3\2\uffff\1\1\21\uffff\1\3\1\uffff\2\3\5\5\1\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\1\3\12\uffff\1\2\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\1\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\2\25\uffff\7\5",
            "\1\6",
            "",
            "\1\3\1\5",
            "",
            "\1\14\1\13\1\16\1\3\1\17\1\15\1\1\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\1\uffff\1\12\7\uffff\1\3\5\uffff\1\10\2\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\5",
            "\1\20",
            "\1\20\1\uffff\1\16\1\uffff\1\17",
            "\1\21",
            "\1\22",
            "\1\3\2\uffff\1\3\2\uffff\1\1\24\uffff\1\3\5\5\1\23\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\2\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\1\16\uffff\1\3\2\uffff\1\3\1\uffff\2\3\5\5\1\30\1\5\1\4\1\24\1\uffff\1\3\2\uffff\1\3\1\uffff\2\3\1\uffff\1\3\5\uffff\1\26\1\uffff\1\3\1\25\1\uffff\1\2\1\27\2\uffff\14\3\6\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\30\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\30\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\30\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\14\1\13\1\16\1\3\1\17\1\15\1\1\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\1\uffff\1\12\7\uffff\1\3\5\uffff\1\10\2\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\5",
            "\1\14\1\13\1\16\1\3\1\17\1\15\1\1\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\1\uffff\1\12\7\uffff\1\3\5\uffff\1\33\4\uffff\1\2\25\uffff\7\5",
            "\1\37\14\uffff\1\35\2\uffff\1\34\2\uffff\1\36",
            "\1\41\1\40\1\44\1\uffff\1\45\1\42\56\uffff\1\43",
            "\1\46",
            "\1\47",
            "\1\47",
            "\1\50",
            "\1\41\1\51\1\44\1\uffff\1\45\1\42\56\uffff\1\43",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\52",
            "\1\16\1\uffff\1\17",
            "\1\53",
            "\1\53",
            "\1\54",
            "\1\56\1\55\1\61\1\uffff\1\62\1\57\56\uffff\1\60",
            "\1\3\2\uffff\1\3\2\uffff\1\1\24\uffff\1\3\5\5\1\23\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\2\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\30\1\5\1\4\1\5\11\uffff\1\3\5\uffff\1\64\2\uffff\1\63\1\uffff\1\32\1\65\24\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\30\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\44\1\uffff\1\45",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\30\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\30\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\5\1\uffff\1\3\3\uffff\1\5\36\uffff\1\5\20\uffff\1\66\2\uffff\1\5\1\uffff\2\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\30\1\5\1\4\1\5\11\uffff\1\3\5\uffff\1\26\2\uffff\1\25\1\uffff\1\32\1\27\24\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\30\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\30\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\73\1\72\1\16\1\3\1\17\1\15\1\31\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\1\uffff\1\74\7\uffff\1\3\5\uffff\1\70\2\uffff\1\67\1\uffff\1\32\1\71\24\uffff\7\5",
            "\1\37\14\uffff\1\35\2\uffff\1\34\2\uffff\1\36",
            "\1\37",
            "\1\3\2\uffff\1\3\2\uffff\1\1\24\uffff\1\3\5\5\1\75\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\2\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\101\1\5\1\4\1\5\11\uffff\1\3\5\uffff\1\77\2\uffff\1\76\1\uffff\1\32\1\100\24\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\101\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\61\1\uffff\1\62",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\101\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\101\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\102",
            "\1\102",
            "\1\103",
            "\1\5\1\uffff\1\3\3\uffff\1\5\36\uffff\1\5\20\uffff\1\66\2\uffff\1\5\1\uffff\2\5",
            "\1\104",
            "\1\104\1\uffff\1\16\1\uffff\1\17",
            "\1\105",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\30\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\16\uffff\1\3\5\uffff\1\3\5\5\1\30\1\5\1\4\1\5\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\5\uffff\1\26\1\uffff\1\3\1\25\1\uffff\1\32\1\27\2\uffff\14\3\6\uffff\7\5",
            "\1\106",
            "\1\110\1\107\1\113\1\uffff\1\114\1\111\56\uffff\1\112",
            "\1\115",
            "\1\115",
            "\1\116",
            "\1\110\1\117\1\113\1\uffff\1\114\1\111\56\uffff\1\112",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\30\1\5\1\4\1\5\11\uffff\1\3\5\uffff\1\64\2\uffff\1\63\1\uffff\1\32\1\65\24\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\30\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\73\1\72\1\16\1\3\1\17\1\15\1\31\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\1\uffff\1\74\7\uffff\1\3\5\uffff\1\70\2\uffff\1\67\1\uffff\1\32\1\71\24\uffff\7\5",
            "\1\73\1\72\1\16\1\3\1\17\1\15\1\31\24\uffff\1\3\5\5\1\uffff\1\5\1\4\1\5\1\uffff\1\74\7\uffff\1\3\5\uffff\1\33\4\uffff\1\32\25\uffff\7\5",
            "\1\123\14\uffff\1\121\2\uffff\1\120\2\uffff\1\122",
            "\1\3\2\uffff\1\3\2\uffff\1\1\24\uffff\1\3\5\5\1\75\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\2\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\101\1\5\1\4\1\5\11\uffff\1\3\5\uffff\1\125\2\uffff\1\124\1\uffff\1\32\1\126\24\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\101\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\113\1\uffff\1\114",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\101\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\101\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\101\1\5\1\4\1\5\11\uffff\1\3\5\uffff\1\77\2\uffff\1\76\1\uffff\1\32\1\100\24\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\101\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\101\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\127",
            "\1\127",
            "\1\130",
            "\1\56\1\131\1\61\1\uffff\1\62\1\57\56\uffff\1\60",
            "\1\132",
            "\1\132",
            "\1\133",
            "\1\123\14\uffff\1\121\2\uffff\1\120\2\uffff\1\122",
            "\1\123",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\101\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\101\1\5\1\4\1\5\11\uffff\1\3\5\uffff\1\125\2\uffff\1\124\1\uffff\1\32\1\126\24\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\31\24\uffff\1\3\5\5\1\101\1\5\1\4\1\5\11\uffff\1\3\12\uffff\1\32\25\uffff\7\5"
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "()* loopback of 783:1: ( (lv_declarations_3_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_11s = "\130\uffff";
    static final String dfa_12s = "\3\4\2\uffff\3\4\1\6\2\4\1\0\5\4\1\53\4\4\1\6\2\4\1\6\4\4\1\6\4\4\2\53\3\4\1\6\4\4\1\6\2\4\1\6\6\4\1\6\5\4\1\53\2\4\1\6\3\4\1\6\7\4\1\6\5\4\1\6\2\53\3\4";
    static final String dfa_13s = "\2\75\1\4\2\uffff\1\76\1\4\1\10\1\6\1\4\1\75\1\0\3\75\1\76\1\75\1\76\2\70\1\75\1\4\1\10\2\4\1\6\1\70\1\75\1\76\1\75\1\10\3\75\2\76\1\53\1\75\1\76\1\75\1\10\2\75\2\4\1\6\1\4\1\10\1\6\1\4\1\75\1\114\1\70\2\4\1\6\1\70\1\76\1\75\1\76\1\75\1\76\2\4\1\6\1\75\1\76\1\75\1\10\2\75\1\76\2\75\2\4\1\6\1\70\1\76\1\75\2\4\1\6\1\76\1\53\1\75\1\76\1\75";
    static final String dfa_14s = "\3\uffff\1\1\1\2\123\uffff";
    static final String dfa_15s = "\13\uffff\1\0\114\uffff}>";
    static final String[] dfa_16s = {
            "\1\4\2\uffff\1\4\2\uffff\1\1\24\uffff\1\3\7\uffff\1\4\10\uffff\1\4\1\uffff\1\4\12\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\1\24\uffff\1\3\7\uffff\1\4\12\uffff\1\4\12\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\13\1\12\1\15\1\4\1\16\1\14\1\1\24\uffff\1\3\7\uffff\1\4\2\uffff\1\11\7\uffff\1\4\5\uffff\1\7\2\uffff\1\6\1\uffff\1\2\1\10",
            "\1\17",
            "\1\17\1\uffff\1\15\1\uffff\1\16",
            "\1\20",
            "\1\21",
            "\1\4\2\uffff\1\4\2\uffff\1\1\24\uffff\1\3\5\uffff\1\22\1\uffff\1\4\12\uffff\1\4\12\uffff\1\2",
            "\1\uffff",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\23\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\23\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\23\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\13\1\12\1\15\1\4\1\16\1\14\1\1\24\uffff\1\3\7\uffff\1\4\2\uffff\1\11\7\uffff\1\4\5\uffff\1\7\2\uffff\1\6\1\uffff\1\2\1\10",
            "\1\13\1\12\1\15\1\4\1\16\1\14\1\1\24\uffff\1\3\7\uffff\1\4\2\uffff\1\11\7\uffff\1\4\5\uffff\1\26\4\uffff\1\2",
            "\1\32\14\uffff\1\30\2\uffff\1\27\2\uffff\1\31",
            "\1\34\1\33\1\37\1\uffff\1\40\1\35\56\uffff\1\36",
            "\1\34\1\41\1\37\1\uffff\1\40\1\35\56\uffff\1\36",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\7\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\42",
            "\1\15\1\uffff\1\16",
            "\1\43",
            "\1\43",
            "\1\44",
            "\1\46\1\45\1\51\1\uffff\1\52\1\47\56\uffff\1\50",
            "\1\4\2\uffff\1\4\2\uffff\1\1\24\uffff\1\3\5\uffff\1\22\1\uffff\1\4\12\uffff\1\4\12\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\23\1\uffff\1\4\12\uffff\1\4\5\uffff\1\54\2\uffff\1\53\1\uffff\1\25\1\55",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\23\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\37\1\uffff\1\40",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\23\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\23\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\23\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\63\1\62\1\15\1\4\1\16\1\14\1\24\24\uffff\1\3\7\uffff\1\4\2\uffff\1\61\7\uffff\1\4\5\uffff\1\57\2\uffff\1\56\1\uffff\1\25\1\60",
            "\1\32\14\uffff\1\30\2\uffff\1\27\2\uffff\1\31",
            "\1\32",
            "\1\4\2\uffff\1\4\2\uffff\1\1\24\uffff\1\3\5\uffff\1\64\1\uffff\1\4\12\uffff\1\4\12\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\70\1\uffff\1\4\12\uffff\1\4\5\uffff\1\66\2\uffff\1\65\1\uffff\1\25\1\67",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\70\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\51\1\uffff\1\52",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\70\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\70\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\71",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\73\1\uffff\1\15\1\uffff\1\16",
            "\1\74",
            "\1\75",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\23\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\16\uffff\1\4\5\uffff\1\3\5\uffff\1\23\1\uffff\1\4\2\uffff\1\4\2\uffff\1\4\1\uffff\1\4\2\uffff\1\4\5\uffff\1\77\1\uffff\1\4\1\76\1\uffff\1\25\1\100\2\uffff\14\4",
            "\1\102\1\101\1\105\1\uffff\1\106\1\103\56\uffff\1\104",
            "\1\107",
            "\1\107",
            "\1\110",
            "\1\102\1\111\1\105\1\uffff\1\106\1\103\56\uffff\1\104",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\23\1\uffff\1\4\12\uffff\1\4\5\uffff\1\54\2\uffff\1\53\1\uffff\1\25\1\55",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\23\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\63\1\62\1\15\1\4\1\16\1\14\1\24\24\uffff\1\3\7\uffff\1\4\2\uffff\1\61\7\uffff\1\4\5\uffff\1\57\2\uffff\1\56\1\uffff\1\25\1\60",
            "\1\63\1\62\1\15\1\4\1\16\1\14\1\24\24\uffff\1\3\7\uffff\1\4\2\uffff\1\61\7\uffff\1\4\5\uffff\1\26\4\uffff\1\25",
            "\1\115\14\uffff\1\113\2\uffff\1\112\2\uffff\1\114",
            "\1\116",
            "\1\116",
            "\1\117",
            "\1\4\2\uffff\1\4\2\uffff\1\1\24\uffff\1\3\5\uffff\1\64\1\uffff\1\4\12\uffff\1\4\12\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\70\1\uffff\1\4\12\uffff\1\4\5\uffff\1\121\2\uffff\1\120\1\uffff\1\25\1\122",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\70\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\105\1\uffff\1\106",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\70\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\70\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\70\1\uffff\1\4\12\uffff\1\4\5\uffff\1\66\2\uffff\1\65\1\uffff\1\25\1\67",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\70\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\70\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\123",
            "\1\123",
            "\1\124",
            "\1\46\1\125\1\51\1\uffff\1\52\1\47\56\uffff\1\50",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\23\1\uffff\1\4\12\uffff\1\4\5\uffff\1\77\2\uffff\1\76\1\uffff\1\25\1\100",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\23\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\126",
            "\1\126",
            "\1\127",
            "\1\115\14\uffff\1\113\2\uffff\1\112\2\uffff\1\114",
            "\1\115",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\70\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\70\1\uffff\1\4\12\uffff\1\4\5\uffff\1\121\2\uffff\1\120\1\uffff\1\25\1\122",
            "\1\4\2\uffff\1\4\2\uffff\1\24\24\uffff\1\3\5\uffff\1\70\1\uffff\1\4\12\uffff\1\4\12\uffff\1\25"
    };

    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_11;
            this.eof = dfa_11;
            this.min = dfa_12;
            this.max = dfa_13;
            this.accept = dfa_14;
            this.special = dfa_15;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "866:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_11 = input.LA(1);

                         
                        int index29_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalKTrace()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index29_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_17s = "\102\uffff";
    static final String dfa_18s = "\2\12\1\4\3\uffff\3\4\1\6\5\12\6\4\1\6\1\53\1\6\3\12\1\6\4\12\2\4\1\6\3\4\1\6\2\53\3\12\1\6\4\12\3\4\1\6\3\12\1\6\4\12\2\4\1\6\2\12";
    static final String dfa_19s = "\2\131\1\4\3\uffff\1\131\1\4\1\10\1\6\5\131\1\4\2\131\1\70\2\4\1\6\1\76\1\10\3\131\1\10\4\131\2\4\1\6\1\70\2\4\1\6\1\76\1\53\3\131\1\10\4\131\1\70\2\4\1\6\3\131\1\10\4\131\2\4\1\6\2\131";
    static final String dfa_20s = "\3\uffff\1\1\1\2\1\3\74\uffff";
    static final String dfa_21s = "\102\uffff}>";
    static final String[] dfa_22s = {
            "\1\1\25\uffff\5\3\1\uffff\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\1\25\uffff\5\3\1\uffff\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\6",
            "",
            "",
            "",
            "\1\13\1\12\1\15\1\uffff\1\16\1\14\1\1\25\uffff\5\3\1\uffff\2\4\1\5\1\uffff\1\17\15\uffff\1\10\2\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\3",
            "\1\20",
            "\1\20\1\uffff\1\15\1\uffff\1\16",
            "\1\21",
            "\1\1\25\uffff\5\3\1\22\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\1\25\uffff\5\3\1\22\2\4\1\5\17\uffff\1\24\2\uffff\1\23\1\uffff\1\2\1\25\24\uffff\7\3",
            "\1\1\25\uffff\5\3\1\22\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\1\25\uffff\5\3\1\22\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\1\25\uffff\5\3\1\22\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\26",
            "\1\13\1\12\1\15\1\uffff\1\16\1\14\1\1\25\uffff\5\3\1\uffff\2\4\1\5\1\uffff\1\17\15\uffff\1\10\2\uffff\1\7\1\uffff\1\2\1\11\24\uffff\7\3",
            "\1\13\1\12\1\15\1\uffff\1\16\1\14\1\1\25\uffff\5\3\1\uffff\2\4\1\5\1\uffff\1\17\15\uffff\1\27\4\uffff\1\2\25\uffff\7\3",
            "\1\31\1\30\1\34\1\uffff\1\35\1\32\56\uffff\1\33",
            "\1\36",
            "\1\36",
            "\1\37",
            "\1\43\14\uffff\1\41\2\uffff\1\40\2\uffff\1\42",
            "\1\15\1\uffff\1\16",
            "\1\1\25\uffff\5\3\1\22\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\1\25\uffff\5\3\1\22\2\4\1\5\17\uffff\1\45\2\uffff\1\44\1\uffff\1\2\1\46\24\uffff\7\3",
            "\1\1\25\uffff\5\3\1\22\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\34\1\uffff\1\35",
            "\1\1\25\uffff\5\3\1\22\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\1\25\uffff\5\3\1\22\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\1\25\uffff\5\3\1\22\2\4\1\5\17\uffff\1\24\2\uffff\1\23\1\uffff\1\2\1\25\24\uffff\7\3",
            "\1\1\25\uffff\5\3\1\22\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\47",
            "\1\47",
            "\1\50",
            "\1\52\1\51\1\55\1\uffff\1\56\1\53\56\uffff\1\54",
            "\1\57",
            "\1\57",
            "\1\60",
            "\1\43\14\uffff\1\41\2\uffff\1\40\2\uffff\1\42",
            "\1\43",
            "\1\1\25\uffff\5\3\1\61\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\1\25\uffff\5\3\1\61\2\4\1\5\17\uffff\1\63\2\uffff\1\62\1\uffff\1\2\1\64\24\uffff\7\3",
            "\1\1\25\uffff\5\3\1\61\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\55\1\uffff\1\56",
            "\1\1\25\uffff\5\3\1\61\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\1\25\uffff\5\3\1\61\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\1\25\uffff\5\3\1\22\2\4\1\5\17\uffff\1\45\2\uffff\1\44\1\uffff\1\2\1\46\24\uffff\7\3",
            "\1\1\25\uffff\5\3\1\22\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\66\1\65\1\71\1\uffff\1\72\1\67\56\uffff\1\70",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\1\25\uffff\5\3\1\61\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\1\25\uffff\5\3\1\61\2\4\1\5\17\uffff\1\76\2\uffff\1\75\1\uffff\1\2\1\77\24\uffff\7\3",
            "\1\1\25\uffff\5\3\1\61\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\71\1\uffff\1\72",
            "\1\1\25\uffff\5\3\1\61\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\1\25\uffff\5\3\1\61\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\1\25\uffff\5\3\1\61\2\4\1\5\17\uffff\1\63\2\uffff\1\62\1\uffff\1\2\1\64\24\uffff\7\3",
            "\1\1\25\uffff\5\3\1\61\2\4\1\5\24\uffff\1\2\25\uffff\7\3",
            "\1\100",
            "\1\100",
            "\1\101",
            "\1\1\25\uffff\5\3\1\61\2\4\1\5\17\uffff\1\76\2\uffff\1\75\1\uffff\1\2\1\77\24\uffff\7\3",
            "\1\1\25\uffff\5\3\1\61\2\4\1\5\24\uffff\1\2\25\uffff\7\3"
    };

    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_17;
            this.eof = dfa_17;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "985:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration )";
        }
    }
    static final String dfa_23s = "\14\uffff";
    static final String dfa_24s = "\1\4\3\0\10\uffff";
    static final String dfa_25s = "\1\75\3\0\10\uffff";
    static final String dfa_26s = "\4\uffff\1\4\1\6\1\uffff\1\7\1\1\1\2\1\3\1\5";
    static final String dfa_27s = "\1\uffff\1\0\1\1\1\2\10\uffff}>";
    static final String[] dfa_28s = {
            "\1\3\2\uffff\1\4\2\uffff\1\1\34\uffff\1\5\10\uffff\1\5\1\uffff\1\7\12\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_23;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "2297:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalKTrace()) ) {s = 8;}

                        else if ( (synpred75_InternalKTrace()) ) {s = 9;}

                        else if ( (synpred76_InternalKTrace()) ) {s = 10;}

                        else if ( (synpred77_InternalKTrace()) ) {s = 4;}

                        else if ( (synpred78_InternalKTrace()) ) {s = 11;}

                        else if ( (synpred79_InternalKTrace()) ) {s = 5;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalKTrace()) ) {s = 8;}

                        else if ( (synpred75_InternalKTrace()) ) {s = 9;}

                        else if ( (synpred76_InternalKTrace()) ) {s = 10;}

                        else if ( (synpred77_InternalKTrace()) ) {s = 4;}

                        else if ( (synpred78_InternalKTrace()) ) {s = 11;}

                        else if ( (synpred79_InternalKTrace()) ) {s = 5;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index73_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_3 = input.LA(1);

                         
                        int index73_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalKTrace()) ) {s = 8;}

                        else if ( (synpred75_InternalKTrace()) ) {s = 9;}

                        else if ( (synpred76_InternalKTrace()) ) {s = 10;}

                        else if ( (synpred78_InternalKTrace()) ) {s = 11;}

                         
                        input.seek(index73_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_29s = "\5\uffff";
    static final String dfa_30s = "\1\1\1\uffff\2\1\1\uffff";
    static final String dfa_31s = "\1\4\1\uffff\2\4\1\uffff";
    static final String dfa_32s = "\1\75\1\uffff\2\114\1\uffff";
    static final String dfa_33s = "\1\uffff\1\2\2\uffff\1\1";
    static final String dfa_34s = "\5\uffff}>";
    static final String[] dfa_35s = {
            "\1\2\2\uffff\1\1\2\uffff\1\1\10\uffff\2\1\3\uffff\1\1\3\uffff\1\1\1\uffff\2\1\7\uffff\1\1\10\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "",
            "\1\1\1\uffff\1\4\1\1\2\uffff\1\1\10\uffff\2\1\3\uffff\2\1\2\uffff\1\1\1\uffff\2\1\7\uffff\2\1\1\uffff\1\1\2\uffff\1\1\1\uffff\2\1\1\uffff\1\1\7\uffff\1\3\2\uffff\1\1\3\uffff\14\1",
            "\1\1\1\uffff\1\4\1\1\2\uffff\1\1\10\uffff\2\1\3\uffff\2\1\2\uffff\1\1\1\uffff\2\1\7\uffff\2\1\1\uffff\1\1\2\uffff\1\1\1\uffff\2\1\1\uffff\1\1\7\uffff\1\3\2\uffff\1\1\3\uffff\14\1",
            ""
    };

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "()+ loopback of 2474:1: ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+";
        }
    }
    static final String[] dfa_36s = {
            "\1\2\2\uffff\1\1\2\uffff\1\1\10\uffff\1\1\6\uffff\3\1\1\uffff\2\1\7\uffff\1\1\10\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "",
            "\1\1\1\uffff\1\4\1\1\2\uffff\1\1\16\uffff\1\1\2\uffff\1\1\1\uffff\2\1\7\uffff\2\1\1\uffff\1\1\2\uffff\1\1\1\uffff\2\1\1\uffff\1\1\7\uffff\1\3\2\uffff\1\1\3\uffff\14\1",
            "\1\1\1\uffff\1\4\1\1\2\uffff\1\1\16\uffff\1\1\2\uffff\1\1\1\uffff\2\1\7\uffff\2\1\1\uffff\1\1\2\uffff\1\1\1\uffff\2\1\1\uffff\1\1\7\uffff\1\3\2\uffff\1\1\3\uffff\14\1",
            ""
    };
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "()+ loopback of 2615:1: ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+";
        }
    }
    static final String[] dfa_37s = {
            "\1\2\2\uffff\1\1\2\uffff\1\1\21\uffff\1\1\1\uffff\2\1\7\uffff\1\1\10\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "",
            "\1\1\1\uffff\1\4\1\1\2\uffff\1\1\16\uffff\1\1\2\uffff\1\1\1\uffff\2\1\7\uffff\2\1\1\uffff\1\1\2\uffff\1\1\1\uffff\2\1\1\uffff\1\1\7\uffff\1\3\2\uffff\1\1\3\uffff\14\1",
            "\1\1\1\uffff\1\4\1\1\2\uffff\1\1\16\uffff\1\1\2\uffff\1\1\1\uffff\2\1\7\uffff\2\1\1\uffff\1\1\2\uffff\1\1\1\uffff\2\1\1\uffff\1\1\7\uffff\1\3\2\uffff\1\1\3\uffff\14\1",
            ""
    };
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "()+ loopback of 2740:1: ( (lv_schedule_7_0= ruleScheduleObjectReference ) )+";
        }
    }
    static final String dfa_38s = "\17\uffff";
    static final String dfa_39s = "\1\4\14\0\2\uffff";
    static final String dfa_40s = "\1\122\14\0\2\uffff";
    static final String dfa_41s = "\15\uffff\1\1\1\2";
    static final String dfa_42s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff}>";
    static final String[] dfa_43s = {
            "\1\12\1\4\1\2\1\14\1\3\1\7\7\uffff\1\15\13\uffff\1\5\11\uffff\1\13\5\uffff\1\6\12\uffff\1\1\30\uffff\1\10\1\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA98 extends DFA {

        public DFA98(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 98;
            this.eot = dfa_38;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "3225:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA98_1 = input.LA(1);

                         
                        int index98_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalKTrace()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index98_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA98_2 = input.LA(1);

                         
                        int index98_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalKTrace()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index98_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA98_3 = input.LA(1);

                         
                        int index98_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalKTrace()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index98_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA98_4 = input.LA(1);

                         
                        int index98_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalKTrace()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index98_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA98_5 = input.LA(1);

                         
                        int index98_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalKTrace()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index98_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA98_6 = input.LA(1);

                         
                        int index98_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalKTrace()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index98_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA98_7 = input.LA(1);

                         
                        int index98_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalKTrace()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index98_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA98_8 = input.LA(1);

                         
                        int index98_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalKTrace()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index98_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA98_9 = input.LA(1);

                         
                        int index98_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalKTrace()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index98_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA98_10 = input.LA(1);

                         
                        int index98_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalKTrace()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index98_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA98_11 = input.LA(1);

                         
                        int index98_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalKTrace()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index98_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA98_12 = input.LA(1);

                         
                        int index98_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalKTrace()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index98_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 98, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_44s = "\7\uffff";
    static final String dfa_45s = "\1\2\6\uffff";
    static final String dfa_46s = "\2\4\1\uffff\2\6\1\0\1\uffff";
    static final String dfa_47s = "\1\75\1\4\1\uffff\2\72\1\0\1\uffff";
    static final String dfa_48s = "\2\uffff\1\2\3\uffff\1\1";
    static final String dfa_49s = "\5\uffff\1\0\1\uffff}>";
    static final String[] dfa_50s = {
            "\1\2\2\uffff\1\2\2\uffff\2\2\7\uffff\1\2\6\uffff\3\2\1\uffff\2\2\5\uffff\1\2\1\uffff\1\2\1\1\2\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\12\uffff\1\2",
            "\1\3",
            "",
            "\1\5\63\uffff\1\4",
            "\1\5\63\uffff\1\4",
            "\1\uffff",
            ""
    };

    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = dfa_44;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_49;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "3250:2: (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA100_5 = input.LA(1);

                         
                        int index100_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_InternalKTrace()) ) {s = 6;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index100_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 100, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_51s = {
            "\1\2\2\uffff\1\1\2\uffff\2\1\7\uffff\1\1\6\uffff\3\1\1\uffff\2\1\5\uffff\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "",
            "\1\1\1\uffff\1\4\1\1\2\uffff\1\1\16\uffff\1\1\2\uffff\1\1\1\uffff\2\1\7\uffff\2\1\1\uffff\1\1\2\uffff\1\1\1\uffff\2\1\1\uffff\1\1\7\uffff\1\3\2\uffff\1\1\3\uffff\14\1",
            "\1\1\1\uffff\1\4\1\1\2\uffff\1\1\16\uffff\1\1\2\uffff\1\1\1\uffff\2\1\7\uffff\2\1\1\uffff\1\1\2\uffff\1\1\1\uffff\2\1\1\uffff\1\1\7\uffff\1\3\2\uffff\1\1\3\uffff\14\1",
            ""
    };
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA99 extends DFA {

        public DFA99(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 99;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "()+ loopback of 3254:1: ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+";
        }
    }
    static final String dfa_52s = "\36\uffff";
    static final String dfa_53s = "\1\7\35\uffff";
    static final String dfa_54s = "\1\4\1\uffff\1\0\33\uffff";
    static final String dfa_55s = "\1\120\1\uffff\1\0\33\uffff";
    static final String dfa_56s = "\1\uffff\1\1\5\uffff\1\2\26\uffff";
    static final String dfa_57s = "\2\uffff\1\0\33\uffff}>";
    static final String[] dfa_58s = {
            "\1\7\2\uffff\1\7\2\uffff\2\7\7\uffff\1\7\6\uffff\3\7\1\uffff\2\7\5\uffff\1\7\1\uffff\2\7\2\uffff\2\7\1\uffff\1\7\1\uffff\1\2\1\1\5\7\6\uffff\1\7\17\uffff\4\1",
            "",
            "\1\uffff",
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
            ""
    };

    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[][] dfa_58 = unpackEncodedStringArray(dfa_58s);

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = dfa_52;
            this.eof = dfa_53;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_56;
            this.special = dfa_57;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "3738:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_2 = input.LA(1);

                         
                        int index109_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_InternalKTrace()) ) {s = 1;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index109_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 109, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_59s = "\16\uffff";
    static final String dfa_60s = "\1\4\5\uffff\7\0\1\uffff";
    static final String dfa_61s = "\1\122\5\uffff\7\0\1\uffff";
    static final String dfa_62s = "\1\uffff\1\1\13\uffff\1\2";
    static final String dfa_63s = "\6\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_64s = {
            "\1\12\2\1\1\14\1\1\1\7\7\uffff\1\15\13\uffff\1\1\11\uffff\1\13\5\uffff\1\6\12\uffff\1\1\30\uffff\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[][] dfa_64 = unpackEncodedStringArray(dfa_64s);

    class DFA110 extends DFA {

        public DFA110(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 110;
            this.eot = dfa_59;
            this.eof = dfa_59;
            this.min = dfa_60;
            this.max = dfa_61;
            this.accept = dfa_62;
            this.special = dfa_63;
            this.transition = dfa_64;
        }
        public String getDescription() {
            return "3804:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_6 = input.LA(1);

                         
                        int index110_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalKTrace()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index110_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA110_7 = input.LA(1);

                         
                        int index110_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalKTrace()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index110_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA110_8 = input.LA(1);

                         
                        int index110_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalKTrace()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index110_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA110_9 = input.LA(1);

                         
                        int index110_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalKTrace()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index110_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA110_10 = input.LA(1);

                         
                        int index110_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalKTrace()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index110_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA110_11 = input.LA(1);

                         
                        int index110_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalKTrace()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index110_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA110_12 = input.LA(1);

                         
                        int index110_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalKTrace()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index110_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 110, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_65s = "\42\uffff";
    static final String dfa_66s = "\1\2\41\uffff";
    static final String dfa_67s = "\1\4\1\0\40\uffff";
    static final String dfa_68s = "\1\120\1\0\40\uffff";
    static final String dfa_69s = "\2\uffff\1\2\36\uffff\1\1";
    static final String dfa_70s = "\1\uffff\1\0\40\uffff}>";
    static final String[] dfa_71s = {
            "\1\2\2\uffff\1\2\2\uffff\2\2\7\uffff\1\2\6\uffff\1\1\2\2\1\uffff\2\2\5\uffff\1\2\1\uffff\2\2\2\uffff\2\2\1\uffff\1\2\1\uffff\12\2\3\uffff\1\2\17\uffff\4\2",
            "\1\uffff",
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
            ""
    };

    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final char[] dfa_68 = DFA.unpackEncodedStringToUnsignedChars(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[][] dfa_71 = unpackEncodedStringArray(dfa_71s);

    class DFA119 extends DFA {

        public DFA119(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 119;
            this.eot = dfa_65;
            this.eof = dfa_66;
            this.min = dfa_67;
            this.max = dfa_68;
            this.accept = dfa_69;
            this.special = dfa_70;
            this.transition = dfa_71;
        }
        public String getDescription() {
            return "4274:1: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA119_1 = input.LA(1);

                         
                        int index119_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalKTrace()) ) {s = 33;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index119_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 119, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_72s = "\1\1\41\uffff";
    static final String dfa_73s = "\1\4\25\uffff\1\0\13\uffff";
    static final String dfa_74s = "\1\120\25\uffff\1\0\13\uffff";
    static final String dfa_75s = "\1\uffff\1\2\37\uffff\1\1";
    static final String dfa_76s = "\26\uffff\1\0\13\uffff}>";
    static final String[] dfa_77s = {
            "\1\1\2\uffff\1\1\2\uffff\2\1\7\uffff\1\1\6\uffff\1\26\2\1\1\uffff\2\1\5\uffff\1\1\1\uffff\2\1\2\uffff\2\1\1\uffff\1\1\1\uffff\12\1\3\uffff\1\1\17\uffff\4\1",
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
            "\1\uffff",
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
            ""
    };
    static final short[] dfa_72 = DFA.unpackEncodedString(dfa_72s);
    static final char[] dfa_73 = DFA.unpackEncodedStringToUnsignedChars(dfa_73s);
    static final char[] dfa_74 = DFA.unpackEncodedStringToUnsignedChars(dfa_74s);
    static final short[] dfa_75 = DFA.unpackEncodedString(dfa_75s);
    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[][] dfa_77 = unpackEncodedStringArray(dfa_77s);

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = dfa_65;
            this.eof = dfa_72;
            this.min = dfa_73;
            this.max = dfa_74;
            this.accept = dfa_75;
            this.special = dfa_76;
            this.transition = dfa_77;
        }
        public String getDescription() {
            return "()* loopback of 4319:3: (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA118_22 = input.LA(1);

                         
                        int index118_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_InternalKTrace()) ) {s = 33;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index118_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 118, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_78s = "\11\uffff";
    static final String dfa_79s = "\3\uffff\1\2\3\uffff\1\2\1\uffff";
    static final String dfa_80s = "\1\4\2\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String dfa_81s = "\1\122\2\uffff\1\120\3\uffff\1\120\1\uffff";
    static final String dfa_82s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\5\1\6\1\uffff\1\4";
    static final String dfa_83s = "\11\uffff}>";
    static final String[] dfa_84s = {
            "\1\3\2\uffff\1\6\1\uffff\1\1\35\uffff\1\5\5\uffff\1\4\43\uffff\2\2",
            "",
            "",
            "\1\2\2\uffff\1\2\2\uffff\2\2\7\uffff\2\2\5\uffff\3\2\1\uffff\2\2\5\uffff\1\2\1\uffff\2\2\1\uffff\3\2\1\10\1\2\1\10\12\2\1\7\1\2\1\uffff\1\2\17\uffff\4\2",
            "",
            "",
            "",
            "\1\2\2\uffff\1\2\2\uffff\2\2\7\uffff\2\2\5\uffff\3\2\1\uffff\2\2\5\uffff\1\2\1\uffff\2\2\1\uffff\3\2\1\10\1\2\1\10\12\2\1\7\1\2\1\uffff\1\2\17\uffff\4\2",
            ""
    };

    static final short[] dfa_78 = DFA.unpackEncodedString(dfa_78s);
    static final short[] dfa_79 = DFA.unpackEncodedString(dfa_79s);
    static final char[] dfa_80 = DFA.unpackEncodedStringToUnsignedChars(dfa_80s);
    static final char[] dfa_81 = DFA.unpackEncodedStringToUnsignedChars(dfa_81s);
    static final short[] dfa_82 = DFA.unpackEncodedString(dfa_82s);
    static final short[] dfa_83 = DFA.unpackEncodedString(dfa_83s);
    static final short[][] dfa_84 = unpackEncodedStringArray(dfa_84s);

    class DFA123 extends DFA {

        public DFA123(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 123;
            this.eot = dfa_78;
            this.eof = dfa_79;
            this.min = dfa_80;
            this.max = dfa_81;
            this.accept = dfa_82;
            this.special = dfa_83;
            this.transition = dfa_84;
        }
        public String getDescription() {
            return "4541:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression )";
        }
    }
    static final String dfa_85s = "\15\uffff";
    static final String dfa_86s = "\1\4\4\uffff\1\0\7\uffff";
    static final String dfa_87s = "\1\122\4\uffff\1\0\7\uffff";
    static final String dfa_88s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\5\uffff\1\5";
    static final String dfa_89s = "\5\uffff\1\0\7\uffff}>";
    static final String[] dfa_90s = {
            "\1\6\1\3\1\1\1\6\1\2\1\6\23\uffff\1\4\11\uffff\1\6\5\uffff\1\5\43\uffff\2\6",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_85 = DFA.unpackEncodedString(dfa_85s);
    static final char[] dfa_86 = DFA.unpackEncodedStringToUnsignedChars(dfa_86s);
    static final char[] dfa_87 = DFA.unpackEncodedStringToUnsignedChars(dfa_87s);
    static final short[] dfa_88 = DFA.unpackEncodedString(dfa_88s);
    static final short[] dfa_89 = DFA.unpackEncodedString(dfa_89s);
    static final short[][] dfa_90 = unpackEncodedStringArray(dfa_90s);

    class DFA124 extends DFA {

        public DFA124(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 124;
            this.eot = dfa_85;
            this.eof = dfa_85;
            this.min = dfa_86;
            this.max = dfa_87;
            this.accept = dfa_88;
            this.special = dfa_89;
            this.transition = dfa_90;
        }
        public String getDescription() {
            return "4647:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA124_5 = input.LA(1);

                         
                        int index124_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalKTrace()) ) {s = 12;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index124_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 124, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_91s = "\3\uffff\1\7\4\uffff\1\12\2\uffff\2\7";
    static final String dfa_92s = "\1\12\1\uffff\4\4\1\6\1\uffff\1\4\2\uffff\2\4";
    static final String dfa_93s = "\1\75\1\uffff\1\4\1\131\1\4\1\10\1\6\1\uffff\1\131\2\uffff\2\131";
    static final String dfa_94s = "\1\uffff\1\1\5\uffff\1\4\1\uffff\1\3\1\2\2\uffff";
    static final String dfa_95s = "\15\uffff}>";
    static final String[] dfa_96s = {
            "\1\1\62\uffff\1\2",
            "",
            "\1\3",
            "\1\10\2\12\1\7\2\12\1\7\24\uffff\6\7\1\uffff\3\7\1\uffff\1\11\7\uffff\1\7\5\uffff\1\5\2\uffff\1\4\1\uffff\1\7\1\6\24\uffff\7\7",
            "\1\13",
            "\1\13\1\uffff\1\12\1\uffff\1\12",
            "\1\14",
            "",
            "\1\12\2\uffff\1\12\2\uffff\1\12\16\uffff\1\7\5\uffff\12\12\1\uffff\1\7\2\uffff\1\7\1\uffff\1\7\2\uffff\1\12\5\uffff\1\12\1\uffff\1\7\1\12\1\uffff\2\12\2\uffff\14\7\6\uffff\7\12",
            "",
            "",
            "\1\10\2\12\1\7\2\12\1\7\24\uffff\6\7\1\uffff\3\7\1\uffff\1\11\7\uffff\1\7\5\uffff\1\5\2\uffff\1\4\1\uffff\1\7\1\6\24\uffff\7\7",
            "\1\10\2\12\1\7\2\12\1\7\24\uffff\6\7\1\uffff\3\7\1\uffff\1\11\7\uffff\1\7\5\uffff\1\12\4\uffff\1\7\25\uffff\7\7"
    };
    static final short[] dfa_91 = DFA.unpackEncodedString(dfa_91s);
    static final char[] dfa_92 = DFA.unpackEncodedStringToUnsignedChars(dfa_92s);
    static final char[] dfa_93 = DFA.unpackEncodedStringToUnsignedChars(dfa_93s);
    static final short[] dfa_94 = DFA.unpackEncodedString(dfa_94s);
    static final short[] dfa_95 = DFA.unpackEncodedString(dfa_95s);
    static final short[][] dfa_96 = unpackEncodedStringArray(dfa_96s);

    class DFA138 extends DFA {

        public DFA138(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 138;
            this.eot = dfa_85;
            this.eof = dfa_91;
            this.min = dfa_92;
            this.max = dfa_93;
            this.accept = dfa_94;
            this.special = dfa_95;
            this.transition = dfa_96;
        }
        public String getDescription() {
            return "5641:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
    static final String dfa_97s = "\13\uffff";
    static final String dfa_98s = "\2\uffff\1\10\4\uffff\1\6\1\uffff\2\10";
    static final String dfa_99s = "\1\76\5\4\1\uffff\1\4\1\uffff\2\4";
    static final String dfa_100s = "\1\76\1\4\1\76\1\4\1\10\1\6\1\uffff\1\112\1\uffff\2\76";
    static final String dfa_101s = "\6\uffff\1\1\1\uffff\1\2\2\uffff";
    static final String dfa_102s = "\13\uffff}>";
    static final String[] dfa_103s = {
            "\1\1",
            "\1\2",
            "\1\7\2\6\1\uffff\2\6\1\10\7\uffff\2\10\6\uffff\2\10\34\uffff\1\4\2\uffff\1\3\1\uffff\1\10\1\5",
            "\1\11",
            "\1\11\1\uffff\1\6\1\uffff\1\6",
            "\1\10\1\uffff\1\12",
            "",
            "\1\6\5\uffff\1\6\7\uffff\2\6\5\uffff\1\10\2\6\11\uffff\1\6\4\uffff\1\10\15\uffff\1\6\1\uffff\1\10\1\6\1\uffff\2\6\2\uffff\12\10",
            "",
            "\1\7\2\6\1\uffff\2\6\1\10\7\uffff\2\10\6\uffff\2\10\34\uffff\1\4\2\uffff\1\3\1\uffff\1\10\1\5",
            "\1\7\2\6\1\uffff\2\6\1\10\7\uffff\2\10\6\uffff\2\10\34\uffff\1\6\4\uffff\2\10"
    };

    static final short[] dfa_97 = DFA.unpackEncodedString(dfa_97s);
    static final short[] dfa_98 = DFA.unpackEncodedString(dfa_98s);
    static final char[] dfa_99 = DFA.unpackEncodedStringToUnsignedChars(dfa_99s);
    static final char[] dfa_100 = DFA.unpackEncodedStringToUnsignedChars(dfa_100s);
    static final short[] dfa_101 = DFA.unpackEncodedString(dfa_101s);
    static final short[] dfa_102 = DFA.unpackEncodedString(dfa_102s);
    static final short[][] dfa_103 = unpackEncodedStringArray(dfa_103s);

    class DFA139 extends DFA {

        public DFA139(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 139;
            this.eot = dfa_97;
            this.eof = dfa_98;
            this.min = dfa_99;
            this.max = dfa_100;
            this.accept = dfa_101;
            this.special = dfa_102;
            this.transition = dfa_103;
        }
        public String getDescription() {
            return "5713:1: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )";
        }
    }
    static final String dfa_104s = "\3\uffff\1\7\6\uffff\2\7";
    static final String dfa_105s = "\1\12\1\uffff\4\4\1\6\3\uffff\2\4";
    static final String dfa_106s = "\1\75\1\uffff\1\4\1\76\2\4\1\6\3\uffff\1\76\1\75";
    static final String dfa_107s = "\1\uffff\1\1\5\uffff\1\4\1\3\1\2\2\uffff";
    static final String dfa_108s = "\14\uffff}>";
    static final String[] dfa_109s = {
            "\1\1\62\uffff\1\2",
            "",
            "\1\3",
            "\1\7\1\11\4\uffff\1\7\37\uffff\1\10\15\uffff\1\5\2\uffff\1\4\1\uffff\1\7\1\6",
            "\1\12",
            "\1\12",
            "\1\13",
            "",
            "",
            "",
            "\1\7\1\11\4\uffff\1\7\37\uffff\1\10\15\uffff\1\5\2\uffff\1\4\1\uffff\1\7\1\6",
            "\1\7\1\11\4\uffff\1\7\37\uffff\1\10\22\uffff\1\7"
    };
    static final short[] dfa_104 = DFA.unpackEncodedString(dfa_104s);
    static final char[] dfa_105 = DFA.unpackEncodedStringToUnsignedChars(dfa_105s);
    static final char[] dfa_106 = DFA.unpackEncodedStringToUnsignedChars(dfa_106s);
    static final short[] dfa_107 = DFA.unpackEncodedString(dfa_107s);
    static final short[] dfa_108 = DFA.unpackEncodedString(dfa_108s);
    static final short[][] dfa_109 = unpackEncodedStringArray(dfa_109s);

    class DFA140 extends DFA {

        public DFA140(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 140;
            this.eot = dfa_23;
            this.eof = dfa_104;
            this.min = dfa_105;
            this.max = dfa_106;
            this.accept = dfa_107;
            this.special = dfa_108;
            this.transition = dfa_109;
        }
        public String getDescription() {
            return "5763:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x2000000001180410L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x2000000001180412L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x2000000001080410L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0100000000000370L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x600000000C0C0410L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x600000000C0C0412L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x200000000C080410L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x2000000008080410L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x200501DF90000492L,0x0000000003F80000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x2005008090000492L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000010L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x200501DFD0000490L,0x0000000003F80000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x20050080D0000490L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000050000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2000000080000400L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x21002080200207F0L,0x0000000000060000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x2000001F00000400L,0x0000000003F80000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001E00000000L,0x0000000003F80000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001C00000000L,0x0000000003F80000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001800000000L,0x0000000003F80000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L,0x0000000003F80000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2000000000000410L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000080000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000802L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x200000C000000400L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000010000000400L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xA000020000000410L,0x0000000000000001L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000020000000410L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000140002000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x02E0000000000000L,0x000000001E000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000210000000002L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000000000412L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000040002000000L,0x00000000000007FEL});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000040000000000L,0x0000000000001800L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x2000000000000480L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000A00000000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x21402080200207F0L,0x0000000000060000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000402000000000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000008000000400L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x2004000000000400L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0003000000000002L,0x000000000001E000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0080000000000002L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x21002080200007F0L,0x0000000000060000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0200000000000002L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x2000000000000410L,0x0000000000060000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0800040000000002L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x31002080200207F0L,0x0000000000060000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000002040000000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000230L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x4900000000000002L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000100L});
    }


}