package de.cau.cs.kieler.kexpressions.keffects.parser.antlr.internal;

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
import de.cau.cs.kieler.kexpressions.keffects.services.KEffectsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKEffectsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HOSTCODE", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'schedule'", "'('", "')'", "','", "'()'", "'extern'", "'print'", "'randomize'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "':'", "'\\''", "'['", "']'", "'.'", "'random'", "'!'", "'{'", "'}'", "'_'", "'null'", "'#'", "'@'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'>>>='", "'min='", "'max='", "'++'", "'--'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'pre'", "'~'", "'val'", "'?'", "'->'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=4;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_SL_COMMENT_ANNOTATION=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NUMBER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalKEffectsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKEffectsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKEffectsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKEffects.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private KEffectsGrammarAccess grammarAccess;

        public InternalKEffectsParser(TokenStream input, KEffectsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Effect";
       	}

       	@Override
       	protected KEffectsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEffect"
    // InternalKEffects.g:71:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalKEffects.g:71:47: (iv_ruleEffect= ruleEffect EOF )
            // InternalKEffects.g:72:2: iv_ruleEffect= ruleEffect EOF
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
    // InternalKEffects.g:78:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_ValuedEmission_2= ruleValuedEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect | this_RandomizeCallEffect_7= ruleRandomizeCallEffect | this_PureEmission_8= rulePureEmission ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_PostfixEffect_1 = null;

        EObject this_ValuedEmission_2 = null;

        EObject this_HostcodeEffect_3 = null;

        EObject this_ReferenceCallEffect_4 = null;

        EObject this_FunctionCallEffect_5 = null;

        EObject this_PrintCallEffect_6 = null;

        EObject this_RandomizeCallEffect_7 = null;

        EObject this_PureEmission_8 = null;



        	enterRule();

        try {
            // InternalKEffects.g:84:2: ( (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_ValuedEmission_2= ruleValuedEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect | this_RandomizeCallEffect_7= ruleRandomizeCallEffect | this_PureEmission_8= rulePureEmission ) )
            // InternalKEffects.g:85:2: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_ValuedEmission_2= ruleValuedEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect | this_RandomizeCallEffect_7= ruleRandomizeCallEffect | this_PureEmission_8= rulePureEmission )
            {
            // InternalKEffects.g:85:2: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_ValuedEmission_2= ruleValuedEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect | this_RandomizeCallEffect_7= ruleRandomizeCallEffect | this_PureEmission_8= rulePureEmission )
            int alt1=9;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalKEffects.g:86:3: this_Assignment_0= ruleAssignment
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
                    // InternalKEffects.g:98:3: this_PostfixEffect_1= rulePostfixEffect
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
                    // InternalKEffects.g:110:3: this_ValuedEmission_2= ruleValuedEmission
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEffectAccess().getValuedEmissionParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedEmission_2=ruleValuedEmission();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValuedEmission_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKEffects.g:122:3: this_HostcodeEffect_3= ruleHostcodeEffect
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
                    // InternalKEffects.g:134:3: this_ReferenceCallEffect_4= ruleReferenceCallEffect
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
                    // InternalKEffects.g:146:3: this_FunctionCallEffect_5= ruleFunctionCallEffect
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
                    // InternalKEffects.g:158:3: this_PrintCallEffect_6= rulePrintCallEffect
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
                case 8 :
                    // InternalKEffects.g:170:3: this_RandomizeCallEffect_7= ruleRandomizeCallEffect
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEffectAccess().getRandomizeCallEffectParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RandomizeCallEffect_7=ruleRandomizeCallEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RandomizeCallEffect_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalKEffects.g:182:3: this_PureEmission_8= rulePureEmission
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEffectAccess().getPureEmissionParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PureEmission_8=rulePureEmission();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PureEmission_8;
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


    // $ANTLR start "entryRulePureEmission"
    // InternalKEffects.g:197:1: entryRulePureEmission returns [EObject current=null] : iv_rulePureEmission= rulePureEmission EOF ;
    public final EObject entryRulePureEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureEmission = null;


        try {
            // InternalKEffects.g:197:53: (iv_rulePureEmission= rulePureEmission EOF )
            // InternalKEffects.g:198:2: iv_rulePureEmission= rulePureEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPureEmissionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePureEmission=rulePureEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePureEmission; 
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
    // $ANTLR end "entryRulePureEmission"


    // $ANTLR start "rulePureEmission"
    // InternalKEffects.g:204:1: rulePureEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject rulePureEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_reference_1_0 = null;

        EObject lv_schedule_3_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:210:2: ( ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKEffects.g:211:2: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKEffects.g:211:2: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKEffects.g:212:3: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKEffects.g:212:3: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMENT_ANNOTATION||LA2_0==50) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKEffects.g:213:4: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    {
            	    // InternalKEffects.g:213:4: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    // InternalKEffects.g:214:5: lv_annotations_0_0= ruleQuotedStringAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPureEmissionAccess().getAnnotationsQuotedStringAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_annotations_0_0=ruleQuotedStringAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPureEmissionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_0_0,
            	      						"de.cau.cs.kieler.kexpressions.KExpressions.QuotedStringAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalKEffects.g:231:3: ( (lv_reference_1_0= ruleValuedObjectReference ) )
            // InternalKEffects.g:232:4: (lv_reference_1_0= ruleValuedObjectReference )
            {
            // InternalKEffects.g:232:4: (lv_reference_1_0= ruleValuedObjectReference )
            // InternalKEffects.g:233:5: lv_reference_1_0= ruleValuedObjectReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPureEmissionAccess().getReferenceValuedObjectReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_reference_1_0=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPureEmissionRule());
              					}
              					set(
              						current,
              						"reference",
              						lv_reference_1_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKEffects.g:250:3: (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKEffects.g:251:4: otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPureEmissionAccess().getScheduleKeyword_2_0());
                      			
                    }
                    // InternalKEffects.g:255:4: ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalKEffects.g:256:5: (lv_schedule_3_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKEffects.g:256:5: (lv_schedule_3_0= ruleScheduleObjectReference )
                    	    // InternalKEffects.g:257:6: lv_schedule_3_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getPureEmissionAccess().getScheduleScheduleObjectReferenceParserRuleCall_2_1_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_schedule_3_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getPureEmissionRule());
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
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
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
    // $ANTLR end "rulePureEmission"


    // $ANTLR start "entryRuleValuedEmission"
    // InternalKEffects.g:279:1: entryRuleValuedEmission returns [EObject current=null] : iv_ruleValuedEmission= ruleValuedEmission EOF ;
    public final EObject entryRuleValuedEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedEmission = null;


        try {
            // InternalKEffects.g:279:55: (iv_ruleValuedEmission= ruleValuedEmission EOF )
            // InternalKEffects.g:280:2: iv_ruleValuedEmission= ruleValuedEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedEmissionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedEmission=ruleValuedEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedEmission; 
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
    // $ANTLR end "entryRuleValuedEmission"


    // $ANTLR start "ruleValuedEmission"
    // InternalKEffects.g:286:1: ruleValuedEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject ruleValuedEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_reference_1_0 = null;

        EObject lv_newValue_3_0 = null;

        EObject lv_schedule_6_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:292:2: ( ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKEffects.g:293:2: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKEffects.g:293:2: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKEffects.g:294:3: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKEffects.g:294:3: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMENT_ANNOTATION||LA5_0==50) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKEffects.g:295:4: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    {
            	    // InternalKEffects.g:295:4: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    // InternalKEffects.g:296:5: lv_annotations_0_0= ruleQuotedStringAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getValuedEmissionAccess().getAnnotationsQuotedStringAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_annotations_0_0=ruleQuotedStringAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getValuedEmissionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_0_0,
            	      						"de.cau.cs.kieler.kexpressions.KExpressions.QuotedStringAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalKEffects.g:313:3: ( (lv_reference_1_0= ruleValuedObjectReference ) )
            // InternalKEffects.g:314:4: (lv_reference_1_0= ruleValuedObjectReference )
            {
            // InternalKEffects.g:314:4: (lv_reference_1_0= ruleValuedObjectReference )
            // InternalKEffects.g:315:5: lv_reference_1_0= ruleValuedObjectReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getValuedEmissionAccess().getReferenceValuedObjectReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_7);
            lv_reference_1_0=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getValuedEmissionRule());
              					}
              					set(
              						current,
              						"reference",
              						lv_reference_1_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getValuedEmissionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalKEffects.g:336:3: ( (lv_newValue_3_0= ruleExpression ) )
            // InternalKEffects.g:337:4: (lv_newValue_3_0= ruleExpression )
            {
            // InternalKEffects.g:337:4: (lv_newValue_3_0= ruleExpression )
            // InternalKEffects.g:338:5: lv_newValue_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getValuedEmissionAccess().getNewValueExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_9);
            lv_newValue_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getValuedEmissionRule());
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

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getValuedEmissionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalKEffects.g:359:3: (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKEffects.g:360:4: otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getValuedEmissionAccess().getScheduleKeyword_5_0());
                      			
                    }
                    // InternalKEffects.g:364:4: ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKEffects.g:365:5: (lv_schedule_6_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKEffects.g:365:5: (lv_schedule_6_0= ruleScheduleObjectReference )
                    	    // InternalKEffects.g:366:6: lv_schedule_6_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getValuedEmissionAccess().getScheduleScheduleObjectReferenceParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_schedule_6_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getValuedEmissionRule());
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
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
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
    // $ANTLR end "ruleValuedEmission"


    // $ANTLR start "entryRuleAssignment"
    // InternalKEffects.g:388:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalKEffects.g:388:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalKEffects.g:389:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalKEffects.g:395:1: ruleAssignment returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= ruleAssignOperator ) ) ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'schedule' ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_reference_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_schedule_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:401:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= ruleAssignOperator ) ) ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'schedule' ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKEffects.g:402:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= ruleAssignOperator ) ) ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'schedule' ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKEffects.g:402:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= ruleAssignOperator ) ) ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'schedule' ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKEffects.g:403:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= ruleAssignOperator ) ) ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'schedule' ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKEffects.g:403:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMENT_ANNOTATION||LA8_0==50) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKEffects.g:404:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEffects.g:404:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEffects.g:405:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAssignmentAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
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
            	      						"de.cau.cs.kieler.kexpressions.KExpressions.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalKEffects.g:422:3: ( (lv_reference_1_0= ruleValuedObjectReference ) )
            // InternalKEffects.g:423:4: (lv_reference_1_0= ruleValuedObjectReference )
            {
            // InternalKEffects.g:423:4: (lv_reference_1_0= ruleValuedObjectReference )
            // InternalKEffects.g:424:5: lv_reference_1_0= ruleValuedObjectReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getReferenceValuedObjectReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_reference_1_0=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"reference",
              						lv_reference_1_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKEffects.g:441:3: ( (lv_operator_2_0= ruleAssignOperator ) )
            // InternalKEffects.g:442:4: (lv_operator_2_0= ruleAssignOperator )
            {
            // InternalKEffects.g:442:4: (lv_operator_2_0= ruleAssignOperator )
            // InternalKEffects.g:443:5: lv_operator_2_0= ruleAssignOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getOperatorAssignOperatorEnumRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_8);
            lv_operator_2_0=ruleAssignOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_2_0,
              						"de.cau.cs.kieler.kexpressions.keffects.KEffects.AssignOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKEffects.g:460:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalKEffects.g:461:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalKEffects.g:461:4: (lv_expression_3_0= ruleExpression )
            // InternalKEffects.g:462:5: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_3_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKEffects.g:479:3: (otherlv_4= 'schedule' ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKEffects.g:480:4: otherlv_4= 'schedule' ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getScheduleKeyword_4_0());
                      			
                    }
                    // InternalKEffects.g:484:4: ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalKEffects.g:485:5: (lv_schedule_5_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKEffects.g:485:5: (lv_schedule_5_0= ruleScheduleObjectReference )
                    	    // InternalKEffects.g:486:6: lv_schedule_5_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getAssignmentAccess().getScheduleScheduleObjectReferenceParserRuleCall_4_1_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_schedule_5_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"schedule",
                    	      							lv_schedule_5_0,
                    	      							"de.cau.cs.kieler.kexpressions.KExpressions.ScheduleObjectReference");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
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
    // InternalKEffects.g:508:1: entryRulePostfixEffect returns [EObject current=null] : iv_rulePostfixEffect= rulePostfixEffect EOF ;
    public final EObject entryRulePostfixEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixEffect = null;


        try {
            // InternalKEffects.g:508:54: (iv_rulePostfixEffect= rulePostfixEffect EOF )
            // InternalKEffects.g:509:2: iv_rulePostfixEffect= rulePostfixEffect EOF
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
    // InternalKEffects.g:515:1: rulePostfixEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= rulePostfixOperator ) ) (otherlv_3= 'schedule' ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject rulePostfixEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_reference_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_schedule_4_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:521:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= rulePostfixOperator ) ) (otherlv_3= 'schedule' ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKEffects.g:522:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= rulePostfixOperator ) ) (otherlv_3= 'schedule' ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKEffects.g:522:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= rulePostfixOperator ) ) (otherlv_3= 'schedule' ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKEffects.g:523:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= rulePostfixOperator ) ) (otherlv_3= 'schedule' ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKEffects.g:523:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMENT_ANNOTATION||LA11_0==50) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKEffects.g:524:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEffects.g:524:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEffects.g:525:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPostfixEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
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
            	      						"de.cau.cs.kieler.kexpressions.KExpressions.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalKEffects.g:542:3: ( (lv_reference_1_0= ruleValuedObjectReference ) )
            // InternalKEffects.g:543:4: (lv_reference_1_0= ruleValuedObjectReference )
            {
            // InternalKEffects.g:543:4: (lv_reference_1_0= ruleValuedObjectReference )
            // InternalKEffects.g:544:5: lv_reference_1_0= ruleValuedObjectReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPostfixEffectAccess().getReferenceValuedObjectReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
            lv_reference_1_0=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
              					}
              					set(
              						current,
              						"reference",
              						lv_reference_1_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKEffects.g:561:3: ( (lv_operator_2_0= rulePostfixOperator ) )
            // InternalKEffects.g:562:4: (lv_operator_2_0= rulePostfixOperator )
            {
            // InternalKEffects.g:562:4: (lv_operator_2_0= rulePostfixOperator )
            // InternalKEffects.g:563:5: lv_operator_2_0= rulePostfixOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPostfixEffectAccess().getOperatorPostfixOperatorEnumRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_operator_2_0=rulePostfixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_2_0,
              						"de.cau.cs.kieler.kexpressions.keffects.KEffects.PostfixOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKEffects.g:580:3: (otherlv_3= 'schedule' ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKEffects.g:581:4: otherlv_3= 'schedule' ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPostfixEffectAccess().getScheduleKeyword_3_0());
                      			
                    }
                    // InternalKEffects.g:585:4: ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalKEffects.g:586:5: (lv_schedule_4_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKEffects.g:586:5: (lv_schedule_4_0= ruleScheduleObjectReference )
                    	    // InternalKEffects.g:587:6: lv_schedule_4_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getPostfixEffectAccess().getScheduleScheduleObjectReferenceParserRuleCall_3_1_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_schedule_4_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"schedule",
                    	      							lv_schedule_4_0,
                    	      							"de.cau.cs.kieler.kexpressions.KExpressions.ScheduleObjectReference");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
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
    // InternalKEffects.g:609:1: entryRuleHostcodeEffect returns [EObject current=null] : iv_ruleHostcodeEffect= ruleHostcodeEffect EOF ;
    public final EObject entryRuleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostcodeEffect = null;


        try {
            // InternalKEffects.g:609:55: (iv_ruleHostcodeEffect= ruleHostcodeEffect EOF )
            // InternalKEffects.g:610:2: iv_ruleHostcodeEffect= ruleHostcodeEffect EOF
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
    // InternalKEffects.g:616:1: ruleHostcodeEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:622:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalKEffects.g:623:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalKEffects.g:623:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalKEffects.g:624:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalKEffects.g:624:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMENT_ANNOTATION||LA14_0==50) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKEffects.g:625:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEffects.g:625:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEffects.g:626:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
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
            	      						"de.cau.cs.kieler.kexpressions.KExpressions.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalKEffects.g:643:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalKEffects.g:644:4: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalKEffects.g:644:4: (lv_text_1_0= RULE_HOSTCODE )
            // InternalKEffects.g:645:5: lv_text_1_0= RULE_HOSTCODE
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
    // InternalKEffects.g:665:1: entryRuleReferenceCallEffect returns [EObject current=null] : iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF ;
    public final EObject entryRuleReferenceCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCallEffect = null;


        try {
            // InternalKEffects.g:665:60: (iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF )
            // InternalKEffects.g:666:2: iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF
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
    // InternalKEffects.g:672:1: ruleReferenceCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) ;
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
            // InternalKEffects.g:678:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) )
            // InternalKEffects.g:679:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            {
            // InternalKEffects.g:679:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            // InternalKEffects.g:680:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            {
            // InternalKEffects.g:680:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMENT_ANNOTATION||LA15_0==50) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKEffects.g:681:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEffects.g:681:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEffects.g:682:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
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
            	      						"de.cau.cs.kieler.kexpressions.KExpressions.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalKEffects.g:699:3: ( ( rulePrimeID ) )
            // InternalKEffects.g:700:4: ( rulePrimeID )
            {
            // InternalKEffects.g:700:4: ( rulePrimeID )
            // InternalKEffects.g:701:5: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_13);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKEffects.g:718:3: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            else if ( (LA17_0==21) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalKEffects.g:719:4: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalKEffects.g:719:4: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalKEffects.g:720:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getReferenceCallEffectAccess().getLeftParenthesisKeyword_2_0_0());
                      				
                    }
                    // InternalKEffects.g:724:5: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalKEffects.g:725:6: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalKEffects.g:725:6: (lv_parameters_3_0= ruleParameter )
                    // InternalKEffects.g:726:7: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getParametersParameterParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
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

                    // InternalKEffects.g:743:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==20) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalKEffects.g:744:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getReferenceCallEffectAccess().getCommaKeyword_2_0_2_0());
                    	      					
                    	    }
                    	    // InternalKEffects.g:748:6: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalKEffects.g:749:7: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalKEffects.g:749:7: (lv_parameters_5_0= ruleParameter )
                    	    // InternalKEffects.g:750:8: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getParametersParameterParserRuleCall_2_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_15);
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
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getReferenceCallEffectAccess().getRightParenthesisKeyword_2_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:774:4: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:783:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallEffect = null;


        try {
            // InternalKEffects.g:783:59: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // InternalKEffects.g:784:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
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
    // InternalKEffects.g:790:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) ;
    public final EObject ruleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_functionName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:796:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) )
            // InternalKEffects.g:797:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
            {
            // InternalKEffects.g:797:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
            // InternalKEffects.g:798:3: ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
            {
            // InternalKEffects.g:798:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMENT_ANNOTATION||LA18_0==50) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKEffects.g:799:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEffects.g:799:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEffects.g:800:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
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
            	      						"de.cau.cs.kieler.kexpressions.KExpressions.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalKEffects.g:817:3: (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
            // InternalKEffects.g:818:4: otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
            {
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getExternKeyword_1_0());
              			
            }
            // InternalKEffects.g:822:4: ( (lv_functionName_2_0= RULE_ID ) )
            // InternalKEffects.g:823:5: (lv_functionName_2_0= RULE_ID )
            {
            // InternalKEffects.g:823:5: (lv_functionName_2_0= RULE_ID )
            // InternalKEffects.g:824:6: lv_functionName_2_0= RULE_ID
            {
            lv_functionName_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(lv_functionName_2_0, grammarAccess.getFunctionCallEffectAccess().getFunctionNameIDTerminalRuleCall_1_1_0());
              					
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

            // InternalKEffects.g:840:4: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            else if ( (LA20_0==21) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalKEffects.g:841:5: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // InternalKEffects.g:841:5: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // InternalKEffects.g:842:6: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_1_2_0_0());
                      					
                    }
                    // InternalKEffects.g:846:6: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalKEffects.g:847:7: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalKEffects.g:847:7: (lv_parameters_4_0= ruleParameter )
                    // InternalKEffects.g:848:8: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_1_2_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
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

                    // InternalKEffects.g:865:6: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==20) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalKEffects.g:866:7: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_1_2_0_2_0());
                    	      						
                    	    }
                    	    // InternalKEffects.g:870:7: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalKEffects.g:871:8: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalKEffects.g:871:8: (lv_parameters_6_0= ruleParameter )
                    	    // InternalKEffects.g:872:9: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      									newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_1_2_0_2_1_0());
                    	      								
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_15);
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
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_1_2_0_3());
                      					
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:896:5: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_1_2_1());
                      				
                    }

                    }
                    break;

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
    // $ANTLR end "ruleFunctionCallEffect"


    // $ANTLR start "entryRulePrintCallEffect"
    // InternalKEffects.g:906:1: entryRulePrintCallEffect returns [EObject current=null] : iv_rulePrintCallEffect= rulePrintCallEffect EOF ;
    public final EObject entryRulePrintCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintCallEffect = null;


        try {
            // InternalKEffects.g:906:56: (iv_rulePrintCallEffect= rulePrintCallEffect EOF )
            // InternalKEffects.g:907:2: iv_rulePrintCallEffect= rulePrintCallEffect EOF
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
    // InternalKEffects.g:913:1: rulePrintCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) ) ;
    public final EObject rulePrintCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:919:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) ) )
            // InternalKEffects.g:920:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) )
            {
            // InternalKEffects.g:920:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) )
            // InternalKEffects.g:921:3: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            {
            // InternalKEffects.g:921:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMENT_ANNOTATION||LA21_0==50) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKEffects.g:922:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEffects.g:922:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEffects.g:923:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPrintCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
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
            	      						"de.cau.cs.kieler.kexpressions.KExpressions.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintCallEffectAccess().getPrintKeyword_1());
              		
            }
            // InternalKEffects.g:944:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            // InternalKEffects.g:945:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getPrintCallEffectAccess().getLeftParenthesisKeyword_2_0());
              			
            }
            // InternalKEffects.g:949:4: ( (lv_parameters_3_0= ruleParameter ) )
            // InternalKEffects.g:950:5: (lv_parameters_3_0= ruleParameter )
            {
            // InternalKEffects.g:950:5: (lv_parameters_3_0= ruleParameter )
            // InternalKEffects.g:951:6: lv_parameters_3_0= ruleParameter
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getPrintCallEffectAccess().getParametersParameterParserRuleCall_2_1_0());
              					
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_parameters_3_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getPrintCallEffectRule());
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

            // InternalKEffects.g:968:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKEffects.g:969:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_4, grammarAccess.getPrintCallEffectAccess().getCommaKeyword_2_2_0());
            	      				
            	    }
            	    // InternalKEffects.g:973:5: ( (lv_parameters_5_0= ruleParameter ) )
            	    // InternalKEffects.g:974:6: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // InternalKEffects.g:974:6: (lv_parameters_5_0= ruleParameter )
            	    // InternalKEffects.g:975:7: lv_parameters_5_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getPrintCallEffectAccess().getParametersParameterParserRuleCall_2_2_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_parameters_5_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getPrintCallEffectRule());
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
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getPrintCallEffectAccess().getRightParenthesisKeyword_2_3());
              			
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
    // $ANTLR end "rulePrintCallEffect"


    // $ANTLR start "entryRuleRandomizeCallEffect"
    // InternalKEffects.g:1002:1: entryRuleRandomizeCallEffect returns [EObject current=null] : iv_ruleRandomizeCallEffect= ruleRandomizeCallEffect EOF ;
    public final EObject entryRuleRandomizeCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomizeCallEffect = null;


        try {
            // InternalKEffects.g:1002:60: (iv_ruleRandomizeCallEffect= ruleRandomizeCallEffect EOF )
            // InternalKEffects.g:1003:2: iv_ruleRandomizeCallEffect= ruleRandomizeCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRandomizeCallEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRandomizeCallEffect=ruleRandomizeCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRandomizeCallEffect; 
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
    // $ANTLR end "entryRuleRandomizeCallEffect"


    // $ANTLR start "ruleRandomizeCallEffect"
    // InternalKEffects.g:1009:1: ruleRandomizeCallEffect returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ;
    public final EObject ruleRandomizeCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1015:2: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
            // InternalKEffects.g:1016:2: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
            {
            // InternalKEffects.g:1016:2: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
            // InternalKEffects.g:1017:3: () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
            {
            // InternalKEffects.g:1017:3: ()
            // InternalKEffects.g:1018:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRandomizeCallEffectAccess().getRandomizeCallEffectAction_0(),
              					current);
              			
            }

            }

            // InternalKEffects.g:1027:3: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_COMMENT_ANNOTATION||LA23_0==50) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKEffects.g:1028:4: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // InternalKEffects.g:1028:4: (lv_annotations_1_0= ruleAnnotation )
            	    // InternalKEffects.g:1029:5: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRandomizeCallEffectAccess().getAnnotationsAnnotationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_annotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRandomizeCallEffectRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_1_0,
            	      						"de.cau.cs.kieler.kexpressions.KExpressions.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRandomizeCallEffectAccess().getRandomizeKeyword_2());
              		
            }
            // InternalKEffects.g:1050:3: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            else if ( (LA25_0==21) ) {
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
                    // InternalKEffects.g:1051:4: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // InternalKEffects.g:1051:4: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // InternalKEffects.g:1052:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getRandomizeCallEffectAccess().getLeftParenthesisKeyword_3_0_0());
                      				
                    }
                    // InternalKEffects.g:1056:5: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalKEffects.g:1057:6: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalKEffects.g:1057:6: (lv_parameters_4_0= ruleParameter )
                    // InternalKEffects.g:1058:7: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getRandomizeCallEffectAccess().getParametersParameterParserRuleCall_3_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getRandomizeCallEffectRule());
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

                    // InternalKEffects.g:1075:5: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==20) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalKEffects.g:1076:6: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_5, grammarAccess.getRandomizeCallEffectAccess().getCommaKeyword_3_0_2_0());
                    	      					
                    	    }
                    	    // InternalKEffects.g:1080:6: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalKEffects.g:1081:7: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalKEffects.g:1081:7: (lv_parameters_6_0= ruleParameter )
                    	    // InternalKEffects.g:1082:8: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getRandomizeCallEffectAccess().getParametersParameterParserRuleCall_3_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_15);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getRandomizeCallEffectRule());
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
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getRandomizeCallEffectAccess().getRightParenthesisKeyword_3_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:1106:4: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getRandomizeCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
                      			
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
    // $ANTLR end "ruleRandomizeCallEffect"


    // $ANTLR start "entryRuleExpression"
    // InternalKEffects.g:1115:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKEffects.g:1115:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalKEffects.g:1116:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalKEffects.g:1122:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1128:2: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // InternalKEffects.g:1129:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // InternalKEffects.g:1129:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalKEffects.g:1130:3: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalKEffects.g:1142:3: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKEffects.g:1157:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalKEffects.g:1157:55: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalKEffects.g:1158:2: iv_ruleBoolExpression= ruleBoolExpression EOF
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
    // InternalKEffects.g:1164:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1170:2: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalKEffects.g:1171:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
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
    // InternalKEffects.g:1185:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalKEffects.g:1185:60: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalKEffects.g:1186:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
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
    // InternalKEffects.g:1192:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1198:2: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) )
            // InternalKEffects.g:1199:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            {
            // InternalKEffects.g:1199:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            // InternalKEffects.g:1200:3: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_19);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:1211:3: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKEffects.g:1212:4: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    {
                    // InternalKEffects.g:1212:4: ()
                    // InternalKEffects.g:1213:5: 
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

                    // InternalKEffects.g:1222:4: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )
                    // InternalKEffects.g:1223:5: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    {
                    // InternalKEffects.g:1223:5: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    // InternalKEffects.g:1224:6: (lv_operator_2_0= ruleLogicalOrOperator )
                    {
                    // InternalKEffects.g:1224:6: (lv_operator_2_0= ruleLogicalOrOperator )
                    // InternalKEffects.g:1225:7: lv_operator_2_0= ruleLogicalOrOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
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

                    // InternalKEffects.g:1242:5: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    // InternalKEffects.g:1243:6: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    {
                    // InternalKEffects.g:1243:6: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    // InternalKEffects.g:1244:7: lv_subExpressions_3_0= ruleLogicalAndExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
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

                    // InternalKEffects.g:1262:4: (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==25) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalKEffects.g:1263:5: otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:1267:5: ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    // InternalKEffects.g:1268:6: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalKEffects.g:1268:6: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    // InternalKEffects.g:1269:7: lv_subExpressions_5_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_19);
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
                    	    break loop27;
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
    // InternalKEffects.g:1292:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalKEffects.g:1292:61: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalKEffects.g:1293:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
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
    // InternalKEffects.g:1299:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1305:2: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) )
            // InternalKEffects.g:1306:2: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            {
            // InternalKEffects.g:1306:2: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            // InternalKEffects.g:1307:3: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_20);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:1318:3: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKEffects.g:1319:4: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    {
                    // InternalKEffects.g:1319:4: ()
                    // InternalKEffects.g:1320:5: 
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

                    // InternalKEffects.g:1329:4: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )
                    // InternalKEffects.g:1330:5: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    {
                    // InternalKEffects.g:1330:5: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    // InternalKEffects.g:1331:6: (lv_operator_2_0= ruleLogicalAndOperator )
                    {
                    // InternalKEffects.g:1331:6: (lv_operator_2_0= ruleLogicalAndOperator )
                    // InternalKEffects.g:1332:7: lv_operator_2_0= ruleLogicalAndOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
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

                    // InternalKEffects.g:1349:5: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    // InternalKEffects.g:1350:6: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    {
                    // InternalKEffects.g:1350:6: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    // InternalKEffects.g:1351:7: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_20);
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

                    // InternalKEffects.g:1369:4: (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==26) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalKEffects.g:1370:5: otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:1374:5: ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    // InternalKEffects.g:1375:6: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalKEffects.g:1375:6: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    // InternalKEffects.g:1376:7: lv_subExpressions_5_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_20);
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
                    	    break loop29;
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
    // InternalKEffects.g:1399:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalKEffects.g:1399:60: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalKEffects.g:1400:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
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
    // InternalKEffects.g:1406:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseXOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1412:2: ( (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? ) )
            // InternalKEffects.g:1413:2: (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? )
            {
            // InternalKEffects.g:1413:2: (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? )
            // InternalKEffects.g:1414:3: this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseXOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_21);
            this_BitwiseXOrExpression_0=ruleBitwiseXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseXOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:1425:3: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKEffects.g:1426:4: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )*
                    {
                    // InternalKEffects.g:1426:4: ()
                    // InternalKEffects.g:1427:5: 
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

                    // InternalKEffects.g:1436:4: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) )
                    // InternalKEffects.g:1437:5: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) )
                    {
                    // InternalKEffects.g:1437:5: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    // InternalKEffects.g:1438:6: (lv_operator_2_0= ruleBitwiseOrOperator )
                    {
                    // InternalKEffects.g:1438:6: (lv_operator_2_0= ruleBitwiseOrOperator )
                    // InternalKEffects.g:1439:7: lv_operator_2_0= ruleBitwiseOrOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
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

                    // InternalKEffects.g:1456:5: ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) )
                    // InternalKEffects.g:1457:6: (lv_subExpressions_3_0= ruleBitwiseXOrExpression )
                    {
                    // InternalKEffects.g:1457:6: (lv_subExpressions_3_0= ruleBitwiseXOrExpression )
                    // InternalKEffects.g:1458:7: lv_subExpressions_3_0= ruleBitwiseXOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseXOrExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_subExpressions_3_0=ruleBitwiseXOrExpression();

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
                      								"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseXOrExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKEffects.g:1476:4: (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==27) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalKEffects.g:1477:5: otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:1481:5: ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) )
                    	    // InternalKEffects.g:1482:6: (lv_subExpressions_5_0= ruleBitwiseXOrExpression )
                    	    {
                    	    // InternalKEffects.g:1482:6: (lv_subExpressions_5_0= ruleBitwiseXOrExpression )
                    	    // InternalKEffects.g:1483:7: lv_subExpressions_5_0= ruleBitwiseXOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseXOrExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_21);
                    	    lv_subExpressions_5_0=ruleBitwiseXOrExpression();

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
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseXOrExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
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


    // $ANTLR start "entryRuleBitwiseXOrExpression"
    // InternalKEffects.g:1506:1: entryRuleBitwiseXOrExpression returns [EObject current=null] : iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF ;
    public final EObject entryRuleBitwiseXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXOrExpression = null;


        try {
            // InternalKEffects.g:1506:61: (iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF )
            // InternalKEffects.g:1507:2: iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseXOrExpression=ruleBitwiseXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXOrExpression; 
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
    // $ANTLR end "entryRuleBitwiseXOrExpression"


    // $ANTLR start "ruleBitwiseXOrExpression"
    // InternalKEffects.g:1513:1: ruleBitwiseXOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseXOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1519:2: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) )
            // InternalKEffects.g:1520:2: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            {
            // InternalKEffects.g:1520:2: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            // InternalKEffects.g:1521:3: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_22);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:1532:3: ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKEffects.g:1533:4: () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    {
                    // InternalKEffects.g:1533:4: ()
                    // InternalKEffects.g:1534:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getBitwiseXOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKEffects.g:1543:4: ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )
                    // InternalKEffects.g:1544:5: ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    {
                    // InternalKEffects.g:1544:5: ( (lv_operator_2_0= ruleBitwiseXOrOperator ) )
                    // InternalKEffects.g:1545:6: (lv_operator_2_0= ruleBitwiseXOrOperator )
                    {
                    // InternalKEffects.g:1545:6: (lv_operator_2_0= ruleBitwiseXOrOperator )
                    // InternalKEffects.g:1546:7: lv_operator_2_0= ruleBitwiseXOrOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getOperatorBitwiseXOrOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_operator_2_0=ruleBitwiseXOrOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBitwiseXOrExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseXOrOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKEffects.g:1563:5: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    // InternalKEffects.g:1564:6: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    {
                    // InternalKEffects.g:1564:6: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    // InternalKEffects.g:1565:7: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    lv_subExpressions_3_0=ruleBitwiseAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBitwiseXOrExpressionRule());
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

                    // InternalKEffects.g:1583:4: (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==28) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalKEffects.g:1584:5: otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getBitwiseXOrExpressionAccess().getCircumflexAccentKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:1588:5: ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    // InternalKEffects.g:1589:6: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalKEffects.g:1589:6: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    // InternalKEffects.g:1590:7: lv_subExpressions_5_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_subExpressions_5_0=ruleBitwiseAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getBitwiseXOrExpressionRule());
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
                    	    break loop33;
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
    // $ANTLR end "ruleBitwiseXOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalKEffects.g:1613:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalKEffects.g:1613:61: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalKEffects.g:1614:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
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
    // InternalKEffects.g:1620:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1626:2: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) )
            // InternalKEffects.g:1627:2: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            {
            // InternalKEffects.g:1627:2: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            // InternalKEffects.g:1628:3: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_23);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CompareOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:1639:3: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKEffects.g:1640:4: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    {
                    // InternalKEffects.g:1640:4: ()
                    // InternalKEffects.g:1641:5: 
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

                    // InternalKEffects.g:1650:4: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )
                    // InternalKEffects.g:1651:5: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    {
                    // InternalKEffects.g:1651:5: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    // InternalKEffects.g:1652:6: (lv_operator_2_0= ruleBitwiseAndOperator )
                    {
                    // InternalKEffects.g:1652:6: (lv_operator_2_0= ruleBitwiseAndOperator )
                    // InternalKEffects.g:1653:7: lv_operator_2_0= ruleBitwiseAndOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
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

                    // InternalKEffects.g:1670:5: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    // InternalKEffects.g:1671:6: (lv_subExpressions_3_0= ruleCompareOperation )
                    {
                    // InternalKEffects.g:1671:6: (lv_subExpressions_3_0= ruleCompareOperation )
                    // InternalKEffects.g:1672:7: lv_subExpressions_3_0= ruleCompareOperation
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
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

                    // InternalKEffects.g:1690:4: (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==29) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalKEffects.g:1691:5: otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:1695:5: ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    // InternalKEffects.g:1696:6: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    {
                    	    // InternalKEffects.g:1696:6: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    // InternalKEffects.g:1697:7: lv_subExpressions_5_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_23);
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
                    	    break loop35;
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
    // InternalKEffects.g:1720:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalKEffects.g:1720:57: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalKEffects.g:1721:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
    // InternalKEffects.g:1727:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1733:2: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalKEffects.g:1734:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalKEffects.g:1734:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalKEffects.g:1735:3: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_24);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NotOrValuedExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:1746:3: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=67 && LA37_0<=72)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKEffects.g:1747:4: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalKEffects.g:1747:4: ()
                    // InternalKEffects.g:1748:5: 
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

                    // InternalKEffects.g:1757:4: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalKEffects.g:1758:5: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalKEffects.g:1758:5: (lv_operator_2_0= ruleCompareOperator )
                    // InternalKEffects.g:1759:6: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
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

                    // InternalKEffects.g:1776:4: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalKEffects.g:1777:5: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalKEffects.g:1777:5: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalKEffects.g:1778:6: lv_subExpressions_3_0= ruleNotOrValuedExpression
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
    // InternalKEffects.g:1800:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalKEffects.g:1800:62: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalKEffects.g:1801:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
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
    // InternalKEffects.g:1807:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1813:2: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalKEffects.g:1814:2: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalKEffects.g:1814:2: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalKEffects.g:1815:3: this_ValuedExpression_0= ruleValuedExpression
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
                    // InternalKEffects.g:1827:3: this_NotExpression_1= ruleNotExpression
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


    // $ANTLR start "entryRuleBitwiseNotExpression"
    // InternalKEffects.g:1842:1: entryRuleBitwiseNotExpression returns [EObject current=null] : iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF ;
    public final EObject entryRuleBitwiseNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseNotExpression = null;


        try {
            // InternalKEffects.g:1842:61: (iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF )
            // InternalKEffects.g:1843:2: iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseNotExpression=ruleBitwiseNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseNotExpression; 
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
    // $ANTLR end "entryRuleBitwiseNotExpression"


    // $ANTLR start "ruleBitwiseNotExpression"
    // InternalKEffects.g:1849:1: ruleBitwiseNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleBitwiseNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1855:2: ( ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalKEffects.g:1856:2: ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalKEffects.g:1856:2: ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==74) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=RULE_HOSTCODE && LA39_0<=RULE_ID)||LA39_0==RULE_BOOLEAN||LA39_0==RULE_COMMENT_ANNOTATION||LA39_0==18||LA39_0==22||LA39_0==24||LA39_0==43||LA39_0==50||LA39_0==73||LA39_0==75) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalKEffects.g:1857:3: ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) )
                    {
                    // InternalKEffects.g:1857:3: ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) )
                    // InternalKEffects.g:1858:4: () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) )
                    {
                    // InternalKEffects.g:1858:4: ()
                    // InternalKEffects.g:1859:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBitwiseNotExpressionAccess().getOperatorExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKEffects.g:1868:4: ( (lv_operator_1_0= ruleBitwiseNotOperator ) )
                    // InternalKEffects.g:1869:5: (lv_operator_1_0= ruleBitwiseNotOperator )
                    {
                    // InternalKEffects.g:1869:5: (lv_operator_1_0= ruleBitwiseNotOperator )
                    // InternalKEffects.g:1870:6: lv_operator_1_0= ruleBitwiseNotOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBitwiseNotExpressionAccess().getOperatorBitwiseNotOperatorEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_operator_1_0=ruleBitwiseNotOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBitwiseNotExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_1_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseNotOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKEffects.g:1887:4: ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) )
                    // InternalKEffects.g:1888:5: (lv_subExpressions_2_0= ruleBitwiseNotExpression )
                    {
                    // InternalKEffects.g:1888:5: (lv_subExpressions_2_0= ruleBitwiseNotExpression )
                    // InternalKEffects.g:1889:6: lv_subExpressions_2_0= ruleBitwiseNotExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBitwiseNotExpressionAccess().getSubExpressionsBitwiseNotExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_2_0=ruleBitwiseNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBitwiseNotExpressionRule());
                      						}
                      						add(
                      							current,
                      							"subExpressions",
                      							lv_subExpressions_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseNotExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:1908:3: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBitwiseNotExpressionAccess().getAtomicExpressionParserRuleCall_1());
                      		
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
    // $ANTLR end "ruleBitwiseNotExpression"


    // $ANTLR start "entryRuleNotExpression"
    // InternalKEffects.g:1923:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalKEffects.g:1923:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalKEffects.g:1924:2: iv_ruleNotExpression= ruleNotExpression EOF
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
    // InternalKEffects.g:1930:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_BitwiseNotExpression_3 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1936:2: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression ) )
            // InternalKEffects.g:1937:2: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression )
            {
            // InternalKEffects.g:1937:2: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=RULE_HOSTCODE && LA40_0<=RULE_ID)||LA40_0==RULE_BOOLEAN||LA40_0==RULE_COMMENT_ANNOTATION||LA40_0==18||LA40_0==22||LA40_0==24||LA40_0==43||LA40_0==50||(LA40_0>=73 && LA40_0<=75)) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalKEffects.g:1938:3: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalKEffects.g:1938:3: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalKEffects.g:1939:4: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalKEffects.g:1939:4: ()
                    // InternalKEffects.g:1940:5: 
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

                    // InternalKEffects.g:1949:4: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalKEffects.g:1950:5: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalKEffects.g:1950:5: (lv_operator_1_0= ruleNotOperator )
                    // InternalKEffects.g:1951:6: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
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

                    // InternalKEffects.g:1968:4: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalKEffects.g:1969:5: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalKEffects.g:1969:5: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalKEffects.g:1970:6: lv_subExpressions_2_0= ruleNotExpression
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
                    // InternalKEffects.g:1989:3: this_BitwiseNotExpression_3= ruleBitwiseNotExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNotExpressionAccess().getBitwiseNotExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BitwiseNotExpression_3=ruleBitwiseNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BitwiseNotExpression_3;
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
    // InternalKEffects.g:2004:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalKEffects.g:2004:57: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalKEffects.g:2005:2: iv_ruleValuedExpression= ruleValuedExpression EOF
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
    // InternalKEffects.g:2011:1: ruleValuedExpression returns [EObject current=null] : this_ShiftExpressions_0= ruleShiftExpressions ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpressions_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:2017:2: (this_ShiftExpressions_0= ruleShiftExpressions )
            // InternalKEffects.g:2018:2: this_ShiftExpressions_0= ruleShiftExpressions
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getValuedExpressionAccess().getShiftExpressionsParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ShiftExpressions_0=ruleShiftExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ShiftExpressions_0;
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


    // $ANTLR start "entryRuleShiftExpressions"
    // InternalKEffects.g:2032:1: entryRuleShiftExpressions returns [EObject current=null] : iv_ruleShiftExpressions= ruleShiftExpressions EOF ;
    public final EObject entryRuleShiftExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpressions = null;


        try {
            // InternalKEffects.g:2032:57: (iv_ruleShiftExpressions= ruleShiftExpressions EOF )
            // InternalKEffects.g:2033:2: iv_ruleShiftExpressions= ruleShiftExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftExpressions=ruleShiftExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpressions; 
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
    // $ANTLR end "entryRuleShiftExpressions"


    // $ANTLR start "ruleShiftExpressions"
    // InternalKEffects.g:2039:1: ruleShiftExpressions returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )* ) ;
    public final EObject ruleShiftExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_14=null;
        EObject this_SumExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;

        Enumerator lv_operator_12_0 = null;

        EObject lv_subExpressions_13_0 = null;

        EObject lv_subExpressions_15_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:2045:2: ( (this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )* ) )
            // InternalKEffects.g:2046:2: (this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )* )
            {
            // InternalKEffects.g:2046:2: (this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )* )
            // InternalKEffects.g:2047:3: this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSumExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_25);
            this_SumExpression_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SumExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:2058:3: ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )*
            loop44:
            do {
                int alt44=4;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt44=1;
                    }
                    break;
                case 31:
                    {
                    alt44=2;
                    }
                    break;
                case 32:
                    {
                    alt44=3;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // InternalKEffects.g:2059:4: ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2059:4: ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )
            	    // InternalKEffects.g:2060:5: () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2060:5: ()
            	    // InternalKEffects.g:2061:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndAdd(
            	      							grammarAccess.getShiftExpressionsAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalKEffects.g:2070:5: ( (lv_operator_2_0= ruleShiftLeftOperator ) )
            	    // InternalKEffects.g:2071:6: (lv_operator_2_0= ruleShiftLeftOperator )
            	    {
            	    // InternalKEffects.g:2071:6: (lv_operator_2_0= ruleShiftLeftOperator )
            	    // InternalKEffects.g:2072:7: lv_operator_2_0= ruleShiftLeftOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getOperatorShiftLeftOperatorEnumRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_operator_2_0=ruleShiftLeftOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
            	      							}
            	      							set(
            	      								current,
            	      								"operator",
            	      								lv_operator_2_0,
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftOperator");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKEffects.g:2089:5: ( (lv_subExpressions_3_0= ruleSumExpression ) )
            	    // InternalKEffects.g:2090:6: (lv_subExpressions_3_0= ruleSumExpression )
            	    {
            	    // InternalKEffects.g:2090:6: (lv_subExpressions_3_0= ruleSumExpression )
            	    // InternalKEffects.g:2091:7: lv_subExpressions_3_0= ruleSumExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_subExpressions_3_0=ruleSumExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
            	      							}
            	      							add(
            	      								current,
            	      								"subExpressions",
            	      								lv_subExpressions_3_0,
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKEffects.g:2108:5: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        alt41 = dfa41.predict(input);
            	        switch (alt41) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2109:6: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_4, grammarAccess.getShiftExpressionsAccess().getLessThanSignLessThanSignKeyword_1_0_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2113:6: ( (lv_subExpressions_5_0= ruleSumExpression ) )
            	    	    // InternalKEffects.g:2114:7: (lv_subExpressions_5_0= ruleSumExpression )
            	    	    {
            	    	    // InternalKEffects.g:2114:7: (lv_subExpressions_5_0= ruleSumExpression )
            	    	    // InternalKEffects.g:2115:8: lv_subExpressions_5_0= ruleSumExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_0_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_25);
            	    	    lv_subExpressions_5_0=ruleSumExpression();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
            	    	      								}
            	    	      								add(
            	    	      									current,
            	    	      									"subExpressions",
            	    	      									lv_subExpressions_5_0,
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
            	    	      								afterParserOrEnumRuleCall();
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKEffects.g:2135:4: ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2135:4: ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* )
            	    // InternalKEffects.g:2136:5: () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2136:5: ()
            	    // InternalKEffects.g:2137:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndAdd(
            	      							grammarAccess.getShiftExpressionsAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalKEffects.g:2146:5: ( (lv_operator_7_0= ruleShiftRightOperator ) )
            	    // InternalKEffects.g:2147:6: (lv_operator_7_0= ruleShiftRightOperator )
            	    {
            	    // InternalKEffects.g:2147:6: (lv_operator_7_0= ruleShiftRightOperator )
            	    // InternalKEffects.g:2148:7: lv_operator_7_0= ruleShiftRightOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getOperatorShiftRightOperatorEnumRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_operator_7_0=ruleShiftRightOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
            	      							}
            	      							set(
            	      								current,
            	      								"operator",
            	      								lv_operator_7_0,
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightOperator");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKEffects.g:2165:5: ( (lv_subExpressions_8_0= ruleSumExpression ) )
            	    // InternalKEffects.g:2166:6: (lv_subExpressions_8_0= ruleSumExpression )
            	    {
            	    // InternalKEffects.g:2166:6: (lv_subExpressions_8_0= ruleSumExpression )
            	    // InternalKEffects.g:2167:7: lv_subExpressions_8_0= ruleSumExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_subExpressions_8_0=ruleSumExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
            	      							}
            	      							add(
            	      								current,
            	      								"subExpressions",
            	      								lv_subExpressions_8_0,
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKEffects.g:2184:5: (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )*
            	    loop42:
            	    do {
            	        int alt42=2;
            	        alt42 = dfa42.predict(input);
            	        switch (alt42) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2185:6: otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_9, grammarAccess.getShiftExpressionsAccess().getGreaterThanSignGreaterThanSignKeyword_1_1_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2189:6: ( (lv_subExpressions_10_0= ruleSumExpression ) )
            	    	    // InternalKEffects.g:2190:7: (lv_subExpressions_10_0= ruleSumExpression )
            	    	    {
            	    	    // InternalKEffects.g:2190:7: (lv_subExpressions_10_0= ruleSumExpression )
            	    	    // InternalKEffects.g:2191:8: lv_subExpressions_10_0= ruleSumExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_1_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_25);
            	    	    lv_subExpressions_10_0=ruleSumExpression();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
            	    	      								}
            	    	      								add(
            	    	      									current,
            	    	      									"subExpressions",
            	    	      									lv_subExpressions_10_0,
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
            	    	      								afterParserOrEnumRuleCall();
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop42;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalKEffects.g:2211:4: ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2211:4: ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* )
            	    // InternalKEffects.g:2212:5: () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2212:5: ()
            	    // InternalKEffects.g:2213:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndAdd(
            	      							grammarAccess.getShiftExpressionsAccess().getOperatorExpressionSubExpressionsAction_1_2_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalKEffects.g:2222:5: ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) )
            	    // InternalKEffects.g:2223:6: (lv_operator_12_0= ruleShiftRightUnsignedOperator )
            	    {
            	    // InternalKEffects.g:2223:6: (lv_operator_12_0= ruleShiftRightUnsignedOperator )
            	    // InternalKEffects.g:2224:7: lv_operator_12_0= ruleShiftRightUnsignedOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_2_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_operator_12_0=ruleShiftRightUnsignedOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
            	      							}
            	      							set(
            	      								current,
            	      								"operator",
            	      								lv_operator_12_0,
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedOperator");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKEffects.g:2241:5: ( (lv_subExpressions_13_0= ruleSumExpression ) )
            	    // InternalKEffects.g:2242:6: (lv_subExpressions_13_0= ruleSumExpression )
            	    {
            	    // InternalKEffects.g:2242:6: (lv_subExpressions_13_0= ruleSumExpression )
            	    // InternalKEffects.g:2243:7: lv_subExpressions_13_0= ruleSumExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_subExpressions_13_0=ruleSumExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
            	      							}
            	      							add(
            	      								current,
            	      								"subExpressions",
            	      								lv_subExpressions_13_0,
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKEffects.g:2260:5: (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        alt43 = dfa43.predict(input);
            	        switch (alt43) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2261:6: otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,32,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_14, grammarAccess.getShiftExpressionsAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_2_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2265:6: ( (lv_subExpressions_15_0= ruleSumExpression ) )
            	    	    // InternalKEffects.g:2266:7: (lv_subExpressions_15_0= ruleSumExpression )
            	    	    {
            	    	    // InternalKEffects.g:2266:7: (lv_subExpressions_15_0= ruleSumExpression )
            	    	    // InternalKEffects.g:2267:8: lv_subExpressions_15_0= ruleSumExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_2_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_25);
            	    	    lv_subExpressions_15_0=ruleSumExpression();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
            	    	      								}
            	    	      								add(
            	    	      									current,
            	    	      									"subExpressions",
            	    	      									lv_subExpressions_15_0,
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
            	    	      								afterParserOrEnumRuleCall();
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop43;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // $ANTLR end "ruleShiftExpressions"


    // $ANTLR start "entryRuleShiftRightExpression"
    // InternalKEffects.g:2291:1: entryRuleShiftRightExpression returns [EObject current=null] : iv_ruleShiftRightExpression= ruleShiftRightExpression EOF ;
    public final EObject entryRuleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightExpression = null;


        try {
            // InternalKEffects.g:2291:61: (iv_ruleShiftRightExpression= ruleShiftRightExpression EOF )
            // InternalKEffects.g:2292:2: iv_ruleShiftRightExpression= ruleShiftRightExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftRightExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftRightExpression=ruleShiftRightExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftRightExpression; 
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
    // $ANTLR end "entryRuleShiftRightExpression"


    // $ANTLR start "ruleShiftRightExpression"
    // InternalKEffects.g:2298:1: ruleShiftRightExpression returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SumExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:2304:2: ( (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) )
            // InternalKEffects.g:2305:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            {
            // InternalKEffects.g:2305:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            // InternalKEffects.g:2306:3: this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSumExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_27);
            this_SumExpression_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SumExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:2317:3: ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==31) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalKEffects.g:2318:4: () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    {
                    // InternalKEffects.g:2318:4: ()
                    // InternalKEffects.g:2319:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getShiftRightExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKEffects.g:2328:4: ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) )
                    // InternalKEffects.g:2329:5: ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    {
                    // InternalKEffects.g:2329:5: ( (lv_operator_2_0= ruleShiftRightOperator ) )
                    // InternalKEffects.g:2330:6: (lv_operator_2_0= ruleShiftRightOperator )
                    {
                    // InternalKEffects.g:2330:6: (lv_operator_2_0= ruleShiftRightOperator )
                    // InternalKEffects.g:2331:7: lv_operator_2_0= ruleShiftRightOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getOperatorShiftRightOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_operator_2_0=ruleShiftRightOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getShiftRightExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKEffects.g:2348:5: ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    // InternalKEffects.g:2349:6: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    {
                    // InternalKEffects.g:2349:6: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    // InternalKEffects.g:2350:7: lv_subExpressions_3_0= ruleShiftRightUnsignedExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_subExpressions_3_0=ruleShiftRightUnsignedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getShiftRightExpressionRule());
                      							}
                      							add(
                      								current,
                      								"subExpressions",
                      								lv_subExpressions_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKEffects.g:2368:4: (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==31) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalKEffects.g:2369:5: otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getShiftRightExpressionAccess().getGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:2373:5: ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    // InternalKEffects.g:2374:6: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    {
                    	    // InternalKEffects.g:2374:6: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    // InternalKEffects.g:2375:7: lv_subExpressions_5_0= ruleShiftRightUnsignedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    lv_subExpressions_5_0=ruleShiftRightUnsignedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getShiftRightExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
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
    // $ANTLR end "ruleShiftRightExpression"


    // $ANTLR start "entryRuleShiftRightUnsignedExpression"
    // InternalKEffects.g:2398:1: entryRuleShiftRightUnsignedExpression returns [EObject current=null] : iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF ;
    public final EObject entryRuleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightUnsignedExpression = null;


        try {
            // InternalKEffects.g:2398:69: (iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF )
            // InternalKEffects.g:2399:2: iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftRightUnsignedExpression=ruleShiftRightUnsignedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftRightUnsignedExpression; 
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
    // $ANTLR end "entryRuleShiftRightUnsignedExpression"


    // $ANTLR start "ruleShiftRightUnsignedExpression"
    // InternalKEffects.g:2405:1: ruleShiftRightUnsignedExpression returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SumExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:2411:2: ( (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? ) )
            // InternalKEffects.g:2412:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? )
            {
            // InternalKEffects.g:2412:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? )
            // InternalKEffects.g:2413:3: this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSumExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_25);
            this_SumExpression_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SumExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:2424:3: ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==32) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalKEffects.g:2425:4: () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*
                    {
                    // InternalKEffects.g:2425:4: ()
                    // InternalKEffects.g:2426:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getShiftRightUnsignedExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKEffects.g:2435:4: ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) )
                    // InternalKEffects.g:2436:5: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) )
                    {
                    // InternalKEffects.g:2436:5: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) )
                    // InternalKEffects.g:2437:6: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    {
                    // InternalKEffects.g:2437:6: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    // InternalKEffects.g:2438:7: lv_operator_2_0= ruleShiftRightUnsignedOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_operator_2_0=ruleShiftRightUnsignedOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getShiftRightUnsignedExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKEffects.g:2455:5: ( (lv_subExpressions_3_0= ruleSumExpression ) )
                    // InternalKEffects.g:2456:6: (lv_subExpressions_3_0= ruleSumExpression )
                    {
                    // InternalKEffects.g:2456:6: (lv_subExpressions_3_0= ruleSumExpression )
                    // InternalKEffects.g:2457:7: lv_subExpressions_3_0= ruleSumExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsSumExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_subExpressions_3_0=ruleSumExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getShiftRightUnsignedExpressionRule());
                      							}
                      							add(
                      								current,
                      								"subExpressions",
                      								lv_subExpressions_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKEffects.g:2475:4: (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==32) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalKEffects.g:2476:5: otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getShiftRightUnsignedExpressionAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:2480:5: ( (lv_subExpressions_5_0= ruleSumExpression ) )
                    	    // InternalKEffects.g:2481:6: (lv_subExpressions_5_0= ruleSumExpression )
                    	    {
                    	    // InternalKEffects.g:2481:6: (lv_subExpressions_5_0= ruleSumExpression )
                    	    // InternalKEffects.g:2482:7: lv_subExpressions_5_0= ruleSumExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsSumExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_28);
                    	    lv_subExpressions_5_0=ruleSumExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getShiftRightUnsignedExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
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
    // $ANTLR end "ruleShiftRightUnsignedExpression"


    // $ANTLR start "entryRuleSumExpression"
    // InternalKEffects.g:2505:1: entryRuleSumExpression returns [EObject current=null] : iv_ruleSumExpression= ruleSumExpression EOF ;
    public final EObject entryRuleSumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumExpression = null;


        try {
            // InternalKEffects.g:2505:54: (iv_ruleSumExpression= ruleSumExpression EOF )
            // InternalKEffects.g:2506:2: iv_ruleSumExpression= ruleSumExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSumExpression=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumExpression; 
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
    // $ANTLR end "entryRuleSumExpression"


    // $ANTLR start "ruleSumExpression"
    // InternalKEffects.g:2512:1: ruleSumExpression returns [EObject current=null] : (this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )* ) ;
    public final EObject ruleSumExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject this_ProductExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:2518:2: ( (this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )* ) )
            // InternalKEffects.g:2519:2: (this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )* )
            {
            // InternalKEffects.g:2519:2: (this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )* )
            // InternalKEffects.g:2520:3: this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSumExpressionAccess().getProductExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_29);
            this_ProductExpression_0=ruleProductExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProductExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:2531:3: ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )*
            loop51:
            do {
                int alt51=3;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==33) ) {
                    alt51=1;
                }
                else if ( (LA51_0==34) ) {
                    alt51=2;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalKEffects.g:2532:4: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2532:4: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )
            	    // InternalKEffects.g:2533:5: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2533:5: ()
            	    // InternalKEffects.g:2534:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndAdd(
            	      							grammarAccess.getSumExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalKEffects.g:2543:5: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // InternalKEffects.g:2544:6: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // InternalKEffects.g:2544:6: (lv_operator_2_0= ruleAddOperator )
            	    // InternalKEffects.g:2545:7: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSumExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_operator_2_0=ruleAddOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getSumExpressionRule());
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

            	    // InternalKEffects.g:2562:5: ( (lv_subExpressions_3_0= ruleProductExpression ) )
            	    // InternalKEffects.g:2563:6: (lv_subExpressions_3_0= ruleProductExpression )
            	    {
            	    // InternalKEffects.g:2563:6: (lv_subExpressions_3_0= ruleProductExpression )
            	    // InternalKEffects.g:2564:7: lv_subExpressions_3_0= ruleProductExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    lv_subExpressions_3_0=ruleProductExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getSumExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"subExpressions",
            	      								lv_subExpressions_3_0,
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.ProductExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKEffects.g:2581:5: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        alt49 = dfa49.predict(input);
            	        switch (alt49) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2582:6: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_4, grammarAccess.getSumExpressionAccess().getPlusSignKeyword_1_0_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2586:6: ( (lv_subExpressions_5_0= ruleProductExpression ) )
            	    	    // InternalKEffects.g:2587:7: (lv_subExpressions_5_0= ruleProductExpression )
            	    	    {
            	    	    // InternalKEffects.g:2587:7: (lv_subExpressions_5_0= ruleProductExpression )
            	    	    // InternalKEffects.g:2588:8: lv_subExpressions_5_0= ruleProductExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_0_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_29);
            	    	    lv_subExpressions_5_0=ruleProductExpression();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElementForParent(grammarAccess.getSumExpressionRule());
            	    	      								}
            	    	      								add(
            	    	      									current,
            	    	      									"subExpressions",
            	    	      									lv_subExpressions_5_0,
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.ProductExpression");
            	    	      								afterParserOrEnumRuleCall();
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop49;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKEffects.g:2608:4: ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2608:4: ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* )
            	    // InternalKEffects.g:2609:5: () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2609:5: ()
            	    // InternalKEffects.g:2610:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndAdd(
            	      							grammarAccess.getSumExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalKEffects.g:2619:5: ( (lv_operator_7_0= ruleSubOperator ) )
            	    // InternalKEffects.g:2620:6: (lv_operator_7_0= ruleSubOperator )
            	    {
            	    // InternalKEffects.g:2620:6: (lv_operator_7_0= ruleSubOperator )
            	    // InternalKEffects.g:2621:7: lv_operator_7_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSumExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_operator_7_0=ruleSubOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getSumExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"operator",
            	      								lv_operator_7_0,
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.SubOperator");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKEffects.g:2638:5: ( (lv_subExpressions_8_0= ruleProductExpression ) )
            	    // InternalKEffects.g:2639:6: (lv_subExpressions_8_0= ruleProductExpression )
            	    {
            	    // InternalKEffects.g:2639:6: (lv_subExpressions_8_0= ruleProductExpression )
            	    // InternalKEffects.g:2640:7: lv_subExpressions_8_0= ruleProductExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    lv_subExpressions_8_0=ruleProductExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getSumExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"subExpressions",
            	      								lv_subExpressions_8_0,
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.ProductExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKEffects.g:2657:5: (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )*
            	    loop50:
            	    do {
            	        int alt50=2;
            	        alt50 = dfa50.predict(input);
            	        switch (alt50) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2658:6: otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,34,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_9, grammarAccess.getSumExpressionAccess().getHyphenMinusKeyword_1_1_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2662:6: ( (lv_subExpressions_10_0= ruleProductExpression ) )
            	    	    // InternalKEffects.g:2663:7: (lv_subExpressions_10_0= ruleProductExpression )
            	    	    {
            	    	    // InternalKEffects.g:2663:7: (lv_subExpressions_10_0= ruleProductExpression )
            	    	    // InternalKEffects.g:2664:8: lv_subExpressions_10_0= ruleProductExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_1_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_29);
            	    	    lv_subExpressions_10_0=ruleProductExpression();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElementForParent(grammarAccess.getSumExpressionRule());
            	    	      								}
            	    	      								add(
            	    	      									current,
            	    	      									"subExpressions",
            	    	      									lv_subExpressions_10_0,
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.ProductExpression");
            	    	      								afterParserOrEnumRuleCall();
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop50;
            	        }
            	    } while (true);


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
    // $ANTLR end "ruleSumExpression"


    // $ANTLR start "entryRuleProductExpression"
    // InternalKEffects.g:2688:1: entryRuleProductExpression returns [EObject current=null] : iv_ruleProductExpression= ruleProductExpression EOF ;
    public final EObject entryRuleProductExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductExpression = null;


        try {
            // InternalKEffects.g:2688:58: (iv_ruleProductExpression= ruleProductExpression EOF )
            // InternalKEffects.g:2689:2: iv_ruleProductExpression= ruleProductExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProductExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProductExpression=ruleProductExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProductExpression; 
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
    // $ANTLR end "entryRuleProductExpression"


    // $ANTLR start "ruleProductExpression"
    // InternalKEffects.g:2695:1: ruleProductExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )* ) ;
    public final EObject ruleProductExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_14=null;
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;

        Enumerator lv_operator_12_0 = null;

        EObject lv_subExpressions_13_0 = null;

        EObject lv_subExpressions_15_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:2701:2: ( (this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )* ) )
            // InternalKEffects.g:2702:2: (this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )* )
            {
            // InternalKEffects.g:2702:2: (this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )* )
            // InternalKEffects.g:2703:3: this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getProductExpressionAccess().getNegExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_30);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NegExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:2714:3: ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )*
            loop55:
            do {
                int alt55=4;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    alt55=1;
                    }
                    break;
                case 36:
                    {
                    alt55=2;
                    }
                    break;
                case 37:
                    {
                    alt55=3;
                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // InternalKEffects.g:2715:4: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2715:4: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* )
            	    // InternalKEffects.g:2716:5: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2716:5: ()
            	    // InternalKEffects.g:2717:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndAdd(
            	      							grammarAccess.getProductExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalKEffects.g:2726:5: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // InternalKEffects.g:2727:6: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // InternalKEffects.g:2727:6: (lv_operator_2_0= ruleMultOperator )
            	    // InternalKEffects.g:2728:7: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_operator_2_0=ruleMultOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getProductExpressionRule());
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

            	    // InternalKEffects.g:2745:5: ( (lv_subExpressions_3_0= ruleNegExpression ) )
            	    // InternalKEffects.g:2746:6: (lv_subExpressions_3_0= ruleNegExpression )
            	    {
            	    // InternalKEffects.g:2746:6: (lv_subExpressions_3_0= ruleNegExpression )
            	    // InternalKEffects.g:2747:7: lv_subExpressions_3_0= ruleNegExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    lv_subExpressions_3_0=ruleNegExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getProductExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"subExpressions",
            	      								lv_subExpressions_3_0,
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKEffects.g:2764:5: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )*
            	    loop52:
            	    do {
            	        int alt52=2;
            	        alt52 = dfa52.predict(input);
            	        switch (alt52) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2765:6: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_4, grammarAccess.getProductExpressionAccess().getAsteriskKeyword_1_0_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2769:6: ( (lv_subExpressions_5_0= ruleNegExpression ) )
            	    	    // InternalKEffects.g:2770:7: (lv_subExpressions_5_0= ruleNegExpression )
            	    	    {
            	    	    // InternalKEffects.g:2770:7: (lv_subExpressions_5_0= ruleNegExpression )
            	    	    // InternalKEffects.g:2771:8: lv_subExpressions_5_0= ruleNegExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_0_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_30);
            	    	    lv_subExpressions_5_0=ruleNegExpression();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElementForParent(grammarAccess.getProductExpressionRule());
            	    	      								}
            	    	      								add(
            	    	      									current,
            	    	      									"subExpressions",
            	    	      									lv_subExpressions_5_0,
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
            	    	      								afterParserOrEnumRuleCall();
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop52;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKEffects.g:2791:4: ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2791:4: ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* )
            	    // InternalKEffects.g:2792:5: () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2792:5: ()
            	    // InternalKEffects.g:2793:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndAdd(
            	      							grammarAccess.getProductExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalKEffects.g:2802:5: ( (lv_operator_7_0= ruleDivOperator ) )
            	    // InternalKEffects.g:2803:6: (lv_operator_7_0= ruleDivOperator )
            	    {
            	    // InternalKEffects.g:2803:6: (lv_operator_7_0= ruleDivOperator )
            	    // InternalKEffects.g:2804:7: lv_operator_7_0= ruleDivOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_operator_7_0=ruleDivOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getProductExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"operator",
            	      								lv_operator_7_0,
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.DivOperator");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKEffects.g:2821:5: ( (lv_subExpressions_8_0= ruleNegExpression ) )
            	    // InternalKEffects.g:2822:6: (lv_subExpressions_8_0= ruleNegExpression )
            	    {
            	    // InternalKEffects.g:2822:6: (lv_subExpressions_8_0= ruleNegExpression )
            	    // InternalKEffects.g:2823:7: lv_subExpressions_8_0= ruleNegExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    lv_subExpressions_8_0=ruleNegExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getProductExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"subExpressions",
            	      								lv_subExpressions_8_0,
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKEffects.g:2840:5: (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )*
            	    loop53:
            	    do {
            	        int alt53=2;
            	        alt53 = dfa53.predict(input);
            	        switch (alt53) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2841:6: otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,36,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_9, grammarAccess.getProductExpressionAccess().getSolidusKeyword_1_1_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2845:6: ( (lv_subExpressions_10_0= ruleNegExpression ) )
            	    	    // InternalKEffects.g:2846:7: (lv_subExpressions_10_0= ruleNegExpression )
            	    	    {
            	    	    // InternalKEffects.g:2846:7: (lv_subExpressions_10_0= ruleNegExpression )
            	    	    // InternalKEffects.g:2847:8: lv_subExpressions_10_0= ruleNegExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_1_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_30);
            	    	    lv_subExpressions_10_0=ruleNegExpression();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElementForParent(grammarAccess.getProductExpressionRule());
            	    	      								}
            	    	      								add(
            	    	      									current,
            	    	      									"subExpressions",
            	    	      									lv_subExpressions_10_0,
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
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


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalKEffects.g:2867:4: ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2867:4: ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* )
            	    // InternalKEffects.g:2868:5: () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2868:5: ()
            	    // InternalKEffects.g:2869:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndAdd(
            	      							grammarAccess.getProductExpressionAccess().getOperatorExpressionSubExpressionsAction_1_2_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalKEffects.g:2878:5: ( (lv_operator_12_0= ruleModOperator ) )
            	    // InternalKEffects.g:2879:6: (lv_operator_12_0= ruleModOperator )
            	    {
            	    // InternalKEffects.g:2879:6: (lv_operator_12_0= ruleModOperator )
            	    // InternalKEffects.g:2880:7: lv_operator_12_0= ruleModOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getOperatorModOperatorEnumRuleCall_1_2_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_operator_12_0=ruleModOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getProductExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"operator",
            	      								lv_operator_12_0,
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.ModOperator");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKEffects.g:2897:5: ( (lv_subExpressions_13_0= ruleNegExpression ) )
            	    // InternalKEffects.g:2898:6: (lv_subExpressions_13_0= ruleNegExpression )
            	    {
            	    // InternalKEffects.g:2898:6: (lv_subExpressions_13_0= ruleNegExpression )
            	    // InternalKEffects.g:2899:7: lv_subExpressions_13_0= ruleNegExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    lv_subExpressions_13_0=ruleNegExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getProductExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"subExpressions",
            	      								lv_subExpressions_13_0,
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKEffects.g:2916:5: (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )*
            	    loop54:
            	    do {
            	        int alt54=2;
            	        alt54 = dfa54.predict(input);
            	        switch (alt54) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2917:6: otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,37,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_14, grammarAccess.getProductExpressionAccess().getPercentSignKeyword_1_2_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2921:6: ( (lv_subExpressions_15_0= ruleNegExpression ) )
            	    	    // InternalKEffects.g:2922:7: (lv_subExpressions_15_0= ruleNegExpression )
            	    	    {
            	    	    // InternalKEffects.g:2922:7: (lv_subExpressions_15_0= ruleNegExpression )
            	    	    // InternalKEffects.g:2923:8: lv_subExpressions_15_0= ruleNegExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_2_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_30);
            	    	    lv_subExpressions_15_0=ruleNegExpression();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElementForParent(grammarAccess.getProductExpressionRule());
            	    	      								}
            	    	      								add(
            	    	      									current,
            	    	      									"subExpressions",
            	    	      									lv_subExpressions_15_0,
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
            	    	      								afterParserOrEnumRuleCall();
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop54;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // $ANTLR end "ruleProductExpression"


    // $ANTLR start "entryRuleNegExpression"
    // InternalKEffects.g:2947:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalKEffects.g:2947:54: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalKEffects.g:2948:2: iv_ruleNegExpression= ruleNegExpression EOF
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
    // InternalKEffects.g:2954:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_TernaryOperation_3 = null;



        	enterRule();

        try {
            // InternalKEffects.g:2960:2: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) )
            // InternalKEffects.g:2961:2: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            {
            // InternalKEffects.g:2961:2: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==34) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=RULE_HOSTCODE && LA56_0<=RULE_COMMENT_ANNOTATION)||LA56_0==18||LA56_0==22||LA56_0==24||LA56_0==43||LA56_0==45||LA56_0==50||LA56_0==73||LA56_0==75) ) {
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
                    // InternalKEffects.g:2962:3: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalKEffects.g:2962:3: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalKEffects.g:2963:4: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalKEffects.g:2963:4: ()
                    // InternalKEffects.g:2964:5: 
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

                    // InternalKEffects.g:2973:4: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalKEffects.g:2974:5: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalKEffects.g:2974:5: (lv_operator_1_0= ruleSubOperator )
                    // InternalKEffects.g:2975:6: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
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

                    // InternalKEffects.g:2992:4: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalKEffects.g:2993:5: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalKEffects.g:2993:5: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalKEffects.g:2994:6: lv_subExpressions_2_0= ruleNegExpression
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
                    // InternalKEffects.g:3013:3: this_TernaryOperation_3= ruleTernaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNegExpressionAccess().getTernaryOperationParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TernaryOperation_3=ruleTernaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TernaryOperation_3;
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


    // $ANTLR start "entryRuleTernaryOperation"
    // InternalKEffects.g:3028:1: entryRuleTernaryOperation returns [EObject current=null] : iv_ruleTernaryOperation= ruleTernaryOperation EOF ;
    public final EObject entryRuleTernaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTernaryOperation = null;


        try {
            // InternalKEffects.g:3028:57: (iv_ruleTernaryOperation= ruleTernaryOperation EOF )
            // InternalKEffects.g:3029:2: iv_ruleTernaryOperation= ruleTernaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTernaryOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTernaryOperation=ruleTernaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTernaryOperation; 
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
    // $ANTLR end "entryRuleTernaryOperation"


    // $ANTLR start "ruleTernaryOperation"
    // InternalKEffects.g:3035:1: ruleTernaryOperation returns [EObject current=null] : ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression ) ;
    public final EObject ruleTernaryOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        EObject this_InitExpression_6 = null;



        	enterRule();

        try {
            // InternalKEffects.g:3041:2: ( ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression ) )
            // InternalKEffects.g:3042:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression )
            {
            // InternalKEffects.g:3042:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression )
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // InternalKEffects.g:3043:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? )
                    {
                    // InternalKEffects.g:3043:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? )
                    // InternalKEffects.g:3044:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )?
                    {
                    // InternalKEffects.g:3044:4: ()
                    // InternalKEffects.g:3045:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTernaryOperationAccess().getOperatorExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKEffects.g:3054:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
                    // InternalKEffects.g:3055:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    {
                    // InternalKEffects.g:3055:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    // InternalKEffects.g:3056:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    lv_subExpressions_1_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
                      						}
                      						add(
                      							current,
                      							"subExpressions",
                      							lv_subExpressions_1_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKEffects.g:3073:4: ( (lv_operator_2_0= ruleConditionalOperator ) )
                    // InternalKEffects.g:3074:5: (lv_operator_2_0= ruleConditionalOperator )
                    {
                    // InternalKEffects.g:3074:5: (lv_operator_2_0= ruleConditionalOperator )
                    // InternalKEffects.g:3075:6: lv_operator_2_0= ruleConditionalOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
                    lv_operator_2_0=ruleConditionalOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.ConditionalOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKEffects.g:3092:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKEffects.g:3093:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKEffects.g:3093:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKEffects.g:3094:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
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

                    // InternalKEffects.g:3111:4: (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==38) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalKEffects.g:3112:5: otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                            {
                            otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getTernaryOperationAccess().getColonKeyword_0_4_0());
                              				
                            }
                            // InternalKEffects.g:3116:5: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                            // InternalKEffects.g:3117:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                            {
                            // InternalKEffects.g:3117:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                            // InternalKEffects.g:3118:7: lv_subExpressions_5_0= ruleAtomicValuedExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_4_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_subExpressions_5_0=ruleAtomicValuedExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
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

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:3138:3: this_InitExpression_6= ruleInitExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTernaryOperationAccess().getInitExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InitExpression_6=ruleInitExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InitExpression_6;
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
    // $ANTLR end "ruleTernaryOperation"


    // $ANTLR start "entryRuleInitExpression"
    // InternalKEffects.g:3153:1: entryRuleInitExpression returns [EObject current=null] : iv_ruleInitExpression= ruleInitExpression EOF ;
    public final EObject entryRuleInitExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitExpression = null;


        try {
            // InternalKEffects.g:3153:55: (iv_ruleInitExpression= ruleInitExpression EOF )
            // InternalKEffects.g:3154:2: iv_ruleInitExpression= ruleInitExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInitExpression=ruleInitExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitExpression; 
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
    // $ANTLR end "entryRuleInitExpression"


    // $ANTLR start "ruleInitExpression"
    // InternalKEffects.g:3160:1: ruleInitExpression returns [EObject current=null] : ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression ) ;
    public final EObject ruleInitExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_AtomicValuedExpression_4 = null;



        	enterRule();

        try {
            // InternalKEffects.g:3166:2: ( ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression ) )
            // InternalKEffects.g:3167:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression )
            {
            // InternalKEffects.g:3167:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression )
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // InternalKEffects.g:3168:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    {
                    // InternalKEffects.g:3168:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    // InternalKEffects.g:3169:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKEffects.g:3169:4: ()
                    // InternalKEffects.g:3170:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInitExpressionAccess().getOperatorExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKEffects.g:3179:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
                    // InternalKEffects.g:3180:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    {
                    // InternalKEffects.g:3180:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    // InternalKEffects.g:3181:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInitExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
                    lv_subExpressions_1_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInitExpressionRule());
                      						}
                      						add(
                      							current,
                      							"subExpressions",
                      							lv_subExpressions_1_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKEffects.g:3198:4: ( (lv_operator_2_0= ruleInitOperator ) )
                    // InternalKEffects.g:3199:5: (lv_operator_2_0= ruleInitOperator )
                    {
                    // InternalKEffects.g:3199:5: (lv_operator_2_0= ruleInitOperator )
                    // InternalKEffects.g:3200:6: lv_operator_2_0= ruleInitOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInitExpressionAccess().getOperatorInitOperatorEnumRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
                    lv_operator_2_0=ruleInitOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInitExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.InitOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKEffects.g:3217:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKEffects.g:3218:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKEffects.g:3218:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKEffects.g:3219:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInitExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInitExpressionRule());
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


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:3238:3: this_AtomicValuedExpression_4= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInitExpressionAccess().getAtomicValuedExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicValuedExpression_4=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AtomicValuedExpression_4;
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
    // $ANTLR end "ruleInitExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKEffects.g:3253:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKEffects.g:3253:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKEffects.g:3254:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalKEffects.g:3260:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_ReferenceCall_5 = null;

        EObject this_FunctionCall_6 = null;

        EObject this_RandomCall_7 = null;

        EObject this_RandomizeCall_8 = null;

        EObject this_TextExpression_9 = null;



        	enterRule();

        try {
            // InternalKEffects.g:3266:2: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression ) )
            // InternalKEffects.g:3267:2: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )
            {
            // InternalKEffects.g:3267:2: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )
            int alt60=8;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // InternalKEffects.g:3268:3: this_BoolValue_0= ruleBoolValue
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
                    // InternalKEffects.g:3280:3: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
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
                    // InternalKEffects.g:3292:3: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalKEffects.g:3292:3: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalKEffects.g:3293:4: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_BoolExpression_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEffects.g:3314:3: this_ReferenceCall_5= ruleReferenceCall
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
                    // InternalKEffects.g:3326:3: this_FunctionCall_6= ruleFunctionCall
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
                    // InternalKEffects.g:3338:3: this_RandomCall_7= ruleRandomCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getRandomCallParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RandomCall_7=ruleRandomCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RandomCall_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalKEffects.g:3350:3: this_RandomizeCall_8= ruleRandomizeCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getRandomizeCallParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RandomizeCall_8=ruleRandomizeCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RandomizeCall_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalKEffects.g:3362:3: this_TextExpression_9= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextExpression_9=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TextExpression_9;
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
    // InternalKEffects.g:3377:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalKEffects.g:3377:63: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalKEffects.g:3378:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
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
    // InternalKEffects.g:3384:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) ;
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
            // InternalKEffects.g:3390:2: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) )
            // InternalKEffects.g:3391:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            {
            // InternalKEffects.g:3391:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            int alt61=6;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalKEffects.g:3392:3: this_IntValue_0= ruleIntValue
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
                    // InternalKEffects.g:3404:3: this_FloatValue_1= ruleFloatValue
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
                    // InternalKEffects.g:3416:3: this_StringValue_2= ruleStringValue
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
                    // InternalKEffects.g:3428:3: this_VectorValue_3= ruleVectorValue
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
                    // InternalKEffects.g:3440:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    {
                    // InternalKEffects.g:3440:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    // InternalKEffects.g:3441:4: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    this_ValuedExpression_5=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ValuedExpression_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKEffects.g:3462:3: this_AtomicExpression_7= ruleAtomicExpression
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
    // InternalKEffects.g:3477:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalKEffects.g:3477:67: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalKEffects.g:3478:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
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
    // InternalKEffects.g:3484:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference ) ;
    public final EObject ruleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_operator_1_1 = null;

        Enumerator lv_operator_1_2 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        EObject this_ValuedObjectReference_7 = null;



        	enterRule();

        try {
            // InternalKEffects.g:3490:2: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference ) )
            // InternalKEffects.g:3491:2: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference )
            {
            // InternalKEffects.g:3491:2: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==73||LA64_0==75) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_ID) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalKEffects.g:3492:3: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' )
                    {
                    // InternalKEffects.g:3492:3: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' )
                    // InternalKEffects.g:3493:4: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')'
                    {
                    // InternalKEffects.g:3493:4: ()
                    // InternalKEffects.g:3494:5: 
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

                    // InternalKEffects.g:3503:4: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalKEffects.g:3504:5: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalKEffects.g:3504:5: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalKEffects.g:3505:6: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalKEffects.g:3505:6: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==73) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==75) ) {
                        alt62=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalKEffects.g:3506:7: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_7);
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
                            // InternalKEffects.g:3522:7: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_7);
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

                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                      			
                    }
                    // InternalKEffects.g:3544:4: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalKEffects.g:3545:5: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalKEffects.g:3545:5: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalKEffects.g:3546:6: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
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

                    // InternalKEffects.g:3563:4: (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==20) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalKEffects.g:3564:5: otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) )
                            {
                            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getCommaKeyword_0_4_0());
                              				
                            }
                            // InternalKEffects.g:3568:5: ( (lv_subExpressions_5_0= ruleValuedObjectReference ) )
                            // InternalKEffects.g:3569:6: (lv_subExpressions_5_0= ruleValuedObjectReference )
                            {
                            // InternalKEffects.g:3569:6: (lv_subExpressions_5_0= ruleValuedObjectReference )
                            // InternalKEffects.g:3570:7: lv_subExpressions_5_0= ruleValuedObjectReference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectReferenceParserRuleCall_0_4_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_9);
                            lv_subExpressions_5_0=ruleValuedObjectReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                              							}
                              							add(
                              								current,
                              								"subExpressions",
                              								lv_subExpressions_5_0,
                              								"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:3594:3: this_ValuedObjectReference_7= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedObjectReference_7=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValuedObjectReference_7;
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
    // InternalKEffects.g:3609:1: entryRulePrimeID returns [String current=null] : iv_rulePrimeID= rulePrimeID EOF ;
    public final String entryRulePrimeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimeID = null;


        try {
            // InternalKEffects.g:3609:47: (iv_rulePrimeID= rulePrimeID EOF )
            // InternalKEffects.g:3610:2: iv_rulePrimeID= rulePrimeID EOF
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
    // InternalKEffects.g:3616:1: rulePrimeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '\\'' )* ) ;
    public final AntlrDatatypeRuleToken rulePrimeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalKEffects.g:3622:2: ( (this_ID_0= RULE_ID (kw= '\\'' )* ) )
            // InternalKEffects.g:3623:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            {
            // InternalKEffects.g:3623:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            // InternalKEffects.g:3624:3: this_ID_0= RULE_ID (kw= '\\'' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getPrimeIDAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalKEffects.g:3631:3: (kw= '\\'' )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==39) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalKEffects.g:3632:4: kw= '\\''
            	    {
            	    kw=(Token)match(input,39,FollowSets000.FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getPrimeIDAccess().getApostropheKeyword_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop65;
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
    // InternalKEffects.g:3642:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalKEffects.g:3642:62: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalKEffects.g:3643:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
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
    // InternalKEffects.g:3649:1: ruleValuedObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_indices_2_0 = null;

        EObject lv_subReference_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:3655:2: ( ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) )
            // InternalKEffects.g:3656:2: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            {
            // InternalKEffects.g:3656:2: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            // InternalKEffects.g:3657:3: ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            {
            // InternalKEffects.g:3657:3: ( ( rulePrimeID ) )
            // InternalKEffects.g:3658:4: ( rulePrimeID )
            {
            // InternalKEffects.g:3658:4: ( rulePrimeID )
            // InternalKEffects.g:3659:5: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_37);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKEffects.g:3676:3: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==40) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalKEffects.g:3677:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	      			
            	    }
            	    // InternalKEffects.g:3681:4: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalKEffects.g:3682:5: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalKEffects.g:3682:5: (lv_indices_2_0= ruleExpression )
            	    // InternalKEffects.g:3683:6: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
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

            	    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // InternalKEffects.g:3705:3: (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==42) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalKEffects.g:3706:4: otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    {
                    otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_2_0());
                      			
                    }
                    // InternalKEffects.g:3710:4: ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    // InternalKEffects.g:3711:5: (lv_subReference_5_0= ruleValuedObjectReference )
                    {
                    // InternalKEffects.g:3711:5: (lv_subReference_5_0= ruleValuedObjectReference )
                    // InternalKEffects.g:3712:6: lv_subReference_5_0= ruleValuedObjectReference
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
    // InternalKEffects.g:3734:1: entryRuleScheduleObjectReference returns [EObject current=null] : iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF ;
    public final EObject entryRuleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleObjectReference = null;


        try {
            // InternalKEffects.g:3734:64: (iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF )
            // InternalKEffects.g:3735:2: iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF
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
    // InternalKEffects.g:3741:1: ruleScheduleObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) ;
    public final EObject ruleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        Token lv_priority_1_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:3747:2: ( ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) )
            // InternalKEffects.g:3748:2: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            {
            // InternalKEffects.g:3748:2: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            // InternalKEffects.g:3749:3: ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) )
            {
            // InternalKEffects.g:3749:3: ( ( rulePrimeID ) )
            // InternalKEffects.g:3750:4: ( rulePrimeID )
            {
            // InternalKEffects.g:3750:4: ( rulePrimeID )
            // InternalKEffects.g:3751:5: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_39);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKEffects.g:3768:3: ( (lv_priority_1_0= RULE_INT ) )
            // InternalKEffects.g:3769:4: (lv_priority_1_0= RULE_INT )
            {
            // InternalKEffects.g:3769:4: (lv_priority_1_0= RULE_INT )
            // InternalKEffects.g:3770:5: lv_priority_1_0= RULE_INT
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
    // InternalKEffects.g:3790:1: entryRuleReferenceCall returns [EObject current=null] : iv_ruleReferenceCall= ruleReferenceCall EOF ;
    public final EObject entryRuleReferenceCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCall = null;


        try {
            // InternalKEffects.g:3790:54: (iv_ruleReferenceCall= ruleReferenceCall EOF )
            // InternalKEffects.g:3791:2: iv_ruleReferenceCall= ruleReferenceCall EOF
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
    // InternalKEffects.g:3797:1: ruleReferenceCall returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) ;
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
            // InternalKEffects.g:3803:2: ( ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) )
            // InternalKEffects.g:3804:2: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            {
            // InternalKEffects.g:3804:2: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            // InternalKEffects.g:3805:3: ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            {
            // InternalKEffects.g:3805:3: ( ( rulePrimeID ) )
            // InternalKEffects.g:3806:4: ( rulePrimeID )
            {
            // InternalKEffects.g:3806:4: ( rulePrimeID )
            // InternalKEffects.g:3807:5: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_13);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKEffects.g:3824:3: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==18) ) {
                alt69=1;
            }
            else if ( (LA69_0==21) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalKEffects.g:3825:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    {
                    // InternalKEffects.g:3825:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    // InternalKEffects.g:3826:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getReferenceCallAccess().getLeftParenthesisKeyword_1_0_0());
                      				
                    }
                    // InternalKEffects.g:3830:5: ( (lv_parameters_2_0= ruleParameter ) )
                    // InternalKEffects.g:3831:6: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalKEffects.g:3831:6: (lv_parameters_2_0= ruleParameter )
                    // InternalKEffects.g:3832:7: lv_parameters_2_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
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

                    // InternalKEffects.g:3849:5: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==20) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalKEffects.g:3850:6: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getReferenceCallAccess().getCommaKeyword_1_0_2_0());
                    	      					
                    	    }
                    	    // InternalKEffects.g:3854:6: ( (lv_parameters_4_0= ruleParameter ) )
                    	    // InternalKEffects.g:3855:7: (lv_parameters_4_0= ruleParameter )
                    	    {
                    	    // InternalKEffects.g:3855:7: (lv_parameters_4_0= ruleParameter )
                    	    // InternalKEffects.g:3856:8: lv_parameters_4_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_15);
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
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getReferenceCallAccess().getRightParenthesisKeyword_1_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:3880:4: otherlv_6= '()'
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleRandomCall"
    // InternalKEffects.g:3889:1: entryRuleRandomCall returns [EObject current=null] : iv_ruleRandomCall= ruleRandomCall EOF ;
    public final EObject entryRuleRandomCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomCall = null;


        try {
            // InternalKEffects.g:3889:51: (iv_ruleRandomCall= ruleRandomCall EOF )
            // InternalKEffects.g:3890:2: iv_ruleRandomCall= ruleRandomCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRandomCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRandomCall=ruleRandomCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRandomCall; 
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
    // $ANTLR end "entryRuleRandomCall"


    // $ANTLR start "ruleRandomCall"
    // InternalKEffects.g:3896:1: ruleRandomCall returns [EObject current=null] : ( () otherlv_1= 'random' (otherlv_2= '()' )? ) ;
    public final EObject ruleRandomCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKEffects.g:3902:2: ( ( () otherlv_1= 'random' (otherlv_2= '()' )? ) )
            // InternalKEffects.g:3903:2: ( () otherlv_1= 'random' (otherlv_2= '()' )? )
            {
            // InternalKEffects.g:3903:2: ( () otherlv_1= 'random' (otherlv_2= '()' )? )
            // InternalKEffects.g:3904:3: () otherlv_1= 'random' (otherlv_2= '()' )?
            {
            // InternalKEffects.g:3904:3: ()
            // InternalKEffects.g:3905:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRandomCallAccess().getRandomCallAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRandomCallAccess().getRandomKeyword_1());
              		
            }
            // InternalKEffects.g:3918:3: (otherlv_2= '()' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==21) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalKEffects.g:3919:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRandomCallAccess().getLeftParenthesisRightParenthesisKeyword_2());
                      			
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
    // $ANTLR end "ruleRandomCall"


    // $ANTLR start "entryRuleRandomizeCall"
    // InternalKEffects.g:3928:1: entryRuleRandomizeCall returns [EObject current=null] : iv_ruleRandomizeCall= ruleRandomizeCall EOF ;
    public final EObject entryRuleRandomizeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomizeCall = null;


        try {
            // InternalKEffects.g:3928:54: (iv_ruleRandomizeCall= ruleRandomizeCall EOF )
            // InternalKEffects.g:3929:2: iv_ruleRandomizeCall= ruleRandomizeCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRandomizeCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRandomizeCall=ruleRandomizeCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRandomizeCall; 
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
    // $ANTLR end "entryRuleRandomizeCall"


    // $ANTLR start "ruleRandomizeCall"
    // InternalKEffects.g:3935:1: ruleRandomizeCall returns [EObject current=null] : ( () otherlv_1= 'randomize' (otherlv_2= '()' )? ) ;
    public final EObject ruleRandomizeCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKEffects.g:3941:2: ( ( () otherlv_1= 'randomize' (otherlv_2= '()' )? ) )
            // InternalKEffects.g:3942:2: ( () otherlv_1= 'randomize' (otherlv_2= '()' )? )
            {
            // InternalKEffects.g:3942:2: ( () otherlv_1= 'randomize' (otherlv_2= '()' )? )
            // InternalKEffects.g:3943:3: () otherlv_1= 'randomize' (otherlv_2= '()' )?
            {
            // InternalKEffects.g:3943:3: ()
            // InternalKEffects.g:3944:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRandomizeCallAccess().getRandomizeCallAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRandomizeCallAccess().getRandomizeKeyword_1());
              		
            }
            // InternalKEffects.g:3957:3: (otherlv_2= '()' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==21) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalKEffects.g:3958:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRandomizeCallAccess().getLeftParenthesisRightParenthesisKeyword_2());
                      			
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
    // $ANTLR end "ruleRandomizeCall"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalKEffects.g:3967:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKEffects.g:3967:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKEffects.g:3968:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalKEffects.g:3974:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) ;
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
            // InternalKEffects.g:3980:2: ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) )
            // InternalKEffects.g:3981:2: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            {
            // InternalKEffects.g:3981:2: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            // InternalKEffects.g:3982:3: otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getExternKeyword_0());
              		
            }
            // InternalKEffects.g:3986:3: ( (lv_functionName_1_0= RULE_ID ) )
            // InternalKEffects.g:3987:4: (lv_functionName_1_0= RULE_ID )
            {
            // InternalKEffects.g:3987:4: (lv_functionName_1_0= RULE_ID )
            // InternalKEffects.g:3988:5: lv_functionName_1_0= RULE_ID
            {
            lv_functionName_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); if (state.failed) return current;
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

            // InternalKEffects.g:4004:3: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==18) ) {
                alt73=1;
            }
            else if ( (LA73_0==21) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalKEffects.g:4005:4: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalKEffects.g:4005:4: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalKEffects.g:4006:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                      				
                    }
                    // InternalKEffects.g:4010:5: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalKEffects.g:4011:6: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalKEffects.g:4011:6: (lv_parameters_3_0= ruleParameter )
                    // InternalKEffects.g:4012:7: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
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

                    // InternalKEffects.g:4029:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==20) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalKEffects.g:4030:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	      					
                    	    }
                    	    // InternalKEffects.g:4034:6: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalKEffects.g:4035:7: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalKEffects.g:4035:7: (lv_parameters_5_0= ruleParameter )
                    	    // InternalKEffects.g:4036:8: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_15);
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
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:4060:4: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:4069:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalKEffects.g:4069:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalKEffects.g:4070:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalKEffects.g:4076:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4082:2: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKEffects.g:4083:2: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKEffects.g:4083:2: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKEffects.g:4084:3: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKEffects.g:4084:3: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==44) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==29) ) {
                    alt75=1;
                }
            }
            else if ( (LA75_0==29) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalKEffects.g:4085:4: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalKEffects.g:4085:4: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==44) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalKEffects.g:4086:5: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalKEffects.g:4086:5: (lv_pureOutput_0_0= '!' )
                            // InternalKEffects.g:4087:6: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,44,FollowSets000.FOLLOW_41); if (state.failed) return current;
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

                    // InternalKEffects.g:4099:4: ( (lv_callByReference_1_0= '&' ) )
                    // InternalKEffects.g:4100:5: (lv_callByReference_1_0= '&' )
                    {
                    // InternalKEffects.g:4100:5: (lv_callByReference_1_0= '&' )
                    // InternalKEffects.g:4101:6: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,29,FollowSets000.FOLLOW_8); if (state.failed) return current;
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

            // InternalKEffects.g:4114:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKEffects.g:4115:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalKEffects.g:4115:4: (lv_expression_2_0= ruleExpression )
            // InternalKEffects.g:4116:5: lv_expression_2_0= ruleExpression
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
    // InternalKEffects.g:4137:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalKEffects.g:4137:55: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalKEffects.g:4138:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalKEffects.g:4144:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4150:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalKEffects.g:4151:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalKEffects.g:4151:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalKEffects.g:4152:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalKEffects.g:4152:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_COMMENT_ANNOTATION||LA76_0==50) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalKEffects.g:4153:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEffects.g:4153:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEffects.g:4154:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTextExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTextExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_0_0,
            	      						"de.cau.cs.kieler.kexpressions.KExpressions.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            // InternalKEffects.g:4171:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalKEffects.g:4172:4: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalKEffects.g:4172:4: (lv_text_1_0= RULE_HOSTCODE )
            // InternalKEffects.g:4173:5: lv_text_1_0= RULE_HOSTCODE
            {
            lv_text_1_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_text_1_0, grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTextExpressionRule());
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
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // InternalKEffects.g:4193:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalKEffects.g:4193:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalKEffects.g:4194:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalKEffects.g:4200:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:4206:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalKEffects.g:4207:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalKEffects.g:4207:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalKEffects.g:4208:3: (lv_value_0_0= RULE_INT )
            {
            // InternalKEffects.g:4208:3: (lv_value_0_0= RULE_INT )
            // InternalKEffects.g:4209:4: lv_value_0_0= RULE_INT
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
    // InternalKEffects.g:4228:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalKEffects.g:4228:51: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalKEffects.g:4229:2: iv_ruleFloatValue= ruleFloatValue EOF
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
    // InternalKEffects.g:4235:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:4241:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalKEffects.g:4242:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalKEffects.g:4242:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalKEffects.g:4243:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalKEffects.g:4243:3: (lv_value_0_0= RULE_FLOAT )
            // InternalKEffects.g:4244:4: lv_value_0_0= RULE_FLOAT
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
    // InternalKEffects.g:4263:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalKEffects.g:4263:50: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalKEffects.g:4264:2: iv_ruleBoolValue= ruleBoolValue EOF
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
    // InternalKEffects.g:4270:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:4276:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalKEffects.g:4277:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalKEffects.g:4277:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalKEffects.g:4278:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalKEffects.g:4278:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalKEffects.g:4279:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalKEffects.g:4298:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalKEffects.g:4298:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalKEffects.g:4299:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalKEffects.g:4305:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:4311:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalKEffects.g:4312:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalKEffects.g:4312:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalKEffects.g:4313:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalKEffects.g:4313:3: (lv_value_0_0= RULE_STRING )
            // InternalKEffects.g:4314:4: lv_value_0_0= RULE_STRING
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
    // InternalKEffects.g:4333:1: entryRuleVectorValue returns [EObject current=null] : iv_ruleVectorValue= ruleVectorValue EOF ;
    public final EObject entryRuleVectorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValue = null;


        try {
            // InternalKEffects.g:4333:52: (iv_ruleVectorValue= ruleVectorValue EOF )
            // InternalKEffects.g:4334:2: iv_ruleVectorValue= ruleVectorValue EOF
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
    // InternalKEffects.g:4340:1: ruleVectorValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleVectorValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4346:2: ( (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' ) )
            // InternalKEffects.g:4347:2: (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' )
            {
            // InternalKEffects.g:4347:2: (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' )
            // InternalKEffects.g:4348:3: otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVectorValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalKEffects.g:4352:3: ( (lv_values_1_0= ruleVectorValueMember ) )
            // InternalKEffects.g:4353:4: (lv_values_1_0= ruleVectorValueMember )
            {
            // InternalKEffects.g:4353:4: (lv_values_1_0= ruleVectorValueMember )
            // InternalKEffects.g:4354:5: lv_values_1_0= ruleVectorValueMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_43);
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

            // InternalKEffects.g:4371:3: (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==20) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalKEffects.g:4372:4: otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getVectorValueAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalKEffects.g:4376:4: ( (lv_values_3_0= ruleVectorValueMember ) )
            	    // InternalKEffects.g:4377:5: (lv_values_3_0= ruleVectorValueMember )
            	    {
            	    // InternalKEffects.g:4377:5: (lv_values_3_0= ruleVectorValueMember )
            	    // InternalKEffects.g:4378:6: lv_values_3_0= ruleVectorValueMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_43);
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
            	    break loop77;
                }
            } while (true);

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:4404:1: entryRuleVectorValueMember returns [EObject current=null] : iv_ruleVectorValueMember= ruleVectorValueMember EOF ;
    public final EObject entryRuleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValueMember = null;


        try {
            // InternalKEffects.g:4404:58: (iv_ruleVectorValueMember= ruleVectorValueMember EOF )
            // InternalKEffects.g:4405:2: iv_ruleVectorValueMember= ruleVectorValueMember EOF
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
    // InternalKEffects.g:4411:1: ruleVectorValueMember returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) ;
    public final EObject ruleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;

        EObject this_IgnoreValue_2 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4417:2: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) )
            // InternalKEffects.g:4418:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            {
            // InternalKEffects.g:4418:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            int alt78=3;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // InternalKEffects.g:4419:3: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVectorValueMemberAccess().getBoolExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalKEffects.g:4431:3: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVectorValueMemberAccess().getValuedExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedExpression_1=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValuedExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKEffects.g:4443:3: this_IgnoreValue_2= ruleIgnoreValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVectorValueMemberAccess().getIgnoreValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IgnoreValue_2=ruleIgnoreValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IgnoreValue_2;
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
    // InternalKEffects.g:4458:1: entryRuleIgnoreValue returns [EObject current=null] : iv_ruleIgnoreValue= ruleIgnoreValue EOF ;
    public final EObject entryRuleIgnoreValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnoreValue = null;


        try {
            // InternalKEffects.g:4458:52: (iv_ruleIgnoreValue= ruleIgnoreValue EOF )
            // InternalKEffects.g:4459:2: iv_ruleIgnoreValue= ruleIgnoreValue EOF
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
    // InternalKEffects.g:4465:1: ruleIgnoreValue returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject ruleIgnoreValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKEffects.g:4471:2: ( ( () otherlv_1= '_' ) )
            // InternalKEffects.g:4472:2: ( () otherlv_1= '_' )
            {
            // InternalKEffects.g:4472:2: ( () otherlv_1= '_' )
            // InternalKEffects.g:4473:3: () otherlv_1= '_'
            {
            // InternalKEffects.g:4473:3: ()
            // InternalKEffects.g:4474:4: 
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

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAnyValue"
    // InternalKEffects.g:4491:1: entryRuleAnyValue returns [EObject current=null] : iv_ruleAnyValue= ruleAnyValue EOF ;
    public final EObject entryRuleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyValue = null;


        try {
            // InternalKEffects.g:4491:49: (iv_ruleAnyValue= ruleAnyValue EOF )
            // InternalKEffects.g:4492:2: iv_ruleAnyValue= ruleAnyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnyValue=ruleAnyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyValue; 
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
    // $ANTLR end "entryRuleAnyValue"


    // $ANTLR start "ruleAnyValue"
    // InternalKEffects.g:4498:1: ruleAnyValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) ;
    public final EObject ruleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_BoolValue_2 = null;

        EObject this_StringValue_3 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4504:2: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) )
            // InternalKEffects.g:4505:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            {
            // InternalKEffects.g:4505:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            int alt79=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt79=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt79=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt79=3;
                }
                break;
            case RULE_STRING:
                {
                alt79=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalKEffects.g:4506:3: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnyValueAccess().getIntValueParserRuleCall_0());
                      		
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
                    // InternalKEffects.g:4518:3: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnyValueAccess().getFloatValueParserRuleCall_1());
                      		
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
                    // InternalKEffects.g:4530:3: this_BoolValue_2= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnyValueAccess().getBoolValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BoolValue_2=ruleBoolValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoolValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKEffects.g:4542:3: this_StringValue_3= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnyValueAccess().getStringValueParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValue_3=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValue_3;
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
    // $ANTLR end "ruleAnyValue"


    // $ANTLR start "entryRuleJsonObjectValue"
    // InternalKEffects.g:4557:1: entryRuleJsonObjectValue returns [EObject current=null] : iv_ruleJsonObjectValue= ruleJsonObjectValue EOF ;
    public final EObject entryRuleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectValue = null;


        try {
            // InternalKEffects.g:4557:56: (iv_ruleJsonObjectValue= ruleJsonObjectValue EOF )
            // InternalKEffects.g:4558:2: iv_ruleJsonObjectValue= ruleJsonObjectValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonObjectValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonObjectValue=ruleJsonObjectValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonObjectValue; 
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
    // $ANTLR end "entryRuleJsonObjectValue"


    // $ANTLR start "ruleJsonObjectValue"
    // InternalKEffects.g:4564:1: ruleJsonObjectValue returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4570:2: ( ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' ) )
            // InternalKEffects.g:4571:2: ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' )
            {
            // InternalKEffects.g:4571:2: ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' )
            // InternalKEffects.g:4572:3: () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}'
            {
            // InternalKEffects.g:4572:3: ()
            // InternalKEffects.g:4573:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJsonObjectValueAccess().getJsonObjectValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonObjectValueAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalKEffects.g:4586:3: ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_STRING) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalKEffects.g:4587:4: ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )*
                    {
                    // InternalKEffects.g:4587:4: ( (lv_members_2_0= ruleJsonObjectMember ) )
                    // InternalKEffects.g:4588:5: (lv_members_2_0= ruleJsonObjectMember )
                    {
                    // InternalKEffects.g:4588:5: (lv_members_2_0= ruleJsonObjectMember )
                    // InternalKEffects.g:4589:6: lv_members_2_0= ruleJsonObjectMember
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJsonObjectValueAccess().getMembersJsonObjectMemberParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
                    lv_members_2_0=ruleJsonObjectMember();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJsonObjectValueRule());
                      						}
                      						add(
                      							current,
                      							"members",
                      							lv_members_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.JsonObjectMember");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKEffects.g:4606:4: (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==20) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalKEffects.g:4607:5: otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJsonObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:4611:5: ( (lv_members_4_0= ruleJsonObjectMember ) )
                    	    // InternalKEffects.g:4612:6: (lv_members_4_0= ruleJsonObjectMember )
                    	    {
                    	    // InternalKEffects.g:4612:6: (lv_members_4_0= ruleJsonObjectMember )
                    	    // InternalKEffects.g:4613:7: lv_members_4_0= ruleJsonObjectMember
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJsonObjectValueAccess().getMembersJsonObjectMemberParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_43);
                    	    lv_members_4_0=ruleJsonObjectMember();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJsonObjectValueRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"members",
                    	      								lv_members_4_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.JsonObjectMember");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getJsonObjectValueAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleJsonObjectValue"


    // $ANTLR start "entryRuleJsonObjectMember"
    // InternalKEffects.g:4640:1: entryRuleJsonObjectMember returns [EObject current=null] : iv_ruleJsonObjectMember= ruleJsonObjectMember EOF ;
    public final EObject entryRuleJsonObjectMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectMember = null;


        try {
            // InternalKEffects.g:4640:57: (iv_ruleJsonObjectMember= ruleJsonObjectMember EOF )
            // InternalKEffects.g:4641:2: iv_ruleJsonObjectMember= ruleJsonObjectMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonObjectMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonObjectMember=ruleJsonObjectMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonObjectMember; 
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
    // $ANTLR end "entryRuleJsonObjectMember"


    // $ANTLR start "ruleJsonObjectMember"
    // InternalKEffects.g:4647:1: ruleJsonObjectMember returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) ) ;
    public final EObject ruleJsonObjectMember() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4653:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) ) )
            // InternalKEffects.g:4654:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) )
            {
            // InternalKEffects.g:4654:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) )
            // InternalKEffects.g:4655:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) )
            {
            // InternalKEffects.g:4655:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalKEffects.g:4656:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalKEffects.g:4656:4: (lv_key_0_0= RULE_STRING )
            // InternalKEffects.g:4657:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_key_0_0, grammarAccess.getJsonObjectMemberAccess().getKeySTRINGTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getJsonObjectMemberRule());
              					}
              					setWithLastConsumed(
              						current,
              						"key",
              						lv_key_0_0,
              						"de.cau.cs.kieler.annotations.Annotations.STRING");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonObjectMemberAccess().getColonKeyword_1());
              		
            }
            // InternalKEffects.g:4677:3: ( (lv_value_2_0= ruleJsonValue ) )
            // InternalKEffects.g:4678:4: (lv_value_2_0= ruleJsonValue )
            {
            // InternalKEffects.g:4678:4: (lv_value_2_0= ruleJsonValue )
            // InternalKEffects.g:4679:5: lv_value_2_0= ruleJsonValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonObjectMemberAccess().getValueJsonValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleJsonValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJsonObjectMemberRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.JsonValue");
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
    // $ANTLR end "ruleJsonObjectMember"


    // $ANTLR start "entryRuleJsonArrayValue"
    // InternalKEffects.g:4700:1: entryRuleJsonArrayValue returns [EObject current=null] : iv_ruleJsonArrayValue= ruleJsonArrayValue EOF ;
    public final EObject entryRuleJsonArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArrayValue = null;


        try {
            // InternalKEffects.g:4700:55: (iv_ruleJsonArrayValue= ruleJsonArrayValue EOF )
            // InternalKEffects.g:4701:2: iv_ruleJsonArrayValue= ruleJsonArrayValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonArrayValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonArrayValue=ruleJsonArrayValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonArrayValue; 
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
    // $ANTLR end "entryRuleJsonArrayValue"


    // $ANTLR start "ruleJsonArrayValue"
    // InternalKEffects.g:4707:1: ruleJsonArrayValue returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleJsonArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4713:2: ( ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' ) )
            // InternalKEffects.g:4714:2: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' )
            {
            // InternalKEffects.g:4714:2: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' )
            // InternalKEffects.g:4715:3: () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']'
            {
            // InternalKEffects.g:4715:3: ()
            // InternalKEffects.g:4716:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJsonArrayValueAccess().getJsonArrayValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonArrayValueAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalKEffects.g:4729:3: ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=RULE_INT && LA83_0<=RULE_STRING)||LA83_0==40||LA83_0==45||LA83_0==48) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalKEffects.g:4730:4: ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )*
                    {
                    // InternalKEffects.g:4730:4: ( (lv_elements_2_0= ruleJsonValue ) )
                    // InternalKEffects.g:4731:5: (lv_elements_2_0= ruleJsonValue )
                    {
                    // InternalKEffects.g:4731:5: (lv_elements_2_0= ruleJsonValue )
                    // InternalKEffects.g:4732:6: lv_elements_2_0= ruleJsonValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJsonArrayValueAccess().getElementsJsonValueParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_49);
                    lv_elements_2_0=ruleJsonValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJsonArrayValueRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.JsonValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKEffects.g:4749:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==20) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalKEffects.g:4750:5: otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_47); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJsonArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:4754:5: ( (lv_elements_4_0= ruleJsonValue ) )
                    	    // InternalKEffects.g:4755:6: (lv_elements_4_0= ruleJsonValue )
                    	    {
                    	    // InternalKEffects.g:4755:6: (lv_elements_4_0= ruleJsonValue )
                    	    // InternalKEffects.g:4756:7: lv_elements_4_0= ruleJsonValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJsonArrayValueAccess().getElementsJsonValueParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_49);
                    	    lv_elements_4_0=ruleJsonValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJsonArrayValueRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_4_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.JsonValue");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getJsonArrayValueAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleJsonArrayValue"


    // $ANTLR start "entryRuleJsonValue"
    // InternalKEffects.g:4783:1: entryRuleJsonValue returns [EObject current=null] : iv_ruleJsonValue= ruleJsonValue EOF ;
    public final EObject entryRuleJsonValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonValue = null;


        try {
            // InternalKEffects.g:4783:50: (iv_ruleJsonValue= ruleJsonValue EOF )
            // InternalKEffects.g:4784:2: iv_ruleJsonValue= ruleJsonValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonValue=ruleJsonValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonValue; 
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
    // $ANTLR end "entryRuleJsonValue"


    // $ANTLR start "ruleJsonValue"
    // InternalKEffects.g:4790:1: ruleJsonValue returns [EObject current=null] : (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue ) ;
    public final EObject ruleJsonValue() throws RecognitionException {
        EObject current = null;

        EObject this_JsonObjectValue_0 = null;

        EObject this_JsonArrayValue_1 = null;

        EObject this_NullValue_2 = null;

        EObject this_AnyValue_3 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4796:2: ( (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue ) )
            // InternalKEffects.g:4797:2: (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue )
            {
            // InternalKEffects.g:4797:2: (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue )
            int alt84=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt84=1;
                }
                break;
            case 40:
                {
                alt84=2;
                }
                break;
            case 48:
                {
                alt84=3;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case RULE_STRING:
                {
                alt84=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalKEffects.g:4798:3: this_JsonObjectValue_0= ruleJsonObjectValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getJsonObjectValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_JsonObjectValue_0=ruleJsonObjectValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JsonObjectValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKEffects.g:4810:3: this_JsonArrayValue_1= ruleJsonArrayValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getJsonArrayValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_JsonArrayValue_1=ruleJsonArrayValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JsonArrayValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKEffects.g:4822:3: this_NullValue_2= ruleNullValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getNullValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NullValue_2=ruleNullValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKEffects.g:4834:3: this_AnyValue_3= ruleAnyValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getAnyValueParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AnyValue_3=ruleAnyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AnyValue_3;
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
    // $ANTLR end "ruleJsonValue"


    // $ANTLR start "entryRuleNullValue"
    // InternalKEffects.g:4849:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalKEffects.g:4849:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalKEffects.g:4850:2: iv_ruleNullValue= ruleNullValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNullValue=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullValue; 
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
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // InternalKEffects.g:4856:1: ruleNullValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKEffects.g:4862:2: ( ( () otherlv_1= 'null' ) )
            // InternalKEffects.g:4863:2: ( () otherlv_1= 'null' )
            {
            // InternalKEffects.g:4863:2: ( () otherlv_1= 'null' )
            // InternalKEffects.g:4864:3: () otherlv_1= 'null'
            {
            // InternalKEffects.g:4864:3: ()
            // InternalKEffects.g:4865:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNullValueAccess().getNullValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNullValueAccess().getNullKeyword_1());
              		
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
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleJsonPragma"
    // InternalKEffects.g:4882:1: entryRuleJsonPragma returns [EObject current=null] : iv_ruleJsonPragma= ruleJsonPragma EOF ;
    public final EObject entryRuleJsonPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonPragma = null;


        try {
            // InternalKEffects.g:4882:51: (iv_ruleJsonPragma= ruleJsonPragma EOF )
            // InternalKEffects.g:4883:2: iv_ruleJsonPragma= ruleJsonPragma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonPragmaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonPragma=ruleJsonPragma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonPragma; 
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
    // $ANTLR end "entryRuleJsonPragma"


    // $ANTLR start "ruleJsonPragma"
    // InternalKEffects.g:4889:1: ruleJsonPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) ;
    public final EObject ruleJsonPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4895:2: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) )
            // InternalKEffects.g:4896:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            {
            // InternalKEffects.g:4896:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            // InternalKEffects.g:4897:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) )
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJsonPragmaAccess().getNumberSignKeyword_0());
              		
            }
            // InternalKEffects.g:4901:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:4902:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:4902:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:4903:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonPragmaAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_50);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJsonPragmaRule());
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

            // InternalKEffects.g:4920:3: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // InternalKEffects.g:4921:4: (lv_value_2_0= ruleJsonObjectValue )
            {
            // InternalKEffects.g:4921:4: (lv_value_2_0= ruleJsonObjectValue )
            // InternalKEffects.g:4922:5: lv_value_2_0= ruleJsonObjectValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonPragmaAccess().getValueJsonObjectValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleJsonObjectValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJsonPragmaRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.JsonObjectValue");
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
    // $ANTLR end "ruleJsonPragma"


    // $ANTLR start "entryRuleJsonAnnotation"
    // InternalKEffects.g:4943:1: entryRuleJsonAnnotation returns [EObject current=null] : iv_ruleJsonAnnotation= ruleJsonAnnotation EOF ;
    public final EObject entryRuleJsonAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonAnnotation = null;


        try {
            // InternalKEffects.g:4943:55: (iv_ruleJsonAnnotation= ruleJsonAnnotation EOF )
            // InternalKEffects.g:4944:2: iv_ruleJsonAnnotation= ruleJsonAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonAnnotation=ruleJsonAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonAnnotation; 
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
    // $ANTLR end "entryRuleJsonAnnotation"


    // $ANTLR start "ruleJsonAnnotation"
    // InternalKEffects.g:4950:1: ruleJsonAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) ;
    public final EObject ruleJsonAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4956:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) )
            // InternalKEffects.g:4957:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            {
            // InternalKEffects.g:4957:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            // InternalKEffects.g:4958:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) )
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJsonAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:4962:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:4963:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:4963:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:4964:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_50);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJsonAnnotationRule());
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

            // InternalKEffects.g:4981:3: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // InternalKEffects.g:4982:4: (lv_value_2_0= ruleJsonObjectValue )
            {
            // InternalKEffects.g:4982:4: (lv_value_2_0= ruleJsonObjectValue )
            // InternalKEffects.g:4983:5: lv_value_2_0= ruleJsonObjectValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonAnnotationAccess().getValueJsonObjectValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleJsonObjectValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJsonAnnotationRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.JsonObjectValue");
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
    // $ANTLR end "ruleJsonAnnotation"


    // $ANTLR start "entryRuleAnnotation"
    // InternalKEffects.g:5004:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalKEffects.g:5004:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalKEffects.g:5005:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalKEffects.g:5011:1: ruleAnnotation returns [EObject current=null] : (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_Annotation_0 = null;

        EObject this_JsonAnnotation_1 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5017:2: ( (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation ) )
            // InternalKEffects.g:5018:2: (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )
            {
            // InternalKEffects.g:5018:2: (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // InternalKEffects.g:5019:3: this_Annotation_0= superAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Annotation_0=superAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Annotation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKEffects.g:5031:3: this_JsonAnnotation_1= ruleJsonAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationAccess().getJsonAnnotationParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_JsonAnnotation_1=ruleJsonAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JsonAnnotation_1;
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


    // $ANTLR start "entryRuleQuotedStringAnnotation"
    // InternalKEffects.g:5046:1: entryRuleQuotedStringAnnotation returns [EObject current=null] : iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF ;
    public final EObject entryRuleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedStringAnnotation = null;


        try {
            // InternalKEffects.g:5046:63: (iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF )
            // InternalKEffects.g:5047:2: iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF
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
    // InternalKEffects.g:5053:1: ruleQuotedStringAnnotation returns [EObject current=null] : (this_QuotedStringAnnotation_0= superQuotedStringAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation ) ;
    public final EObject ruleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_QuotedStringAnnotation_0 = null;

        EObject this_JsonAnnotation_1 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5059:2: ( (this_QuotedStringAnnotation_0= superQuotedStringAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation ) )
            // InternalKEffects.g:5060:2: (this_QuotedStringAnnotation_0= superQuotedStringAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )
            {
            // InternalKEffects.g:5060:2: (this_QuotedStringAnnotation_0= superQuotedStringAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // InternalKEffects.g:5061:3: this_QuotedStringAnnotation_0= superQuotedStringAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getQuotedStringAnnotationParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QuotedStringAnnotation_0=superQuotedStringAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_QuotedStringAnnotation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKEffects.g:5073:3: this_JsonAnnotation_1= ruleJsonAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getJsonAnnotationParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_JsonAnnotation_1=ruleJsonAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JsonAnnotation_1;
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


    // $ANTLR start "entrySuperAnnotation"
    // InternalKEffects.g:5088:1: entrySuperAnnotation returns [EObject current=null] : iv_superAnnotation= superAnnotation EOF ;
    public final EObject entrySuperAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_superAnnotation = null;


        try {
            // InternalKEffects.g:5088:52: (iv_superAnnotation= superAnnotation EOF )
            // InternalKEffects.g:5089:2: iv_superAnnotation= superAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_superAnnotation=superAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_superAnnotation; 
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
    // $ANTLR end "entrySuperAnnotation"


    // $ANTLR start "superAnnotation"
    // InternalKEffects.g:5095:1: superAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject superAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5101:2: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKEffects.g:5102:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKEffects.g:5102:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt87=4;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // InternalKEffects.g:5103:3: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsAnnotationAccess().getCommentAnnotationParserRuleCall_0());
                      		
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
                    // InternalKEffects.g:5115:3: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1());
                      		
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
                    // InternalKEffects.g:5127:3: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2());
                      		
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
                    // InternalKEffects.g:5139:3: this_TagAnnotation_3= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsAnnotationAccess().getTagAnnotationParserRuleCall_3());
                      		
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
    // $ANTLR end "superAnnotation"


    // $ANTLR start "entrySuperPragma"
    // InternalKEffects.g:5154:1: entrySuperPragma returns [EObject current=null] : iv_superPragma= superPragma EOF ;
    public final EObject entrySuperPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_superPragma = null;


        try {
            // InternalKEffects.g:5154:48: (iv_superPragma= superPragma EOF )
            // InternalKEffects.g:5155:2: iv_superPragma= superPragma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsPragmaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_superPragma=superPragma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_superPragma; 
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
    // $ANTLR end "entrySuperPragma"


    // $ANTLR start "superPragma"
    // InternalKEffects.g:5161:1: superPragma returns [EObject current=null] : (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag ) ;
    public final EObject superPragma() throws RecognitionException {
        EObject current = null;

        EObject this_StringPragma_0 = null;

        EObject this_PragmaTag_1 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5167:2: ( (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag ) )
            // InternalKEffects.g:5168:2: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )
            {
            // InternalKEffects.g:5168:2: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // InternalKEffects.g:5169:3: this_StringPragma_0= ruleStringPragma
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsPragmaAccess().getStringPragmaParserRuleCall_0());
                      		
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
                    // InternalKEffects.g:5181:3: this_PragmaTag_1= rulePragmaTag
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsPragmaAccess().getPragmaTagParserRuleCall_1());
                      		
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
    // $ANTLR end "superPragma"


    // $ANTLR start "entrySuperValuedAnnotation"
    // InternalKEffects.g:5196:1: entrySuperValuedAnnotation returns [EObject current=null] : iv_superValuedAnnotation= superValuedAnnotation EOF ;
    public final EObject entrySuperValuedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_superValuedAnnotation = null;


        try {
            // InternalKEffects.g:5196:58: (iv_superValuedAnnotation= superValuedAnnotation EOF )
            // InternalKEffects.g:5197:2: iv_superValuedAnnotation= superValuedAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsValuedAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_superValuedAnnotation=superValuedAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_superValuedAnnotation; 
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
    // $ANTLR end "entrySuperValuedAnnotation"


    // $ANTLR start "superValuedAnnotation"
    // InternalKEffects.g:5203:1: superValuedAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation ) ;
    public final EObject superValuedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5209:2: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation ) )
            // InternalKEffects.g:5210:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation )
            {
            // InternalKEffects.g:5210:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation )
            int alt89=3;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // InternalKEffects.g:5211:3: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsValuedAnnotationAccess().getCommentAnnotationParserRuleCall_0());
                      		
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
                    // InternalKEffects.g:5223:3: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsValuedAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1());
                      		
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
                    // InternalKEffects.g:5235:3: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsValuedAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2());
                      		
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
    // $ANTLR end "superValuedAnnotation"


    // $ANTLR start "entrySuperQuotedStringAnnotation"
    // InternalKEffects.g:5250:1: entrySuperQuotedStringAnnotation returns [EObject current=null] : iv_superQuotedStringAnnotation= superQuotedStringAnnotation EOF ;
    public final EObject entrySuperQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_superQuotedStringAnnotation = null;


        try {
            // InternalKEffects.g:5250:64: (iv_superQuotedStringAnnotation= superQuotedStringAnnotation EOF )
            // InternalKEffects.g:5251:2: iv_superQuotedStringAnnotation= superQuotedStringAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsQuotedStringAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_superQuotedStringAnnotation=superQuotedStringAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_superQuotedStringAnnotation; 
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
    // $ANTLR end "entrySuperQuotedStringAnnotation"


    // $ANTLR start "superQuotedStringAnnotation"
    // InternalKEffects.g:5257:1: superQuotedStringAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject superQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_QuotedKeyStringValueAnnotation_1 = null;

        EObject this_QuotedTypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5263:2: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKEffects.g:5264:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKEffects.g:5264:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt90=4;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // InternalKEffects.g:5265:3: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsQuotedStringAnnotationAccess().getCommentAnnotationParserRuleCall_0());
                      		
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
                    // InternalKEffects.g:5277:3: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsQuotedStringAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1());
                      		
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
                    // InternalKEffects.g:5289:3: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsQuotedStringAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2());
                      		
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
                    // InternalKEffects.g:5301:3: this_TagAnnotation_3= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsQuotedStringAnnotationAccess().getTagAnnotationParserRuleCall_3());
                      		
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
    // $ANTLR end "superQuotedStringAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalKEffects.g:5316:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalKEffects.g:5316:58: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalKEffects.g:5317:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
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
    // InternalKEffects.g:5323:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:5329:2: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalKEffects.g:5330:2: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalKEffects.g:5330:2: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalKEffects.g:5331:3: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalKEffects.g:5331:3: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalKEffects.g:5332:4: lv_values_0_0= RULE_COMMENT_ANNOTATION
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


    // $ANTLR start "entryRuleTagAnnotation"
    // InternalKEffects.g:5351:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalKEffects.g:5351:54: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalKEffects.g:5352:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
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
    // InternalKEffects.g:5358:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5364:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKEffects.g:5365:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKEffects.g:5365:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKEffects.g:5366:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:5370:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:5371:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:5371:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:5372:5: lv_name_1_0= ruleExtendedID
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
    // InternalKEffects.g:5393:1: entryRulePragmaTag returns [EObject current=null] : iv_rulePragmaTag= rulePragmaTag EOF ;
    public final EObject entryRulePragmaTag() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaTag = null;


        try {
            // InternalKEffects.g:5393:50: (iv_rulePragmaTag= rulePragmaTag EOF )
            // InternalKEffects.g:5394:2: iv_rulePragmaTag= rulePragmaTag EOF
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
    // InternalKEffects.g:5400:1: rulePragmaTag returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject rulePragmaTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5406:2: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKEffects.g:5407:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKEffects.g:5407:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKEffects.g:5408:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0());
              		
            }
            // InternalKEffects.g:5412:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:5413:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:5413:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:5414:5: lv_name_1_0= ruleExtendedID
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
    // InternalKEffects.g:5435:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalKEffects.g:5435:65: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalKEffects.g:5436:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:5442:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5448:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKEffects.g:5449:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKEffects.g:5449:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKEffects.g:5450:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:5454:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:5455:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:5455:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:5456:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_51);
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

            // InternalKEffects.g:5473:3: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKEffects.g:5474:4: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKEffects.g:5474:4: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKEffects.g:5475:5: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_52);
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

            // InternalKEffects.g:5492:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==20) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalKEffects.g:5493:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKEffects.g:5497:4: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKEffects.g:5498:5: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKEffects.g:5498:5: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKEffects.g:5499:6: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_52);
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
            	    break loop91;
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
    // InternalKEffects.g:5521:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // InternalKEffects.g:5521:75: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:5522:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:5528:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5534:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalKEffects.g:5535:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKEffects.g:5535:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalKEffects.g:5536:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:5540:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:5541:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:5541:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:5542:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_53);
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

            // InternalKEffects.g:5559:3: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalKEffects.g:5560:4: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalKEffects.g:5560:4: (lv_values_2_0= ruleEStringBoolean )
            // InternalKEffects.g:5561:5: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_52);
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

            // InternalKEffects.g:5578:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==20) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalKEffects.g:5579:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKEffects.g:5583:4: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalKEffects.g:5584:5: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalKEffects.g:5584:5: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalKEffects.g:5585:6: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_52);
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
            	    break loop92;
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
    // InternalKEffects.g:5607:1: entryRuleStringPragma returns [EObject current=null] : iv_ruleStringPragma= ruleStringPragma EOF ;
    public final EObject entryRuleStringPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPragma = null;


        try {
            // InternalKEffects.g:5607:53: (iv_ruleStringPragma= ruleStringPragma EOF )
            // InternalKEffects.g:5608:2: iv_ruleStringPragma= ruleStringPragma EOF
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
    // InternalKEffects.g:5614:1: ruleStringPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleStringPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5620:2: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKEffects.g:5621:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKEffects.g:5621:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKEffects.g:5622:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0());
              		
            }
            // InternalKEffects.g:5626:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:5627:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:5627:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:5628:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_51);
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

            // InternalKEffects.g:5645:3: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKEffects.g:5646:4: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKEffects.g:5646:4: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKEffects.g:5647:5: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_52);
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

            // InternalKEffects.g:5664:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==20) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalKEffects.g:5665:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKEffects.g:5669:4: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKEffects.g:5670:5: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKEffects.g:5670:5: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKEffects.g:5671:6: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_52);
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
            	    break loop93;
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
    // InternalKEffects.g:5693:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalKEffects.g:5693:70: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:5694:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:5700:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
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
            // InternalKEffects.g:5706:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKEffects.g:5707:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKEffects.g:5707:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalKEffects.g:5708:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:5712:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:5713:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:5713:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:5714:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
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

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKEffects.g:5735:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKEffects.g:5736:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKEffects.g:5736:4: (lv_type_3_0= ruleExtendedID )
            // InternalKEffects.g:5737:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
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

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKEffects.g:5758:3: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalKEffects.g:5759:4: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalKEffects.g:5759:4: (lv_values_5_0= ruleEStringAllTypes )
            // InternalKEffects.g:5760:5: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_52);
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

            // InternalKEffects.g:5777:3: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==20) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalKEffects.g:5778:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKEffects.g:5782:4: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalKEffects.g:5783:5: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalKEffects.g:5783:5: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalKEffects.g:5784:6: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_52);
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
            	    break loop94;
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
    // InternalKEffects.g:5806:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKEffects.g:5806:80: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:5807:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:5813:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
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
            // InternalKEffects.g:5819:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalKEffects.g:5820:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKEffects.g:5820:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalKEffects.g:5821:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:5825:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:5826:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:5826:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:5827:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
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

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKEffects.g:5848:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKEffects.g:5849:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKEffects.g:5849:4: (lv_type_3_0= ruleExtendedID )
            // InternalKEffects.g:5850:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
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

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKEffects.g:5871:3: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalKEffects.g:5872:4: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalKEffects.g:5872:4: (lv_values_5_0= ruleEStringBoolean )
            // InternalKEffects.g:5873:5: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_52);
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

            // InternalKEffects.g:5890:3: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==20) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalKEffects.g:5891:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKEffects.g:5895:4: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalKEffects.g:5896:5: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalKEffects.g:5896:5: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalKEffects.g:5897:6: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_52);
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
            	    break loop95;
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
    // InternalKEffects.g:5919:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalKEffects.g:5919:71: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:5920:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:5926:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5932:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalKEffects.g:5933:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalKEffects.g:5933:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalKEffects.g:5934:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:5938:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:5939:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:5939:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:5940:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_45);
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

            // InternalKEffects.g:5957:3: ( (lv_values_2_0= RULE_STRING ) )
            // InternalKEffects.g:5958:4: (lv_values_2_0= RULE_STRING )
            {
            // InternalKEffects.g:5958:4: (lv_values_2_0= RULE_STRING )
            // InternalKEffects.g:5959:5: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_52); if (state.failed) return current;
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

            // InternalKEffects.g:5975:3: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==20) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalKEffects.g:5976:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKEffects.g:5980:4: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalKEffects.g:5981:5: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalKEffects.g:5981:5: (lv_values_4_0= RULE_STRING )
            	    // InternalKEffects.g:5982:6: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_52); if (state.failed) return current;
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
            	    break loop96;
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
    // InternalKEffects.g:6003:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKEffects.g:6003:76: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:6004:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:6010:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // InternalKEffects.g:6016:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalKEffects.g:6017:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalKEffects.g:6017:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalKEffects.g:6018:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:6022:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:6023:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:6023:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:6024:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
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

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKEffects.g:6045:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKEffects.g:6046:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKEffects.g:6046:4: (lv_type_3_0= ruleExtendedID )
            // InternalKEffects.g:6047:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
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

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKEffects.g:6068:3: ( (lv_values_5_0= RULE_STRING ) )
            // InternalKEffects.g:6069:4: (lv_values_5_0= RULE_STRING )
            {
            // InternalKEffects.g:6069:4: (lv_values_5_0= RULE_STRING )
            // InternalKEffects.g:6070:5: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_52); if (state.failed) return current;
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

            // InternalKEffects.g:6086:3: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==20) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalKEffects.g:6087:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKEffects.g:6091:4: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalKEffects.g:6092:5: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalKEffects.g:6092:5: (lv_values_7_0= RULE_STRING )
            	    // InternalKEffects.g:6093:6: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_52); if (state.failed) return current;
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
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalKEffects.g:6114:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalKEffects.g:6114:54: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalKEffects.g:6115:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
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
    // InternalKEffects.g:6121:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;



        	enterRule();

        try {
            // InternalKEffects.g:6127:2: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalKEffects.g:6128:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalKEffects.g:6128:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt98=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt98=1;
                }
                break;
            case RULE_ID:
                {
                alt98=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt98=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalKEffects.g:6129:3: this_STRING_0= RULE_STRING
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
                    // InternalKEffects.g:6137:3: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKEffects.g:6148:3: this_BOOLEAN_2= RULE_BOOLEAN
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
    // InternalKEffects.g:6159:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // InternalKEffects.g:6159:55: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalKEffects.g:6160:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
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
    // InternalKEffects.g:6166:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;



        	enterRule();

        try {
            // InternalKEffects.g:6172:2: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalKEffects.g:6173:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalKEffects.g:6173:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt99=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt99=1;
                }
                break;
            case RULE_ID:
                {
                alt99=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt99=3;
                }
                break;
            case 34:
                {
                int LA99_4 = input.LA(2);

                if ( (LA99_4==RULE_FLOAT) ) {
                    alt99=5;
                }
                else if ( (LA99_4==RULE_INT) ) {
                    alt99=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt99=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt99=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalKEffects.g:6174:3: this_STRING_0= RULE_STRING
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
                    // InternalKEffects.g:6182:3: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKEffects.g:6193:3: this_BOOLEAN_2= RULE_BOOLEAN
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
                    // InternalKEffects.g:6201:3: this_Integer_3= ruleInteger
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
                    // InternalKEffects.g:6212:3: this_Floateger_4= ruleFloateger
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
    // InternalKEffects.g:6226:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalKEffects.g:6226:50: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalKEffects.g:6227:2: iv_ruleExtendedID= ruleExtendedID EOF
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
    // InternalKEffects.g:6233:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_INT_5=null;


        	enterRule();

        try {
            // InternalKEffects.g:6239:2: ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) )
            // InternalKEffects.g:6240:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            {
            // InternalKEffects.g:6240:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            // InternalKEffects.g:6241:3: this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalKEffects.g:6248:3: ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==34) ) {
                    int LA101_2 = input.LA(2);

                    if ( (LA101_2==RULE_ID) ) {
                        alt101=1;
                    }


                }
                else if ( (LA101_0==42) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalKEffects.g:6249:4: (kw= '.' | kw= '-' ) this_ID_3= RULE_ID
            	    {
            	    // InternalKEffects.g:6249:4: (kw= '.' | kw= '-' )
            	    int alt100=2;
            	    int LA100_0 = input.LA(1);

            	    if ( (LA100_0==42) ) {
            	        alt100=1;
            	    }
            	    else if ( (LA100_0==34) ) {
            	        alt100=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 100, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt100) {
            	        case 1 :
            	            // InternalKEffects.g:6250:5: kw= '.'
            	            {
            	            kw=(Token)match(input,42,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalKEffects.g:6256:5: kw= '-'
            	            {
            	            kw=(Token)match(input,34,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_3, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            // InternalKEffects.g:6270:3: (kw= '#' this_INT_5= RULE_INT )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==49) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalKEffects.g:6271:4: kw= '#' this_INT_5= RULE_INT
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_39); if (state.failed) return current;
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
    // InternalKEffects.g:6288:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalKEffects.g:6288:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalKEffects.g:6289:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalKEffects.g:6295:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalKEffects.g:6301:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalKEffects.g:6302:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalKEffects.g:6302:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalKEffects.g:6303:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalKEffects.g:6303:3: (kw= '-' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==34) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalKEffects.g:6304:4: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_39); if (state.failed) return current;
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
    // InternalKEffects.g:6321:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalKEffects.g:6321:49: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalKEffects.g:6322:2: iv_ruleFloateger= ruleFloateger EOF
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
    // InternalKEffects.g:6328:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;


        	enterRule();

        try {
            // InternalKEffects.g:6334:2: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalKEffects.g:6335:2: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalKEffects.g:6335:2: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalKEffects.g:6336:3: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalKEffects.g:6336:3: (kw= '-' )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==34) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalKEffects.g:6337:4: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_56); if (state.failed) return current;
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


    // $ANTLR start "ruleAssignOperator"
    // InternalKEffects.g:6354:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) | (enumLiteral_12= 'min=' ) | (enumLiteral_13= 'max=' ) ) ;
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
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;


        	enterRule();

        try {
            // InternalKEffects.g:6360:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) | (enumLiteral_12= 'min=' ) | (enumLiteral_13= 'max=' ) ) )
            // InternalKEffects.g:6361:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) | (enumLiteral_12= 'min=' ) | (enumLiteral_13= 'max=' ) )
            {
            // InternalKEffects.g:6361:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) | (enumLiteral_12= 'min=' ) | (enumLiteral_13= 'max=' ) )
            int alt105=14;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt105=1;
                }
                break;
            case 52:
                {
                alt105=2;
                }
                break;
            case 53:
                {
                alt105=3;
                }
                break;
            case 54:
                {
                alt105=4;
                }
                break;
            case 55:
                {
                alt105=5;
                }
                break;
            case 56:
                {
                alt105=6;
                }
                break;
            case 57:
                {
                alt105=7;
                }
                break;
            case 58:
                {
                alt105=8;
                }
                break;
            case 59:
                {
                alt105=9;
                }
                break;
            case 60:
                {
                alt105=10;
                }
                break;
            case 61:
                {
                alt105=11;
                }
                break;
            case 62:
                {
                alt105=12;
                }
                break;
            case 63:
                {
                alt105=13;
                }
                break;
            case 64:
                {
                alt105=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // InternalKEffects.g:6362:3: (enumLiteral_0= '=' )
                    {
                    // InternalKEffects.g:6362:3: (enumLiteral_0= '=' )
                    // InternalKEffects.g:6363:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:6370:3: (enumLiteral_1= '+=' )
                    {
                    // InternalKEffects.g:6370:3: (enumLiteral_1= '+=' )
                    // InternalKEffects.g:6371:4: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEffects.g:6378:3: (enumLiteral_2= '-=' )
                    {
                    // InternalKEffects.g:6378:3: (enumLiteral_2= '-=' )
                    // InternalKEffects.g:6379:4: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEffects.g:6386:3: (enumLiteral_3= '*=' )
                    {
                    // InternalKEffects.g:6386:3: (enumLiteral_3= '*=' )
                    // InternalKEffects.g:6387:4: enumLiteral_3= '*='
                    {
                    enumLiteral_3=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEffects.g:6394:3: (enumLiteral_4= '/=' )
                    {
                    // InternalKEffects.g:6394:3: (enumLiteral_4= '/=' )
                    // InternalKEffects.g:6395:4: enumLiteral_4= '/='
                    {
                    enumLiteral_4=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKEffects.g:6402:3: (enumLiteral_5= '%=' )
                    {
                    // InternalKEffects.g:6402:3: (enumLiteral_5= '%=' )
                    // InternalKEffects.g:6403:4: enumLiteral_5= '%='
                    {
                    enumLiteral_5=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKEffects.g:6410:3: (enumLiteral_6= '&=' )
                    {
                    // InternalKEffects.g:6410:3: (enumLiteral_6= '&=' )
                    // InternalKEffects.g:6411:4: enumLiteral_6= '&='
                    {
                    enumLiteral_6=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKEffects.g:6418:3: (enumLiteral_7= '|=' )
                    {
                    // InternalKEffects.g:6418:3: (enumLiteral_7= '|=' )
                    // InternalKEffects.g:6419:4: enumLiteral_7= '|='
                    {
                    enumLiteral_7=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalKEffects.g:6426:3: (enumLiteral_8= '^=' )
                    {
                    // InternalKEffects.g:6426:3: (enumLiteral_8= '^=' )
                    // InternalKEffects.g:6427:4: enumLiteral_8= '^='
                    {
                    enumLiteral_8=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalKEffects.g:6434:3: (enumLiteral_9= '<<=' )
                    {
                    // InternalKEffects.g:6434:3: (enumLiteral_9= '<<=' )
                    // InternalKEffects.g:6435:4: enumLiteral_9= '<<='
                    {
                    enumLiteral_9=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTLEFTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTLEFTEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalKEffects.g:6442:3: (enumLiteral_10= '>>=' )
                    {
                    // InternalKEffects.g:6442:3: (enumLiteral_10= '>>=' )
                    // InternalKEffects.g:6443:4: enumLiteral_10= '>>='
                    {
                    enumLiteral_10=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTRIGHTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTRIGHTEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalKEffects.g:6450:3: (enumLiteral_11= '>>>=' )
                    {
                    // InternalKEffects.g:6450:3: (enumLiteral_11= '>>>=' )
                    // InternalKEffects.g:6451:4: enumLiteral_11= '>>>='
                    {
                    enumLiteral_11=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTRIGHTUNSIGNEDEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTRIGHTUNSIGNEDEnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalKEffects.g:6458:3: (enumLiteral_12= 'min=' )
                    {
                    // InternalKEffects.g:6458:3: (enumLiteral_12= 'min=' )
                    // InternalKEffects.g:6459:4: enumLiteral_12= 'min='
                    {
                    enumLiteral_12=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNMINEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_12, grammarAccess.getAssignOperatorAccess().getASSIGNMINEnumLiteralDeclaration_12());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalKEffects.g:6466:3: (enumLiteral_13= 'max=' )
                    {
                    // InternalKEffects.g:6466:3: (enumLiteral_13= 'max=' )
                    // InternalKEffects.g:6467:4: enumLiteral_13= 'max='
                    {
                    enumLiteral_13=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNMAXEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_13, grammarAccess.getAssignOperatorAccess().getASSIGNMAXEnumLiteralDeclaration_13());
                      			
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
    // InternalKEffects.g:6477:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalKEffects.g:6483:2: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalKEffects.g:6484:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalKEffects.g:6484:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==65) ) {
                alt106=1;
            }
            else if ( (LA106_0==66) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalKEffects.g:6485:3: (enumLiteral_0= '++' )
                    {
                    // InternalKEffects.g:6485:3: (enumLiteral_0= '++' )
                    // InternalKEffects.g:6486:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:6493:3: (enumLiteral_1= '--' )
                    {
                    // InternalKEffects.g:6493:3: (enumLiteral_1= '--' )
                    // InternalKEffects.g:6494:4: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:6504:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // InternalKEffects.g:6510:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalKEffects.g:6511:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalKEffects.g:6511:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt107=6;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt107=1;
                }
                break;
            case 68:
                {
                alt107=2;
                }
                break;
            case 69:
                {
                alt107=3;
                }
                break;
            case 70:
                {
                alt107=4;
                }
                break;
            case 71:
                {
                alt107=5;
                }
                break;
            case 72:
                {
                alt107=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // InternalKEffects.g:6512:3: (enumLiteral_0= '==' )
                    {
                    // InternalKEffects.g:6512:3: (enumLiteral_0= '==' )
                    // InternalKEffects.g:6513:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:6520:3: (enumLiteral_1= '<' )
                    {
                    // InternalKEffects.g:6520:3: (enumLiteral_1= '<' )
                    // InternalKEffects.g:6521:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEffects.g:6528:3: (enumLiteral_2= '<=' )
                    {
                    // InternalKEffects.g:6528:3: (enumLiteral_2= '<=' )
                    // InternalKEffects.g:6529:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEffects.g:6536:3: (enumLiteral_3= '>' )
                    {
                    // InternalKEffects.g:6536:3: (enumLiteral_3= '>' )
                    // InternalKEffects.g:6537:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEffects.g:6544:3: (enumLiteral_4= '>=' )
                    {
                    // InternalKEffects.g:6544:3: (enumLiteral_4= '>=' )
                    // InternalKEffects.g:6545:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKEffects.g:6552:3: (enumLiteral_5= '!=' )
                    {
                    // InternalKEffects.g:6552:3: (enumLiteral_5= '!=' )
                    // InternalKEffects.g:6553:4: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:6563:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6569:2: ( (enumLiteral_0= 'pre' ) )
            // InternalKEffects.g:6570:2: (enumLiteral_0= 'pre' )
            {
            // InternalKEffects.g:6570:2: (enumLiteral_0= 'pre' )
            // InternalKEffects.g:6571:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleBitwiseNotOperator"
    // InternalKEffects.g:6580:1: ruleBitwiseNotOperator returns [Enumerator current=null] : (enumLiteral_0= '~' ) ;
    public final Enumerator ruleBitwiseNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6586:2: ( (enumLiteral_0= '~' ) )
            // InternalKEffects.g:6587:2: (enumLiteral_0= '~' )
            {
            // InternalKEffects.g:6587:2: (enumLiteral_0= '~' )
            // InternalKEffects.g:6588:3: enumLiteral_0= '~'
            {
            enumLiteral_0=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getBitwiseNotOperatorAccess().getBITWISE_NOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getBitwiseNotOperatorAccess().getBITWISE_NOTEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleBitwiseNotOperator"


    // $ANTLR start "ruleBitwiseXOrOperator"
    // InternalKEffects.g:6597:1: ruleBitwiseXOrOperator returns [Enumerator current=null] : (enumLiteral_0= '^' ) ;
    public final Enumerator ruleBitwiseXOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6603:2: ( (enumLiteral_0= '^' ) )
            // InternalKEffects.g:6604:2: (enumLiteral_0= '^' )
            {
            // InternalKEffects.g:6604:2: (enumLiteral_0= '^' )
            // InternalKEffects.g:6605:3: enumLiteral_0= '^'
            {
            enumLiteral_0=(Token)match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getBitwiseXOrOperatorAccess().getBITWISE_XOREnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getBitwiseXOrOperatorAccess().getBITWISE_XOREnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleBitwiseXOrOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // InternalKEffects.g:6614:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6620:2: ( (enumLiteral_0= '|' ) )
            // InternalKEffects.g:6621:2: (enumLiteral_0= '|' )
            {
            // InternalKEffects.g:6621:2: (enumLiteral_0= '|' )
            // InternalKEffects.g:6622:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:6631:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6637:2: ( (enumLiteral_0= '&' ) )
            // InternalKEffects.g:6638:2: (enumLiteral_0= '&' )
            {
            // InternalKEffects.g:6638:2: (enumLiteral_0= '&' )
            // InternalKEffects.g:6639:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:6648:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6654:2: ( (enumLiteral_0= '!' ) )
            // InternalKEffects.g:6655:2: (enumLiteral_0= '!' )
            {
            // InternalKEffects.g:6655:2: (enumLiteral_0= '!' )
            // InternalKEffects.g:6656:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:6665:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6671:2: ( (enumLiteral_0= '+' ) )
            // InternalKEffects.g:6672:2: (enumLiteral_0= '+' )
            {
            // InternalKEffects.g:6672:2: (enumLiteral_0= '+' )
            // InternalKEffects.g:6673:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:6682:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6688:2: ( (enumLiteral_0= '-' ) )
            // InternalKEffects.g:6689:2: (enumLiteral_0= '-' )
            {
            // InternalKEffects.g:6689:2: (enumLiteral_0= '-' )
            // InternalKEffects.g:6690:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:6699:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6705:2: ( (enumLiteral_0= '*' ) )
            // InternalKEffects.g:6706:2: (enumLiteral_0= '*' )
            {
            // InternalKEffects.g:6706:2: (enumLiteral_0= '*' )
            // InternalKEffects.g:6707:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:6716:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6722:2: ( (enumLiteral_0= '%' ) )
            // InternalKEffects.g:6723:2: (enumLiteral_0= '%' )
            {
            // InternalKEffects.g:6723:2: (enumLiteral_0= '%' )
            // InternalKEffects.g:6724:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:6733:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6739:2: ( (enumLiteral_0= '/' ) )
            // InternalKEffects.g:6740:2: (enumLiteral_0= '/' )
            {
            // InternalKEffects.g:6740:2: (enumLiteral_0= '/' )
            // InternalKEffects.g:6741:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:6750:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6756:2: ( (enumLiteral_0= 'val' ) )
            // InternalKEffects.g:6757:2: (enumLiteral_0= 'val' )
            {
            // InternalKEffects.g:6757:2: (enumLiteral_0= 'val' )
            // InternalKEffects.g:6758:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:6767:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6773:2: ( (enumLiteral_0= '||' ) )
            // InternalKEffects.g:6774:2: (enumLiteral_0= '||' )
            {
            // InternalKEffects.g:6774:2: (enumLiteral_0= '||' )
            // InternalKEffects.g:6775:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:6784:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6790:2: ( (enumLiteral_0= '&&' ) )
            // InternalKEffects.g:6791:2: (enumLiteral_0= '&&' )
            {
            // InternalKEffects.g:6791:2: (enumLiteral_0= '&&' )
            // InternalKEffects.g:6792:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleShiftLeftOperator"
    // InternalKEffects.g:6801:1: ruleShiftLeftOperator returns [Enumerator current=null] : (enumLiteral_0= '<<' ) ;
    public final Enumerator ruleShiftLeftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6807:2: ( (enumLiteral_0= '<<' ) )
            // InternalKEffects.g:6808:2: (enumLiteral_0= '<<' )
            {
            // InternalKEffects.g:6808:2: (enumLiteral_0= '<<' )
            // InternalKEffects.g:6809:3: enumLiteral_0= '<<'
            {
            enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getShiftLeftOperatorAccess().getSHIFT_LEFTEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getShiftLeftOperatorAccess().getSHIFT_LEFTEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleShiftLeftOperator"


    // $ANTLR start "ruleShiftRightOperator"
    // InternalKEffects.g:6818:1: ruleShiftRightOperator returns [Enumerator current=null] : (enumLiteral_0= '>>' ) ;
    public final Enumerator ruleShiftRightOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6824:2: ( (enumLiteral_0= '>>' ) )
            // InternalKEffects.g:6825:2: (enumLiteral_0= '>>' )
            {
            // InternalKEffects.g:6825:2: (enumLiteral_0= '>>' )
            // InternalKEffects.g:6826:3: enumLiteral_0= '>>'
            {
            enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getShiftRightOperatorAccess().getSHIFT_RIGHTEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getShiftRightOperatorAccess().getSHIFT_RIGHTEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleShiftRightOperator"


    // $ANTLR start "ruleShiftRightUnsignedOperator"
    // InternalKEffects.g:6835:1: ruleShiftRightUnsignedOperator returns [Enumerator current=null] : (enumLiteral_0= '>>>' ) ;
    public final Enumerator ruleShiftRightUnsignedOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6841:2: ( (enumLiteral_0= '>>>' ) )
            // InternalKEffects.g:6842:2: (enumLiteral_0= '>>>' )
            {
            // InternalKEffects.g:6842:2: (enumLiteral_0= '>>>' )
            // InternalKEffects.g:6843:3: enumLiteral_0= '>>>'
            {
            enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getShiftRightUnsignedOperatorAccess().getSHIFT_RIGHT_UNSIGNEDEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getShiftRightUnsignedOperatorAccess().getSHIFT_RIGHT_UNSIGNEDEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleShiftRightUnsignedOperator"


    // $ANTLR start "ruleConditionalOperator"
    // InternalKEffects.g:6852:1: ruleConditionalOperator returns [Enumerator current=null] : (enumLiteral_0= '?' ) ;
    public final Enumerator ruleConditionalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6858:2: ( (enumLiteral_0= '?' ) )
            // InternalKEffects.g:6859:2: (enumLiteral_0= '?' )
            {
            // InternalKEffects.g:6859:2: (enumLiteral_0= '?' )
            // InternalKEffects.g:6860:3: enumLiteral_0= '?'
            {
            enumLiteral_0=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getConditionalOperatorAccess().getCONDITIONALEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getConditionalOperatorAccess().getCONDITIONALEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleConditionalOperator"


    // $ANTLR start "ruleInitOperator"
    // InternalKEffects.g:6869:1: ruleInitOperator returns [Enumerator current=null] : (enumLiteral_0= '->' ) ;
    public final Enumerator ruleInitOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:6875:2: ( (enumLiteral_0= '->' ) )
            // InternalKEffects.g:6876:2: (enumLiteral_0= '->' )
            {
            // InternalKEffects.g:6876:2: (enumLiteral_0= '->' )
            // InternalKEffects.g:6877:3: enumLiteral_0= '->'
            {
            enumLiteral_0=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getInitOperatorAccess().getINITEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getInitOperatorAccess().getINITEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleInitOperator"

    // $ANTLR start synpred1_InternalKEffects
    public final void synpred1_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // InternalKEffects.g:86:3: (this_Assignment_0= ruleAssignment )
        // InternalKEffects.g:86:3: this_Assignment_0= ruleAssignment
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
    // $ANTLR end synpred1_InternalKEffects

    // $ANTLR start synpred2_InternalKEffects
    public final void synpred2_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_PostfixEffect_1 = null;


        // InternalKEffects.g:98:3: (this_PostfixEffect_1= rulePostfixEffect )
        // InternalKEffects.g:98:3: this_PostfixEffect_1= rulePostfixEffect
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
    // $ANTLR end synpred2_InternalKEffects

    // $ANTLR start synpred3_InternalKEffects
    public final void synpred3_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_ValuedEmission_2 = null;


        // InternalKEffects.g:110:3: (this_ValuedEmission_2= ruleValuedEmission )
        // InternalKEffects.g:110:3: this_ValuedEmission_2= ruleValuedEmission
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ValuedEmission_2=ruleValuedEmission();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalKEffects

    // $ANTLR start synpred4_InternalKEffects
    public final void synpred4_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_HostcodeEffect_3 = null;


        // InternalKEffects.g:122:3: (this_HostcodeEffect_3= ruleHostcodeEffect )
        // InternalKEffects.g:122:3: this_HostcodeEffect_3= ruleHostcodeEffect
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
    // $ANTLR end synpred4_InternalKEffects

    // $ANTLR start synpred5_InternalKEffects
    public final void synpred5_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_ReferenceCallEffect_4 = null;


        // InternalKEffects.g:134:3: (this_ReferenceCallEffect_4= ruleReferenceCallEffect )
        // InternalKEffects.g:134:3: this_ReferenceCallEffect_4= ruleReferenceCallEffect
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
    // $ANTLR end synpred5_InternalKEffects

    // $ANTLR start synpred6_InternalKEffects
    public final void synpred6_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_FunctionCallEffect_5 = null;


        // InternalKEffects.g:146:3: (this_FunctionCallEffect_5= ruleFunctionCallEffect )
        // InternalKEffects.g:146:3: this_FunctionCallEffect_5= ruleFunctionCallEffect
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
    // $ANTLR end synpred6_InternalKEffects

    // $ANTLR start synpred7_InternalKEffects
    public final void synpred7_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_PrintCallEffect_6 = null;


        // InternalKEffects.g:158:3: (this_PrintCallEffect_6= rulePrintCallEffect )
        // InternalKEffects.g:158:3: this_PrintCallEffect_6= rulePrintCallEffect
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_PrintCallEffect_6=rulePrintCallEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalKEffects

    // $ANTLR start synpred8_InternalKEffects
    public final void synpred8_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_RandomizeCallEffect_7 = null;


        // InternalKEffects.g:170:3: (this_RandomizeCallEffect_7= ruleRandomizeCallEffect )
        // InternalKEffects.g:170:3: this_RandomizeCallEffect_7= ruleRandomizeCallEffect
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_RandomizeCallEffect_7=ruleRandomizeCallEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalKEffects

    // $ANTLR start synpred33_InternalKEffects
    public final void synpred33_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKEffects.g:1130:3: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKEffects.g:1130:3: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred33_InternalKEffects

    // $ANTLR start synpred45_InternalKEffects
    public final void synpred45_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalKEffects.g:1815:3: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalKEffects.g:1815:3: this_ValuedExpression_0= ruleValuedExpression
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
    // $ANTLR end synpred45_InternalKEffects

    // $ANTLR start synpred48_InternalKEffects
    public final void synpred48_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKEffects.g:2109:6: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )
        // InternalKEffects.g:2109:6: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) )
        {
        otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_26); if (state.failed) return ;
        // InternalKEffects.g:2113:6: ( (lv_subExpressions_5_0= ruleSumExpression ) )
        // InternalKEffects.g:2114:7: (lv_subExpressions_5_0= ruleSumExpression )
        {
        // InternalKEffects.g:2114:7: (lv_subExpressions_5_0= ruleSumExpression )
        // InternalKEffects.g:2115:8: lv_subExpressions_5_0= ruleSumExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_0_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleSumExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred48_InternalKEffects

    // $ANTLR start synpred50_InternalKEffects
    public final void synpred50_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKEffects.g:2185:6: (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )
        // InternalKEffects.g:2185:6: otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) )
        {
        otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_26); if (state.failed) return ;
        // InternalKEffects.g:2189:6: ( (lv_subExpressions_10_0= ruleSumExpression ) )
        // InternalKEffects.g:2190:7: (lv_subExpressions_10_0= ruleSumExpression )
        {
        // InternalKEffects.g:2190:7: (lv_subExpressions_10_0= ruleSumExpression )
        // InternalKEffects.g:2191:8: lv_subExpressions_10_0= ruleSumExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_1_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_10_0=ruleSumExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred50_InternalKEffects

    // $ANTLR start synpred52_InternalKEffects
    public final void synpred52_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_14=null;
        EObject lv_subExpressions_15_0 = null;


        // InternalKEffects.g:2261:6: (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )
        // InternalKEffects.g:2261:6: otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) )
        {
        otherlv_14=(Token)match(input,32,FollowSets000.FOLLOW_26); if (state.failed) return ;
        // InternalKEffects.g:2265:6: ( (lv_subExpressions_15_0= ruleSumExpression ) )
        // InternalKEffects.g:2266:7: (lv_subExpressions_15_0= ruleSumExpression )
        {
        // InternalKEffects.g:2266:7: (lv_subExpressions_15_0= ruleSumExpression )
        // InternalKEffects.g:2267:8: lv_subExpressions_15_0= ruleSumExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_2_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_15_0=ruleSumExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred52_InternalKEffects

    // $ANTLR start synpred58_InternalKEffects
    public final void synpred58_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKEffects.g:2582:6: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )
        // InternalKEffects.g:2582:6: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) )
        {
        otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_26); if (state.failed) return ;
        // InternalKEffects.g:2586:6: ( (lv_subExpressions_5_0= ruleProductExpression ) )
        // InternalKEffects.g:2587:7: (lv_subExpressions_5_0= ruleProductExpression )
        {
        // InternalKEffects.g:2587:7: (lv_subExpressions_5_0= ruleProductExpression )
        // InternalKEffects.g:2588:8: lv_subExpressions_5_0= ruleProductExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_0_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleProductExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred58_InternalKEffects

    // $ANTLR start synpred60_InternalKEffects
    public final void synpred60_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKEffects.g:2658:6: (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )
        // InternalKEffects.g:2658:6: otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) )
        {
        otherlv_9=(Token)match(input,34,FollowSets000.FOLLOW_26); if (state.failed) return ;
        // InternalKEffects.g:2662:6: ( (lv_subExpressions_10_0= ruleProductExpression ) )
        // InternalKEffects.g:2663:7: (lv_subExpressions_10_0= ruleProductExpression )
        {
        // InternalKEffects.g:2663:7: (lv_subExpressions_10_0= ruleProductExpression )
        // InternalKEffects.g:2664:8: lv_subExpressions_10_0= ruleProductExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_1_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_10_0=ruleProductExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred60_InternalKEffects

    // $ANTLR start synpred62_InternalKEffects
    public final void synpred62_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKEffects.g:2765:6: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )
        // InternalKEffects.g:2765:6: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) )
        {
        otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_26); if (state.failed) return ;
        // InternalKEffects.g:2769:6: ( (lv_subExpressions_5_0= ruleNegExpression ) )
        // InternalKEffects.g:2770:7: (lv_subExpressions_5_0= ruleNegExpression )
        {
        // InternalKEffects.g:2770:7: (lv_subExpressions_5_0= ruleNegExpression )
        // InternalKEffects.g:2771:8: lv_subExpressions_5_0= ruleNegExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_0_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleNegExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred62_InternalKEffects

    // $ANTLR start synpred64_InternalKEffects
    public final void synpred64_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKEffects.g:2841:6: (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )
        // InternalKEffects.g:2841:6: otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) )
        {
        otherlv_9=(Token)match(input,36,FollowSets000.FOLLOW_26); if (state.failed) return ;
        // InternalKEffects.g:2845:6: ( (lv_subExpressions_10_0= ruleNegExpression ) )
        // InternalKEffects.g:2846:7: (lv_subExpressions_10_0= ruleNegExpression )
        {
        // InternalKEffects.g:2846:7: (lv_subExpressions_10_0= ruleNegExpression )
        // InternalKEffects.g:2847:8: lv_subExpressions_10_0= ruleNegExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_1_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_10_0=ruleNegExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred64_InternalKEffects

    // $ANTLR start synpred66_InternalKEffects
    public final void synpred66_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_14=null;
        EObject lv_subExpressions_15_0 = null;


        // InternalKEffects.g:2917:6: (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )
        // InternalKEffects.g:2917:6: otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) )
        {
        otherlv_14=(Token)match(input,37,FollowSets000.FOLLOW_26); if (state.failed) return ;
        // InternalKEffects.g:2921:6: ( (lv_subExpressions_15_0= ruleNegExpression ) )
        // InternalKEffects.g:2922:7: (lv_subExpressions_15_0= ruleNegExpression )
        {
        // InternalKEffects.g:2922:7: (lv_subExpressions_15_0= ruleNegExpression )
        // InternalKEffects.g:2923:8: lv_subExpressions_15_0= ruleNegExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_2_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_15_0=ruleNegExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred66_InternalKEffects

    // $ANTLR start synpred70_InternalKEffects
    public final void synpred70_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKEffects.g:3043:3: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) )
        // InternalKEffects.g:3043:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? )
        {
        // InternalKEffects.g:3043:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? )
        // InternalKEffects.g:3044:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )?
        {
        // InternalKEffects.g:3044:4: ()
        // InternalKEffects.g:3045:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalKEffects.g:3054:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
        // InternalKEffects.g:3055:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        {
        // InternalKEffects.g:3055:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        // InternalKEffects.g:3056:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_31);
        lv_subExpressions_1_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKEffects.g:3073:4: ( (lv_operator_2_0= ruleConditionalOperator ) )
        // InternalKEffects.g:3074:5: (lv_operator_2_0= ruleConditionalOperator )
        {
        // InternalKEffects.g:3074:5: (lv_operator_2_0= ruleConditionalOperator )
        // InternalKEffects.g:3075:6: lv_operator_2_0= ruleConditionalOperator
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_32);
        lv_operator_2_0=ruleConditionalOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKEffects.g:3092:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
        // InternalKEffects.g:3093:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        {
        // InternalKEffects.g:3093:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        // InternalKEffects.g:3094:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_33);
        lv_subExpressions_3_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKEffects.g:3111:4: (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )?
        int alt130=2;
        int LA130_0 = input.LA(1);

        if ( (LA130_0==38) ) {
            alt130=1;
        }
        switch (alt130) {
            case 1 :
                // InternalKEffects.g:3112:5: otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                {
                otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_32); if (state.failed) return ;
                // InternalKEffects.g:3116:5: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                // InternalKEffects.g:3117:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                {
                // InternalKEffects.g:3117:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                // InternalKEffects.g:3118:7: lv_subExpressions_5_0= ruleAtomicValuedExpression
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_4_1_0());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_subExpressions_5_0=ruleAtomicValuedExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred70_InternalKEffects

    // $ANTLR start synpred71_InternalKEffects
    public final void synpred71_InternalKEffects_fragment() throws RecognitionException {   
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // InternalKEffects.g:3168:3: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) )
        // InternalKEffects.g:3168:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
        {
        // InternalKEffects.g:3168:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
        // InternalKEffects.g:3169:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
        {
        // InternalKEffects.g:3169:4: ()
        // InternalKEffects.g:3170:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalKEffects.g:3179:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
        // InternalKEffects.g:3180:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        {
        // InternalKEffects.g:3180:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        // InternalKEffects.g:3181:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getInitExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_34);
        lv_subExpressions_1_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKEffects.g:3198:4: ( (lv_operator_2_0= ruleInitOperator ) )
        // InternalKEffects.g:3199:5: (lv_operator_2_0= ruleInitOperator )
        {
        // InternalKEffects.g:3199:5: (lv_operator_2_0= ruleInitOperator )
        // InternalKEffects.g:3200:6: lv_operator_2_0= ruleInitOperator
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getInitExpressionAccess().getOperatorInitOperatorEnumRuleCall_0_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_32);
        lv_operator_2_0=ruleInitOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKEffects.g:3217:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
        // InternalKEffects.g:3218:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        {
        // InternalKEffects.g:3218:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        // InternalKEffects.g:3219:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getInitExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_3_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred71_InternalKEffects

    // $ANTLR start synpred83_InternalKEffects
    public final void synpred83_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_ValuedExpression_5 = null;


        // InternalKEffects.g:3440:3: ( (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) )
        // InternalKEffects.g:3440:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        {
        // InternalKEffects.g:3440:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        // InternalKEffects.g:3441:4: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
        {
        otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_26); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_9);
        this_ValuedExpression_5=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred83_InternalKEffects

    // $ANTLR start synpred100_InternalKEffects
    public final void synpred100_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKEffects.g:4419:3: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKEffects.g:4419:3: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred100_InternalKEffects

    // $ANTLR start synpred101_InternalKEffects
    public final void synpred101_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_1 = null;


        // InternalKEffects.g:4431:3: (this_ValuedExpression_1= ruleValuedExpression )
        // InternalKEffects.g:4431:3: this_ValuedExpression_1= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ValuedExpression_1=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_InternalKEffects

    // $ANTLR start synpred115_InternalKEffects
    public final void synpred115_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_KeyStringValueAnnotation_1 = null;


        // InternalKEffects.g:5115:3: (this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation )
        // InternalKEffects.g:5115:3: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_KeyStringValueAnnotation_1=ruleKeyStringValueAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_InternalKEffects

    // Delegated rules

    public final boolean synpred62_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA87 dfa87 = new DFA87(this);
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA89 dfa89 = new DFA89(this);
    protected DFA90 dfa90 = new DFA90(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\3\0\11\uffff";
    static final String dfa_3s = "\1\62\3\0\11\uffff";
    static final String dfa_4s = "\4\uffff\1\4\1\6\1\7\1\10\1\1\1\2\1\3\1\5\1\11";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\3\4\uffff\1\1\13\uffff\1\5\1\6\1\7\31\uffff\1\2",
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
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "85:2: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_ValuedEmission_2= ruleValuedEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect | this_RandomizeCallEffect_7= ruleRandomizeCallEffect | this_PureEmission_8= rulePureEmission )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKEffects()) ) {s = 8;}

                        else if ( (synpred2_InternalKEffects()) ) {s = 9;}

                        else if ( (synpred3_InternalKEffects()) ) {s = 10;}

                        else if ( (synpred4_InternalKEffects()) ) {s = 4;}

                        else if ( (synpred5_InternalKEffects()) ) {s = 11;}

                        else if ( (synpred6_InternalKEffects()) ) {s = 5;}

                        else if ( (synpred7_InternalKEffects()) ) {s = 6;}

                        else if ( (synpred8_InternalKEffects()) ) {s = 7;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKEffects()) ) {s = 8;}

                        else if ( (synpred2_InternalKEffects()) ) {s = 9;}

                        else if ( (synpred3_InternalKEffects()) ) {s = 10;}

                        else if ( (synpred4_InternalKEffects()) ) {s = 4;}

                        else if ( (synpred5_InternalKEffects()) ) {s = 11;}

                        else if ( (synpred6_InternalKEffects()) ) {s = 5;}

                        else if ( (synpred7_InternalKEffects()) ) {s = 6;}

                        else if ( (synpred8_InternalKEffects()) ) {s = 7;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKEffects()) ) {s = 8;}

                        else if ( (synpred2_InternalKEffects()) ) {s = 9;}

                        else if ( (synpred3_InternalKEffects()) ) {s = 10;}

                        else if ( (synpred5_InternalKEffects()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\24\uffff";
    static final String dfa_8s = "\1\4\20\0\3\uffff";
    static final String dfa_9s = "\1\113\20\0\3\uffff";
    static final String dfa_10s = "\21\uffff\1\1\1\uffff\1\2";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\3\uffff}>";
    static final String[] dfa_12s = {
            "\1\20\1\12\1\2\1\3\1\7\1\4\1\16\7\uffff\1\6\3\uffff\1\13\1\uffff\1\15\11\uffff\1\1\10\uffff\1\14\1\21\1\5\4\uffff\1\17\26\uffff\1\10\1\21\1\11",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1129:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_3 = input.LA(1);

                         
                        int index26_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_4 = input.LA(1);

                         
                        int index26_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_6 = input.LA(1);

                         
                        int index26_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_7 = input.LA(1);

                         
                        int index26_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_8 = input.LA(1);

                         
                        int index26_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA26_9 = input.LA(1);

                         
                        int index26_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA26_10 = input.LA(1);

                         
                        int index26_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA26_11 = input.LA(1);

                         
                        int index26_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA26_12 = input.LA(1);

                         
                        int index26_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA26_13 = input.LA(1);

                         
                        int index26_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA26_14 = input.LA(1);

                         
                        int index26_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA26_15 = input.LA(1);

                         
                        int index26_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA26_16 = input.LA(1);

                         
                        int index26_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKEffects()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index26_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\23\uffff";
    static final String dfa_14s = "\1\4\5\uffff\13\0\2\uffff";
    static final String dfa_15s = "\1\113\5\uffff\13\0\2\uffff";
    static final String dfa_16s = "\1\uffff\1\1\17\uffff\1\2\1\uffff";
    static final String dfa_17s = "\6\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_18s = {
            "\1\20\1\12\2\1\1\7\1\1\1\16\7\uffff\1\6\3\uffff\1\13\1\uffff\1\15\11\uffff\1\1\10\uffff\1\14\1\21\1\1\4\uffff\1\17\26\uffff\1\10\1\21\1\11",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1814:2: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_6 = input.LA(1);

                         
                        int index38_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_7 = input.LA(1);

                         
                        int index38_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index38_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index38_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_9 = input.LA(1);

                         
                        int index38_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index38_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_10 = input.LA(1);

                         
                        int index38_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index38_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_11 = input.LA(1);

                         
                        int index38_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index38_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_12 = input.LA(1);

                         
                        int index38_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index38_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA38_13 = input.LA(1);

                         
                        int index38_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index38_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA38_14 = input.LA(1);

                         
                        int index38_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index38_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA38_15 = input.LA(1);

                         
                        int index38_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index38_15);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA38_16 = input.LA(1);

                         
                        int index38_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index38_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\26\uffff";
    static final String dfa_20s = "\1\1\25\uffff";
    static final String dfa_21s = "\1\21\21\uffff\1\0\3\uffff";
    static final String dfa_22s = "\1\110\21\uffff\1\0\3\uffff";
    static final String dfa_23s = "\1\uffff\1\2\23\uffff\1\1";
    static final String dfa_24s = "\22\uffff\1\0\3\uffff}>";
    static final String[] dfa_25s = {
            "\1\1\1\uffff\2\1\4\uffff\5\1\1\22\2\1\10\uffff\1\1\4\uffff\1\1\24\uffff\6\1",
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
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "()* loopback of 2108:5: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_18 = input.LA(1);

                         
                        int index41_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalKEffects()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_26s = "\1\21\22\uffff\1\0\2\uffff";
    static final String dfa_27s = "\1\110\22\uffff\1\0\2\uffff";
    static final String dfa_28s = "\23\uffff\1\0\2\uffff}>";
    static final String[] dfa_29s = {
            "\1\1\1\uffff\2\1\4\uffff\6\1\1\23\1\1\10\uffff\1\1\4\uffff\1\1\24\uffff\6\1",
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
            ""
    };
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_23;
            this.special = dfa_28;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "()* loopback of 2184:5: (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_19 = input.LA(1);

                         
                        int index42_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalKEffects()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_30s = "\1\21\23\uffff\1\0\1\uffff";
    static final String dfa_31s = "\1\110\23\uffff\1\0\1\uffff";
    static final String dfa_32s = "\24\uffff\1\0\1\uffff}>";
    static final String[] dfa_33s = {
            "\1\1\1\uffff\2\1\4\uffff\7\1\1\24\10\uffff\1\1\4\uffff\1\1\24\uffff\6\1",
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
            ""
    };
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_23;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 2260:5: (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_20 = input.LA(1);

                         
                        int index43_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalKEffects()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\30\uffff";
    static final String dfa_35s = "\1\1\27\uffff";
    static final String dfa_36s = "\1\21\24\uffff\1\0\2\uffff";
    static final String dfa_37s = "\1\110\24\uffff\1\0\2\uffff";
    static final String dfa_38s = "\1\uffff\1\2\25\uffff\1\1";
    static final String dfa_39s = "\25\uffff\1\0\2\uffff}>";
    static final String[] dfa_40s = {
            "\1\1\1\uffff\2\1\4\uffff\10\1\1\25\1\1\6\uffff\1\1\4\uffff\1\1\24\uffff\6\1",
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
            ""
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()* loopback of 2581:5: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_21 = input.LA(1);

                         
                        int index49_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKEffects()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_41s = "\1\21\25\uffff\1\0\1\uffff";
    static final String dfa_42s = "\1\110\25\uffff\1\0\1\uffff";
    static final String dfa_43s = "\26\uffff\1\0\1\uffff}>";
    static final String[] dfa_44s = {
            "\1\1\1\uffff\2\1\4\uffff\11\1\1\26\6\uffff\1\1\4\uffff\1\1\24\uffff\6\1",
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
            ""
    };
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_38;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "()* loopback of 2657:5: (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_22 = input.LA(1);

                         
                        int index50_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalKEffects()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index50_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_45s = "\33\uffff";
    static final String dfa_46s = "\1\1\32\uffff";
    static final String dfa_47s = "\1\21\26\uffff\1\0\3\uffff";
    static final String dfa_48s = "\1\110\26\uffff\1\0\3\uffff";
    static final String dfa_49s = "\1\uffff\1\2\30\uffff\1\1";
    static final String dfa_50s = "\27\uffff\1\0\3\uffff}>";
    static final String[] dfa_51s = {
            "\1\1\1\uffff\2\1\4\uffff\12\1\1\27\2\1\3\uffff\1\1\4\uffff\1\1\24\uffff\6\1",
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
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_45;
            this.eof = dfa_46;
            this.min = dfa_47;
            this.max = dfa_48;
            this.accept = dfa_49;
            this.special = dfa_50;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "()* loopback of 2764:5: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_23 = input.LA(1);

                         
                        int index52_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalKEffects()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index52_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_52s = "\1\21\27\uffff\1\0\2\uffff";
    static final String dfa_53s = "\1\110\27\uffff\1\0\2\uffff";
    static final String dfa_54s = "\30\uffff\1\0\2\uffff}>";
    static final String[] dfa_55s = {
            "\1\1\1\uffff\2\1\4\uffff\13\1\1\30\1\1\3\uffff\1\1\4\uffff\1\1\24\uffff\6\1",
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
            "\1\uffff",
            "",
            ""
    };
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[][] dfa_55 = unpackEncodedStringArray(dfa_55s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_45;
            this.eof = dfa_46;
            this.min = dfa_52;
            this.max = dfa_53;
            this.accept = dfa_49;
            this.special = dfa_54;
            this.transition = dfa_55;
        }
        public String getDescription() {
            return "()* loopback of 2840:5: (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_24 = input.LA(1);

                         
                        int index53_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalKEffects()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_56s = "\1\21\30\uffff\1\0\1\uffff";
    static final String dfa_57s = "\1\110\30\uffff\1\0\1\uffff";
    static final String dfa_58s = "\31\uffff\1\0\1\uffff}>";
    static final String[] dfa_59s = {
            "\1\1\1\uffff\2\1\4\uffff\14\1\1\31\3\uffff\1\1\4\uffff\1\1\24\uffff\6\1",
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
            "\1\uffff",
            ""
    };
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final char[] dfa_57 = DFA.unpackEncodedStringToUnsignedChars(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[][] dfa_59 = unpackEncodedStringArray(dfa_59s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_45;
            this.eof = dfa_46;
            this.min = dfa_56;
            this.max = dfa_57;
            this.accept = dfa_49;
            this.special = dfa_58;
            this.transition = dfa_59;
        }
        public String getDescription() {
            return "()* loopback of 2916:5: (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_25 = input.LA(1);

                         
                        int index54_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKEffects()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_25);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_60s = "\22\uffff";
    static final String dfa_61s = "\1\4\17\0\2\uffff";
    static final String dfa_62s = "\1\113\17\0\2\uffff";
    static final String dfa_63s = "\20\uffff\1\1\1\2";
    static final String dfa_64s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\2\uffff}>";
    static final String[] dfa_65s = {
            "\1\17\1\11\1\1\1\2\1\6\1\3\1\15\7\uffff\1\5\3\uffff\1\12\1\uffff\1\14\22\uffff\1\13\1\uffff\1\4\4\uffff\1\16\26\uffff\1\7\1\uffff\1\10",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_60 = DFA.unpackEncodedString(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final char[] dfa_62 = DFA.unpackEncodedStringToUnsignedChars(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[] dfa_64 = DFA.unpackEncodedString(dfa_64s);
    static final short[][] dfa_65 = unpackEncodedStringArray(dfa_65s);

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_60;
            this.eof = dfa_60;
            this.min = dfa_61;
            this.max = dfa_62;
            this.accept = dfa_63;
            this.special = dfa_64;
            this.transition = dfa_65;
        }
        public String getDescription() {
            return "3042:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_3 = input.LA(1);

                         
                        int index58_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA58_4 = input.LA(1);

                         
                        int index58_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA58_5 = input.LA(1);

                         
                        int index58_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA58_6 = input.LA(1);

                         
                        int index58_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA58_7 = input.LA(1);

                         
                        int index58_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA58_8 = input.LA(1);

                         
                        int index58_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA58_9 = input.LA(1);

                         
                        int index58_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA58_10 = input.LA(1);

                         
                        int index58_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA58_11 = input.LA(1);

                         
                        int index58_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA58_12 = input.LA(1);

                         
                        int index58_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA58_13 = input.LA(1);

                         
                        int index58_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA58_14 = input.LA(1);

                         
                        int index58_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA58_15 = input.LA(1);

                         
                        int index58_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index58_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_60;
            this.eof = dfa_60;
            this.min = dfa_61;
            this.max = dfa_62;
            this.accept = dfa_63;
            this.special = dfa_64;
            this.transition = dfa_65;
        }
        public String getDescription() {
            return "3167:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_3 = input.LA(1);

                         
                        int index59_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA59_4 = input.LA(1);

                         
                        int index59_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA59_5 = input.LA(1);

                         
                        int index59_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA59_6 = input.LA(1);

                         
                        int index59_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA59_7 = input.LA(1);

                         
                        int index59_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA59_8 = input.LA(1);

                         
                        int index59_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA59_9 = input.LA(1);

                         
                        int index59_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA59_10 = input.LA(1);

                         
                        int index59_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA59_11 = input.LA(1);

                         
                        int index59_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA59_12 = input.LA(1);

                         
                        int index59_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA59_13 = input.LA(1);

                         
                        int index59_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA59_14 = input.LA(1);

                         
                        int index59_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA59_15 = input.LA(1);

                         
                        int index59_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index59_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_66s = "\13\uffff";
    static final String dfa_67s = "\3\uffff\1\2\5\uffff\1\2\1\uffff";
    static final String dfa_68s = "\1\4\2\uffff\1\21\5\uffff\1\21\1\uffff";
    static final String dfa_69s = "\1\113\2\uffff\1\115\5\uffff\1\115\1\uffff";
    static final String dfa_70s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\5\1\6\1\7\1\10\1\uffff\1\4";
    static final String dfa_71s = "\13\uffff}>";
    static final String[] dfa_72s = {
            "\1\10\1\3\2\uffff\1\1\1\uffff\1\10\7\uffff\1\4\3\uffff\1\5\1\uffff\1\7\22\uffff\1\6\6\uffff\1\10\26\uffff\1\2\1\uffff\1\2",
            "",
            "",
            "\1\2\1\12\2\2\1\12\3\uffff\16\2\1\11\3\2\3\uffff\1\2\24\uffff\6\2\3\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "\1\2\1\12\2\2\1\12\3\uffff\16\2\1\11\3\2\3\uffff\1\2\24\uffff\6\2\3\uffff\2\2",
            ""
    };

    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final char[] dfa_68 = DFA.unpackEncodedStringToUnsignedChars(dfa_68s);
    static final char[] dfa_69 = DFA.unpackEncodedStringToUnsignedChars(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[][] dfa_72 = unpackEncodedStringArray(dfa_72s);

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = dfa_66;
            this.eof = dfa_67;
            this.min = dfa_68;
            this.max = dfa_69;
            this.accept = dfa_70;
            this.special = dfa_71;
            this.transition = dfa_72;
        }
        public String getDescription() {
            return "3267:2: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )";
        }
    }
    static final String dfa_73s = "\21\uffff";
    static final String dfa_74s = "\1\4\4\uffff\1\0\13\uffff";
    static final String dfa_75s = "\1\113\4\uffff\1\0\13\uffff";
    static final String dfa_76s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\11\uffff\1\5";
    static final String dfa_77s = "\5\uffff\1\0\13\uffff}>";
    static final String[] dfa_78s = {
            "\2\6\1\1\1\2\1\6\1\3\1\6\7\uffff\1\5\3\uffff\1\6\1\uffff\1\6\22\uffff\1\6\1\uffff\1\4\4\uffff\1\6\26\uffff\1\6\1\uffff\1\6",
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

    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final char[] dfa_74 = DFA.unpackEncodedStringToUnsignedChars(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[][] dfa_78 = unpackEncodedStringArray(dfa_78s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_73;
            this.eof = dfa_73;
            this.min = dfa_74;
            this.max = dfa_75;
            this.accept = dfa_76;
            this.special = dfa_77;
            this.transition = dfa_78;
        }
        public String getDescription() {
            return "3391:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_5 = input.LA(1);

                         
                        int index61_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred83_InternalKEffects()) ) {s = 16;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index61_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_79s = "\25\uffff";
    static final String dfa_80s = "\1\4\20\0\4\uffff";
    static final String dfa_81s = "\1\113\20\0\4\uffff";
    static final String dfa_82s = "\21\uffff\1\1\1\uffff\1\3\1\2";
    static final String dfa_83s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\4\uffff}>";
    static final String[] dfa_84s = {
            "\1\20\1\12\1\2\1\3\1\7\1\4\1\16\7\uffff\1\6\3\uffff\1\13\1\uffff\1\15\11\uffff\1\1\10\uffff\1\14\1\21\1\5\1\uffff\1\23\2\uffff\1\17\26\uffff\1\10\1\21\1\11",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_79 = DFA.unpackEncodedString(dfa_79s);
    static final char[] dfa_80 = DFA.unpackEncodedStringToUnsignedChars(dfa_80s);
    static final char[] dfa_81 = DFA.unpackEncodedStringToUnsignedChars(dfa_81s);
    static final short[] dfa_82 = DFA.unpackEncodedString(dfa_82s);
    static final short[] dfa_83 = DFA.unpackEncodedString(dfa_83s);
    static final short[][] dfa_84 = unpackEncodedStringArray(dfa_84s);

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = dfa_79;
            this.eof = dfa_79;
            this.min = dfa_80;
            this.max = dfa_81;
            this.accept = dfa_82;
            this.special = dfa_83;
            this.transition = dfa_84;
        }
        public String getDescription() {
            return "4418:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_1 = input.LA(1);

                         
                        int index78_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_2 = input.LA(1);

                         
                        int index78_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA78_3 = input.LA(1);

                         
                        int index78_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA78_4 = input.LA(1);

                         
                        int index78_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA78_5 = input.LA(1);

                         
                        int index78_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA78_6 = input.LA(1);

                         
                        int index78_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA78_7 = input.LA(1);

                         
                        int index78_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA78_8 = input.LA(1);

                         
                        int index78_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA78_9 = input.LA(1);

                         
                        int index78_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA78_10 = input.LA(1);

                         
                        int index78_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA78_11 = input.LA(1);

                         
                        int index78_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA78_12 = input.LA(1);

                         
                        int index78_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA78_13 = input.LA(1);

                         
                        int index78_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA78_14 = input.LA(1);

                         
                        int index78_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA78_15 = input.LA(1);

                         
                        int index78_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA78_16 = input.LA(1);

                         
                        int index78_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalKEffects()) ) {s = 17;}

                        else if ( (synpred101_InternalKEffects()) ) {s = 20;}

                         
                        input.seek(index78_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_85s = "\12\uffff";
    static final String dfa_86s = "\3\uffff\1\1\4\uffff\2\1";
    static final String dfa_87s = "\1\12\1\uffff\1\5\1\4\2\5\1\6\1\uffff\2\4";
    static final String dfa_88s = "\1\62\1\uffff\1\5\1\62\1\5\1\7\1\6\1\uffff\2\62";
    static final String dfa_89s = "\1\uffff\1\1\5\uffff\1\2\2\uffff";
    static final String dfa_90s = "\12\uffff}>";
    static final String[] dfa_91s = {
            "\1\1\47\uffff\1\2",
            "",
            "\1\3",
            "\7\1\13\uffff\3\1\11\uffff\1\5\5\uffff\1\1\1\uffff\1\4\2\uffff\1\7\3\uffff\1\6\1\1",
            "\1\10",
            "\1\10\2\1",
            "\1\11",
            "",
            "\7\1\13\uffff\3\1\11\uffff\1\5\5\uffff\1\1\1\uffff\1\4\2\uffff\1\7\3\uffff\1\6\1\1",
            "\7\1\13\uffff\3\1\11\uffff\1\1\5\uffff\1\1\4\uffff\1\7\4\uffff\1\1"
    };

    static final short[] dfa_85 = DFA.unpackEncodedString(dfa_85s);
    static final short[] dfa_86 = DFA.unpackEncodedString(dfa_86s);
    static final char[] dfa_87 = DFA.unpackEncodedStringToUnsignedChars(dfa_87s);
    static final char[] dfa_88 = DFA.unpackEncodedStringToUnsignedChars(dfa_88s);
    static final short[] dfa_89 = DFA.unpackEncodedString(dfa_89s);
    static final short[] dfa_90 = DFA.unpackEncodedString(dfa_90s);
    static final short[][] dfa_91 = unpackEncodedStringArray(dfa_91s);

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = dfa_85;
            this.eof = dfa_86;
            this.min = dfa_87;
            this.max = dfa_88;
            this.accept = dfa_89;
            this.special = dfa_90;
            this.transition = dfa_91;
        }
        public String getDescription() {
            return "5018:2: (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )";
        }
    }
    static final String dfa_92s = "\1\12\1\uffff\4\5\1\6\1\uffff\2\5";
    static final String dfa_93s = "\1\62\1\uffff\1\5\1\62\2\5\1\6\1\uffff\2\62";
    static final String[] dfa_94s = {
            "\1\1\47\uffff\1\2",
            "",
            "\1\3",
            "\1\1\3\uffff\2\1\27\uffff\1\5\5\uffff\1\1\1\uffff\1\4\2\uffff\1\7\3\uffff\1\6\1\1",
            "\1\10",
            "\1\10",
            "\1\11",
            "",
            "\1\1\3\uffff\2\1\27\uffff\1\5\5\uffff\1\1\1\uffff\1\4\2\uffff\1\7\3\uffff\1\6\1\1",
            "\1\1\3\uffff\2\1\35\uffff\1\1\4\uffff\1\7\4\uffff\1\1"
    };
    static final char[] dfa_92 = DFA.unpackEncodedStringToUnsignedChars(dfa_92s);
    static final char[] dfa_93 = DFA.unpackEncodedStringToUnsignedChars(dfa_93s);
    static final short[][] dfa_94 = unpackEncodedStringArray(dfa_94s);

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = dfa_85;
            this.eof = dfa_86;
            this.min = dfa_92;
            this.max = dfa_93;
            this.accept = dfa_89;
            this.special = dfa_90;
            this.transition = dfa_94;
        }
        public String getDescription() {
            return "5060:2: (this_QuotedStringAnnotation_0= superQuotedStringAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )";
        }
    }
    static final String dfa_95s = "\3\uffff\1\11\4\uffff\1\7\2\uffff\2\11\1\uffff\1\7\1\uffff\1\7\1\uffff\1\7\1\uffff\1\7\1\uffff";
    static final String dfa_96s = "\1\12\1\uffff\1\5\1\4\2\5\1\6\1\uffff\1\4\2\uffff\2\4\1\5\1\4\1\5\1\4\1\5\1\4\1\5\1\4\1\0";
    static final String dfa_97s = "\1\62\1\uffff\1\5\1\62\1\5\1\7\1\6\1\uffff\1\102\2\uffff\2\62\1\5\1\102\1\5\1\102\1\5\1\102\1\5\1\102\1\0";
    static final String dfa_98s = "\1\uffff\1\1\5\uffff\1\2\1\uffff\1\4\1\3\13\uffff";
    static final String dfa_99s = "\25\uffff\1\0}>";
    static final String[] dfa_100s = {
            "\1\1\47\uffff\1\2",
            "",
            "\1\3",
            "\1\11\1\10\4\7\1\11\13\uffff\3\11\11\uffff\1\5\5\uffff\1\12\1\uffff\1\4\6\uffff\1\6\1\11",
            "\1\13",
            "\1\13\2\7",
            "\1\14",
            "",
            "\2\7\4\uffff\1\7\7\uffff\1\11\1\uffff\1\7\1\11\3\7\11\uffff\1\7\4\uffff\2\11\1\uffff\1\15\6\uffff\2\7\20\11",
            "",
            "",
            "\1\11\1\10\4\7\1\11\13\uffff\3\11\11\uffff\1\5\5\uffff\1\12\1\uffff\1\4\6\uffff\1\6\1\11",
            "\1\11\1\10\4\7\1\11\13\uffff\3\11\11\uffff\1\7\5\uffff\1\12\11\uffff\1\11",
            "\1\16",
            "\2\7\4\uffff\1\7\11\uffff\1\7\1\uffff\3\7\11\uffff\1\7\4\uffff\2\11\1\uffff\1\17\6\uffff\2\7\20\11",
            "\1\20",
            "\2\7\4\uffff\1\7\11\uffff\1\7\1\uffff\3\7\11\uffff\1\7\4\uffff\2\11\1\uffff\1\21\6\uffff\2\7\20\11",
            "\1\22",
            "\2\7\4\uffff\1\7\11\uffff\1\7\1\uffff\3\7\11\uffff\1\7\4\uffff\2\11\1\uffff\1\23\6\uffff\2\7\20\11",
            "\1\24",
            "\2\7\4\uffff\1\7\11\uffff\1\7\1\uffff\3\7\11\uffff\1\7\4\uffff\2\11\1\uffff\1\25\6\uffff\2\7\20\11",
            "\1\uffff"
    };
    static final short[] dfa_95 = DFA.unpackEncodedString(dfa_95s);
    static final char[] dfa_96 = DFA.unpackEncodedStringToUnsignedChars(dfa_96s);
    static final char[] dfa_97 = DFA.unpackEncodedStringToUnsignedChars(dfa_97s);
    static final short[] dfa_98 = DFA.unpackEncodedString(dfa_98s);
    static final short[] dfa_99 = DFA.unpackEncodedString(dfa_99s);
    static final short[][] dfa_100 = unpackEncodedStringArray(dfa_100s);

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = dfa_19;
            this.eof = dfa_95;
            this.min = dfa_96;
            this.max = dfa_97;
            this.accept = dfa_98;
            this.special = dfa_99;
            this.transition = dfa_100;
        }
        public String getDescription() {
            return "5102:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA87_21 = input.LA(1);

                         
                        int index87_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_InternalKEffects()) ) {s = 7;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index87_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 87, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_101s = "\2\uffff\1\7\5\uffff\2\7";
    static final String dfa_102s = "\1\61\4\5\1\6\2\uffff\2\5";
    static final String dfa_103s = "\1\61\1\5\1\61\1\5\1\7\1\6\2\uffff\1\61\1\42";
    static final String dfa_104s = "\6\uffff\1\1\1\2\2\uffff";
    static final String[] dfa_105s = {
            "\1\1",
            "\1\2",
            "\5\6\30\uffff\1\4\7\uffff\1\3\6\uffff\1\5",
            "\1\10",
            "\1\10\2\6",
            "\1\11",
            "",
            "",
            "\5\6\30\uffff\1\4\7\uffff\1\3\6\uffff\1\5",
            "\5\6\30\uffff\1\6"
    };
    static final short[] dfa_101 = DFA.unpackEncodedString(dfa_101s);
    static final char[] dfa_102 = DFA.unpackEncodedStringToUnsignedChars(dfa_102s);
    static final char[] dfa_103 = DFA.unpackEncodedStringToUnsignedChars(dfa_103s);
    static final short[] dfa_104 = DFA.unpackEncodedString(dfa_104s);
    static final short[][] dfa_105 = unpackEncodedStringArray(dfa_105s);

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = dfa_85;
            this.eof = dfa_101;
            this.min = dfa_102;
            this.max = dfa_103;
            this.accept = dfa_104;
            this.special = dfa_90;
            this.transition = dfa_105;
        }
        public String getDescription() {
            return "5168:2: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )";
        }
    }
    static final String dfa_106s = "\1\12\1\uffff\4\5\1\6\2\uffff\2\5";
    static final String dfa_107s = "\1\62\1\uffff\1\5\1\61\1\5\1\7\1\6\2\uffff\1\61\1\50";
    static final String dfa_108s = "\1\uffff\1\1\5\uffff\1\3\1\2\2\uffff";
    static final String[] dfa_109s = {
            "\1\1\47\uffff\1\2",
            "",
            "\1\3",
            "\5\10\30\uffff\1\5\5\uffff\1\7\1\uffff\1\4\6\uffff\1\6",
            "\1\11",
            "\1\11\2\10",
            "\1\12",
            "",
            "",
            "\5\10\30\uffff\1\5\5\uffff\1\7\1\uffff\1\4\6\uffff\1\6",
            "\5\10\30\uffff\1\10\5\uffff\1\7"
    };
    static final char[] dfa_106 = DFA.unpackEncodedStringToUnsignedChars(dfa_106s);
    static final char[] dfa_107 = DFA.unpackEncodedStringToUnsignedChars(dfa_107s);
    static final short[] dfa_108 = DFA.unpackEncodedString(dfa_108s);
    static final short[][] dfa_109 = unpackEncodedStringArray(dfa_109s);

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = dfa_66;
            this.eof = dfa_66;
            this.min = dfa_106;
            this.max = dfa_107;
            this.accept = dfa_108;
            this.special = dfa_71;
            this.transition = dfa_109;
        }
        public String getDescription() {
            return "5210:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation )";
        }
    }
    static final String dfa_110s = "\14\uffff";
    static final String dfa_111s = "\3\uffff\1\7\6\uffff\2\7";
    static final String dfa_112s = "\1\12\1\uffff\4\5\1\6\3\uffff\2\5";
    static final String dfa_113s = "\1\62\1\uffff\1\5\1\62\2\5\1\6\3\uffff\2\62";
    static final String dfa_114s = "\1\uffff\1\1\5\uffff\1\4\1\3\1\2\2\uffff";
    static final String dfa_115s = "\14\uffff}>";
    static final String[] dfa_116s = {
            "\1\1\47\uffff\1\2",
            "",
            "\1\3",
            "\1\7\3\uffff\1\11\1\7\27\uffff\1\5\5\uffff\1\10\1\uffff\1\4\6\uffff\1\6\1\7",
            "\1\12",
            "\1\12",
            "\1\13",
            "",
            "",
            "",
            "\1\7\3\uffff\1\11\1\7\27\uffff\1\5\5\uffff\1\10\1\uffff\1\4\6\uffff\1\6\1\7",
            "\1\7\3\uffff\1\11\1\7\35\uffff\1\10\11\uffff\1\7"
    };

    static final short[] dfa_110 = DFA.unpackEncodedString(dfa_110s);
    static final short[] dfa_111 = DFA.unpackEncodedString(dfa_111s);
    static final char[] dfa_112 = DFA.unpackEncodedStringToUnsignedChars(dfa_112s);
    static final char[] dfa_113 = DFA.unpackEncodedStringToUnsignedChars(dfa_113s);
    static final short[] dfa_114 = DFA.unpackEncodedString(dfa_114s);
    static final short[] dfa_115 = DFA.unpackEncodedString(dfa_115s);
    static final short[][] dfa_116 = unpackEncodedStringArray(dfa_116s);

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = dfa_110;
            this.eof = dfa_111;
            this.min = dfa_112;
            this.max = dfa_113;
            this.accept = dfa_114;
            this.special = dfa_115;
            this.transition = dfa_116;
        }
        public String getDescription() {
            return "5264:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0004000000000420L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00043804014407F0L,0x0000000000000E00L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xFFF8000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0004000000000430L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00043804214407F0L,0x0000000000000E00L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0004000000400420L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000800420L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0004000001000420L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001F8L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001C0000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00042804014407F0L,0x0000000000000A00L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000600000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000003800000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00042800014407F0L,0x0000000000000A00L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000A00L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000050000000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004B804014407F0L,0x0000000000000E00L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000100000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000200L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00012100000003C0L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00012300000003C0L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000020000100000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000004000003E0L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000320L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0002040400000002L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000080L});
    }


}