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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'['", "']'", "'='", "'<'", "','", "'()'", "'>'", "'&'", "'@'", "'.'", "'#'", "'-'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'|'", "'!'", "'+'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'++'", "'--'"
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
    public static final int T__44=44;
    public static final int T__45=45;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:83:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_UnaryOperation_2= ruleUnaryOperation | this_TextEffect_3= ruleTextEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_UnaryOperation_2 = null;

        EObject this_TextEffect_3 = null;

        EObject this_FunctionCallEffect_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:86:28: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_UnaryOperation_2= ruleUnaryOperation | this_TextEffect_3= ruleTextEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:87:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_UnaryOperation_2= ruleUnaryOperation | this_TextEffect_3= ruleTextEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:87:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_UnaryOperation_2= ruleUnaryOperation | this_TextEffect_3= ruleTextEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:88:2: this_Emission_0= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmission_in_ruleEffect141);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:101:2: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleEffect171);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:114:2: this_UnaryOperation_2= ruleUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getUnaryOperationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_ruleEffect201);
                    this_UnaryOperation_2=ruleUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnaryOperation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:127:2: this_TextEffect_3= ruleTextEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_ruleEffect231);
                    this_TextEffect_3=ruleTextEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextEffect_3; 
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:168:1: ruleEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_newValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:171:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:172:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:172:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:172:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:172:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:173:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:173:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:174:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmission355); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:188:2: (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:188:4: otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEmission368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:192:1: ( (lv_newValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:193:1: (lv_newValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:193:1: (lv_newValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:194:3: lv_newValue_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEmission389);
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

                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEmission401); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:222:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:223:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:224:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment439);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment449); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:231:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:234:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:235:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:235:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:235:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:235:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:236:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:236:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:237:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:251:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:251:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAssignment511); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:255:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:256:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:256:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:257:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment532);
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

            	    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssignment544); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAssignment558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:281:1: ( (lv_expression_5_0= ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:282:1: (lv_expression_5_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:282:1: (lv_expression_5_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:283:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment579);
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


    // $ANTLR start "entryRuleUnaryOperation"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:307:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:308:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:309:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation615);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperation625); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:316:1: ruleUnaryOperation returns [EObject current=null] : ( ( (lv_expression_0_0= rulePostfixAddExpression ) ) | ( (lv_expression_1_0= rulePostfixSubExpression ) ) ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:319:28: ( ( ( (lv_expression_0_0= rulePostfixAddExpression ) ) | ( (lv_expression_1_0= rulePostfixSubExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:320:1: ( ( (lv_expression_0_0= rulePostfixAddExpression ) ) | ( (lv_expression_1_0= rulePostfixSubExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:320:1: ( ( (lv_expression_0_0= rulePostfixAddExpression ) ) | ( (lv_expression_1_0= rulePostfixSubExpression ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:320:2: ( (lv_expression_0_0= rulePostfixAddExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:320:2: ( (lv_expression_0_0= rulePostfixAddExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:321:1: (lv_expression_0_0= rulePostfixAddExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:321:1: (lv_expression_0_0= rulePostfixAddExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:322:3: lv_expression_0_0= rulePostfixAddExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getExpressionPostfixAddExpressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixAddExpression_in_ruleUnaryOperation671);
                    lv_expression_0_0=rulePostfixAddExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_0_0, 
                              		"PostfixAddExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:339:6: ( (lv_expression_1_0= rulePostfixSubExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:339:6: ( (lv_expression_1_0= rulePostfixSubExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:340:1: (lv_expression_1_0= rulePostfixSubExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:340:1: (lv_expression_1_0= rulePostfixSubExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:341:3: lv_expression_1_0= rulePostfixSubExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getExpressionPostfixSubExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixSubExpression_in_ruleUnaryOperation698);
                    lv_expression_1_0=rulePostfixSubExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_1_0, 
                              		"PostfixSubExpression");
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
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleTextEffect"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:365:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextEffect = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:366:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:367:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_entryRuleTextEffect734);
            iv_ruleTextEffect=ruleTextEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextEffect744); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:374:1: ruleTextEffect returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:377:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:378:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:378:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:379:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:379:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:380:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextEffect785); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:404:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallEffect = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:405:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:406:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect825);
            iv_ruleFunctionCallEffect=ruleFunctionCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionCallEffect835); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:413:1: ruleFunctionCallEffect returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:416:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:417:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:417:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:417:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFunctionCallEffect872); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:421:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:422:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:422:1: (lv_functionName_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:423:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect893);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:439:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:439:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:439:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:439:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFunctionCallEffect907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:443:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:444:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:444:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:445:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCallEffect928);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:461:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==22) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:461:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFunctionCallEffect941); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:465:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:466:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:466:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:467:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCallEffect962);
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
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFunctionCallEffect976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:488:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFunctionCallEffect995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFunctionCallEffect1009); if (state.failed) return current;
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


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:506:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:507:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:508:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1047);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1057); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:515:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:518:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:519:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:519:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:520:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleExpression1107);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:533:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleExpression1137);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:552:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:553:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:554:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1172);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolExpression1182); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:561:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:564:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:566:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression1231);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:585:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:586:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:587:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression1265);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOrExpression1275); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:594:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:597:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:598:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:598:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:599:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1325);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:610:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:610:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:610:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:611:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:619:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==42) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:619:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:619:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:620:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:620:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:621:3: lv_operator_2_0= ruleLogicalOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression1359);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:637:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:638:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:638:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:639:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1380);
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
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:663:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:664:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:665:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression1420);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAndExpression1430); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:672:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:675:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:676:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:676:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:677:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression1480);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:688:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:688:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:688:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:689:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:697:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==43) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:697:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:697:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:698:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:698:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:699:3: lv_operator_2_0= ruleLogicalAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression1514);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:715:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:716:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:716:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:717:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression1535);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:741:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:742:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:743:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression1575);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBitwiseOrExpression1585); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:750:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:753:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:754:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:754:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:755:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression1635);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:766:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:766:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:766:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:767:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:775:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==35) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:775:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:775:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:776:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:776:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:777:3: lv_operator_2_0= ruleBitwiseOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression1669);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:793:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:794:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:794:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:795:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression1690);
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:819:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:820:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:821:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression1730);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBitwiseAndExpression1740); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:828:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:831:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:832:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:832:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:833:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression1790);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:844:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:844:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:844:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:845:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:853:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==25) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:853:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:853:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:854:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:854:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:855:3: lv_operator_2_0= ruleBitwiseAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression1824);
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

                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:871:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:872:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:872:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:873:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression1845);
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:897:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:898:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:899:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1885);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation1895); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:906:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:909:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:910:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:910:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:911:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1945);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:922:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21||LA16_0==24||(LA16_0>=30 && LA16_0<=33)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:922:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:922:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:923:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:931:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:932:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:932:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:933:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleCompareOperation1978);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:949:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:950:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:950:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:951:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1999);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:975:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:976:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:977:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression2037);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression2047); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:984:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:987:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:988:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:988:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:989:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression2097);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1002:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression2127);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1021:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1022:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1023:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression2162);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression2172); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1030:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1033:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1034:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1034:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_HOSTCODE)||LA18_0==RULE_BOOLEAN||LA18_0==16||LA18_0==21||LA18_0==34||LA18_0==41) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1034:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1034:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1034:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1034:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1035:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1043:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1044:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1044:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1045:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_ruleNotExpression2231);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1061:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1062:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1062:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1063:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotExpression2252);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1081:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleNotExpression2284);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1100:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1101:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1102:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression2319);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression2329); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1109:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1112:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1114:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression2378);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1133:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1134:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1135:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression2412);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression2422); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1142:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1145:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1146:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1146:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1147:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression2472);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1158:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1158:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1158:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1159:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1167:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1168:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1168:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1169:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_ruleAddExpression2505);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1185:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1186:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1186:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1187:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression2526);
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
            	    break loop19;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1211:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1212:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1213:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression2564);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression2574); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1220:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1223:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1224:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1224:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1225:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression2624);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1236:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1236:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1236:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1237:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1245:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1246:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1246:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1247:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleSubExpression2657);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1263:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1264:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1264:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1265:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression2678);
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1289:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1290:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1291:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression2716);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression2726); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1298:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1301:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1302:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1302:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1303:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression2776);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1314:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1314:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1314:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1315:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1323:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1324:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1324:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1325:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_ruleMultExpression2809);
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

            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1341:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1342:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1342:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1343:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression2830);
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1367:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1368:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1369:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression2868);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression2878); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1376:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1379:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1380:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1380:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1381:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression2928);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1392:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1392:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1392:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1393:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1401:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1402:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1402:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1403:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_ruleDivExpression2961);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1419:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1420:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1420:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1421:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression2982);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1445:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1446:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1447:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression3020);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression3030); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1454:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1457:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1458:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1458:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1459:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleModExpression3080);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1470:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1470:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1470:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1471:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1479:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1480:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1480:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1481:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_ruleModExpression3113);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1497:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1498:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1498:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1499:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression3134);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1523:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1524:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1525:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression3172);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression3182); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1532:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_PostfixAddExpression_3= rulePostfixAddExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_PostfixAddExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1535:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_PostfixAddExpression_3= rulePostfixAddExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1536:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_PostfixAddExpression_3= rulePostfixAddExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1536:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_PostfixAddExpression_3= rulePostfixAddExpression )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)||LA24_0==16||LA24_0==21||LA24_0==34||LA24_0==41||(LA24_0>=44 && LA24_0<=45)) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1536:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1536:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1536:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1536:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1537:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1545:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1546:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1546:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1547:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleNegExpression3241);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1563:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1564:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1564:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1565:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleNegExpression3262);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1583:2: this_PostfixAddExpression_3= rulePostfixAddExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getPostfixAddExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixAddExpression_in_ruleNegExpression3294);
                    this_PostfixAddExpression_3=rulePostfixAddExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PostfixAddExpression_3; 
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


    // $ANTLR start "entryRulePostfixAddExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1602:1: entryRulePostfixAddExpression returns [EObject current=null] : iv_rulePostfixAddExpression= rulePostfixAddExpression EOF ;
    public final EObject entryRulePostfixAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixAddExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1603:2: (iv_rulePostfixAddExpression= rulePostfixAddExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1604:2: iv_rulePostfixAddExpression= rulePostfixAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePostfixAddExpression_in_entryRulePostfixAddExpression3329);
            iv_rulePostfixAddExpression=rulePostfixAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePostfixAddExpression3339); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixAddExpression"


    // $ANTLR start "rulePostfixAddExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1611:1: rulePostfixAddExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) ) | this_PostfixSubExpression_3= rulePostfixSubExpression ) ;
    public final EObject rulePostfixAddExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_PostfixSubExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1614:28: ( ( ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) ) | this_PostfixSubExpression_3= rulePostfixSubExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1615:1: ( ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) ) | this_PostfixSubExpression_3= rulePostfixSubExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1615:1: ( ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) ) | this_PostfixSubExpression_3= rulePostfixSubExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||LA25_0==16||LA25_0==21||LA25_0==34||LA25_0==41||LA25_0==45) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1615:2: ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1615:2: ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1615:3: () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1615:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1616:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPostfixAddExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1624:2: ( (lv_operator_1_0= rulePostfixAdd ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1625:1: (lv_operator_1_0= rulePostfixAdd )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1625:1: (lv_operator_1_0= rulePostfixAdd )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1626:3: lv_operator_1_0= rulePostfixAdd
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixAddExpressionAccess().getOperatorPostfixAddEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixAdd_in_rulePostfixAddExpression3398);
                    lv_operator_1_0=rulePostfixAdd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixAddExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"PostfixAdd");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1642:2: ( (lv_subExpressions_2_0= rulePostfixAddExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1643:1: (lv_subExpressions_2_0= rulePostfixAddExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1643:1: (lv_subExpressions_2_0= rulePostfixAddExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1644:3: lv_subExpressions_2_0= rulePostfixAddExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixAddExpressionAccess().getSubExpressionsPostfixAddExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixAddExpression_in_rulePostfixAddExpression3419);
                    lv_subExpressions_2_0=rulePostfixAddExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixAddExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"PostfixAddExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1662:2: this_PostfixSubExpression_3= rulePostfixSubExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPostfixAddExpressionAccess().getPostfixSubExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixSubExpression_in_rulePostfixAddExpression3451);
                    this_PostfixSubExpression_3=rulePostfixSubExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PostfixSubExpression_3; 
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
    // $ANTLR end "rulePostfixAddExpression"


    // $ANTLR start "entryRulePostfixSubExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1681:1: entryRulePostfixSubExpression returns [EObject current=null] : iv_rulePostfixSubExpression= rulePostfixSubExpression EOF ;
    public final EObject entryRulePostfixSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixSubExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1682:2: (iv_rulePostfixSubExpression= rulePostfixSubExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1683:2: iv_rulePostfixSubExpression= rulePostfixSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePostfixSubExpression_in_entryRulePostfixSubExpression3486);
            iv_rulePostfixSubExpression=rulePostfixSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePostfixSubExpression3496); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixSubExpression"


    // $ANTLR start "rulePostfixSubExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1690:1: rulePostfixSubExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject rulePostfixSubExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1693:28: ( ( ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1694:1: ( ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1694:1: ( ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1694:2: ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1694:2: ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1694:3: () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1694:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1695:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPostfixSubExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1703:2: ( (lv_operator_1_0= rulePostfixSub ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1704:1: (lv_operator_1_0= rulePostfixSub )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1704:1: (lv_operator_1_0= rulePostfixSub )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1705:3: lv_operator_1_0= rulePostfixSub
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixSubExpressionAccess().getOperatorPostfixSubEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixSub_in_rulePostfixSubExpression3555);
                    lv_operator_1_0=rulePostfixSub();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixSubExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"PostfixSub");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1721:2: ( (lv_subExpressions_2_0= rulePostfixSubExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1722:1: (lv_subExpressions_2_0= rulePostfixSubExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1722:1: (lv_subExpressions_2_0= rulePostfixSubExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1723:3: lv_subExpressions_2_0= rulePostfixSubExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixSubExpressionAccess().getSubExpressionsPostfixSubExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixSubExpression_in_rulePostfixSubExpression3576);
                    lv_subExpressions_2_0=rulePostfixSubExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixSubExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"PostfixSubExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1741:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPostfixSubExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rulePostfixSubExpression3608);
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
    // $ANTLR end "rulePostfixSubExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1760:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1761:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1762:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression3643);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression3653); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1769:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1772:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1773:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1773:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1774:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_ruleAtomicExpression3703);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1787:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression3733);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1799:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1799:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1799:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAtomicExpression3751); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleAtomicExpression3776);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAtomicExpression3787); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1821:2: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionCall_in_ruleAtomicExpression3819);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1834:2: this_TextExpression_6= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_ruleAtomicExpression3849);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1853:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1854:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1855:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression3884);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression3894); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1862:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1865:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1866:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1866:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt28=5;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1867:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression3944);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1880:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression3974);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1893:2: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression4004);
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1905:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1905:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1905:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAtomicValuedExpression4022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression4047);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAtomicValuedExpression4058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1927:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression4090);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1946:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1947:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1948:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression4125);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression4135); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1955:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1958:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1959:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1959:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1959:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1959:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1959:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1959:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1960:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1968:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1969:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1969:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1970:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1970:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
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
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1971:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression4196);
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
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1986:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression4215);
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

                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleValuedObjectTestExpression4230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2008:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2009:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2009:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2010:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression4251);
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

                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleValuedObjectTestExpression4263); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2032:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression4295);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2051:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2052:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2053:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference4330);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference4340); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2060:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2063:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2064:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2064:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2064:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2064:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2065:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2065:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2066:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObjectReference4389); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2080:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2080:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleValuedObjectReference4402); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2084:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2085:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2085:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2086:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleValuedObjectReference4423);
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

            	    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleValuedObjectReference4435); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2114:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2115:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2116:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4473);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionCall4483); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2123:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2126:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2127:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2127:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2127:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFunctionCall4520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2131:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2132:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2132:1: (lv_functionName_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2133:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleFunctionCall4541);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2149:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
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
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2149:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2149:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2149:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFunctionCall4555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2153:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2154:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2154:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2155:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCall4576);
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2171:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==22) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2171:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFunctionCall4589); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2175:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2176:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2176:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2177:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCall4610);
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

                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFunctionCall4624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2198:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFunctionCall4643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFunctionCall4657); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2214:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2215:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2216:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter4693);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter4703); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2223:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_callByReference_0_0=null;
        Token lv_pureOutput_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2226:28: ( ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2227:1: ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2227:1: ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2227:2: ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2227:2: ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2227:3: ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )?
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2227:3: ( (lv_callByReference_0_0= '&' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2228:1: (lv_callByReference_0_0= '&' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2228:1: (lv_callByReference_0_0= '&' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2229:3: lv_callByReference_0_0= '&'
                    {
                    lv_callByReference_0_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleParameter4747); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2242:2: ( (lv_pureOutput_1_0= '&' ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==25) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2243:1: (lv_pureOutput_1_0= '&' )
                            {
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2243:1: (lv_pureOutput_1_0= '&' )
                            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2244:3: lv_pureOutput_1_0= '&'
                            {
                            lv_pureOutput_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleParameter4778); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2257:5: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2258:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2258:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2259:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParameter4815);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2283:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2284:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2285:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression4851);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression4861); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2292:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2295:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2296:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2296:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2297:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2297:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2298:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextExpression4902); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2322:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2323:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2324:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue4942);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue4952); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2331:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2334:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2335:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2335:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2336:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2336:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2337:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntValue4993); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2361:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2362:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2363:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue5033);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue5043); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2370:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2373:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2374:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2374:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2375:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2375:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2376:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloatValue5084); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2400:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2401:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2402:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_entryRuleBoolValue5124);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolValue5134); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2409:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2412:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2413:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2413:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2414:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2414:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2415:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleBoolValue5175); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2439:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2440:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2441:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_entryRuleStringValue5215);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringValue5225); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2448:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2451:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2452:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2452:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2453:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2453:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2454:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringValue5266); if (state.failed) return current;
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


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2484:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2485:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2486:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5312);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation5322); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2493:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2496:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2497:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2497:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2498:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2498:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2499:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5363); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2523:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2524:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2525:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation5403);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation5413); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2532:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2535:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2536:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2536:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2536:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTagAnnotation5450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2540:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2541:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2541:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2542:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTagAnnotation5471);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2566:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2567:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2568:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation5507);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation5517); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2575:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+ ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2578:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+ ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2579:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+ )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2579:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+ )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2579:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleKeyStringValueAnnotation5554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2583:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2584:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2584:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2585:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation5575);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2601:2: ( (lv_values_2_0= ruleEString ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID||LA36_0==RULE_STRING) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2602:1: (lv_values_2_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2602:1: (lv_values_2_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2603:3: lv_values_2_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation5596);
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
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2627:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2628:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2629:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation5633);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation5643); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2636:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+ ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2639:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+ ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2640:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+ )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2640:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+ )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2640:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTypedKeyStringValueAnnotation5680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2644:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2645:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2645:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2646:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5701);
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

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTypedKeyStringValueAnnotation5713); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2666:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2667:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2667:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2668:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5734);
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

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTypedKeyStringValueAnnotation5746); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2688:1: ( (lv_values_5_0= ruleEString ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID||LA37_0==RULE_STRING) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2689:1: (lv_values_5_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2689:1: (lv_values_5_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2690:3: lv_values_5_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation5767);
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
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2714:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2715:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2716:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation5804);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation5814); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2723:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2726:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2727:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2727:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2727:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleKeyBooleanValueAnnotation5851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2731:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2732:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2732:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2733:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation5872);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2749:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2750:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2750:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2751:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation5889); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2775:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2776:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2777:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation5930);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation5940); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2784:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2787:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2788:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2788:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2788:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleKeyIntValueAnnotation5977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2792:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2793:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2793:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2794:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation5998);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2810:2: ( (lv_value_2_0= ruleInteger ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2811:1: (lv_value_2_0= ruleInteger )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2811:1: (lv_value_2_0= ruleInteger )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2812:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation6019);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2836:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2837:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2838:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation6055);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation6065); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2845:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2848:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2849:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2849:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2849:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleKeyFloatValueAnnotation6102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2853:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2854:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2854:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2855:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation6123);
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

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2871:2: ( (lv_value_2_0= ruleFloateger ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2872:1: (lv_value_2_0= ruleFloateger )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2872:1: (lv_value_2_0= ruleFloateger )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2873:3: lv_value_2_0= ruleFloateger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation6144);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2899:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2900:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2901:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString6183);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString6194); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2908:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2911:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2912:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2912:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2912:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString6234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2921:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleEString6267);
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2939:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2940:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2941:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID6313);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID6324); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2948:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2951:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2952:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2952:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2952:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID6364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2959:1: (kw= '.' this_ID_2= RULE_ID )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==27) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2960:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleExtendedID6383); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID6398); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2972:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2973:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleExtendedID6419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                          
                    }
                    this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleExtendedID6434); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2993:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2994:2: (iv_ruleInteger= ruleInteger EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:2995:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger6482);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger6493); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3002:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3005:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3006:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3006:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3006:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3006:2: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==29) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3007:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInteger6532); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInteger6549); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3027:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3028:2: (iv_ruleFloateger= ruleFloateger EOF )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3029:2: iv_ruleFloateger= ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_entryRuleFloateger6595);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloateger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloateger6606); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3036:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3039:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3040:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3040:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3040:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3040:2: (kw= '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==29) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3041:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFloateger6645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloateger6662); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3061:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3063:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3064:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3064:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt43=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt43=1;
                }
                break;
            case 21:
                {
                alt43=2;
                }
                break;
            case 31:
                {
                alt43=3;
                }
                break;
            case 24:
                {
                alt43=4;
                }
                break;
            case 32:
                {
                alt43=5;
                }
                break;
            case 33:
                {
                alt43=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3064:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3064:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3064:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCompareOperator6721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3070:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3070:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3070:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCompareOperator6738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3076:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3076:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3076:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCompareOperator6755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3082:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3082:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3082:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCompareOperator6772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3088:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3088:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3088:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCompareOperator6789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3094:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3094:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3094:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCompareOperator6806); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3104:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3106:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3107:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3107:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3107:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulePreOperator6850); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3117:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3119:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3120:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3120:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3120:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBitwiseOrOperator6893); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3130:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3132:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3133:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3133:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3133:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBitwiseAndOperator6936); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3143:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3145:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3146:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3146:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3146:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleNotOperator6979); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3156:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3158:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3159:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3159:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3159:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAddOperator7022); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3169:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3171:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3172:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3172:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3172:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSubOperator7065); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3182:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3184:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3185:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3185:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3185:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMultOperator7108); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3195:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3197:28: ( (enumLiteral_0= '%' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3198:1: (enumLiteral_0= '%' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3198:1: (enumLiteral_0= '%' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3198:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleModOperator7151); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3208:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3210:28: ( (enumLiteral_0= '/' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3211:1: (enumLiteral_0= '/' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3211:1: (enumLiteral_0= '/' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3211:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDivOperator7194); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3221:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3223:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3224:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3224:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3224:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleValOperator7237); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3234:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3236:28: ( (enumLiteral_0= '||' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3237:1: (enumLiteral_0= '||' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3237:1: (enumLiteral_0= '||' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3237:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleLogicalOrOperator7280); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3247:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3249:28: ( (enumLiteral_0= '&&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3250:1: (enumLiteral_0= '&&' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3250:1: (enumLiteral_0= '&&' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3250:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleLogicalAndOperator7323); if (state.failed) return current;
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


    // $ANTLR start "rulePostfixAdd"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3260:1: rulePostfixAdd returns [Enumerator current=null] : (enumLiteral_0= '++' ) ;
    public final Enumerator rulePostfixAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3262:28: ( (enumLiteral_0= '++' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3263:1: (enumLiteral_0= '++' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3263:1: (enumLiteral_0= '++' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3263:3: enumLiteral_0= '++'
            {
            enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_rulePostfixAdd7366); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getPostfixAddAccess().getPOSTFIX_ADDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getPostfixAddAccess().getPOSTFIX_ADDEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostfixAdd"


    // $ANTLR start "rulePostfixSub"
    // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3273:1: rulePostfixSub returns [Enumerator current=null] : (enumLiteral_0= '--' ) ;
    public final Enumerator rulePostfixSub() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3275:28: ( (enumLiteral_0= '--' ) )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3276:1: (enumLiteral_0= '--' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3276:1: (enumLiteral_0= '--' )
            // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:3276:3: enumLiteral_0= '--'
            {
            enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_rulePostfixSub7409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getPostfixSubAccess().getPOSTFIX_SUBEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getPostfixSubAccess().getPOSTFIX_SUBEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostfixSub"

    // $ANTLR start synpred1_InternalKEffects
    public final void synpred1_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_Emission_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:88:2: (this_Emission_0= ruleEmission )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:88:2: this_Emission_0= ruleEmission
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleEmission_in_synpred1_InternalKEffects141);
        this_Emission_0=ruleEmission();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalKEffects

    // $ANTLR start synpred2_InternalKEffects
    public final void synpred2_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_Assignment_1 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:101:2: (this_Assignment_1= ruleAssignment )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:101:2: this_Assignment_1= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_synpred2_InternalKEffects171);
        this_Assignment_1=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalKEffects

    // $ANTLR start synpred3_InternalKEffects
    public final void synpred3_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_UnaryOperation_2 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:114:2: (this_UnaryOperation_2= ruleUnaryOperation )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:114:2: this_UnaryOperation_2= ruleUnaryOperation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_synpred3_InternalKEffects201);
        this_UnaryOperation_2=ruleUnaryOperation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalKEffects

    // $ANTLR start synpred4_InternalKEffects
    public final void synpred4_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_TextEffect_3 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:127:2: (this_TextEffect_3= ruleTextEffect )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:127:2: this_TextEffect_3= ruleTextEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_synpred4_InternalKEffects231);
        this_TextEffect_3=ruleTextEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalKEffects

    // $ANTLR start synpred7_InternalKEffects
    public final void synpred7_InternalKEffects_fragment() throws RecognitionException {   
        EObject lv_expression_0_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:320:2: ( ( (lv_expression_0_0= rulePostfixAddExpression ) ) )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:320:2: ( (lv_expression_0_0= rulePostfixAddExpression ) )
        {
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:320:2: ( (lv_expression_0_0= rulePostfixAddExpression ) )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:321:1: (lv_expression_0_0= rulePostfixAddExpression )
        {
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:321:1: (lv_expression_0_0= rulePostfixAddExpression )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:322:3: lv_expression_0_0= rulePostfixAddExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getExpressionPostfixAddExpressionParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulePostfixAddExpression_in_synpred7_InternalKEffects671);
        lv_expression_0_0=rulePostfixAddExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalKEffects

    // $ANTLR start synpred11_InternalKEffects
    public final void synpred11_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:520:2: (this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:520:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred11_InternalKEffects1107);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalKEffects

    // $ANTLR start synpred21_InternalKEffects
    public final void synpred21_InternalKEffects_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:989:2: (this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:989:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred21_InternalKEffects2097);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalKEffects

    // $ANTLR start synpred38_InternalKEffects
    public final void synpred38_InternalKEffects_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1905:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1905:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1905:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // ../de.cau.cs.kieler.core.kexpressions.keffects/src-gen/de/cau/cs/kieler/core/kexpressions/keffects/parser/antlr/internal/InternalKEffects.g:1905:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_synpred38_InternalKEffects4022); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred38_InternalKEffects4047);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred38_InternalKEffects4058); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalKEffects

    // Delegated rules

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
    public final boolean synpred21_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalKEffects_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalKEffects_fragment(); // can never throw exception
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
    public final boolean synpred38_InternalKEffects() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalKEffects_fragment(); // can never throw exception
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA1_eotS =
        "\21\uffff";
    static final String DFA1_eofS =
        "\21\uffff";
    static final String DFA1_minS =
        "\1\4\1\0\11\uffff\2\0\4\uffff";
    static final String DFA1_maxS =
        "\1\55\1\0\11\uffff\2\0\4\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\3\12\uffff\1\1\1\2\1\5\1\4";
    static final String DFA1_specialS =
        "\1\uffff\1\0\11\uffff\1\1\1\2\4\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\14\4\2\6\uffff\1\2\4\uffff\1\13\14\uffff\1\2\6\uffff"+
            "\1\2\2\uffff\2\2",
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
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
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
            return "87:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_UnaryOperation_2= ruleUnaryOperation | this_TextEffect_3= ruleTextEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )";
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
                        if ( (synpred1_InternalKEffects()) ) {s = 13;}

                        else if ( (synpred2_InternalKEffects()) ) {s = 14;}

                        else if ( (synpred3_InternalKEffects()) ) {s = 2;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKEffects()) ) {s = 2;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKEffects()) ) {s = 2;}

                        else if ( (synpred4_InternalKEffects()) ) {s = 16;}

                         
                        input.seek(index1_12);
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
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\16\uffff";
    static final String DFA4_minS =
        "\1\4\1\uffff\13\0\1\uffff";
    static final String DFA4_maxS =
        "\1\55\1\uffff\13\0\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\13\uffff\1\2";
    static final String DFA4_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\12\1\14\1\3\1\4\1\7\1\5\6\uffff\1\6\4\uffff\1\13\14\uffff"+
            "\1\10\6\uffff\1\11\2\uffff\1\1\1\2",
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
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "320:1: ( ( (lv_expression_0_0= rulePostfixAddExpression ) ) | ( (lv_expression_1_0= rulePostfixSubExpression ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA4_11 = input.LA(1);

                         
                        int index4_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA4_12 = input.LA(1);

                         
                        int index4_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index4_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA7_eotS =
        "\20\uffff";
    static final String DFA7_eofS =
        "\20\uffff";
    static final String DFA7_minS =
        "\1\4\15\0\2\uffff";
    static final String DFA7_maxS =
        "\1\55\15\0\2\uffff";
    static final String DFA7_acceptS =
        "\16\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\2\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\13\1\15\1\4\1\5\1\10\1\6\6\uffff\1\7\4\uffff\1\14\7\uffff"+
            "\1\1\4\uffff\1\11\1\uffff\1\16\4\uffff\1\12\2\uffff\1\2\1\3",
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "519:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKEffects()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKEffects()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKEffects()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKEffects()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKEffects()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKEffects()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_7 = input.LA(1);

                         
                        int index7_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKEffects()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA7_8 = input.LA(1);

                         
                        int index7_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKEffects()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA7_9 = input.LA(1);

                         
                        int index7_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKEffects()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA7_10 = input.LA(1);

                         
                        int index7_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKEffects()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA7_11 = input.LA(1);

                         
                        int index7_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKEffects()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA7_12 = input.LA(1);

                         
                        int index7_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKEffects()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA7_13 = input.LA(1);

                         
                        int index7_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKEffects()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\17\uffff";
    static final String DFA17_eofS =
        "\17\uffff";
    static final String DFA17_minS =
        "\1\4\6\uffff\7\0\1\uffff";
    static final String DFA17_maxS =
        "\1\55\6\uffff\7\0\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\14\uffff\1\2";
    static final String DFA17_specialS =
        "\7\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\13\1\15\2\1\1\10\1\1\6\uffff\1\7\4\uffff\1\14\7\uffff\1"+
            "\1\4\uffff\1\11\1\uffff\1\16\4\uffff\1\12\2\uffff\2\1",
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
            return "988:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_9 = input.LA(1);

                         
                        int index17_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index17_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_10 = input.LA(1);

                         
                        int index17_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index17_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_11 = input.LA(1);

                         
                        int index17_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index17_11);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_12 = input.LA(1);

                         
                        int index17_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index17_12);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_13 = input.LA(1);

                         
                        int index17_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalKEffects()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index17_13);
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
            return "1866:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
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
                        if ( (synpred38_InternalKEffects()) ) {s = 11;}

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
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEffect91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_ruleEffect141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleEffect201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCallEffect_in_ruleEffect261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission296 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmission306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmission355 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleEmission368 = new BitSet(new long[]{0x00003214202103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEmission389 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEmission401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment498 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleAssignment511 = new BitSet(new long[]{0x00003214202103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment532 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssignment544 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_20_in_ruleAssignment558 = new BitSet(new long[]{0x00003214202103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixAddExpression_in_ruleUnaryOperation671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixSubExpression_in_ruleUnaryOperation698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect734 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextEffect785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCallEffect_in_entryRuleFunctionCallEffect825 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCallEffect835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleFunctionCallEffect872 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCallEffect893 = new BitSet(new long[]{0x0000000001810000L});
        public static final BitSet FOLLOW_16_in_ruleFunctionCallEffect907 = new BitSet(new long[]{0x00003214222103F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect928 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleFunctionCallEffect941 = new BitSet(new long[]{0x00003214222103F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCallEffect962 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleFunctionCallEffect976 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_23_in_ruleFunctionCallEffect995 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleFunctionCallEffect1009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1047 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression1107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression1137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression1172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression1182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression1231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression1265 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression1275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1325 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression1359 = new BitSet(new long[]{0x00003214202103F0L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression1380 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression1420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression1430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression1480 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression1514 = new BitSet(new long[]{0x00003214202103F0L});
        public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression1535 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression1575 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression1585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression1635 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression1669 = new BitSet(new long[]{0x00003214202103F0L});
        public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression1690 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression1730 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression1740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression1790 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression1824 = new BitSet(new long[]{0x00003214202103F0L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression1845 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1885 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation1895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1945 = new BitSet(new long[]{0x00000003C1200002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation1978 = new BitSet(new long[]{0x00003214202103F0L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression2037 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression2047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression2097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression2127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression2162 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression2172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression2231 = new BitSet(new long[]{0x00003214202103F0L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression2252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression2284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression2319 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression2329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression2378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression2412 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression2422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression2472 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression2505 = new BitSet(new long[]{0x00003204202103F0L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression2526 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression2564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression2574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression2624 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression2657 = new BitSet(new long[]{0x00003204202103F0L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression2678 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression2716 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression2726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression2776 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression2809 = new BitSet(new long[]{0x00003204202103F0L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression2830 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression2868 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression2878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression2928 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression2961 = new BitSet(new long[]{0x00003204202103F0L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression2982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression3020 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression3030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression3080 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression3113 = new BitSet(new long[]{0x00003204202103F0L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression3134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression3172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression3182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression3241 = new BitSet(new long[]{0x00003204202103F0L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression3262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixAddExpression_in_ruleNegExpression3294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixAddExpression_in_entryRulePostfixAddExpression3329 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePostfixAddExpression3339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixAdd_in_rulePostfixAddExpression3398 = new BitSet(new long[]{0x00003204202103F0L});
        public static final BitSet FOLLOW_rulePostfixAddExpression_in_rulePostfixAddExpression3419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixSubExpression_in_rulePostfixAddExpression3451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixSubExpression_in_entryRulePostfixSubExpression3486 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePostfixSubExpression3496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixSub_in_rulePostfixSubExpression3555 = new BitSet(new long[]{0x00003204202103F0L});
        public static final BitSet FOLLOW_rulePostfixSubExpression_in_rulePostfixSubExpression3576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rulePostfixSubExpression3608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression3643 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression3653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression3703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression3733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAtomicExpression3751 = new BitSet(new long[]{0x00003214202103F0L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression3776 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAtomicExpression3787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCall_in_ruleAtomicExpression3819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression3849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression3884 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression3894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression3944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression3974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression4004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAtomicValuedExpression4022 = new BitSet(new long[]{0x00003204202103F0L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression4047 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAtomicValuedExpression4058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression4090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression4125 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression4135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression4196 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression4215 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleValuedObjectTestExpression4230 = new BitSet(new long[]{0x0000020400000010L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression4251 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleValuedObjectTestExpression4263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression4295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference4330 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference4340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference4389 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleValuedObjectReference4402 = new BitSet(new long[]{0x00003214202103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObjectReference4423 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleValuedObjectReference4435 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall4473 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall4483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleFunctionCall4520 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCall4541 = new BitSet(new long[]{0x0000000001810000L});
        public static final BitSet FOLLOW_16_in_ruleFunctionCall4555 = new BitSet(new long[]{0x00003214222103F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall4576 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleFunctionCall4589 = new BitSet(new long[]{0x00003214222103F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall4610 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleFunctionCall4624 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_23_in_ruleFunctionCall4643 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleFunctionCall4657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4693 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter4703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleParameter4747 = new BitSet(new long[]{0x00003214222103F0L});
        public static final BitSet FOLLOW_25_in_ruleParameter4778 = new BitSet(new long[]{0x00003214202103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParameter4815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression4851 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression4861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression4902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue4942 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue4952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue4993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue5033 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue5043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue5084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue5124 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue5134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue5175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue5215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringValue5225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue5266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5312 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation5322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation5403 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation5413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTagAnnotation5450 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation5471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation5507 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation5517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleKeyStringValueAnnotation5554 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation5575 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation5596 = new BitSet(new long[]{0x0000000000000212L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation5633 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation5643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTypedKeyStringValueAnnotation5680 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5701 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTypedKeyStringValueAnnotation5713 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation5734 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTypedKeyStringValueAnnotation5746 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation5767 = new BitSet(new long[]{0x0000000000000212L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation5804 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation5814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleKeyBooleanValueAnnotation5851 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation5872 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation5889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation5930 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation5940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleKeyIntValueAnnotation5977 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation5998 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation6019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation6055 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation6065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleKeyFloatValueAnnotation6102 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation6123 = new BitSet(new long[]{0x0000000020000080L});
        public static final BitSet FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation6144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString6194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString6234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleEString6267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID6313 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID6324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID6364 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_27_in_ruleExtendedID6383 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID6398 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_28_in_ruleExtendedID6419 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleExtendedID6434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger6482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger6493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleInteger6532 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInteger6549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloateger_in_entryRuleFloateger6595 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloateger6606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleFloateger6645 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloateger6662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCompareOperator6721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleCompareOperator6738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCompareOperator6755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleCompareOperator6772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleCompareOperator6789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleCompareOperator6806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rulePreOperator6850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleBitwiseOrOperator6893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBitwiseAndOperator6936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleNotOperator6979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleAddOperator7022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleSubOperator7065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleMultOperator7108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleModOperator7151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleDivOperator7194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleValOperator7237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleLogicalOrOperator7280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleLogicalAndOperator7323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rulePostfixAdd7366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rulePostfixSub7409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_synpred1_InternalKEffects141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_synpred2_InternalKEffects171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_synpred3_InternalKEffects201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_synpred4_InternalKEffects231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixAddExpression_in_synpred7_InternalKEffects671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred11_InternalKEffects1107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred21_InternalKEffects2097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_synpred38_InternalKEffects4022 = new BitSet(new long[]{0x00003204202103F0L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred38_InternalKEffects4047 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred38_InternalKEffects4058 = new BitSet(new long[]{0x0000000000000002L});
    }


}