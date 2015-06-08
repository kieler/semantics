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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'['", "']'", "'='", "'<'", "','", "'()'", "'>'", "'&'", "'@'", "'.'", "'#'", "'-'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'|'", "'!'", "'+'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'"
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
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_HOSTCODE=5;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:83:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_Emission_1= ruleEmission | this_TextEffect_2= ruleTextEffect | this_FunctionCallEffect_3= ruleFunctionCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_Emission_1 = null;

        EObject this_TextEffect_2 = null;

        EObject this_FunctionCallEffect_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:86:28: ( (this_Assignment_0= ruleAssignment | this_Emission_1= ruleEmission | this_TextEffect_2= ruleTextEffect | this_FunctionCallEffect_3= ruleFunctionCallEffect ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:87:1: (this_Assignment_0= ruleAssignment | this_Emission_1= ruleEmission | this_TextEffect_2= ruleTextEffect | this_FunctionCallEffect_3= ruleFunctionCallEffect )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:87:1: (this_Assignment_0= ruleAssignment | this_Emission_1= ruleEmission | this_TextEffect_2= ruleTextEffect | this_FunctionCallEffect_3= ruleFunctionCallEffect )
            int alt1=4;
            alt1 = dfa1.predict(input);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:101:2: this_Emission_1= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmission_in_ruleEffect171);
                    this_Emission_1=ruleEmission();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Emission_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:114:2: this_TextEffect_2= ruleTextEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_ruleEffect201);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:127:2: this_FunctionCallEffect_3= ruleFunctionCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getFunctionCallEffectParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionCallEffect_in_ruleEffect231);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:146:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:147:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:148:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmission_in_entryRuleEmission266);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmission276); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:155:1: ruleEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_newValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:158:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:159:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:159:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:159:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:159:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:160:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:160:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:161:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmission325); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:175:2: (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:175:4: otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEmission338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:179:1: ( (lv_newValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:180:1: (lv_newValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:180:1: (lv_newValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:181:3: lv_newValue_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEmission359);
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

                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEmission371); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:209:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:210:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:211:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment409);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment419); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:218:1: ruleAssignment returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_3_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:221:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:222:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:222:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:222:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:222:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMENT_ANNOTATION||LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:223:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:223:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:224:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAssignment465);
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
            	    break loop3;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:240:3: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:241:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:241:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:242:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:256:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:256:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssignment503); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:260:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:261:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:261:1: (lv_indices_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:262:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment524);
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

            	    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssignment536); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssignment550); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:286:1: ( (lv_expression_6_0= ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:287:1: (lv_expression_6_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:287:1: (lv_expression_6_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:288:3: lv_expression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment571);
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


    // $ANTLR start "entryRuleTextEffect"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:312:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextEffect = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:313:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:314:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_entryRuleTextEffect607);
            iv_ruleTextEffect=ruleTextEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextEffect617); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:321:1: ruleTextEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:324:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:325:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:325:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:325:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:325:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMENT_ANNOTATION||LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:326:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:326:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:327:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTextEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTextEffect663);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTextEffectRule());
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
            	    break loop5;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:343:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:344:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:344:1: (lv_text_1_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:345:3: lv_text_1_0= RULE_HOSTCODE
            {
            lv_text_1_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextEffect681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_1_0, grammarAccess.getTextEffectAccess().getTextHOSTCODETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextEffectRule());
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
    // $ANTLR end "ruleTextEffect"


    // $ANTLR start "entryRuleFunctionCallEffect"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:369:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallEffect = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:370:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:371:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect722);
            iv_ruleFunctionCallEffect=ruleFunctionCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionCallEffect732); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:378:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:381:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:382:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:382:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:382:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>'
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:382:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMENT_ANNOTATION||LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:383:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:383:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:384:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleFunctionCallEffect778);
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
            	    break loop6;
                }
            } while (true);

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFunctionCallEffect791); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:404:1: ( (lv_functionName_2_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:405:1: (lv_functionName_2_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:405:1: (lv_functionName_2_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:406:3: lv_functionName_2_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect812);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:422:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:422:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:422:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:422:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFunctionCallEffect826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:426:1: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:427:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:427:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:428:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCallEffect847);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:444:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==22) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:444:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFunctionCallEffect860); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_3_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:448:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:449:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:449:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:450:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCallEffect881);
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
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFunctionCallEffect895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_3_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:471:7: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFunctionCallEffect914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFunctionCallEffect928); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:489:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:490:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:491:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression966);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression976); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:498:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:501:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:502:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:502:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:503:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleExpression1026);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:516:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleExpression1056);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:535:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:536:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:537:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1091);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolExpression1101); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:544:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:547:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:549:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression1150);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:568:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:569:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:570:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression1184);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOrExpression1194); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:577:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:580:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:581:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:581:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:582:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1244);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:593:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:593:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:593:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:594:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:602:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==42) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:602:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:602:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:603:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:603:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:604:3: lv_operator_2_0= ruleLogicalOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression1278);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:620:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:621:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:621:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:622:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1299);
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
                    	    if ( cnt10 >= 1 ) break loop10;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:646:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:647:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:648:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression1339);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAndExpression1349); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:655:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:658:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:659:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:659:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:660:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression1399);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:671:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:671:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:671:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:672:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:680:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==43) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:680:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:680:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:681:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:681:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:682:3: lv_operator_2_0= ruleLogicalAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression1433);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:698:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:699:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:699:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:700:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression1454);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:724:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:725:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:726:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression1494);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBitwiseOrExpression1504); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:733:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:736:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:737:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:737:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:738:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression1554);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:749:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:749:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:749:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:750:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:758:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==35) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:758:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:758:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:759:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:759:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:760:3: lv_operator_2_0= ruleBitwiseOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression1588);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:776:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:777:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:777:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:778:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression1609);
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
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:802:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:803:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:804:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression1649);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBitwiseAndExpression1659); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:811:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:814:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:815:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:815:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:816:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression1709);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:827:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:827:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:827:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:828:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:836:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==25) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:836:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:836:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:837:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:837:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:838:3: lv_operator_2_0= ruleBitwiseAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression1743);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:854:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:855:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:855:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:856:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression1764);
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
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:880:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:881:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:882:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1804);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation1814); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:889:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:892:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:893:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:893:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:894:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1864);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:905:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21||LA18_0==24||(LA18_0>=30 && LA18_0<=33)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:905:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:905:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:906:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:914:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:915:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:915:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:916:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleCompareOperation1897);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:932:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:933:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:933:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:934:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1918);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:958:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:959:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:960:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression1956);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression1966); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:967:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:970:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:971:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:971:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:972:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression2016);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:985:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression2046);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1004:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1005:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1006:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression2081);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression2091); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1013:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1016:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1017:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1017:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_HOSTCODE)||LA20_0==RULE_BOOLEAN||LA20_0==16||LA20_0==21||LA20_0==34||LA20_0==41) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1017:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1017:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1017:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1017:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1018:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1026:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1027:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1027:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1028:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_ruleNotExpression2150);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1044:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1045:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1045:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1046:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotExpression2171);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1064:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleNotExpression2203);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1083:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1084:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1085:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression2238);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression2248); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1092:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1095:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1097:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression2297);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1116:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1117:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1118:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression2331);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression2341); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1125:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1128:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1129:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1129:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1130:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression2391);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1141:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1141:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1141:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1142:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1150:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1151:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1151:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1152:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_ruleAddExpression2424);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1168:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1169:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1169:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1170:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression2445);
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1194:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1195:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1196:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression2483);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression2493); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1203:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1206:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1207:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1207:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1208:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression2543);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1219:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1219:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1219:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1220:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1228:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1229:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1229:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1230:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleSubExpression2576);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1246:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1247:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1247:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1248:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression2597);
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1272:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1273:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1274:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression2635);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression2645); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1281:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1284:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1285:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1285:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1286:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression2695);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1297:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1297:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1297:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1298:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1306:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1307:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1307:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1308:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_ruleMultExpression2728);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1324:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1325:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1325:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1326:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression2749);
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
            	    break loop23;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1350:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1351:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1352:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression2787);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression2797); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1359:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1362:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1363:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1363:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1364:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression2847);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1375:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1375:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1375:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1376:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1384:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1385:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1385:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1386:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_ruleDivExpression2880);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1402:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1403:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1403:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1404:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression2901);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1428:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1429:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1430:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression2939);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression2949); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1437:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1440:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1441:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1441:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1442:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleModExpression2999);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1453:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1453:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1453:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1454:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1462:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1463:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1463:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1464:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_ruleModExpression3032);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1480:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1481:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1481:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1482:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression3053);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1506:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1507:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1508:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression3091);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression3101); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1515:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1518:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1519:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1519:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)||LA26_0==16||LA26_0==21||LA26_0==34||LA26_0==41) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1519:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1519:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1519:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1519:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1520:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1528:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1529:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1529:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1530:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleNegExpression3160);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1546:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1547:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1547:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1548:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleNegExpression3181);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1566:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression3213);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1585:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1586:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1587:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression3248);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression3258); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1594:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1597:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1598:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1598:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt27=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
            case 34:
            case 41:
                {
                alt27=2;
                }
                break;
            case 16:
                {
                alt27=3;
                }
                break;
            case 21:
                {
                alt27=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1599:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_ruleAtomicExpression3308);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1612:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression3338);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1624:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1624:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1624:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAtomicExpression3356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleAtomicExpression3381);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAtomicExpression3392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1646:2: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionCall_in_ruleAtomicExpression3424);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1659:2: this_TextExpression_6= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_ruleAtomicExpression3454);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1678:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1679:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1680:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression3489);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression3499); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1687:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1690:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1691:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1691:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt28=5;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1692:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression3549);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1705:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression3579);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1718:2: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression3609);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1730:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1730:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1730:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAtomicValuedExpression3627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression3652);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAtomicValuedExpression3663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1752:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression3695);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1771:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1772:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1773:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression3730);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression3740); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1780:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1783:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1784:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1784:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34||LA30_0==41) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1784:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1784:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1784:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1784:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1785:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1793:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1794:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1794:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1795:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1795:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==34) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==41) ) {
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
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1796:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression3801);
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
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1811:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression3820);
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

                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleValuedObjectTestExpression3835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1833:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1834:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1834:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1835:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression3856);
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

                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleValuedObjectTestExpression3868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1857:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression3900);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1876:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1877:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1878:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference3935);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference3945); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1885:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1888:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1889:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1889:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1889:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1889:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1890:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1890:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1891:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObjectReference3994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1905:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1905:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleValuedObjectReference4007); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1909:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1910:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1910:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1911:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleValuedObjectReference4028);
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

            	    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleValuedObjectReference4040); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1939:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1940:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1941:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4078);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionCall4088); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1948:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1951:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1952:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1952:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1952:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFunctionCall4125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1956:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1957:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1957:1: (lv_functionName_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1958:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleFunctionCall4146);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1974:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                alt33=1;
            }
            else if ( (LA33_0==23) ) {
                alt33=2;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1974:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1974:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1974:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFunctionCall4160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1978:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1979:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1979:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1980:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCall4181);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1996:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==22) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1996:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFunctionCall4194); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2000:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2001:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2001:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2002:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCall4215);
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
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFunctionCall4229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2023:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFunctionCall4248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFunctionCall4262); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2039:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2040:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2041:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter4298);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter4308); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2048:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_callByReference_0_0=null;
        Token lv_pureOutput_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2051:28: ( ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2052:1: ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2052:1: ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2052:2: ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2052:2: ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2052:3: ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )?
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2052:3: ( (lv_callByReference_0_0= '&' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2053:1: (lv_callByReference_0_0= '&' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2053:1: (lv_callByReference_0_0= '&' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2054:3: lv_callByReference_0_0= '&'
                    {
                    lv_callByReference_0_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleParameter4352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_callByReference_0_0, grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterRule());
                      	        }
                             		setWithLastConsumed(current, "callByReference", true, "&");
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2067:2: ( (lv_pureOutput_1_0= '&' ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==25) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2068:1: (lv_pureOutput_1_0= '&' )
                            {
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2068:1: (lv_pureOutput_1_0= '&' )
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2069:3: lv_pureOutput_1_0= '&'
                            {
                            lv_pureOutput_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleParameter4383); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_pureOutput_1_0, grammarAccess.getParameterAccess().getPureOutputAmpersandKeyword_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getParameterRule());
                              	        }
                                     		setWithLastConsumed(current, "pureOutput", true, "&");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2082:5: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2083:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2083:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2084:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParameter4420);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2108:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2109:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2110:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression4456);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression4466); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2117:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2120:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2121:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2121:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2122:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2122:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2123:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextExpression4507); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2147:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2148:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2149:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue4547);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue4557); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2156:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2159:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2160:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2160:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2161:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2161:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2162:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntValue4598); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2186:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2187:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2188:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue4638);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue4648); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2195:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2198:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2199:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2199:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2200:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2200:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2201:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloatValue4689); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2225:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2226:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2227:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_entryRuleBoolValue4729);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolValue4739); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2234:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2237:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2238:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2238:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2239:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2239:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2240:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleBoolValue4780); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2264:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2265:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2266:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_entryRuleStringValue4820);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringValue4830); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2273:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2276:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2277:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2277:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2278:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2278:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2279:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringValue4871); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2305:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2306:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2307:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation4913);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation4923); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2314:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2317:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2318:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2318:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt36=7;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2319:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_ruleAnnotation4973);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2332:2: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation5003);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2345:2: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation5033);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2358:2: this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation5063);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2371:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation5093);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2384:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation5123);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2397:2: this_TagAnnotation_6= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_ruleAnnotation5153);
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


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2418:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2419:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2420:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5190);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation5200); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2427:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2430:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2431:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2431:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2432:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2432:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2433:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5241); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2457:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2458:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2459:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation5281);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation5291); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2466:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2469:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2470:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2470:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2470:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTagAnnotation5328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2474:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2475:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2475:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2476:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTagAnnotation5349);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2500:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2501:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2502:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation5385);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation5395); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2509:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2512:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2513:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2513:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2513:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleKeyStringValueAnnotation5432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2517:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2518:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2518:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2519:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation5453);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2535:2: ( (lv_values_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2536:1: (lv_values_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2536:1: (lv_values_2_0= ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2537:3: lv_values_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation5474);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2553:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==22) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2553:4: otherlv_3= ',' ( (lv_values_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleKeyStringValueAnnotation5487); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2557:1: ( (lv_values_4_0= ruleEString ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2558:1: (lv_values_4_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2558:1: (lv_values_4_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2559:3: lv_values_4_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation5508);
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
            	    break loop37;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2583:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2584:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2585:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation5546);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation5556); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2592:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2595:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2596:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2596:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2596:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTypedKeyStringValueAnnotation5593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2600:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2601:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2601:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2602:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5614);
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

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTypedKeyStringValueAnnotation5626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2622:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2623:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2623:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2624:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5647);
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

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTypedKeyStringValueAnnotation5659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2644:1: ( (lv_values_5_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2645:1: (lv_values_5_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2645:1: (lv_values_5_0= ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2646:3: lv_values_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation5680);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2662:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEString ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==22) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2662:4: otherlv_6= ',' ( (lv_values_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTypedKeyStringValueAnnotation5693); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2666:1: ( (lv_values_7_0= ruleEString ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2667:1: (lv_values_7_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2667:1: (lv_values_7_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2668:3: lv_values_7_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation5714);
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
            	    break loop38;
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


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2692:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2693:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2694:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation5752);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation5762); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2701:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2704:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2705:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2705:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2705:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleKeyBooleanValueAnnotation5799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2709:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2710:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2710:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2711:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation5820);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2727:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2728:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2728:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2729:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation5837); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2753:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2754:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2755:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation5878);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation5888); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2762:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2765:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2766:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2766:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2766:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleKeyIntValueAnnotation5925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2770:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2771:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2771:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2772:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation5946);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2788:2: ( (lv_value_2_0= ruleInteger ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2789:1: (lv_value_2_0= ruleInteger )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2789:1: (lv_value_2_0= ruleInteger )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2790:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation5967);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2814:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2815:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2816:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation6003);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation6013); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2823:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2826:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2827:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2827:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2827:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleKeyFloatValueAnnotation6050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2831:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2832:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2832:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2833:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation6071);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2849:2: ( (lv_value_2_0= ruleFloateger ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2850:1: (lv_value_2_0= ruleFloateger )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2850:1: (lv_value_2_0= ruleFloateger )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2851:3: lv_value_2_0= ruleFloateger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation6092);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2877:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2878:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2879:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString6131);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString6142); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2886:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2889:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2890:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2890:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2890:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString6182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2899:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleEString6215);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2917:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2918:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2919:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID6261);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID6272); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2926:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2929:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2930:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2930:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2930:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID6312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2937:1: (kw= '.' this_ID_2= RULE_ID )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==27) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2938:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleExtendedID6331); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID6346); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2950:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==28) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2951:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleExtendedID6367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                          
                    }
                    this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleExtendedID6382); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2971:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2972:2: (iv_ruleInteger= ruleInteger EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2973:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger6430);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger6441); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2980:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2983:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2984:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2984:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2984:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2984:2: (kw= '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==29) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2985:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInteger6480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInteger6497); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3005:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3006:2: (iv_ruleFloateger= ruleFloateger EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3007:2: iv_ruleFloateger= ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_entryRuleFloateger6543);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloateger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloateger6554); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3014:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3017:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3018:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3018:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3018:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3018:2: (kw= '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==29) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3019:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFloateger6593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloateger6610); if (state.failed) return current;
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


    // $ANTLR start "ruleCompareOperator"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3039:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3041:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3042:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3042:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt44=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt44=1;
                }
                break;
            case 21:
                {
                alt44=2;
                }
                break;
            case 31:
                {
                alt44=3;
                }
                break;
            case 24:
                {
                alt44=4;
                }
                break;
            case 32:
                {
                alt44=5;
                }
                break;
            case 33:
                {
                alt44=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3042:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3042:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3042:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCompareOperator6669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3048:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3048:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3048:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCompareOperator6686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3054:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3054:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3054:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCompareOperator6703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3060:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3060:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3060:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCompareOperator6720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3066:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3066:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3066:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCompareOperator6737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3072:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3072:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3072:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCompareOperator6754); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3082:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3084:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3085:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3085:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3085:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulePreOperator6798); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3095:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3097:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3098:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3098:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3098:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBitwiseOrOperator6841); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3108:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3110:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3111:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3111:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3111:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBitwiseAndOperator6884); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3121:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3123:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3124:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3124:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3124:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleNotOperator6927); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3134:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3136:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3137:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3137:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3137:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAddOperator6970); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3147:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3149:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3150:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3150:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3150:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSubOperator7013); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3160:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3162:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3163:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3163:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3163:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMultOperator7056); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3173:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3175:28: ( (enumLiteral_0= '%' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3176:1: (enumLiteral_0= '%' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3176:1: (enumLiteral_0= '%' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3176:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleModOperator7099); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3186:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3188:28: ( (enumLiteral_0= '/' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3189:1: (enumLiteral_0= '/' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3189:1: (enumLiteral_0= '/' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3189:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDivOperator7142); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3199:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3201:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3202:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3202:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3202:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleValOperator7185); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3212:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3214:28: ( (enumLiteral_0= '||' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3215:1: (enumLiteral_0= '||' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3215:1: (enumLiteral_0= '||' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3215:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleLogicalOrOperator7228); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3225:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3227:28: ( (enumLiteral_0= '&&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3228:1: (enumLiteral_0= '&&' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3228:1: (enumLiteral_0= '&&' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3228:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleLogicalAndOperator7271); if (state.failed) return current;
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

    // $ANTLR start synpred12_InternalKEffects
    public final void synpred12_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:503:2: (this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:503:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred12_InternalKEffects1026);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalKEffects

    // $ANTLR start synpred22_InternalKEffects
    public final void synpred22_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:972:2: (this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:972:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred22_InternalKEffects2016);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalKEffects

    // $ANTLR start synpred37_InternalKEffects
    public final void synpred37_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1730:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1730:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1730:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1730:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_synpred37_InternalKEffects3627); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred37_InternalKEffects3652);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred37_InternalKEffects3663); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred37_InternalKEffects

    // Delegated rules

    public final boolean synpred37_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalKEffects_fragment(); // can never throw exception
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
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA1_eotS =
        "\62\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\10\56\uffff";
    static final String DFA1_minS =
        "\3\4\1\20\3\uffff\1\4\1\uffff\1\4\1\6\2\4\1\6\6\4\1\23\1\4\1\6"+
        "\2\4\1\6\5\4\2\23\3\4\1\6\2\4\1\6\7\4\1\6\2\4";
    static final String DFA1_maxS =
        "\2\32\1\4\1\24\3\uffff\1\35\1\uffff\1\4\1\6\1\4\1\34\1\7\4\32\2"+
        "\35\1\34\1\4\1\6\1\11\1\4\1\6\1\11\1\34\2\32\2\34\1\23\1\32\1\34"+
        "\1\4\1\6\1\11\1\4\1\6\1\34\2\32\2\34\1\32\1\4\1\6\1\34\1\32";
    static final String DFA1_acceptS =
        "\4\uffff\1\3\1\4\1\1\1\uffff\1\2\51\uffff";
    static final String DFA1_specialS =
        "\62\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\1\4\4\uffff\1\1\12\uffff\1\5\4\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\4\uffff\1\2",
            "\1\7",
            "\1\10\1\uffff\1\6\1\uffff\1\6",
            "",
            "",
            "",
            "\1\14\1\4\1\20\1\16\1\21\1\17\1\1\7\uffff\1\13\2\uffff\1\5"+
            "\4\uffff\1\2\1\11\1\12\1\15",
            "",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\6\1\4\4\uffff\1\1\7\uffff\1\6\1\uffff\1\6\1\5\1\27\3\uffff"+
            "\1\2\1\25\1\26",
            "\1\20\1\16",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\4\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\27\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\4\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\4\uffff\1\2",
            "\1\14\1\4\1\20\1\16\1\21\1\17\1\1\7\uffff\1\13\2\uffff\1\5"+
            "\4\uffff\1\2\1\11\1\12\1\15",
            "\1\14\1\4\1\20\1\16\1\21\1\17\1\1\7\uffff\1\13\2\uffff\1\5"+
            "\4\uffff\1\2\2\uffff\1\15",
            "\1\32\7\uffff\1\30\1\31",
            "\1\33",
            "\1\34",
            "\1\36\4\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\42\4\uffff\1\41",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\27\3\uffff\1\2\1\25\1"+
            "\26",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\27\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\27\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\27\3\uffff\1\2\1\43\1"+
            "\44",
            "\1\32\7\uffff\1\30\1\31",
            "\1\32",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\45\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\45\3\uffff\1\2\1\46\1"+
            "\47",
            "\1\50",
            "\1\51",
            "\1\53\4\uffff\1\52",
            "\1\54",
            "\1\55",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\27\3\uffff\1\2\1\43\1"+
            "\44",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\27\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\45\3\uffff\1\2",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\45\3\uffff\1\2\1\56\1"+
            "\57",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\45\3\uffff\1\2\1\46\1"+
            "\47",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\45\3\uffff\1\2",
            "\1\60",
            "\1\61",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\45\3\uffff\1\2\1\56\1"+
            "\57",
            "\1\6\1\4\4\uffff\1\1\12\uffff\1\5\1\45\3\uffff\1\2"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "87:1: (this_Assignment_0= ruleAssignment | this_Emission_1= ruleEmission | this_TextEffect_2= ruleTextEffect | this_FunctionCallEffect_3= ruleFunctionCallEffect )";
        }
    }
    static final String DFA9_eotS =
        "\16\uffff";
    static final String DFA9_eofS =
        "\16\uffff";
    static final String DFA9_minS =
        "\1\4\13\0\2\uffff";
    static final String DFA9_maxS =
        "\1\51\13\0\2\uffff";
    static final String DFA9_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\11\1\13\1\2\1\3\1\6\1\4\6\uffff\1\5\4\uffff\1\12\7\uffff"+
            "\1\1\4\uffff\1\7\1\uffff\1\14\4\uffff\1\10",
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

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "502:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index9_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA9_10 = input.LA(1);

                         
                        int index9_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index9_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA9_11 = input.LA(1);

                         
                        int index9_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalKEffects()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index9_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\15\uffff";
    static final String DFA19_eofS =
        "\15\uffff";
    static final String DFA19_minS =
        "\1\4\4\uffff\7\0\1\uffff";
    static final String DFA19_maxS =
        "\1\51\4\uffff\7\0\1\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\12\uffff\1\2";
    static final String DFA19_specialS =
        "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\11\1\13\2\1\1\6\1\1\6\uffff\1\5\4\uffff\1\12\7\uffff\1\1"+
            "\4\uffff\1\7\1\uffff\1\14\4\uffff\1\10",
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "971:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_5 = input.LA(1);

                         
                        int index19_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index19_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_6 = input.LA(1);

                         
                        int index19_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index19_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_7 = input.LA(1);

                         
                        int index19_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index19_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_8 = input.LA(1);

                         
                        int index19_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index19_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_9 = input.LA(1);

                         
                        int index19_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index19_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_10 = input.LA(1);

                         
                        int index19_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index19_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_11 = input.LA(1);

                         
                        int index19_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index19_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\14\uffff";
    static final String DFA28_eofS =
        "\14\uffff";
    static final String DFA28_minS =
        "\1\4\3\uffff\1\0\7\uffff";
    static final String DFA28_maxS =
        "\1\51\3\uffff\1\0\7\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String DFA28_specialS =
        "\4\uffff\1\0\7\uffff}>";
    static final String[] DFA28_transitionS = {
            "\2\5\1\1\1\2\1\5\1\3\6\uffff\1\4\4\uffff\1\5\14\uffff\1\5\6"+
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1691:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalKEffects()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA36_eotS =
        "\20\uffff";
    static final String DFA36_eofS =
        "\3\uffff\1\13\6\uffff\1\11\3\uffff\2\13";
    static final String DFA36_minS =
        "\1\12\1\uffff\3\4\2\6\3\uffff\1\4\3\uffff\2\4";
    static final String DFA36_maxS =
        "\1\32\1\uffff\1\4\1\35\1\4\1\6\1\7\3\uffff\1\34\3\uffff\2\35";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\5\uffff\1\5\1\4\1\2\1\uffff\1\7\1\3\1\6\2\uffff";
    static final String DFA36_specialS =
        "\20\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1\17\uffff\1\2",
            "",
            "\1\3",
            "\1\12\1\13\1\7\1\15\1\10\1\11\1\13\7\uffff\1\14\2\uffff\1"+
            "\13\4\uffff\1\13\1\4\1\5\1\6",
            "\1\16",
            "\1\17",
            "\1\7\1\15",
            "",
            "",
            "",
            "\2\11\4\uffff\1\11\7\uffff\1\13\1\uffff\1\13\2\11\3\uffff"+
            "\3\11",
            "",
            "",
            "",
            "\1\12\1\13\1\7\1\15\1\10\1\11\1\13\7\uffff\1\14\2\uffff\1"+
            "\13\4\uffff\1\13\1\4\1\5\1\6",
            "\1\12\1\13\1\7\1\15\1\10\1\11\1\13\7\uffff\1\14\2\uffff\1"+
            "\13\4\uffff\1\13\2\uffff\1\6"
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2318:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEffect91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_ruleEffect171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCallEffect_in_ruleEffect231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission266 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmission276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmission325 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleEmission338 = new BitSet(new long[]{0x00000214202103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEmission359 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEmission371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment409 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAssignment465 = new BitSet(new long[]{0x0000000004000410L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment490 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssignment503 = new BitSet(new long[]{0x00000214202103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment524 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssignment536 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_20_in_ruleAssignment550 = new BitSet(new long[]{0x00000214202103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTextEffect663 = new BitSet(new long[]{0x0000000004000430L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextEffect681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCallEffect732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleFunctionCallEffect778 = new BitSet(new long[]{0x0000000004200410L});
        public static final BitSet FOLLOW_21_in_ruleFunctionCallEffect791 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect812 = new BitSet(new long[]{0x0000000001810000L});
        public static final BitSet FOLLOW_16_in_ruleFunctionCallEffect826 = new BitSet(new long[]{0x00000214222103F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect847 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleFunctionCallEffect860 = new BitSet(new long[]{0x00000214222103F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect881 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleFunctionCallEffect895 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_23_in_ruleFunctionCallEffect914 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleFunctionCallEffect928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression966 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression1026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1091 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression1101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression1150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression1184 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression1194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1244 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression1278 = new BitSet(new long[]{0x00000214202103F0L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1299 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression1339 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression1349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression1399 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression1433 = new BitSet(new long[]{0x00000214202103F0L});
        public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression1454 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression1494 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression1504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression1554 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression1588 = new BitSet(new long[]{0x00000214202103F0L});
        public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression1609 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression1649 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression1659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression1709 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression1743 = new BitSet(new long[]{0x00000214202103F0L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression1764 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1804 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation1814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1864 = new BitSet(new long[]{0x00000003C1200002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation1897 = new BitSet(new long[]{0x00000214202103F0L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression1956 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression1966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression2016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression2081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression2091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression2150 = new BitSet(new long[]{0x00000214202103F0L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression2171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression2203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression2238 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression2248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression2297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression2331 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression2341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression2391 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression2424 = new BitSet(new long[]{0x00000204202103F0L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression2445 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression2483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression2493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression2543 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression2576 = new BitSet(new long[]{0x00000204202103F0L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression2597 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression2635 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression2645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression2695 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression2728 = new BitSet(new long[]{0x00000204202103F0L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression2749 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression2787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression2797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression2847 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression2880 = new BitSet(new long[]{0x00000204202103F0L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression2901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression2939 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression2949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression2999 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression3032 = new BitSet(new long[]{0x00000204202103F0L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression3053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression3091 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression3101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression3160 = new BitSet(new long[]{0x00000204202103F0L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression3181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression3213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression3248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression3258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression3308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression3338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAtomicExpression3356 = new BitSet(new long[]{0x00000214202103F0L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression3381 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAtomicExpression3392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCall_in_ruleAtomicExpression3424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression3454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression3489 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression3499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression3549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression3579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression3609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAtomicValuedExpression3627 = new BitSet(new long[]{0x00000204202103F0L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression3652 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAtomicValuedExpression3663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression3695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression3730 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression3740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression3801 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression3820 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleValuedObjectTestExpression3835 = new BitSet(new long[]{0x0000020400000010L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression3856 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleValuedObjectTestExpression3868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression3900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference3935 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference3945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference3994 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleValuedObjectReference4007 = new BitSet(new long[]{0x00000214202103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObjectReference4028 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleValuedObjectReference4040 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4078 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall4088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleFunctionCall4125 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCall4146 = new BitSet(new long[]{0x0000000001810000L});
        public static final BitSet FOLLOW_16_in_ruleFunctionCall4160 = new BitSet(new long[]{0x00000214222103F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall4181 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleFunctionCall4194 = new BitSet(new long[]{0x00000214222103F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall4215 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleFunctionCall4229 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_23_in_ruleFunctionCall4248 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleFunctionCall4262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4298 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter4308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleParameter4352 = new BitSet(new long[]{0x00000214222103F0L});
        public static final BitSet FOLLOW_25_in_ruleParameter4383 = new BitSet(new long[]{0x00000214202103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParameter4420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression4456 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression4466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression4507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue4547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue4557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue4598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue4638 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue4648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue4689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue4729 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue4739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue4780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue4820 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringValue4830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue4871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4913 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation4973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation5003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation5033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation5063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation5093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation5123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation5153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5190 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation5200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation5281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation5291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTagAnnotation5328 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation5349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation5385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation5395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleKeyStringValueAnnotation5432 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation5453 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation5474 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleKeyStringValueAnnotation5487 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation5508 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation5546 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation5556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTypedKeyStringValueAnnotation5593 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5614 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTypedKeyStringValueAnnotation5626 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5647 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTypedKeyStringValueAnnotation5659 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation5680 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleTypedKeyStringValueAnnotation5693 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation5714 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation5752 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation5762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleKeyBooleanValueAnnotation5799 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation5820 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation5837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation5878 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation5888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleKeyIntValueAnnotation5925 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation5946 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation5967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation6003 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation6013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleKeyFloatValueAnnotation6050 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation6071 = new BitSet(new long[]{0x0000000020000080L});
        public static final BitSet FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation6092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6131 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString6142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString6182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleEString6215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID6261 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID6272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID6312 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_27_in_ruleExtendedID6331 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID6346 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_28_in_ruleExtendedID6367 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleExtendedID6382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger6430 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger6441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleInteger6480 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInteger6497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloateger_in_entryRuleFloateger6543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloateger6554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleFloateger6593 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloateger6610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCompareOperator6669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleCompareOperator6686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCompareOperator6703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleCompareOperator6720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleCompareOperator6737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleCompareOperator6754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rulePreOperator6798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleBitwiseOrOperator6841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBitwiseAndOperator6884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleNotOperator6927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleAddOperator6970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleSubOperator7013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleMultOperator7056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleModOperator7099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleDivOperator7142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleValOperator7185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleLogicalOrOperator7228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleLogicalAndOperator7271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred12_InternalKEffects1026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred22_InternalKEffects2016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_synpred37_InternalKEffects3627 = new BitSet(new long[]{0x00000204202103F0L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred37_InternalKEffects3652 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred37_InternalKEffects3663 = new BitSet(new long[]{0x0000000000000002L});
    }


}