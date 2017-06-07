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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'image'", "':'", "'animate'", "'{'", "'}'", "'using'", "','", "'is'", "'..'", "'when'", "'['", "']'", "'.'", "'='", "'<'", "'<='", "'>'", "'>='", "'!='", "'set color'", "'set text'", "'rotate'", "'move'", "'set visible'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
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
    // InternalKVis.g:148:1: ruleElement returns [EObject current=null] : (otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimation ) )+ otherlv_4= '}' ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_animations_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:151:28: ( (otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimation ) )+ otherlv_4= '}' ) )
            // InternalKVis.g:152:1: (otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimation ) )+ otherlv_4= '}' )
            {
            // InternalKVis.g:152:1: (otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimation ) )+ otherlv_4= '}' )
            // InternalKVis.g:152:3: otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimation ) )+ otherlv_4= '}'
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
            // InternalKVis.g:178:1: ( (lv_animations_3_0= ruleAnimation ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=33 && LA2_0<=37)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKVis.g:179:1: (lv_animations_3_0= ruleAnimation )
            	    {
            	    // InternalKVis.g:179:1: (lv_animations_3_0= ruleAnimation )
            	    // InternalKVis.g:180:3: lv_animations_3_0= ruleAnimation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementAccess().getAnimationsAnimationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_animations_3_0=ruleAnimation();

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
            	              		"de.cau.cs.kieler.KVis.Animation");
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


    // $ANTLR start "entryRuleAnimation"
    // InternalKVis.g:208:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // InternalKVis.g:209:2: (iv_ruleAnimation= ruleAnimation EOF )
            // InternalKVis.g:210:2: iv_ruleAnimation= ruleAnimation EOF
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
    // InternalKVis.g:217:1: ruleAnimation returns [EObject current=null] : ( ( (lv_type_0_0= ruleAnimationType ) ) (otherlv_1= 'using' ( (lv_variable_2_0= ruleVariableReference ) ) )? otherlv_3= '{' ( (lv_mappings_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ( (lv_condition_6_0= ruleCondition ) )? ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_mappings_4_0 = null;

        EObject lv_condition_6_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:220:28: ( ( ( (lv_type_0_0= ruleAnimationType ) ) (otherlv_1= 'using' ( (lv_variable_2_0= ruleVariableReference ) ) )? otherlv_3= '{' ( (lv_mappings_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ( (lv_condition_6_0= ruleCondition ) )? ) )
            // InternalKVis.g:221:1: ( ( (lv_type_0_0= ruleAnimationType ) ) (otherlv_1= 'using' ( (lv_variable_2_0= ruleVariableReference ) ) )? otherlv_3= '{' ( (lv_mappings_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ( (lv_condition_6_0= ruleCondition ) )? )
            {
            // InternalKVis.g:221:1: ( ( (lv_type_0_0= ruleAnimationType ) ) (otherlv_1= 'using' ( (lv_variable_2_0= ruleVariableReference ) ) )? otherlv_3= '{' ( (lv_mappings_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ( (lv_condition_6_0= ruleCondition ) )? )
            // InternalKVis.g:221:2: ( (lv_type_0_0= ruleAnimationType ) ) (otherlv_1= 'using' ( (lv_variable_2_0= ruleVariableReference ) ) )? otherlv_3= '{' ( (lv_mappings_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ( (lv_condition_6_0= ruleCondition ) )?
            {
            // InternalKVis.g:221:2: ( (lv_type_0_0= ruleAnimationType ) )
            // InternalKVis.g:222:1: (lv_type_0_0= ruleAnimationType )
            {
            // InternalKVis.g:222:1: (lv_type_0_0= ruleAnimationType )
            // InternalKVis.g:223:3: lv_type_0_0= ruleAnimationType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnimationAccess().getTypeAnimationTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_type_0_0=ruleAnimationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnimationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"de.cau.cs.kieler.KVis.AnimationType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKVis.g:239:2: (otherlv_1= 'using' ( (lv_variable_2_0= ruleVariableReference ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKVis.g:239:4: otherlv_1= 'using' ( (lv_variable_2_0= ruleVariableReference ) )
                    {
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAnimationAccess().getUsingKeyword_1_0());
                          
                    }
                    // InternalKVis.g:243:1: ( (lv_variable_2_0= ruleVariableReference ) )
                    // InternalKVis.g:244:1: (lv_variable_2_0= ruleVariableReference )
                    {
                    // InternalKVis.g:244:1: (lv_variable_2_0= ruleVariableReference )
                    // InternalKVis.g:245:3: lv_variable_2_0= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnimationAccess().getVariableVariableReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_variable_2_0=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnimationRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_2_0, 
                              		"de.cau.cs.kieler.KVis.VariableReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalKVis.g:265:1: ( (lv_mappings_4_0= ruleAttributeMapping ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKVis.g:266:1: (lv_mappings_4_0= ruleAttributeMapping )
            	    {
            	    // InternalKVis.g:266:1: (lv_mappings_4_0= ruleAttributeMapping )
            	    // InternalKVis.g:267:3: lv_mappings_4_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnimationAccess().getMappingsAttributeMappingParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    lv_mappings_4_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnimationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappings",
            	              		lv_mappings_4_0, 
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

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_4());
                  
            }
            // InternalKVis.g:287:1: ( (lv_condition_6_0= ruleCondition ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKVis.g:288:1: (lv_condition_6_0= ruleCondition )
                    {
                    // InternalKVis.g:288:1: (lv_condition_6_0= ruleCondition )
                    // InternalKVis.g:289:3: lv_condition_6_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnimationAccess().getConditionConditionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_condition_6_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnimationRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_6_0, 
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
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleAttributeMapping"
    // InternalKVis.g:313:1: entryRuleAttributeMapping returns [EObject current=null] : iv_ruleAttributeMapping= ruleAttributeMapping EOF ;
    public final EObject entryRuleAttributeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeMapping = null;


        try {
            // InternalKVis.g:314:2: (iv_ruleAttributeMapping= ruleAttributeMapping EOF )
            // InternalKVis.g:315:2: iv_ruleAttributeMapping= ruleAttributeMapping EOF
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
    // InternalKVis.g:322:1: ruleAttributeMapping returns [EObject current=null] : ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_literal_2_0= ruleLiteral ) ) | ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* ) ) ) ;
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
            // InternalKVis.g:325:28: ( ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_literal_2_0= ruleLiteral ) ) | ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* ) ) ) )
            // InternalKVis.g:326:1: ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_literal_2_0= ruleLiteral ) ) | ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* ) ) )
            {
            // InternalKVis.g:326:1: ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_literal_2_0= ruleLiteral ) ) | ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* ) ) )
            // InternalKVis.g:326:2: ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_literal_2_0= ruleLiteral ) ) | ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* ) )
            {
            // InternalKVis.g:326:2: ( (lv_attribute_0_0= RULE_ID ) )
            // InternalKVis.g:327:1: (lv_attribute_0_0= RULE_ID )
            {
            // InternalKVis.g:327:1: (lv_attribute_0_0= RULE_ID )
            // InternalKVis.g:328:3: lv_attribute_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeMappingAccess().getColonKeyword_1());
                  
            }
            // InternalKVis.g:348:1: ( ( (lv_literal_2_0= ruleLiteral ) ) | ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* ) )
            int alt7=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>=21 && LA7_1<=22)) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||LA7_1==RULE_ID||LA7_1==18) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA7_2 = input.LA(2);

                if ( ((LA7_2>=21 && LA7_2<=22)) ) {
                    alt7=2;
                }
                else if ( (LA7_2==EOF||LA7_2==RULE_ID||LA7_2==18) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA7_3 = input.LA(2);

                if ( ((LA7_3>=21 && LA7_3<=22)) ) {
                    alt7=2;
                }
                else if ( (LA7_3==EOF||LA7_3==RULE_ID||LA7_3==18) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalKVis.g:348:2: ( (lv_literal_2_0= ruleLiteral ) )
                    {
                    // InternalKVis.g:348:2: ( (lv_literal_2_0= ruleLiteral ) )
                    // InternalKVis.g:349:1: (lv_literal_2_0= ruleLiteral )
                    {
                    // InternalKVis.g:349:1: (lv_literal_2_0= ruleLiteral )
                    // InternalKVis.g:350:3: lv_literal_2_0= ruleLiteral
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
                    // InternalKVis.g:367:6: ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* )
                    {
                    // InternalKVis.g:367:6: ( ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )* )
                    // InternalKVis.g:367:7: ( (lv_mappings_3_0= ruleMapping ) ) (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )*
                    {
                    // InternalKVis.g:367:7: ( (lv_mappings_3_0= ruleMapping ) )
                    // InternalKVis.g:368:1: (lv_mappings_3_0= ruleMapping )
                    {
                    // InternalKVis.g:368:1: (lv_mappings_3_0= ruleMapping )
                    // InternalKVis.g:369:3: lv_mappings_3_0= ruleMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getMappingsMappingParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
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

                    // InternalKVis.g:385:2: (otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKVis.g:385:4: otherlv_4= ',' ( (lv_mappings_5_0= ruleMapping ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAttributeMappingAccess().getCommaKeyword_2_1_1_0());
                    	          
                    	    }
                    	    // InternalKVis.g:389:1: ( (lv_mappings_5_0= ruleMapping ) )
                    	    // InternalKVis.g:390:1: (lv_mappings_5_0= ruleMapping )
                    	    {
                    	    // InternalKVis.g:390:1: (lv_mappings_5_0= ruleMapping )
                    	    // InternalKVis.g:391:3: lv_mappings_5_0= ruleMapping
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getMappingsMappingParserRuleCall_2_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_14);
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
                    	    break loop6;
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
    // InternalKVis.g:415:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalKVis.g:416:2: (iv_ruleMapping= ruleMapping EOF )
            // InternalKVis.g:417:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalKVis.g:424:1: ruleMapping returns [EObject current=null] : ( ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) ) ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variableDomain_0_0 = null;

        EObject lv_attributeDomain_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:427:28: ( ( ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) ) ) )
            // InternalKVis.g:428:1: ( ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) ) )
            {
            // InternalKVis.g:428:1: ( ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) ) )
            // InternalKVis.g:428:2: ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) )
            {
            // InternalKVis.g:428:2: ( (lv_variableDomain_0_0= ruleVariableDomain ) )
            // InternalKVis.g:429:1: (lv_variableDomain_0_0= ruleVariableDomain )
            {
            // InternalKVis.g:429:1: (lv_variableDomain_0_0= ruleVariableDomain )
            // InternalKVis.g:430:3: lv_variableDomain_0_0= ruleVariableDomain
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingAccess().getVariableDomainVariableDomainParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_15);
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

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getIsKeyword_1());
                  
            }
            // InternalKVis.g:450:1: ( (lv_attributeDomain_2_0= ruleAttributeDomain ) )
            // InternalKVis.g:451:1: (lv_attributeDomain_2_0= ruleAttributeDomain )
            {
            // InternalKVis.g:451:1: (lv_attributeDomain_2_0= ruleAttributeDomain )
            // InternalKVis.g:452:3: lv_attributeDomain_2_0= ruleAttributeDomain
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
    // InternalKVis.g:476:1: entryRuleVariableDomain returns [EObject current=null] : iv_ruleVariableDomain= ruleVariableDomain EOF ;
    public final EObject entryRuleVariableDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDomain = null;


        try {
            // InternalKVis.g:477:2: (iv_ruleVariableDomain= ruleVariableDomain EOF )
            // InternalKVis.g:478:2: iv_ruleVariableDomain= ruleVariableDomain EOF
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
    // InternalKVis.g:485:1: ruleVariableDomain returns [EObject current=null] : ( ( (lv_value_0_0= ruleLiteral ) ) | ( (lv_range_1_0= ruleInterval ) ) ) ;
    public final EObject ruleVariableDomain() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_range_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:488:28: ( ( ( (lv_value_0_0= ruleLiteral ) ) | ( (lv_range_1_0= ruleInterval ) ) ) )
            // InternalKVis.g:489:1: ( ( (lv_value_0_0= ruleLiteral ) ) | ( (lv_range_1_0= ruleInterval ) ) )
            {
            // InternalKVis.g:489:1: ( ( (lv_value_0_0= ruleLiteral ) ) | ( (lv_range_1_0= ruleInterval ) ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==RULE_ID||LA8_1==18||(LA8_1>=20 && LA8_1<=21)) ) {
                    alt8=1;
                }
                else if ( (LA8_1==22) ) {
                    alt8=2;
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

                if ( (LA8_2==22) ) {
                    alt8=2;
                }
                else if ( (LA8_2==EOF||LA8_2==RULE_ID||LA8_2==18||(LA8_2>=20 && LA8_2<=21)) ) {
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

                if ( (LA8_3==22) ) {
                    alt8=2;
                }
                else if ( (LA8_3==EOF||LA8_3==RULE_ID||LA8_3==18||(LA8_3>=20 && LA8_3<=21)) ) {
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
                    // InternalKVis.g:489:2: ( (lv_value_0_0= ruleLiteral ) )
                    {
                    // InternalKVis.g:489:2: ( (lv_value_0_0= ruleLiteral ) )
                    // InternalKVis.g:490:1: (lv_value_0_0= ruleLiteral )
                    {
                    // InternalKVis.g:490:1: (lv_value_0_0= ruleLiteral )
                    // InternalKVis.g:491:3: lv_value_0_0= ruleLiteral
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
                    // InternalKVis.g:508:6: ( (lv_range_1_0= ruleInterval ) )
                    {
                    // InternalKVis.g:508:6: ( (lv_range_1_0= ruleInterval ) )
                    // InternalKVis.g:509:1: (lv_range_1_0= ruleInterval )
                    {
                    // InternalKVis.g:509:1: (lv_range_1_0= ruleInterval )
                    // InternalKVis.g:510:3: lv_range_1_0= ruleInterval
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
    // InternalKVis.g:534:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalKVis.g:535:2: (iv_ruleInterval= ruleInterval EOF )
            // InternalKVis.g:536:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalKVis.g:543:1: ruleInterval returns [EObject current=null] : ( ( (lv_from_0_0= ruleLiteral ) ) otherlv_1= '..' ( (lv_to_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_from_0_0 = null;

        AntlrDatatypeRuleToken lv_to_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:546:28: ( ( ( (lv_from_0_0= ruleLiteral ) ) otherlv_1= '..' ( (lv_to_2_0= ruleLiteral ) ) ) )
            // InternalKVis.g:547:1: ( ( (lv_from_0_0= ruleLiteral ) ) otherlv_1= '..' ( (lv_to_2_0= ruleLiteral ) ) )
            {
            // InternalKVis.g:547:1: ( ( (lv_from_0_0= ruleLiteral ) ) otherlv_1= '..' ( (lv_to_2_0= ruleLiteral ) ) )
            // InternalKVis.g:547:2: ( (lv_from_0_0= ruleLiteral ) ) otherlv_1= '..' ( (lv_to_2_0= ruleLiteral ) )
            {
            // InternalKVis.g:547:2: ( (lv_from_0_0= ruleLiteral ) )
            // InternalKVis.g:548:1: (lv_from_0_0= ruleLiteral )
            {
            // InternalKVis.g:548:1: (lv_from_0_0= ruleLiteral )
            // InternalKVis.g:549:3: lv_from_0_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntervalAccess().getFromLiteralParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_from_0_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntervalRule());
              	        }
                     		set(
                     			current, 
                     			"from",
                      		lv_from_0_0, 
                      		"de.cau.cs.kieler.KVis.Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1());
                  
            }
            // InternalKVis.g:569:1: ( (lv_to_2_0= ruleLiteral ) )
            // InternalKVis.g:570:1: (lv_to_2_0= ruleLiteral )
            {
            // InternalKVis.g:570:1: (lv_to_2_0= ruleLiteral )
            // InternalKVis.g:571:3: lv_to_2_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntervalAccess().getToLiteralParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_to_2_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntervalRule());
              	        }
                     		set(
                     			current, 
                     			"to",
                      		lv_to_2_0, 
                      		"de.cau.cs.kieler.KVis.Literal");
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
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleAttributeDomain"
    // InternalKVis.g:595:1: entryRuleAttributeDomain returns [EObject current=null] : iv_ruleAttributeDomain= ruleAttributeDomain EOF ;
    public final EObject entryRuleAttributeDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDomain = null;


        try {
            // InternalKVis.g:596:2: (iv_ruleAttributeDomain= ruleAttributeDomain EOF )
            // InternalKVis.g:597:2: iv_ruleAttributeDomain= ruleAttributeDomain EOF
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
    // InternalKVis.g:604:1: ruleAttributeDomain returns [EObject current=null] : this_VariableDomain_0= ruleVariableDomain ;
    public final EObject ruleAttributeDomain() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDomain_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:607:28: (this_VariableDomain_0= ruleVariableDomain )
            // InternalKVis.g:609:2: this_VariableDomain_0= ruleVariableDomain
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
    // InternalKVis.g:628:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalKVis.g:629:2: (iv_ruleCondition= ruleCondition EOF )
            // InternalKVis.g:630:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalKVis.g:637:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'when' ( (lv_expression_1_0= ruleBooleanExpression ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:640:28: ( (otherlv_0= 'when' ( (lv_expression_1_0= ruleBooleanExpression ) ) ) )
            // InternalKVis.g:641:1: (otherlv_0= 'when' ( (lv_expression_1_0= ruleBooleanExpression ) ) )
            {
            // InternalKVis.g:641:1: (otherlv_0= 'when' ( (lv_expression_1_0= ruleBooleanExpression ) ) )
            // InternalKVis.g:641:3: otherlv_0= 'when' ( (lv_expression_1_0= ruleBooleanExpression ) )
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getWhenKeyword_0());
                  
            }
            // InternalKVis.g:645:1: ( (lv_expression_1_0= ruleBooleanExpression ) )
            // InternalKVis.g:646:1: (lv_expression_1_0= ruleBooleanExpression )
            {
            // InternalKVis.g:646:1: (lv_expression_1_0= ruleBooleanExpression )
            // InternalKVis.g:647:3: lv_expression_1_0= ruleBooleanExpression
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
    // InternalKVis.g:671:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalKVis.g:672:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalKVis.g:673:2: iv_ruleVariableReference= ruleVariableReference EOF
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
    // InternalKVis.g:680:1: ruleVariableReference returns [EObject current=null] : ( ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= RULE_INT ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_indices_3_0=null;
        Token otherlv_4=null;
        EObject lv_model_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:683:28: ( ( ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= RULE_INT ) ) otherlv_4= ']' )* ) )
            // InternalKVis.g:684:1: ( ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= RULE_INT ) ) otherlv_4= ']' )* )
            {
            // InternalKVis.g:684:1: ( ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= RULE_INT ) ) otherlv_4= ']' )* )
            // InternalKVis.g:684:2: ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= RULE_INT ) ) otherlv_4= ']' )*
            {
            // InternalKVis.g:684:2: ( (lv_model_0_0= ruleModelReference ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==26) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalKVis.g:685:1: (lv_model_0_0= ruleModelReference )
                    {
                    // InternalKVis.g:685:1: (lv_model_0_0= ruleModelReference )
                    // InternalKVis.g:686:3: lv_model_0_0= ruleModelReference
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

            // InternalKVis.g:702:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKVis.g:703:1: (lv_name_1_0= RULE_ID )
            {
            // InternalKVis.g:703:1: (lv_name_1_0= RULE_ID )
            // InternalKVis.g:704:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

            // InternalKVis.g:720:2: (otherlv_2= '[' ( (lv_indices_3_0= RULE_INT ) ) otherlv_4= ']' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKVis.g:720:4: otherlv_2= '[' ( (lv_indices_3_0= RULE_INT ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVariableReferenceAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalKVis.g:724:1: ( (lv_indices_3_0= RULE_INT ) )
            	    // InternalKVis.g:725:1: (lv_indices_3_0= RULE_INT )
            	    {
            	    // InternalKVis.g:725:1: (lv_indices_3_0= RULE_INT )
            	    // InternalKVis.g:726:3: lv_indices_3_0= RULE_INT
            	    {
            	    lv_indices_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_19); if (state.failed) return current;
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

            	    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getVariableReferenceAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalKVis.g:754:1: entryRuleModelReference returns [EObject current=null] : iv_ruleModelReference= ruleModelReference EOF ;
    public final EObject entryRuleModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelReference = null;


        try {
            // InternalKVis.g:755:2: (iv_ruleModelReference= ruleModelReference EOF )
            // InternalKVis.g:756:2: iv_ruleModelReference= ruleModelReference EOF
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
    // InternalKVis.g:763:1: ruleModelReference returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ) ;
    public final EObject ruleModelReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalKVis.g:766:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ) )
            // InternalKVis.g:767:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' )
            {
            // InternalKVis.g:767:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' )
            // InternalKVis.g:767:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.'
            {
            // InternalKVis.g:767:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalKVis.g:768:1: (lv_name_0_0= RULE_ID )
            {
            // InternalKVis.g:768:1: (lv_name_0_0= RULE_ID )
            // InternalKVis.g:769:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKVis.g:797:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalKVis.g:798:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalKVis.g:799:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
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
    // InternalKVis.g:806:1: ruleBooleanExpression returns [EObject current=null] : this_Comparison_0= ruleComparison ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:809:28: (this_Comparison_0= ruleComparison )
            // InternalKVis.g:811:2: this_Comparison_0= ruleComparison
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBooleanExpressionAccess().getComparisonParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleComparison"
    // InternalKVis.g:830:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalKVis.g:831:2: (iv_ruleComparison= ruleComparison EOF )
            // InternalKVis.g:832:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalKVis.g:839:1: ruleComparison returns [EObject current=null] : ( ( (lv_leftSide_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( (lv_rightSide_2_0= ruleOperand ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_leftSide_0_0 = null;

        Enumerator lv_relation_1_0 = null;

        EObject lv_rightSide_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:842:28: ( ( ( (lv_leftSide_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( (lv_rightSide_2_0= ruleOperand ) ) ) )
            // InternalKVis.g:843:1: ( ( (lv_leftSide_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( (lv_rightSide_2_0= ruleOperand ) ) )
            {
            // InternalKVis.g:843:1: ( ( (lv_leftSide_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( (lv_rightSide_2_0= ruleOperand ) ) )
            // InternalKVis.g:843:2: ( (lv_leftSide_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( (lv_rightSide_2_0= ruleOperand ) )
            {
            // InternalKVis.g:843:2: ( (lv_leftSide_0_0= ruleVariableReference ) )
            // InternalKVis.g:844:1: (lv_leftSide_0_0= ruleVariableReference )
            {
            // InternalKVis.g:844:1: (lv_leftSide_0_0= ruleVariableReference )
            // InternalKVis.g:845:3: lv_leftSide_0_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonAccess().getLeftSideVariableReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_21);
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

            // InternalKVis.g:861:2: ( (lv_relation_1_0= ruleCompareOperator ) )
            // InternalKVis.g:862:1: (lv_relation_1_0= ruleCompareOperator )
            {
            // InternalKVis.g:862:1: (lv_relation_1_0= ruleCompareOperator )
            // InternalKVis.g:863:3: lv_relation_1_0= ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonAccess().getRelationCompareOperatorEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_22);
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

            // InternalKVis.g:879:2: ( (lv_rightSide_2_0= ruleOperand ) )
            // InternalKVis.g:880:1: (lv_rightSide_2_0= ruleOperand )
            {
            // InternalKVis.g:880:1: (lv_rightSide_2_0= ruleOperand )
            // InternalKVis.g:881:3: lv_rightSide_2_0= ruleOperand
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
    // InternalKVis.g:905:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalKVis.g:906:2: (iv_ruleOperand= ruleOperand EOF )
            // InternalKVis.g:907:2: iv_ruleOperand= ruleOperand EOF
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
    // InternalKVis.g:914:1: ruleOperand returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableReference ) ) | ( (lv_literal_1_0= ruleLiteral ) ) ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_0_0 = null;

        AntlrDatatypeRuleToken lv_literal_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKVis.g:917:28: ( ( ( (lv_variable_0_0= ruleVariableReference ) ) | ( (lv_literal_1_0= ruleLiteral ) ) ) )
            // InternalKVis.g:918:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) | ( (lv_literal_1_0= ruleLiteral ) ) )
            {
            // InternalKVis.g:918:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) | ( (lv_literal_1_0= ruleLiteral ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING||(LA11_0>=RULE_INT && LA11_0<=RULE_FLOAT)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalKVis.g:918:2: ( (lv_variable_0_0= ruleVariableReference ) )
                    {
                    // InternalKVis.g:918:2: ( (lv_variable_0_0= ruleVariableReference ) )
                    // InternalKVis.g:919:1: (lv_variable_0_0= ruleVariableReference )
                    {
                    // InternalKVis.g:919:1: (lv_variable_0_0= ruleVariableReference )
                    // InternalKVis.g:920:3: lv_variable_0_0= ruleVariableReference
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
                    // InternalKVis.g:937:6: ( (lv_literal_1_0= ruleLiteral ) )
                    {
                    // InternalKVis.g:937:6: ( (lv_literal_1_0= ruleLiteral ) )
                    // InternalKVis.g:938:1: (lv_literal_1_0= ruleLiteral )
                    {
                    // InternalKVis.g:938:1: (lv_literal_1_0= ruleLiteral )
                    // InternalKVis.g:939:3: lv_literal_1_0= ruleLiteral
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
    // InternalKVis.g:963:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalKVis.g:964:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalKVis.g:965:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalKVis.g:972:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_FLOAT_1=null;
        Token this_STRING_2=null;

         enterRule(); 
            
        try {
            // InternalKVis.g:975:28: ( (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT | this_STRING_2= RULE_STRING ) )
            // InternalKVis.g:976:1: (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT | this_STRING_2= RULE_STRING )
            {
            // InternalKVis.g:976:1: (this_INT_0= RULE_INT | this_FLOAT_1= RULE_FLOAT | this_STRING_2= RULE_STRING )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt12=2;
                }
                break;
            case RULE_STRING:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalKVis.g:976:6: this_INT_0= RULE_INT
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
                    // InternalKVis.g:984:10: this_FLOAT_1= RULE_FLOAT
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
                    // InternalKVis.g:992:10: this_STRING_2= RULE_STRING
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
    // InternalKVis.g:1007:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // InternalKVis.g:1009:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalKVis.g:1010:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalKVis.g:1010:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 29:
                {
                alt13=3;
                }
                break;
            case 30:
                {
                alt13=4;
                }
                break;
            case 31:
                {
                alt13=5;
                }
                break;
            case 32:
                {
                alt13=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalKVis.g:1010:2: (enumLiteral_0= '=' )
                    {
                    // InternalKVis.g:1010:2: (enumLiteral_0= '=' )
                    // InternalKVis.g:1010:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:1016:6: (enumLiteral_1= '<' )
                    {
                    // InternalKVis.g:1016:6: (enumLiteral_1= '<' )
                    // InternalKVis.g:1016:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKVis.g:1022:6: (enumLiteral_2= '<=' )
                    {
                    // InternalKVis.g:1022:6: (enumLiteral_2= '<=' )
                    // InternalKVis.g:1022:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKVis.g:1028:6: (enumLiteral_3= '>' )
                    {
                    // InternalKVis.g:1028:6: (enumLiteral_3= '>' )
                    // InternalKVis.g:1028:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKVis.g:1034:6: (enumLiteral_4= '>=' )
                    {
                    // InternalKVis.g:1034:6: (enumLiteral_4= '>=' )
                    // InternalKVis.g:1034:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKVis.g:1040:6: (enumLiteral_5= '!=' )
                    {
                    // InternalKVis.g:1040:6: (enumLiteral_5= '!=' )
                    // InternalKVis.g:1040:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleAnimationType"
    // InternalKVis.g:1050:1: ruleAnimationType returns [Enumerator current=null] : ( (enumLiteral_0= 'set color' ) | (enumLiteral_1= 'set text' ) | (enumLiteral_2= 'rotate' ) | (enumLiteral_3= 'move' ) | (enumLiteral_4= 'set visible' ) ) ;
    public final Enumerator ruleAnimationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalKVis.g:1052:28: ( ( (enumLiteral_0= 'set color' ) | (enumLiteral_1= 'set text' ) | (enumLiteral_2= 'rotate' ) | (enumLiteral_3= 'move' ) | (enumLiteral_4= 'set visible' ) ) )
            // InternalKVis.g:1053:1: ( (enumLiteral_0= 'set color' ) | (enumLiteral_1= 'set text' ) | (enumLiteral_2= 'rotate' ) | (enumLiteral_3= 'move' ) | (enumLiteral_4= 'set visible' ) )
            {
            // InternalKVis.g:1053:1: ( (enumLiteral_0= 'set color' ) | (enumLiteral_1= 'set text' ) | (enumLiteral_2= 'rotate' ) | (enumLiteral_3= 'move' ) | (enumLiteral_4= 'set visible' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 35:
                {
                alt14=3;
                }
                break;
            case 36:
                {
                alt14=4;
                }
                break;
            case 37:
                {
                alt14=5;
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
                    // InternalKVis.g:1053:2: (enumLiteral_0= 'set color' )
                    {
                    // InternalKVis.g:1053:2: (enumLiteral_0= 'set color' )
                    // InternalKVis.g:1053:4: enumLiteral_0= 'set color'
                    {
                    enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAnimationTypeAccess().getCOLOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAnimationTypeAccess().getCOLOREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:1059:6: (enumLiteral_1= 'set text' )
                    {
                    // InternalKVis.g:1059:6: (enumLiteral_1= 'set text' )
                    // InternalKVis.g:1059:8: enumLiteral_1= 'set text'
                    {
                    enumLiteral_1=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAnimationTypeAccess().getTEXTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAnimationTypeAccess().getTEXTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKVis.g:1065:6: (enumLiteral_2= 'rotate' )
                    {
                    // InternalKVis.g:1065:6: (enumLiteral_2= 'rotate' )
                    // InternalKVis.g:1065:8: enumLiteral_2= 'rotate'
                    {
                    enumLiteral_2=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAnimationTypeAccess().getROTATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAnimationTypeAccess().getROTATEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKVis.g:1071:6: (enumLiteral_3= 'move' )
                    {
                    // InternalKVis.g:1071:6: (enumLiteral_3= 'move' )
                    // InternalKVis.g:1071:8: enumLiteral_3= 'move'
                    {
                    enumLiteral_3=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAnimationTypeAccess().getMOVEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAnimationTypeAccess().getMOVEEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKVis.g:1077:6: (enumLiteral_4= 'set visible' )
                    {
                    // InternalKVis.g:1077:6: (enumLiteral_4= 'set visible' )
                    // InternalKVis.g:1077:8: enumLiteral_4= 'set visible'
                    {
                    enumLiteral_4=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAnimationTypeAccess().getVISIBILITYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAnimationTypeAccess().getVISIBILITYEnumLiteralDeclaration_4()); 
                          
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
    // $ANTLR end "ruleAnimationType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000003E00000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000003E00040000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040020L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001F8000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000000F0L});
    }


}