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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'immediate'", "'deferred'", "'/'", "';'", "'('", "')'", "'='", "'['", "']'", "'@'", "'.'", "':'", "'reset'", "'shallow history'", "'history'", "'=='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pre'", "'|'", "'&'", "'!'", "'+'", "'-'", "'*'", "'%'", "'val'", "'||'", "'&&'"
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
    public static final int RULE_COMMENT_ANNOTATION=9;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_HOSTCODE=6;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=10;
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

                if ( (LA1_0==RULE_COMMENT_ANNOTATION||LA1_0==25) ) {
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

            if ( ((LA5_0>=28 && LA5_0<=30)) ) {
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

            if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_BOOLEAN)||LA6_0==20||LA6_0==37||LA6_0==40||LA6_0==42||LA6_0==45) ) {
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:267:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_TextEffect_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:270:28: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:271:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:271:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==22) ) {
                    alt9=2;
                }
                else if ( (LA9_1==EOF||(LA9_1>=19 && LA9_1<=20)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==RULE_HOSTCODE) ) {
                alt9=3;
            }
            else {
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:317:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:318:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:319:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmission_in_entryRuleEmission552);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmission562); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:326:1: ruleEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_newValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:329:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:330:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:330:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:330:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:330:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:331:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:331:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:332:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmission611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:346:2: (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:346:4: otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEmission624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:350:1: ( (lv_newValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:351:1: (lv_newValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:351:1: (lv_newValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:352:3: lv_newValue_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEmission645);
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

                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEmission657); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:380:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:381:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:382:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment695);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment705); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:389:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:392:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:393:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:393:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:393:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:393:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:394:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:394:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:395:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAssignment766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:413:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:414:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:414:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:415:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment787);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:439:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextEffect = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:440:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:441:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_entryRuleTextEffect823);
            iv_ruleTextEffect=ruleTextEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextEffect833); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:448:1: ruleTextEffect returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:451:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:452:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:452:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:453:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:453:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:454:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextEffect874); if (state.failed) return current;
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


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:480:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:481:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:482:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression916);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression926); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:489:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:492:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:493:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:493:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:494:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleExpression976);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:507:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleExpression1006);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:526:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:527:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:528:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1041);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolExpression1051); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:535:1: ruleBoolExpression returns [EObject current=null] : this_OrAndExpression_0= ruleOrAndExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrAndExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:538:28: (this_OrAndExpression_0= ruleOrAndExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:540:2: this_OrAndExpression_0= ruleOrAndExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getOrAndExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrAndExpression_in_ruleBoolExpression1100);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:559:1: entryRuleOrAndExpression returns [EObject current=null] : iv_ruleOrAndExpression= ruleOrAndExpression EOF ;
    public final EObject entryRuleOrAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrAndExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:560:2: (iv_ruleOrAndExpression= ruleOrAndExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:561:2: iv_ruleOrAndExpression= ruleOrAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrAndExpression_in_entryRuleOrAndExpression1134);
            iv_ruleOrAndExpression=ruleOrAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrAndExpression1144); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:568:1: ruleOrAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:571:28: ( (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:572:1: (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:572:1: (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:573:2: this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* )
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleOrAndExpression1194);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:584:1: ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* )
            int alt16=2;
            switch ( input.LA(1) ) {
            case 38:
            case 46:
                {
                alt16=1;
                }
                break;
            case 18:
                {
                int LA16_2 = input.LA(2);

                if ( (synpred15_InternalActions()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
                {
                int LA16_3 = input.LA(2);

                if ( (synpred15_InternalActions()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA16_4 = input.LA(2);

                if ( (synpred15_InternalActions()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA16_5 = input.LA(2);

                if ( (synpred15_InternalActions()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 5, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                int LA16_6 = input.LA(2);

                if ( (synpred15_InternalActions()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 6, input);

                    throw nvae;
                }
                }
                break;
            case 39:
            case 47:
                {
                alt16=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:584:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:584:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==38||LA13_0==46) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:584:3: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:584:3: ()
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:585:2: 
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

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:593:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:594:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:594:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:595:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:595:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
                    	    int alt12=2;
                    	    int LA12_0 = input.LA(1);

                    	    if ( (LA12_0==38) ) {
                    	        alt12=1;
                    	    }
                    	    else if ( (LA12_0==46) ) {
                    	        alt12=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 12, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt12) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:596:3: lv_operator_2_1= ruleOrOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_0_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_ruleOrAndExpression1230);
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
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:611:8: lv_operator_2_2= ruleLogicalOrOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_0_1_0_1()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_ruleOrAndExpression1249);
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

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:629:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:630:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:630:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:631:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_0_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleOrAndExpression1273);
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:648:6: ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )*
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:648:6: ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==39||LA15_0==47) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:648:7: () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:648:7: ()
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:649:2: 
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

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:657:2: ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:658:1: ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:658:1: ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:659:1: (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:659:1: (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator )
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==39) ) {
                    	        alt14=1;
                    	    }
                    	    else if ( (LA14_0==47) ) {
                    	        alt14=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 14, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:660:3: lv_operator_5_1= ruleAndOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_ruleOrAndExpression1317);
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
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:675:8: lv_operator_5_2= ruleLogicalAndOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_1_0_1()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndOperator_in_ruleOrAndExpression1336);
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

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:693:2: ( (lv_subExpressions_6_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:694:1: (lv_subExpressions_6_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:694:1: (lv_subExpressions_6_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:695:3: lv_subExpressions_6_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleOrAndExpression1360);
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
                    	    break loop15;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:719:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:720:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:721:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1399);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation1409); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:728:1: ruleCompareOperation returns [EObject current=null] : ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_NotExpression_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:731:28: ( ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:732:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:732:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:732:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:732:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:733:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1460);
                    this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotOrValuedExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:744:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:744:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:744:2: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:745:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:753:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:754:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:754:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:755:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleCompareOperation1493);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:771:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:772:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:772:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:773:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1514);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:791:2: this_NotExpression_4= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleCompareOperation1547);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:810:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:811:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:812:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression1582);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression1592); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:819:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:822:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:823:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:823:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:824:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression1642);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:837:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression1672);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:856:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:857:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:858:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression1707);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression1717); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:865:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:868:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:869:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:869:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_HOSTCODE)||LA19_0==RULE_BOOLEAN||LA19_0==20||LA19_0==37||LA19_0==45) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:869:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:869:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:869:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:869:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:870:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:878:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:879:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:879:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:880:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_ruleNotExpression1776);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:896:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:897:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:897:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:898:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotExpression1797);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:916:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleNotExpression1829);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:935:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:936:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:937:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression1864);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression1874); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:944:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:947:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:949:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression1923);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:968:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:969:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:970:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression1957);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression1967); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:977:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:980:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:981:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:981:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:982:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression2017);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:993:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:993:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:993:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:994:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1002:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1003:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1003:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1004:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_ruleAddExpression2050);
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1020:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1021:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1021:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1022:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression2071);
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
            	    break loop20;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1046:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1047:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1048:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression2109);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression2119); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1055:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1058:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1059:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1059:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1060:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression2169);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1071:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==42) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1071:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1071:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1072:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1080:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1081:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1081:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1082:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleSubExpression2202);
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1098:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1099:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1099:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1100:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression2223);
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
            	    break loop21;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1124:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1125:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1126:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression2261);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression2271); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1133:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1136:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1137:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1137:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1138:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression2321);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1149:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==43) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1149:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1149:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1150:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1158:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1159:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1159:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1160:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_ruleMultExpression2354);
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1176:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1177:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1177:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1178:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression2375);
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
            	    break loop22;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1202:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1203:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1204:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression2413);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression2423); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1211:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1214:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1215:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1215:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1216:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression2473);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1227:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1227:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1227:2: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1228:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1236:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1237:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1237:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1238:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_ruleDivExpression2506);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1254:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1255:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1255:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1256:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression2527);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1280:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1281:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1282:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression2565);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression2575); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1289:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1292:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1293:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1293:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1294:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleModExpression2625);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1305:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1305:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1305:2: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1306:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1314:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1315:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1315:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1316:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_ruleModExpression2658);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1332:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1333:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1333:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1334:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression2679);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1358:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1359:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1360:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression2717);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression2727); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1367:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1370:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1371:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1371:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_INT && LA25_0<=RULE_BOOLEAN)||LA25_0==20||LA25_0==37||LA25_0==45) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1371:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1371:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1371:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1371:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1372:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1380:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1381:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1381:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1382:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleNegExpression2786);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1398:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1399:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1399:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1400:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleNegExpression2807);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1418:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression2839);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1437:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1438:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1439:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression2874);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression2884); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1446:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_TextExpression_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1449:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1450:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1450:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression )
            int alt26=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
            case 37:
            case 45:
                {
                alt26=2;
                }
                break;
            case 20:
                {
                alt26=3;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1451:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_ruleAtomicExpression2934);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1464:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression2964);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1476:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1476:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1476:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAtomicExpression2982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleAtomicExpression3007);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAtomicExpression3018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1498:2: this_TextExpression_5= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_ruleAtomicExpression3050);
                    this_TextExpression_5=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextExpression_5; 
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1517:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1518:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1519:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression3085);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression3095); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1526:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_ValuedExpression_3 = null;

        EObject this_AtomicExpression_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1529:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1530:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1530:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            int alt27=4;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1531:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression3145);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1544:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression3175);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1556:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1556:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1556:8: otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAtomicValuedExpression3193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression3218);
                    this_ValuedExpression_3=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAtomicValuedExpression3229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1578:2: this_AtomicExpression_5= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression3261);
                    this_AtomicExpression_5=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_5; 
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1597:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1598:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1599:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression3296);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression3306); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1606:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1609:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1610:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1610:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37||LA29_0==45) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1610:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1610:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1610:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1610:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1611:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1619:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1620:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1620:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1621:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1621:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==37) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==45) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1622:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression3367);
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
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1637:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression3386);
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

                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleValuedObjectTestExpression3401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1659:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1660:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1660:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1661:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression3422);
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

                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleValuedObjectTestExpression3434); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1683:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression3466);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1702:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1703:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1704:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference3501);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference3511); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1711:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cardinalities_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1714:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1715:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1715:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1715:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1715:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1716:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1716:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1717:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObjectReference3560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1731:2: (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==23) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1731:4: otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleValuedObjectReference3573); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1735:1: ( (lv_cardinalities_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1736:1: (lv_cardinalities_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1736:1: (lv_cardinalities_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1737:3: lv_cardinalities_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getCardinalitiesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleValuedObjectReference3594);
            	    lv_cardinalities_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cardinalities",
            	              		lv_cardinalities_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleValuedObjectReference3606); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
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


    // $ANTLR start "entryRuleTextExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1765:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1766:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1767:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression3644);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression3654); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1774:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1777:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1778:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1778:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1779:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1779:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1780:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextExpression3695); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1804:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1805:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1806:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue3735);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue3745); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1813:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1816:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1817:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1817:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1818:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1818:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1819:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntValue3786); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1843:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1844:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1845:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue3826);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue3836); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1852:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1855:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1856:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1856:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1857:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1857:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1858:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloatValue3877); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1882:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1883:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1884:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_entryRuleBoolValue3917);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolValue3927); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1891:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1894:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1895:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1895:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1896:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1896:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1897:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleBoolValue3968); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1923:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1924:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1925:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation4010);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation4020); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1932:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1935:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1936:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1936:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            int alt31=7;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_COMMENT_ANNOTATION) ) {
                alt31=1;
            }
            else if ( (LA31_0==25) ) {
                int LA31_2 = input.LA(2);

                if ( (synpred37_InternalActions()) ) {
                    alt31=2;
                }
                else if ( (synpred38_InternalActions()) ) {
                    alt31=3;
                }
                else if ( (synpred39_InternalActions()) ) {
                    alt31=4;
                }
                else if ( (synpred40_InternalActions()) ) {
                    alt31=5;
                }
                else if ( (synpred41_InternalActions()) ) {
                    alt31=6;
                }
                else if ( (true) ) {
                    alt31=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1937:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_ruleAnnotation4070);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1950:2: this_TagAnnotation_1= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_ruleAnnotation4100);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1963:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation4130);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1976:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation4160);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1989:2: this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation4190);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2002:2: this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation4220);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2015:2: this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation4250);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2036:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2037:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2038:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation4287);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation4297); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2045:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2048:28: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2049:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2049:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2050:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2050:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2051:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation4338); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2075:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2076:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2077:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation4378);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation4388); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2084:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2087:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2088:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2088:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2088:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTagAnnotation4425); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2092:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2093:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2093:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2094:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTagAnnotation4446);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2110:2: (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==RULE_COMMENT_ANNOTATION||LA33_1==21||LA33_1==25) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2110:4: otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTagAnnotation4459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2114:1: ( (lv_annotations_3_0= ruleAnnotation ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_COMMENT_ANNOTATION||LA32_0==25) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2115:1: (lv_annotations_3_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2115:1: (lv_annotations_3_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2116:3: lv_annotations_3_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTagAnnotation4480);
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
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTagAnnotation4493); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2144:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2145:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2146:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation4531);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation4541); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2153:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2156:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2157:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2157:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2157:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleKeyStringValueAnnotation4578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2161:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2162:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2162:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2163:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation4599);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2179:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2180:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2180:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2181:3: lv_value_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation4620);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2197:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==RULE_COMMENT_ANNOTATION||LA35_1==21||LA35_1==25) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2197:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleKeyStringValueAnnotation4633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2201:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_COMMENT_ANNOTATION||LA34_0==25) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2202:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2202:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2203:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation4654);
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
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleKeyStringValueAnnotation4667); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2231:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2232:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2233:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation4705);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation4715); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2240:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2243:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2244:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2244:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2244:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTypedKeyStringValueAnnotation4752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2248:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2249:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2249:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2250:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation4773);
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

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTypedKeyStringValueAnnotation4785); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2270:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2271:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2271:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2272:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation4806);
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

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTypedKeyStringValueAnnotation4818); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2292:1: ( (lv_value_5_0= ruleEString ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2293:1: (lv_value_5_0= ruleEString )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2293:1: (lv_value_5_0= ruleEString )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2294:3: lv_value_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation4839);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2310:2: (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_COMMENT_ANNOTATION||LA37_1==21||LA37_1==25) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2310:4: otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTypedKeyStringValueAnnotation4852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2314:1: ( (lv_annotations_7_0= ruleAnnotation ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_COMMENT_ANNOTATION||LA36_0==25) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2315:1: (lv_annotations_7_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2315:1: (lv_annotations_7_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2316:3: lv_annotations_7_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation4873);
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTypedKeyStringValueAnnotation4886); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2344:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2345:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2346:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation4924);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation4934); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2353:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2356:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2357:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2357:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2357:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleKeyBooleanValueAnnotation4971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2361:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2362:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2362:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2363:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation4992);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2379:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2380:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2380:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2381:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation5009); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2397:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==20) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==RULE_COMMENT_ANNOTATION||LA39_1==21||LA39_1==25) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2397:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleKeyBooleanValueAnnotation5027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2401:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_COMMENT_ANNOTATION||LA38_0==25) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2402:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2402:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2403:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation5048);
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
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleKeyBooleanValueAnnotation5061); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2431:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2432:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2433:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation5099);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation5109); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2440:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2443:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2444:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2444:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2444:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleKeyIntValueAnnotation5146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2448:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2449:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2449:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2450:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation5167);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2466:2: ( (lv_value_2_0= RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2467:1: (lv_value_2_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2467:1: (lv_value_2_0= RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2468:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation5184); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2484:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==RULE_COMMENT_ANNOTATION||LA41_1==21||LA41_1==25) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2484:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleKeyIntValueAnnotation5202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2488:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_COMMENT_ANNOTATION||LA40_0==25) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2489:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2489:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2490:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation5223);
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
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleKeyIntValueAnnotation5236); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2518:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2519:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2520:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation5274);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation5284); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2527:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2530:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2531:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2531:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2531:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleKeyFloatValueAnnotation5321); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2535:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2536:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2536:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2537:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation5342);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2553:2: ( (lv_value_2_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2554:1: (lv_value_2_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2554:1: (lv_value_2_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2555:3: lv_value_2_0= RULE_FLOAT
            {
            lv_value_2_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation5359); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2571:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==20) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_COMMENT_ANNOTATION||LA43_1==21||LA43_1==25) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2571:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleKeyFloatValueAnnotation5377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2575:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_COMMENT_ANNOTATION||LA42_0==25) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2576:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2576:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2577:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation5398);
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
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleKeyFloatValueAnnotation5411); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2607:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2608:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2609:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString5452);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString5463); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2616:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2619:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2620:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2620:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2620:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString5503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2628:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString5529); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2643:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2644:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2645:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID5575);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID5586); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2652:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2655:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2656:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2656:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2656:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID5626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2663:1: (kw= '.' this_ID_2= RULE_ID )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==26) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2664:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleExtendedID5645); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID5660); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2684:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= ':' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2686:28: ( (enumLiteral_0= ':' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2687:1: (enumLiteral_0= ':' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2687:1: (enumLiteral_0= ':' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2687:3: enumLiteral_0= ':'
            {
            enumLiteral_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDivOperator5720); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2697:1: ruleHistoryType returns [Enumerator current=null] : ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) ;
    public final Enumerator ruleHistoryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2699:28: ( ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2700:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2700:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt46=1;
                }
                break;
            case 29:
                {
                alt46=2;
                }
                break;
            case 30:
                {
                alt46=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2700:2: (enumLiteral_0= 'reset' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2700:2: (enumLiteral_0= 'reset' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2700:4: enumLiteral_0= 'reset'
                    {
                    enumLiteral_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleHistoryType5764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getRESETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getHistoryTypeAccess().getRESETEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2706:6: (enumLiteral_1= 'shallow history' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2706:6: (enumLiteral_1= 'shallow history' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2706:8: enumLiteral_1= 'shallow history'
                    {
                    enumLiteral_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleHistoryType5781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getSHALLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getHistoryTypeAccess().getSHALLOWEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2712:6: (enumLiteral_2= 'history' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2712:6: (enumLiteral_2= 'history' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2712:8: enumLiteral_2= 'history'
                    {
                    enumLiteral_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleHistoryType5798); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2722:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2724:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2725:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2725:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) )
            int alt47=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt47=1;
                }
                break;
            case 32:
                {
                alt47=2;
                }
                break;
            case 33:
                {
                alt47=3;
                }
                break;
            case 34:
                {
                alt47=4;
                }
                break;
            case 35:
                {
                alt47=5;
                }
                break;
            case 36:
                {
                alt47=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2725:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2725:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2725:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCompareOperator5843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2731:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2731:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2731:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCompareOperator5860); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2737:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2737:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2737:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCompareOperator5877); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2743:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2743:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2743:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleCompareOperator5894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2749:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2749:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2749:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleCompareOperator5911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2755:6: (enumLiteral_5= '<>' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2755:6: (enumLiteral_5= '<>' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2755:8: enumLiteral_5= '<>'
                    {
                    enumLiteral_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleCompareOperator5928); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2765:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2767:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2768:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2768:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2768:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulePreOperator5972); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2778:1: ruleOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2780:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2781:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2781:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2781:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleOrOperator6015); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2791:1: ruleAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2793:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2794:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2794:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2794:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAndOperator6058); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2804:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2806:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2807:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2807:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2807:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleNotOperator6101); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2817:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2819:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2820:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2820:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2820:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAddOperator6144); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2830:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2832:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2833:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2833:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2833:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleSubOperator6187); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2843:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2845:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2846:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2846:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2846:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMultOperator6230); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2856:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2858:28: ( (enumLiteral_0= '%' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2859:1: (enumLiteral_0= '%' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2859:1: (enumLiteral_0= '%' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2859:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleModOperator6273); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2869:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2871:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2872:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2872:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2872:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleValOperator6316); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2882:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2884:28: ( (enumLiteral_0= '||' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2885:1: (enumLiteral_0= '||' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2885:1: (enumLiteral_0= '||' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2885:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleLogicalOrOperator6359); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2895:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2897:28: ( (enumLiteral_0= '&&' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2898:1: (enumLiteral_0= '&&' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2898:1: (enumLiteral_0= '&&' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2898:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleLogicalAndOperator6402); if (state.failed) return current;
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

    // $ANTLR start synpred12_InternalActions
    public final void synpred12_InternalActions_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:494:2: (this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:494:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred12_InternalActions976);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalActions

    // $ANTLR start synpred15_InternalActions
    public final void synpred15_InternalActions_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_1 = null;

        Enumerator lv_operator_2_2 = null;

        EObject lv_subExpressions_3_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:584:2: ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:584:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:584:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
        loop51:
        do {
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==38||LA51_0==46) ) {
                alt51=1;
            }


            switch (alt51) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:584:3: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:584:3: ()
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:585:2: 
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	  /* */ 
        	      	
        	    }

        	    }

        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:593:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:594:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:594:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:595:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:595:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
        	    int alt50=2;
        	    int LA50_0 = input.LA(1);

        	    if ( (LA50_0==38) ) {
        	        alt50=1;
        	    }
        	    else if ( (LA50_0==46) ) {
        	        alt50=2;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        NoViableAltException nvae =
        	            new NoViableAltException("", 50, 0, input);

        	        throw nvae;
        	    }
        	    switch (alt50) {
        	        case 1 :
        	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:596:3: lv_operator_2_1= ruleOrOperator
        	            {
        	            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_synpred15_InternalActions1230);
        	            lv_operator_2_1=ruleOrOperator();

        	            state._fsp--;
        	            if (state.failed) return ;

        	            }
        	            break;
        	        case 2 :
        	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:611:8: lv_operator_2_2= ruleLogicalOrOperator
        	            {
        	            if ( state.backtracking==0 ) {
        	               
        	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_0_1_0_1()); 
        	              	    
        	            }
        	            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_synpred15_InternalActions1249);
        	            lv_operator_2_2=ruleLogicalOrOperator();

        	            state._fsp--;
        	            if (state.failed) return ;

        	            }
        	            break;

        	    }


        	    }


        	    }

        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:629:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:630:1: (lv_subExpressions_3_0= ruleCompareOperation )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:630:1: (lv_subExpressions_3_0= ruleCompareOperation )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:631:3: lv_subExpressions_3_0= ruleCompareOperation
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_0_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_synpred15_InternalActions1273);
        	    lv_subExpressions_3_0=ruleCompareOperation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop51;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred15_InternalActions

    // $ANTLR start synpred18_InternalActions
    public final void synpred18_InternalActions_fragment() throws RecognitionException {   
        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:732:2: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:732:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:732:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:733:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred18_InternalActions1460);
        this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:744:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:744:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:744:2: ()
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:745:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:753:2: ( (lv_operator_2_0= ruleCompareOperator ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:754:1: (lv_operator_2_0= ruleCompareOperator )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:754:1: (lv_operator_2_0= ruleCompareOperator )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:755:3: lv_operator_2_0= ruleCompareOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_synpred18_InternalActions1493);
        lv_operator_2_0=ruleCompareOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:771:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:772:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:772:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:773:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred18_InternalActions1514);
        lv_subExpressions_3_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalActions

    // $ANTLR start synpred19_InternalActions
    public final void synpred19_InternalActions_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:824:2: (this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:824:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred19_InternalActions1642);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalActions

    // $ANTLR start synpred32_InternalActions
    public final void synpred32_InternalActions_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ValuedExpression_3 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1556:6: ( (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1556:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1556:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1556:8: otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')'
        {
        otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_synpred32_InternalActions3193); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred32_InternalActions3218);
        this_ValuedExpression_3=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_synpred32_InternalActions3229); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalActions

    // $ANTLR start synpred37_InternalActions
    public final void synpred37_InternalActions_fragment() throws RecognitionException {   
        EObject this_TagAnnotation_1 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1950:2: (this_TagAnnotation_1= ruleTagAnnotation )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1950:2: this_TagAnnotation_1= ruleTagAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_synpred37_InternalActions4100);
        this_TagAnnotation_1=ruleTagAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalActions

    // $ANTLR start synpred38_InternalActions
    public final void synpred38_InternalActions_fragment() throws RecognitionException {   
        EObject this_KeyStringValueAnnotation_2 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1963:2: (this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1963:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_synpred38_InternalActions4130);
        this_KeyStringValueAnnotation_2=ruleKeyStringValueAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalActions

    // $ANTLR start synpred39_InternalActions
    public final void synpred39_InternalActions_fragment() throws RecognitionException {   
        EObject this_TypedKeyStringValueAnnotation_3 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1976:2: (this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1976:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_synpred39_InternalActions4160);
        this_TypedKeyStringValueAnnotation_3=ruleTypedKeyStringValueAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalActions

    // $ANTLR start synpred40_InternalActions
    public final void synpred40_InternalActions_fragment() throws RecognitionException {   
        EObject this_KeyBooleanValueAnnotation_4 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1989:2: (this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:1989:2: this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_synpred40_InternalActions4190);
        this_KeyBooleanValueAnnotation_4=ruleKeyBooleanValueAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalActions

    // $ANTLR start synpred41_InternalActions
    public final void synpred41_InternalActions_fragment() throws RecognitionException {   
        EObject this_KeyIntValueAnnotation_5 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2002:2: (this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/actions/parser/antlr/internal/InternalActions.g:2002:2: this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_synpred41_InternalActions4220);
        this_KeyIntValueAnnotation_5=ruleKeyIntValueAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalActions

    // Delegated rules

    public final boolean synpred37_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalActions_fragment(); // can never throw exception
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
    public final boolean synpred12_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalActions_fragment(); // can never throw exception
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
    public final boolean synpred39_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalActions_fragment(); // can never throw exception
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA3_eotS =
        "\22\uffff";
    static final String DFA3_eofS =
        "\1\2\21\uffff";
    static final String DFA3_minS =
        "\1\4\1\0\20\uffff";
    static final String DFA3_maxS =
        "\1\55\1\0\20\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\16\uffff\1\1";
    static final String DFA3_specialS =
        "\1\uffff\1\0\20\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\4\2\10\uffff\2\2\1\uffff\1\2\7\uffff\3\2\6\uffff\1\2\2"+
            "\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
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
                        if ( (synpred3_InternalActions()) ) {s = 17;}

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
    static final String DFA11_eotS =
        "\14\uffff";
    static final String DFA11_eofS =
        "\14\uffff";
    static final String DFA11_minS =
        "\1\4\11\0\2\uffff";
    static final String DFA11_maxS =
        "\1\55\11\0\2\uffff";
    static final String DFA11_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA11_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\10\1\11\1\3\1\5\13\uffff\1\4\20\uffff\1\6\2\uffff\1"+
            "\12\1\uffff\1\1\2\uffff\1\7",
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

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "493:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\14\uffff";
    static final String DFA17_eofS =
        "\14\uffff";
    static final String DFA17_minS =
        "\1\4\3\uffff\7\0\1\uffff";
    static final String DFA17_maxS =
        "\1\55\3\uffff\7\0\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA17_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\10\1\11\1\1\1\5\13\uffff\1\4\20\uffff\1\6\2\uffff\1"+
            "\12\1\uffff\1\1\2\uffff\1\7",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "732:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_9 = input.LA(1);

                         
                        int index17_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_10 = input.LA(1);

                         
                        int index17_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index17_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\13\uffff";
    static final String DFA18_eofS =
        "\13\uffff";
    static final String DFA18_minS =
        "\1\4\3\uffff\6\0\1\uffff";
    static final String DFA18_maxS =
        "\1\55\3\uffff\6\0\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\10\uffff\1\2";
    static final String DFA18_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\10\1\11\1\1\1\5\13\uffff\1\4\20\uffff\1\6\2\uffff\1"+
            "\12\1\uffff\1\1\2\uffff\1\7",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "823:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\12\uffff";
    static final String DFA27_eofS =
        "\12\uffff";
    static final String DFA27_minS =
        "\1\4\2\uffff\1\0\6\uffff";
    static final String DFA27_maxS =
        "\1\55\2\uffff\1\0\6\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\4\uffff\1\3";
    static final String DFA27_specialS =
        "\3\uffff\1\0\6\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\2\4\1\2\1\4\13\uffff\1\3\20\uffff\1\4\7\uffff\1\4",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1530:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_3 = input.LA(1);

                         
                        int index27_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalActions()) ) {s = 9;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index27_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTransition149 = new BitSet(new long[]{0x00002520721703F2L});
        public static final BitSet FOLLOW_16_in_ruleTransition168 = new BitSet(new long[]{0x00002520701601F2L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTransition199 = new BitSet(new long[]{0x00002520701601F2L});
        public static final BitSet FOLLOW_17_in_ruleTransition223 = new BitSet(new long[]{0x00002520701401F2L});
        public static final BitSet FOLLOW_ruleHistoryType_in_ruleTransition258 = new BitSet(new long[]{0x00002520001401F2L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleTransition280 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleTransition294 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition315 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleTransition328 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition349 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEffect407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_ruleEffect457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission552 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmission562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmission611 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleEmission624 = new BitSet(new long[]{0x00002520001001F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEmission645 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEmission657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment695 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment754 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAssignment766 = new BitSet(new long[]{0x00002520001001F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect823 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextEffect874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression1006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1041 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression1051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrAndExpression_in_ruleBoolExpression1100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrAndExpression_in_entryRuleOrAndExpression1134 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrAndExpression1144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression1194 = new BitSet(new long[]{0x0000C0C000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrAndExpression1230 = new BitSet(new long[]{0x00002520001001F0L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleOrAndExpression1249 = new BitSet(new long[]{0x00002520001001F0L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression1273 = new BitSet(new long[]{0x0000404000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_ruleOrAndExpression1317 = new BitSet(new long[]{0x00002520001001F0L});
        public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleOrAndExpression1336 = new BitSet(new long[]{0x00002520001001F0L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression1360 = new BitSet(new long[]{0x0000808000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1399 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation1409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1460 = new BitSet(new long[]{0x0000001F80000000L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation1493 = new BitSet(new long[]{0x00002520001001F0L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleCompareOperation1547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression1582 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression1592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression1642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression1672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression1707 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression1717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression1776 = new BitSet(new long[]{0x00002520001001F0L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression1797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression1829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression1864 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression1874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression1923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression1957 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression1967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression2017 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression2050 = new BitSet(new long[]{0x00002420001001F0L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression2071 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression2109 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression2119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression2169 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression2202 = new BitSet(new long[]{0x00002420001001F0L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression2223 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression2261 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression2271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression2321 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression2354 = new BitSet(new long[]{0x00002420001001F0L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression2375 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression2413 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression2423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression2473 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression2506 = new BitSet(new long[]{0x00002420001001F0L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression2527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression2565 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression2575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression2625 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression2658 = new BitSet(new long[]{0x00002420001001F0L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression2679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression2717 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression2727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression2786 = new BitSet(new long[]{0x00002420001001F0L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression2807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression2839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression2874 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression2884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression2934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression2964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAtomicExpression2982 = new BitSet(new long[]{0x00002520001001F0L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression3007 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAtomicExpression3018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression3050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression3085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression3095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression3145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression3175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAtomicValuedExpression3193 = new BitSet(new long[]{0x00002420001001F0L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression3218 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAtomicValuedExpression3229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression3261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression3296 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression3306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression3367 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression3386 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleValuedObjectTestExpression3401 = new BitSet(new long[]{0x0000202000000020L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression3422 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleValuedObjectTestExpression3434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression3466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference3501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference3511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference3560 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_23_in_ruleValuedObjectReference3573 = new BitSet(new long[]{0x00002520001001F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObjectReference3594 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleValuedObjectReference3606 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression3644 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression3654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression3695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue3735 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue3745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue3786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue3826 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue3836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue3877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue3917 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue3927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue3968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4010 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation4070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation4100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation4130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation4160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation4190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation4220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation4250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation4287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation4297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation4338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation4378 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation4388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleTagAnnotation4425 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation4446 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleTagAnnotation4459 = new BitSet(new long[]{0x00002520723703F0L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTagAnnotation4480 = new BitSet(new long[]{0x00002520723703F0L});
        public static final BitSet FOLLOW_21_in_ruleTagAnnotation4493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation4531 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation4541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleKeyStringValueAnnotation4578 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation4599 = new BitSet(new long[]{0x0000000000000420L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation4620 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleKeyStringValueAnnotation4633 = new BitSet(new long[]{0x00002520723703F0L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation4654 = new BitSet(new long[]{0x00002520723703F0L});
        public static final BitSet FOLLOW_21_in_ruleKeyStringValueAnnotation4667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation4705 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation4715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleTypedKeyStringValueAnnotation4752 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation4773 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleTypedKeyStringValueAnnotation4785 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation4806 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTypedKeyStringValueAnnotation4818 = new BitSet(new long[]{0x0000000000000420L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation4839 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleTypedKeyStringValueAnnotation4852 = new BitSet(new long[]{0x00002520723703F0L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation4873 = new BitSet(new long[]{0x00002520723703F0L});
        public static final BitSet FOLLOW_21_in_ruleTypedKeyStringValueAnnotation4886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation4924 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation4934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleKeyBooleanValueAnnotation4971 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation4992 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation5009 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleKeyBooleanValueAnnotation5027 = new BitSet(new long[]{0x00002520723703F0L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation5048 = new BitSet(new long[]{0x00002520723703F0L});
        public static final BitSet FOLLOW_21_in_ruleKeyBooleanValueAnnotation5061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation5099 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation5109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleKeyIntValueAnnotation5146 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation5167 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation5184 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleKeyIntValueAnnotation5202 = new BitSet(new long[]{0x00002520723703F0L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation5223 = new BitSet(new long[]{0x00002520723703F0L});
        public static final BitSet FOLLOW_21_in_ruleKeyIntValueAnnotation5236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation5274 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation5284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleKeyFloatValueAnnotation5321 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation5342 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation5359 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleKeyFloatValueAnnotation5377 = new BitSet(new long[]{0x00002520723703F0L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation5398 = new BitSet(new long[]{0x00002520723703F0L});
        public static final BitSet FOLLOW_21_in_ruleKeyFloatValueAnnotation5411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString5452 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString5463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString5503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString5529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID5575 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID5586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID5626 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleExtendedID5645 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID5660 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_27_in_ruleDivOperator5720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleHistoryType5764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleHistoryType5781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleHistoryType5798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCompareOperator5843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleCompareOperator5860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleCompareOperator5877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleCompareOperator5894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleCompareOperator5911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleCompareOperator5928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rulePreOperator5972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleOrOperator6015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleAndOperator6058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleNotOperator6101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleAddOperator6144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleSubOperator6187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleMultOperator6230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleModOperator6273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleValOperator6316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleLogicalOrOperator6359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleLogicalAndOperator6402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred3_InternalActions199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred12_InternalActions976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_synpred15_InternalActions1230 = new BitSet(new long[]{0x00002520001001F0L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_synpred15_InternalActions1249 = new BitSet(new long[]{0x00002520001001F0L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_synpred15_InternalActions1273 = new BitSet(new long[]{0x0000404000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred18_InternalActions1460 = new BitSet(new long[]{0x0000001F80000000L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_synpred18_InternalActions1493 = new BitSet(new long[]{0x00002520001001F0L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred18_InternalActions1514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred19_InternalActions1642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_synpred32_InternalActions3193 = new BitSet(new long[]{0x00002420001001F0L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred32_InternalActions3218 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_synpred32_InternalActions3229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_synpred37_InternalActions4100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_synpred38_InternalActions4130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_synpred39_InternalActions4160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_synpred40_InternalActions4190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_synpred41_InternalActions4220 = new BitSet(new long[]{0x0000000000000002L});
    }


}