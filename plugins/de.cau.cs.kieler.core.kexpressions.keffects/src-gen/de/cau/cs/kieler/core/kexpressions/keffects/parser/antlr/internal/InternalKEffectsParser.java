package de.cau.cs.kieler.core.kexpressions.keffects.parser.antlr.internal; 

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
import de.cau.cs.kieler.core.kexpressions.keffects.services.KEffectsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKEffectsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'['", "']'", "'<'", "','", "'()'", "'>'", "'!'", "'&'", "'@'", "'.'", "'#'", "'-'", "'='", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'|'", "'+'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=4;
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
    public static final int RULE_INT=6;
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
    public static final int RULE_HOSTCODE=5;
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


        public InternalKEffectsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKEffectsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKEffectsParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g"; }



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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:74:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:75:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:76:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEffect_in_entryRuleEffect81);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEffect91); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:83:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_PostfixEffect_1 = null;

        EObject this_Emission_2 = null;

        EObject this_HostcodeEffect_3 = null;

        EObject this_FunctionCallEffect_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:86:28: ( (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:87:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:87:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            int alt1=5;
            switch ( input.LA(1) ) {
            case RULE_COMMENT_ANNOTATION:
                {
                int LA1_1 = input.LA(2);

                if ( (synpred1_InternalKEffects()) ) {
                    alt1=1;
                }
                else if ( (synpred2_InternalKEffects()) ) {
                    alt1=2;
                }
                else if ( (synpred3_InternalKEffects()) ) {
                    alt1=3;
                }
                else if ( (synpred4_InternalKEffects()) ) {
                    alt1=4;
                }
                else if ( (true) ) {
                    alt1=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                int LA1_2 = input.LA(2);

                if ( (synpred1_InternalKEffects()) ) {
                    alt1=1;
                }
                else if ( (synpred2_InternalKEffects()) ) {
                    alt1=2;
                }
                else if ( (synpred3_InternalKEffects()) ) {
                    alt1=3;
                }
                else if ( (synpred4_InternalKEffects()) ) {
                    alt1=4;
                }
                else if ( (true) ) {
                    alt1=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA1_3 = input.LA(2);

                if ( (synpred1_InternalKEffects()) ) {
                    alt1=1;
                }
                else if ( (synpred2_InternalKEffects()) ) {
                    alt1=2;
                }
                else if ( (synpred3_InternalKEffects()) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                alt1=4;
                }
                break;
            case 20:
                {
                alt1=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:88:2: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleEffect141);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:101:2: this_PostfixEffect_1= rulePostfixEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getPostfixEffectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixEffect_in_ruleEffect171);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:114:2: this_Emission_2= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmission_in_ruleEffect201);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:127:2: this_HostcodeEffect_3= ruleHostcodeEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getHostcodeEffectParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleHostcodeEffect_in_ruleEffect231);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:140:2: this_FunctionCallEffect_4= ruleFunctionCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getFunctionCallEffectParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionCallEffect_in_ruleEffect261);
                    this_FunctionCallEffect_4=ruleFunctionCallEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCallEffect_4; 
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:159:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:160:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:161:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmission_in_entryRuleEmission296);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmission306); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:168:1: ruleEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_newValue_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:171:28: ( ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:172:1: ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:172:1: ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:172:2: ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:172:2: ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMENT_ANNOTATION||LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:173:1: (lv_annotations_0_0= ruleRestrictedAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:173:1: (lv_annotations_0_0= ruleRestrictedAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:174:3: lv_annotations_0_0= ruleRestrictedAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmissionAccess().getAnnotationsRestrictedAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleRestrictedAnnotation_in_ruleEmission352);
            	    lv_annotations_0_0=ruleRestrictedAnnotation();

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
            	              		"RestrictedAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:190:3: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:191:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:191:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:192:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmission377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:206:2: (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:206:4: otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEmission390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:210:1: ( (lv_newValue_3_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:211:1: (lv_newValue_3_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:211:1: (lv_newValue_3_0= ruleExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:212:3: lv_newValue_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEmission411);
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
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEmission423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEmissionAccess().getRightParenthesisKeyword_2_2());
                          
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:240:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:241:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:242:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment461);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment471); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:249:1: ruleAssignment returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_3_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:252:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:253:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:253:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:253:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:253:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMENT_ANNOTATION||LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:254:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:254:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:255:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAssignment517);
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
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:271:3: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:272:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:272:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:273:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment542); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:287:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:287:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssignment555); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:291:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:292:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:292:1: (lv_indices_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:293:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment576);
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
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssignment588); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:313:3: ( (lv_operator_5_0= ruleAssignOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:314:1: (lv_operator_5_0= ruleAssignOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:314:1: (lv_operator_5_0= ruleAssignOperator )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:315:3: lv_operator_5_0= ruleAssignOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getOperatorAssignOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignOperator_in_ruleAssignment611);
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
                      		"AssignOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:331:2: ( (lv_expression_6_0= ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:332:1: (lv_expression_6_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:332:1: (lv_expression_6_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:333:3: lv_expression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment632);
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


    // $ANTLR start "entryRulePostfixEffect"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:357:1: entryRulePostfixEffect returns [EObject current=null] : iv_rulePostfixEffect= rulePostfixEffect EOF ;
    public final EObject entryRulePostfixEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixEffect = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:358:2: (iv_rulePostfixEffect= rulePostfixEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:359:2: iv_rulePostfixEffect= rulePostfixEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePostfixEffect_in_entryRulePostfixEffect668);
            iv_rulePostfixEffect=rulePostfixEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePostfixEffect678); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:366:1: rulePostfixEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) ;
    public final EObject rulePostfixEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_3_0 = null;

        Enumerator lv_operator_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:369:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:370:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:370:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:370:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:370:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMENT_ANNOTATION||LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:371:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:371:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:372:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rulePostfixEffect724);
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
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:388:3: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:389:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:389:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:390:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPostfixEffectRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePostfixEffect749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:404:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:404:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePostfixEffect762); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:408:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:409:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:409:1: (lv_indices_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:410:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePostfixEffect783);
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
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePostfixEffect795); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:430:3: ( (lv_operator_5_0= rulePostfixOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:431:1: (lv_operator_5_0= rulePostfixOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:431:1: (lv_operator_5_0= rulePostfixOperator )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:432:3: lv_operator_5_0= rulePostfixOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getOperatorPostfixOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePostfixOperator_in_rulePostfixEffect818);
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
                      		"PostfixOperator");
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
    // $ANTLR end "rulePostfixEffect"


    // $ANTLR start "entryRuleHostcodeEffect"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:456:1: entryRuleHostcodeEffect returns [EObject current=null] : iv_ruleHostcodeEffect= ruleHostcodeEffect EOF ;
    public final EObject entryRuleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostcodeEffect = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:457:2: (iv_ruleHostcodeEffect= ruleHostcodeEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:458:2: iv_ruleHostcodeEffect= ruleHostcodeEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostcodeEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleHostcodeEffect_in_entryRuleHostcodeEffect854);
            iv_ruleHostcodeEffect=ruleHostcodeEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostcodeEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHostcodeEffect864); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:465:1: ruleHostcodeEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:468:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:469:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:469:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:469:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:469:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMENT_ANNOTATION||LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:470:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:470:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:471:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleHostcodeEffect910);
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
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:487:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:488:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:488:1: (lv_text_1_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:489:3: lv_text_1_0= RULE_HOSTCODE
            {
            lv_text_1_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleHostcodeEffect928); if (state.failed) return current;
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
                      		"HOSTCODE");
              	    
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


    // $ANTLR start "entryRuleFunctionCallEffect"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:513:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallEffect = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:514:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:515:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect969);
            iv_ruleFunctionCallEffect=ruleFunctionCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionCallEffect979); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:522:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) ;
    public final EObject ruleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_functionName_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:525:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:526:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:526:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:526:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>'
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:526:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMENT_ANNOTATION||LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:527:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:527:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:528:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleFunctionCallEffect1025);
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
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFunctionCallEffect1038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:548:1: ( (lv_functionName_2_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:549:1: (lv_functionName_2_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:549:1: (lv_functionName_2_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:550:3: lv_functionName_2_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect1059);
            lv_functionName_2_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
              	        }
                     		set(
                     			current, 
                     			"functionName",
                      		lv_functionName_2_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:566:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:566:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:566:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:566:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFunctionCallEffect1073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:570:1: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:571:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:571:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:572:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCallEffect1094);
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
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:588:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:588:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFunctionCallEffect1107); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_3_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:592:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:593:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:593:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:594:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCallEffect1128);
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
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFunctionCallEffect1142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_3_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:615:7: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFunctionCallEffect1161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFunctionCallEffect1175); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getFunctionCallEffectAccess().getGreaterThanSignKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:633:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:634:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:635:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1213);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1223); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:642:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:645:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:646:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:646:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:647:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleExpression1273);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:660:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleExpression1303);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:679:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:680:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:681:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1338);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolExpression1348); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:688:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:691:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:693:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression1397);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:712:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:713:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:714:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression1431);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOrExpression1441); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:721:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:724:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:725:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:725:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:726:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1491);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:737:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==48) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:737:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:737:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:738:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:746:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==48) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:746:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:746:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:747:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:747:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:748:3: lv_operator_2_0= ruleLogicalOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression1525);
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
                    	              		"LogicalOrOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:764:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:765:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:765:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:766:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1546);
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
                    	              		"LogicalAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:790:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:791:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:792:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression1586);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAndExpression1596); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:799:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:802:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:803:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:803:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:804:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression1646);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:815:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:815:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:815:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:816:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:824:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==49) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:824:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:824:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:825:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:825:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:826:3: lv_operator_2_0= ruleLogicalAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression1680);
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
                    	              		"LogicalAndOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:842:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:843:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:843:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:844:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression1701);
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
                    	              		"BitwiseOrExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:868:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:869:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:870:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression1741);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBitwiseOrExpression1751); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:877:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:880:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:881:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:881:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:882:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression1801);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:893:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:893:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:893:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:894:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:902:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==42) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:902:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:902:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:903:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:903:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:904:3: lv_operator_2_0= ruleBitwiseOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression1835);
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
                    	              		"BitwiseOrOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:920:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:921:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:921:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:922:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression1856);
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
                    	              		"BitwiseAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:946:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:947:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:948:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression1896);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBitwiseAndExpression1906); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:955:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:958:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:959:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:959:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:960:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression1956);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:971:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:971:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:971:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:972:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:980:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==25) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:980:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:980:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:981:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:981:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:982:3: lv_operator_2_0= ruleBitwiseAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression1990);
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
                    	              		"BitwiseAndOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:998:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:999:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:999:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1000:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression2011);
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
                    	              		"CompareOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1024:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1025:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1026:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation2051);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation2061); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1033:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1036:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1037:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1037:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1038:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2111);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1049:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20||LA21_0==23||(LA21_0>=37 && LA21_0<=40)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1049:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1049:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1050:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1058:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1059:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1059:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1060:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleCompareOperation2144);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1076:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1077:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1077:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1078:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2165);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1102:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1103:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1104:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression2203);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression2213); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1111:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1114:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1115:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1115:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1116:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression2263);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1129:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression2293);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1148:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1149:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1150:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression2328);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression2338); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1157:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1160:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1161:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1161:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_HOSTCODE)||LA23_0==RULE_BOOLEAN||LA23_0==16||LA23_0==20||LA23_0==41||LA23_0==47) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1161:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1161:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1161:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1161:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1162:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1170:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1171:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1171:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1172:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_ruleNotExpression2397);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1188:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1189:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1189:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1190:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotExpression2418);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1208:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleNotExpression2450);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1227:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1228:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1229:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression2485);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression2495); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1236:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1239:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1241:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression2544);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1260:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1261:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1262:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression2578);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression2588); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1269:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1272:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1273:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1273:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1274:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression2638);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1285:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==43) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1285:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1285:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1286:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1294:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1295:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1295:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1296:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_ruleAddExpression2671);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1312:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1313:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1313:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1314:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression2692);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1338:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1339:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1340:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression2730);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression2740); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1347:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1350:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1351:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1351:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1352:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression2790);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1363:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1363:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1363:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1364:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1372:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1373:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1373:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1374:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleSubExpression2823);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1390:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1391:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1391:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1392:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression2844);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1416:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1417:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1418:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression2882);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression2892); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1425:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1428:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1429:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1429:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1430:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression2942);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1441:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1441:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1441:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1442:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1450:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1451:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1451:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1452:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_ruleMultExpression2975);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1468:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1469:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1469:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1470:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression2996);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1494:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1495:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1496:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression3034);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression3044); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1503:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1506:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1507:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1507:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1508:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression3094);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1519:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1519:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1519:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1520:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1528:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1529:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1529:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1530:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_ruleDivExpression3127);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1546:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1547:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1547:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1548:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression3148);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1572:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1573:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1574:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression3186);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression3196); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1581:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1584:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1585:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1585:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1586:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleModExpression3246);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1597:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1597:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1597:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1598:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1606:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1607:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1607:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1608:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_ruleModExpression3279);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1624:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1625:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1625:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1626:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression3300);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1650:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1651:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1652:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression3338);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression3348); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1659:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1662:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1663:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1663:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_STRING)||LA29_0==16||LA29_0==20||LA29_0==41||LA29_0==47) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1663:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1663:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1663:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1663:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1664:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1672:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1673:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1673:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1674:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleNegExpression3407);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1690:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1691:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1691:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1692:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleNegExpression3428);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1710:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression3460);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1729:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1730:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1731:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression3495);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression3505); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1738:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1741:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1742:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1742:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt30=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt30=1;
                }
                break;
            case RULE_ID:
            case 41:
            case 47:
                {
                alt30=2;
                }
                break;
            case 16:
                {
                alt30=3;
                }
                break;
            case 20:
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1743:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_ruleAtomicExpression3555);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1756:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression3585);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1768:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1768:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1768:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAtomicExpression3603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleAtomicExpression3628);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAtomicExpression3639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1790:2: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionCall_in_ruleAtomicExpression3671);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1803:2: this_TextExpression_6= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_ruleAtomicExpression3701);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1822:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1823:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1824:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression3736);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression3746); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1831:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1834:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1835:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1835:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt31=5;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1836:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression3796);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1849:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression3826);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1862:2: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression3856);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1874:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1874:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1874:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAtomicValuedExpression3874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression3899);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAtomicValuedExpression3910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1896:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression3942);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1915:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1916:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1917:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression3977);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression3987); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1924:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1927:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1928:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1928:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41||LA33_0==47) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1928:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1928:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1928:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1928:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1929:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1937:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1938:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1938:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1939:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1939:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==41) ) {
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
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1940:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression4048);
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
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1955:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression4067);
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

                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleValuedObjectTestExpression4082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1977:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1978:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1978:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1979:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression4103);
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

                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleValuedObjectTestExpression4115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2001:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression4147);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2020:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2021:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2022:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference4182);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference4192); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2029:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2032:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2033:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2033:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2033:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2033:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2034:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2034:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2035:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObjectReference4241); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2049:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==18) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2049:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleValuedObjectReference4254); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2053:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2054:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2054:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2055:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleValuedObjectReference4275);
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

            	    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleValuedObjectReference4287); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2083:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2084:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2085:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4325);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionCall4335); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2092:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2095:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2096:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2096:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2096:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFunctionCall4372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2100:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2101:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2101:1: (lv_functionName_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2102:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleFunctionCall4393);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2118:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==16) ) {
                alt36=1;
            }
            else if ( (LA36_0==22) ) {
                alt36=2;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2118:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2118:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2118:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFunctionCall4407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2122:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2123:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2123:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2124:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCall4428);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2140:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==21) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2140:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFunctionCall4441); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2144:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2145:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2145:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2146:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCall4462);
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

                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFunctionCall4476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2167:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFunctionCall4495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFunctionCall4509); if (state.failed) return current;
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


    // $ANTLR start "entryRuleParameter"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2183:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2184:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2185:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter4545);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter4555); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2192:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2195:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2196:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2196:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2196:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2196:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==25) ) {
                    alt38=1;
                }
            }
            else if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2196:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2196:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==24) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2197:1: (lv_pureOutput_0_0= '!' )
                            {
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2197:1: (lv_pureOutput_0_0= '!' )
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2198:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParameter4599); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2211:3: ( (lv_callByReference_1_0= '&' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2212:1: (lv_callByReference_1_0= '&' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2212:1: (lv_callByReference_1_0= '&' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2213:3: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleParameter4631); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2226:4: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2227:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2227:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2228:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParameter4667);
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


    // $ANTLR start "entryRuleTextExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2252:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2253:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2254:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression4703);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression4713); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2261:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2264:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2265:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2265:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2266:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2266:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2267:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextExpression4754); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2291:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2292:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2293:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue4794);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue4804); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2300:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2303:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2304:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2304:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2305:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2305:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2306:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntValue4845); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2330:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2331:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2332:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue4885);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue4895); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2339:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2342:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2343:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2343:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2344:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2344:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2345:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloatValue4936); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2369:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2370:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2371:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_entryRuleBoolValue4976);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolValue4986); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2378:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2381:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2382:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2382:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2383:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2383:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2384:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleBoolValue5027); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2408:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2409:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2410:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_entryRuleStringValue5067);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringValue5077); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2417:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2420:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2421:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2421:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2422:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2422:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2423:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringValue5118); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2449:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2450:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2451:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation5160);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation5170); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2458:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;

        EObject this_KeyBooleanValueAnnotation_3 = null;

        EObject this_KeyIntValueAnnotation_4 = null;

        EObject this_KeyFloatValueAnnotation_5 = null;

        EObject this_TagAnnotation_6 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2461:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2462:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2462:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt39=7;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2463:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_ruleAnnotation5220);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2476:2: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation5250);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2489:2: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation5280);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2502:2: this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation5310);
                    this_KeyBooleanValueAnnotation_3=ruleKeyBooleanValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyBooleanValueAnnotation_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2515:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation5340);
                    this_KeyIntValueAnnotation_4=ruleKeyIntValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyIntValueAnnotation_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2528:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation5370);
                    this_KeyFloatValueAnnotation_5=ruleKeyFloatValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyFloatValueAnnotation_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2541:2: this_TagAnnotation_6= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_ruleAnnotation5400);
                    this_TagAnnotation_6=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_6; 
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


    // $ANTLR start "entryRuleRestrictedAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2562:1: entryRuleRestrictedAnnotation returns [EObject current=null] : iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF ;
    public final EObject entryRuleRestrictedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2563:2: (iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2564:2: iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRestrictedAnnotation_in_entryRuleRestrictedAnnotation5437);
            iv_ruleRestrictedAnnotation=ruleRestrictedAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRestrictedAnnotation5447); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictedAnnotation"


    // $ANTLR start "ruleRestrictedAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2571:1: ruleRestrictedAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
    public final EObject ruleRestrictedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_QuotedKeyStringValueAnnotation_1 = null;

        EObject this_QuotedTypedKeyStringValueAnnotation_2 = null;

        EObject this_KeyBooleanValueAnnotation_3 = null;

        EObject this_KeyIntValueAnnotation_4 = null;

        EObject this_KeyFloatValueAnnotation_5 = null;

        EObject this_TagAnnotation_6 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2574:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2575:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2575:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt40=7;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2576:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_ruleRestrictedAnnotation5497);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2589:2: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQuotedKeyStringValueAnnotation_in_ruleRestrictedAnnotation5527);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2602:2: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_ruleRestrictedAnnotation5557);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2615:2: this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleRestrictedAnnotation5587);
                    this_KeyBooleanValueAnnotation_3=ruleKeyBooleanValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyBooleanValueAnnotation_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2628:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_ruleRestrictedAnnotation5617);
                    this_KeyIntValueAnnotation_4=ruleKeyIntValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyIntValueAnnotation_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2641:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_ruleRestrictedAnnotation5647);
                    this_KeyFloatValueAnnotation_5=ruleKeyFloatValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyFloatValueAnnotation_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2654:2: this_TagAnnotation_6= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_ruleRestrictedAnnotation5677);
                    this_TagAnnotation_6=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_6; 
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
    // $ANTLR end "ruleRestrictedAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2673:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2674:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2675:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5712);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation5722); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2682:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2685:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2686:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2686:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2687:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2687:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2688:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5763); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2712:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2713:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2714:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation5803);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation5813); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2721:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2724:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2725:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2725:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2725:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTagAnnotation5850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2729:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2730:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2730:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2731:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTagAnnotation5871);
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2755:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2756:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2757:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation5907);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation5917); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2764:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2767:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2768:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2768:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2768:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleKeyStringValueAnnotation5954); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2772:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2773:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2773:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2774:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation5975);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2790:2: ( (lv_values_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2791:1: (lv_values_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2791:1: (lv_values_2_0= ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2792:3: lv_values_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation5996);
            lv_values_2_0=ruleEString();

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
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2808:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==21) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2808:4: otherlv_3= ',' ( (lv_values_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleKeyStringValueAnnotation6009); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2812:1: ( (lv_values_4_0= ruleEString ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2813:1: (lv_values_4_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2813:1: (lv_values_4_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2814:3: lv_values_4_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6030);
            	    lv_values_4_0=ruleEString();

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
            	              		"EString");
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2838:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2839:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2840:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation6068);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation6078); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2847:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2850:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2851:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2851:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2851:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTypedKeyStringValueAnnotation6115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2855:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2856:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2856:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2857:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6136);
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

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTypedKeyStringValueAnnotation6148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2877:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2878:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2878:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2879:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6169);
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

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTypedKeyStringValueAnnotation6181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2899:1: ( (lv_values_5_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2900:1: (lv_values_5_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2900:1: (lv_values_5_0= ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2901:3: lv_values_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6202);
            lv_values_5_0=ruleEString();

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
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2917:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==21) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2917:4: otherlv_6= ',' ( (lv_values_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTypedKeyStringValueAnnotation6215); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2921:1: ( (lv_values_7_0= ruleEString ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2922:1: (lv_values_7_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2922:1: (lv_values_7_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2923:3: lv_values_7_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6236);
            	    lv_values_7_0=ruleEString();

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
            	              		"EString");
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2947:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2948:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2949:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation6274);
            iv_ruleQuotedKeyStringValueAnnotation=ruleQuotedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation6284); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2956:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2959:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2960:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2960:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2960:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleQuotedKeyStringValueAnnotation6321); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2964:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2965:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2965:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2966:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleQuotedKeyStringValueAnnotation6342);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2982:2: ( (lv_values_2_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2983:1: (lv_values_2_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2983:1: (lv_values_2_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2984:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation6359); if (state.failed) return current;
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
                      		"STRING");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3000:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==21) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3000:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleQuotedKeyStringValueAnnotation6377); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3004:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3005:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3005:1: (lv_values_4_0= RULE_STRING )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3006:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation6394); if (state.failed) return current;
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
            	              		"STRING");
            	      	    
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3030:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3031:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3032:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation6437);
            iv_ruleQuotedTypedKeyStringValueAnnotation=ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation6447); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3039:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3042:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3043:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3043:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3043:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleQuotedTypedKeyStringValueAnnotation6484); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3047:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3048:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3048:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3049:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation6505);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQuotedTypedKeyStringValueAnnotation6517); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3069:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3070:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3070:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3071:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation6538);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleQuotedTypedKeyStringValueAnnotation6550); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3091:1: ( (lv_values_5_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3092:1: (lv_values_5_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3092:1: (lv_values_5_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3093:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation6567); if (state.failed) return current;
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
                      		"STRING");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3109:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==21) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3109:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleQuotedTypedKeyStringValueAnnotation6585); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3113:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3114:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3114:1: (lv_values_7_0= RULE_STRING )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3115:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation6602); if (state.failed) return current;
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
            	              		"STRING");
            	      	    
            	    }

            	    }


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
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3139:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3140:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3141:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation6645);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation6655); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3148:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3151:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3152:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3152:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3152:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleKeyBooleanValueAnnotation6692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3156:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3157:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3157:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3158:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation6713);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3174:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3175:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3175:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3176:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation6730); if (state.failed) return current;
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3200:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3201:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3202:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation6771);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation6781); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3209:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3212:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3213:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3213:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3213:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleKeyIntValueAnnotation6818); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3217:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3218:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3218:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3219:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation6839);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3235:2: ( (lv_value_2_0= ruleInteger ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3236:1: (lv_value_2_0= ruleInteger )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3236:1: (lv_value_2_0= ruleInteger )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3237:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation6860);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Integer");
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
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3261:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3262:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3263:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation6896);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation6906); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3270:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3273:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3274:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3274:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3274:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleKeyFloatValueAnnotation6943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3278:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3279:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3279:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3280:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation6964);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3296:2: ( (lv_value_2_0= ruleFloateger ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3297:1: (lv_value_2_0= ruleFloateger )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3297:1: (lv_value_2_0= ruleFloateger )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3298:3: lv_value_2_0= ruleFloateger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation6985);
            lv_value_2_0=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Floateger");
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
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3324:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3325:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3326:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString7024);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString7035); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3333:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3336:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3337:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3337:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ID) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3337:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString7075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3346:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleEString7108);
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

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3364:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3365:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3366:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID7154);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID7165); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3373:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3376:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3377:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3377:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3377:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID7205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3384:1: (kw= '.' this_ID_2= RULE_ID )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==27) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3385:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleExtendedID7224); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID7239); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3397:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==28) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3398:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleExtendedID7260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                          
                    }
                    this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleExtendedID7275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_4, grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
                          
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3418:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3419:2: (iv_ruleInteger= ruleInteger EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3420:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger7323);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger7334); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3427:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3430:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3431:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3431:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3431:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3431:2: (kw= '-' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==29) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3432:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInteger7373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInteger7390); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3452:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3453:2: (iv_ruleFloateger= ruleFloateger EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3454:2: iv_ruleFloateger= ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_entryRuleFloateger7436);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloateger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloateger7447); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3461:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3464:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3465:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3465:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3465:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3465:2: (kw= '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==29) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3466:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFloateger7486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloateger7503); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3486:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3488:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3489:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3489:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) )
            int alt50=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt50=1;
                }
                break;
            case 31:
                {
                alt50=2;
                }
                break;
            case 32:
                {
                alt50=3;
                }
                break;
            case 33:
                {
                alt50=4;
                }
                break;
            case 34:
                {
                alt50=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3489:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3489:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3489:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAssignOperator7562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3495:6: (enumLiteral_1= '+=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3495:6: (enumLiteral_1= '+=' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3495:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAssignOperator7579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3501:6: (enumLiteral_2= '-=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3501:6: (enumLiteral_2= '-=' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3501:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAssignOperator7596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3507:6: (enumLiteral_3= '*=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3507:6: (enumLiteral_3= '*=' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3507:8: enumLiteral_3= '*='
                    {
                    enumLiteral_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAssignOperator7613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3513:6: (enumLiteral_4= '/=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3513:6: (enumLiteral_4= '/=' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3513:8: enumLiteral_4= '/='
                    {
                    enumLiteral_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAssignOperator7630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4()); 
                          
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3523:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3525:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3526:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3526:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==35) ) {
                alt51=1;
            }
            else if ( (LA51_0==36) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3526:2: (enumLiteral_0= '++' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3526:2: (enumLiteral_0= '++' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3526:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_rulePostfixOperator7675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3532:6: (enumLiteral_1= '--' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3532:6: (enumLiteral_1= '--' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3532:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePostfixOperator7692); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3542:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3544:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3545:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3545:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt52=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt52=1;
                }
                break;
            case 20:
                {
                alt52=2;
                }
                break;
            case 38:
                {
                alt52=3;
                }
                break;
            case 23:
                {
                alt52=4;
                }
                break;
            case 39:
                {
                alt52=5;
                }
                break;
            case 40:
                {
                alt52=6;
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3545:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3545:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3545:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCompareOperator7737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3551:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3551:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3551:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCompareOperator7754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3557:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3557:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3557:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCompareOperator7771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3563:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3563:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3563:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCompareOperator7788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3569:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3569:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3569:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCompareOperator7805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3575:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3575:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3575:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCompareOperator7822); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3585:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3587:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3588:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3588:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3588:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_rulePreOperator7866); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3598:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3600:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3601:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3601:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3601:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleBitwiseOrOperator7909); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3611:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3613:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3614:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3614:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3614:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBitwiseAndOperator7952); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3624:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3626:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3627:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3627:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3627:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNotOperator7995); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3637:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3639:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3640:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3640:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3640:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAddOperator8038); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3650:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3652:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3653:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3653:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3653:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSubOperator8081); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3663:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3665:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3666:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3666:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3666:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMultOperator8124); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3676:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3678:28: ( (enumLiteral_0= '%' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3679:1: (enumLiteral_0= '%' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3679:1: (enumLiteral_0= '%' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3679:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleModOperator8167); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3689:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3691:28: ( (enumLiteral_0= '/' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3692:1: (enumLiteral_0= '/' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3692:1: (enumLiteral_0= '/' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3692:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleDivOperator8210); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3702:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3704:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3705:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3705:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3705:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleValOperator8253); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3715:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3717:28: ( (enumLiteral_0= '||' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3718:1: (enumLiteral_0= '||' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3718:1: (enumLiteral_0= '||' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3718:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleLogicalOrOperator8296); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3728:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3730:28: ( (enumLiteral_0= '&&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3731:1: (enumLiteral_0= '&&' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3731:1: (enumLiteral_0= '&&' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3731:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleLogicalAndOperator8339); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalKEffects
    public final void synpred1_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:88:2: (this_Assignment_0= ruleAssignment )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:88:2: this_Assignment_0= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_synpred1_InternalKEffects141);
        this_Assignment_0=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalKEffects

    // $ANTLR start synpred2_InternalKEffects
    public final void synpred2_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_PostfixEffect_1 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:101:2: (this_PostfixEffect_1= rulePostfixEffect )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:101:2: this_PostfixEffect_1= rulePostfixEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_rulePostfixEffect_in_synpred2_InternalKEffects171);
        this_PostfixEffect_1=rulePostfixEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalKEffects

    // $ANTLR start synpred3_InternalKEffects
    public final void synpred3_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_Emission_2 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:114:2: (this_Emission_2= ruleEmission )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:114:2: this_Emission_2= ruleEmission
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleEmission_in_synpred3_InternalKEffects201);
        this_Emission_2=ruleEmission();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalKEffects

    // $ANTLR start synpred4_InternalKEffects
    public final void synpred4_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_HostcodeEffect_3 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:127:2: (this_HostcodeEffect_3= ruleHostcodeEffect )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:127:2: this_HostcodeEffect_3= ruleHostcodeEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleHostcodeEffect_in_synpred4_InternalKEffects231);
        this_HostcodeEffect_3=ruleHostcodeEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalKEffects

    // $ANTLR start synpred16_InternalKEffects
    public final void synpred16_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:647:2: (this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:647:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred16_InternalKEffects1273);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalKEffects

    // $ANTLR start synpred26_InternalKEffects
    public final void synpred26_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1116:2: (this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1116:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred26_InternalKEffects2263);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalKEffects

    // $ANTLR start synpred41_InternalKEffects
    public final void synpred41_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1874:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1874:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1874:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1874:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_synpred41_InternalKEffects3874); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred41_InternalKEffects3899);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred41_InternalKEffects3910); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred41_InternalKEffects

    // Delegated rules

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
    public final boolean synpred26_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalKEffects_fragment(); // can never throw exception
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
    public final boolean synpred41_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalKEffects_fragment(); // can never throw exception
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


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA12_eotS =
        "\16\uffff";
    static final String DFA12_eofS =
        "\16\uffff";
    static final String DFA12_minS =
        "\1\4\13\0\2\uffff";
    static final String DFA12_maxS =
        "\1\57\13\0\2\uffff";
    static final String DFA12_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\11\1\13\1\2\1\3\1\6\1\4\6\uffff\1\5\3\uffff\1\12\3\uffff"+
            "\1\14\4\uffff\1\1\13\uffff\1\7\5\uffff\1\10",
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

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "646:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_10 = input.LA(1);

                         
                        int index12_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index12_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_11 = input.LA(1);

                         
                        int index12_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index12_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
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
            "\1\11\1\13\2\1\1\6\1\1\6\uffff\1\5\3\uffff\1\12\3\uffff\1\14"+
            "\4\uffff\1\1\13\uffff\1\7\5\uffff\1\10",
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
            return "1115:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
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
                        if ( (synpred26_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_8 = input.LA(1);

                         
                        int index22_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index22_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_9 = input.LA(1);

                         
                        int index22_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index22_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_11 = input.LA(1);

                         
                        int index22_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKEffects()) ) {s = 1;}

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
            "\2\5\1\1\1\2\1\5\1\3\6\uffff\1\4\3\uffff\1\5\24\uffff\1\5\5"+
            "\uffff\1\5",
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
            return "1835:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
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
                        if ( (synpred41_InternalKEffects()) ) {s = 11;}

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
    static final String DFA39_eotS =
        "\20\uffff";
    static final String DFA39_eofS =
        "\3\uffff\1\13\4\uffff\1\7\5\uffff\2\13";
    static final String DFA39_minS =
        "\1\12\1\uffff\3\4\1\6\2\uffff\1\4\1\6\4\uffff\2\4";
    static final String DFA39_maxS =
        "\1\32\1\uffff\1\4\1\35\1\4\1\6\2\uffff\1\44\1\7\4\uffff\2\35";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\4\uffff\1\3\1\2\2\uffff\1\5\1\7\1\4\1\6\2\uffff";
    static final String DFA39_specialS =
        "\20\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\1\17\uffff\1\2",
            "",
            "\1\3",
            "\1\10\1\13\1\12\1\15\1\14\1\7\1\13\7\uffff\1\6\1\uffff\1\13"+
            "\5\uffff\1\13\1\4\1\5\1\11",
            "\1\16",
            "\1\17",
            "",
            "",
            "\2\7\4\uffff\1\7\7\uffff\1\13\1\uffff\2\7\4\uffff\3\7\1\uffff"+
            "\7\13",
            "\1\12\1\15",
            "",
            "",
            "",
            "",
            "\1\10\1\13\1\12\1\15\1\14\1\7\1\13\7\uffff\1\6\1\uffff\1\13"+
            "\5\uffff\1\13\1\4\1\5\1\11",
            "\1\10\1\13\1\12\1\15\1\14\1\7\1\13\7\uffff\1\6\1\uffff\1\13"+
            "\5\uffff\1\13\2\uffff\1\11"
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "2462:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
    static final String DFA40_eotS =
        "\17\uffff";
    static final String DFA40_eofS =
        "\3\uffff\1\11\11\uffff\2\11";
    static final String DFA40_minS =
        "\1\12\1\uffff\3\4\2\6\6\uffff\2\4";
    static final String DFA40_maxS =
        "\1\32\1\uffff\1\4\1\35\1\4\1\6\1\7\6\uffff\2\35";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\5\uffff\1\6\1\5\1\7\1\3\1\4\1\2\2\uffff";
    static final String DFA40_specialS =
        "\17\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\17\uffff\1\2",
            "",
            "\1\3",
            "\1\11\1\uffff\1\10\1\7\1\13\1\14\1\11\7\uffff\1\12\7\uffff"+
            "\1\11\1\4\1\5\1\6",
            "\1\15",
            "\1\16",
            "\1\10\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\uffff\1\10\1\7\1\13\1\14\1\11\7\uffff\1\12\7\uffff"+
            "\1\11\1\4\1\5\1\6",
            "\1\11\1\uffff\1\10\1\7\1\13\1\14\1\11\7\uffff\1\12\7\uffff"+
            "\1\11\2\uffff\1\6"
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "2575:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEffect91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixEffect_in_ruleEffect171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_ruleEffect201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHostcodeEffect_in_ruleEffect231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCallEffect_in_ruleEffect261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission296 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmission306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestrictedAnnotation_in_ruleEmission352 = new BitSet(new long[]{0x0000000004000410L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmission377 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleEmission390 = new BitSet(new long[]{0x00008200211103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEmission411 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEmission423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment461 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAssignment517 = new BitSet(new long[]{0x0000000004000410L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment542 = new BitSet(new long[]{0x00000007C0040000L});
        public static final BitSet FOLLOW_18_in_ruleAssignment555 = new BitSet(new long[]{0x00008200211103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment576 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssignment588 = new BitSet(new long[]{0x00000007C0040000L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_ruleAssignment611 = new BitSet(new long[]{0x00008200211103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixEffect_in_entryRulePostfixEffect668 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePostfixEffect678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rulePostfixEffect724 = new BitSet(new long[]{0x0000000004000410L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePostfixEffect749 = new BitSet(new long[]{0x0000001800040000L});
        public static final BitSet FOLLOW_18_in_rulePostfixEffect762 = new BitSet(new long[]{0x00008200211103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePostfixEffect783 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePostfixEffect795 = new BitSet(new long[]{0x0000001800040000L});
        public static final BitSet FOLLOW_rulePostfixOperator_in_rulePostfixEffect818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHostcodeEffect_in_entryRuleHostcodeEffect854 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHostcodeEffect864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleHostcodeEffect910 = new BitSet(new long[]{0x0000000004000430L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleHostcodeEffect928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect969 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCallEffect979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleFunctionCallEffect1025 = new BitSet(new long[]{0x0000000004100410L});
        public static final BitSet FOLLOW_20_in_ruleFunctionCallEffect1038 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect1059 = new BitSet(new long[]{0x0000000000C10000L});
        public static final BitSet FOLLOW_16_in_ruleFunctionCallEffect1073 = new BitSet(new long[]{0x00008200231103F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect1094 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_21_in_ruleFunctionCallEffect1107 = new BitSet(new long[]{0x00008200231103F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect1128 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_17_in_ruleFunctionCallEffect1142 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_22_in_ruleFunctionCallEffect1161 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleFunctionCallEffect1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1213 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression1273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression1303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1338 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression1348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression1397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression1431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression1441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1491 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression1525 = new BitSet(new long[]{0x00008200211103F0L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1546 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression1586 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression1596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression1646 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression1680 = new BitSet(new long[]{0x00008200211103F0L});
        public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression1701 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression1741 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression1751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression1801 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression1835 = new BitSet(new long[]{0x00008200211103F0L});
        public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression1856 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression1896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression1906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression1956 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression1990 = new BitSet(new long[]{0x00008200211103F0L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression2011 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation2051 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation2061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2111 = new BitSet(new long[]{0x000001E000900002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation2144 = new BitSet(new long[]{0x00008200211103F0L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation2165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression2203 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression2213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression2263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression2293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression2328 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression2338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression2397 = new BitSet(new long[]{0x00008200211103F0L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression2418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression2450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression2485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression2495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression2544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression2578 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression2588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression2638 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression2671 = new BitSet(new long[]{0x00008200201103F0L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression2692 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression2730 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression2740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression2790 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression2823 = new BitSet(new long[]{0x00008200201103F0L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression2844 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression2882 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression2892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression2942 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression2975 = new BitSet(new long[]{0x00008200201103F0L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression2996 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression3034 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression3044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression3094 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression3127 = new BitSet(new long[]{0x00008200201103F0L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression3148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression3186 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression3196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression3246 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression3279 = new BitSet(new long[]{0x00008200201103F0L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression3300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression3338 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression3348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression3407 = new BitSet(new long[]{0x00008200201103F0L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression3428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression3495 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression3505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression3555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression3585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAtomicExpression3603 = new BitSet(new long[]{0x00008200211103F0L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression3628 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAtomicExpression3639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCall_in_ruleAtomicExpression3671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression3701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression3736 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression3746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression3796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression3826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression3856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAtomicValuedExpression3874 = new BitSet(new long[]{0x00008200201103F0L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression3899 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAtomicValuedExpression3910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression3942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression3977 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression3987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression4048 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression4067 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleValuedObjectTestExpression4082 = new BitSet(new long[]{0x0000820000000010L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression4103 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleValuedObjectTestExpression4115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression4147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference4182 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference4192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference4241 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleValuedObjectReference4254 = new BitSet(new long[]{0x00008200211103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObjectReference4275 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleValuedObjectReference4287 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4325 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall4335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleFunctionCall4372 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCall4393 = new BitSet(new long[]{0x0000000000C10000L});
        public static final BitSet FOLLOW_16_in_ruleFunctionCall4407 = new BitSet(new long[]{0x00008200231103F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall4428 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_21_in_ruleFunctionCall4441 = new BitSet(new long[]{0x00008200231103F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall4462 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_17_in_ruleFunctionCall4476 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_22_in_ruleFunctionCall4495 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleFunctionCall4509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter4555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleParameter4599 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleParameter4631 = new BitSet(new long[]{0x00008200211103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParameter4667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression4703 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression4713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression4754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue4794 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue4804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue4845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue4885 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue4895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue4936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue4976 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue4986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue5027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue5067 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringValue5077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue5118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation5160 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation5170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation5220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation5250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation5280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation5310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation5340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation5370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation5400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestrictedAnnotation_in_entryRuleRestrictedAnnotation5437 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRestrictedAnnotation5447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleRestrictedAnnotation5497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuotedKeyStringValueAnnotation_in_ruleRestrictedAnnotation5527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_ruleRestrictedAnnotation5557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleRestrictedAnnotation5587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleRestrictedAnnotation5617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleRestrictedAnnotation5647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleRestrictedAnnotation5677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5712 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation5722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation5803 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation5813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTagAnnotation5850 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation5871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation5907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation5917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleKeyStringValueAnnotation5954 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation5975 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation5996 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleKeyStringValueAnnotation6009 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation6030 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation6068 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation6078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTypedKeyStringValueAnnotation6115 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6136 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTypedKeyStringValueAnnotation6148 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation6169 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTypedKeyStringValueAnnotation6181 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6202 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleTypedKeyStringValueAnnotation6215 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation6236 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation6274 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation6284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleQuotedKeyStringValueAnnotation6321 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedKeyStringValueAnnotation6342 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation6359 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleQuotedKeyStringValueAnnotation6377 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation6394 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation6437 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation6447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleQuotedTypedKeyStringValueAnnotation6484 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation6505 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleQuotedTypedKeyStringValueAnnotation6517 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation6538 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleQuotedTypedKeyStringValueAnnotation6550 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation6567 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleQuotedTypedKeyStringValueAnnotation6585 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation6602 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation6645 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation6655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleKeyBooleanValueAnnotation6692 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation6713 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation6730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation6771 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation6781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleKeyIntValueAnnotation6818 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation6839 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation6860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation6896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation6906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleKeyFloatValueAnnotation6943 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation6964 = new BitSet(new long[]{0x0000000020000080L});
        public static final BitSet FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation6985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString7024 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString7035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString7075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleEString7108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID7154 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID7165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID7205 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_27_in_ruleExtendedID7224 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID7239 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_28_in_ruleExtendedID7260 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleExtendedID7275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger7323 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger7334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleInteger7373 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInteger7390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloateger_in_entryRuleFloateger7436 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloateger7447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleFloateger7486 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloateger7503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleAssignOperator7562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleAssignOperator7579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAssignOperator7596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleAssignOperator7613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleAssignOperator7630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rulePostfixOperator7675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rulePostfixOperator7692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleCompareOperator7737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleCompareOperator7754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleCompareOperator7771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleCompareOperator7788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleCompareOperator7805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleCompareOperator7822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rulePreOperator7866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleBitwiseOrOperator7909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBitwiseAndOperator7952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleNotOperator7995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleAddOperator8038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleSubOperator8081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleMultOperator8124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleModOperator8167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleDivOperator8210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleValOperator8253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleLogicalOrOperator8296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleLogicalAndOperator8339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_synpred1_InternalKEffects141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixEffect_in_synpred2_InternalKEffects171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_synpred3_InternalKEffects201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHostcodeEffect_in_synpred4_InternalKEffects231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred16_InternalKEffects1273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred26_InternalKEffects2263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_synpred41_InternalKEffects3874 = new BitSet(new long[]{0x00008200201103F0L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred41_InternalKEffects3899 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred41_InternalKEffects3910 = new BitSet(new long[]{0x0000000000000002L});
    }


}