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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HOSTCODE", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'schedule'", "'('", "')'", "'['", "']'", "'.'", "','", "'()'", "'extern'", "'print'", "'randomize'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "':'", "'->'", "'fby'", "'sfby'", "'static'", "'\\''", "'random'", "'{'", "'to'", "'}'", "'_'", "'null'", "'#'", "'@'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'>>>='", "'min='", "'max='", "'++'", "'--'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'pre'", "'~'", "'!'", "'val'", "'?'", "'!&'"
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
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
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

                if ( (LA2_0==RULE_COMMENT_ANNOTATION||LA2_0==54) ) {
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

                if ( (LA5_0==RULE_COMMENT_ANNOTATION||LA5_0==54) ) {
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

                if ( (LA8_0==RULE_COMMENT_ANNOTATION||LA8_0==54) ) {
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

                if ( (LA11_0==RULE_COMMENT_ANNOTATION||LA11_0==54) ) {
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

                if ( (LA14_0==RULE_COMMENT_ANNOTATION||LA14_0==54) ) {
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
    // InternalKEffects.g:672:1: ruleReferenceCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '.' ( (lv_subReference_6_0= ruleValuedObjectReference ) ) )? ( (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' ) | otherlv_12= '()' ) (otherlv_13= 'schedule' ( (lv_schedule_14_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject ruleReferenceCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_3_0 = null;

        EObject lv_subReference_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_parameters_10_0 = null;

        EObject lv_schedule_14_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:678:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '.' ( (lv_subReference_6_0= ruleValuedObjectReference ) ) )? ( (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' ) | otherlv_12= '()' ) (otherlv_13= 'schedule' ( (lv_schedule_14_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKEffects.g:679:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '.' ( (lv_subReference_6_0= ruleValuedObjectReference ) ) )? ( (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' ) | otherlv_12= '()' ) (otherlv_13= 'schedule' ( (lv_schedule_14_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKEffects.g:679:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '.' ( (lv_subReference_6_0= ruleValuedObjectReference ) ) )? ( (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' ) | otherlv_12= '()' ) (otherlv_13= 'schedule' ( (lv_schedule_14_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKEffects.g:680:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '.' ( (lv_subReference_6_0= ruleValuedObjectReference ) ) )? ( (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' ) | otherlv_12= '()' ) (otherlv_13= 'schedule' ( (lv_schedule_14_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKEffects.g:680:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMENT_ANNOTATION||LA15_0==54) ) {
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

            // InternalKEffects.g:718:3: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKEffects.g:719:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getReferenceCallEffectAccess().getLeftSquareBracketKeyword_2_0());
            	      			
            	    }
            	    // InternalKEffects.g:723:4: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalKEffects.g:724:5: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalKEffects.g:724:5: (lv_indices_3_0= ruleExpression )
            	    // InternalKEffects.g:725:6: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getIndicesExpressionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_indices_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
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

            	    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getReferenceCallEffectAccess().getRightSquareBracketKeyword_2_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalKEffects.g:747:3: (otherlv_5= '.' ( (lv_subReference_6_0= ruleValuedObjectReference ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKEffects.g:748:4: otherlv_5= '.' ( (lv_subReference_6_0= ruleValuedObjectReference ) )
                    {
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getReferenceCallEffectAccess().getFullStopKeyword_3_0());
                      			
                    }
                    // InternalKEffects.g:752:4: ( (lv_subReference_6_0= ruleValuedObjectReference ) )
                    // InternalKEffects.g:753:5: (lv_subReference_6_0= ruleValuedObjectReference )
                    {
                    // InternalKEffects.g:753:5: (lv_subReference_6_0= ruleValuedObjectReference )
                    // InternalKEffects.g:754:6: lv_subReference_6_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getSubReferenceValuedObjectReferenceParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_subReference_6_0=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
                      						}
                      						set(
                      							current,
                      							"subReference",
                      							lv_subReference_6_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKEffects.g:772:3: ( (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' ) | otherlv_12= '()' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            else if ( (LA19_0==24) ) {
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
                    // InternalKEffects.g:773:4: (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )
                    {
                    // InternalKEffects.g:773:4: (otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )
                    // InternalKEffects.g:774:5: otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getReferenceCallEffectAccess().getLeftParenthesisKeyword_4_0_0());
                      				
                    }
                    // InternalKEffects.g:778:5: ( (lv_parameters_8_0= ruleParameter ) )
                    // InternalKEffects.g:779:6: (lv_parameters_8_0= ruleParameter )
                    {
                    // InternalKEffects.g:779:6: (lv_parameters_8_0= ruleParameter )
                    // InternalKEffects.g:780:7: lv_parameters_8_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getParametersParameterParserRuleCall_4_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
                    lv_parameters_8_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
                      							}
                      							add(
                      								current,
                      								"parameters",
                      								lv_parameters_8_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKEffects.g:797:5: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==23) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalKEffects.g:798:6: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_9, grammarAccess.getReferenceCallEffectAccess().getCommaKeyword_4_0_2_0());
                    	      					
                    	    }
                    	    // InternalKEffects.g:802:6: ( (lv_parameters_10_0= ruleParameter ) )
                    	    // InternalKEffects.g:803:7: (lv_parameters_10_0= ruleParameter )
                    	    {
                    	    // InternalKEffects.g:803:7: (lv_parameters_10_0= ruleParameter )
                    	    // InternalKEffects.g:804:8: lv_parameters_10_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getParametersParameterParserRuleCall_4_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_17);
                    	    lv_parameters_10_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"parameters",
                    	      									lv_parameters_10_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getReferenceCallEffectAccess().getRightParenthesisKeyword_4_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:828:4: otherlv_12= '()'
                    {
                    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getReferenceCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_4_1());
                      			
                    }

                    }
                    break;

            }

            // InternalKEffects.g:833:3: (otherlv_13= 'schedule' ( (lv_schedule_14_0= ruleScheduleObjectReference ) )+ )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKEffects.g:834:4: otherlv_13= 'schedule' ( (lv_schedule_14_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getReferenceCallEffectAccess().getScheduleKeyword_5_0());
                      			
                    }
                    // InternalKEffects.g:838:4: ( (lv_schedule_14_0= ruleScheduleObjectReference ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalKEffects.g:839:5: (lv_schedule_14_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKEffects.g:839:5: (lv_schedule_14_0= ruleScheduleObjectReference )
                    	    // InternalKEffects.g:840:6: lv_schedule_14_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getScheduleScheduleObjectReferenceParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_schedule_14_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"schedule",
                    	      							lv_schedule_14_0,
                    	      							"de.cau.cs.kieler.kexpressions.KExpressions.ScheduleObjectReference");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
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
    // $ANTLR end "ruleReferenceCallEffect"


    // $ANTLR start "entryRuleFunctionCallEffect"
    // InternalKEffects.g:862:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallEffect = null;


        try {
            // InternalKEffects.g:862:59: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // InternalKEffects.g:863:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
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
    // InternalKEffects.g:869:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) ;
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
            // InternalKEffects.g:875:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) )
            // InternalKEffects.g:876:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
            {
            // InternalKEffects.g:876:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
            // InternalKEffects.g:877:3: ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
            {
            // InternalKEffects.g:877:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_COMMENT_ANNOTATION||LA22_0==54) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKEffects.g:878:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEffects.g:878:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEffects.g:879:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
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
            	    break loop22;
                }
            } while (true);

            // InternalKEffects.g:896:3: (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
            // InternalKEffects.g:897:4: otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
            {
            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getExternKeyword_1_0());
              			
            }
            // InternalKEffects.g:901:4: ( (lv_functionName_2_0= RULE_ID ) )
            // InternalKEffects.g:902:5: (lv_functionName_2_0= RULE_ID )
            {
            // InternalKEffects.g:902:5: (lv_functionName_2_0= RULE_ID )
            // InternalKEffects.g:903:6: lv_functionName_2_0= RULE_ID
            {
            lv_functionName_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
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

            // InternalKEffects.g:919:4: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            else if ( (LA24_0==24) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalKEffects.g:920:5: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // InternalKEffects.g:920:5: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // InternalKEffects.g:921:6: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_1_2_0_0());
                      					
                    }
                    // InternalKEffects.g:925:6: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalKEffects.g:926:7: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalKEffects.g:926:7: (lv_parameters_4_0= ruleParameter )
                    // InternalKEffects.g:927:8: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_1_2_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
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

                    // InternalKEffects.g:944:6: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==23) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalKEffects.g:945:7: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_1_2_0_2_0());
                    	      						
                    	    }
                    	    // InternalKEffects.g:949:7: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalKEffects.g:950:8: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalKEffects.g:950:8: (lv_parameters_6_0= ruleParameter )
                    	    // InternalKEffects.g:951:9: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      									newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_1_2_0_2_1_0());
                    	      								
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_17);
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
                    	    break loop23;
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
                    // InternalKEffects.g:975:5: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:985:1: entryRulePrintCallEffect returns [EObject current=null] : iv_rulePrintCallEffect= rulePrintCallEffect EOF ;
    public final EObject entryRulePrintCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintCallEffect = null;


        try {
            // InternalKEffects.g:985:56: (iv_rulePrintCallEffect= rulePrintCallEffect EOF )
            // InternalKEffects.g:986:2: iv_rulePrintCallEffect= rulePrintCallEffect EOF
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
    // InternalKEffects.g:992:1: rulePrintCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) (otherlv_7= 'schedule' ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject rulePrintCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_schedule_8_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:998:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) (otherlv_7= 'schedule' ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKEffects.g:999:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) (otherlv_7= 'schedule' ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKEffects.g:999:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) (otherlv_7= 'schedule' ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKEffects.g:1000:3: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) (otherlv_7= 'schedule' ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKEffects.g:1000:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_COMMENT_ANNOTATION||LA25_0==54) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKEffects.g:1001:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEffects.g:1001:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEffects.g:1002:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPrintCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
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
            	    break loop25;
                }
            } while (true);

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintCallEffectAccess().getPrintKeyword_1());
              		
            }
            // InternalKEffects.g:1023:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            // InternalKEffects.g:1024:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getPrintCallEffectAccess().getLeftParenthesisKeyword_2_0());
              			
            }
            // InternalKEffects.g:1028:4: ( (lv_parameters_3_0= ruleParameter ) )
            // InternalKEffects.g:1029:5: (lv_parameters_3_0= ruleParameter )
            {
            // InternalKEffects.g:1029:5: (lv_parameters_3_0= ruleParameter )
            // InternalKEffects.g:1030:6: lv_parameters_3_0= ruleParameter
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getPrintCallEffectAccess().getParametersParameterParserRuleCall_2_1_0());
              					
            }
            pushFollow(FollowSets000.FOLLOW_17);
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

            // InternalKEffects.g:1047:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==23) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKEffects.g:1048:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_4, grammarAccess.getPrintCallEffectAccess().getCommaKeyword_2_2_0());
            	      				
            	    }
            	    // InternalKEffects.g:1052:5: ( (lv_parameters_5_0= ruleParameter ) )
            	    // InternalKEffects.g:1053:6: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // InternalKEffects.g:1053:6: (lv_parameters_5_0= ruleParameter )
            	    // InternalKEffects.g:1054:7: lv_parameters_5_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getPrintCallEffectAccess().getParametersParameterParserRuleCall_2_2_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
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
            	    break loop26;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getPrintCallEffectAccess().getRightParenthesisKeyword_2_3());
              			
            }

            }

            // InternalKEffects.g:1077:3: (otherlv_7= 'schedule' ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+ )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKEffects.g:1078:4: otherlv_7= 'schedule' ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPrintCallEffectAccess().getScheduleKeyword_3_0());
                      			
                    }
                    // InternalKEffects.g:1082:4: ( (lv_schedule_8_0= ruleScheduleObjectReference ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalKEffects.g:1083:5: (lv_schedule_8_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKEffects.g:1083:5: (lv_schedule_8_0= ruleScheduleObjectReference )
                    	    // InternalKEffects.g:1084:6: lv_schedule_8_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getPrintCallEffectAccess().getScheduleScheduleObjectReferenceParserRuleCall_3_1_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_schedule_8_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getPrintCallEffectRule());
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
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
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
    // $ANTLR end "rulePrintCallEffect"


    // $ANTLR start "entryRuleRandomizeCallEffect"
    // InternalKEffects.g:1106:1: entryRuleRandomizeCallEffect returns [EObject current=null] : iv_ruleRandomizeCallEffect= ruleRandomizeCallEffect EOF ;
    public final EObject entryRuleRandomizeCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomizeCallEffect = null;


        try {
            // InternalKEffects.g:1106:60: (iv_ruleRandomizeCallEffect= ruleRandomizeCallEffect EOF )
            // InternalKEffects.g:1107:2: iv_ruleRandomizeCallEffect= ruleRandomizeCallEffect EOF
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
    // InternalKEffects.g:1113:1: ruleRandomizeCallEffect returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ;
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
            // InternalKEffects.g:1119:2: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
            // InternalKEffects.g:1120:2: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
            {
            // InternalKEffects.g:1120:2: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
            // InternalKEffects.g:1121:3: () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
            {
            // InternalKEffects.g:1121:3: ()
            // InternalKEffects.g:1122:4: 
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

            // InternalKEffects.g:1131:3: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_COMMENT_ANNOTATION||LA29_0==54) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKEffects.g:1132:4: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // InternalKEffects.g:1132:4: (lv_annotations_1_0= ruleAnnotation )
            	    // InternalKEffects.g:1133:5: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRandomizeCallEffectAccess().getAnnotationsAnnotationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
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
            	    break loop29;
                }
            } while (true);

            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRandomizeCallEffectAccess().getRandomizeKeyword_2());
              		
            }
            // InternalKEffects.g:1154:3: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            else if ( (LA31_0==24) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalKEffects.g:1155:4: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // InternalKEffects.g:1155:4: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // InternalKEffects.g:1156:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getRandomizeCallEffectAccess().getLeftParenthesisKeyword_3_0_0());
                      				
                    }
                    // InternalKEffects.g:1160:5: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalKEffects.g:1161:6: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalKEffects.g:1161:6: (lv_parameters_4_0= ruleParameter )
                    // InternalKEffects.g:1162:7: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getRandomizeCallEffectAccess().getParametersParameterParserRuleCall_3_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
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

                    // InternalKEffects.g:1179:5: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==23) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalKEffects.g:1180:6: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_5, grammarAccess.getRandomizeCallEffectAccess().getCommaKeyword_3_0_2_0());
                    	      					
                    	    }
                    	    // InternalKEffects.g:1184:6: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalKEffects.g:1185:7: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalKEffects.g:1185:7: (lv_parameters_6_0= ruleParameter )
                    	    // InternalKEffects.g:1186:8: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getRandomizeCallEffectAccess().getParametersParameterParserRuleCall_3_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_17);
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
                    	    break loop30;
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
                    // InternalKEffects.g:1210:4: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:1219:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKEffects.g:1219:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalKEffects.g:1220:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalKEffects.g:1226:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1232:2: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // InternalKEffects.g:1233:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // InternalKEffects.g:1233:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalKEffects.g:1234:3: this_BoolExpression_0= ruleBoolExpression
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
                    // InternalKEffects.g:1246:3: this_ValuedExpression_1= ruleValuedExpression
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
    // InternalKEffects.g:1261:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalKEffects.g:1261:55: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalKEffects.g:1262:2: iv_ruleBoolExpression= ruleBoolExpression EOF
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
    // InternalKEffects.g:1268:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1274:2: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalKEffects.g:1275:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
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
    // InternalKEffects.g:1289:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalKEffects.g:1289:60: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalKEffects.g:1290:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
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
    // InternalKEffects.g:1296:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1302:2: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) )
            // InternalKEffects.g:1303:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            {
            // InternalKEffects.g:1303:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            // InternalKEffects.g:1304:3: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_21);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:1315:3: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKEffects.g:1316:4: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    {
                    // InternalKEffects.g:1316:4: ()
                    // InternalKEffects.g:1317:5: 
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

                    // InternalKEffects.g:1326:4: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )
                    // InternalKEffects.g:1327:5: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    {
                    // InternalKEffects.g:1327:5: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    // InternalKEffects.g:1328:6: (lv_operator_2_0= ruleLogicalOrOperator )
                    {
                    // InternalKEffects.g:1328:6: (lv_operator_2_0= ruleLogicalOrOperator )
                    // InternalKEffects.g:1329:7: lv_operator_2_0= ruleLogicalOrOperator
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

                    // InternalKEffects.g:1346:5: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    // InternalKEffects.g:1347:6: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    {
                    // InternalKEffects.g:1347:6: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    // InternalKEffects.g:1348:7: lv_subExpressions_3_0= ruleLogicalAndExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
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

                    // InternalKEffects.g:1366:4: (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==28) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalKEffects.g:1367:5: otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:1371:5: ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    // InternalKEffects.g:1372:6: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalKEffects.g:1372:6: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    // InternalKEffects.g:1373:7: lv_subExpressions_5_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_21);
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalKEffects.g:1396:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalKEffects.g:1396:61: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalKEffects.g:1397:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
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
    // InternalKEffects.g:1403:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1409:2: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) )
            // InternalKEffects.g:1410:2: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            {
            // InternalKEffects.g:1410:2: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            // InternalKEffects.g:1411:3: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_22);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:1422:3: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKEffects.g:1423:4: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    {
                    // InternalKEffects.g:1423:4: ()
                    // InternalKEffects.g:1424:5: 
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

                    // InternalKEffects.g:1433:4: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )
                    // InternalKEffects.g:1434:5: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    {
                    // InternalKEffects.g:1434:5: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    // InternalKEffects.g:1435:6: (lv_operator_2_0= ruleLogicalAndOperator )
                    {
                    // InternalKEffects.g:1435:6: (lv_operator_2_0= ruleLogicalAndOperator )
                    // InternalKEffects.g:1436:7: lv_operator_2_0= ruleLogicalAndOperator
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

                    // InternalKEffects.g:1453:5: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    // InternalKEffects.g:1454:6: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    {
                    // InternalKEffects.g:1454:6: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    // InternalKEffects.g:1455:7: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
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

                    // InternalKEffects.g:1473:4: (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==29) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalKEffects.g:1474:5: otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:1478:5: ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    // InternalKEffects.g:1479:6: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalKEffects.g:1479:6: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    // InternalKEffects.g:1480:7: lv_subExpressions_5_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalKEffects.g:1503:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalKEffects.g:1503:60: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalKEffects.g:1504:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
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
    // InternalKEffects.g:1510:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseXOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1516:2: ( (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? ) )
            // InternalKEffects.g:1517:2: (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? )
            {
            // InternalKEffects.g:1517:2: (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? )
            // InternalKEffects.g:1518:3: this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseXOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_23);
            this_BitwiseXOrExpression_0=ruleBitwiseXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseXOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:1529:3: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==30) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKEffects.g:1530:4: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )*
                    {
                    // InternalKEffects.g:1530:4: ()
                    // InternalKEffects.g:1531:5: 
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

                    // InternalKEffects.g:1540:4: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) )
                    // InternalKEffects.g:1541:5: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) )
                    {
                    // InternalKEffects.g:1541:5: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    // InternalKEffects.g:1542:6: (lv_operator_2_0= ruleBitwiseOrOperator )
                    {
                    // InternalKEffects.g:1542:6: (lv_operator_2_0= ruleBitwiseOrOperator )
                    // InternalKEffects.g:1543:7: lv_operator_2_0= ruleBitwiseOrOperator
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

                    // InternalKEffects.g:1560:5: ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) )
                    // InternalKEffects.g:1561:6: (lv_subExpressions_3_0= ruleBitwiseXOrExpression )
                    {
                    // InternalKEffects.g:1561:6: (lv_subExpressions_3_0= ruleBitwiseXOrExpression )
                    // InternalKEffects.g:1562:7: lv_subExpressions_3_0= ruleBitwiseXOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseXOrExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
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

                    // InternalKEffects.g:1580:4: (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==30) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalKEffects.g:1581:5: otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:1585:5: ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) )
                    	    // InternalKEffects.g:1586:6: (lv_subExpressions_5_0= ruleBitwiseXOrExpression )
                    	    {
                    	    // InternalKEffects.g:1586:6: (lv_subExpressions_5_0= ruleBitwiseXOrExpression )
                    	    // InternalKEffects.g:1587:7: lv_subExpressions_5_0= ruleBitwiseXOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseXOrExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_23);
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
                    	    break loop37;
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
    // InternalKEffects.g:1610:1: entryRuleBitwiseXOrExpression returns [EObject current=null] : iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF ;
    public final EObject entryRuleBitwiseXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXOrExpression = null;


        try {
            // InternalKEffects.g:1610:61: (iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF )
            // InternalKEffects.g:1611:2: iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF
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
    // InternalKEffects.g:1617:1: ruleBitwiseXOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseXOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1623:2: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) )
            // InternalKEffects.g:1624:2: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            {
            // InternalKEffects.g:1624:2: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            // InternalKEffects.g:1625:3: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_24);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:1636:3: ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==31) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKEffects.g:1637:4: () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    {
                    // InternalKEffects.g:1637:4: ()
                    // InternalKEffects.g:1638:5: 
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

                    // InternalKEffects.g:1647:4: ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )
                    // InternalKEffects.g:1648:5: ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    {
                    // InternalKEffects.g:1648:5: ( (lv_operator_2_0= ruleBitwiseXOrOperator ) )
                    // InternalKEffects.g:1649:6: (lv_operator_2_0= ruleBitwiseXOrOperator )
                    {
                    // InternalKEffects.g:1649:6: (lv_operator_2_0= ruleBitwiseXOrOperator )
                    // InternalKEffects.g:1650:7: lv_operator_2_0= ruleBitwiseXOrOperator
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

                    // InternalKEffects.g:1667:5: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    // InternalKEffects.g:1668:6: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    {
                    // InternalKEffects.g:1668:6: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    // InternalKEffects.g:1669:7: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
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

                    // InternalKEffects.g:1687:4: (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==31) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalKEffects.g:1688:5: otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getBitwiseXOrExpressionAccess().getCircumflexAccentKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:1692:5: ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    // InternalKEffects.g:1693:6: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalKEffects.g:1693:6: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    // InternalKEffects.g:1694:7: lv_subExpressions_5_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
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
                    	    break loop39;
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
    // InternalKEffects.g:1717:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalKEffects.g:1717:61: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalKEffects.g:1718:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
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
    // InternalKEffects.g:1724:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1730:2: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) )
            // InternalKEffects.g:1731:2: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            {
            // InternalKEffects.g:1731:2: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            // InternalKEffects.g:1732:3: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_25);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CompareOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:1743:3: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==32) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKEffects.g:1744:4: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    {
                    // InternalKEffects.g:1744:4: ()
                    // InternalKEffects.g:1745:5: 
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

                    // InternalKEffects.g:1754:4: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )
                    // InternalKEffects.g:1755:5: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    {
                    // InternalKEffects.g:1755:5: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    // InternalKEffects.g:1756:6: (lv_operator_2_0= ruleBitwiseAndOperator )
                    {
                    // InternalKEffects.g:1756:6: (lv_operator_2_0= ruleBitwiseAndOperator )
                    // InternalKEffects.g:1757:7: lv_operator_2_0= ruleBitwiseAndOperator
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

                    // InternalKEffects.g:1774:5: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    // InternalKEffects.g:1775:6: (lv_subExpressions_3_0= ruleCompareOperation )
                    {
                    // InternalKEffects.g:1775:6: (lv_subExpressions_3_0= ruleCompareOperation )
                    // InternalKEffects.g:1776:7: lv_subExpressions_3_0= ruleCompareOperation
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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

                    // InternalKEffects.g:1794:4: (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==32) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalKEffects.g:1795:5: otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:1799:5: ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    // InternalKEffects.g:1800:6: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    {
                    	    // InternalKEffects.g:1800:6: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    // InternalKEffects.g:1801:7: lv_subExpressions_5_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_25);
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
                    	    break loop41;
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
    // InternalKEffects.g:1824:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalKEffects.g:1824:57: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalKEffects.g:1825:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
    // InternalKEffects.g:1831:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1837:2: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalKEffects.g:1838:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalKEffects.g:1838:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalKEffects.g:1839:3: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_26);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NotOrValuedExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:1850:3: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=71 && LA43_0<=76)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKEffects.g:1851:4: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalKEffects.g:1851:4: ()
                    // InternalKEffects.g:1852:5: 
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

                    // InternalKEffects.g:1861:4: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalKEffects.g:1862:5: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalKEffects.g:1862:5: (lv_operator_2_0= ruleCompareOperator )
                    // InternalKEffects.g:1863:6: lv_operator_2_0= ruleCompareOperator
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

                    // InternalKEffects.g:1880:4: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalKEffects.g:1881:5: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalKEffects.g:1881:5: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalKEffects.g:1882:6: lv_subExpressions_3_0= ruleNotOrValuedExpression
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
    // InternalKEffects.g:1904:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalKEffects.g:1904:62: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalKEffects.g:1905:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
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
    // InternalKEffects.g:1911:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1917:2: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalKEffects.g:1918:2: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalKEffects.g:1918:2: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // InternalKEffects.g:1919:3: this_ValuedExpression_0= ruleValuedExpression
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
                    // InternalKEffects.g:1931:3: this_NotExpression_1= ruleNotExpression
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
    // InternalKEffects.g:1946:1: entryRuleBitwiseNotExpression returns [EObject current=null] : iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF ;
    public final EObject entryRuleBitwiseNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseNotExpression = null;


        try {
            // InternalKEffects.g:1946:61: (iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF )
            // InternalKEffects.g:1947:2: iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF
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
    // InternalKEffects.g:1953:1: ruleBitwiseNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleBitwiseNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;



        	enterRule();

        try {
            // InternalKEffects.g:1959:2: ( ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalKEffects.g:1960:2: ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalKEffects.g:1960:2: ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==78) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=RULE_HOSTCODE && LA45_0<=RULE_ID)||LA45_0==RULE_BOOLEAN||LA45_0==RULE_COMMENT_ANNOTATION||LA45_0==18||LA45_0==25||LA45_0==27||LA45_0==45||LA45_0==47||LA45_0==54||LA45_0==77||LA45_0==80) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalKEffects.g:1961:3: ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) )
                    {
                    // InternalKEffects.g:1961:3: ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) )
                    // InternalKEffects.g:1962:4: () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) )
                    {
                    // InternalKEffects.g:1962:4: ()
                    // InternalKEffects.g:1963:5: 
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

                    // InternalKEffects.g:1972:4: ( (lv_operator_1_0= ruleBitwiseNotOperator ) )
                    // InternalKEffects.g:1973:5: (lv_operator_1_0= ruleBitwiseNotOperator )
                    {
                    // InternalKEffects.g:1973:5: (lv_operator_1_0= ruleBitwiseNotOperator )
                    // InternalKEffects.g:1974:6: lv_operator_1_0= ruleBitwiseNotOperator
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

                    // InternalKEffects.g:1991:4: ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) )
                    // InternalKEffects.g:1992:5: (lv_subExpressions_2_0= ruleBitwiseNotExpression )
                    {
                    // InternalKEffects.g:1992:5: (lv_subExpressions_2_0= ruleBitwiseNotExpression )
                    // InternalKEffects.g:1993:6: lv_subExpressions_2_0= ruleBitwiseNotExpression
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
                    // InternalKEffects.g:2012:3: this_AtomicExpression_3= ruleAtomicExpression
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
    // InternalKEffects.g:2027:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalKEffects.g:2027:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalKEffects.g:2028:2: iv_ruleNotExpression= ruleNotExpression EOF
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
    // InternalKEffects.g:2034:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_BitwiseNotExpression_3 = null;



        	enterRule();

        try {
            // InternalKEffects.g:2040:2: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression ) )
            // InternalKEffects.g:2041:2: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression )
            {
            // InternalKEffects.g:2041:2: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==79) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=RULE_HOSTCODE && LA46_0<=RULE_ID)||LA46_0==RULE_BOOLEAN||LA46_0==RULE_COMMENT_ANNOTATION||LA46_0==18||LA46_0==25||LA46_0==27||LA46_0==45||LA46_0==47||LA46_0==54||(LA46_0>=77 && LA46_0<=78)||LA46_0==80) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalKEffects.g:2042:3: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalKEffects.g:2042:3: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalKEffects.g:2043:4: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalKEffects.g:2043:4: ()
                    // InternalKEffects.g:2044:5: 
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

                    // InternalKEffects.g:2053:4: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalKEffects.g:2054:5: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalKEffects.g:2054:5: (lv_operator_1_0= ruleNotOperator )
                    // InternalKEffects.g:2055:6: lv_operator_1_0= ruleNotOperator
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

                    // InternalKEffects.g:2072:4: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalKEffects.g:2073:5: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalKEffects.g:2073:5: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalKEffects.g:2074:6: lv_subExpressions_2_0= ruleNotExpression
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
                    // InternalKEffects.g:2093:3: this_BitwiseNotExpression_3= ruleBitwiseNotExpression
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
    // InternalKEffects.g:2108:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalKEffects.g:2108:57: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalKEffects.g:2109:2: iv_ruleValuedExpression= ruleValuedExpression EOF
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
    // InternalKEffects.g:2115:1: ruleValuedExpression returns [EObject current=null] : this_ShiftExpressions_0= ruleShiftExpressions ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpressions_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:2121:2: (this_ShiftExpressions_0= ruleShiftExpressions )
            // InternalKEffects.g:2122:2: this_ShiftExpressions_0= ruleShiftExpressions
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
    // InternalKEffects.g:2136:1: entryRuleShiftExpressions returns [EObject current=null] : iv_ruleShiftExpressions= ruleShiftExpressions EOF ;
    public final EObject entryRuleShiftExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpressions = null;


        try {
            // InternalKEffects.g:2136:57: (iv_ruleShiftExpressions= ruleShiftExpressions EOF )
            // InternalKEffects.g:2137:2: iv_ruleShiftExpressions= ruleShiftExpressions EOF
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
    // InternalKEffects.g:2143:1: ruleShiftExpressions returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )* ) ;
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
            // InternalKEffects.g:2149:2: ( (this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )* ) )
            // InternalKEffects.g:2150:2: (this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )* )
            {
            // InternalKEffects.g:2150:2: (this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )* )
            // InternalKEffects.g:2151:3: this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSumExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_27);
            this_SumExpression_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SumExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:2162:3: ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )*
            loop50:
            do {
                int alt50=4;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    alt50=1;
                    }
                    break;
                case 34:
                    {
                    alt50=2;
                    }
                    break;
                case 35:
                    {
                    alt50=3;
                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // InternalKEffects.g:2163:4: ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2163:4: ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )
            	    // InternalKEffects.g:2164:5: () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2164:5: ()
            	    // InternalKEffects.g:2165:6: 
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

            	    // InternalKEffects.g:2174:5: ( (lv_operator_2_0= ruleShiftLeftOperator ) )
            	    // InternalKEffects.g:2175:6: (lv_operator_2_0= ruleShiftLeftOperator )
            	    {
            	    // InternalKEffects.g:2175:6: (lv_operator_2_0= ruleShiftLeftOperator )
            	    // InternalKEffects.g:2176:7: lv_operator_2_0= ruleShiftLeftOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getOperatorShiftLeftOperatorEnumRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
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

            	    // InternalKEffects.g:2193:5: ( (lv_subExpressions_3_0= ruleSumExpression ) )
            	    // InternalKEffects.g:2194:6: (lv_subExpressions_3_0= ruleSumExpression )
            	    {
            	    // InternalKEffects.g:2194:6: (lv_subExpressions_3_0= ruleSumExpression )
            	    // InternalKEffects.g:2195:7: lv_subExpressions_3_0= ruleSumExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
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

            	    // InternalKEffects.g:2212:5: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        alt47 = dfa47.predict(input);
            	        switch (alt47) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2213:6: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_4, grammarAccess.getShiftExpressionsAccess().getLessThanSignLessThanSignKeyword_1_0_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2217:6: ( (lv_subExpressions_5_0= ruleSumExpression ) )
            	    	    // InternalKEffects.g:2218:7: (lv_subExpressions_5_0= ruleSumExpression )
            	    	    {
            	    	    // InternalKEffects.g:2218:7: (lv_subExpressions_5_0= ruleSumExpression )
            	    	    // InternalKEffects.g:2219:8: lv_subExpressions_5_0= ruleSumExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_0_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_27);
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
            	    	    break loop47;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKEffects.g:2239:4: ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2239:4: ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* )
            	    // InternalKEffects.g:2240:5: () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2240:5: ()
            	    // InternalKEffects.g:2241:6: 
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

            	    // InternalKEffects.g:2250:5: ( (lv_operator_7_0= ruleShiftRightOperator ) )
            	    // InternalKEffects.g:2251:6: (lv_operator_7_0= ruleShiftRightOperator )
            	    {
            	    // InternalKEffects.g:2251:6: (lv_operator_7_0= ruleShiftRightOperator )
            	    // InternalKEffects.g:2252:7: lv_operator_7_0= ruleShiftRightOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getOperatorShiftRightOperatorEnumRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
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

            	    // InternalKEffects.g:2269:5: ( (lv_subExpressions_8_0= ruleSumExpression ) )
            	    // InternalKEffects.g:2270:6: (lv_subExpressions_8_0= ruleSumExpression )
            	    {
            	    // InternalKEffects.g:2270:6: (lv_subExpressions_8_0= ruleSumExpression )
            	    // InternalKEffects.g:2271:7: lv_subExpressions_8_0= ruleSumExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
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

            	    // InternalKEffects.g:2288:5: (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        alt48 = dfa48.predict(input);
            	        switch (alt48) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2289:6: otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,34,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_9, grammarAccess.getShiftExpressionsAccess().getGreaterThanSignGreaterThanSignKeyword_1_1_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2293:6: ( (lv_subExpressions_10_0= ruleSumExpression ) )
            	    	    // InternalKEffects.g:2294:7: (lv_subExpressions_10_0= ruleSumExpression )
            	    	    {
            	    	    // InternalKEffects.g:2294:7: (lv_subExpressions_10_0= ruleSumExpression )
            	    	    // InternalKEffects.g:2295:8: lv_subExpressions_10_0= ruleSumExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_1_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_27);
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
            	    	    break loop48;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalKEffects.g:2315:4: ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2315:4: ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* )
            	    // InternalKEffects.g:2316:5: () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2316:5: ()
            	    // InternalKEffects.g:2317:6: 
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

            	    // InternalKEffects.g:2326:5: ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) )
            	    // InternalKEffects.g:2327:6: (lv_operator_12_0= ruleShiftRightUnsignedOperator )
            	    {
            	    // InternalKEffects.g:2327:6: (lv_operator_12_0= ruleShiftRightUnsignedOperator )
            	    // InternalKEffects.g:2328:7: lv_operator_12_0= ruleShiftRightUnsignedOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_2_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
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

            	    // InternalKEffects.g:2345:5: ( (lv_subExpressions_13_0= ruleSumExpression ) )
            	    // InternalKEffects.g:2346:6: (lv_subExpressions_13_0= ruleSumExpression )
            	    {
            	    // InternalKEffects.g:2346:6: (lv_subExpressions_13_0= ruleSumExpression )
            	    // InternalKEffects.g:2347:7: lv_subExpressions_13_0= ruleSumExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
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

            	    // InternalKEffects.g:2364:5: (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        alt49 = dfa49.predict(input);
            	        switch (alt49) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2365:6: otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,35,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_14, grammarAccess.getShiftExpressionsAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_2_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2369:6: ( (lv_subExpressions_15_0= ruleSumExpression ) )
            	    	    // InternalKEffects.g:2370:7: (lv_subExpressions_15_0= ruleSumExpression )
            	    	    {
            	    	    // InternalKEffects.g:2370:7: (lv_subExpressions_15_0= ruleSumExpression )
            	    	    // InternalKEffects.g:2371:8: lv_subExpressions_15_0= ruleSumExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_2_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_27);
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
            	    	    break loop49;
            	        }
            	    } while (true);


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
    // $ANTLR end "ruleShiftExpressions"


    // $ANTLR start "entryRuleShiftRightExpression"
    // InternalKEffects.g:2395:1: entryRuleShiftRightExpression returns [EObject current=null] : iv_ruleShiftRightExpression= ruleShiftRightExpression EOF ;
    public final EObject entryRuleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightExpression = null;


        try {
            // InternalKEffects.g:2395:61: (iv_ruleShiftRightExpression= ruleShiftRightExpression EOF )
            // InternalKEffects.g:2396:2: iv_ruleShiftRightExpression= ruleShiftRightExpression EOF
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
    // InternalKEffects.g:2402:1: ruleShiftRightExpression returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SumExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:2408:2: ( (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) )
            // InternalKEffects.g:2409:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            {
            // InternalKEffects.g:2409:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            // InternalKEffects.g:2410:3: this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSumExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_29);
            this_SumExpression_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SumExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:2421:3: ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==34) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalKEffects.g:2422:4: () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    {
                    // InternalKEffects.g:2422:4: ()
                    // InternalKEffects.g:2423:5: 
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

                    // InternalKEffects.g:2432:4: ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) )
                    // InternalKEffects.g:2433:5: ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    {
                    // InternalKEffects.g:2433:5: ( (lv_operator_2_0= ruleShiftRightOperator ) )
                    // InternalKEffects.g:2434:6: (lv_operator_2_0= ruleShiftRightOperator )
                    {
                    // InternalKEffects.g:2434:6: (lv_operator_2_0= ruleShiftRightOperator )
                    // InternalKEffects.g:2435:7: lv_operator_2_0= ruleShiftRightOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getOperatorShiftRightOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
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

                    // InternalKEffects.g:2452:5: ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    // InternalKEffects.g:2453:6: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    {
                    // InternalKEffects.g:2453:6: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    // InternalKEffects.g:2454:7: lv_subExpressions_3_0= ruleShiftRightUnsignedExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
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

                    // InternalKEffects.g:2472:4: (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==34) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalKEffects.g:2473:5: otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getShiftRightExpressionAccess().getGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:2477:5: ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    // InternalKEffects.g:2478:6: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    {
                    	    // InternalKEffects.g:2478:6: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    // InternalKEffects.g:2479:7: lv_subExpressions_5_0= ruleShiftRightUnsignedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_29);
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
                    	    break loop51;
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
    // InternalKEffects.g:2502:1: entryRuleShiftRightUnsignedExpression returns [EObject current=null] : iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF ;
    public final EObject entryRuleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightUnsignedExpression = null;


        try {
            // InternalKEffects.g:2502:69: (iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF )
            // InternalKEffects.g:2503:2: iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF
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
    // InternalKEffects.g:2509:1: ruleShiftRightUnsignedExpression returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SumExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:2515:2: ( (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? ) )
            // InternalKEffects.g:2516:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? )
            {
            // InternalKEffects.g:2516:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? )
            // InternalKEffects.g:2517:3: this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSumExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_27);
            this_SumExpression_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SumExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:2528:3: ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==35) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalKEffects.g:2529:4: () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*
                    {
                    // InternalKEffects.g:2529:4: ()
                    // InternalKEffects.g:2530:5: 
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

                    // InternalKEffects.g:2539:4: ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) )
                    // InternalKEffects.g:2540:5: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) )
                    {
                    // InternalKEffects.g:2540:5: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) )
                    // InternalKEffects.g:2541:6: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    {
                    // InternalKEffects.g:2541:6: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    // InternalKEffects.g:2542:7: lv_operator_2_0= ruleShiftRightUnsignedOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
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

                    // InternalKEffects.g:2559:5: ( (lv_subExpressions_3_0= ruleSumExpression ) )
                    // InternalKEffects.g:2560:6: (lv_subExpressions_3_0= ruleSumExpression )
                    {
                    // InternalKEffects.g:2560:6: (lv_subExpressions_3_0= ruleSumExpression )
                    // InternalKEffects.g:2561:7: lv_subExpressions_3_0= ruleSumExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsSumExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
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

                    // InternalKEffects.g:2579:4: (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==35) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalKEffects.g:2580:5: otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getShiftRightUnsignedExpressionAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:2584:5: ( (lv_subExpressions_5_0= ruleSumExpression ) )
                    	    // InternalKEffects.g:2585:6: (lv_subExpressions_5_0= ruleSumExpression )
                    	    {
                    	    // InternalKEffects.g:2585:6: (lv_subExpressions_5_0= ruleSumExpression )
                    	    // InternalKEffects.g:2586:7: lv_subExpressions_5_0= ruleSumExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsSumExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_30);
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
                    	    break loop53;
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
    // InternalKEffects.g:2609:1: entryRuleSumExpression returns [EObject current=null] : iv_ruleSumExpression= ruleSumExpression EOF ;
    public final EObject entryRuleSumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumExpression = null;


        try {
            // InternalKEffects.g:2609:54: (iv_ruleSumExpression= ruleSumExpression EOF )
            // InternalKEffects.g:2610:2: iv_ruleSumExpression= ruleSumExpression EOF
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
    // InternalKEffects.g:2616:1: ruleSumExpression returns [EObject current=null] : (this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )* ) ;
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
            // InternalKEffects.g:2622:2: ( (this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )* ) )
            // InternalKEffects.g:2623:2: (this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )* )
            {
            // InternalKEffects.g:2623:2: (this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )* )
            // InternalKEffects.g:2624:3: this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSumExpressionAccess().getProductExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_31);
            this_ProductExpression_0=ruleProductExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProductExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:2635:3: ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )*
            loop57:
            do {
                int alt57=3;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==36) ) {
                    alt57=1;
                }
                else if ( (LA57_0==37) ) {
                    alt57=2;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalKEffects.g:2636:4: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2636:4: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )
            	    // InternalKEffects.g:2637:5: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2637:5: ()
            	    // InternalKEffects.g:2638:6: 
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

            	    // InternalKEffects.g:2647:5: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // InternalKEffects.g:2648:6: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // InternalKEffects.g:2648:6: (lv_operator_2_0= ruleAddOperator )
            	    // InternalKEffects.g:2649:7: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSumExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
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

            	    // InternalKEffects.g:2666:5: ( (lv_subExpressions_3_0= ruleProductExpression ) )
            	    // InternalKEffects.g:2667:6: (lv_subExpressions_3_0= ruleProductExpression )
            	    {
            	    // InternalKEffects.g:2667:6: (lv_subExpressions_3_0= ruleProductExpression )
            	    // InternalKEffects.g:2668:7: lv_subExpressions_3_0= ruleProductExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_31);
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

            	    // InternalKEffects.g:2685:5: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )*
            	    loop55:
            	    do {
            	        int alt55=2;
            	        alt55 = dfa55.predict(input);
            	        switch (alt55) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2686:6: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_4, grammarAccess.getSumExpressionAccess().getPlusSignKeyword_1_0_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2690:6: ( (lv_subExpressions_5_0= ruleProductExpression ) )
            	    	    // InternalKEffects.g:2691:7: (lv_subExpressions_5_0= ruleProductExpression )
            	    	    {
            	    	    // InternalKEffects.g:2691:7: (lv_subExpressions_5_0= ruleProductExpression )
            	    	    // InternalKEffects.g:2692:8: lv_subExpressions_5_0= ruleProductExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_0_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_31);
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
            	    	    break loop55;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKEffects.g:2712:4: ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2712:4: ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* )
            	    // InternalKEffects.g:2713:5: () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2713:5: ()
            	    // InternalKEffects.g:2714:6: 
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

            	    // InternalKEffects.g:2723:5: ( (lv_operator_7_0= ruleSubOperator ) )
            	    // InternalKEffects.g:2724:6: (lv_operator_7_0= ruleSubOperator )
            	    {
            	    // InternalKEffects.g:2724:6: (lv_operator_7_0= ruleSubOperator )
            	    // InternalKEffects.g:2725:7: lv_operator_7_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSumExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
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

            	    // InternalKEffects.g:2742:5: ( (lv_subExpressions_8_0= ruleProductExpression ) )
            	    // InternalKEffects.g:2743:6: (lv_subExpressions_8_0= ruleProductExpression )
            	    {
            	    // InternalKEffects.g:2743:6: (lv_subExpressions_8_0= ruleProductExpression )
            	    // InternalKEffects.g:2744:7: lv_subExpressions_8_0= ruleProductExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_31);
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

            	    // InternalKEffects.g:2761:5: (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )*
            	    loop56:
            	    do {
            	        int alt56=2;
            	        alt56 = dfa56.predict(input);
            	        switch (alt56) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2762:6: otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_9, grammarAccess.getSumExpressionAccess().getHyphenMinusKeyword_1_1_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2766:6: ( (lv_subExpressions_10_0= ruleProductExpression ) )
            	    	    // InternalKEffects.g:2767:7: (lv_subExpressions_10_0= ruleProductExpression )
            	    	    {
            	    	    // InternalKEffects.g:2767:7: (lv_subExpressions_10_0= ruleProductExpression )
            	    	    // InternalKEffects.g:2768:8: lv_subExpressions_10_0= ruleProductExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_1_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_31);
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
            	    	    break loop56;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalKEffects.g:2792:1: entryRuleProductExpression returns [EObject current=null] : iv_ruleProductExpression= ruleProductExpression EOF ;
    public final EObject entryRuleProductExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductExpression = null;


        try {
            // InternalKEffects.g:2792:58: (iv_ruleProductExpression= ruleProductExpression EOF )
            // InternalKEffects.g:2793:2: iv_ruleProductExpression= ruleProductExpression EOF
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
    // InternalKEffects.g:2799:1: ruleProductExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )* ) ;
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
            // InternalKEffects.g:2805:2: ( (this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )* ) )
            // InternalKEffects.g:2806:2: (this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )* )
            {
            // InternalKEffects.g:2806:2: (this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )* )
            // InternalKEffects.g:2807:3: this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getProductExpressionAccess().getNegExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_32);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NegExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:2818:3: ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )*
            loop61:
            do {
                int alt61=4;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    alt61=1;
                    }
                    break;
                case 39:
                    {
                    alt61=2;
                    }
                    break;
                case 40:
                    {
                    alt61=3;
                    }
                    break;

                }

                switch (alt61) {
            	case 1 :
            	    // InternalKEffects.g:2819:4: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2819:4: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* )
            	    // InternalKEffects.g:2820:5: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2820:5: ()
            	    // InternalKEffects.g:2821:6: 
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

            	    // InternalKEffects.g:2830:5: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // InternalKEffects.g:2831:6: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // InternalKEffects.g:2831:6: (lv_operator_2_0= ruleMultOperator )
            	    // InternalKEffects.g:2832:7: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
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

            	    // InternalKEffects.g:2849:5: ( (lv_subExpressions_3_0= ruleNegExpression ) )
            	    // InternalKEffects.g:2850:6: (lv_subExpressions_3_0= ruleNegExpression )
            	    {
            	    // InternalKEffects.g:2850:6: (lv_subExpressions_3_0= ruleNegExpression )
            	    // InternalKEffects.g:2851:7: lv_subExpressions_3_0= ruleNegExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
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

            	    // InternalKEffects.g:2868:5: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )*
            	    loop58:
            	    do {
            	        int alt58=2;
            	        alt58 = dfa58.predict(input);
            	        switch (alt58) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2869:6: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_4, grammarAccess.getProductExpressionAccess().getAsteriskKeyword_1_0_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2873:6: ( (lv_subExpressions_5_0= ruleNegExpression ) )
            	    	    // InternalKEffects.g:2874:7: (lv_subExpressions_5_0= ruleNegExpression )
            	    	    {
            	    	    // InternalKEffects.g:2874:7: (lv_subExpressions_5_0= ruleNegExpression )
            	    	    // InternalKEffects.g:2875:8: lv_subExpressions_5_0= ruleNegExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_0_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_32);
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
            	    	    break loop58;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKEffects.g:2895:4: ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2895:4: ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* )
            	    // InternalKEffects.g:2896:5: () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2896:5: ()
            	    // InternalKEffects.g:2897:6: 
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

            	    // InternalKEffects.g:2906:5: ( (lv_operator_7_0= ruleDivOperator ) )
            	    // InternalKEffects.g:2907:6: (lv_operator_7_0= ruleDivOperator )
            	    {
            	    // InternalKEffects.g:2907:6: (lv_operator_7_0= ruleDivOperator )
            	    // InternalKEffects.g:2908:7: lv_operator_7_0= ruleDivOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
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

            	    // InternalKEffects.g:2925:5: ( (lv_subExpressions_8_0= ruleNegExpression ) )
            	    // InternalKEffects.g:2926:6: (lv_subExpressions_8_0= ruleNegExpression )
            	    {
            	    // InternalKEffects.g:2926:6: (lv_subExpressions_8_0= ruleNegExpression )
            	    // InternalKEffects.g:2927:7: lv_subExpressions_8_0= ruleNegExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
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

            	    // InternalKEffects.g:2944:5: (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )*
            	    loop59:
            	    do {
            	        int alt59=2;
            	        alt59 = dfa59.predict(input);
            	        switch (alt59) {
            	    	case 1 :
            	    	    // InternalKEffects.g:2945:6: otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_9, grammarAccess.getProductExpressionAccess().getSolidusKeyword_1_1_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:2949:6: ( (lv_subExpressions_10_0= ruleNegExpression ) )
            	    	    // InternalKEffects.g:2950:7: (lv_subExpressions_10_0= ruleNegExpression )
            	    	    {
            	    	    // InternalKEffects.g:2950:7: (lv_subExpressions_10_0= ruleNegExpression )
            	    	    // InternalKEffects.g:2951:8: lv_subExpressions_10_0= ruleNegExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_1_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_32);
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
            	    	    break loop59;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalKEffects.g:2971:4: ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* )
            	    {
            	    // InternalKEffects.g:2971:4: ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* )
            	    // InternalKEffects.g:2972:5: () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )*
            	    {
            	    // InternalKEffects.g:2972:5: ()
            	    // InternalKEffects.g:2973:6: 
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

            	    // InternalKEffects.g:2982:5: ( (lv_operator_12_0= ruleModOperator ) )
            	    // InternalKEffects.g:2983:6: (lv_operator_12_0= ruleModOperator )
            	    {
            	    // InternalKEffects.g:2983:6: (lv_operator_12_0= ruleModOperator )
            	    // InternalKEffects.g:2984:7: lv_operator_12_0= ruleModOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getOperatorModOperatorEnumRuleCall_1_2_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
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

            	    // InternalKEffects.g:3001:5: ( (lv_subExpressions_13_0= ruleNegExpression ) )
            	    // InternalKEffects.g:3002:6: (lv_subExpressions_13_0= ruleNegExpression )
            	    {
            	    // InternalKEffects.g:3002:6: (lv_subExpressions_13_0= ruleNegExpression )
            	    // InternalKEffects.g:3003:7: lv_subExpressions_13_0= ruleNegExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
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

            	    // InternalKEffects.g:3020:5: (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )*
            	    loop60:
            	    do {
            	        int alt60=2;
            	        alt60 = dfa60.predict(input);
            	        switch (alt60) {
            	    	case 1 :
            	    	    // InternalKEffects.g:3021:6: otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,40,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_14, grammarAccess.getProductExpressionAccess().getPercentSignKeyword_1_2_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKEffects.g:3025:6: ( (lv_subExpressions_15_0= ruleNegExpression ) )
            	    	    // InternalKEffects.g:3026:7: (lv_subExpressions_15_0= ruleNegExpression )
            	    	    {
            	    	    // InternalKEffects.g:3026:7: (lv_subExpressions_15_0= ruleNegExpression )
            	    	    // InternalKEffects.g:3027:8: lv_subExpressions_15_0= ruleNegExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_2_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_32);
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
            	    	    break loop60;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
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
    // InternalKEffects.g:3051:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalKEffects.g:3051:54: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalKEffects.g:3052:2: iv_ruleNegExpression= ruleNegExpression EOF
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
    // InternalKEffects.g:3058:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_TernaryOperation_3 = null;



        	enterRule();

        try {
            // InternalKEffects.g:3064:2: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) )
            // InternalKEffects.g:3065:2: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            {
            // InternalKEffects.g:3065:2: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==37) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=RULE_HOSTCODE && LA62_0<=RULE_COMMENT_ANNOTATION)||LA62_0==18||LA62_0==25||LA62_0==27||LA62_0==45||(LA62_0>=47 && LA62_0<=48)||LA62_0==52||LA62_0==54||LA62_0==77||LA62_0==80) ) {
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
                    // InternalKEffects.g:3066:3: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalKEffects.g:3066:3: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalKEffects.g:3067:4: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalKEffects.g:3067:4: ()
                    // InternalKEffects.g:3068:5: 
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

                    // InternalKEffects.g:3077:4: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalKEffects.g:3078:5: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalKEffects.g:3078:5: (lv_operator_1_0= ruleSubOperator )
                    // InternalKEffects.g:3079:6: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
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

                    // InternalKEffects.g:3096:4: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalKEffects.g:3097:5: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalKEffects.g:3097:5: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalKEffects.g:3098:6: lv_subExpressions_2_0= ruleNegExpression
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
                    // InternalKEffects.g:3117:3: this_TernaryOperation_3= ruleTernaryOperation
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
    // InternalKEffects.g:3132:1: entryRuleTernaryOperation returns [EObject current=null] : iv_ruleTernaryOperation= ruleTernaryOperation EOF ;
    public final EObject entryRuleTernaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTernaryOperation = null;


        try {
            // InternalKEffects.g:3132:57: (iv_ruleTernaryOperation= ruleTernaryOperation EOF )
            // InternalKEffects.g:3133:2: iv_ruleTernaryOperation= ruleTernaryOperation EOF
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
    // InternalKEffects.g:3139:1: ruleTernaryOperation returns [EObject current=null] : ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression ) ;
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
            // InternalKEffects.g:3145:2: ( ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression ) )
            // InternalKEffects.g:3146:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression )
            {
            // InternalKEffects.g:3146:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalKEffects.g:3147:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? )
                    {
                    // InternalKEffects.g:3147:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? )
                    // InternalKEffects.g:3148:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )?
                    {
                    // InternalKEffects.g:3148:4: ()
                    // InternalKEffects.g:3149:5: 
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

                    // InternalKEffects.g:3158:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
                    // InternalKEffects.g:3159:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    {
                    // InternalKEffects.g:3159:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    // InternalKEffects.g:3160:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
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

                    // InternalKEffects.g:3177:4: ( (lv_operator_2_0= ruleConditionalOperator ) )
                    // InternalKEffects.g:3178:5: (lv_operator_2_0= ruleConditionalOperator )
                    {
                    // InternalKEffects.g:3178:5: (lv_operator_2_0= ruleConditionalOperator )
                    // InternalKEffects.g:3179:6: lv_operator_2_0= ruleConditionalOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
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

                    // InternalKEffects.g:3196:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKEffects.g:3197:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKEffects.g:3197:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKEffects.g:3198:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
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

                    // InternalKEffects.g:3215:4: (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==41) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalKEffects.g:3216:5: otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                            {
                            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getTernaryOperationAccess().getColonKeyword_0_4_0());
                              				
                            }
                            // InternalKEffects.g:3220:5: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                            // InternalKEffects.g:3221:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                            {
                            // InternalKEffects.g:3221:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                            // InternalKEffects.g:3222:7: lv_subExpressions_5_0= ruleAtomicValuedExpression
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
                    // InternalKEffects.g:3242:3: this_InitExpression_6= ruleInitExpression
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
    // InternalKEffects.g:3257:1: entryRuleInitExpression returns [EObject current=null] : iv_ruleInitExpression= ruleInitExpression EOF ;
    public final EObject entryRuleInitExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitExpression = null;


        try {
            // InternalKEffects.g:3257:55: (iv_ruleInitExpression= ruleInitExpression EOF )
            // InternalKEffects.g:3258:2: iv_ruleInitExpression= ruleInitExpression EOF
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
    // InternalKEffects.g:3264:1: ruleInitExpression returns [EObject current=null] : (this_FbyExpression_0= ruleFbyExpression ( () ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) ) (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )* )? ) ;
    public final EObject ruleInitExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_FbyExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:3270:2: ( (this_FbyExpression_0= ruleFbyExpression ( () ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) ) (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )* )? ) )
            // InternalKEffects.g:3271:2: (this_FbyExpression_0= ruleFbyExpression ( () ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) ) (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )* )? )
            {
            // InternalKEffects.g:3271:2: (this_FbyExpression_0= ruleFbyExpression ( () ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) ) (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )* )? )
            // InternalKEffects.g:3272:3: this_FbyExpression_0= ruleFbyExpression ( () ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) ) (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getInitExpressionAccess().getFbyExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_36);
            this_FbyExpression_0=ruleFbyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_FbyExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:3283:3: ( () ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) ) (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==42) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalKEffects.g:3284:4: () ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) ) (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )*
                    {
                    // InternalKEffects.g:3284:4: ()
                    // InternalKEffects.g:3285:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getInitExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKEffects.g:3294:4: ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) )
                    // InternalKEffects.g:3295:5: ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) )
                    {
                    // InternalKEffects.g:3295:5: ( (lv_operator_2_0= ruleInitOperator ) )
                    // InternalKEffects.g:3296:6: (lv_operator_2_0= ruleInitOperator )
                    {
                    // InternalKEffects.g:3296:6: (lv_operator_2_0= ruleInitOperator )
                    // InternalKEffects.g:3297:7: lv_operator_2_0= ruleInitOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getInitExpressionAccess().getOperatorInitOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
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

                    // InternalKEffects.g:3314:5: ( (lv_subExpressions_3_0= ruleFbyExpression ) )
                    // InternalKEffects.g:3315:6: (lv_subExpressions_3_0= ruleFbyExpression )
                    {
                    // InternalKEffects.g:3315:6: (lv_subExpressions_3_0= ruleFbyExpression )
                    // InternalKEffects.g:3316:7: lv_subExpressions_3_0= ruleFbyExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getInitExpressionAccess().getSubExpressionsFbyExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_subExpressions_3_0=ruleFbyExpression();

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
                      								"de.cau.cs.kieler.kexpressions.KExpressions.FbyExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKEffects.g:3334:4: (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==42) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalKEffects.g:3335:5: otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getInitExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:3339:5: ( (lv_subExpressions_5_0= ruleFbyExpression ) )
                    	    // InternalKEffects.g:3340:6: (lv_subExpressions_5_0= ruleFbyExpression )
                    	    {
                    	    // InternalKEffects.g:3340:6: (lv_subExpressions_5_0= ruleFbyExpression )
                    	    // InternalKEffects.g:3341:7: lv_subExpressions_5_0= ruleFbyExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getInitExpressionAccess().getSubExpressionsFbyExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_36);
                    	    lv_subExpressions_5_0=ruleFbyExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getInitExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.FbyExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
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
    // $ANTLR end "ruleInitExpression"


    // $ANTLR start "entryRuleFbyExpression"
    // InternalKEffects.g:3364:1: entryRuleFbyExpression returns [EObject current=null] : iv_ruleFbyExpression= ruleFbyExpression EOF ;
    public final EObject entryRuleFbyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFbyExpression = null;


        try {
            // InternalKEffects.g:3364:54: (iv_ruleFbyExpression= ruleFbyExpression EOF )
            // InternalKEffects.g:3365:2: iv_ruleFbyExpression= ruleFbyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFbyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFbyExpression=ruleFbyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFbyExpression; 
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
    // $ANTLR end "entryRuleFbyExpression"


    // $ANTLR start "ruleFbyExpression"
    // InternalKEffects.g:3371:1: ruleFbyExpression returns [EObject current=null] : (this_SfbyExpression_0= ruleSfbyExpression ( () ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) ) (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )* )? ) ;
    public final EObject ruleFbyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SfbyExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:3377:2: ( (this_SfbyExpression_0= ruleSfbyExpression ( () ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) ) (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )* )? ) )
            // InternalKEffects.g:3378:2: (this_SfbyExpression_0= ruleSfbyExpression ( () ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) ) (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )* )? )
            {
            // InternalKEffects.g:3378:2: (this_SfbyExpression_0= ruleSfbyExpression ( () ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) ) (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )* )? )
            // InternalKEffects.g:3379:3: this_SfbyExpression_0= ruleSfbyExpression ( () ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) ) (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFbyExpressionAccess().getSfbyExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_37);
            this_SfbyExpression_0=ruleSfbyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SfbyExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:3390:3: ( () ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) ) (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==43) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalKEffects.g:3391:4: () ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) ) (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )*
                    {
                    // InternalKEffects.g:3391:4: ()
                    // InternalKEffects.g:3392:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getFbyExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKEffects.g:3401:4: ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) )
                    // InternalKEffects.g:3402:5: ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) )
                    {
                    // InternalKEffects.g:3402:5: ( (lv_operator_2_0= ruleFbyOperator ) )
                    // InternalKEffects.g:3403:6: (lv_operator_2_0= ruleFbyOperator )
                    {
                    // InternalKEffects.g:3403:6: (lv_operator_2_0= ruleFbyOperator )
                    // InternalKEffects.g:3404:7: lv_operator_2_0= ruleFbyOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFbyExpressionAccess().getOperatorFbyOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_operator_2_0=ruleFbyOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFbyExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.FbyOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKEffects.g:3421:5: ( (lv_subExpressions_3_0= ruleSfbyExpression ) )
                    // InternalKEffects.g:3422:6: (lv_subExpressions_3_0= ruleSfbyExpression )
                    {
                    // InternalKEffects.g:3422:6: (lv_subExpressions_3_0= ruleSfbyExpression )
                    // InternalKEffects.g:3423:7: lv_subExpressions_3_0= ruleSfbyExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFbyExpressionAccess().getSubExpressionsSfbyExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
                    lv_subExpressions_3_0=ruleSfbyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFbyExpressionRule());
                      							}
                      							add(
                      								current,
                      								"subExpressions",
                      								lv_subExpressions_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.SfbyExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKEffects.g:3441:4: (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==43) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalKEffects.g:3442:5: otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getFbyExpressionAccess().getFbyKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:3446:5: ( (lv_subExpressions_5_0= ruleSfbyExpression ) )
                    	    // InternalKEffects.g:3447:6: (lv_subExpressions_5_0= ruleSfbyExpression )
                    	    {
                    	    // InternalKEffects.g:3447:6: (lv_subExpressions_5_0= ruleSfbyExpression )
                    	    // InternalKEffects.g:3448:7: lv_subExpressions_5_0= ruleSfbyExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFbyExpressionAccess().getSubExpressionsSfbyExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_37);
                    	    lv_subExpressions_5_0=ruleSfbyExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFbyExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.SfbyExpression");
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
    // $ANTLR end "ruleFbyExpression"


    // $ANTLR start "entryRuleSfbyExpression"
    // InternalKEffects.g:3471:1: entryRuleSfbyExpression returns [EObject current=null] : iv_ruleSfbyExpression= ruleSfbyExpression EOF ;
    public final EObject entryRuleSfbyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSfbyExpression = null;


        try {
            // InternalKEffects.g:3471:55: (iv_ruleSfbyExpression= ruleSfbyExpression EOF )
            // InternalKEffects.g:3472:2: iv_ruleSfbyExpression= ruleSfbyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSfbyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSfbyExpression=ruleSfbyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSfbyExpression; 
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
    // $ANTLR end "entryRuleSfbyExpression"


    // $ANTLR start "ruleSfbyExpression"
    // InternalKEffects.g:3478:1: ruleSfbyExpression returns [EObject current=null] : (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) ;
    public final EObject ruleSfbyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_AtomicValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:3484:2: ( (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) )
            // InternalKEffects.g:3485:2: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            {
            // InternalKEffects.g:3485:2: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            // InternalKEffects.g:3486:3: this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSfbyExpressionAccess().getAtomicValuedExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_38);
            this_AtomicValuedExpression_0=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AtomicValuedExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKEffects.g:3497:3: ( () ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==44) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalKEffects.g:3498:4: () ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    {
                    // InternalKEffects.g:3498:4: ()
                    // InternalKEffects.g:3499:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getSfbyExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKEffects.g:3508:4: ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    // InternalKEffects.g:3509:5: ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKEffects.g:3509:5: ( (lv_operator_2_0= ruleSfbyOperator ) )
                    // InternalKEffects.g:3510:6: (lv_operator_2_0= ruleSfbyOperator )
                    {
                    // InternalKEffects.g:3510:6: (lv_operator_2_0= ruleSfbyOperator )
                    // InternalKEffects.g:3511:7: lv_operator_2_0= ruleSfbyOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSfbyExpressionAccess().getOperatorSfbyOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
                    lv_operator_2_0=ruleSfbyOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSfbyExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.SfbyOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKEffects.g:3528:5: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKEffects.g:3529:6: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKEffects.g:3529:6: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKEffects.g:3530:7: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSfbyExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSfbyExpressionRule());
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

                    // InternalKEffects.g:3548:4: (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==44) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalKEffects.g:3549:5: otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getSfbyExpressionAccess().getSfbyKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:3553:5: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    // InternalKEffects.g:3554:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalKEffects.g:3554:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    // InternalKEffects.g:3555:7: lv_subExpressions_5_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSfbyExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_38);
                    	    lv_subExpressions_5_0=ruleAtomicValuedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSfbyExpressionRule());
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
                    	    break loop69;
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
    // $ANTLR end "ruleSfbyExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKEffects.g:3578:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKEffects.g:3578:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKEffects.g:3579:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalKEffects.g:3585:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | (otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')' ) | this_ReferenceCall_4= ruleReferenceCall | this_FunctionCall_5= ruleFunctionCall | this_RandomCall_6= ruleRandomCall | this_RandomizeCall_7= ruleRandomizeCall | this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression | this_SpecialAccessExpression_9= ruleSpecialAccessExpression | this_TextExpression_10= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_BoolValue_0 = null;

        EObject this_BoolExpression_2 = null;

        EObject this_ReferenceCall_4 = null;

        EObject this_FunctionCall_5 = null;

        EObject this_RandomCall_6 = null;

        EObject this_RandomizeCall_7 = null;

        EObject this_ValuedObjectTestExpression_8 = null;

        EObject this_SpecialAccessExpression_9 = null;

        EObject this_TextExpression_10 = null;



        	enterRule();

        try {
            // InternalKEffects.g:3591:2: ( (this_BoolValue_0= ruleBoolValue | (otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')' ) | this_ReferenceCall_4= ruleReferenceCall | this_FunctionCall_5= ruleFunctionCall | this_RandomCall_6= ruleRandomCall | this_RandomizeCall_7= ruleRandomizeCall | this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression | this_SpecialAccessExpression_9= ruleSpecialAccessExpression | this_TextExpression_10= ruleTextExpression ) )
            // InternalKEffects.g:3592:2: (this_BoolValue_0= ruleBoolValue | (otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')' ) | this_ReferenceCall_4= ruleReferenceCall | this_FunctionCall_5= ruleFunctionCall | this_RandomCall_6= ruleRandomCall | this_RandomizeCall_7= ruleRandomizeCall | this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression | this_SpecialAccessExpression_9= ruleSpecialAccessExpression | this_TextExpression_10= ruleTextExpression )
            {
            // InternalKEffects.g:3592:2: (this_BoolValue_0= ruleBoolValue | (otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')' ) | this_ReferenceCall_4= ruleReferenceCall | this_FunctionCall_5= ruleFunctionCall | this_RandomCall_6= ruleRandomCall | this_RandomizeCall_7= ruleRandomizeCall | this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression | this_SpecialAccessExpression_9= ruleSpecialAccessExpression | this_TextExpression_10= ruleTextExpression )
            int alt71=9;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // InternalKEffects.g:3593:3: this_BoolValue_0= ruleBoolValue
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
                    // InternalKEffects.g:3605:3: (otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')' )
                    {
                    // InternalKEffects.g:3605:3: (otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')' )
                    // InternalKEffects.g:3606:4: otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    this_BoolExpression_2=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_BoolExpression_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEffects.g:3627:3: this_ReferenceCall_4= ruleReferenceCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getReferenceCallParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceCall_4=ruleReferenceCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReferenceCall_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKEffects.g:3639:3: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalKEffects.g:3651:3: this_RandomCall_6= ruleRandomCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getRandomCallParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RandomCall_6=ruleRandomCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RandomCall_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalKEffects.g:3663:3: this_RandomizeCall_7= ruleRandomizeCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getRandomizeCallParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RandomizeCall_7=ruleRandomizeCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RandomizeCall_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalKEffects.g:3675:3: this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedObjectTestExpression_8=ruleValuedObjectTestExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValuedObjectTestExpression_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalKEffects.g:3687:3: this_SpecialAccessExpression_9= ruleSpecialAccessExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getSpecialAccessExpressionParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SpecialAccessExpression_9=ruleSpecialAccessExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SpecialAccessExpression_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalKEffects.g:3699:3: this_TextExpression_10= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextExpression_10=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TextExpression_10;
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
    // InternalKEffects.g:3714:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalKEffects.g:3714:63: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalKEffects.g:3715:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
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
    // InternalKEffects.g:3721:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | this_NullValue_4= ruleNullValue | (otherlv_5= '(' this_ValuedExpression_6= ruleValuedExpression otherlv_7= ')' ) | this_AtomicExpression_8= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_VectorValue_3 = null;

        EObject this_NullValue_4 = null;

        EObject this_ValuedExpression_6 = null;

        EObject this_AtomicExpression_8 = null;



        	enterRule();

        try {
            // InternalKEffects.g:3727:2: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | this_NullValue_4= ruleNullValue | (otherlv_5= '(' this_ValuedExpression_6= ruleValuedExpression otherlv_7= ')' ) | this_AtomicExpression_8= ruleAtomicExpression ) )
            // InternalKEffects.g:3728:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | this_NullValue_4= ruleNullValue | (otherlv_5= '(' this_ValuedExpression_6= ruleValuedExpression otherlv_7= ')' ) | this_AtomicExpression_8= ruleAtomicExpression )
            {
            // InternalKEffects.g:3728:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | this_NullValue_4= ruleNullValue | (otherlv_5= '(' this_ValuedExpression_6= ruleValuedExpression otherlv_7= ')' ) | this_AtomicExpression_8= ruleAtomicExpression )
            int alt72=7;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalKEffects.g:3729:3: this_IntValue_0= ruleIntValue
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
                    // InternalKEffects.g:3741:3: this_FloatValue_1= ruleFloatValue
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
                    // InternalKEffects.g:3753:3: this_StringValue_2= ruleStringValue
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
                    // InternalKEffects.g:3765:3: this_VectorValue_3= ruleVectorValue
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
                    // InternalKEffects.g:3777:3: this_NullValue_4= ruleNullValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getNullValueParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NullValue_4=ruleNullValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullValue_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalKEffects.g:3789:3: (otherlv_5= '(' this_ValuedExpression_6= ruleValuedExpression otherlv_7= ')' )
                    {
                    // InternalKEffects.g:3789:3: (otherlv_5= '(' this_ValuedExpression_6= ruleValuedExpression otherlv_7= ')' )
                    // InternalKEffects.g:3790:4: otherlv_5= '(' this_ValuedExpression_6= ruleValuedExpression otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    this_ValuedExpression_6=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ValuedExpression_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_5_2());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKEffects.g:3811:3: this_AtomicExpression_8= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicExpression_8=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AtomicExpression_8;
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
    // InternalKEffects.g:3826:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalKEffects.g:3826:67: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalKEffects.g:3827:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
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
    // InternalKEffects.g:3833:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference ) ;
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
            // InternalKEffects.g:3839:2: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference ) )
            // InternalKEffects.g:3840:2: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference )
            {
            // InternalKEffects.g:3840:2: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==77||LA75_0==80) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_ID) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalKEffects.g:3841:3: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' )
                    {
                    // InternalKEffects.g:3841:3: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' )
                    // InternalKEffects.g:3842:4: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')'
                    {
                    // InternalKEffects.g:3842:4: ()
                    // InternalKEffects.g:3843:5: 
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

                    // InternalKEffects.g:3852:4: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalKEffects.g:3853:5: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalKEffects.g:3853:5: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalKEffects.g:3854:6: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalKEffects.g:3854:6: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==77) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==80) ) {
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
                            // InternalKEffects.g:3855:7: lv_operator_1_1= rulePreOperator
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
                            // InternalKEffects.g:3871:7: lv_operator_1_2= ruleValOperator
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

                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                      			
                    }
                    // InternalKEffects.g:3893:4: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalKEffects.g:3894:5: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalKEffects.g:3894:5: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalKEffects.g:3895:6: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
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

                    // InternalKEffects.g:3912:4: (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==23) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalKEffects.g:3913:5: otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) )
                            {
                            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getCommaKeyword_0_4_0());
                              				
                            }
                            // InternalKEffects.g:3917:5: ( (lv_subExpressions_5_0= ruleValuedObjectReference ) )
                            // InternalKEffects.g:3918:6: (lv_subExpressions_5_0= ruleValuedObjectReference )
                            {
                            // InternalKEffects.g:3918:6: (lv_subExpressions_5_0= ruleValuedObjectReference )
                            // InternalKEffects.g:3919:7: lv_subExpressions_5_0= ruleValuedObjectReference
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
                    // InternalKEffects.g:3943:3: this_ValuedObjectReference_7= ruleValuedObjectReference
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


    // $ANTLR start "entryRuleSpecialAccessExpression"
    // InternalKEffects.g:3958:1: entryRuleSpecialAccessExpression returns [EObject current=null] : iv_ruleSpecialAccessExpression= ruleSpecialAccessExpression EOF ;
    public final EObject entryRuleSpecialAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialAccessExpression = null;


        try {
            // InternalKEffects.g:3958:64: (iv_ruleSpecialAccessExpression= ruleSpecialAccessExpression EOF )
            // InternalKEffects.g:3959:2: iv_ruleSpecialAccessExpression= ruleSpecialAccessExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecialAccessExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSpecialAccessExpression=ruleSpecialAccessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecialAccessExpression; 
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
    // $ANTLR end "entryRuleSpecialAccessExpression"


    // $ANTLR start "ruleSpecialAccessExpression"
    // InternalKEffects.g:3965:1: ruleSpecialAccessExpression returns [EObject current=null] : ( ( (lv_access_0_0= 'static' ) ) otherlv_1= '(' ( ( ( rulePrimeID ) ) otherlv_3= '.' )? ( ( rulePrimeID ) ) otherlv_5= ')' otherlv_6= '.' ( (lv_subReference_7_0= ruleValuedObjectReference ) ) ) ;
    public final EObject ruleSpecialAccessExpression() throws RecognitionException {
        EObject current = null;

        Token lv_access_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_subReference_7_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:3971:2: ( ( ( (lv_access_0_0= 'static' ) ) otherlv_1= '(' ( ( ( rulePrimeID ) ) otherlv_3= '.' )? ( ( rulePrimeID ) ) otherlv_5= ')' otherlv_6= '.' ( (lv_subReference_7_0= ruleValuedObjectReference ) ) ) )
            // InternalKEffects.g:3972:2: ( ( (lv_access_0_0= 'static' ) ) otherlv_1= '(' ( ( ( rulePrimeID ) ) otherlv_3= '.' )? ( ( rulePrimeID ) ) otherlv_5= ')' otherlv_6= '.' ( (lv_subReference_7_0= ruleValuedObjectReference ) ) )
            {
            // InternalKEffects.g:3972:2: ( ( (lv_access_0_0= 'static' ) ) otherlv_1= '(' ( ( ( rulePrimeID ) ) otherlv_3= '.' )? ( ( rulePrimeID ) ) otherlv_5= ')' otherlv_6= '.' ( (lv_subReference_7_0= ruleValuedObjectReference ) ) )
            // InternalKEffects.g:3973:3: ( (lv_access_0_0= 'static' ) ) otherlv_1= '(' ( ( ( rulePrimeID ) ) otherlv_3= '.' )? ( ( rulePrimeID ) ) otherlv_5= ')' otherlv_6= '.' ( (lv_subReference_7_0= ruleValuedObjectReference ) )
            {
            // InternalKEffects.g:3973:3: ( (lv_access_0_0= 'static' ) )
            // InternalKEffects.g:3974:4: (lv_access_0_0= 'static' )
            {
            // InternalKEffects.g:3974:4: (lv_access_0_0= 'static' )
            // InternalKEffects.g:3975:5: lv_access_0_0= 'static'
            {
            lv_access_0_0=(Token)match(input,45,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_access_0_0, grammarAccess.getSpecialAccessExpressionAccess().getAccessStaticKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSpecialAccessExpressionRule());
              					}
              					setWithLastConsumed(current, "access", lv_access_0_0, "static");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSpecialAccessExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalKEffects.g:3991:3: ( ( ( rulePrimeID ) ) otherlv_3= '.' )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalKEffects.g:3992:4: ( ( rulePrimeID ) ) otherlv_3= '.'
                    {
                    // InternalKEffects.g:3992:4: ( ( rulePrimeID ) )
                    // InternalKEffects.g:3993:5: ( rulePrimeID )
                    {
                    // InternalKEffects.g:3993:5: ( rulePrimeID )
                    // InternalKEffects.g:3994:6: rulePrimeID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSpecialAccessExpressionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSpecialAccessExpressionAccess().getContainerNamedObjectCrossReference_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
                    rulePrimeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSpecialAccessExpressionAccess().getFullStopKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalKEffects.g:4016:3: ( ( rulePrimeID ) )
            // InternalKEffects.g:4017:4: ( rulePrimeID )
            {
            // InternalKEffects.g:4017:4: ( rulePrimeID )
            // InternalKEffects.g:4018:5: rulePrimeID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSpecialAccessExpressionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialAccessExpressionAccess().getTargetNamedObjectCrossReference_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_9);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSpecialAccessExpressionAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSpecialAccessExpressionAccess().getFullStopKeyword_5());
              		
            }
            // InternalKEffects.g:4043:3: ( (lv_subReference_7_0= ruleValuedObjectReference ) )
            // InternalKEffects.g:4044:4: (lv_subReference_7_0= ruleValuedObjectReference )
            {
            // InternalKEffects.g:4044:4: (lv_subReference_7_0= ruleValuedObjectReference )
            // InternalKEffects.g:4045:5: lv_subReference_7_0= ruleValuedObjectReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialAccessExpressionAccess().getSubReferenceValuedObjectReferenceParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_subReference_7_0=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSpecialAccessExpressionRule());
              					}
              					set(
              						current,
              						"subReference",
              						lv_subReference_7_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
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
    // $ANTLR end "ruleSpecialAccessExpression"


    // $ANTLR start "entryRulePrimeID"
    // InternalKEffects.g:4066:1: entryRulePrimeID returns [String current=null] : iv_rulePrimeID= rulePrimeID EOF ;
    public final String entryRulePrimeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimeID = null;


        try {
            // InternalKEffects.g:4066:47: (iv_rulePrimeID= rulePrimeID EOF )
            // InternalKEffects.g:4067:2: iv_rulePrimeID= rulePrimeID EOF
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
    // InternalKEffects.g:4073:1: rulePrimeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '\\'' )* ) ;
    public final AntlrDatatypeRuleToken rulePrimeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalKEffects.g:4079:2: ( (this_ID_0= RULE_ID (kw= '\\'' )* ) )
            // InternalKEffects.g:4080:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            {
            // InternalKEffects.g:4080:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            // InternalKEffects.g:4081:3: this_ID_0= RULE_ID (kw= '\\'' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getPrimeIDAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalKEffects.g:4088:3: (kw= '\\'' )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==46) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalKEffects.g:4089:4: kw= '\\''
            	    {
            	    kw=(Token)match(input,46,FollowSets000.FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getPrimeIDAccess().getApostropheKeyword_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop77;
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
    // InternalKEffects.g:4099:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalKEffects.g:4099:62: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalKEffects.g:4100:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
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
    // InternalKEffects.g:4106:1: ruleValuedObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_indices_2_0 = null;

        EObject lv_subReference_5_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4112:2: ( ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) )
            // InternalKEffects.g:4113:2: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            {
            // InternalKEffects.g:4113:2: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            // InternalKEffects.g:4114:3: ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            {
            // InternalKEffects.g:4114:3: ( ( rulePrimeID ) )
            // InternalKEffects.g:4115:4: ( rulePrimeID )
            {
            // InternalKEffects.g:4115:4: ( rulePrimeID )
            // InternalKEffects.g:4116:5: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_42);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKEffects.g:4133:3: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==20) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalKEffects.g:4134:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	      			
            	    }
            	    // InternalKEffects.g:4138:4: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalKEffects.g:4139:5: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalKEffects.g:4139:5: (lv_indices_2_0= ruleExpression )
            	    // InternalKEffects.g:4140:6: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
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

            	    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            // InternalKEffects.g:4162:3: (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==22) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalKEffects.g:4163:4: otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_2_0());
                      			
                    }
                    // InternalKEffects.g:4167:4: ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    // InternalKEffects.g:4168:5: (lv_subReference_5_0= ruleValuedObjectReference )
                    {
                    // InternalKEffects.g:4168:5: (lv_subReference_5_0= ruleValuedObjectReference )
                    // InternalKEffects.g:4169:6: lv_subReference_5_0= ruleValuedObjectReference
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
    // InternalKEffects.g:4191:1: entryRuleScheduleObjectReference returns [EObject current=null] : iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF ;
    public final EObject entryRuleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleObjectReference = null;


        try {
            // InternalKEffects.g:4191:64: (iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF )
            // InternalKEffects.g:4192:2: iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF
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
    // InternalKEffects.g:4198:1: ruleScheduleObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) ;
    public final EObject ruleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        Token lv_priority_1_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:4204:2: ( ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) )
            // InternalKEffects.g:4205:2: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            {
            // InternalKEffects.g:4205:2: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            // InternalKEffects.g:4206:3: ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) )
            {
            // InternalKEffects.g:4206:3: ( ( rulePrimeID ) )
            // InternalKEffects.g:4207:4: ( rulePrimeID )
            {
            // InternalKEffects.g:4207:4: ( rulePrimeID )
            // InternalKEffects.g:4208:5: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_43);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKEffects.g:4225:3: ( (lv_priority_1_0= RULE_INT ) )
            // InternalKEffects.g:4226:4: (lv_priority_1_0= RULE_INT )
            {
            // InternalKEffects.g:4226:4: (lv_priority_1_0= RULE_INT )
            // InternalKEffects.g:4227:5: lv_priority_1_0= RULE_INT
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
    // InternalKEffects.g:4247:1: entryRuleReferenceCall returns [EObject current=null] : iv_ruleReferenceCall= ruleReferenceCall EOF ;
    public final EObject entryRuleReferenceCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCall = null;


        try {
            // InternalKEffects.g:4247:54: (iv_ruleReferenceCall= ruleReferenceCall EOF )
            // InternalKEffects.g:4248:2: iv_ruleReferenceCall= ruleReferenceCall EOF
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
    // InternalKEffects.g:4254:1: ruleReferenceCall returns [EObject current=null] : ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ( (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' ) | otherlv_11= '()' ) ) ;
    public final EObject ruleReferenceCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_indices_2_0 = null;

        EObject lv_subReference_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4260:2: ( ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ( (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' ) | otherlv_11= '()' ) ) )
            // InternalKEffects.g:4261:2: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ( (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' ) | otherlv_11= '()' ) )
            {
            // InternalKEffects.g:4261:2: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ( (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' ) | otherlv_11= '()' ) )
            // InternalKEffects.g:4262:3: ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ( (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' ) | otherlv_11= '()' )
            {
            // InternalKEffects.g:4262:3: ( ( rulePrimeID ) )
            // InternalKEffects.g:4263:4: ( rulePrimeID )
            {
            // InternalKEffects.g:4263:4: ( rulePrimeID )
            // InternalKEffects.g:4264:5: rulePrimeID
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

            // InternalKEffects.g:4281:3: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==20) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalKEffects.g:4282:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getReferenceCallAccess().getLeftSquareBracketKeyword_1_0());
            	      			
            	    }
            	    // InternalKEffects.g:4286:4: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalKEffects.g:4287:5: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalKEffects.g:4287:5: (lv_indices_2_0= ruleExpression )
            	    // InternalKEffects.g:4288:6: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getReferenceCallAccess().getIndicesExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_indices_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getReferenceCallRule());
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

            	    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getReferenceCallAccess().getRightSquareBracketKeyword_1_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            // InternalKEffects.g:4310:3: (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==22) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalKEffects.g:4311:4: otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getReferenceCallAccess().getFullStopKeyword_2_0());
                      			
                    }
                    // InternalKEffects.g:4315:4: ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    // InternalKEffects.g:4316:5: (lv_subReference_5_0= ruleValuedObjectReference )
                    {
                    // InternalKEffects.g:4316:5: (lv_subReference_5_0= ruleValuedObjectReference )
                    // InternalKEffects.g:4317:6: lv_subReference_5_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReferenceCallAccess().getSubReferenceValuedObjectReferenceParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_subReference_5_0=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReferenceCallRule());
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

            // InternalKEffects.g:4335:3: ( (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' ) | otherlv_11= '()' )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==18) ) {
                alt83=1;
            }
            else if ( (LA83_0==24) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalKEffects.g:4336:4: (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' )
                    {
                    // InternalKEffects.g:4336:4: (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' )
                    // InternalKEffects.g:4337:5: otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getReferenceCallAccess().getLeftParenthesisKeyword_3_0_0());
                      				
                    }
                    // InternalKEffects.g:4341:5: ( (lv_parameters_7_0= ruleParameter ) )
                    // InternalKEffects.g:4342:6: (lv_parameters_7_0= ruleParameter )
                    {
                    // InternalKEffects.g:4342:6: (lv_parameters_7_0= ruleParameter )
                    // InternalKEffects.g:4343:7: lv_parameters_7_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_3_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
                    lv_parameters_7_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getReferenceCallRule());
                      							}
                      							add(
                      								current,
                      								"parameters",
                      								lv_parameters_7_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKEffects.g:4360:5: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==23) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalKEffects.g:4361:6: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_8, grammarAccess.getReferenceCallAccess().getCommaKeyword_3_0_2_0());
                    	      					
                    	    }
                    	    // InternalKEffects.g:4365:6: ( (lv_parameters_9_0= ruleParameter ) )
                    	    // InternalKEffects.g:4366:7: (lv_parameters_9_0= ruleParameter )
                    	    {
                    	    // InternalKEffects.g:4366:7: (lv_parameters_9_0= ruleParameter )
                    	    // InternalKEffects.g:4367:8: lv_parameters_9_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_3_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_17);
                    	    lv_parameters_9_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getReferenceCallRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"parameters",
                    	      									lv_parameters_9_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
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

                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getReferenceCallAccess().getRightParenthesisKeyword_3_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:4391:4: otherlv_11= '()'
                    {
                    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getReferenceCallAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
                      			
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
    // InternalKEffects.g:4400:1: entryRuleRandomCall returns [EObject current=null] : iv_ruleRandomCall= ruleRandomCall EOF ;
    public final EObject entryRuleRandomCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomCall = null;


        try {
            // InternalKEffects.g:4400:51: (iv_ruleRandomCall= ruleRandomCall EOF )
            // InternalKEffects.g:4401:2: iv_ruleRandomCall= ruleRandomCall EOF
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
    // InternalKEffects.g:4407:1: ruleRandomCall returns [EObject current=null] : ( () otherlv_1= 'random' (otherlv_2= '()' )? ) ;
    public final EObject ruleRandomCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKEffects.g:4413:2: ( ( () otherlv_1= 'random' (otherlv_2= '()' )? ) )
            // InternalKEffects.g:4414:2: ( () otherlv_1= 'random' (otherlv_2= '()' )? )
            {
            // InternalKEffects.g:4414:2: ( () otherlv_1= 'random' (otherlv_2= '()' )? )
            // InternalKEffects.g:4415:3: () otherlv_1= 'random' (otherlv_2= '()' )?
            {
            // InternalKEffects.g:4415:3: ()
            // InternalKEffects.g:4416:4: 
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

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRandomCallAccess().getRandomKeyword_1());
              		
            }
            // InternalKEffects.g:4429:3: (otherlv_2= '()' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==24) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalKEffects.g:4430:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:4439:1: entryRuleRandomizeCall returns [EObject current=null] : iv_ruleRandomizeCall= ruleRandomizeCall EOF ;
    public final EObject entryRuleRandomizeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomizeCall = null;


        try {
            // InternalKEffects.g:4439:54: (iv_ruleRandomizeCall= ruleRandomizeCall EOF )
            // InternalKEffects.g:4440:2: iv_ruleRandomizeCall= ruleRandomizeCall EOF
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
    // InternalKEffects.g:4446:1: ruleRandomizeCall returns [EObject current=null] : ( () otherlv_1= 'randomize' (otherlv_2= '()' )? ) ;
    public final EObject ruleRandomizeCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKEffects.g:4452:2: ( ( () otherlv_1= 'randomize' (otherlv_2= '()' )? ) )
            // InternalKEffects.g:4453:2: ( () otherlv_1= 'randomize' (otherlv_2= '()' )? )
            {
            // InternalKEffects.g:4453:2: ( () otherlv_1= 'randomize' (otherlv_2= '()' )? )
            // InternalKEffects.g:4454:3: () otherlv_1= 'randomize' (otherlv_2= '()' )?
            {
            // InternalKEffects.g:4454:3: ()
            // InternalKEffects.g:4455:4: 
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

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRandomizeCallAccess().getRandomizeKeyword_1());
              		
            }
            // InternalKEffects.g:4468:3: (otherlv_2= '()' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==24) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalKEffects.g:4469:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:4478:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKEffects.g:4478:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKEffects.g:4479:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalKEffects.g:4485:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) ;
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
            // InternalKEffects.g:4491:2: ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) )
            // InternalKEffects.g:4492:2: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            {
            // InternalKEffects.g:4492:2: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            // InternalKEffects.g:4493:3: otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getExternKeyword_0());
              		
            }
            // InternalKEffects.g:4497:3: ( (lv_functionName_1_0= RULE_ID ) )
            // InternalKEffects.g:4498:4: (lv_functionName_1_0= RULE_ID )
            {
            // InternalKEffects.g:4498:4: (lv_functionName_1_0= RULE_ID )
            // InternalKEffects.g:4499:5: lv_functionName_1_0= RULE_ID
            {
            lv_functionName_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
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

            // InternalKEffects.g:4515:3: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==18) ) {
                alt87=1;
            }
            else if ( (LA87_0==24) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalKEffects.g:4516:4: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalKEffects.g:4516:4: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalKEffects.g:4517:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                      				
                    }
                    // InternalKEffects.g:4521:5: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalKEffects.g:4522:6: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalKEffects.g:4522:6: (lv_parameters_3_0= ruleParameter )
                    // InternalKEffects.g:4523:7: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
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

                    // InternalKEffects.g:4540:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==23) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalKEffects.g:4541:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	      					
                    	    }
                    	    // InternalKEffects.g:4545:6: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalKEffects.g:4546:7: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalKEffects.g:4546:7: (lv_parameters_5_0= ruleParameter )
                    	    // InternalKEffects.g:4547:8: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_17);
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
                    	    break loop86;
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
                    // InternalKEffects.g:4571:4: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:4580:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalKEffects.g:4580:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalKEffects.g:4581:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalKEffects.g:4587:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_accessType_0_0= ruleParameterAccessType ) ) ( (lv_expression_1_0= ruleValuedObjectReference ) ) ) | ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Enumerator lv_accessType_0_0 = null;

        EObject lv_expression_1_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4593:2: ( ( ( ( (lv_accessType_0_0= ruleParameterAccessType ) ) ( (lv_expression_1_0= ruleValuedObjectReference ) ) ) | ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKEffects.g:4594:2: ( ( ( (lv_accessType_0_0= ruleParameterAccessType ) ) ( (lv_expression_1_0= ruleValuedObjectReference ) ) ) | ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKEffects.g:4594:2: ( ( ( (lv_accessType_0_0= ruleParameterAccessType ) ) ( (lv_expression_1_0= ruleValuedObjectReference ) ) ) | ( (lv_expression_2_0= ruleExpression ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==32||LA88_0==82) ) {
                alt88=1;
            }
            else if ( ((LA88_0>=RULE_HOSTCODE && LA88_0<=RULE_COMMENT_ANNOTATION)||LA88_0==18||LA88_0==25||LA88_0==27||LA88_0==37||LA88_0==45||(LA88_0>=47 && LA88_0<=48)||LA88_0==52||LA88_0==54||(LA88_0>=77 && LA88_0<=80)) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalKEffects.g:4595:3: ( ( (lv_accessType_0_0= ruleParameterAccessType ) ) ( (lv_expression_1_0= ruleValuedObjectReference ) ) )
                    {
                    // InternalKEffects.g:4595:3: ( ( (lv_accessType_0_0= ruleParameterAccessType ) ) ( (lv_expression_1_0= ruleValuedObjectReference ) ) )
                    // InternalKEffects.g:4596:4: ( (lv_accessType_0_0= ruleParameterAccessType ) ) ( (lv_expression_1_0= ruleValuedObjectReference ) )
                    {
                    // InternalKEffects.g:4596:4: ( (lv_accessType_0_0= ruleParameterAccessType ) )
                    // InternalKEffects.g:4597:5: (lv_accessType_0_0= ruleParameterAccessType )
                    {
                    // InternalKEffects.g:4597:5: (lv_accessType_0_0= ruleParameterAccessType )
                    // InternalKEffects.g:4598:6: lv_accessType_0_0= ruleParameterAccessType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterAccess().getAccessTypeParameterAccessTypeEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_accessType_0_0=ruleParameterAccessType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterRule());
                      						}
                      						set(
                      							current,
                      							"accessType",
                      							lv_accessType_0_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.ParameterAccessType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKEffects.g:4615:4: ( (lv_expression_1_0= ruleValuedObjectReference ) )
                    // InternalKEffects.g:4616:5: (lv_expression_1_0= ruleValuedObjectReference )
                    {
                    // InternalKEffects.g:4616:5: (lv_expression_1_0= ruleValuedObjectReference )
                    // InternalKEffects.g:4617:6: lv_expression_1_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterAccess().getExpressionValuedObjectReferenceParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expression_1_0=ruleValuedObjectReference();

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
                      							"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:4636:3: ( (lv_expression_2_0= ruleExpression ) )
                    {
                    // InternalKEffects.g:4636:3: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalKEffects.g:4637:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalKEffects.g:4637:4: (lv_expression_2_0= ruleExpression )
                    // InternalKEffects.g:4638:5: lv_expression_2_0= ruleExpression
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTextExpression"
    // InternalKEffects.g:4659:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalKEffects.g:4659:55: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalKEffects.g:4660:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalKEffects.g:4666:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4672:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalKEffects.g:4673:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalKEffects.g:4673:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalKEffects.g:4674:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalKEffects.g:4674:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==RULE_COMMENT_ANNOTATION||LA89_0==54) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalKEffects.g:4675:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEffects.g:4675:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEffects.g:4676:5: lv_annotations_0_0= ruleAnnotation
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
            	    break loop89;
                }
            } while (true);

            // InternalKEffects.g:4693:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalKEffects.g:4694:4: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalKEffects.g:4694:4: (lv_text_1_0= RULE_HOSTCODE )
            // InternalKEffects.g:4695:5: lv_text_1_0= RULE_HOSTCODE
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
    // InternalKEffects.g:4715:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalKEffects.g:4715:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalKEffects.g:4716:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalKEffects.g:4722:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:4728:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalKEffects.g:4729:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalKEffects.g:4729:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalKEffects.g:4730:3: (lv_value_0_0= RULE_INT )
            {
            // InternalKEffects.g:4730:3: (lv_value_0_0= RULE_INT )
            // InternalKEffects.g:4731:4: lv_value_0_0= RULE_INT
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
    // InternalKEffects.g:4750:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalKEffects.g:4750:51: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalKEffects.g:4751:2: iv_ruleFloatValue= ruleFloatValue EOF
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
    // InternalKEffects.g:4757:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:4763:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalKEffects.g:4764:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalKEffects.g:4764:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalKEffects.g:4765:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalKEffects.g:4765:3: (lv_value_0_0= RULE_FLOAT )
            // InternalKEffects.g:4766:4: lv_value_0_0= RULE_FLOAT
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
    // InternalKEffects.g:4785:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalKEffects.g:4785:50: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalKEffects.g:4786:2: iv_ruleBoolValue= ruleBoolValue EOF
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
    // InternalKEffects.g:4792:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:4798:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalKEffects.g:4799:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalKEffects.g:4799:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalKEffects.g:4800:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalKEffects.g:4800:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalKEffects.g:4801:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalKEffects.g:4820:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalKEffects.g:4820:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalKEffects.g:4821:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalKEffects.g:4827:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:4833:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalKEffects.g:4834:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalKEffects.g:4834:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalKEffects.g:4835:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalKEffects.g:4835:3: (lv_value_0_0= RULE_STRING )
            // InternalKEffects.g:4836:4: lv_value_0_0= RULE_STRING
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
    // InternalKEffects.g:4855:1: entryRuleVectorValue returns [EObject current=null] : iv_ruleVectorValue= ruleVectorValue EOF ;
    public final EObject entryRuleVectorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValue = null;


        try {
            // InternalKEffects.g:4855:52: (iv_ruleVectorValue= ruleVectorValue EOF )
            // InternalKEffects.g:4856:2: iv_ruleVectorValue= ruleVectorValue EOF
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
    // InternalKEffects.g:4862:1: ruleVectorValue returns [EObject current=null] : (otherlv_0= '{' ( ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* ) | ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) ) ) otherlv_7= '}' ) ;
    public final EObject ruleVectorValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_range_5_0=null;
        Token otherlv_7=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;

        EObject lv_values_4_0 = null;

        EObject lv_values_6_1 = null;

        EObject lv_values_6_2 = null;



        	enterRule();

        try {
            // InternalKEffects.g:4868:2: ( (otherlv_0= '{' ( ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* ) | ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) ) ) otherlv_7= '}' ) )
            // InternalKEffects.g:4869:2: (otherlv_0= '{' ( ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* ) | ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) ) ) otherlv_7= '}' )
            {
            // InternalKEffects.g:4869:2: (otherlv_0= '{' ( ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* ) | ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) ) ) otherlv_7= '}' )
            // InternalKEffects.g:4870:3: otherlv_0= '{' ( ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* ) | ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVectorValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalKEffects.g:4874:3: ( ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* ) | ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) ) )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=RULE_HOSTCODE && LA92_0<=RULE_ID)||(LA92_0>=RULE_FLOAT && LA92_0<=RULE_COMMENT_ANNOTATION)||LA92_0==18||LA92_0==25||LA92_0==27||LA92_0==37||LA92_0==45||(LA92_0>=47 && LA92_0<=48)||(LA92_0>=51 && LA92_0<=52)||LA92_0==54||(LA92_0>=77 && LA92_0<=80)) ) {
                alt92=1;
            }
            else if ( (LA92_0==RULE_INT) ) {
                int LA92_2 = input.LA(2);

                if ( (LA92_2==49) ) {
                    alt92=2;
                }
                else if ( (LA92_2==23||(LA92_2>=28 && LA92_2<=40)||(LA92_2>=42 && LA92_2<=44)||LA92_2==50||(LA92_2>=71 && LA92_2<=76)||LA92_2==81) ) {
                    alt92=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalKEffects.g:4875:4: ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* )
                    {
                    // InternalKEffects.g:4875:4: ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* )
                    // InternalKEffects.g:4876:5: ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )*
                    {
                    // InternalKEffects.g:4876:5: ( (lv_values_1_0= ruleVectorValueMember ) )
                    // InternalKEffects.g:4877:6: (lv_values_1_0= ruleVectorValueMember )
                    {
                    // InternalKEffects.g:4877:6: (lv_values_1_0= ruleVectorValueMember )
                    // InternalKEffects.g:4878:7: lv_values_1_0= ruleVectorValueMember
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_1_0_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
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

                    // InternalKEffects.g:4895:5: (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==23) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalKEffects.g:4896:6: otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) )
                    	    {
                    	    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_2, grammarAccess.getVectorValueAccess().getCommaKeyword_1_0_1_0());
                    	      					
                    	    }
                    	    // InternalKEffects.g:4900:6: ( (lv_values_3_0= ruleVectorValueMember ) )
                    	    // InternalKEffects.g:4901:7: (lv_values_3_0= ruleVectorValueMember )
                    	    {
                    	    // InternalKEffects.g:4901:7: (lv_values_3_0= ruleVectorValueMember )
                    	    // InternalKEffects.g:4902:8: lv_values_3_0= ruleVectorValueMember
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_1_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_46);
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
                    	    break loop90;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:4922:4: ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) )
                    {
                    // InternalKEffects.g:4922:4: ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) )
                    // InternalKEffects.g:4923:5: ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) )
                    {
                    // InternalKEffects.g:4923:5: ( (lv_values_4_0= ruleIntValue ) )
                    // InternalKEffects.g:4924:6: (lv_values_4_0= ruleIntValue )
                    {
                    // InternalKEffects.g:4924:6: (lv_values_4_0= ruleIntValue )
                    // InternalKEffects.g:4925:7: lv_values_4_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getVectorValueAccess().getValuesIntValueParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
                    lv_values_4_0=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getVectorValueRule());
                      							}
                      							add(
                      								current,
                      								"values",
                      								lv_values_4_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.IntValue");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKEffects.g:4942:5: ( (lv_range_5_0= 'to' ) )
                    // InternalKEffects.g:4943:6: (lv_range_5_0= 'to' )
                    {
                    // InternalKEffects.g:4943:6: (lv_range_5_0= 'to' )
                    // InternalKEffects.g:4944:7: lv_range_5_0= 'to'
                    {
                    lv_range_5_0=(Token)match(input,49,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_range_5_0, grammarAccess.getVectorValueAccess().getRangeToKeyword_1_1_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getVectorValueRule());
                      							}
                      							setWithLastConsumed(current, "range", lv_range_5_0 != null, "to");
                      						
                    }

                    }


                    }

                    // InternalKEffects.g:4956:5: ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) )
                    // InternalKEffects.g:4957:6: ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) )
                    {
                    // InternalKEffects.g:4957:6: ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) )
                    // InternalKEffects.g:4958:7: (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference )
                    {
                    // InternalKEffects.g:4958:7: (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference )
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==RULE_INT) ) {
                        alt91=1;
                    }
                    else if ( (LA91_0==RULE_ID) ) {
                        alt91=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        throw nvae;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalKEffects.g:4959:8: lv_values_6_1= ruleIntValue
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getVectorValueAccess().getValuesIntValueParserRuleCall_1_1_2_0_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_49);
                            lv_values_6_1=ruleIntValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getVectorValueRule());
                              								}
                              								add(
                              									current,
                              									"values",
                              									lv_values_6_1,
                              									"de.cau.cs.kieler.kexpressions.KExpressions.IntValue");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalKEffects.g:4975:8: lv_values_6_2= ruleValuedObjectReference
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getVectorValueAccess().getValuesValuedObjectReferenceParserRuleCall_1_1_2_0_1());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_49);
                            lv_values_6_2=ruleValuedObjectReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getVectorValueRule());
                              								}
                              								add(
                              									current,
                              									"values",
                              									lv_values_6_2,
                              									"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getVectorValueAccess().getRightCurlyBracketKeyword_2());
              		
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
    // InternalKEffects.g:5003:1: entryRuleVectorValueMember returns [EObject current=null] : iv_ruleVectorValueMember= ruleVectorValueMember EOF ;
    public final EObject entryRuleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValueMember = null;


        try {
            // InternalKEffects.g:5003:58: (iv_ruleVectorValueMember= ruleVectorValueMember EOF )
            // InternalKEffects.g:5004:2: iv_ruleVectorValueMember= ruleVectorValueMember EOF
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
    // InternalKEffects.g:5010:1: ruleVectorValueMember returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) ;
    public final EObject ruleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;

        EObject this_IgnoreValue_2 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5016:2: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) )
            // InternalKEffects.g:5017:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            {
            // InternalKEffects.g:5017:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            int alt93=3;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // InternalKEffects.g:5018:3: this_BoolExpression_0= ruleBoolExpression
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
                    // InternalKEffects.g:5030:3: this_ValuedExpression_1= ruleValuedExpression
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
                    // InternalKEffects.g:5042:3: this_IgnoreValue_2= ruleIgnoreValue
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
    // InternalKEffects.g:5057:1: entryRuleIgnoreValue returns [EObject current=null] : iv_ruleIgnoreValue= ruleIgnoreValue EOF ;
    public final EObject entryRuleIgnoreValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnoreValue = null;


        try {
            // InternalKEffects.g:5057:52: (iv_ruleIgnoreValue= ruleIgnoreValue EOF )
            // InternalKEffects.g:5058:2: iv_ruleIgnoreValue= ruleIgnoreValue EOF
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
    // InternalKEffects.g:5064:1: ruleIgnoreValue returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject ruleIgnoreValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKEffects.g:5070:2: ( ( () otherlv_1= '_' ) )
            // InternalKEffects.g:5071:2: ( () otherlv_1= '_' )
            {
            // InternalKEffects.g:5071:2: ( () otherlv_1= '_' )
            // InternalKEffects.g:5072:3: () otherlv_1= '_'
            {
            // InternalKEffects.g:5072:3: ()
            // InternalKEffects.g:5073:4: 
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

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:5090:1: entryRuleAnyValue returns [EObject current=null] : iv_ruleAnyValue= ruleAnyValue EOF ;
    public final EObject entryRuleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyValue = null;


        try {
            // InternalKEffects.g:5090:49: (iv_ruleAnyValue= ruleAnyValue EOF )
            // InternalKEffects.g:5091:2: iv_ruleAnyValue= ruleAnyValue EOF
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
    // InternalKEffects.g:5097:1: ruleAnyValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) ;
    public final EObject ruleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_BoolValue_2 = null;

        EObject this_StringValue_3 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5103:2: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) )
            // InternalKEffects.g:5104:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            {
            // InternalKEffects.g:5104:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            int alt94=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt94=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt94=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt94=3;
                }
                break;
            case RULE_STRING:
                {
                alt94=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalKEffects.g:5105:3: this_IntValue_0= ruleIntValue
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
                    // InternalKEffects.g:5117:3: this_FloatValue_1= ruleFloatValue
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
                    // InternalKEffects.g:5129:3: this_BoolValue_2= ruleBoolValue
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
                    // InternalKEffects.g:5141:3: this_StringValue_3= ruleStringValue
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
    // InternalKEffects.g:5156:1: entryRuleJsonObjectValue returns [EObject current=null] : iv_ruleJsonObjectValue= ruleJsonObjectValue EOF ;
    public final EObject entryRuleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectValue = null;


        try {
            // InternalKEffects.g:5156:56: (iv_ruleJsonObjectValue= ruleJsonObjectValue EOF )
            // InternalKEffects.g:5157:2: iv_ruleJsonObjectValue= ruleJsonObjectValue EOF
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
    // InternalKEffects.g:5163:1: ruleJsonObjectValue returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5169:2: ( ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' ) )
            // InternalKEffects.g:5170:2: ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' )
            {
            // InternalKEffects.g:5170:2: ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' )
            // InternalKEffects.g:5171:3: () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}'
            {
            // InternalKEffects.g:5171:3: ()
            // InternalKEffects.g:5172:4: 
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

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonObjectValueAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalKEffects.g:5185:3: ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_STRING) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalKEffects.g:5186:4: ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )*
                    {
                    // InternalKEffects.g:5186:4: ( (lv_members_2_0= ruleJsonObjectMember ) )
                    // InternalKEffects.g:5187:5: (lv_members_2_0= ruleJsonObjectMember )
                    {
                    // InternalKEffects.g:5187:5: (lv_members_2_0= ruleJsonObjectMember )
                    // InternalKEffects.g:5188:6: lv_members_2_0= ruleJsonObjectMember
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJsonObjectValueAccess().getMembersJsonObjectMemberParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
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

                    // InternalKEffects.g:5205:4: (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==23) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalKEffects.g:5206:5: otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_51); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJsonObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:5210:5: ( (lv_members_4_0= ruleJsonObjectMember ) )
                    	    // InternalKEffects.g:5211:6: (lv_members_4_0= ruleJsonObjectMember )
                    	    {
                    	    // InternalKEffects.g:5211:6: (lv_members_4_0= ruleJsonObjectMember )
                    	    // InternalKEffects.g:5212:7: lv_members_4_0= ruleJsonObjectMember
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJsonObjectValueAccess().getMembersJsonObjectMemberParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_46);
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
                    	    break loop95;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:5239:1: entryRuleJsonObjectMember returns [EObject current=null] : iv_ruleJsonObjectMember= ruleJsonObjectMember EOF ;
    public final EObject entryRuleJsonObjectMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectMember = null;


        try {
            // InternalKEffects.g:5239:57: (iv_ruleJsonObjectMember= ruleJsonObjectMember EOF )
            // InternalKEffects.g:5240:2: iv_ruleJsonObjectMember= ruleJsonObjectMember EOF
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
    // InternalKEffects.g:5246:1: ruleJsonObjectMember returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) ) ;
    public final EObject ruleJsonObjectMember() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5252:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) ) )
            // InternalKEffects.g:5253:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) )
            {
            // InternalKEffects.g:5253:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) )
            // InternalKEffects.g:5254:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) )
            {
            // InternalKEffects.g:5254:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalKEffects.g:5255:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalKEffects.g:5255:4: (lv_key_0_0= RULE_STRING )
            // InternalKEffects.g:5256:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_52); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonObjectMemberAccess().getColonKeyword_1());
              		
            }
            // InternalKEffects.g:5276:3: ( (lv_value_2_0= ruleJsonValue ) )
            // InternalKEffects.g:5277:4: (lv_value_2_0= ruleJsonValue )
            {
            // InternalKEffects.g:5277:4: (lv_value_2_0= ruleJsonValue )
            // InternalKEffects.g:5278:5: lv_value_2_0= ruleJsonValue
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
    // InternalKEffects.g:5299:1: entryRuleJsonArrayValue returns [EObject current=null] : iv_ruleJsonArrayValue= ruleJsonArrayValue EOF ;
    public final EObject entryRuleJsonArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArrayValue = null;


        try {
            // InternalKEffects.g:5299:55: (iv_ruleJsonArrayValue= ruleJsonArrayValue EOF )
            // InternalKEffects.g:5300:2: iv_ruleJsonArrayValue= ruleJsonArrayValue EOF
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
    // InternalKEffects.g:5306:1: ruleJsonArrayValue returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleJsonArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5312:2: ( ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' ) )
            // InternalKEffects.g:5313:2: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' )
            {
            // InternalKEffects.g:5313:2: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' )
            // InternalKEffects.g:5314:3: () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']'
            {
            // InternalKEffects.g:5314:3: ()
            // InternalKEffects.g:5315:4: 
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

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonArrayValueAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalKEffects.g:5328:3: ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=RULE_INT && LA98_0<=RULE_STRING)||LA98_0==20||LA98_0==48||LA98_0==52) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalKEffects.g:5329:4: ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )*
                    {
                    // InternalKEffects.g:5329:4: ( (lv_elements_2_0= ruleJsonValue ) )
                    // InternalKEffects.g:5330:5: (lv_elements_2_0= ruleJsonValue )
                    {
                    // InternalKEffects.g:5330:5: (lv_elements_2_0= ruleJsonValue )
                    // InternalKEffects.g:5331:6: lv_elements_2_0= ruleJsonValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJsonArrayValueAccess().getElementsJsonValueParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
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

                    // InternalKEffects.g:5348:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==23) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalKEffects.g:5349:5: otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJsonArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalKEffects.g:5353:5: ( (lv_elements_4_0= ruleJsonValue ) )
                    	    // InternalKEffects.g:5354:6: (lv_elements_4_0= ruleJsonValue )
                    	    {
                    	    // InternalKEffects.g:5354:6: (lv_elements_4_0= ruleJsonValue )
                    	    // InternalKEffects.g:5355:7: lv_elements_4_0= ruleJsonValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJsonArrayValueAccess().getElementsJsonValueParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_55);
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
                    	    break loop97;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:5382:1: entryRuleJsonValue returns [EObject current=null] : iv_ruleJsonValue= ruleJsonValue EOF ;
    public final EObject entryRuleJsonValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonValue = null;


        try {
            // InternalKEffects.g:5382:50: (iv_ruleJsonValue= ruleJsonValue EOF )
            // InternalKEffects.g:5383:2: iv_ruleJsonValue= ruleJsonValue EOF
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
    // InternalKEffects.g:5389:1: ruleJsonValue returns [EObject current=null] : (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue ) ;
    public final EObject ruleJsonValue() throws RecognitionException {
        EObject current = null;

        EObject this_JsonObjectValue_0 = null;

        EObject this_JsonArrayValue_1 = null;

        EObject this_NullValue_2 = null;

        EObject this_AnyValue_3 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5395:2: ( (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue ) )
            // InternalKEffects.g:5396:2: (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue )
            {
            // InternalKEffects.g:5396:2: (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue )
            int alt99=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt99=1;
                }
                break;
            case 20:
                {
                alt99=2;
                }
                break;
            case 52:
                {
                alt99=3;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case RULE_STRING:
                {
                alt99=4;
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
                    // InternalKEffects.g:5397:3: this_JsonObjectValue_0= ruleJsonObjectValue
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
                    // InternalKEffects.g:5409:3: this_JsonArrayValue_1= ruleJsonArrayValue
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
                    // InternalKEffects.g:5421:3: this_NullValue_2= ruleNullValue
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
                    // InternalKEffects.g:5433:3: this_AnyValue_3= ruleAnyValue
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
    // InternalKEffects.g:5448:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalKEffects.g:5448:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalKEffects.g:5449:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalKEffects.g:5455:1: ruleNullValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKEffects.g:5461:2: ( ( () otherlv_1= 'null' ) )
            // InternalKEffects.g:5462:2: ( () otherlv_1= 'null' )
            {
            // InternalKEffects.g:5462:2: ( () otherlv_1= 'null' )
            // InternalKEffects.g:5463:3: () otherlv_1= 'null'
            {
            // InternalKEffects.g:5463:3: ()
            // InternalKEffects.g:5464:4: 
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

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:5481:1: entryRuleJsonPragma returns [EObject current=null] : iv_ruleJsonPragma= ruleJsonPragma EOF ;
    public final EObject entryRuleJsonPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonPragma = null;


        try {
            // InternalKEffects.g:5481:51: (iv_ruleJsonPragma= ruleJsonPragma EOF )
            // InternalKEffects.g:5482:2: iv_ruleJsonPragma= ruleJsonPragma EOF
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
    // InternalKEffects.g:5488:1: ruleJsonPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) ;
    public final EObject ruleJsonPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5494:2: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) )
            // InternalKEffects.g:5495:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            {
            // InternalKEffects.g:5495:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            // InternalKEffects.g:5496:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) )
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJsonPragmaAccess().getNumberSignKeyword_0());
              		
            }
            // InternalKEffects.g:5500:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:5501:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:5501:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:5502:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonPragmaAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_56);
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

            // InternalKEffects.g:5519:3: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // InternalKEffects.g:5520:4: (lv_value_2_0= ruleJsonObjectValue )
            {
            // InternalKEffects.g:5520:4: (lv_value_2_0= ruleJsonObjectValue )
            // InternalKEffects.g:5521:5: lv_value_2_0= ruleJsonObjectValue
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
    // InternalKEffects.g:5542:1: entryRuleJsonAnnotation returns [EObject current=null] : iv_ruleJsonAnnotation= ruleJsonAnnotation EOF ;
    public final EObject entryRuleJsonAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonAnnotation = null;


        try {
            // InternalKEffects.g:5542:55: (iv_ruleJsonAnnotation= ruleJsonAnnotation EOF )
            // InternalKEffects.g:5543:2: iv_ruleJsonAnnotation= ruleJsonAnnotation EOF
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
    // InternalKEffects.g:5549:1: ruleJsonAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) ;
    public final EObject ruleJsonAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5555:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) )
            // InternalKEffects.g:5556:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            {
            // InternalKEffects.g:5556:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            // InternalKEffects.g:5557:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) )
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJsonAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:5561:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:5562:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:5562:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:5563:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_56);
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

            // InternalKEffects.g:5580:3: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // InternalKEffects.g:5581:4: (lv_value_2_0= ruleJsonObjectValue )
            {
            // InternalKEffects.g:5581:4: (lv_value_2_0= ruleJsonObjectValue )
            // InternalKEffects.g:5582:5: lv_value_2_0= ruleJsonObjectValue
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
    // InternalKEffects.g:5603:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalKEffects.g:5603:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalKEffects.g:5604:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalKEffects.g:5610:1: ruleAnnotation returns [EObject current=null] : (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_Annotation_0 = null;

        EObject this_JsonAnnotation_1 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5616:2: ( (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation ) )
            // InternalKEffects.g:5617:2: (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )
            {
            // InternalKEffects.g:5617:2: (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )
            int alt100=2;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // InternalKEffects.g:5618:3: this_Annotation_0= superAnnotation
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
                    // InternalKEffects.g:5630:3: this_JsonAnnotation_1= ruleJsonAnnotation
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
    // InternalKEffects.g:5645:1: entryRuleQuotedStringAnnotation returns [EObject current=null] : iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF ;
    public final EObject entryRuleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedStringAnnotation = null;


        try {
            // InternalKEffects.g:5645:63: (iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF )
            // InternalKEffects.g:5646:2: iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF
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
    // InternalKEffects.g:5652:1: ruleQuotedStringAnnotation returns [EObject current=null] : (this_QuotedStringAnnotation_0= superQuotedStringAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation ) ;
    public final EObject ruleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_QuotedStringAnnotation_0 = null;

        EObject this_JsonAnnotation_1 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5658:2: ( (this_QuotedStringAnnotation_0= superQuotedStringAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation ) )
            // InternalKEffects.g:5659:2: (this_QuotedStringAnnotation_0= superQuotedStringAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )
            {
            // InternalKEffects.g:5659:2: (this_QuotedStringAnnotation_0= superQuotedStringAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )
            int alt101=2;
            alt101 = dfa101.predict(input);
            switch (alt101) {
                case 1 :
                    // InternalKEffects.g:5660:3: this_QuotedStringAnnotation_0= superQuotedStringAnnotation
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
                    // InternalKEffects.g:5672:3: this_JsonAnnotation_1= ruleJsonAnnotation
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
    // InternalKEffects.g:5687:1: entrySuperAnnotation returns [EObject current=null] : iv_superAnnotation= superAnnotation EOF ;
    public final EObject entrySuperAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_superAnnotation = null;


        try {
            // InternalKEffects.g:5687:52: (iv_superAnnotation= superAnnotation EOF )
            // InternalKEffects.g:5688:2: iv_superAnnotation= superAnnotation EOF
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
    // InternalKEffects.g:5694:1: superAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject superAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5700:2: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKEffects.g:5701:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKEffects.g:5701:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt102=4;
            alt102 = dfa102.predict(input);
            switch (alt102) {
                case 1 :
                    // InternalKEffects.g:5702:3: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalKEffects.g:5714:3: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
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
                    // InternalKEffects.g:5726:3: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
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
                    // InternalKEffects.g:5738:3: this_TagAnnotation_3= ruleTagAnnotation
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
    // InternalKEffects.g:5753:1: entrySuperPragma returns [EObject current=null] : iv_superPragma= superPragma EOF ;
    public final EObject entrySuperPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_superPragma = null;


        try {
            // InternalKEffects.g:5753:48: (iv_superPragma= superPragma EOF )
            // InternalKEffects.g:5754:2: iv_superPragma= superPragma EOF
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
    // InternalKEffects.g:5760:1: superPragma returns [EObject current=null] : (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag ) ;
    public final EObject superPragma() throws RecognitionException {
        EObject current = null;

        EObject this_StringPragma_0 = null;

        EObject this_PragmaTag_1 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5766:2: ( (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag ) )
            // InternalKEffects.g:5767:2: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )
            {
            // InternalKEffects.g:5767:2: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )
            int alt103=2;
            alt103 = dfa103.predict(input);
            switch (alt103) {
                case 1 :
                    // InternalKEffects.g:5768:3: this_StringPragma_0= ruleStringPragma
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
                    // InternalKEffects.g:5780:3: this_PragmaTag_1= rulePragmaTag
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
    // InternalKEffects.g:5795:1: entrySuperValuedAnnotation returns [EObject current=null] : iv_superValuedAnnotation= superValuedAnnotation EOF ;
    public final EObject entrySuperValuedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_superValuedAnnotation = null;


        try {
            // InternalKEffects.g:5795:58: (iv_superValuedAnnotation= superValuedAnnotation EOF )
            // InternalKEffects.g:5796:2: iv_superValuedAnnotation= superValuedAnnotation EOF
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
    // InternalKEffects.g:5802:1: superValuedAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation ) ;
    public final EObject superValuedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5808:2: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation ) )
            // InternalKEffects.g:5809:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation )
            {
            // InternalKEffects.g:5809:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation )
            int alt104=3;
            alt104 = dfa104.predict(input);
            switch (alt104) {
                case 1 :
                    // InternalKEffects.g:5810:3: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalKEffects.g:5822:3: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
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
                    // InternalKEffects.g:5834:3: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
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
    // InternalKEffects.g:5849:1: entrySuperQuotedStringAnnotation returns [EObject current=null] : iv_superQuotedStringAnnotation= superQuotedStringAnnotation EOF ;
    public final EObject entrySuperQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_superQuotedStringAnnotation = null;


        try {
            // InternalKEffects.g:5849:64: (iv_superQuotedStringAnnotation= superQuotedStringAnnotation EOF )
            // InternalKEffects.g:5850:2: iv_superQuotedStringAnnotation= superQuotedStringAnnotation EOF
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
    // InternalKEffects.g:5856:1: superQuotedStringAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject superQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_QuotedKeyStringValueAnnotation_1 = null;

        EObject this_QuotedTypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5862:2: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKEffects.g:5863:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKEffects.g:5863:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt105=4;
            alt105 = dfa105.predict(input);
            switch (alt105) {
                case 1 :
                    // InternalKEffects.g:5864:3: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalKEffects.g:5876:3: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
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
                    // InternalKEffects.g:5888:3: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
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
                    // InternalKEffects.g:5900:3: this_TagAnnotation_3= ruleTagAnnotation
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
    // InternalKEffects.g:5915:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalKEffects.g:5915:58: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalKEffects.g:5916:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
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
    // InternalKEffects.g:5922:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:5928:2: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalKEffects.g:5929:2: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalKEffects.g:5929:2: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalKEffects.g:5930:3: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalKEffects.g:5930:3: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalKEffects.g:5931:4: lv_values_0_0= RULE_COMMENT_ANNOTATION
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
    // InternalKEffects.g:5950:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalKEffects.g:5950:54: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalKEffects.g:5951:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
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
    // InternalKEffects.g:5957:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:5963:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKEffects.g:5964:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKEffects.g:5964:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKEffects.g:5965:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:5969:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:5970:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:5970:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:5971:5: lv_name_1_0= ruleExtendedID
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
    // InternalKEffects.g:5992:1: entryRulePragmaTag returns [EObject current=null] : iv_rulePragmaTag= rulePragmaTag EOF ;
    public final EObject entryRulePragmaTag() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaTag = null;


        try {
            // InternalKEffects.g:5992:50: (iv_rulePragmaTag= rulePragmaTag EOF )
            // InternalKEffects.g:5993:2: iv_rulePragmaTag= rulePragmaTag EOF
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
    // InternalKEffects.g:5999:1: rulePragmaTag returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject rulePragmaTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:6005:2: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKEffects.g:6006:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKEffects.g:6006:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKEffects.g:6007:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0());
              		
            }
            // InternalKEffects.g:6011:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:6012:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:6012:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:6013:5: lv_name_1_0= ruleExtendedID
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
    // InternalKEffects.g:6034:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalKEffects.g:6034:65: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalKEffects.g:6035:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:6041:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:6047:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKEffects.g:6048:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKEffects.g:6048:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKEffects.g:6049:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:6053:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:6054:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:6054:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:6055:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_57);
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

            // InternalKEffects.g:6072:3: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKEffects.g:6073:4: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKEffects.g:6073:4: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKEffects.g:6074:5: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_58);
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

            // InternalKEffects.g:6091:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==23) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // InternalKEffects.g:6092:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKEffects.g:6096:4: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKEffects.g:6097:5: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKEffects.g:6097:5: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKEffects.g:6098:6: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_58);
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
            	    break loop106;
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
    // InternalKEffects.g:6120:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // InternalKEffects.g:6120:75: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:6121:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:6127:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:6133:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalKEffects.g:6134:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKEffects.g:6134:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalKEffects.g:6135:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:6139:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:6140:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:6140:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:6141:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_59);
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

            // InternalKEffects.g:6158:3: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalKEffects.g:6159:4: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalKEffects.g:6159:4: (lv_values_2_0= ruleEStringBoolean )
            // InternalKEffects.g:6160:5: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_58);
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

            // InternalKEffects.g:6177:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==23) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // InternalKEffects.g:6178:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKEffects.g:6182:4: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalKEffects.g:6183:5: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalKEffects.g:6183:5: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalKEffects.g:6184:6: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_58);
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
            	    break loop107;
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
    // InternalKEffects.g:6206:1: entryRuleStringPragma returns [EObject current=null] : iv_ruleStringPragma= ruleStringPragma EOF ;
    public final EObject entryRuleStringPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPragma = null;


        try {
            // InternalKEffects.g:6206:53: (iv_ruleStringPragma= ruleStringPragma EOF )
            // InternalKEffects.g:6207:2: iv_ruleStringPragma= ruleStringPragma EOF
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
    // InternalKEffects.g:6213:1: ruleStringPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleStringPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:6219:2: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKEffects.g:6220:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKEffects.g:6220:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKEffects.g:6221:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0());
              		
            }
            // InternalKEffects.g:6225:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:6226:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:6226:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:6227:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_57);
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

            // InternalKEffects.g:6244:3: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKEffects.g:6245:4: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKEffects.g:6245:4: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKEffects.g:6246:5: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_58);
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

            // InternalKEffects.g:6263:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==23) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // InternalKEffects.g:6264:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKEffects.g:6268:4: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKEffects.g:6269:5: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKEffects.g:6269:5: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKEffects.g:6270:6: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_58);
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
            	    break loop108;
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
    // InternalKEffects.g:6292:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalKEffects.g:6292:70: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:6293:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:6299:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
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
            // InternalKEffects.g:6305:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKEffects.g:6306:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKEffects.g:6306:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalKEffects.g:6307:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:6311:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:6312:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:6312:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:6313:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_60);
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

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKEffects.g:6334:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKEffects.g:6335:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKEffects.g:6335:4: (lv_type_3_0= ruleExtendedID )
            // InternalKEffects.g:6336:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
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

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKEffects.g:6357:3: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalKEffects.g:6358:4: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalKEffects.g:6358:4: (lv_values_5_0= ruleEStringAllTypes )
            // InternalKEffects.g:6359:5: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_58);
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

            // InternalKEffects.g:6376:3: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==23) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // InternalKEffects.g:6377:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKEffects.g:6381:4: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalKEffects.g:6382:5: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalKEffects.g:6382:5: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalKEffects.g:6383:6: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_58);
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
            	    break loop109;
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
    // InternalKEffects.g:6405:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKEffects.g:6405:80: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:6406:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:6412:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
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
            // InternalKEffects.g:6418:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalKEffects.g:6419:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKEffects.g:6419:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalKEffects.g:6420:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:6424:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:6425:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:6425:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:6426:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_60);
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

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKEffects.g:6447:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKEffects.g:6448:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKEffects.g:6448:4: (lv_type_3_0= ruleExtendedID )
            // InternalKEffects.g:6449:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
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

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKEffects.g:6470:3: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalKEffects.g:6471:4: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalKEffects.g:6471:4: (lv_values_5_0= ruleEStringBoolean )
            // InternalKEffects.g:6472:5: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_58);
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

            // InternalKEffects.g:6489:3: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==23) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // InternalKEffects.g:6490:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKEffects.g:6494:4: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalKEffects.g:6495:5: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalKEffects.g:6495:5: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalKEffects.g:6496:6: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_58);
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
            	    break loop110;
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
    // InternalKEffects.g:6518:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalKEffects.g:6518:71: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:6519:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:6525:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKEffects.g:6531:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalKEffects.g:6532:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalKEffects.g:6532:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalKEffects.g:6533:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:6537:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:6538:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:6538:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:6539:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_51);
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

            // InternalKEffects.g:6556:3: ( (lv_values_2_0= RULE_STRING ) )
            // InternalKEffects.g:6557:4: (lv_values_2_0= RULE_STRING )
            {
            // InternalKEffects.g:6557:4: (lv_values_2_0= RULE_STRING )
            // InternalKEffects.g:6558:5: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_58); if (state.failed) return current;
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

            // InternalKEffects.g:6574:3: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==23) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalKEffects.g:6575:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKEffects.g:6579:4: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalKEffects.g:6580:5: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalKEffects.g:6580:5: (lv_values_4_0= RULE_STRING )
            	    // InternalKEffects.g:6581:6: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_58); if (state.failed) return current;
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
            	    break loop111;
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
    // InternalKEffects.g:6602:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKEffects.g:6602:76: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKEffects.g:6603:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKEffects.g:6609:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // InternalKEffects.g:6615:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalKEffects.g:6616:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalKEffects.g:6616:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalKEffects.g:6617:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKEffects.g:6621:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEffects.g:6622:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEffects.g:6622:4: (lv_name_1_0= ruleExtendedID )
            // InternalKEffects.g:6623:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_60);
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

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKEffects.g:6644:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKEffects.g:6645:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKEffects.g:6645:4: (lv_type_3_0= ruleExtendedID )
            // InternalKEffects.g:6646:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
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

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKEffects.g:6667:3: ( (lv_values_5_0= RULE_STRING ) )
            // InternalKEffects.g:6668:4: (lv_values_5_0= RULE_STRING )
            {
            // InternalKEffects.g:6668:4: (lv_values_5_0= RULE_STRING )
            // InternalKEffects.g:6669:5: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_58); if (state.failed) return current;
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

            // InternalKEffects.g:6685:3: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==23) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // InternalKEffects.g:6686:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKEffects.g:6690:4: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalKEffects.g:6691:5: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalKEffects.g:6691:5: (lv_values_7_0= RULE_STRING )
            	    // InternalKEffects.g:6692:6: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_58); if (state.failed) return current;
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
            	    break loop112;
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
    // InternalKEffects.g:6713:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalKEffects.g:6713:54: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalKEffects.g:6714:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
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
    // InternalKEffects.g:6720:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;



        	enterRule();

        try {
            // InternalKEffects.g:6726:2: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalKEffects.g:6727:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalKEffects.g:6727:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt113=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt113=1;
                }
                break;
            case RULE_ID:
                {
                alt113=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt113=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalKEffects.g:6728:3: this_STRING_0= RULE_STRING
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
                    // InternalKEffects.g:6736:3: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKEffects.g:6747:3: this_BOOLEAN_2= RULE_BOOLEAN
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
    // InternalKEffects.g:6758:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // InternalKEffects.g:6758:55: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalKEffects.g:6759:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
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
    // InternalKEffects.g:6765:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;



        	enterRule();

        try {
            // InternalKEffects.g:6771:2: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalKEffects.g:6772:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalKEffects.g:6772:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt114=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt114=1;
                }
                break;
            case RULE_ID:
                {
                alt114=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt114=3;
                }
                break;
            case 37:
                {
                int LA114_4 = input.LA(2);

                if ( (LA114_4==RULE_INT) ) {
                    alt114=4;
                }
                else if ( (LA114_4==RULE_FLOAT) ) {
                    alt114=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 114, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt114=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt114=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // InternalKEffects.g:6773:3: this_STRING_0= RULE_STRING
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
                    // InternalKEffects.g:6781:3: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKEffects.g:6792:3: this_BOOLEAN_2= RULE_BOOLEAN
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
                    // InternalKEffects.g:6800:3: this_Integer_3= ruleInteger
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
                    // InternalKEffects.g:6811:3: this_Floateger_4= ruleFloateger
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
    // InternalKEffects.g:6825:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalKEffects.g:6825:50: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalKEffects.g:6826:2: iv_ruleExtendedID= ruleExtendedID EOF
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
    // InternalKEffects.g:6832:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_INT_5=null;


        	enterRule();

        try {
            // InternalKEffects.g:6838:2: ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) )
            // InternalKEffects.g:6839:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            {
            // InternalKEffects.g:6839:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            // InternalKEffects.g:6840:3: this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalKEffects.g:6847:3: ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==37) ) {
                    int LA116_2 = input.LA(2);

                    if ( (LA116_2==RULE_ID) ) {
                        alt116=1;
                    }


                }
                else if ( (LA116_0==22) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // InternalKEffects.g:6848:4: (kw= '.' | kw= '-' ) this_ID_3= RULE_ID
            	    {
            	    // InternalKEffects.g:6848:4: (kw= '.' | kw= '-' )
            	    int alt115=2;
            	    int LA115_0 = input.LA(1);

            	    if ( (LA115_0==22) ) {
            	        alt115=1;
            	    }
            	    else if ( (LA115_0==37) ) {
            	        alt115=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 115, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt115) {
            	        case 1 :
            	            // InternalKEffects.g:6849:5: kw= '.'
            	            {
            	            kw=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalKEffects.g:6855:5: kw= '-'
            	            {
            	            kw=(Token)match(input,37,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_3, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);

            // InternalKEffects.g:6869:3: (kw= '#' this_INT_5= RULE_INT )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==53) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalKEffects.g:6870:4: kw= '#' this_INT_5= RULE_INT
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_43); if (state.failed) return current;
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
    // InternalKEffects.g:6887:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalKEffects.g:6887:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalKEffects.g:6888:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalKEffects.g:6894:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalKEffects.g:6900:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalKEffects.g:6901:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalKEffects.g:6901:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalKEffects.g:6902:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalKEffects.g:6902:3: (kw= '-' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==37) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalKEffects.g:6903:4: kw= '-'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_43); if (state.failed) return current;
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
    // InternalKEffects.g:6920:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalKEffects.g:6920:49: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalKEffects.g:6921:2: iv_ruleFloateger= ruleFloateger EOF
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
    // InternalKEffects.g:6927:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;


        	enterRule();

        try {
            // InternalKEffects.g:6933:2: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalKEffects.g:6934:2: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalKEffects.g:6934:2: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalKEffects.g:6935:3: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalKEffects.g:6935:3: (kw= '-' )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==37) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalKEffects.g:6936:4: kw= '-'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_62); if (state.failed) return current;
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
    // InternalKEffects.g:6953:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) | (enumLiteral_12= 'min=' ) | (enumLiteral_13= 'max=' ) ) ;
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
            // InternalKEffects.g:6959:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) | (enumLiteral_12= 'min=' ) | (enumLiteral_13= 'max=' ) ) )
            // InternalKEffects.g:6960:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) | (enumLiteral_12= 'min=' ) | (enumLiteral_13= 'max=' ) )
            {
            // InternalKEffects.g:6960:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) | (enumLiteral_12= 'min=' ) | (enumLiteral_13= 'max=' ) )
            int alt120=14;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt120=1;
                }
                break;
            case 56:
                {
                alt120=2;
                }
                break;
            case 57:
                {
                alt120=3;
                }
                break;
            case 58:
                {
                alt120=4;
                }
                break;
            case 59:
                {
                alt120=5;
                }
                break;
            case 60:
                {
                alt120=6;
                }
                break;
            case 61:
                {
                alt120=7;
                }
                break;
            case 62:
                {
                alt120=8;
                }
                break;
            case 63:
                {
                alt120=9;
                }
                break;
            case 64:
                {
                alt120=10;
                }
                break;
            case 65:
                {
                alt120=11;
                }
                break;
            case 66:
                {
                alt120=12;
                }
                break;
            case 67:
                {
                alt120=13;
                }
                break;
            case 68:
                {
                alt120=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // InternalKEffects.g:6961:3: (enumLiteral_0= '=' )
                    {
                    // InternalKEffects.g:6961:3: (enumLiteral_0= '=' )
                    // InternalKEffects.g:6962:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:6969:3: (enumLiteral_1= '+=' )
                    {
                    // InternalKEffects.g:6969:3: (enumLiteral_1= '+=' )
                    // InternalKEffects.g:6970:4: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEffects.g:6977:3: (enumLiteral_2= '-=' )
                    {
                    // InternalKEffects.g:6977:3: (enumLiteral_2= '-=' )
                    // InternalKEffects.g:6978:4: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEffects.g:6985:3: (enumLiteral_3= '*=' )
                    {
                    // InternalKEffects.g:6985:3: (enumLiteral_3= '*=' )
                    // InternalKEffects.g:6986:4: enumLiteral_3= '*='
                    {
                    enumLiteral_3=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEffects.g:6993:3: (enumLiteral_4= '/=' )
                    {
                    // InternalKEffects.g:6993:3: (enumLiteral_4= '/=' )
                    // InternalKEffects.g:6994:4: enumLiteral_4= '/='
                    {
                    enumLiteral_4=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKEffects.g:7001:3: (enumLiteral_5= '%=' )
                    {
                    // InternalKEffects.g:7001:3: (enumLiteral_5= '%=' )
                    // InternalKEffects.g:7002:4: enumLiteral_5= '%='
                    {
                    enumLiteral_5=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKEffects.g:7009:3: (enumLiteral_6= '&=' )
                    {
                    // InternalKEffects.g:7009:3: (enumLiteral_6= '&=' )
                    // InternalKEffects.g:7010:4: enumLiteral_6= '&='
                    {
                    enumLiteral_6=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKEffects.g:7017:3: (enumLiteral_7= '|=' )
                    {
                    // InternalKEffects.g:7017:3: (enumLiteral_7= '|=' )
                    // InternalKEffects.g:7018:4: enumLiteral_7= '|='
                    {
                    enumLiteral_7=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalKEffects.g:7025:3: (enumLiteral_8= '^=' )
                    {
                    // InternalKEffects.g:7025:3: (enumLiteral_8= '^=' )
                    // InternalKEffects.g:7026:4: enumLiteral_8= '^='
                    {
                    enumLiteral_8=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalKEffects.g:7033:3: (enumLiteral_9= '<<=' )
                    {
                    // InternalKEffects.g:7033:3: (enumLiteral_9= '<<=' )
                    // InternalKEffects.g:7034:4: enumLiteral_9= '<<='
                    {
                    enumLiteral_9=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTLEFTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTLEFTEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalKEffects.g:7041:3: (enumLiteral_10= '>>=' )
                    {
                    // InternalKEffects.g:7041:3: (enumLiteral_10= '>>=' )
                    // InternalKEffects.g:7042:4: enumLiteral_10= '>>='
                    {
                    enumLiteral_10=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTRIGHTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTRIGHTEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalKEffects.g:7049:3: (enumLiteral_11= '>>>=' )
                    {
                    // InternalKEffects.g:7049:3: (enumLiteral_11= '>>>=' )
                    // InternalKEffects.g:7050:4: enumLiteral_11= '>>>='
                    {
                    enumLiteral_11=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTRIGHTUNSIGNEDEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTRIGHTUNSIGNEDEnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalKEffects.g:7057:3: (enumLiteral_12= 'min=' )
                    {
                    // InternalKEffects.g:7057:3: (enumLiteral_12= 'min=' )
                    // InternalKEffects.g:7058:4: enumLiteral_12= 'min='
                    {
                    enumLiteral_12=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNMINEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_12, grammarAccess.getAssignOperatorAccess().getASSIGNMINEnumLiteralDeclaration_12());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalKEffects.g:7065:3: (enumLiteral_13= 'max=' )
                    {
                    // InternalKEffects.g:7065:3: (enumLiteral_13= 'max=' )
                    // InternalKEffects.g:7066:4: enumLiteral_13= 'max='
                    {
                    enumLiteral_13=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7076:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalKEffects.g:7082:2: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalKEffects.g:7083:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalKEffects.g:7083:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==69) ) {
                alt121=1;
            }
            else if ( (LA121_0==70) ) {
                alt121=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // InternalKEffects.g:7084:3: (enumLiteral_0= '++' )
                    {
                    // InternalKEffects.g:7084:3: (enumLiteral_0= '++' )
                    // InternalKEffects.g:7085:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:7092:3: (enumLiteral_1= '--' )
                    {
                    // InternalKEffects.g:7092:3: (enumLiteral_1= '--' )
                    // InternalKEffects.g:7093:4: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7103:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // InternalKEffects.g:7109:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalKEffects.g:7110:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalKEffects.g:7110:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt122=6;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt122=1;
                }
                break;
            case 72:
                {
                alt122=2;
                }
                break;
            case 73:
                {
                alt122=3;
                }
                break;
            case 74:
                {
                alt122=4;
                }
                break;
            case 75:
                {
                alt122=5;
                }
                break;
            case 76:
                {
                alt122=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // InternalKEffects.g:7111:3: (enumLiteral_0= '==' )
                    {
                    // InternalKEffects.g:7111:3: (enumLiteral_0= '==' )
                    // InternalKEffects.g:7112:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:7119:3: (enumLiteral_1= '<' )
                    {
                    // InternalKEffects.g:7119:3: (enumLiteral_1= '<' )
                    // InternalKEffects.g:7120:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEffects.g:7127:3: (enumLiteral_2= '<=' )
                    {
                    // InternalKEffects.g:7127:3: (enumLiteral_2= '<=' )
                    // InternalKEffects.g:7128:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEffects.g:7135:3: (enumLiteral_3= '>' )
                    {
                    // InternalKEffects.g:7135:3: (enumLiteral_3= '>' )
                    // InternalKEffects.g:7136:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEffects.g:7143:3: (enumLiteral_4= '>=' )
                    {
                    // InternalKEffects.g:7143:3: (enumLiteral_4= '>=' )
                    // InternalKEffects.g:7144:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKEffects.g:7151:3: (enumLiteral_5= '!=' )
                    {
                    // InternalKEffects.g:7151:3: (enumLiteral_5= '!=' )
                    // InternalKEffects.g:7152:4: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7162:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7168:2: ( (enumLiteral_0= 'pre' ) )
            // InternalKEffects.g:7169:2: (enumLiteral_0= 'pre' )
            {
            // InternalKEffects.g:7169:2: (enumLiteral_0= 'pre' )
            // InternalKEffects.g:7170:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7179:1: ruleBitwiseNotOperator returns [Enumerator current=null] : (enumLiteral_0= '~' ) ;
    public final Enumerator ruleBitwiseNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7185:2: ( (enumLiteral_0= '~' ) )
            // InternalKEffects.g:7186:2: (enumLiteral_0= '~' )
            {
            // InternalKEffects.g:7186:2: (enumLiteral_0= '~' )
            // InternalKEffects.g:7187:3: enumLiteral_0= '~'
            {
            enumLiteral_0=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7196:1: ruleBitwiseXOrOperator returns [Enumerator current=null] : (enumLiteral_0= '^' ) ;
    public final Enumerator ruleBitwiseXOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7202:2: ( (enumLiteral_0= '^' ) )
            // InternalKEffects.g:7203:2: (enumLiteral_0= '^' )
            {
            // InternalKEffects.g:7203:2: (enumLiteral_0= '^' )
            // InternalKEffects.g:7204:3: enumLiteral_0= '^'
            {
            enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7213:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7219:2: ( (enumLiteral_0= '|' ) )
            // InternalKEffects.g:7220:2: (enumLiteral_0= '|' )
            {
            // InternalKEffects.g:7220:2: (enumLiteral_0= '|' )
            // InternalKEffects.g:7221:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7230:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7236:2: ( (enumLiteral_0= '&' ) )
            // InternalKEffects.g:7237:2: (enumLiteral_0= '&' )
            {
            // InternalKEffects.g:7237:2: (enumLiteral_0= '&' )
            // InternalKEffects.g:7238:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7247:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7253:2: ( (enumLiteral_0= '!' ) )
            // InternalKEffects.g:7254:2: (enumLiteral_0= '!' )
            {
            // InternalKEffects.g:7254:2: (enumLiteral_0= '!' )
            // InternalKEffects.g:7255:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7264:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7270:2: ( (enumLiteral_0= '+' ) )
            // InternalKEffects.g:7271:2: (enumLiteral_0= '+' )
            {
            // InternalKEffects.g:7271:2: (enumLiteral_0= '+' )
            // InternalKEffects.g:7272:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7281:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7287:2: ( (enumLiteral_0= '-' ) )
            // InternalKEffects.g:7288:2: (enumLiteral_0= '-' )
            {
            // InternalKEffects.g:7288:2: (enumLiteral_0= '-' )
            // InternalKEffects.g:7289:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7298:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7304:2: ( (enumLiteral_0= '*' ) )
            // InternalKEffects.g:7305:2: (enumLiteral_0= '*' )
            {
            // InternalKEffects.g:7305:2: (enumLiteral_0= '*' )
            // InternalKEffects.g:7306:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7315:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7321:2: ( (enumLiteral_0= '%' ) )
            // InternalKEffects.g:7322:2: (enumLiteral_0= '%' )
            {
            // InternalKEffects.g:7322:2: (enumLiteral_0= '%' )
            // InternalKEffects.g:7323:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7332:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7338:2: ( (enumLiteral_0= '/' ) )
            // InternalKEffects.g:7339:2: (enumLiteral_0= '/' )
            {
            // InternalKEffects.g:7339:2: (enumLiteral_0= '/' )
            // InternalKEffects.g:7340:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7349:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7355:2: ( (enumLiteral_0= 'val' ) )
            // InternalKEffects.g:7356:2: (enumLiteral_0= 'val' )
            {
            // InternalKEffects.g:7356:2: (enumLiteral_0= 'val' )
            // InternalKEffects.g:7357:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7366:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7372:2: ( (enumLiteral_0= '||' ) )
            // InternalKEffects.g:7373:2: (enumLiteral_0= '||' )
            {
            // InternalKEffects.g:7373:2: (enumLiteral_0= '||' )
            // InternalKEffects.g:7374:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7383:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7389:2: ( (enumLiteral_0= '&&' ) )
            // InternalKEffects.g:7390:2: (enumLiteral_0= '&&' )
            {
            // InternalKEffects.g:7390:2: (enumLiteral_0= '&&' )
            // InternalKEffects.g:7391:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7400:1: ruleShiftLeftOperator returns [Enumerator current=null] : (enumLiteral_0= '<<' ) ;
    public final Enumerator ruleShiftLeftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7406:2: ( (enumLiteral_0= '<<' ) )
            // InternalKEffects.g:7407:2: (enumLiteral_0= '<<' )
            {
            // InternalKEffects.g:7407:2: (enumLiteral_0= '<<' )
            // InternalKEffects.g:7408:3: enumLiteral_0= '<<'
            {
            enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7417:1: ruleShiftRightOperator returns [Enumerator current=null] : (enumLiteral_0= '>>' ) ;
    public final Enumerator ruleShiftRightOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7423:2: ( (enumLiteral_0= '>>' ) )
            // InternalKEffects.g:7424:2: (enumLiteral_0= '>>' )
            {
            // InternalKEffects.g:7424:2: (enumLiteral_0= '>>' )
            // InternalKEffects.g:7425:3: enumLiteral_0= '>>'
            {
            enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7434:1: ruleShiftRightUnsignedOperator returns [Enumerator current=null] : (enumLiteral_0= '>>>' ) ;
    public final Enumerator ruleShiftRightUnsignedOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7440:2: ( (enumLiteral_0= '>>>' ) )
            // InternalKEffects.g:7441:2: (enumLiteral_0= '>>>' )
            {
            // InternalKEffects.g:7441:2: (enumLiteral_0= '>>>' )
            // InternalKEffects.g:7442:3: enumLiteral_0= '>>>'
            {
            enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7451:1: ruleConditionalOperator returns [Enumerator current=null] : (enumLiteral_0= '?' ) ;
    public final Enumerator ruleConditionalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7457:2: ( (enumLiteral_0= '?' ) )
            // InternalKEffects.g:7458:2: (enumLiteral_0= '?' )
            {
            // InternalKEffects.g:7458:2: (enumLiteral_0= '?' )
            // InternalKEffects.g:7459:3: enumLiteral_0= '?'
            {
            enumLiteral_0=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKEffects.g:7468:1: ruleInitOperator returns [Enumerator current=null] : (enumLiteral_0= '->' ) ;
    public final Enumerator ruleInitOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7474:2: ( (enumLiteral_0= '->' ) )
            // InternalKEffects.g:7475:2: (enumLiteral_0= '->' )
            {
            // InternalKEffects.g:7475:2: (enumLiteral_0= '->' )
            // InternalKEffects.g:7476:3: enumLiteral_0= '->'
            {
            enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleFbyOperator"
    // InternalKEffects.g:7485:1: ruleFbyOperator returns [Enumerator current=null] : (enumLiteral_0= 'fby' ) ;
    public final Enumerator ruleFbyOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7491:2: ( (enumLiteral_0= 'fby' ) )
            // InternalKEffects.g:7492:2: (enumLiteral_0= 'fby' )
            {
            // InternalKEffects.g:7492:2: (enumLiteral_0= 'fby' )
            // InternalKEffects.g:7493:3: enumLiteral_0= 'fby'
            {
            enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getFbyOperatorAccess().getFBYEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getFbyOperatorAccess().getFBYEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleFbyOperator"


    // $ANTLR start "ruleSfbyOperator"
    // InternalKEffects.g:7502:1: ruleSfbyOperator returns [Enumerator current=null] : (enumLiteral_0= 'sfby' ) ;
    public final Enumerator ruleSfbyOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKEffects.g:7508:2: ( (enumLiteral_0= 'sfby' ) )
            // InternalKEffects.g:7509:2: (enumLiteral_0= 'sfby' )
            {
            // InternalKEffects.g:7509:2: (enumLiteral_0= 'sfby' )
            // InternalKEffects.g:7510:3: enumLiteral_0= 'sfby'
            {
            enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getSfbyOperatorAccess().getSFBYEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getSfbyOperatorAccess().getSFBYEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleSfbyOperator"


    // $ANTLR start "ruleParameterAccessType"
    // InternalKEffects.g:7519:1: ruleParameterAccessType returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '!&' ) ) ;
    public final Enumerator ruleParameterAccessType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalKEffects.g:7525:2: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '!&' ) ) )
            // InternalKEffects.g:7526:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '!&' ) )
            {
            // InternalKEffects.g:7526:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '!&' ) )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==32) ) {
                alt123=1;
            }
            else if ( (LA123_0==82) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // InternalKEffects.g:7527:3: (enumLiteral_0= '&' )
                    {
                    // InternalKEffects.g:7527:3: (enumLiteral_0= '&' )
                    // InternalKEffects.g:7528:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterAccessTypeAccess().getCALL_BY_REFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getParameterAccessTypeAccess().getCALL_BY_REFERENCEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEffects.g:7535:3: (enumLiteral_1= '!&' )
                    {
                    // InternalKEffects.g:7535:3: (enumLiteral_1= '!&' )
                    // InternalKEffects.g:7536:4: enumLiteral_1= '!&'
                    {
                    enumLiteral_1=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterAccessTypeAccess().getPURE_OUTPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getParameterAccessTypeAccess().getPURE_OUTPUTEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleParameterAccessType"

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

    // $ANTLR start synpred39_InternalKEffects
    public final void synpred39_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKEffects.g:1234:3: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKEffects.g:1234:3: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred39_InternalKEffects

    // $ANTLR start synpred51_InternalKEffects
    public final void synpred51_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalKEffects.g:1919:3: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalKEffects.g:1919:3: this_ValuedExpression_0= ruleValuedExpression
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
    // $ANTLR end synpred51_InternalKEffects

    // $ANTLR start synpred54_InternalKEffects
    public final void synpred54_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKEffects.g:2213:6: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )
        // InternalKEffects.g:2213:6: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) )
        {
        otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_28); if (state.failed) return ;
        // InternalKEffects.g:2217:6: ( (lv_subExpressions_5_0= ruleSumExpression ) )
        // InternalKEffects.g:2218:7: (lv_subExpressions_5_0= ruleSumExpression )
        {
        // InternalKEffects.g:2218:7: (lv_subExpressions_5_0= ruleSumExpression )
        // InternalKEffects.g:2219:8: lv_subExpressions_5_0= ruleSumExpression
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
    // $ANTLR end synpred54_InternalKEffects

    // $ANTLR start synpred56_InternalKEffects
    public final void synpred56_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKEffects.g:2289:6: (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )
        // InternalKEffects.g:2289:6: otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) )
        {
        otherlv_9=(Token)match(input,34,FollowSets000.FOLLOW_28); if (state.failed) return ;
        // InternalKEffects.g:2293:6: ( (lv_subExpressions_10_0= ruleSumExpression ) )
        // InternalKEffects.g:2294:7: (lv_subExpressions_10_0= ruleSumExpression )
        {
        // InternalKEffects.g:2294:7: (lv_subExpressions_10_0= ruleSumExpression )
        // InternalKEffects.g:2295:8: lv_subExpressions_10_0= ruleSumExpression
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
    // $ANTLR end synpred56_InternalKEffects

    // $ANTLR start synpred58_InternalKEffects
    public final void synpred58_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_14=null;
        EObject lv_subExpressions_15_0 = null;


        // InternalKEffects.g:2365:6: (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )
        // InternalKEffects.g:2365:6: otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) )
        {
        otherlv_14=(Token)match(input,35,FollowSets000.FOLLOW_28); if (state.failed) return ;
        // InternalKEffects.g:2369:6: ( (lv_subExpressions_15_0= ruleSumExpression ) )
        // InternalKEffects.g:2370:7: (lv_subExpressions_15_0= ruleSumExpression )
        {
        // InternalKEffects.g:2370:7: (lv_subExpressions_15_0= ruleSumExpression )
        // InternalKEffects.g:2371:8: lv_subExpressions_15_0= ruleSumExpression
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
    // $ANTLR end synpred58_InternalKEffects

    // $ANTLR start synpred64_InternalKEffects
    public final void synpred64_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKEffects.g:2686:6: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )
        // InternalKEffects.g:2686:6: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) )
        {
        otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_28); if (state.failed) return ;
        // InternalKEffects.g:2690:6: ( (lv_subExpressions_5_0= ruleProductExpression ) )
        // InternalKEffects.g:2691:7: (lv_subExpressions_5_0= ruleProductExpression )
        {
        // InternalKEffects.g:2691:7: (lv_subExpressions_5_0= ruleProductExpression )
        // InternalKEffects.g:2692:8: lv_subExpressions_5_0= ruleProductExpression
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
    // $ANTLR end synpred64_InternalKEffects

    // $ANTLR start synpred66_InternalKEffects
    public final void synpred66_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKEffects.g:2762:6: (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )
        // InternalKEffects.g:2762:6: otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) )
        {
        otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_28); if (state.failed) return ;
        // InternalKEffects.g:2766:6: ( (lv_subExpressions_10_0= ruleProductExpression ) )
        // InternalKEffects.g:2767:7: (lv_subExpressions_10_0= ruleProductExpression )
        {
        // InternalKEffects.g:2767:7: (lv_subExpressions_10_0= ruleProductExpression )
        // InternalKEffects.g:2768:8: lv_subExpressions_10_0= ruleProductExpression
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
    // $ANTLR end synpred66_InternalKEffects

    // $ANTLR start synpred68_InternalKEffects
    public final void synpred68_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKEffects.g:2869:6: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )
        // InternalKEffects.g:2869:6: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) )
        {
        otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_28); if (state.failed) return ;
        // InternalKEffects.g:2873:6: ( (lv_subExpressions_5_0= ruleNegExpression ) )
        // InternalKEffects.g:2874:7: (lv_subExpressions_5_0= ruleNegExpression )
        {
        // InternalKEffects.g:2874:7: (lv_subExpressions_5_0= ruleNegExpression )
        // InternalKEffects.g:2875:8: lv_subExpressions_5_0= ruleNegExpression
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
    // $ANTLR end synpred68_InternalKEffects

    // $ANTLR start synpred70_InternalKEffects
    public final void synpred70_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKEffects.g:2945:6: (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )
        // InternalKEffects.g:2945:6: otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) )
        {
        otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_28); if (state.failed) return ;
        // InternalKEffects.g:2949:6: ( (lv_subExpressions_10_0= ruleNegExpression ) )
        // InternalKEffects.g:2950:7: (lv_subExpressions_10_0= ruleNegExpression )
        {
        // InternalKEffects.g:2950:7: (lv_subExpressions_10_0= ruleNegExpression )
        // InternalKEffects.g:2951:8: lv_subExpressions_10_0= ruleNegExpression
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
    // $ANTLR end synpred70_InternalKEffects

    // $ANTLR start synpred72_InternalKEffects
    public final void synpred72_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_14=null;
        EObject lv_subExpressions_15_0 = null;


        // InternalKEffects.g:3021:6: (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )
        // InternalKEffects.g:3021:6: otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) )
        {
        otherlv_14=(Token)match(input,40,FollowSets000.FOLLOW_28); if (state.failed) return ;
        // InternalKEffects.g:3025:6: ( (lv_subExpressions_15_0= ruleNegExpression ) )
        // InternalKEffects.g:3026:7: (lv_subExpressions_15_0= ruleNegExpression )
        {
        // InternalKEffects.g:3026:7: (lv_subExpressions_15_0= ruleNegExpression )
        // InternalKEffects.g:3027:8: lv_subExpressions_15_0= ruleNegExpression
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
    // $ANTLR end synpred72_InternalKEffects

    // $ANTLR start synpred76_InternalKEffects
    public final void synpred76_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKEffects.g:3147:3: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) )
        // InternalKEffects.g:3147:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? )
        {
        // InternalKEffects.g:3147:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? )
        // InternalKEffects.g:3148:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )?
        {
        // InternalKEffects.g:3148:4: ()
        // InternalKEffects.g:3149:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalKEffects.g:3158:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
        // InternalKEffects.g:3159:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        {
        // InternalKEffects.g:3159:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        // InternalKEffects.g:3160:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_33);
        lv_subExpressions_1_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKEffects.g:3177:4: ( (lv_operator_2_0= ruleConditionalOperator ) )
        // InternalKEffects.g:3178:5: (lv_operator_2_0= ruleConditionalOperator )
        {
        // InternalKEffects.g:3178:5: (lv_operator_2_0= ruleConditionalOperator )
        // InternalKEffects.g:3179:6: lv_operator_2_0= ruleConditionalOperator
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_34);
        lv_operator_2_0=ruleConditionalOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKEffects.g:3196:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
        // InternalKEffects.g:3197:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        {
        // InternalKEffects.g:3197:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        // InternalKEffects.g:3198:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_35);
        lv_subExpressions_3_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKEffects.g:3215:4: (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )?
        int alt148=2;
        int LA148_0 = input.LA(1);

        if ( (LA148_0==41) ) {
            alt148=1;
        }
        switch (alt148) {
            case 1 :
                // InternalKEffects.g:3216:5: otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                {
                otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_34); if (state.failed) return ;
                // InternalKEffects.g:3220:5: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                // InternalKEffects.g:3221:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                {
                // InternalKEffects.g:3221:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                // InternalKEffects.g:3222:7: lv_subExpressions_5_0= ruleAtomicValuedExpression
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
    // $ANTLR end synpred76_InternalKEffects

    // $ANTLR start synpred85_InternalKEffects
    public final void synpred85_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_ReferenceCall_4 = null;


        // InternalKEffects.g:3627:3: (this_ReferenceCall_4= ruleReferenceCall )
        // InternalKEffects.g:3627:3: this_ReferenceCall_4= ruleReferenceCall
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ReferenceCall_4=ruleReferenceCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred85_InternalKEffects

    // $ANTLR start synpred89_InternalKEffects
    public final void synpred89_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_ValuedObjectTestExpression_8 = null;


        // InternalKEffects.g:3675:3: (this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression )
        // InternalKEffects.g:3675:3: this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ValuedObjectTestExpression_8=ruleValuedObjectTestExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_InternalKEffects

    // $ANTLR start synpred96_InternalKEffects
    public final void synpred96_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_ValuedExpression_6 = null;


        // InternalKEffects.g:3789:3: ( (otherlv_5= '(' this_ValuedExpression_6= ruleValuedExpression otherlv_7= ')' ) )
        // InternalKEffects.g:3789:3: (otherlv_5= '(' this_ValuedExpression_6= ruleValuedExpression otherlv_7= ')' )
        {
        // InternalKEffects.g:3789:3: (otherlv_5= '(' this_ValuedExpression_6= ruleValuedExpression otherlv_7= ')' )
        // InternalKEffects.g:3790:4: otherlv_5= '(' this_ValuedExpression_6= ruleValuedExpression otherlv_7= ')'
        {
        otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_28); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_9);
        this_ValuedExpression_6=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred96_InternalKEffects

    // $ANTLR start synpred117_InternalKEffects
    public final void synpred117_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKEffects.g:5018:3: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKEffects.g:5018:3: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred117_InternalKEffects

    // $ANTLR start synpred118_InternalKEffects
    public final void synpred118_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_1 = null;


        // InternalKEffects.g:5030:3: (this_ValuedExpression_1= ruleValuedExpression )
        // InternalKEffects.g:5030:3: this_ValuedExpression_1= ruleValuedExpression
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
    // $ANTLR end synpred118_InternalKEffects

    // $ANTLR start synpred132_InternalKEffects
    public final void synpred132_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_KeyStringValueAnnotation_1 = null;


        // InternalKEffects.g:5714:3: (this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation )
        // InternalKEffects.g:5714:3: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
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
    // $ANTLR end synpred132_InternalKEffects

    // Delegated rules

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
    public final boolean synpred89_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalKEffects_fragment(); // can never throw exception
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
    public final boolean synpred76_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_InternalKEffects_fragment(); // can never throw exception
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
    public final boolean synpred96_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalKEffects_fragment(); // can never throw exception
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
    public final boolean synpred56_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalKEffects_fragment(); // can never throw exception
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
    public final boolean synpred132_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalKEffects_fragment(); // can never throw exception
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
    public final boolean synpred118_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred118_InternalKEffects_fragment(); // can never throw exception
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
    public final boolean synpred51_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalKEffects_fragment(); // can never throw exception
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
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA101 dfa101 = new DFA101(this);
    protected DFA102 dfa102 = new DFA102(this);
    protected DFA103 dfa103 = new DFA103(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA105 dfa105 = new DFA105(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\3\0\11\uffff";
    static final String dfa_3s = "\1\66\3\0\11\uffff";
    static final String dfa_4s = "\4\uffff\1\4\1\6\1\7\1\10\1\1\1\2\1\3\1\5\1\11";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\3\4\uffff\1\1\16\uffff\1\5\1\6\1\7\32\uffff\1\2",
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
    static final String dfa_7s = "\26\uffff";
    static final String dfa_8s = "\1\4\22\0\3\uffff";
    static final String dfa_9s = "\1\120\22\0\3\uffff";
    static final String dfa_10s = "\23\uffff\1\1\1\uffff\1\2";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\3\uffff}>";
    static final String[] dfa_12s = {
            "\1\22\1\11\1\2\1\3\1\10\1\4\1\20\7\uffff\1\7\6\uffff\1\12\1\uffff\1\14\11\uffff\1\1\7\uffff\1\17\1\uffff\1\13\1\5\3\uffff\1\6\1\uffff\1\21\26\uffff\1\15\2\23\1\16",
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

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1233:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_7 = input.LA(1);

                         
                        int index32_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_9 = input.LA(1);

                         
                        int index32_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_10 = input.LA(1);

                         
                        int index32_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA32_11 = input.LA(1);

                         
                        int index32_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA32_12 = input.LA(1);

                         
                        int index32_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA32_13 = input.LA(1);

                         
                        int index32_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA32_14 = input.LA(1);

                         
                        int index32_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA32_15 = input.LA(1);

                         
                        int index32_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA32_16 = input.LA(1);

                         
                        int index32_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA32_17 = input.LA(1);

                         
                        int index32_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA32_18 = input.LA(1);

                         
                        int index32_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalKEffects()) ) {s = 19;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index32_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\25\uffff";
    static final String dfa_14s = "\1\4\6\uffff\14\0\2\uffff";
    static final String dfa_15s = "\1\120\6\uffff\14\0\2\uffff";
    static final String dfa_16s = "\1\uffff\1\1\21\uffff\1\2\1\uffff";
    static final String dfa_17s = "\7\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff}>";
    static final String[] dfa_18s = {
            "\1\22\1\11\2\1\1\10\1\1\1\20\7\uffff\1\7\6\uffff\1\12\1\uffff\1\14\11\uffff\1\1\7\uffff\1\17\1\uffff\1\13\1\1\3\uffff\1\1\1\uffff\1\21\26\uffff\1\15\2\23\1\16",
            "",
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

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1918:2: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_7 = input.LA(1);

                         
                        int index44_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index44_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_8 = input.LA(1);

                         
                        int index44_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index44_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA44_9 = input.LA(1);

                         
                        int index44_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index44_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA44_10 = input.LA(1);

                         
                        int index44_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index44_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA44_11 = input.LA(1);

                         
                        int index44_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index44_11);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA44_12 = input.LA(1);

                         
                        int index44_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index44_12);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA44_13 = input.LA(1);

                         
                        int index44_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index44_13);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA44_14 = input.LA(1);

                         
                        int index44_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index44_14);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA44_15 = input.LA(1);

                         
                        int index44_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index44_15);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA44_16 = input.LA(1);

                         
                        int index44_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index44_16);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA44_17 = input.LA(1);

                         
                        int index44_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index44_17);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA44_18 = input.LA(1);

                         
                        int index44_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index44_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\1\1\25\uffff";
    static final String dfa_20s = "\1\21\21\uffff\1\0\3\uffff";
    static final String dfa_21s = "\1\114\21\uffff\1\0\3\uffff";
    static final String dfa_22s = "\1\uffff\1\2\23\uffff\1\1";
    static final String dfa_23s = "\22\uffff\1\0\3\uffff}>";
    static final String[] dfa_24s = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff\5\1\1\22\2\1\16\uffff\1\1\24\uffff\6\1",
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
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_7;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()* loopback of 2212:5: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_18 = input.LA(1);

                         
                        int index47_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalKEffects()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\1\21\22\uffff\1\0\2\uffff";
    static final String dfa_26s = "\1\114\22\uffff\1\0\2\uffff";
    static final String dfa_27s = "\23\uffff\1\0\2\uffff}>";
    static final String[] dfa_28s = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff\6\1\1\23\1\1\16\uffff\1\1\24\uffff\6\1",
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
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_7;
            this.eof = dfa_19;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_22;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 2288:5: (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_19 = input.LA(1);

                         
                        int index48_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_InternalKEffects()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_29s = "\1\21\23\uffff\1\0\1\uffff";
    static final String dfa_30s = "\1\114\23\uffff\1\0\1\uffff";
    static final String dfa_31s = "\24\uffff\1\0\1\uffff}>";
    static final String[] dfa_32s = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff\7\1\1\24\16\uffff\1\1\24\uffff\6\1",
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
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_7;
            this.eof = dfa_19;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_22;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "()* loopback of 2364:5: (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_20 = input.LA(1);

                         
                        int index49_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKEffects()) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_20);
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
    static final String dfa_33s = "\30\uffff";
    static final String dfa_34s = "\1\1\27\uffff";
    static final String dfa_35s = "\1\21\24\uffff\1\0\2\uffff";
    static final String dfa_36s = "\1\114\24\uffff\1\0\2\uffff";
    static final String dfa_37s = "\1\uffff\1\2\25\uffff\1\1";
    static final String dfa_38s = "\25\uffff\1\0\2\uffff}>";
    static final String[] dfa_39s = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff\10\1\1\25\1\1\14\uffff\1\1\24\uffff\6\1",
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

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_33;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "()* loopback of 2685:5: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_21 = input.LA(1);

                         
                        int index55_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalKEffects()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_40s = "\1\21\25\uffff\1\0\1\uffff";
    static final String dfa_41s = "\1\114\25\uffff\1\0\1\uffff";
    static final String dfa_42s = "\26\uffff\1\0\1\uffff}>";
    static final String[] dfa_43s = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff\11\1\1\26\14\uffff\1\1\24\uffff\6\1",
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
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_33;
            this.eof = dfa_34;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_37;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "()* loopback of 2761:5: (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_22 = input.LA(1);

                         
                        int index56_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKEffects()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_44s = "\33\uffff";
    static final String dfa_45s = "\1\1\32\uffff";
    static final String dfa_46s = "\1\21\26\uffff\1\0\3\uffff";
    static final String dfa_47s = "\1\114\26\uffff\1\0\3\uffff";
    static final String dfa_48s = "\1\uffff\1\2\30\uffff\1\1";
    static final String dfa_49s = "\27\uffff\1\0\3\uffff}>";
    static final String[] dfa_50s = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff\12\1\1\27\2\1\11\uffff\1\1\24\uffff\6\1",
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

    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_44;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_49;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "()* loopback of 2868:5: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_23 = input.LA(1);

                         
                        int index58_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalKEffects()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_23);
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
    static final String dfa_51s = "\1\21\27\uffff\1\0\2\uffff";
    static final String dfa_52s = "\1\114\27\uffff\1\0\2\uffff";
    static final String dfa_53s = "\30\uffff\1\0\2\uffff}>";
    static final String[] dfa_54s = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff\13\1\1\30\1\1\11\uffff\1\1\24\uffff\6\1",
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
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[][] dfa_54 = unpackEncodedStringArray(dfa_54s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_44;
            this.eof = dfa_45;
            this.min = dfa_51;
            this.max = dfa_52;
            this.accept = dfa_48;
            this.special = dfa_53;
            this.transition = dfa_54;
        }
        public String getDescription() {
            return "()* loopback of 2944:5: (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_24 = input.LA(1);

                         
                        int index59_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalKEffects()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_24);
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
    static final String dfa_55s = "\1\21\30\uffff\1\0\1\uffff";
    static final String dfa_56s = "\1\114\30\uffff\1\0\1\uffff";
    static final String dfa_57s = "\31\uffff\1\0\1\uffff}>";
    static final String[] dfa_58s = {
            "\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff\14\1\1\31\11\uffff\1\1\24\uffff\6\1",
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
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[][] dfa_58 = unpackEncodedStringArray(dfa_58s);

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = dfa_44;
            this.eof = dfa_45;
            this.min = dfa_55;
            this.max = dfa_56;
            this.accept = dfa_48;
            this.special = dfa_57;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "()* loopback of 3020:5: (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_25 = input.LA(1);

                         
                        int index60_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalKEffects()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index60_25);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_59s = "\24\uffff";
    static final String dfa_60s = "\1\4\21\0\2\uffff";
    static final String dfa_61s = "\1\120\21\0\2\uffff";
    static final String dfa_62s = "\22\uffff\1\1\1\2";
    static final String dfa_63s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\2\uffff}>";
    static final String[] dfa_64s = {
            "\1\21\1\10\1\1\1\2\1\7\1\3\1\17\7\uffff\1\6\6\uffff\1\11\1\uffff\1\13\21\uffff\1\16\1\uffff\1\12\1\4\3\uffff\1\5\1\uffff\1\20\26\uffff\1\14\2\uffff\1\15",
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
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[][] dfa_64 = unpackEncodedStringArray(dfa_64s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_59;
            this.eof = dfa_59;
            this.min = dfa_60;
            this.max = dfa_61;
            this.accept = dfa_62;
            this.special = dfa_63;
            this.transition = dfa_64;
        }
        public String getDescription() {
            return "3146:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_3 = input.LA(1);

                         
                        int index64_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA64_4 = input.LA(1);

                         
                        int index64_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA64_5 = input.LA(1);

                         
                        int index64_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA64_6 = input.LA(1);

                         
                        int index64_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA64_7 = input.LA(1);

                         
                        int index64_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA64_8 = input.LA(1);

                         
                        int index64_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA64_9 = input.LA(1);

                         
                        int index64_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA64_10 = input.LA(1);

                         
                        int index64_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA64_11 = input.LA(1);

                         
                        int index64_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA64_12 = input.LA(1);

                         
                        int index64_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA64_13 = input.LA(1);

                         
                        int index64_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA64_14 = input.LA(1);

                         
                        int index64_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA64_15 = input.LA(1);

                         
                        int index64_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA64_16 = input.LA(1);

                         
                        int index64_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA64_17 = input.LA(1);

                         
                        int index64_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index64_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_65s = "\16\uffff";
    static final String dfa_66s = "\1\4\2\uffff\1\0\12\uffff";
    static final String dfa_67s = "\1\120\2\uffff\1\0\12\uffff";
    static final String dfa_68s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\2\uffff\1\3";
    static final String dfa_69s = "\3\uffff\1\0\12\uffff}>";
    static final String[] dfa_70s = {
            "\1\12\1\3\2\uffff\1\1\1\uffff\1\12\7\uffff\1\2\6\uffff\1\4\1\uffff\1\6\21\uffff\1\11\1\uffff\1\5\6\uffff\1\12\26\uffff\1\7\2\uffff\1\7",
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
            ""
    };

    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final char[] dfa_66 = DFA.unpackEncodedStringToUnsignedChars(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[][] dfa_70 = unpackEncodedStringArray(dfa_70s);

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_65;
            this.eof = dfa_65;
            this.min = dfa_66;
            this.max = dfa_67;
            this.accept = dfa_68;
            this.special = dfa_69;
            this.transition = dfa_70;
        }
        public String getDescription() {
            return "3592:2: (this_BoolValue_0= ruleBoolValue | (otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')' ) | this_ReferenceCall_4= ruleReferenceCall | this_FunctionCall_5= ruleFunctionCall | this_RandomCall_6= ruleRandomCall | this_RandomizeCall_7= ruleRandomizeCall | this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression | this_SpecialAccessExpression_9= ruleSpecialAccessExpression | this_TextExpression_10= ruleTextExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_3 = input.LA(1);

                         
                        int index71_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalKEffects()) ) {s = 13;}

                        else if ( (synpred89_InternalKEffects()) ) {s = 7;}

                         
                        input.seek(index71_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_71s = "\23\uffff";
    static final String dfa_72s = "\1\4\5\uffff\1\0\14\uffff";
    static final String dfa_73s = "\1\120\5\uffff\1\0\14\uffff";
    static final String dfa_74s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\12\uffff\1\6";
    static final String dfa_75s = "\6\uffff\1\0\14\uffff}>";
    static final String[] dfa_76s = {
            "\2\7\1\1\1\2\1\7\1\3\1\7\7\uffff\1\6\6\uffff\1\7\1\uffff\1\7\21\uffff\1\7\1\uffff\1\7\1\4\3\uffff\1\5\1\uffff\1\7\26\uffff\1\7\2\uffff\1\7",
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
            "",
            ""
    };

    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final char[] dfa_72 = DFA.unpackEncodedStringToUnsignedChars(dfa_72s);
    static final char[] dfa_73 = DFA.unpackEncodedStringToUnsignedChars(dfa_73s);
    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final short[] dfa_75 = DFA.unpackEncodedString(dfa_75s);
    static final short[][] dfa_76 = unpackEncodedStringArray(dfa_76s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_71;
            this.eof = dfa_71;
            this.min = dfa_72;
            this.max = dfa_73;
            this.accept = dfa_74;
            this.special = dfa_75;
            this.transition = dfa_76;
        }
        public String getDescription() {
            return "3728:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | this_NullValue_4= ruleNullValue | (otherlv_5= '(' this_ValuedExpression_6= ruleValuedExpression otherlv_7= ')' ) | this_AtomicExpression_8= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_6 = input.LA(1);

                         
                        int index72_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalKEffects()) ) {s = 18;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index72_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_77s = "\5\uffff";
    static final String dfa_78s = "\1\5\2\23\2\uffff";
    static final String dfa_79s = "\1\5\2\56\2\uffff";
    static final String dfa_80s = "\3\uffff\1\2\1\1";
    static final String dfa_81s = "\5\uffff}>";
    static final String[] dfa_82s = {
            "\1\1",
            "\1\3\2\uffff\1\4\27\uffff\1\2",
            "\1\3\2\uffff\1\4\27\uffff\1\2",
            "",
            ""
    };

    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final char[] dfa_78 = DFA.unpackEncodedStringToUnsignedChars(dfa_78s);
    static final char[] dfa_79 = DFA.unpackEncodedStringToUnsignedChars(dfa_79s);
    static final short[] dfa_80 = DFA.unpackEncodedString(dfa_80s);
    static final short[] dfa_81 = DFA.unpackEncodedString(dfa_81s);
    static final short[][] dfa_82 = unpackEncodedStringArray(dfa_82s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_77;
            this.eof = dfa_77;
            this.min = dfa_78;
            this.max = dfa_79;
            this.accept = dfa_80;
            this.special = dfa_81;
            this.transition = dfa_82;
        }
        public String getDescription() {
            return "3991:3: ( ( ( rulePrimeID ) ) otherlv_3= '.' )?";
        }
    }
    static final String dfa_83s = "\27\uffff";
    static final String dfa_84s = "\1\4\22\0\4\uffff";
    static final String dfa_85s = "\1\120\22\0\4\uffff";
    static final String dfa_86s = "\23\uffff\1\1\1\uffff\1\3\1\2";
    static final String dfa_87s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\4\uffff}>";
    static final String[] dfa_88s = {
            "\1\22\1\11\1\2\1\3\1\10\1\4\1\20\7\uffff\1\7\6\uffff\1\12\1\uffff\1\14\11\uffff\1\1\7\uffff\1\17\1\uffff\1\13\1\5\2\uffff\1\25\1\6\1\uffff\1\21\26\uffff\1\15\2\23\1\16",
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
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_83 = DFA.unpackEncodedString(dfa_83s);
    static final char[] dfa_84 = DFA.unpackEncodedStringToUnsignedChars(dfa_84s);
    static final char[] dfa_85 = DFA.unpackEncodedStringToUnsignedChars(dfa_85s);
    static final short[] dfa_86 = DFA.unpackEncodedString(dfa_86s);
    static final short[] dfa_87 = DFA.unpackEncodedString(dfa_87s);
    static final short[][] dfa_88 = unpackEncodedStringArray(dfa_88s);

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = dfa_83;
            this.eof = dfa_83;
            this.min = dfa_84;
            this.max = dfa_85;
            this.accept = dfa_86;
            this.special = dfa_87;
            this.transition = dfa_88;
        }
        public String getDescription() {
            return "5017:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA93_1 = input.LA(1);

                         
                        int index93_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA93_2 = input.LA(1);

                         
                        int index93_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA93_3 = input.LA(1);

                         
                        int index93_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA93_4 = input.LA(1);

                         
                        int index93_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA93_5 = input.LA(1);

                         
                        int index93_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA93_6 = input.LA(1);

                         
                        int index93_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA93_7 = input.LA(1);

                         
                        int index93_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA93_8 = input.LA(1);

                         
                        int index93_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA93_9 = input.LA(1);

                         
                        int index93_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA93_10 = input.LA(1);

                         
                        int index93_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA93_11 = input.LA(1);

                         
                        int index93_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA93_12 = input.LA(1);

                         
                        int index93_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA93_13 = input.LA(1);

                         
                        int index93_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA93_14 = input.LA(1);

                         
                        int index93_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA93_15 = input.LA(1);

                         
                        int index93_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA93_16 = input.LA(1);

                         
                        int index93_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA93_17 = input.LA(1);

                         
                        int index93_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA93_18 = input.LA(1);

                         
                        int index93_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalKEffects()) ) {s = 19;}

                        else if ( (synpred118_InternalKEffects()) ) {s = 22;}

                         
                        input.seek(index93_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 93, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_89s = "\12\uffff";
    static final String dfa_90s = "\3\uffff\1\1\4\uffff\2\1";
    static final String dfa_91s = "\1\12\1\uffff\1\5\1\4\2\5\1\6\1\uffff\2\4";
    static final String dfa_92s = "\1\66\1\uffff\1\5\1\66\1\5\1\7\1\6\1\uffff\2\66";
    static final String dfa_93s = "\1\uffff\1\1\5\uffff\1\2\2\uffff";
    static final String dfa_94s = "\12\uffff}>";
    static final String[] dfa_95s = {
            "\1\1\53\uffff\1\2",
            "",
            "\1\3",
            "\7\1\11\uffff\1\1\1\uffff\1\4\2\uffff\3\1\11\uffff\1\5\12\uffff\1\7\4\uffff\1\6\1\1",
            "\1\10",
            "\1\10\2\1",
            "\1\11",
            "",
            "\7\1\11\uffff\1\1\1\uffff\1\4\2\uffff\3\1\11\uffff\1\5\12\uffff\1\7\4\uffff\1\6\1\1",
            "\7\1\11\uffff\1\1\4\uffff\3\1\11\uffff\1\1\12\uffff\1\7\5\uffff\1\1"
    };

    static final short[] dfa_89 = DFA.unpackEncodedString(dfa_89s);
    static final short[] dfa_90 = DFA.unpackEncodedString(dfa_90s);
    static final char[] dfa_91 = DFA.unpackEncodedStringToUnsignedChars(dfa_91s);
    static final char[] dfa_92 = DFA.unpackEncodedStringToUnsignedChars(dfa_92s);
    static final short[] dfa_93 = DFA.unpackEncodedString(dfa_93s);
    static final short[] dfa_94 = DFA.unpackEncodedString(dfa_94s);
    static final short[][] dfa_95 = unpackEncodedStringArray(dfa_95s);

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = dfa_89;
            this.eof = dfa_90;
            this.min = dfa_91;
            this.max = dfa_92;
            this.accept = dfa_93;
            this.special = dfa_94;
            this.transition = dfa_95;
        }
        public String getDescription() {
            return "5617:2: (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )";
        }
    }
    static final String dfa_96s = "\1\12\1\uffff\4\5\1\6\1\uffff\2\5";
    static final String dfa_97s = "\1\66\1\uffff\1\5\1\66\2\5\1\6\1\uffff\2\66";
    static final String[] dfa_98s = {
            "\1\1\53\uffff\1\2",
            "",
            "\1\3",
            "\1\1\3\uffff\2\1\11\uffff\1\1\1\uffff\1\4\16\uffff\1\5\12\uffff\1\7\4\uffff\1\6\1\1",
            "\1\10",
            "\1\10",
            "\1\11",
            "",
            "\1\1\3\uffff\2\1\11\uffff\1\1\1\uffff\1\4\16\uffff\1\5\12\uffff\1\7\4\uffff\1\6\1\1",
            "\1\1\3\uffff\2\1\11\uffff\1\1\33\uffff\1\7\5\uffff\1\1"
    };
    static final char[] dfa_96 = DFA.unpackEncodedStringToUnsignedChars(dfa_96s);
    static final char[] dfa_97 = DFA.unpackEncodedStringToUnsignedChars(dfa_97s);
    static final short[][] dfa_98 = unpackEncodedStringArray(dfa_98s);

    class DFA101 extends DFA {

        public DFA101(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 101;
            this.eot = dfa_89;
            this.eof = dfa_90;
            this.min = dfa_96;
            this.max = dfa_97;
            this.accept = dfa_93;
            this.special = dfa_94;
            this.transition = dfa_98;
        }
        public String getDescription() {
            return "5659:2: (this_QuotedStringAnnotation_0= superQuotedStringAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )";
        }
    }
    static final String dfa_99s = "\3\uffff\1\12\5\uffff\1\10\1\uffff\2\12\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff";
    static final String dfa_100s = "\1\12\1\uffff\1\5\1\4\2\5\1\6\2\uffff\1\4\1\uffff\2\4\1\5\1\4\1\5\1\4\1\5\1\4\1\5\1\4\1\0";
    static final String dfa_101s = "\1\66\1\uffff\1\5\1\66\1\5\1\7\1\6\2\uffff\1\106\1\uffff\2\66\1\5\1\106\1\5\1\106\1\5\1\106\1\5\1\106\1\0";
    static final String dfa_102s = "\1\uffff\1\1\5\uffff\1\3\1\2\1\uffff\1\4\13\uffff";
    static final String dfa_103s = "\25\uffff\1\0}>";
    static final String[] dfa_104s = {
            "\1\1\53\uffff\1\2",
            "",
            "\1\3",
            "\1\12\1\11\4\10\1\12\11\uffff\1\7\1\uffff\1\4\2\uffff\3\12\11\uffff\1\5\17\uffff\1\6\1\12",
            "\1\13",
            "\1\13\2\10",
            "\1\14",
            "",
            "",
            "\2\10\4\uffff\1\10\7\uffff\1\12\1\uffff\1\12\1\uffff\1\15\1\10\1\12\3\10\11\uffff\1\10\10\uffff\1\12\6\uffff\2\10\20\12",
            "",
            "\1\12\1\11\4\10\1\12\11\uffff\1\7\1\uffff\1\4\2\uffff\3\12\11\uffff\1\5\17\uffff\1\6\1\12",
            "\1\12\1\11\4\10\1\12\11\uffff\1\7\4\uffff\3\12\11\uffff\1\10\20\uffff\1\12",
            "\1\16",
            "\2\10\4\uffff\1\10\7\uffff\1\12\1\uffff\1\12\1\uffff\1\17\1\10\1\12\3\10\11\uffff\1\10\10\uffff\1\12\6\uffff\2\10\20\12",
            "\1\20",
            "\2\10\4\uffff\1\10\7\uffff\1\12\1\uffff\1\12\1\uffff\1\21\1\10\1\12\3\10\11\uffff\1\10\10\uffff\1\12\6\uffff\2\10\20\12",
            "\1\22",
            "\2\10\4\uffff\1\10\7\uffff\1\12\1\uffff\1\12\1\uffff\1\23\1\10\1\12\3\10\11\uffff\1\10\10\uffff\1\12\6\uffff\2\10\20\12",
            "\1\24",
            "\2\10\4\uffff\1\10\7\uffff\1\12\1\uffff\1\12\1\uffff\1\25\1\10\1\12\3\10\11\uffff\1\10\10\uffff\1\12\6\uffff\2\10\20\12",
            "\1\uffff"
    };
    static final short[] dfa_99 = DFA.unpackEncodedString(dfa_99s);
    static final char[] dfa_100 = DFA.unpackEncodedStringToUnsignedChars(dfa_100s);
    static final char[] dfa_101 = DFA.unpackEncodedStringToUnsignedChars(dfa_101s);
    static final short[] dfa_102 = DFA.unpackEncodedString(dfa_102s);
    static final short[] dfa_103 = DFA.unpackEncodedString(dfa_103s);
    static final short[][] dfa_104 = unpackEncodedStringArray(dfa_104s);

    class DFA102 extends DFA {

        public DFA102(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 102;
            this.eot = dfa_7;
            this.eof = dfa_99;
            this.min = dfa_100;
            this.max = dfa_101;
            this.accept = dfa_102;
            this.special = dfa_103;
            this.transition = dfa_104;
        }
        public String getDescription() {
            return "5701:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA102_21 = input.LA(1);

                         
                        int index102_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalKEffects()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index102_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 102, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_105s = "\2\uffff\1\6\5\uffff\2\6";
    static final String dfa_106s = "\1\65\4\5\1\6\2\uffff\2\5";
    static final String dfa_107s = "\1\65\1\5\1\65\1\5\1\7\1\6\2\uffff\1\65\1\45";
    static final String dfa_108s = "\6\uffff\1\2\1\1\2\uffff";
    static final String[] dfa_109s = {
            "\1\1",
            "\1\2",
            "\5\7\14\uffff\1\3\16\uffff\1\4\17\uffff\1\5",
            "\1\10",
            "\1\10\2\7",
            "\1\11",
            "",
            "",
            "\5\7\14\uffff\1\3\16\uffff\1\4\17\uffff\1\5",
            "\5\7\33\uffff\1\7"
    };
    static final short[] dfa_105 = DFA.unpackEncodedString(dfa_105s);
    static final char[] dfa_106 = DFA.unpackEncodedStringToUnsignedChars(dfa_106s);
    static final char[] dfa_107 = DFA.unpackEncodedStringToUnsignedChars(dfa_107s);
    static final short[] dfa_108 = DFA.unpackEncodedString(dfa_108s);
    static final short[][] dfa_109 = unpackEncodedStringArray(dfa_109s);

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = dfa_89;
            this.eof = dfa_105;
            this.min = dfa_106;
            this.max = dfa_107;
            this.accept = dfa_108;
            this.special = dfa_94;
            this.transition = dfa_109;
        }
        public String getDescription() {
            return "5767:2: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )";
        }
    }
    static final String dfa_110s = "\13\uffff";
    static final String dfa_111s = "\1\12\1\uffff\4\5\1\6\2\uffff\2\5";
    static final String dfa_112s = "\1\66\1\uffff\1\5\1\65\1\5\1\7\1\6\2\uffff\1\65\1\45";
    static final String dfa_113s = "\1\uffff\1\1\5\uffff\1\2\1\3\2\uffff";
    static final String dfa_114s = "\13\uffff}>";
    static final String[] dfa_115s = {
            "\1\1\53\uffff\1\2",
            "",
            "\1\3",
            "\5\7\12\uffff\1\10\1\uffff\1\4\16\uffff\1\5\17\uffff\1\6",
            "\1\11",
            "\1\11\2\7",
            "\1\12",
            "",
            "",
            "\5\7\12\uffff\1\10\1\uffff\1\4\16\uffff\1\5\17\uffff\1\6",
            "\5\7\12\uffff\1\10\20\uffff\1\7"
    };

    static final short[] dfa_110 = DFA.unpackEncodedString(dfa_110s);
    static final char[] dfa_111 = DFA.unpackEncodedStringToUnsignedChars(dfa_111s);
    static final char[] dfa_112 = DFA.unpackEncodedStringToUnsignedChars(dfa_112s);
    static final short[] dfa_113 = DFA.unpackEncodedString(dfa_113s);
    static final short[] dfa_114 = DFA.unpackEncodedString(dfa_114s);
    static final short[][] dfa_115 = unpackEncodedStringArray(dfa_115s);

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = dfa_110;
            this.eof = dfa_110;
            this.min = dfa_111;
            this.max = dfa_112;
            this.accept = dfa_113;
            this.special = dfa_114;
            this.transition = dfa_115;
        }
        public String getDescription() {
            return "5809:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation )";
        }
    }
    static final String dfa_116s = "\14\uffff";
    static final String dfa_117s = "\3\uffff\1\7\6\uffff\2\7";
    static final String dfa_118s = "\1\12\1\uffff\4\5\1\6\3\uffff\2\5";
    static final String dfa_119s = "\1\66\1\uffff\1\5\1\66\2\5\1\6\3\uffff\2\66";
    static final String dfa_120s = "\1\uffff\1\1\5\uffff\1\4\1\3\1\2\2\uffff";
    static final String dfa_121s = "\14\uffff}>";
    static final String[] dfa_122s = {
            "\1\1\53\uffff\1\2",
            "",
            "\1\3",
            "\1\7\3\uffff\1\11\1\7\11\uffff\1\10\1\uffff\1\4\16\uffff\1\5\17\uffff\1\6\1\7",
            "\1\12",
            "\1\12",
            "\1\13",
            "",
            "",
            "",
            "\1\7\3\uffff\1\11\1\7\11\uffff\1\10\1\uffff\1\4\16\uffff\1\5\17\uffff\1\6\1\7",
            "\1\7\3\uffff\1\11\1\7\11\uffff\1\10\41\uffff\1\7"
    };

    static final short[] dfa_116 = DFA.unpackEncodedString(dfa_116s);
    static final short[] dfa_117 = DFA.unpackEncodedString(dfa_117s);
    static final char[] dfa_118 = DFA.unpackEncodedStringToUnsignedChars(dfa_118s);
    static final char[] dfa_119 = DFA.unpackEncodedStringToUnsignedChars(dfa_119s);
    static final short[] dfa_120 = DFA.unpackEncodedString(dfa_120s);
    static final short[] dfa_121 = DFA.unpackEncodedString(dfa_121s);
    static final short[][] dfa_122 = unpackEncodedStringArray(dfa_122s);

    class DFA105 extends DFA {

        public DFA105(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 105;
            this.eot = dfa_116;
            this.eof = dfa_117;
            this.min = dfa_118;
            this.max = dfa_119;
            this.accept = dfa_120;
            this.special = dfa_121;
            this.transition = dfa_122;
        }
        public String getDescription() {
            return "5863:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0040000000000420L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0051A0200A0407F0L,0x000000000001E000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xFF80000000000000L,0x000000000000001FL});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0040000000000430L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001540000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0051A0210A0407F0L,0x000000000005E000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000880000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0040000002000420L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0040000004000420L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0040000008000420L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001F80L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000E00000002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0051A0200A0407F0L,0x0000000000012000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003000000002L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000001C000000002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0051A0000A0407F0L,0x0000000000012000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000020L,0x0000000000012000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000500002L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0059A0200A0407F0L,0x000000000001E000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000800000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000200L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00110000001003C0L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00110000003003C0L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00000020000003E0L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000320L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0020002000400002L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000080L});
    }


}