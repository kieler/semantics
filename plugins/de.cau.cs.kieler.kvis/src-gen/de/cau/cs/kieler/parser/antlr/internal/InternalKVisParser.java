package de.cau.cs.kieler.parser.antlr.internal; 

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
import de.cau.cs.kieler.services.KVisGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKVisParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'image'", "':'", "'animate'", "'{'", "'}'", "'set'", "'using'", "'color'", "'text'", "'visible'", "'rotation'", "'movement'", "','", "'is'", "'..'", "'when'", "'['", "']'", "'.'", "'='", "'<'", "'<='", "'>'", "'>='", "'!='", "'and'", "'or'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=12;
    public static final int RULE_DIGIT=8;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_FLOAT=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalKVisParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKVisParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKVisParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKVis.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private KVisGrammarAccess grammarAccess;
     	
        public InternalKVisParser(TokenStream input, KVisGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Visualization";	
       	}
       	
       	@Override
       	protected KVisGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleVisualization"
    // InternalKVis.g:74:1: entryRuleVisualization returns [EObject current=null] : iv_ruleVisualization= ruleVisualization EOF ;
    public final EObject entryRuleVisualization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualization = null;


        try {
            // InternalKVis.g:75:2: (iv_ruleVisualization= ruleVisualization EOF )
            // InternalKVis.g:76:2: iv_ruleVisualization= ruleVisualization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisualizationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVisualization=ruleVisualization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisualization; 
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
    // $ANTLR end "entryRuleVisualization"


    // $ANTLR start "ruleVisualization"
    // InternalKVis.g:83:1: ruleVisualization returns [EObject current=null] : (otherlv_0= 'image' otherlv_1= ':' ( (lv_image_2_0= RULE_STRING ) ) ( (lv_elements_3_0= ruleElement ) )* ) ;
    public final EObject ruleVisualization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_image_2_0=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:86:28: ( (otherlv_0= 'image' otherlv_1= ':' ( (lv_image_2_0= RULE_STRING ) ) ( (lv_elements_3_0= ruleElement ) )* ) )
            // InternalKVis.g:87:1: (otherlv_0= 'image' otherlv_1= ':' ( (lv_image_2_0= RULE_STRING ) ) ( (lv_elements_3_0= ruleElement ) )* )
            {
            // InternalKVis.g:87:1: (otherlv_0= 'image' otherlv_1= ':' ( (lv_image_2_0= RULE_STRING ) ) ( (lv_elements_3_0= ruleElement ) )* )
            // InternalKVis.g:87:3: otherlv_0= 'image' otherlv_1= ':' ( (lv_image_2_0= RULE_STRING ) ) ( (lv_elements_3_0= ruleElement ) )*
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVisualizationAccess().getImageKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVisualizationAccess().getColonKeyword_1());
                  
            }
            // InternalKVis.g:95:1: ( (lv_image_2_0= RULE_STRING ) )
            // InternalKVis.g:96:1: (lv_image_2_0= RULE_STRING )
            {
            // InternalKVis.g:96:1: (lv_image_2_0= RULE_STRING )
            // InternalKVis.g:97:3: lv_image_2_0= RULE_STRING
            {
            lv_image_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_image_2_0, grammarAccess.getVisualizationAccess().getImageSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVisualizationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"image",
                      		lv_image_2_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            // InternalKVis.g:113:2: ( (lv_elements_3_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKVis.g:114:1: (lv_elements_3_0= ruleElement )
            	    {
            	    // InternalKVis.g:114:1: (lv_elements_3_0= ruleElement )
            	    // InternalKVis.g:115:3: lv_elements_3_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVisualizationAccess().getElementsElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_elements_3_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVisualizationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"de.cau.cs.kieler.KVis.Element");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleVisualization"


    // $ANTLR start "entryRuleElement"
    // InternalKVis.g:139:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalKVis.g:140:2: (iv_ruleElement= ruleElement EOF )
            // InternalKVis.g:141:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalKVis.g:148:1: ruleElement returns [EObject current=null] : (otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimationRule ) )+ otherlv_4= '}' ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_animations_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:151:28: ( (otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimationRule ) )+ otherlv_4= '}' ) )
            // InternalKVis.g:152:1: (otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimationRule ) )+ otherlv_4= '}' )
            {
            // InternalKVis.g:152:1: (otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimationRule ) )+ otherlv_4= '}' )
            // InternalKVis.g:152:3: otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimationRule ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElementAccess().getAnimateKeyword_0());
                  
            }
            // InternalKVis.g:156:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalKVis.g:157:1: (lv_name_1_0= RULE_ID )
            {
            // InternalKVis.g:157:1: (lv_name_1_0= RULE_ID )
            // InternalKVis.g:158:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalKVis.g:178:1: ( (lv_animations_3_0= ruleAnimationRule ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKVis.g:179:1: (lv_animations_3_0= ruleAnimationRule )
            	    {
            	    // InternalKVis.g:179:1: (lv_animations_3_0= ruleAnimationRule )
            	    // InternalKVis.g:180:3: lv_animations_3_0= ruleAnimationRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementAccess().getAnimationsAnimationRuleParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_animations_3_0=ruleAnimationRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"animations",
            	              		lv_animations_3_0, 
            	              		"de.cau.cs.kieler.KVis.AnimationRule");
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

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleAnimationRule"
    // InternalKVis.g:208:1: entryRuleAnimationRule returns [EObject current=null] : iv_ruleAnimationRule= ruleAnimationRule EOF ;
    public final EObject entryRuleAnimationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimationRule = null;


        try {
            // InternalKVis.g:209:2: (iv_ruleAnimationRule= ruleAnimationRule EOF )
            // InternalKVis.g:210:2: iv_ruleAnimationRule= ruleAnimationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnimationRuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnimationRule=ruleAnimationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnimationRule; 
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
    // $ANTLR end "entryRuleAnimationRule"


    // $ANTLR start "ruleAnimationRule"
    // InternalKVis.g:217:1: ruleAnimationRule returns [EObject current=null] : (otherlv_0= 'set' this_Animation_1= ruleAnimation (otherlv_2= 'using' ( (lv_variable_3_0= ruleVariableReference ) ) )? otherlv_4= '{' ( (lv_mappings_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ( (lv_condition_7_0= ruleCondition ) )? ) ;
    public final EObject ruleAnimationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Animation_1 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_mappings_5_0 = null;

        EObject lv_condition_7_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:220:28: ( (otherlv_0= 'set' this_Animation_1= ruleAnimation (otherlv_2= 'using' ( (lv_variable_3_0= ruleVariableReference ) ) )? otherlv_4= '{' ( (lv_mappings_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ( (lv_condition_7_0= ruleCondition ) )? ) )
            // InternalKVis.g:221:1: (otherlv_0= 'set' this_Animation_1= ruleAnimation (otherlv_2= 'using' ( (lv_variable_3_0= ruleVariableReference ) ) )? otherlv_4= '{' ( (lv_mappings_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ( (lv_condition_7_0= ruleCondition ) )? )
            {
            // InternalKVis.g:221:1: (otherlv_0= 'set' this_Animation_1= ruleAnimation (otherlv_2= 'using' ( (lv_variable_3_0= ruleVariableReference ) ) )? otherlv_4= '{' ( (lv_mappings_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ( (lv_condition_7_0= ruleCondition ) )? )
            // InternalKVis.g:221:3: otherlv_0= 'set' this_Animation_1= ruleAnimation (otherlv_2= 'using' ( (lv_variable_3_0= ruleVariableReference ) ) )? otherlv_4= '{' ( (lv_mappings_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ( (lv_condition_7_0= ruleCondition ) )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnimationRuleAccess().getSetKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAnimationRuleAccess().getAnimationParserRuleCall_1()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_11);
            this_Animation_1=ruleAnimation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Animation_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKVis.g:237:1: (otherlv_2= 'using' ( (lv_variable_3_0= ruleVariableReference ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKVis.g:237:3: otherlv_2= 'using' ( (lv_variable_3_0= ruleVariableReference ) )
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnimationRuleAccess().getUsingKeyword_2_0());
                          
                    }
                    // InternalKVis.g:241:1: ( (lv_variable_3_0= ruleVariableReference ) )
                    // InternalKVis.g:242:1: (lv_variable_3_0= ruleVariableReference )
                    {
                    // InternalKVis.g:242:1: (lv_variable_3_0= ruleVariableReference )
                    // InternalKVis.g:243:3: lv_variable_3_0= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnimationRuleAccess().getVariableVariableReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_variable_3_0=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnimationRuleRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_3_0, 
                              		"de.cau.cs.kieler.KVis.VariableReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAnimationRuleAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalKVis.g:263:1: ( (lv_mappings_5_0= ruleAttributeMapping ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKVis.g:264:1: (lv_mappings_5_0= ruleAttributeMapping )
            	    {
            	    // InternalKVis.g:264:1: (lv_mappings_5_0= ruleAttributeMapping )
            	    // InternalKVis.g:265:3: lv_mappings_5_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnimationRuleAccess().getMappingsAttributeMappingParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    lv_mappings_5_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnimationRuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappings",
            	              		lv_mappings_5_0, 
            	              		"de.cau.cs.kieler.KVis.AttributeMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAnimationRuleAccess().getRightCurlyBracketKeyword_5());
                  
            }
            // InternalKVis.g:285:1: ( (lv_condition_7_0= ruleCondition ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKVis.g:286:1: (lv_condition_7_0= ruleCondition )
                    {
                    // InternalKVis.g:286:1: (lv_condition_7_0= ruleCondition )
                    // InternalKVis.g:287:3: lv_condition_7_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnimationRuleAccess().getConditionConditionParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_condition_7_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnimationRuleRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_7_0, 
                              		"de.cau.cs.kieler.KVis.Condition");
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
    // $ANTLR end "ruleAnimationRule"


    // $ANTLR start "entryRuleAnimation"
    // InternalKVis.g:311:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // InternalKVis.g:312:2: (iv_ruleAnimation= ruleAnimation EOF )
            // InternalKVis.g:313:2: iv_ruleAnimation= ruleAnimation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnimationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnimation=ruleAnimation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnimation; 
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
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // InternalKVis.g:320:1: ruleAnimation returns [EObject current=null] : ( (otherlv_0= 'color' () ) | (otherlv_2= 'text' () ) | (otherlv_4= 'visible' () ) | (otherlv_6= 'rotation' () ) | (otherlv_8= 'movement' () ) ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // InternalKVis.g:323:28: ( ( (otherlv_0= 'color' () ) | (otherlv_2= 'text' () ) | (otherlv_4= 'visible' () ) | (otherlv_6= 'rotation' () ) | (otherlv_8= 'movement' () ) ) )
            // InternalKVis.g:324:1: ( (otherlv_0= 'color' () ) | (otherlv_2= 'text' () ) | (otherlv_4= 'visible' () ) | (otherlv_6= 'rotation' () ) | (otherlv_8= 'movement' () ) )
            {
            // InternalKVis.g:324:1: ( (otherlv_0= 'color' () ) | (otherlv_2= 'text' () ) | (otherlv_4= 'visible' () ) | (otherlv_6= 'rotation' () ) | (otherlv_8= 'movement' () ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            case 25:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalKVis.g:324:2: (otherlv_0= 'color' () )
                    {
                    // InternalKVis.g:324:2: (otherlv_0= 'color' () )
                    // InternalKVis.g:324:4: otherlv_0= 'color' ()
                    {
                    otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getAnimationAccess().getColorKeyword_0_0());
                          
                    }
                    // InternalKVis.g:328:1: ()
                    // InternalKVis.g:329:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAnimationAccess().getColorAnimationAction_0_1(),
                                  current);
                          
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:338:6: (otherlv_2= 'text' () )
                    {
                    // InternalKVis.g:338:6: (otherlv_2= 'text' () )
                    // InternalKVis.g:338:8: otherlv_2= 'text' ()
                    {
                    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnimationAccess().getTextKeyword_1_0());
                          
                    }
                    // InternalKVis.g:342:1: ()
                    // InternalKVis.g:343:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAnimationAccess().getTextAnimationAction_1_1(),
                                  current);
                          
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKVis.g:352:6: (otherlv_4= 'visible' () )
                    {
                    // InternalKVis.g:352:6: (otherlv_4= 'visible' () )
                    // InternalKVis.g:352:8: otherlv_4= 'visible' ()
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAnimationAccess().getVisibleKeyword_2_0());
                          
                    }
                    // InternalKVis.g:356:1: ()
                    // InternalKVis.g:357:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAnimationAccess().getVisibleAnimationAction_2_1(),
                                  current);
                          
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKVis.g:366:6: (otherlv_6= 'rotation' () )
                    {
                    // InternalKVis.g:366:6: (otherlv_6= 'rotation' () )
                    // InternalKVis.g:366:8: otherlv_6= 'rotation' ()
                    {
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAnimationAccess().getRotationKeyword_3_0());
                          
                    }
                    // InternalKVis.g:370:1: ()
                    // InternalKVis.g:371:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAnimationAccess().getRotateAnimationAction_3_1(),
                                  current);
                          
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalKVis.g:380:6: (otherlv_8= 'movement' () )
                    {
                    // InternalKVis.g:380:6: (otherlv_8= 'movement' () )
                    // InternalKVis.g:380:8: otherlv_8= 'movement' ()
                    {
                    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getAnimationAccess().getMovementKeyword_4_0());
                          
                    }
                    // InternalKVis.g:384:1: ()
                    // InternalKVis.g:385:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAnimationAccess().getMoveAnimationAction_4_1(),
                                  current);
                          
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
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleAttributeMapping"
    // InternalKVis.g:401:1: entryRuleAttributeMapping returns [EObject current=null] : iv_ruleAttributeMapping= ruleAttributeMapping EOF ;
    public final EObject entryRuleAttributeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeMapping = null;


        try {
            // InternalKVis.g:402:2: (iv_ruleAttributeMapping= ruleAttributeMapping EOF )
            // InternalKVis.g:403:2: iv_ruleAttributeMapping= ruleAttributeMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeMapping=ruleAttributeMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeMapping; 
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
    // $ANTLR end "entryRuleAttributeMapping"


    // $ANTLR start "ruleAttributeMapping"
    // InternalKVis.g:410:1: ruleAttributeMapping returns [EObject current=null] : ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_literal_2_0= ruleLiteral ) ) | ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* ) ) ) ;
    public final EObject ruleAttributeMapping() throws RecognitionException {
        EObject current = null;

        Token lv_attribute_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_literal_2_0 = null;

        EObject lv_mappings_3_0 = null;

        EObject lv_mappings_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:413:28: ( ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_literal_2_0= ruleLiteral ) ) | ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* ) ) ) )
            // InternalKVis.g:414:1: ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_literal_2_0= ruleLiteral ) ) | ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* ) ) )
            {
            // InternalKVis.g:414:1: ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_literal_2_0= ruleLiteral ) ) | ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* ) ) )
            // InternalKVis.g:414:2: ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_literal_2_0= ruleLiteral ) ) | ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* ) )
            {
            // InternalKVis.g:414:2: ( (lv_attribute_0_0= RULE_ID ) )
            // InternalKVis.g:415:1: (lv_attribute_0_0= RULE_ID )
            {
            // InternalKVis.g:415:1: (lv_attribute_0_0= RULE_ID )
            // InternalKVis.g:416:3: lv_attribute_0_0= RULE_ID
            {
            lv_attribute_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_attribute_0_0, grammarAccess.getAttributeMappingAccess().getAttributeIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeMappingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"attribute",
                      		lv_attribute_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeMappingAccess().getColonKeyword_1());
                  
            }
            // InternalKVis.g:436:1: ( ( (lv_literal_2_0= ruleLiteral ) ) | ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=27 && LA8_1<=28)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EOF||LA8_1==RULE_ID||LA8_1==18) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==27) ) {
                    alt8=2;
                }
                else if ( (LA8_2==EOF||LA8_2==RULE_ID||LA8_2==18) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==27) ) {
                    alt8=2;
                }
                else if ( (LA8_3==EOF||LA8_3==RULE_ID||LA8_3==18) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalKVis.g:436:2: ( (lv_literal_2_0= ruleLiteral ) )
                    {
                    // InternalKVis.g:436:2: ( (lv_literal_2_0= ruleLiteral ) )
                    // InternalKVis.g:437:1: (lv_literal_2_0= ruleLiteral )
                    {
                    // InternalKVis.g:437:1: (lv_literal_2_0= ruleLiteral )
                    // InternalKVis.g:438:3: lv_literal_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getLiteralLiteralParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_literal_2_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_2_0, 
                              		"de.cau.cs.kieler.KVis.Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:455:6: ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* )
                    {
                    // InternalKVis.g:455:6: ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* )
                    // InternalKVis.g:455:7: ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )*
                    {
                    // InternalKVis.g:455:7: ( (lv_mappings_3_0= ruleMapping ) )
                    // InternalKVis.g:456:1: (lv_mappings_3_0= ruleMapping )
                    {
                    // InternalKVis.g:456:1: (lv_mappings_3_0= ruleMapping )
                    // InternalKVis.g:457:3: lv_mappings_3_0= ruleMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getMappingsMappingParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_mappings_3_0=ruleMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                      	        }
                             		add(
                             			current, 
                             			"mappings",
                              		lv_mappings_3_0, 
                              		"de.cau.cs.kieler.KVis.Mapping");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKVis.g:473:2: (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==26) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalKVis.g:473:4: otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAttributeMappingAccess().getCommaKeyword_2_1_1_0());
                    	          
                    	    }
                    	    // InternalKVis.g:477:1: ( (lv_mappings_5_0= ruleMapping ) )
                    	    // InternalKVis.g:478:1: (lv_mappings_5_0= ruleMapping )
                    	    {
                    	    // InternalKVis.g:478:1: (lv_mappings_5_0= ruleMapping )
                    	    // InternalKVis.g:479:3: lv_mappings_5_0= ruleMapping
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getMappingsMappingParserRuleCall_2_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_15);
                    	    lv_mappings_5_0=ruleMapping();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"mappings",
                    	              		lv_mappings_5_0, 
                    	              		"de.cau.cs.kieler.KVis.Mapping");
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
    // $ANTLR end "ruleAttributeMapping"


    // $ANTLR start "entryRuleMapping"
    // InternalKVis.g:503:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalKVis.g:504:2: (iv_ruleMapping= ruleMapping EOF )
            // InternalKVis.g:505:2: iv_ruleMapping= ruleMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapping; 
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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalKVis.g:512:1: ruleMapping returns [EObject current=null] : ( ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) ) ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variableDomain_0_0 = null;

        EObject lv_attributeDomain_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:515:28: ( ( ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) ) ) )
            // InternalKVis.g:516:1: ( ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) ) )
            {
            // InternalKVis.g:516:1: ( ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) ) )
            // InternalKVis.g:516:2: ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) )
            {
            // InternalKVis.g:516:2: ( (lv_variableDomain_0_0= ruleVariableDomain ) )
            // InternalKVis.g:517:1: (lv_variableDomain_0_0= ruleVariableDomain )
            {
            // InternalKVis.g:517:1: (lv_variableDomain_0_0= ruleVariableDomain )
            // InternalKVis.g:518:3: lv_variableDomain_0_0= ruleVariableDomain
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingAccess().getVariableDomainVariableDomainParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_variableDomain_0_0=ruleVariableDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMappingRule());
              	        }
                     		set(
                     			current, 
                     			"variableDomain",
                      		lv_variableDomain_0_0, 
                      		"de.cau.cs.kieler.KVis.VariableDomain");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getIsKeyword_1());
                  
            }
            // InternalKVis.g:538:1: ( (lv_attributeDomain_2_0= ruleAttributeDomain ) )
            // InternalKVis.g:539:1: (lv_attributeDomain_2_0= ruleAttributeDomain )
            {
            // InternalKVis.g:539:1: (lv_attributeDomain_2_0= ruleAttributeDomain )
            // InternalKVis.g:540:3: lv_attributeDomain_2_0= ruleAttributeDomain
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingAccess().getAttributeDomainAttributeDomainParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_attributeDomain_2_0=ruleAttributeDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMappingRule());
              	        }
                     		set(
                     			current, 
                     			"attributeDomain",
                      		lv_attributeDomain_2_0, 
                      		"de.cau.cs.kieler.KVis.AttributeDomain");
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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleVariableDomain"
    // InternalKVis.g:564:1: entryRuleVariableDomain returns [EObject current=null] : iv_ruleVariableDomain= ruleVariableDomain EOF ;
    public final EObject entryRuleVariableDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDomain = null;


        try {
            // InternalKVis.g:565:2: (iv_ruleVariableDomain= ruleVariableDomain EOF )
            // InternalKVis.g:566:2: iv_ruleVariableDomain= ruleVariableDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDomainRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariableDomain=ruleVariableDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDomain; 
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
    // $ANTLR end "entryRuleVariableDomain"


    // $ANTLR start "ruleVariableDomain"
    // InternalKVis.g:573:1: ruleVariableDomain returns [EObject current=null] : ( ( (lv_value_0_0= ruleLiteral ) ) | ( (lv_range_1_0= ruleInterval ) ) ) ;
    public final EObject ruleVariableDomain() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_range_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:576:28: ( ( ( (lv_value_0_0= ruleLiteral ) ) | ( (lv_range_1_0= ruleInterval ) ) ) )
            // InternalKVis.g:577:1: ( ( (lv_value_0_0= ruleLiteral ) ) | ( (lv_range_1_0= ruleInterval ) ) )
            {
            // InternalKVis.g:577:1: ( ( (lv_value_0_0= ruleLiteral ) ) | ( (lv_range_1_0= ruleInterval ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==28) ) {
                    alt9=2;
                }
                else if ( (LA9_1==EOF||LA9_1==RULE_ID||LA9_1==18||(LA9_1>=26 && LA9_1<=27)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==RULE_STRING||LA9_0==RULE_FLOAT) ) {
                alt9=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalKVis.g:577:2: ( (lv_value_0_0= ruleLiteral ) )
                    {
                    // InternalKVis.g:577:2: ( (lv_value_0_0= ruleLiteral ) )
                    // InternalKVis.g:578:1: (lv_value_0_0= ruleLiteral )
                    {
                    // InternalKVis.g:578:1: (lv_value_0_0= ruleLiteral )
                    // InternalKVis.g:579:3: lv_value_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDomainAccess().getValueLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_0_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDomainRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_0_0, 
                              		"de.cau.cs.kieler.KVis.Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:596:6: ( (lv_range_1_0= ruleInterval ) )
                    {
                    // InternalKVis.g:596:6: ( (lv_range_1_0= ruleInterval ) )
                    // InternalKVis.g:597:1: (lv_range_1_0= ruleInterval )
                    {
                    // InternalKVis.g:597:1: (lv_range_1_0= ruleInterval )
                    // InternalKVis.g:598:3: lv_range_1_0= ruleInterval
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDomainAccess().getRangeIntervalParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_range_1_0=ruleInterval();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDomainRule());
                      	        }
                             		set(
                             			current, 
                             			"range",
                              		lv_range_1_0, 
                              		"de.cau.cs.kieler.KVis.Interval");
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
    // $ANTLR end "ruleVariableDomain"


    // $ANTLR start "entryRuleInterval"
    // InternalKVis.g:622:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalKVis.g:623:2: (iv_ruleInterval= ruleInterval EOF )
            // InternalKVis.g:624:2: iv_ruleInterval= ruleInterval EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntervalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInterval=ruleInterval();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterval; 
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
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // InternalKVis.g:631:1: ruleInterval returns [EObject current=null] : ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_INT ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_to_2_0=null;

         enterRule(); 
            
        try {
            // InternalKVis.g:634:28: ( ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_INT ) ) ) )
            // InternalKVis.g:635:1: ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_INT ) ) )
            {
            // InternalKVis.g:635:1: ( ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_INT ) ) )
            // InternalKVis.g:635:2: ( (lv_from_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_INT ) )
            {
            // InternalKVis.g:635:2: ( (lv_from_0_0= RULE_INT ) )
            // InternalKVis.g:636:1: (lv_from_0_0= RULE_INT )
            {
            // InternalKVis.g:636:1: (lv_from_0_0= RULE_INT )
            // InternalKVis.g:637:3: lv_from_0_0= RULE_INT
            {
            lv_from_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_from_0_0, grammarAccess.getIntervalAccess().getFromINTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntervalRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"from",
                      		lv_from_0_0, 
                      		"de.cau.cs.kieler.KVis.INT");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1());
                  
            }
            // InternalKVis.g:657:1: ( (lv_to_2_0= RULE_INT ) )
            // InternalKVis.g:658:1: (lv_to_2_0= RULE_INT )
            {
            // InternalKVis.g:658:1: (lv_to_2_0= RULE_INT )
            // InternalKVis.g:659:3: lv_to_2_0= RULE_INT
            {
            lv_to_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_to_2_0, grammarAccess.getIntervalAccess().getToINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntervalRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"to",
                      		lv_to_2_0, 
                      		"de.cau.cs.kieler.KVis.INT");
              	    
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
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleAttributeDomain"
    // InternalKVis.g:683:1: entryRuleAttributeDomain returns [EObject current=null] : iv_ruleAttributeDomain= ruleAttributeDomain EOF ;
    public final EObject entryRuleAttributeDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDomain = null;


        try {
            // InternalKVis.g:684:2: (iv_ruleAttributeDomain= ruleAttributeDomain EOF )
            // InternalKVis.g:685:2: iv_ruleAttributeDomain= ruleAttributeDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeDomainRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeDomain=ruleAttributeDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeDomain; 
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
    // $ANTLR end "entryRuleAttributeDomain"


    // $ANTLR start "ruleAttributeDomain"
    // InternalKVis.g:692:1: ruleAttributeDomain returns [EObject current=null] : this_VariableDomain_0= ruleVariableDomain ;
    public final EObject ruleAttributeDomain() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDomain_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:695:28: (this_VariableDomain_0= ruleVariableDomain )
            // InternalKVis.g:697:2: this_VariableDomain_0= ruleVariableDomain
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAttributeDomainAccess().getVariableDomainParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_VariableDomain_0=ruleVariableDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_VariableDomain_0; 
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
    // $ANTLR end "ruleAttributeDomain"


    // $ANTLR start "entryRuleCondition"
    // InternalKVis.g:716:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalKVis.g:717:2: (iv_ruleCondition= ruleCondition EOF )
            // InternalKVis.g:718:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalKVis.g:725:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'when' ( (lv_expression_1_0= ruleBooleanExpression ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:728:28: ( (otherlv_0= 'when' ( (lv_expression_1_0= ruleBooleanExpression ) ) ) )
            // InternalKVis.g:729:1: (otherlv_0= 'when' ( (lv_expression_1_0= ruleBooleanExpression ) ) )
            {
            // InternalKVis.g:729:1: (otherlv_0= 'when' ( (lv_expression_1_0= ruleBooleanExpression ) ) )
            // InternalKVis.g:729:3: otherlv_0= 'when' ( (lv_expression_1_0= ruleBooleanExpression ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getWhenKeyword_0());
                  
            }
            // InternalKVis.g:733:1: ( (lv_expression_1_0= ruleBooleanExpression ) )
            // InternalKVis.g:734:1: (lv_expression_1_0= ruleBooleanExpression )
            {
            // InternalKVis.g:734:1: (lv_expression_1_0= ruleBooleanExpression )
            // InternalKVis.g:735:3: lv_expression_1_0= ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionAccess().getExpressionBooleanExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_1_0=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"de.cau.cs.kieler.KVis.BooleanExpression");
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleVariableReference"
    // InternalKVis.g:759:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalKVis.g:760:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalKVis.g:761:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalKVis.g:768:1: ruleVariableReference returns [EObject current=null] : ( ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= RULE_INT ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_indices_3_0=null;
        Token otherlv_4=null;
        EObject lv_model_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:771:28: ( ( ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= RULE_INT ) ) otherlv_4= ']' )* ) )
            // InternalKVis.g:772:1: ( ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= RULE_INT ) ) otherlv_4= ']' )* )
            {
            // InternalKVis.g:772:1: ( ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= RULE_INT ) ) otherlv_4= ']' )* )
            // InternalKVis.g:772:2: ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= RULE_INT ) ) otherlv_4= ']' )*
            {
            // InternalKVis.g:772:2: ( (lv_model_0_0= ruleModelReference ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==32) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalKVis.g:773:1: (lv_model_0_0= ruleModelReference )
                    {
                    // InternalKVis.g:773:1: (lv_model_0_0= ruleModelReference )
                    // InternalKVis.g:774:3: lv_model_0_0= ruleModelReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableReferenceAccess().getModelModelReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_model_0_0=ruleModelReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableReferenceRule());
                      	        }
                             		set(
                             			current, 
                             			"model",
                              		lv_model_0_0, 
                              		"de.cau.cs.kieler.KVis.ModelReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKVis.g:790:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKVis.g:791:1: (lv_name_1_0= RULE_ID )
            {
            // InternalKVis.g:791:1: (lv_name_1_0= RULE_ID )
            // InternalKVis.g:792:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVariableReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalKVis.g:808:2: (otherlv_2= '[' ( (lv_indices_3_0= RULE_INT ) ) otherlv_4= ']' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKVis.g:808:4: otherlv_2= '[' ( (lv_indices_3_0= RULE_INT ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVariableReferenceAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalKVis.g:812:1: ( (lv_indices_3_0= RULE_INT ) )
            	    // InternalKVis.g:813:1: (lv_indices_3_0= RULE_INT )
            	    {
            	    // InternalKVis.g:813:1: (lv_indices_3_0= RULE_INT )
            	    // InternalKVis.g:814:3: lv_indices_3_0= RULE_INT
            	    {
            	    lv_indices_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_indices_3_0, grammarAccess.getVariableReferenceAccess().getIndicesINTTerminalRuleCall_2_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVariableReferenceRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"indices",
            	              		lv_indices_3_0, 
            	              		"de.cau.cs.kieler.KVis.INT");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getVariableReferenceAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleModelReference"
    // InternalKVis.g:842:1: entryRuleModelReference returns [EObject current=null] : iv_ruleModelReference= ruleModelReference EOF ;
    public final EObject entryRuleModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelReference = null;


        try {
            // InternalKVis.g:843:2: (iv_ruleModelReference= ruleModelReference EOF )
            // InternalKVis.g:844:2: iv_ruleModelReference= ruleModelReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModelReference=ruleModelReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelReference; 
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
    // $ANTLR end "entryRuleModelReference"


    // $ANTLR start "ruleModelReference"
    // InternalKVis.g:851:1: ruleModelReference returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ) ;
    public final EObject ruleModelReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalKVis.g:854:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ) )
            // InternalKVis.g:855:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' )
            {
            // InternalKVis.g:855:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' )
            // InternalKVis.g:855:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.'
            {
            // InternalKVis.g:855:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalKVis.g:856:1: (lv_name_0_0= RULE_ID )
            {
            // InternalKVis.g:856:1: (lv_name_0_0= RULE_ID )
            // InternalKVis.g:857:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getModelReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getModelReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelReferenceAccess().getFullStopKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelReference"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalKVis.g:885:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalKVis.g:886:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalKVis.g:887:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalKVis.g:894:1: ruleBooleanExpression returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( () ( (lv_operator_2_0= ruleBooleanOperator ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:897:28: ( (this_Comparison_0= ruleComparison ( ( () ( (lv_operator_2_0= ruleBooleanOperator ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalKVis.g:898:1: (this_Comparison_0= ruleComparison ( ( () ( (lv_operator_2_0= ruleBooleanOperator ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalKVis.g:898:1: (this_Comparison_0= ruleComparison ( ( () ( (lv_operator_2_0= ruleBooleanOperator ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalKVis.g:899:2: this_Comparison_0= ruleComparison ( ( () ( (lv_operator_2_0= ruleBooleanOperator ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBooleanExpressionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_22);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKVis.g:910:1: ( ( () ( (lv_operator_2_0= ruleBooleanOperator ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=39 && LA12_0<=40)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKVis.g:910:2: ( () ( (lv_operator_2_0= ruleBooleanOperator ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalKVis.g:910:2: ( () ( (lv_operator_2_0= ruleBooleanOperator ) ) )
            	    // InternalKVis.g:910:3: () ( (lv_operator_2_0= ruleBooleanOperator ) )
            	    {
            	    // InternalKVis.g:910:3: ()
            	    // InternalKVis.g:911:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalKVis.g:919:2: ( (lv_operator_2_0= ruleBooleanOperator ) )
            	    // InternalKVis.g:920:1: (lv_operator_2_0= ruleBooleanOperator )
            	    {
            	    // InternalKVis.g:920:1: (lv_operator_2_0= ruleBooleanOperator )
            	    // InternalKVis.g:921:3: lv_operator_2_0= ruleBooleanOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBooleanExpressionAccess().getOperatorBooleanOperatorEnumRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_operator_2_0=ruleBooleanOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"de.cau.cs.kieler.KVis.BooleanOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    // InternalKVis.g:937:3: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalKVis.g:938:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalKVis.g:938:1: (lv_right_3_0= ruleComparison )
            	    // InternalKVis.g:939:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBooleanExpressionAccess().getRightComparisonParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"de.cau.cs.kieler.KVis.Comparison");
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleComparison"
    // InternalKVis.g:963:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalKVis.g:964:2: (iv_ruleComparison= ruleComparison EOF )
            // InternalKVis.g:965:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalKVis.g:972:1: ruleComparison returns [EObject current=null] : ( ( (lv_leftSide_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( (lv_rightSide_2_0= ruleOperand ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_leftSide_0_0 = null;

        Enumerator lv_relation_1_0 = null;

        EObject lv_rightSide_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:975:28: ( ( ( (lv_leftSide_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( (lv_rightSide_2_0= ruleOperand ) ) ) )
            // InternalKVis.g:976:1: ( ( (lv_leftSide_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( (lv_rightSide_2_0= ruleOperand ) ) )
            {
            // InternalKVis.g:976:1: ( ( (lv_leftSide_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( (lv_rightSide_2_0= ruleOperand ) ) )
            // InternalKVis.g:976:2: ( (lv_leftSide_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( (lv_rightSide_2_0= ruleOperand ) )
            {
            // InternalKVis.g:976:2: ( (lv_leftSide_0_0= ruleVariableReference ) )
            // InternalKVis.g:977:1: (lv_leftSide_0_0= ruleVariableReference )
            {
            // InternalKVis.g:977:1: (lv_leftSide_0_0= ruleVariableReference )
            // InternalKVis.g:978:3: lv_leftSide_0_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonAccess().getLeftSideVariableReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_leftSide_0_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComparisonRule());
              	        }
                     		set(
                     			current, 
                     			"leftSide",
                      		lv_leftSide_0_0, 
                      		"de.cau.cs.kieler.KVis.VariableReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKVis.g:994:2: ( (lv_relation_1_0= ruleCompareOperator ) )
            // InternalKVis.g:995:1: (lv_relation_1_0= ruleCompareOperator )
            {
            // InternalKVis.g:995:1: (lv_relation_1_0= ruleCompareOperator )
            // InternalKVis.g:996:3: lv_relation_1_0= ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonAccess().getRelationCompareOperatorEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_relation_1_0=ruleCompareOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComparisonRule());
              	        }
                     		set(
                     			current, 
                     			"relation",
                      		lv_relation_1_0, 
                      		"de.cau.cs.kieler.KVis.CompareOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKVis.g:1012:2: ( (lv_rightSide_2_0= ruleOperand ) )
            // InternalKVis.g:1013:1: (lv_rightSide_2_0= ruleOperand )
            {
            // InternalKVis.g:1013:1: (lv_rightSide_2_0= ruleOperand )
            // InternalKVis.g:1014:3: lv_rightSide_2_0= ruleOperand
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonAccess().getRightSideOperandParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_rightSide_2_0=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComparisonRule());
              	        }
                     		set(
                     			current, 
                     			"rightSide",
                      		lv_rightSide_2_0, 
                      		"de.cau.cs.kieler.KVis.Operand");
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleOperand"
    // InternalKVis.g:1038:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalKVis.g:1039:2: (iv_ruleOperand= ruleOperand EOF )
            // InternalKVis.g:1040:2: iv_ruleOperand= ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperand=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperand; 
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
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalKVis.g:1047:1: ruleOperand returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableReference ) ) | ( (lv_literal_1_0= ruleLiteral ) ) ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_0_0 = null;

        AntlrDatatypeRuleToken lv_literal_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:1050:28: ( ( ( (lv_variable_0_0= ruleVariableReference ) ) | ( (lv_literal_1_0= ruleLiteral ) ) ) )
            // InternalKVis.g:1051:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) | ( (lv_literal_1_0= ruleLiteral ) ) )
            {
            // InternalKVis.g:1051:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) | ( (lv_literal_1_0= ruleLiteral ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING||(LA13_0>=RULE_INT && LA13_0<=RULE_FLOAT)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalKVis.g:1051:2: ( (lv_variable_0_0= ruleVariableReference ) )
                    {
                    // InternalKVis.g:1051:2: ( (lv_variable_0_0= ruleVariableReference ) )
                    // InternalKVis.g:1052:1: (lv_variable_0_0= ruleVariableReference )
                    {
                    // InternalKVis.g:1052:1: (lv_variable_0_0= ruleVariableReference )
                    // InternalKVis.g:1053:3: lv_variable_0_0= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperandAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_variable_0_0=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperandRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_0_0, 
                              		"de.cau.cs.kieler.KVis.VariableReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:1070:6: ( (lv_literal_1_0= ruleLiteral ) )
                    {
                    // InternalKVis.g:1070:6: ( (lv_literal_1_0= ruleLiteral ) )
                    // InternalKVis.g:1071:1: (lv_literal_1_0= ruleLiteral )
                    {
                    // InternalKVis.g:1071:1: (lv_literal_1_0= ruleLiteral )
                    // InternalKVis.g:1072:3: lv_literal_1_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperandAccess().getLiteralLiteralParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_literal_1_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperandRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_1_0, 
                              		"de.cau.cs.kieler.KVis.Literal");
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
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleLiteral"
    // InternalKVis.g:1096:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalKVis.g:1097:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalKVis.g:1098:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalKVis.g:1105:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_FLOAT_1=null;
        Token this_STRING_2=null;

         enterRule(); 
            
        try {
            // InternalKVis.g:1108:28: ( (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT | this_STRING_2= RULE_STRING ) )
            // InternalKVis.g:1109:1: (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT | this_STRING_2= RULE_STRING )
            {
            // InternalKVis.g:1109:1: (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT | this_STRING_2= RULE_STRING )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt14=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt14=2;
                }
                break;
            case RULE_STRING:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalKVis.g:1109:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKVis.g:1117:10: this_FLOAT_1= RULE_FLOAT
                    {
                    this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FLOAT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FLOAT_1, grammarAccess.getLiteralAccess().getFLOATTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKVis.g:1125:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_2, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_2()); 
                          
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "ruleCompareOperator"
    // InternalKVis.g:1140:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // InternalKVis.g:1142:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalKVis.g:1143:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalKVis.g:1143:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt15=1;
                }
                break;
            case 34:
                {
                alt15=2;
                }
                break;
            case 35:
                {
                alt15=3;
                }
                break;
            case 36:
                {
                alt15=4;
                }
                break;
            case 37:
                {
                alt15=5;
                }
                break;
            case 38:
                {
                alt15=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalKVis.g:1143:2: (enumLiteral_0= '=' )
                    {
                    // InternalKVis.g:1143:2: (enumLiteral_0= '=' )
                    // InternalKVis.g:1143:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:1149:6: (enumLiteral_1= '<' )
                    {
                    // InternalKVis.g:1149:6: (enumLiteral_1= '<' )
                    // InternalKVis.g:1149:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKVis.g:1155:6: (enumLiteral_2= '<=' )
                    {
                    // InternalKVis.g:1155:6: (enumLiteral_2= '<=' )
                    // InternalKVis.g:1155:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKVis.g:1161:6: (enumLiteral_3= '>' )
                    {
                    // InternalKVis.g:1161:6: (enumLiteral_3= '>' )
                    // InternalKVis.g:1161:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKVis.g:1167:6: (enumLiteral_4= '>=' )
                    {
                    // InternalKVis.g:1167:6: (enumLiteral_4= '>=' )
                    // InternalKVis.g:1167:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKVis.g:1173:6: (enumLiteral_5= '!=' )
                    {
                    // InternalKVis.g:1173:6: (enumLiteral_5= '!=' )
                    // InternalKVis.g:1173:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleBooleanOperator"
    // InternalKVis.g:1183:1: ruleBooleanOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleBooleanOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalKVis.g:1185:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalKVis.g:1186:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalKVis.g:1186:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            else if ( (LA16_0==40) ) {
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
                    // InternalKVis.g:1186:2: (enumLiteral_0= 'and' )
                    {
                    // InternalKVis.g:1186:2: (enumLiteral_0= 'and' )
                    // InternalKVis.g:1186:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBooleanOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:1192:6: (enumLiteral_1= 'or' )
                    {
                    // InternalKVis.g:1192:6: (enumLiteral_1= 'or' )
                    // InternalKVis.g:1192:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBooleanOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleBooleanOperator"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003E00000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040020L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000018000000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007E00000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000000F0L});
    }


}