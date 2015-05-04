package de.cau.cs.kieler.sccharts.text.actions.parser.antlr.internal; 

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
import de.cau.cs.kieler.sccharts.text.actions.services.ActionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalActionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'immediate'", "'deferred'", "'/'", "';'", "'('", "')'", "'['", "']'", "'='", "'<'", "','", "'()'", "'>'", "'&'", "'@'", "'.'", "':'", "'reset'", "'shallow history'", "'history'", "'=='", "'<='", "'>='", "'<>'", "'pre'", "'|'", "'!'", "'+'", "'-'", "'*'", "'%'", "'val'", "'||'", "'&&'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=12;
    public static final int RULE_INT=4;
    public static final int RULE_COMMENT_ANNOTATION=10;
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
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_HOSTCODE=6;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;

    // delegates
    // delegators


        public InternalActionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActionsParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private ActionsGrammarAccess grammarAccess;
     	
        public InternalActionsParser(TokenStream input, ActionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Transition";	
       	}
       	
       	@Override
       	protected ActionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTransition"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:74:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:75:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:76:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition81);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:83:1: ruleTransition returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_immediate_2_0= 'immediate' ) )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_trigger_6_0= ruleBoolExpression ) )? (otherlv_7= '/' ( (lv_effects_8_0= ruleEffect ) ) (otherlv_9= ';' ( (lv_effects_10_0= ruleEffect ) ) )* )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_immediate_2_0=null;
        Token lv_delay_3_0=null;
        Token lv_deferred_4_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_annotations_1_0 = null;

        Enumerator lv_history_5_0 = null;

        EObject lv_trigger_6_0 = null;

        EObject lv_effects_8_0 = null;

        EObject lv_effects_10_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:86:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_immediate_2_0= 'immediate' ) )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_trigger_6_0= ruleBoolExpression ) )? (otherlv_7= '/' ( (lv_effects_8_0= ruleEffect ) ) (otherlv_9= ';' ( (lv_effects_10_0= ruleEffect ) ) )* )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:87:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_immediate_2_0= 'immediate' ) )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_trigger_6_0= ruleBoolExpression ) )? (otherlv_7= '/' ( (lv_effects_8_0= ruleEffect ) ) (otherlv_9= ';' ( (lv_effects_10_0= ruleEffect ) ) )* )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:87:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_immediate_2_0= 'immediate' ) )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_trigger_6_0= ruleBoolExpression ) )? (otherlv_7= '/' ( (lv_effects_8_0= ruleEffect ) ) (otherlv_9= ';' ( (lv_effects_10_0= ruleEffect ) ) )* )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:87:2: () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_immediate_2_0= 'immediate' ) )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_trigger_6_0= ruleBoolExpression ) )? (otherlv_7= '/' ( (lv_effects_8_0= ruleEffect ) ) (otherlv_9= ';' ( (lv_effects_10_0= ruleEffect ) ) )* )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:87:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:88:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionAccess().getTransitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:96:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMENT_ANNOTATION||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:97:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:97:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:98:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTransition149);
            	    lv_annotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_1_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:114:3: ( (lv_immediate_2_0= 'immediate' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:115:1: (lv_immediate_2_0= 'immediate' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:115:1: (lv_immediate_2_0= 'immediate' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:116:3: lv_immediate_2_0= 'immediate'
                    {
                    lv_immediate_2_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTransition168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_immediate_2_0, grammarAccess.getTransitionAccess().getImmediateImmediateKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTransitionRule());
                      	        }
                             		setWithLastConsumed(current, "immediate", true, "immediate");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:129:3: ( (lv_delay_3_0= RULE_INT ) )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:130:1: (lv_delay_3_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:130:1: (lv_delay_3_0= RULE_INT )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:131:3: lv_delay_3_0= RULE_INT
                    {
                    lv_delay_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTransition199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_delay_3_0, grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTransitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"delay",
                              		lv_delay_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:147:3: ( (lv_deferred_4_0= 'deferred' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:148:1: (lv_deferred_4_0= 'deferred' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:148:1: (lv_deferred_4_0= 'deferred' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:149:3: lv_deferred_4_0= 'deferred'
                    {
                    lv_deferred_4_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTransition223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_deferred_4_0, grammarAccess.getTransitionAccess().getDeferredDeferredKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTransitionRule());
                      	        }
                             		setWithLastConsumed(current, "deferred", true, "deferred");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:162:3: ( (lv_history_5_0= ruleHistoryType ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=33 && LA5_0<=35)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:163:1: (lv_history_5_0= ruleHistoryType )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:163:1: (lv_history_5_0= ruleHistoryType )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:164:3: lv_history_5_0= ruleHistoryType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getHistoryHistoryTypeEnumRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleHistoryType_in_ruleTransition258);
                    lv_history_5_0=ruleHistoryType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                      	        }
                             		set(
                             			current, 
                             			"history",
                              		lv_history_5_0, 
                              		"HistoryType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:180:3: ( (lv_trigger_6_0= ruleBoolExpression ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)||LA6_0==20||LA6_0==25||LA6_0==40||LA6_0==42||LA6_0==44||LA6_0==47) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:181:1: (lv_trigger_6_0= ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:181:1: (lv_trigger_6_0= ruleBoolExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:182:3: lv_trigger_6_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getTriggerBoolExpressionParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleTransition280);
                    lv_trigger_6_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_6_0, 
                              		"BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:198:3: (otherlv_7= '/' ( (lv_effects_8_0= ruleEffect ) ) (otherlv_9= ';' ( (lv_effects_10_0= ruleEffect ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:198:5: otherlv_7= '/' ( (lv_effects_8_0= ruleEffect ) ) (otherlv_9= ';' ( (lv_effects_10_0= ruleEffect ) ) )*
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTransition294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getSolidusKeyword_7_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:202:1: ( (lv_effects_8_0= ruleEffect ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:203:1: (lv_effects_8_0= ruleEffect )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:203:1: (lv_effects_8_0= ruleEffect )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:204:3: lv_effects_8_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleTransition315);
                    lv_effects_8_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                      	        }
                             		add(
                             			current, 
                             			"effects",
                              		lv_effects_8_0, 
                              		"Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:220:2: (otherlv_9= ';' ( (lv_effects_10_0= ruleEffect ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:220:4: otherlv_9= ';' ( (lv_effects_10_0= ruleEffect ) )
                    	    {
                    	    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTransition328); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getSemicolonKeyword_7_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:224:1: ( (lv_effects_10_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:225:1: (lv_effects_10_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:225:1: (lv_effects_10_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:226:3: lv_effects_10_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_7_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleTransition349);
                    	    lv_effects_10_0=ruleEffect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"effects",
                    	              		lv_effects_10_0, 
                    	              		"Effect");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEffect"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:258:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:259:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:260:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEffect_in_entryRuleEffect397);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEffect407); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:267:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect | this_FunctionCallEffect_3= ruleFunctionCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_TextEffect_2 = null;

        EObject this_FunctionCallEffect_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:270:28: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect | this_FunctionCallEffect_3= ruleFunctionCallEffect ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:271:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect | this_FunctionCallEffect_3= ruleFunctionCallEffect )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:271:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect | this_FunctionCallEffect_3= ruleFunctionCallEffect )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=19 && LA9_1<=20)) ) {
                    alt9=1;
                }
                else if ( (LA9_1==22||LA9_1==24) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:272:2: this_Emission_0= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmission_in_ruleEffect457);
                    this_Emission_0=ruleEmission();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Emission_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:285:2: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleEffect487);
                    this_Assignment_1=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:298:2: this_TextEffect_2= ruleTextEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_ruleEffect517);
                    this_TextEffect_2=ruleTextEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextEffect_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:311:2: this_FunctionCallEffect_3= ruleFunctionCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getFunctionCallEffectParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionCallEffect_in_ruleEffect547);
                    this_FunctionCallEffect_3=ruleFunctionCallEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCallEffect_3; 
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:330:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:331:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:332:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmission_in_entryRuleEmission582);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmission592); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:339:1: ruleEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_newValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:342:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:343:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:343:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:343:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:343:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:344:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:344:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:345:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmission641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:359:2: (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:359:4: otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEmission654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:363:1: ( (lv_newValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:364:1: (lv_newValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:364:1: (lv_newValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:365:3: lv_newValue_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEmission675);
                    lv_newValue_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEmissionRule());
                      	        }
                             		set(
                             			current, 
                             			"newValue",
                              		lv_newValue_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEmission687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "ruleEmission"


    // $ANTLR start "entryRuleAssignment"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:393:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:394:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:395:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment725);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment735); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:402:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_indices_2_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:405:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:406:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:406:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:406:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:406:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:407:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:407:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:408:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:422:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:422:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAssignment797); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:426:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:427:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:427:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:428:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment818);
            	    lv_indices_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indices",
            	              		lv_indices_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAssignment830); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAssignment844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:452:1: ( (lv_expression_5_0= ruleExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:453:1: (lv_expression_5_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:453:1: (lv_expression_5_0= ruleExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:454:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment865);
            lv_expression_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"Expression");
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleTextEffect"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:478:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextEffect = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:479:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:480:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_entryRuleTextEffect901);
            iv_ruleTextEffect=ruleTextEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextEffect911); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTextEffect"


    // $ANTLR start "ruleTextEffect"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:487:1: ruleTextEffect returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:490:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:491:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:491:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:492:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:492:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:493:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextEffect952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_0_0, grammarAccess.getTextEffectAccess().getTextHOSTCODETerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextEffectRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_0_0, 
                      		"HOSTCODE");
              	    
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
    // $ANTLR end "ruleTextEffect"


    // $ANTLR start "entryRuleFunctionCallEffect"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:517:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallEffect = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:518:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:519:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect992);
            iv_ruleFunctionCallEffect=ruleFunctionCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionCallEffect1002); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:526:1: ruleFunctionCallEffect returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
    public final EObject ruleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_functionName_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:529:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:530:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:530:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:530:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFunctionCallEffect1039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:534:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:535:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:535:1: (lv_functionName_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:536:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect1060);
            lv_functionName_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
              	        }
                     		set(
                     			current, 
                     			"functionName",
                      		lv_functionName_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:552:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:552:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:552:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:552:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFunctionCallEffect1074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:556:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:557:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:557:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:558:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCallEffect1095);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:574:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==26) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:574:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFunctionCallEffect1108); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:578:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:579:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:579:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:580:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCallEffect1129);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFunctionCallEffect1143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:601:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleFunctionCallEffect1162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFunctionCallEffect1176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getGreaterThanSignKeyword_3());
                  
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
    // $ANTLR end "ruleFunctionCallEffect"


    // $ANTLR start "entryRuleParameter"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:617:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:618:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:619:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter1212);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter1222); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:626:1: ruleParameter returns [EObject current=null] : ( ( (lv_callByReference_0_0= '&' ) )? ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_callByReference_0_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:629:28: ( ( ( (lv_callByReference_0_0= '&' ) )? ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:630:1: ( ( (lv_callByReference_0_0= '&' ) )? ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:630:1: ( ( (lv_callByReference_0_0= '&' ) )? ( (lv_expression_1_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:630:2: ( (lv_callByReference_0_0= '&' ) )? ( (lv_expression_1_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:630:2: ( (lv_callByReference_0_0= '&' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:631:1: (lv_callByReference_0_0= '&' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:631:1: (lv_callByReference_0_0= '&' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:632:3: lv_callByReference_0_0= '&'
                    {
                    lv_callByReference_0_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleParameter1265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_callByReference_0_0, grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterRule());
                      	        }
                             		setWithLastConsumed(current, "callByReference", true, "&");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:645:3: ( (lv_expression_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:646:1: (lv_expression_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:646:1: (lv_expression_1_0= ruleExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:647:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParameter1300);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"Expression");
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


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:673:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:674:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:675:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1338);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1348); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:682:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:685:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:686:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:686:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:687:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleExpression1398);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:700:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleExpression1428);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:719:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:720:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:721:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1463);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolExpression1473); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:728:1: ruleBoolExpression returns [EObject current=null] : this_OrAndExpression_0= ruleOrAndExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrAndExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:731:28: (this_OrAndExpression_0= ruleOrAndExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:733:2: this_OrAndExpression_0= ruleOrAndExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getOrAndExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrAndExpression_in_ruleBoolExpression1522);
            this_OrAndExpression_0=ruleOrAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrAndExpression_0; 
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


    // $ANTLR start "entryRuleOrAndExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:752:1: entryRuleOrAndExpression returns [EObject current=null] : iv_ruleOrAndExpression= ruleOrAndExpression EOF ;
    public final EObject entryRuleOrAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrAndExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:753:2: (iv_ruleOrAndExpression= ruleOrAndExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:754:2: iv_ruleOrAndExpression= ruleOrAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrAndExpression_in_entryRuleOrAndExpression1556);
            iv_ruleOrAndExpression=ruleOrAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrAndExpression1566); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrAndExpression"


    // $ANTLR start "ruleOrAndExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:761:1: ruleOrAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) ) ;
    public final EObject ruleOrAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_1 = null;

        Enumerator lv_operator_2_2 = null;

        EObject lv_subExpressions_3_0 = null;

        Enumerator lv_operator_5_1 = null;

        Enumerator lv_operator_5_2 = null;

        EObject lv_subExpressions_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:764:28: ( (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:765:1: (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:765:1: (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:766:2: this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* )
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleOrAndExpression1616);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:777:1: ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* )
            int alt20=2;
            switch ( input.LA(1) ) {
            case 41:
            case 48:
                {
                alt20=1;
                }
                break;
            case 18:
                {
                int LA20_2 = input.LA(2);

                if ( (synpred21_InternalActions()) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
                {
                int LA20_3 = input.LA(2);

                if ( (synpred21_InternalActions()) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA20_4 = input.LA(2);

                if ( (synpred21_InternalActions()) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 4, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                int LA20_5 = input.LA(2);

                if ( (synpred21_InternalActions()) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 5, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA20_6 = input.LA(2);

                if ( (synpred21_InternalActions()) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 6, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                int LA20_7 = input.LA(2);

                if ( (synpred21_InternalActions()) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 7, input);

                    throw nvae;
                }
                }
                break;
            case 29:
            case 49:
                {
                alt20=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:777:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:777:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==41||LA17_0==48) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:777:3: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:777:3: ()
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:778:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndAdd(
                    	                  grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:786:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:787:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:787:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:788:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:788:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0==41) ) {
                    	        alt16=1;
                    	    }
                    	    else if ( (LA16_0==48) ) {
                    	        alt16=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 16, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:789:3: lv_operator_2_1= ruleOrOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_0_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_ruleOrAndExpression1652);
                    	            lv_operator_2_1=ruleOrOperator();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"operator",
                    	                      		lv_operator_2_1, 
                    	                      		"OrOperator");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:804:8: lv_operator_2_2= ruleLogicalOrOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_0_1_0_1()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_ruleOrAndExpression1671);
                    	            lv_operator_2_2=ruleLogicalOrOperator();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"operator",
                    	                      		lv_operator_2_2, 
                    	                      		"LogicalOrOperator");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:822:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:823:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:823:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:824:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_0_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleOrAndExpression1695);
                    	    lv_subExpressions_3_0=ruleCompareOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"CompareOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:841:6: ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )*
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:841:6: ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==29||LA19_0==49) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:841:7: () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:841:7: ()
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:842:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndAdd(
                    	                  grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:850:2: ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:851:1: ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:851:1: ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:852:1: (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:852:1: (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator )
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==29) ) {
                    	        alt18=1;
                    	    }
                    	    else if ( (LA18_0==49) ) {
                    	        alt18=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 18, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:853:3: lv_operator_5_1= ruleAndOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_ruleOrAndExpression1739);
                    	            lv_operator_5_1=ruleAndOperator();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"operator",
                    	                      		lv_operator_5_1, 
                    	                      		"AndOperator");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:868:8: lv_operator_5_2= ruleLogicalAndOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_1_0_1()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndOperator_in_ruleOrAndExpression1758);
                    	            lv_operator_5_2=ruleLogicalAndOperator();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"operator",
                    	                      		lv_operator_5_2, 
                    	                      		"LogicalAndOperator");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:886:2: ( (lv_subExpressions_6_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:887:1: (lv_subExpressions_6_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:887:1: (lv_subExpressions_6_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:888:3: lv_subExpressions_6_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleOrAndExpression1782);
                    	    lv_subExpressions_6_0=ruleCompareOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_6_0, 
                    	              		"CompareOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

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
    // $ANTLR end "ruleOrAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:912:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:913:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:914:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1821);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation1831); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:921:1: ruleCompareOperation returns [EObject current=null] : ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_NotExpression_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:924:28: ( ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:925:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:925:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:925:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:925:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:926:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1882);
                    this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotOrValuedExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:937:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:937:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:937:2: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:938:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:946:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:947:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:947:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:948:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleCompareOperation1915);
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
                              		"CompareOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:964:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:965:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:965:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:966:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1936);
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
                              		"NotOrValuedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:984:2: this_NotExpression_4= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleCompareOperation1969);
                    this_NotExpression_4=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotExpression_4; 
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
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1003:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1004:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1005:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression2004);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression2014); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1012:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1015:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1016:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1016:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1017:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression2064);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1030:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression2094);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1049:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1050:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1051:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression2129);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression2139); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1058:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1061:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1062:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1062:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_HOSTCODE)||LA23_0==RULE_BOOLEAN||LA23_0==20||LA23_0==25||LA23_0==40||LA23_0==47) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1062:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1062:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1062:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1062:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1063:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1071:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1072:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1072:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1073:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_ruleNotExpression2198);
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
                              		"NotOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1089:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1090:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1090:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1091:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotExpression2219);
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
                              		"NotExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1109:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleNotExpression2251);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1128:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1129:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1130:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression2286);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression2296); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1137:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1140:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1142:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression2345);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1161:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1162:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1163:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression2379);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression2389); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1170:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1173:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1174:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1174:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1175:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression2439);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1186:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==43) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1186:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1186:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1187:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1195:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1196:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1196:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1197:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_ruleAddExpression2472);
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
            	              		"AddOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1213:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1214:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1214:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1215:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression2493);
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
            	              		"SubExpression");
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1239:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1240:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1241:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression2531);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression2541); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1248:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1251:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1252:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1252:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1253:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression2591);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1264:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==44) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1264:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1264:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1265:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1273:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1274:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1274:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1275:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleSubExpression2624);
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
            	              		"SubOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1291:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1292:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1292:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1293:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression2645);
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
            	              		"MultExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1317:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1318:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1319:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression2683);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression2693); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1326:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1329:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1330:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1330:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1331:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression2743);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1342:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==45) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1342:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1342:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1343:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1351:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1352:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1352:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1353:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_ruleMultExpression2776);
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
            	              		"MultOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1369:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1370:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1370:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1371:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression2797);
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
            	              		"DivExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1395:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1396:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1397:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression2835);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression2845); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1404:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1407:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1408:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1408:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1409:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression2895);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1420:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1420:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1420:2: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1421:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1429:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1430:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1430:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1431:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_ruleDivExpression2928);
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
                              		"DivOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1447:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1448:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1448:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1449:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression2949);
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
                              		"ModExpression");
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
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1473:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1474:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1475:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression2987);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression2997); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1482:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1485:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1486:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1486:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1487:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleModExpression3047);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1498:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1498:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1498:2: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1499:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1507:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1508:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1508:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1509:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_ruleModExpression3080);
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
                              		"ModOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1525:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1526:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1526:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1527:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression3101);
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
                              		"AtomicValuedExpression");
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
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1551:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1552:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1553:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression3139);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression3149); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1560:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1563:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1564:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1564:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=RULE_INT && LA29_0<=RULE_STRING)||LA29_0==20||LA29_0==25||LA29_0==40||LA29_0==47) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1564:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1564:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1564:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1564:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1565:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1573:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1574:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1574:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1575:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleNegExpression3208);
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
                              		"SubOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1591:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1592:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1592:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1593:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleNegExpression3229);
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
                              		"NegExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1611:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression3261);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1630:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1631:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1632:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression3296);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression3306); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1639:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_FunctionCall_5 = null;

        EObject this_TextExpression_6 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1642:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1643:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1643:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt30=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt30=1;
                }
                break;
            case RULE_ID:
            case 40:
            case 47:
                {
                alt30=2;
                }
                break;
            case 20:
                {
                alt30=3;
                }
                break;
            case 25:
                {
                alt30=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt30=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1644:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_ruleAtomicExpression3356);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1657:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression3386);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1669:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1669:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1669:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAtomicExpression3404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleAtomicExpression3429);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAtomicExpression3440); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1691:2: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionCall_in_ruleAtomicExpression3472);
                    this_FunctionCall_5=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1704:2: this_TextExpression_6= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_ruleAtomicExpression3502);
                    this_TextExpression_6=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextExpression_6; 
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1723:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1724:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1725:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression3537);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression3547); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1732:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_ValuedExpression_4 = null;

        EObject this_AtomicExpression_6 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1735:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1736:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1736:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt31=5;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1737:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression3597);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1750:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression3627);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1763:2: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression3657);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1775:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1775:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1775:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAtomicValuedExpression3675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression3700);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAtomicValuedExpression3711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1797:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression3743);
                    this_AtomicExpression_6=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_6; 
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1816:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1817:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1818:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression3778);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression3788); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1825:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1828:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1829:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1829:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40||LA33_0==47) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1829:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1829:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1829:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1829:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1830:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1838:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1839:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1839:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1840:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1840:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==40) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==47) ) {
                        alt32=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1841:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression3849);
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
                                      		"PreOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1856:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression3868);
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
                                      		"ValOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleValuedObjectTestExpression3883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1878:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1879:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1879:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1880:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression3904);
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
                              		"ValuedObjectTestExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleValuedObjectTestExpression3916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1902:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression3948);
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


    // $ANTLR start "entryRuleValuedObjectReference"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1921:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1922:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1923:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference3983);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference3993); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1930:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1933:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1934:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1934:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1934:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1934:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1935:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1935:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1936:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObjectReference4042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1950:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==22) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1950:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleValuedObjectReference4055); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1954:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1955:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1955:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1956:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleValuedObjectReference4076);
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
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleValuedObjectReference4088); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleFunctionCall"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1984:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1985:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1986:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4126);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionCall4136); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1993:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_functionName_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1996:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1997:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1997:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1997:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFunctionCall4173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2001:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2002:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2002:1: (lv_functionName_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2003:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleFunctionCall4194);
            lv_functionName_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
              	        }
                     		set(
                     			current, 
                     			"functionName",
                      		lv_functionName_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2019:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==20) ) {
                alt36=1;
            }
            else if ( (LA36_0==27) ) {
                alt36=2;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2019:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2019:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2019:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFunctionCall4208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2023:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2024:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2024:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2025:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCall4229);
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
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2041:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==26) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2041:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFunctionCall4242); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2045:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2046:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2046:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2047:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCall4263);
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
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFunctionCall4277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2068:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleFunctionCall4296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFunctionCall4310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_3());
                  
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


    // $ANTLR start "entryRuleTextExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2084:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2085:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2086:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression4346);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression4356); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2093:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2096:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2097:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2097:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2098:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2098:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2099:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextExpression4397); if (state.failed) return current;
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
                      		"HOSTCODE");
              	    
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2123:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2124:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2125:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue4437);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue4447); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2132:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2135:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2136:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2136:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2137:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2137:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2138:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntValue4488); if (state.failed) return current;
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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2162:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2163:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2164:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue4528);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue4538); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2171:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2174:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2175:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2175:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2176:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2176:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2177:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloatValue4579); if (state.failed) return current;
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
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2201:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2202:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2203:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_entryRuleBoolValue4619);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolValue4629); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2210:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2213:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2214:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2214:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2215:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2215:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2216:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleBoolValue4670); if (state.failed) return current;
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
                      		"BOOLEAN");
              	    
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2240:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2241:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2242:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_entryRuleStringValue4710);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringValue4720); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2249:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2252:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2253:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2253:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2254:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2254:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2255:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringValue4761); if (state.failed) return current;
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2281:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2282:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2283:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation4803);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation4813); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2290:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_TagAnnotation_1 = null;

        EObject this_KeyStringValueAnnotation_2 = null;

        EObject this_TypedKeyStringValueAnnotation_3 = null;

        EObject this_KeyBooleanValueAnnotation_4 = null;

        EObject this_KeyIntValueAnnotation_5 = null;

        EObject this_KeyFloatValueAnnotation_6 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2293:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2294:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2294:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            int alt37=7;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_COMMENT_ANNOTATION) ) {
                alt37=1;
            }
            else if ( (LA37_0==30) ) {
                int LA37_2 = input.LA(2);

                if ( (synpred48_InternalActions()) ) {
                    alt37=2;
                }
                else if ( (synpred49_InternalActions()) ) {
                    alt37=3;
                }
                else if ( (synpred50_InternalActions()) ) {
                    alt37=4;
                }
                else if ( (synpred51_InternalActions()) ) {
                    alt37=5;
                }
                else if ( (synpred52_InternalActions()) ) {
                    alt37=6;
                }
                else if ( (true) ) {
                    alt37=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2295:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_ruleAnnotation4863);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2308:2: this_TagAnnotation_1= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_ruleAnnotation4893);
                    this_TagAnnotation_1=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2321:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation4923);
                    this_KeyStringValueAnnotation_2=ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyStringValueAnnotation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2334:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation4953);
                    this_TypedKeyStringValueAnnotation_3=ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedKeyStringValueAnnotation_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2347:2: this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation4983);
                    this_KeyBooleanValueAnnotation_4=ruleKeyBooleanValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyBooleanValueAnnotation_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2360:2: this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation5013);
                    this_KeyIntValueAnnotation_5=ruleKeyIntValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyIntValueAnnotation_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2373:2: this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation5043);
                    this_KeyFloatValueAnnotation_6=ruleKeyFloatValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyFloatValueAnnotation_6; 
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


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2394:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2395:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2396:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5080);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation5090); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2403:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2406:28: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2407:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2407:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2408:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2408:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2409:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommentAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"COMMENT_ANNOTATION");
              	    
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


    // $ANTLR start "entryRuleTagAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2433:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2434:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2435:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation5171);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation5181); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2442:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2445:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2446:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2446:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2446:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTagAnnotation5218); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2450:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2451:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2451:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2452:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTagAnnotation5239);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2468:2: (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==20) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==RULE_COMMENT_ANNOTATION||LA39_1==21||LA39_1==30) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2468:4: otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTagAnnotation5252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2472:1: ( (lv_annotations_3_0= ruleAnnotation ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_COMMENT_ANNOTATION||LA38_0==30) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2473:1: (lv_annotations_3_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2473:1: (lv_annotations_3_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2474:3: lv_annotations_3_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTagAnnotation5273);
                    	    lv_annotations_3_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTagAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_3_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTagAnnotation5286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2());
                          
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
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2502:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2503:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2504:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation5324);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation5334); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2511:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2514:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2515:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2515:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2515:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleKeyStringValueAnnotation5371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2519:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2520:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2520:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2521:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation5392);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2537:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2538:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2538:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2539:3: lv_value_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation5413);
            lv_value_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2555:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==RULE_COMMENT_ANNOTATION||LA41_1==21||LA41_1==30) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2555:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleKeyStringValueAnnotation5426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2559:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_COMMENT_ANNOTATION||LA40_0==30) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2560:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2560:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2561:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation5447);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleKeyStringValueAnnotation5460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2589:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2590:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2591:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation5498);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation5508); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2598:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        EObject lv_annotations_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2601:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2602:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2602:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2602:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTypedKeyStringValueAnnotation5545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2606:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2607:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2607:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2608:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5566);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTypedKeyStringValueAnnotation5578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2628:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2629:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2629:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2630:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5599);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTypedKeyStringValueAnnotation5611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2650:1: ( (lv_value_5_0= ruleEString ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2651:1: (lv_value_5_0= ruleEString )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2651:1: (lv_value_5_0= ruleEString )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2652:3: lv_value_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation5632);
            lv_value_5_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_5_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2668:2: (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==20) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_COMMENT_ANNOTATION||LA43_1==21||LA43_1==30) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2668:4: otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTypedKeyStringValueAnnotation5645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2672:1: ( (lv_annotations_7_0= ruleAnnotation ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_COMMENT_ANNOTATION||LA42_0==30) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2673:1: (lv_annotations_7_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2673:1: (lv_annotations_7_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2674:3: lv_annotations_7_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation5666);
                    	    lv_annotations_7_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_7_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTypedKeyStringValueAnnotation5679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2());
                          
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
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2702:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2703:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2704:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation5717);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation5727); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2711:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2714:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2715:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2715:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2715:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleKeyBooleanValueAnnotation5764); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2719:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2720:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2720:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2721:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation5785);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyBooleanValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2737:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2738:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2738:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2739:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation5802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyBooleanValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"BOOLEAN");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2755:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==20) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==RULE_COMMENT_ANNOTATION||LA45_1==21||LA45_1==30) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2755:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleKeyBooleanValueAnnotation5820); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2759:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==RULE_COMMENT_ANNOTATION||LA44_0==30) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2760:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2760:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2761:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation5841);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyBooleanValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleKeyBooleanValueAnnotation5854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2789:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2790:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2791:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation5892);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation5902); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2798:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2801:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2802:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2802:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2802:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleKeyIntValueAnnotation5939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2806:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2807:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2807:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2808:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation5960);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2824:2: ( (lv_value_2_0= RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2825:1: (lv_value_2_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2825:1: (lv_value_2_0= RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2826:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation5977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2842:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==20) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==RULE_COMMENT_ANNOTATION||LA47_1==21||LA47_1==30) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2842:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleKeyIntValueAnnotation5995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2846:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==RULE_COMMENT_ANNOTATION||LA46_0==30) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2847:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2847:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2848:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation6016);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleKeyIntValueAnnotation6029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2876:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2877:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2878:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation6067);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation6077); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2885:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2888:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2889:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2889:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2889:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleKeyFloatValueAnnotation6114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2893:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2894:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2894:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2895:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation6135);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2911:2: ( (lv_value_2_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2912:1: (lv_value_2_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2912:1: (lv_value_2_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2913:3: lv_value_2_0= RULE_FLOAT
            {
            lv_value_2_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation6152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"FLOAT");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2929:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==20) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==RULE_COMMENT_ANNOTATION||LA49_1==21||LA49_1==30) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2929:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleKeyFloatValueAnnotation6170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2933:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==RULE_COMMENT_ANNOTATION||LA48_0==30) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2934:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2934:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2935:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation6191);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleKeyFloatValueAnnotation6204); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2965:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2966:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2967:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString6245);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString6256); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2974:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2977:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2978:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2978:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_ID) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2978:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString6296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2986:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString6322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                          
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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3001:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3002:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3003:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID6368);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID6379); if (state.failed) return current;

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3010:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3013:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3014:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3014:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3014:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID6419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3021:1: (kw= '.' this_ID_2= RULE_ID )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==31) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3022:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleExtendedID6438); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID6453); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "ruleDivOperator"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3042:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= ':' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3044:28: ( (enumLiteral_0= ':' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3045:1: (enumLiteral_0= ':' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3045:1: (enumLiteral_0= ':' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3045:3: enumLiteral_0= ':'
            {
            enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDivOperator6513); if (state.failed) return current;
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


    // $ANTLR start "ruleHistoryType"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3055:1: ruleHistoryType returns [Enumerator current=null] : ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) ;
    public final Enumerator ruleHistoryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3057:28: ( ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3058:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3058:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt52=1;
                }
                break;
            case 34:
                {
                alt52=2;
                }
                break;
            case 35:
                {
                alt52=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3058:2: (enumLiteral_0= 'reset' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3058:2: (enumLiteral_0= 'reset' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3058:4: enumLiteral_0= 'reset'
                    {
                    enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleHistoryType6557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getRESETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getHistoryTypeAccess().getRESETEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3064:6: (enumLiteral_1= 'shallow history' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3064:6: (enumLiteral_1= 'shallow history' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3064:8: enumLiteral_1= 'shallow history'
                    {
                    enumLiteral_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleHistoryType6574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getSHALLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getHistoryTypeAccess().getSHALLOWEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3070:6: (enumLiteral_2= 'history' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3070:6: (enumLiteral_2= 'history' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3070:8: enumLiteral_2= 'history'
                    {
                    enumLiteral_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleHistoryType6591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getDEEPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getHistoryTypeAccess().getDEEPEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleHistoryType"


    // $ANTLR start "ruleCompareOperator"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3080:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3082:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3083:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3083:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) )
            int alt53=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt53=1;
                }
                break;
            case 25:
                {
                alt53=2;
                }
                break;
            case 37:
                {
                alt53=3;
                }
                break;
            case 28:
                {
                alt53=4;
                }
                break;
            case 38:
                {
                alt53=5;
                }
                break;
            case 39:
                {
                alt53=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3083:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3083:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3083:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleCompareOperator6636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3089:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3089:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3089:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCompareOperator6653); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3095:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3095:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3095:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCompareOperator6670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3101:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3101:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3101:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCompareOperator6687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3107:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3107:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3107:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCompareOperator6704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3113:6: (enumLiteral_5= '<>' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3113:6: (enumLiteral_5= '<>' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3113:8: enumLiteral_5= '<>'
                    {
                    enumLiteral_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCompareOperator6721); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3123:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3125:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3126:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3126:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3126:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePreOperator6765); if (state.failed) return current;
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


    // $ANTLR start "ruleOrOperator"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3136:1: ruleOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3138:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3139:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3139:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3139:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOrOperator6808); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "ruleAndOperator"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3149:1: ruleAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3151:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3152:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3152:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3152:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAndOperator6851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "ruleNotOperator"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3162:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3164:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3165:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3165:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3165:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNotOperator6894); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3175:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3177:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3178:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3178:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3178:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAddOperator6937); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3188:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3190:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3191:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3191:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3191:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleSubOperator6980); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3201:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3203:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3204:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3204:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3204:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMultOperator7023); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3214:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3216:28: ( (enumLiteral_0= '%' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3217:1: (enumLiteral_0= '%' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3217:1: (enumLiteral_0= '%' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3217:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleModOperator7066); if (state.failed) return current;
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


    // $ANTLR start "ruleValOperator"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3227:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3229:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3230:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3230:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3230:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleValOperator7109); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3240:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3242:28: ( (enumLiteral_0= '||' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3243:1: (enumLiteral_0= '||' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3243:1: (enumLiteral_0= '||' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3243:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleLogicalOrOperator7152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 
                  
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3253:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3255:28: ( (enumLiteral_0= '&&' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3256:1: (enumLiteral_0= '&&' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3256:1: (enumLiteral_0= '&&' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:3256:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleLogicalAndOperator7195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 
                  
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

    // $ANTLR start synpred3_InternalActions
    public final void synpred3_InternalActions_fragment() throws RecognitionException {   
        Token lv_delay_3_0=null;

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:130:1: ( (lv_delay_3_0= RULE_INT ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:130:1: (lv_delay_3_0= RULE_INT )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:130:1: (lv_delay_3_0= RULE_INT )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:131:3: lv_delay_3_0= RULE_INT
        {
        lv_delay_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred3_InternalActions199); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalActions

    // $ANTLR start synpred18_InternalActions
    public final void synpred18_InternalActions_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:687:2: (this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:687:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred18_InternalActions1398);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalActions

    // $ANTLR start synpred21_InternalActions
    public final void synpred21_InternalActions_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_1 = null;

        Enumerator lv_operator_2_2 = null;

        EObject lv_subExpressions_3_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:777:2: ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:777:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:777:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
        loop58:
        do {
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==41||LA58_0==48) ) {
                alt58=1;
            }


            switch (alt58) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:777:3: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:777:3: ()
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:778:2: 
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	  /* */ 
        	      	
        	    }

        	    }

        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:786:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:787:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:787:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:788:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:788:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
        	    int alt57=2;
        	    int LA57_0 = input.LA(1);

        	    if ( (LA57_0==41) ) {
        	        alt57=1;
        	    }
        	    else if ( (LA57_0==48) ) {
        	        alt57=2;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        NoViableAltException nvae =
        	            new NoViableAltException("", 57, 0, input);

        	        throw nvae;
        	    }
        	    switch (alt57) {
        	        case 1 :
        	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:789:3: lv_operator_2_1= ruleOrOperator
        	            {
        	            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_synpred21_InternalActions1652);
        	            lv_operator_2_1=ruleOrOperator();

        	            state._fsp--;
        	            if (state.failed) return ;

        	            }
        	            break;
        	        case 2 :
        	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:804:8: lv_operator_2_2= ruleLogicalOrOperator
        	            {
        	            if ( state.backtracking==0 ) {
        	               
        	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_0_1_0_1()); 
        	              	    
        	            }
        	            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_synpred21_InternalActions1671);
        	            lv_operator_2_2=ruleLogicalOrOperator();

        	            state._fsp--;
        	            if (state.failed) return ;

        	            }
        	            break;

        	    }


        	    }


        	    }

        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:822:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:823:1: (lv_subExpressions_3_0= ruleCompareOperation )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:823:1: (lv_subExpressions_3_0= ruleCompareOperation )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:824:3: lv_subExpressions_3_0= ruleCompareOperation
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_0_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_synpred21_InternalActions1695);
        	    lv_subExpressions_3_0=ruleCompareOperation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop58;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred21_InternalActions

    // $ANTLR start synpred24_InternalActions
    public final void synpred24_InternalActions_fragment() throws RecognitionException {   
        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:925:2: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:925:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:925:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:926:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred24_InternalActions1882);
        this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:937:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:937:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:937:2: ()
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:938:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:946:2: ( (lv_operator_2_0= ruleCompareOperator ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:947:1: (lv_operator_2_0= ruleCompareOperator )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:947:1: (lv_operator_2_0= ruleCompareOperator )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:948:3: lv_operator_2_0= ruleCompareOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_synpred24_InternalActions1915);
        lv_operator_2_0=ruleCompareOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:964:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:965:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:965:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:966:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred24_InternalActions1936);
        lv_subExpressions_3_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalActions

    // $ANTLR start synpred25_InternalActions
    public final void synpred25_InternalActions_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1017:2: (this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1017:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred25_InternalActions2064);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalActions

    // $ANTLR start synpred40_InternalActions
    public final void synpred40_InternalActions_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1775:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1775:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1775:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1775:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_synpred40_InternalActions3675); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred40_InternalActions3700);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_synpred40_InternalActions3711); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred40_InternalActions

    // $ANTLR start synpred48_InternalActions
    public final void synpred48_InternalActions_fragment() throws RecognitionException {   
        EObject this_TagAnnotation_1 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2308:2: (this_TagAnnotation_1= ruleTagAnnotation )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2308:2: this_TagAnnotation_1= ruleTagAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_synpred48_InternalActions4893);
        this_TagAnnotation_1=ruleTagAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalActions

    // $ANTLR start synpred49_InternalActions
    public final void synpred49_InternalActions_fragment() throws RecognitionException {   
        EObject this_KeyStringValueAnnotation_2 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2321:2: (this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2321:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_synpred49_InternalActions4923);
        this_KeyStringValueAnnotation_2=ruleKeyStringValueAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalActions

    // $ANTLR start synpred50_InternalActions
    public final void synpred50_InternalActions_fragment() throws RecognitionException {   
        EObject this_TypedKeyStringValueAnnotation_3 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2334:2: (this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2334:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_synpred50_InternalActions4953);
        this_TypedKeyStringValueAnnotation_3=ruleTypedKeyStringValueAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalActions

    // $ANTLR start synpred51_InternalActions
    public final void synpred51_InternalActions_fragment() throws RecognitionException {   
        EObject this_KeyBooleanValueAnnotation_4 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2347:2: (this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2347:2: this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_synpred51_InternalActions4983);
        this_KeyBooleanValueAnnotation_4=ruleKeyBooleanValueAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalActions

    // $ANTLR start synpred52_InternalActions
    public final void synpred52_InternalActions_fragment() throws RecognitionException {   
        EObject this_KeyIntValueAnnotation_5 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2360:2: (this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2360:2: this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_synpred52_InternalActions5013);
        this_KeyIntValueAnnotation_5=ruleKeyIntValueAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalActions

    // Delegated rules

    public final boolean synpred50_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA3_eotS =
        "\24\uffff";
    static final String DFA3_eofS =
        "\1\2\23\uffff";
    static final String DFA3_minS =
        "\1\4\1\0\22\uffff";
    static final String DFA3_maxS =
        "\1\57\1\0\22\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\20\uffff\1\1";
    static final String DFA3_specialS =
        "\1\uffff\1\0\22\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\5\2\7\uffff\2\2\1\uffff\1\2\4\uffff\1\2\7\uffff\3\2\4"+
            "\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
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
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "129:3: ( (lv_delay_3_0= RULE_INT ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalActions()) ) {s = 19;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\16\uffff";
    static final String DFA15_eofS =
        "\16\uffff";
    static final String DFA15_minS =
        "\1\4\13\0\2\uffff";
    static final String DFA15_maxS =
        "\1\57\13\0\2\uffff";
    static final String DFA15_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA15_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\11\1\13\1\3\1\6\1\4\12\uffff\1\5\4\uffff\1\12\16\uffff"+
            "\1\7\1\uffff\1\14\1\uffff\1\1\2\uffff\1\10",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "686:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index15_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_10 = input.LA(1);

                         
                        int index15_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index15_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA15_11 = input.LA(1);

                         
                        int index15_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index15_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\16\uffff";
    static final String DFA21_eofS =
        "\16\uffff";
    static final String DFA21_minS =
        "\1\4\4\uffff\10\0\1\uffff";
    static final String DFA21_maxS =
        "\1\57\4\uffff\10\0\1\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\13\uffff\1\2";
    static final String DFA21_specialS =
        "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\1\11\1\13\1\1\1\6\1\1\12\uffff\1\5\4\uffff\1\12\16\uffff"+
            "\1\7\1\uffff\1\14\1\uffff\1\1\2\uffff\1\10",
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
            "\1\uffff",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "925:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_5 = input.LA(1);

                         
                        int index21_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_6 = input.LA(1);

                         
                        int index21_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_7 = input.LA(1);

                         
                        int index21_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_8 = input.LA(1);

                         
                        int index21_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_9 = input.LA(1);

                         
                        int index21_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_10 = input.LA(1);

                         
                        int index21_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_11 = input.LA(1);

                         
                        int index21_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_12 = input.LA(1);

                         
                        int index21_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index21_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\15\uffff";
    static final String DFA22_eofS =
        "\15\uffff";
    static final String DFA22_minS =
        "\1\4\4\uffff\7\0\1\uffff";
    static final String DFA22_maxS =
        "\1\57\4\uffff\7\0\1\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\12\uffff\1\2";
    static final String DFA22_specialS =
        "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\11\1\13\1\1\1\6\1\1\12\uffff\1\5\4\uffff\1\12\16\uffff"+
            "\1\7\1\uffff\1\14\1\uffff\1\1\2\uffff\1\10",
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1016:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_5 = input.LA(1);

                         
                        int index22_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_8 = input.LA(1);

                         
                        int index22_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index22_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_9 = input.LA(1);

                         
                        int index22_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index22_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_11 = input.LA(1);

                         
                        int index22_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index22_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\14\uffff";
    static final String DFA31_eofS =
        "\14\uffff";
    static final String DFA31_minS =
        "\1\4\3\uffff\1\0\7\uffff";
    static final String DFA31_maxS =
        "\1\57\3\uffff\1\0\7\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String DFA31_specialS =
        "\4\uffff\1\0\7\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\2\5\1\2\1\5\1\3\12\uffff\1\4\4\uffff\1\5\16\uffff\1\5"+
            "\6\uffff\1\5",
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1736:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalActions()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTransition149 = new BitSet(new long[]{0x0000950E421707F2L});
        public static final BitSet FOLLOW_16_in_ruleTransition168 = new BitSet(new long[]{0x0000950E021603F2L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTransition199 = new BitSet(new long[]{0x0000950E021603F2L});
        public static final BitSet FOLLOW_17_in_ruleTransition223 = new BitSet(new long[]{0x0000950E021403F2L});
        public static final BitSet FOLLOW_ruleHistoryType_in_ruleTransition258 = new BitSet(new long[]{0x00009500021403F2L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleTransition280 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleTransition294 = new BitSet(new long[]{0x0000000002000060L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition315 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleTransition328 = new BitSet(new long[]{0x0000000002000060L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition349 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEffect407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_ruleEffect457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCallEffect_in_ruleEffect547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission582 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmission592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmission641 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleEmission654 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEmission675 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEmission687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment784 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_22_in_ruleAssignment797 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment818 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAssignment830 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_24_in_ruleAssignment844 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextEffect952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect992 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCallEffect1002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleFunctionCallEffect1039 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect1060 = new BitSet(new long[]{0x0000000018100000L});
        public static final BitSet FOLLOW_20_in_ruleFunctionCallEffect1074 = new BitSet(new long[]{0x00009500221003F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect1095 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_26_in_ruleFunctionCallEffect1108 = new BitSet(new long[]{0x00009500221003F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect1129 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_21_in_ruleFunctionCallEffect1143 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_27_in_ruleFunctionCallEffect1162 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleFunctionCallEffect1176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1212 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter1222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleParameter1265 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParameter1300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1338 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression1398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1463 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression1473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrAndExpression_in_ruleBoolExpression1522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrAndExpression_in_entryRuleOrAndExpression1556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrAndExpression1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression1616 = new BitSet(new long[]{0x0003020020000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrAndExpression1652 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleOrAndExpression1671 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression1695 = new BitSet(new long[]{0x0001020000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_ruleOrAndExpression1739 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleOrAndExpression1758 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression1782 = new BitSet(new long[]{0x0002000020000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1821 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation1831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1882 = new BitSet(new long[]{0x000000F012000000L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation1915 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleCompareOperation1969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression2004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression2014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression2064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression2094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression2129 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression2139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression2198 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression2219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression2251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression2286 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression2296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression2345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression2379 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression2389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression2439 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression2472 = new BitSet(new long[]{0x00009100021003F0L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression2493 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression2531 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression2541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression2591 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression2624 = new BitSet(new long[]{0x00009100021003F0L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression2645 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression2683 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression2693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression2743 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression2776 = new BitSet(new long[]{0x00009100021003F0L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression2797 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression2835 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression2845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression2895 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression2928 = new BitSet(new long[]{0x00009100021003F0L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression2949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression2987 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression2997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression3047 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression3080 = new BitSet(new long[]{0x00009100021003F0L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression3101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression3139 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression3149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression3208 = new BitSet(new long[]{0x00009100021003F0L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression3229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression3261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression3296 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression3306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression3356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression3386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAtomicExpression3404 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression3429 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAtomicExpression3440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCall_in_ruleAtomicExpression3472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression3502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression3537 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression3547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression3597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression3627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression3657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAtomicValuedExpression3675 = new BitSet(new long[]{0x00009100021003F0L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression3700 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAtomicValuedExpression3711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression3743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression3778 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression3788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression3849 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression3868 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleValuedObjectTestExpression3883 = new BitSet(new long[]{0x0000810000000020L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression3904 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleValuedObjectTestExpression3916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression3948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference3983 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference3993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference4042 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleValuedObjectReference4055 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObjectReference4076 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleValuedObjectReference4088 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4126 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall4136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleFunctionCall4173 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCall4194 = new BitSet(new long[]{0x0000000018100000L});
        public static final BitSet FOLLOW_20_in_ruleFunctionCall4208 = new BitSet(new long[]{0x00009500221003F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall4229 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_26_in_ruleFunctionCall4242 = new BitSet(new long[]{0x00009500221003F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall4263 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_21_in_ruleFunctionCall4277 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_27_in_ruleFunctionCall4296 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleFunctionCall4310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression4346 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression4356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression4397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue4437 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue4447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue4488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue4528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue4538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue4579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue4619 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue4629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue4670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue4710 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringValue4720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue4761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4803 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation4863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation4893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation4923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation4953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation4983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation5013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation5043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5080 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation5090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation5171 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation5181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleTagAnnotation5218 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation5239 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleTagAnnotation5252 = new BitSet(new long[]{0x0000950E423707F0L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTagAnnotation5273 = new BitSet(new long[]{0x0000950E423707F0L});
        public static final BitSet FOLLOW_21_in_ruleTagAnnotation5286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation5324 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation5334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleKeyStringValueAnnotation5371 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation5392 = new BitSet(new long[]{0x0000000000000220L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation5413 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleKeyStringValueAnnotation5426 = new BitSet(new long[]{0x0000950E423707F0L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation5447 = new BitSet(new long[]{0x0000950E423707F0L});
        public static final BitSet FOLLOW_21_in_ruleKeyStringValueAnnotation5460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation5498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation5508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleTypedKeyStringValueAnnotation5545 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5566 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTypedKeyStringValueAnnotation5578 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5599 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleTypedKeyStringValueAnnotation5611 = new BitSet(new long[]{0x0000000000000220L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation5632 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleTypedKeyStringValueAnnotation5645 = new BitSet(new long[]{0x0000950E423707F0L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation5666 = new BitSet(new long[]{0x0000950E423707F0L});
        public static final BitSet FOLLOW_21_in_ruleTypedKeyStringValueAnnotation5679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation5717 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation5727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleKeyBooleanValueAnnotation5764 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation5785 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation5802 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleKeyBooleanValueAnnotation5820 = new BitSet(new long[]{0x0000950E423707F0L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation5841 = new BitSet(new long[]{0x0000950E423707F0L});
        public static final BitSet FOLLOW_21_in_ruleKeyBooleanValueAnnotation5854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation5892 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation5902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleKeyIntValueAnnotation5939 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation5960 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation5977 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleKeyIntValueAnnotation5995 = new BitSet(new long[]{0x0000950E423707F0L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation6016 = new BitSet(new long[]{0x0000950E423707F0L});
        public static final BitSet FOLLOW_21_in_ruleKeyIntValueAnnotation6029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation6067 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation6077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleKeyFloatValueAnnotation6114 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation6135 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation6152 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleKeyFloatValueAnnotation6170 = new BitSet(new long[]{0x0000950E423707F0L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation6191 = new BitSet(new long[]{0x0000950E423707F0L});
        public static final BitSet FOLLOW_21_in_ruleKeyFloatValueAnnotation6204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString6256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString6296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString6322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID6368 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID6379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID6419 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleExtendedID6438 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID6453 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_32_in_ruleDivOperator6513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleHistoryType6557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleHistoryType6574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleHistoryType6591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleCompareOperator6636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleCompareOperator6653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleCompareOperator6670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleCompareOperator6687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleCompareOperator6704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleCompareOperator6721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rulePreOperator6765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleOrOperator6808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleAndOperator6851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleNotOperator6894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleAddOperator6937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleSubOperator6980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleMultOperator7023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleModOperator7066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleValOperator7109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleLogicalOrOperator7152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleLogicalAndOperator7195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred3_InternalActions199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred18_InternalActions1398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_synpred21_InternalActions1652 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_synpred21_InternalActions1671 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_synpred21_InternalActions1695 = new BitSet(new long[]{0x0001020000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred24_InternalActions1882 = new BitSet(new long[]{0x000000F012000000L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_synpred24_InternalActions1915 = new BitSet(new long[]{0x00009500021003F0L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred24_InternalActions1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred25_InternalActions2064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_synpred40_InternalActions3675 = new BitSet(new long[]{0x00009100021003F0L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred40_InternalActions3700 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_synpred40_InternalActions3711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_synpred48_InternalActions4893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_synpred49_InternalActions4923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_synpred50_InternalActions4953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_synpred51_InternalActions4983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_synpred52_InternalActions5013 = new BitSet(new long[]{0x0000000000000002L});
    }


}